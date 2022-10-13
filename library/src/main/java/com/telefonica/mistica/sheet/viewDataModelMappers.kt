package com.telefonica.mistica.sheet

import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowInformativeViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowWithCheckBoxViewData
import com.telefonica.mistica.sheet.children.list.OnClickListener
import com.telefonica.mistica.sheet.children.list.SelectableListAssetViewData

internal fun List<RowSelectable>.mapToSelectableViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowWithCheckBoxViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun List<RowInformative>.mapToInformativeViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowInformativeViewData> = this
    .map { it.mapToSelectableViewData(childrenId, onBottomSheetClicked) }

internal fun List<RowAction>.mapToActionViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowActionViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun RowSelectable.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowWithCheckBoxViewData =
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

internal fun RowInformative.mapToSelectableViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowInformativeViewData =
    RowInformativeViewData(
        id = id,
        onClickListener = object: OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        description = description,
    )

internal fun RowAction.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowActionViewData =
    RowActionViewData(
        id = id,
        onClickListener = object: OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        asset = asset,
    )

internal fun Asset.mapToAssetViewData(): SelectableListAssetViewData = when (this) {
    is Asset.Image -> SelectableListAssetViewData.Image(drawableRes)
    is Asset.SmallImage -> SelectableListAssetViewData.SmallImage(drawableRes)
    is Asset.LargeIcon -> SelectableListAssetViewData.LargeIcon(id)
    is Asset.SmallIcon -> SelectableListAssetViewData.SmallIcon(id)
}