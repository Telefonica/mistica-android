package com.telefonica.mistica.sheet

import android.graphics.drawable.Drawable
import com.telefonica.mistica.sheet.children.list.InformativeIconViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowActionViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowInformativeViewData
import com.telefonica.mistica.sheet.children.list.ListElementViewData.RowWithCheckBoxViewData
import com.telefonica.mistica.sheet.children.list.OnClickListener
import com.telefonica.mistica.sheet.children.list.RowActionStyleViewData
import com.telefonica.mistica.sheet.children.list.RowAssetViewData
import com.telefonica.mistica.sheet.children.list.SelectableListAssetViewData

internal fun List<RowSelectable>.mapToSelectableViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowWithCheckBoxViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

internal fun List<RowInformative>.mapToInformativeViewData(): List<RowInformativeViewData> = this
    .map { it.mapToSelectableViewData() }

internal fun List<RowAction>.mapToActionViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): List<RowActionViewData> = this
    .map { it.mapToViewData(childrenId, onBottomSheetClicked) }

private fun RowSelectable.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowWithCheckBoxViewData =
    RowWithCheckBoxViewData(
        id = id,
        onClickListener = object : OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        description = description,
        asset = asset?.mapToAssetViewData(),
        selected = selected,
    )

private fun RowInformative.mapToSelectableViewData(): RowInformativeViewData =
    RowInformativeViewData(
        id = id,
        title = title,
        description = description,
        icon = icon.mapToIconViewData()
    )

private fun RowAction.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowActionViewData =
    RowActionViewData(
        id = id,
        onClickListener = object : OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        contentDescription = contentDescription ?: title,
        asset = getRowAssetViewData(asset, rowAsset),
        rowActionStyle = when (style) {
            RowActionStyle.Default -> RowActionStyleViewData.Default
            RowActionStyle.Destructive -> RowActionStyleViewData.Destructive
        }
    )

private fun SelectableAsset.mapToAssetViewData(): SelectableListAssetViewData = when (this) {
    is SelectableAsset.Image -> SelectableListAssetViewData.Image(rowAsset.mapToRowAssetViewData())
    is SelectableAsset.SmallImage -> SelectableListAssetViewData.SmallImage(rowAsset.mapToRowAssetViewData())
    is SelectableAsset.LargeIcon -> SelectableListAssetViewData.LargeIcon(rowAsset.mapToRowAssetViewData())
    is SelectableAsset.SmallIcon -> SelectableListAssetViewData.SmallIcon(rowAsset.mapToRowAssetViewData())
}

private fun InformativeIcon.mapToIconViewData(): InformativeIconViewData = when (this) {
    InformativeIcon.Bullet -> InformativeIconViewData.Bullet
    is InformativeIcon.Icon -> InformativeIconViewData.Icon(rowAsset.mapToRowAssetViewData())
    is InformativeIcon.SmallIcon -> InformativeIconViewData.SmallIcon(rowAsset.mapToRowAssetViewData())
}

private fun getRowAssetViewData(drawable: Drawable?, asset: RowAsset?): RowAssetViewData? =
    asset?.mapToRowAssetViewData() ?: if (drawable != null) {
        RowAssetViewData.DrawableAsset(drawable)
    } else {
        null
    }

private fun RowAsset.mapToRowAssetViewData(): RowAssetViewData = when (this) {
    is RowAsset.UrlAsset -> RowAssetViewData.UrlAsset(this.url)
    is RowAsset.DrawableIdAsset -> RowAssetViewData.DrawableIdAsset(this.id)
    is RowAsset.DrawableAsset -> RowAssetViewData.DrawableAsset(this.drawableRes)
}
