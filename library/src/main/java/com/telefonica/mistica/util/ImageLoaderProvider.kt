package com.telefonica.mistica.util

import android.content.Context
import coil.ImageLoader
import coil.decode.SvgDecoder

object ImageLoaderProvider {

    private var imageLoader: ImageLoader? = null

    fun get(context: Context): ImageLoader {
        if (imageLoader == null) {
            imageLoader = ImageLoader.Builder(context)
                .components {
                    add(SvgDecoder.Factory())
                    add(Base64DataUrlFetcher.Factory(context.resources))
                }
                .build()
        }

        return imageLoader!!
    }
}
