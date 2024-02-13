package com.telefonica.mistica.util

import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.util.Base64
import android.util.Log
import coil.ImageLoader
import coil.decode.DataSource
import coil.fetch.DrawableResult
import coil.fetch.FetchResult
import coil.fetch.Fetcher
import coil.request.Options

/**
 * Coil Fetcher implementation for Data Urls encoded in Base64.
 * Format: data:mime/type;param1=value1;paramN=valueN;base64,actual_data
 * In the original spec, everything is optional except "data:" and ",actual_data".
 * But in this particular implementation, ";base64" appearance is also mandatory.
 * The appearance of ";base64" means that the data is encoded as base64,
 * otherwise the data would be represented using ASCII encoding.
 * Link to Spec: https://datatracker.ietf.org/doc/html/rfc2397
 */
class Base64DataUrlFetcher(
    private val base64Data: String,
    private val resources: Resources,
) : Fetcher {
    @Suppress("SwallowedException")
    override suspend fun fetch(): FetchResult? =
        try {
            val bytes = Base64.decode(base64Data, Base64.DEFAULT)
            val bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            val drawable = BitmapDrawable(resources, bitmap)

            DrawableResult(
                drawable = drawable,
                isSampled = false,
                dataSource = DataSource.MEMORY
            )
        } catch (e: IllegalArgumentException) {
            Log.i("Base64Fetcher", "Image data uri ${base64Data.take(30)}... could not be parsed")
            null
        }

    class Factory(
        private val resources: Resources,
    ) : Fetcher.Factory<Uri> {
        override fun create(data: Uri, options: Options, imageLoader: ImageLoader): Fetcher? {
            val url = data.toString()
            val dataPrefix = url.substringBefore(ENCODED_DATA_DELIMITER)

            return if (dataPrefix.isDataUrl() && dataPrefix.isBase64()) {
                val base64Data = url.substringAfter(ENCODED_DATA_DELIMITER)
                Base64DataUrlFetcher(base64Data, resources)
            } else {
                null
            }
        }

        private fun String.isDataUrl(): Boolean =
            startsWith("data:")

        private fun String.isBase64(): Boolean =
            endsWith(";base64")

        private companion object {
            const val ENCODED_DATA_DELIMITER = ','
        }
    }
}
