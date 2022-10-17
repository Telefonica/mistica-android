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
        val asset: AssetViewData? = null,
        val selected: Boolean = false,
    ): ListElementViewData(
        id = id,
        onClickListener = onClickListener,
    )
}

sealed class AssetViewData {
    data class Image(val drawableRes: Drawable): AssetViewData()
    data class SmallImage(val drawableRes: Drawable): AssetViewData()
    data class SmallIcon(@DrawableRes val id: Int): AssetViewData()
    data class LargeIcon(@DrawableRes val id: Int): AssetViewData()
}

interface OnClickListener {
    fun onClicked(id: String)
}