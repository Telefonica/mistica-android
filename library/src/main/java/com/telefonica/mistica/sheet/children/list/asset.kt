package com.telefonica.mistica.sheet.children.list

import com.telefonica.mistica.list.ListRowView

internal fun ListRowView.setAsset(asset: SelectableListAssetViewData?) {
    when (asset) {
        is SelectableListAssetViewData.Image -> {
            this.setAssetType(ListRowView.TYPE_IMAGE)
            this.setAssetDrawable(asset.drawableRes)
        }
        is SelectableListAssetViewData.LargeIcon -> {
            this.setAssetType(ListRowView.TYPE_LARGE_ICON)
            this.setAssetResource(asset.id)
        }
        is SelectableListAssetViewData.SmallIcon -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.setAssetResource(asset.id)
        }
        is SelectableListAssetViewData.SmallImage -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.setAssetDrawable(asset.drawableRes)
        }
        null -> {}
    }
}