package com.telefonica.mistica.bottomsheet

import com.telefonica.mistica.bottomsheet.children.list.AssetViewData
import com.telefonica.mistica.bottomsheet.children.list.ListElementViewData.RowWithCheckBoxViewData
import com.telefonica.mistica.bottomsheet.children.list.OnClickListener

internal fun List<RowWithCheckboxElement>.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnBottomSheetClicked): List<RowWithCheckBoxViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun RowWithCheckboxElement.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnBottomSheetClicked): RowWithCheckBoxViewData = when (this) {
    is RowWithCheckboxElement.RowWithCheckBox -> RowWithCheckBoxViewData(
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
}

internal fun Asset.mapToAssetViewData(): AssetViewData = when (this) {
    is Asset.Image -> AssetViewData.Image(drawableRes)
    is Asset.LargeIcon -> AssetViewData.LargeIcon(id)
    is Asset.SmallIcon -> AssetViewData.SmallIcon(id)
}