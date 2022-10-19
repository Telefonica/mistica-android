package com.telefonica.mistica.sheet

import com.telefonica.mistica.sheet.children.list.InformativeIconViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowInformativeViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowWithCheckBoxViewData
import com.telefonica.mistica.sheet.children.list.OnClickListener
import com.telefonica.mistica.sheet.children.list.RowActionStyleViewData
import com.telefonica.mistica.sheet.children.list.SelectableListAssetViewData

internal fun List<RowSelectable>.mapToSelectableViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowWithCheckBoxViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun List<RowInformative>.mapToInformativeViewData(): List<RowInformativeViewData> = this
    .map { it.mapToSelectableViewData() }

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

internal fun RowInformative.mapToSelectableViewData(): RowInformativeViewData =
    RowInformativeViewData(
        id = id,
        title = title,
        description = description,
        icon = icon.mapToIconViewData()
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
        rowActionStyle = when (style) {
            RowActionStyle.Default -> RowActionStyleViewData.Default
            RowActionStyle.Destructive -> RowActionStyleViewData.Destructive
        }
    )

internal fun SelectableAsset.mapToAssetViewData(): SelectableListAssetViewData = when (this) {
    is SelectableAsset.Image -> SelectableListAssetViewData.Image(drawableRes)
    is SelectableAsset.SmallImage -> SelectableListAssetViewData.SmallImage(drawableRes)
    is SelectableAsset.LargeIcon -> SelectableListAssetViewData.LargeIcon(id)
    is SelectableAsset.SmallIcon -> SelectableListAssetViewData.SmallIcon(id)
}

internal fun InformativeIcon.mapToIconViewData(): InformativeIconViewData = when (this) {
    InformativeIcon.Bullet -> InformativeIconViewData.Bullet
    is InformativeIcon.Icon -> InformativeIconViewData.Icon(this.drawableRes)
    is InformativeIcon.SmallIcon -> InformativeIconViewData.SmallIcon(this.drawableRes)
}