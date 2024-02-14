package com.telefonica.mistica.sheet.children.list

import com.telefonica.mistica.list.ListRowView

internal fun ListRowView.setAsset(asset: SelectableListAssetViewData?) {
    when (asset) {
        is SelectableListAssetViewData.Image -> {
            this.setAssetType(ListRowView.TYPE_IMAGE)
            this.loadRowAsset(asset.asset)
        }
        is SelectableListAssetViewData.LargeIcon -> {
            this.setAssetType(ListRowView.TYPE_LARGE_ICON)
            this.loadRowAsset(asset.asset)
        }
        is SelectableListAssetViewData.SmallIcon -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.loadRowAsset(asset.asset)
        }
        is SelectableListAssetViewData.SmallImage -> {
            this.setAssetType(ListRowView.TYPE_SMALL_ICON)
            this.loadRowAsset(asset.asset)
        }
        null -> {}
    }
}

private fun ListRowView.loadRowAsset(asset: RowAssetViewData) {
    when (asset) {
        is RowAssetViewData.DrawableAsset -> this.setAssetDrawable(asset.drawableRes)
        is RowAssetViewData.DrawableIdAsset -> this.setAssetResource(asset.id)
        is RowAssetViewData.UrlAsset -> this.setAssetUrl(asset.url)
    }
}
