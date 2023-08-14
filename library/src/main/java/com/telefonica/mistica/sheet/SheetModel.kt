package com.telefonica.mistica.sheet

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

data class SheetModel(
    val header: Header = Header(),
    val content: List<Children> = emptyList()
)

data class Header(
    val title: String? = null,
    val subtitle: String? = null,
    val description: String? = null,
)

sealed class Children(open val id: String) {
    data class ListSingleSelection(
        override val id: String,
        val elements: List<RowSelectable>,
    ) : Children(id = id)

    data class ListActions(
        override val id: String,
        val elements: List<RowAction>,
    ) : Children(id = id)

    data class ListInformative(
        override val id: String,
        val elements: List<RowInformative>,
    ) : Children(id = id)

    data class BottomActions(
        override val id: String,
        val primaryButton: ActionButton,
        val secondaryButton: ActionButton?,
        val linkButton: ActionButton?,
    ) : Children(id = id)
}

data class RowSelectable(
    val id: String,
    val title: String,
    val description: String? = null,
    val asset: SelectableAsset? = null,
    val selected: Boolean = false,
)

data class RowAction(
    val id: String,
    val title: String,
    val style: RowActionStyle = RowActionStyle.Default,
    val asset: Drawable?,
)

data class RowInformative(
    val id: String,
    val title: String,
    val description: String? = null,
    val icon: InformativeIcon
)

data class ActionButton(
    val title: String,
    val withChevron: Boolean = false,
)

sealed class SelectableAsset {
    data class Image(val drawableRes: Drawable) : SelectableAsset()
    data class SmallImage(val drawableRes: Drawable) : SelectableAsset()
    data class SmallIcon(@DrawableRes val id: Int) : SelectableAsset()
    data class LargeIcon(@DrawableRes val id: Int) : SelectableAsset()
}

sealed class InformativeIcon {
    object Bullet: InformativeIcon()
    data class Icon(val drawableRes: Drawable) : InformativeIcon()
    data class SmallIcon(val drawableRes: Drawable) : InformativeIcon()
}

enum class RowActionStyle { Default, Destructive }