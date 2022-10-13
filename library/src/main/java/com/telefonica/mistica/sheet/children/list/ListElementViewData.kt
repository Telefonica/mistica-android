package com.telefonica.mistica.sheet.children.list

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

internal sealed class ListElementViewData(
    open val id: String,
    open val onClickListener: OnClickListener,
) {
    data class RowWithCheckBoxViewData(
        override val id: String,
        override val onClickListener: OnClickListener,
        val title: String,
        val description: String? = null,
        val asset: SelectableListAssetViewData? = null,
        val selected: Boolean = false,
    ): ListElementViewData(
        id = id,
        onClickListener = onClickListener,
    )

    data class RowInformativeViewData(
        override val id: String,
        override val onClickListener: OnClickListener,
        val title: String,
        val description: String? = null,
    ): ListElementViewData(
        id = id,
        onClickListener = onClickListener,
    )

    data class RowActionViewData(
        override val id: String,
        override val onClickListener: OnClickListener,
        val title: String,
        val asset: Drawable? = null,
    ): ListElementViewData(
        id = id,
        onClickListener = onClickListener,
    )
}

sealed class SelectableListAssetViewData {
    data class Image(val drawableRes: Drawable): SelectableListAssetViewData()
    data class SmallImage(val drawableRes: Drawable): SelectableListAssetViewData()
    data class SmallIcon(@DrawableRes val id: Int): SelectableListAssetViewData()
    data class LargeIcon(@DrawableRes val id: Int): SelectableListAssetViewData()
}

interface OnClickListener {
    fun onClicked(id: String)
}