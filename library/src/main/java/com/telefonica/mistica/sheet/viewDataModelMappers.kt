package com.telefonica.mistica.sheet

import com.telefonica.mistica.sheet.children.list.AssetViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowWithCheckBoxViewData
import com.telefonica.mistica.sheet.children.list.OnClickListener

internal fun List<RowWithCheckBox>.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowWithCheckBoxViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun RowWithCheckBox.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowWithCheckBoxViewData =
    RowWithCheckBoxViewData(
        id = id,
        onClickListener = object: OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        description = description,
        asset = asset?.mapToAssetViewData(),
        selected = selected,
    )

internal fun Asset.mapToAssetViewData(): AssetViewData = when (this) {
    is Asset.Image -> AssetViewData.Image(drawableRes)
    is Asset.SmallImage -> AssetViewData.SmallImage(drawableRes)
    is Asset.LargeIcon -> AssetViewData.LargeIcon(id)
    is Asset.SmallIcon -> AssetViewData.SmallIcon(id)
}