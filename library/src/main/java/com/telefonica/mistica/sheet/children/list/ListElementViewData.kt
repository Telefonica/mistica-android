package com.telefonica.mistica.sheet.children.list

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

internal sealed class ListElementViewData(
    open val id: String,
) {
    data class RowWithCheckBoxViewData(
        override val id: String,
        val onClickListener: OnClickListener,
        val title: String,
        val description: String? = null,
        val asset: SelectableListAssetViewData? = null,
        val selected: Boolean = false,
    ) : ListElementViewData(
        id = id,
    )

    data class RowInformativeViewData(
        override val id: String,
        val title: String,
        val description: String? = null,
        val icon: InformativeIconViewData,
    ) : ListElementViewData(
        id = id,
    )

    data class RowActionViewData(
        override val id: String,
        val onClickListener: OnClickListener,
        val title: String,
        val contentDescription: String,
        val rowActionStyle: RowActionStyleViewData = RowActionStyleViewData.Default,
        val asset: RowAssetViewData?,
    ) : ListElementViewData(
        id = id,
    )
}

enum class RowActionStyleViewData { Default, Destructive }

internal sealed class SelectableListAssetViewData {
    data class Image(val asset: RowAssetViewData) : SelectableListAssetViewData()
    data class SmallImage(val asset: RowAssetViewData) : SelectableListAssetViewData()
    data class SmallIcon(val asset: RowAssetViewData) : SelectableListAssetViewData()
    data class LargeIcon(val asset: RowAssetViewData) : SelectableListAssetViewData()
}

internal sealed class InformativeIconViewData {
    data object Bullet : InformativeIconViewData()
    data class Icon(val asset: RowAssetViewData) : InformativeIconViewData()
    data class SmallIcon(val asset: RowAssetViewData) : InformativeIconViewData()
}

interface OnClickListener {
    fun onClicked(id: String)
}

internal sealed class RowAssetViewData {
    data class UrlAsset(val url: String) : RowAssetViewData()
    data class DrawableIdAsset(@DrawableRes val id: Int) : RowAssetViewData()
    data class DrawableAsset(val drawableRes: Drawable) : RowAssetViewData()
}
