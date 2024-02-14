package com.telefonica.mistica.sheet

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes

data class SheetModel(
    val header: Header = Header(),
    val content: List<Children> = emptyList(),
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
    @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
    val asset: Drawable? = null,
    val rowAsset: RowAsset? = null,
)

data class RowInformative(
    val id: String,
    val title: String,
    val description: String? = null,
    val icon: InformativeIcon,
)

data class ActionButton(
    val title: String,
    val withChevron: Boolean = false,
)

sealed class SelectableAsset {
    data class Image(
        val rowAsset: RowAsset,
    ) : SelectableAsset() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(drawableRes: Drawable) : this(RowAsset.DrawableAsset(drawableRes))
    }

    data class SmallImage(
        val rowAsset: RowAsset,
    ) : SelectableAsset() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(drawableRes: Drawable) : this(RowAsset.DrawableAsset(drawableRes))
    }

    data class SmallIcon(
        val rowAsset: RowAsset,
    ) : SelectableAsset() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(@DrawableRes id: Int) : this(RowAsset.DrawableIdAsset(id))
    }

    data class LargeIcon(
        val rowAsset: RowAsset,
    ) : SelectableAsset() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(@DrawableRes id: Int) : this(RowAsset.DrawableIdAsset(id))
    }
}

sealed class InformativeIcon {
    data object Bullet : InformativeIcon()
    data class Icon(
        val rowAsset: RowAsset,
    ) : InformativeIcon() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(drawableRes: Drawable) : this(RowAsset.DrawableAsset(drawableRes))
    }

    data class SmallIcon(
        val rowAsset: RowAsset,
    ) : InformativeIcon() {
        @Deprecated("Use primary constructor providing a RowAsset object instead")
        constructor(drawableRes: Drawable) : this(RowAsset.DrawableAsset(drawableRes))
    }
}

sealed class RowAsset {
    data class UrlAsset(val url: String) : RowAsset()
    data class DrawableIdAsset(@DrawableRes val id: Int) : RowAsset()
    data class DrawableAsset(val drawableRes: Drawable) : RowAsset()
}

enum class RowActionStyle { Default, Destructive }
