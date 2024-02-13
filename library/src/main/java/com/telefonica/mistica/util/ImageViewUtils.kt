package com.telefonica.mistica.util

import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.telefonica.mistica.sheet.children.list.RowAssetViewData

fun ImageView.loadRowAsset(rowAsset: RowAssetViewData) {
    when (rowAsset) {
        is RowAssetViewData.DrawableAsset -> this.setImageDrawable(rowAsset.drawableRes)
        is RowAssetViewData.DrawableIdAsset -> this.setImageDrawable(AppCompatResources.getDrawable(this.context, rowAsset.id))
        is RowAssetViewData.UrlAsset -> this.loadUrl(rowAsset.url)
    }
}

fun ImageView.loadUrl(
    url: String,
    builder: ImageRequest.Builder.() -> Unit = {},
) {
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
            add(Base64DataUrlFetcher.Factory(context.resources))
        }
        .build()

    val request = ImageRequest.Builder(context)
        .data(url)
        .target(this)
        .apply(builder)
        .build()

    imageLoader.enqueue(request)
}
