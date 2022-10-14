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
    ): ListElementViewData(
        id = id,
    )

    data class RowInformativeViewData(
        override val id: String,
        val title: String,
        val description: String? = null,
        val icon: InformativeIconViewData
    ): ListElementViewData(
        id = id,
    )

    data class RowActionViewData(
        override val id: String,
        val onClickListener: OnClickListener,
        val title: String,
        val asset: Drawable? = null,
    ): ListElementViewData(
        id = id,
    )
}

sealed class SelectableListAssetViewData {
    data class Image(val drawableRes: Drawable): SelectableListAssetViewData()
    data class SmallImage(val drawableRes: Drawable): SelectableListAssetViewData()
    data class SmallIcon(@DrawableRes val id: Int): SelectableListAssetViewData()
    data class LargeIcon(@DrawableRes val id: Int): SelectableListAssetViewData()
}

sealed class InformativeIconViewData {
    object Bullet: InformativeIconViewData()
    data class Icon(val drawableRes: Drawable): InformativeIconViewData()
    data class SmallIcon(val drawableRes: Drawable): InformativeIconViewData()
}

interface OnClickListener {
    fun onClicked(id: String)
}