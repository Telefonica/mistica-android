package com.telefonica.mistica.sheet.children.list

import com.telefonica.mistica.list.ListRowView

internal fun ListRowView.setAsset(asset: AssetViewData?) {
    when (asset) {
        is AssetViewData.Image -> {
            this.setAssetType(ListRowView.TYPE_IMAGE)
            this.setAssetDrawable(asset.drawableRes)
        }
        is AssetViewData.LargeIcon -> {
            this.setAssetType(ListRowView.TYPE_LARGE_ICON)
            this.setAssetResource(asset.id)
        }
        is AssetViewData.SmallIcon -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.setAssetResource(asset.id)
        }
        is AssetViewData.SmallImage -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.setAssetDrawable(asset.drawableRes)
        }
        null -> {}
    }
}