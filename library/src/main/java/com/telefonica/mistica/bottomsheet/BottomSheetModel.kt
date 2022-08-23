package com.telefonica.mistica.bottomsheet

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

data class BottomSheetModel(
    val header: Header = Header(),
    val content: List<Children> = emptyList()
)

data class Header(
    val title: String? = null,
    val subtitle: String? = null,
    val description: String? = null,
)

sealed class Children(open val id: String) {
    data class ListWithCheckbox(
        override val id: String,
        val elements: List<RowWithCheckboxElement>,
    ) : Children(id = id)
}

sealed class RowWithCheckboxElement(
    open val id: String,
) {
    data class RowWithCheckBox(
        override val id: String,
        val title: String,
        val description: String? = null,
        val asset: Asset? = null,
        val selected: Boolean = false,
    ) : RowWithCheckboxElement(
        id = id,
    )
}

sealed class Asset {
    data class Image(val drawableRes: Drawable) : Asset()
    data class SmallIcon(@DrawableRes val id: Int) : Asset()
    data class LargeIcon(@DrawableRes val id: Int) : Asset()
}
