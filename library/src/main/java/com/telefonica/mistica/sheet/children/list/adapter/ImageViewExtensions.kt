package com.telefonica.mistica.sheet.children.list.adapter

import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import coil.load
import com.telefonica.mistica.sheet.children.list.RowAssetViewData

fun ImageView.loadRowAsset(rowAsset: RowAssetViewData) {
    when (rowAsset) {
        is RowAssetViewData.DrawableAsset -> this.setImageDrawable(rowAsset.drawableRes)
        is RowAssetViewData.DrawableIdAsset -> this.setImageDrawable(AppCompatResources.getDrawable(this.context, rowAsset.id))
        is RowAssetViewData.UrlAsset -> this.load(rowAsset.url)
    }
}
