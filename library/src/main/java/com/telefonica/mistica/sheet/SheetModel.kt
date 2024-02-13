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
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        val drawableRes: Drawable? = null,
        val rowAsset: RowAsset? = null,
    ) : SelectableAsset()

    data class SmallImage(
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        val drawableRes: Drawable? = null,
        val rowAsset: RowAsset? = null,
    ) : SelectableAsset()

    data class SmallIcon(
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        @DrawableRes val id: Int? = null,
        val rowAsset: RowAsset? = null,
    ) : SelectableAsset()

    data class LargeIcon(
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        @DrawableRes val id: Int? = null,
        val rowAsset: RowAsset? = null,
    ) : SelectableAsset()
}

sealed class InformativeIcon {
    data object Bullet : InformativeIcon()
    data class Icon(
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        val drawableRes: Drawable? = null,
        val rowAsset: RowAsset? = null,
    ) : InformativeIcon()

    data class SmallIcon(
        @Deprecated("Use new field rowAsset. RowAsset will have preference over asset")
        val drawableRes: Drawable? = null,
        val rowAsset: RowAsset? = null,
    ) : InformativeIcon()
}

sealed class RowAsset {
    data class UrlAsset(val url: String) : RowAsset()
    data class DrawableIdAsset(@DrawableRes val id: Int) : RowAsset()
    data class DrawableAsset(val drawableRes: Drawable) : RowAsset()
}

enum class RowActionStyle { Default, Destructive }
