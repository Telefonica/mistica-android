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

internal fun RowSelectable.mapToViewData(childrenId: String, onBottomSheetClicked: InternalOnSheetTapped): RowWithCheckBoxViewData =
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
        onClickListener = object : OnClickListener {
            override fun onClicked(id: String) {
                onBottomSheetClicked.onTapped(childrenId, id)
            }
        },
        title = title,
        asset = getRowAssetViewDataNullable(asset, rowAsset),
        rowActionStyle = when (style) {
            RowActionStyle.Default -> RowActionStyleViewData.Default
            RowActionStyle.Destructive -> RowActionStyleViewData.Destructive
        }
    )

private fun SelectableAsset.mapToAssetViewData(): SelectableListAssetViewData = when (this) {
    is SelectableAsset.Image -> SelectableListAssetViewData.Image(getRowAssetViewData(drawableRes, rowAsset))
    is SelectableAsset.SmallImage -> SelectableListAssetViewData.SmallImage(getRowAssetViewData(drawableRes, rowAsset))
    is SelectableAsset.LargeIcon -> SelectableListAssetViewData.LargeIcon(getRowAssetViewData(id, rowAsset))
    is SelectableAsset.SmallIcon -> SelectableListAssetViewData.SmallIcon(getRowAssetViewData(id, rowAsset))
}

private fun InformativeIcon.mapToIconViewData(): InformativeIconViewData = when (this) {
    InformativeIcon.Bullet -> InformativeIconViewData.Bullet
    is InformativeIcon.Icon -> InformativeIconViewData.Icon(getRowAssetViewData(drawableRes, rowAsset))
    is InformativeIcon.SmallIcon -> InformativeIconViewData.SmallIcon(getRowAssetViewData(drawableRes, rowAsset))
}

private fun getRowAssetViewDataNullable(drawable: Drawable?, asset: RowAsset?): RowAssetViewData? =
    asset?.mapToRowAssetViewData() ?: if (drawable != null) {
        RowAssetViewData.DrawableAsset(drawable)
    } else {
        null
    }

private fun getRowAssetViewData(drawable: Drawable?, asset: RowAsset?): RowAssetViewData =
    asset?.mapToRowAssetViewData()
        ?: if (drawable != null) {
            RowAssetViewData.DrawableAsset(drawable)
        } else {
            throw IllegalArgumentException("Both asset and drawable are null")
        }

private fun getRowAssetViewData(drawable: Int?, asset: RowAsset?): RowAssetViewData =
    asset?.mapToRowAssetViewData()
        ?: if (drawable != null) {
            RowAssetViewData.DrawableIdAsset(drawable)
        } else {
            throw IllegalArgumentException("Both asset and drawable are null")
        }

private fun RowAsset.mapToRowAssetViewData(): RowAssetViewData = when (this) {
    is RowAsset.UrlAsset -> RowAssetViewData.UrlAsset(this.url)
    is RowAsset.DrawableIdAsset -> RowAssetViewData.DrawableIdAsset(this.id)
    is RowAsset.DrawableAsset -> RowAssetViewData.DrawableAsset(this.drawableRes)
}
