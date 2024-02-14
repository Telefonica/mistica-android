package com.telefonica.mistica.util

import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import coil.request.ImageRequest
import com.telefonica.mistica.sheet.children.list.RowAssetViewData

internal fun ImageView.loadRowAsset(rowAsset: RowAssetViewData) {
    when (rowAsset) {
        is RowAssetViewData.DrawableAsset -> this.setImageDrawable(rowAsset.drawableRes)
        is RowAssetViewData.DrawableIdAsset -> this.setImageDrawable(AppCompatResources.getDrawable(this.context, rowAsset.id))
        is RowAssetViewData.UrlAsset -> this.loadUrl(rowAsset.url)
    }
}

internal fun ImageView.loadUrl(
    url: String,
    builder: ImageRequest.Builder.() -> Unit = {},
) {

    val request = ImageRequest.Builder(context)
        .data(url)
        .target(this)
        .apply(builder)
        .build()

    ImageLoaderProvider.get(context.applicationContext).enqueue(request)
}
