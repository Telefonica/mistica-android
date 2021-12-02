package com.telefonica.mistica.tag

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.IntDef
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.core.graphics.drawable.DrawableCompat
import com.google.android.material.textview.MaterialTextView
import com.telefonica.mistica.R
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INVERSE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor
import java.util.Locale

@Retention(AnnotationRetention.SOURCE)
@IntDef(
    TYPE_PROMO,
    TYPE_ACTIVE,
    TYPE_INACTIVE,
    TYPE_SUCCESS,
    TYPE_WARNING,
    TYPE_ERROR,
    TYPE_INVERSE,
)
annotation class TagStyle

class TagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : MaterialTextView(
    ContextThemeWrapper(context, R.style.AppTheme_Widgets_Tag),
    attrs,
    defStyleAttr
) {

    @TagStyle
    private var currentStyle = TYPE_PROMO

    init {
        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.TagView, defStyleAttr, 0)

            val style = styledAttrs.getInt(R.styleable.TagView_tagStyle, currentStyle)
            val icon = styledAttrs.getDrawable(R.styleable.TagView_tagIcon)
            setTagStyle(style, icon)

            styledAttrs.recycle()
        }
    }

    fun setTagStyle(@TagStyle style: Int, icon: Drawable? = null) {
        currentStyle = style
        val (tagBackground, tagTextColor) = style.getStyle()
        background.colorFilter = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(context.getThemeColor(tagBackground), BlendModeCompat.SRC_ATOP)
        setTextColor(context.getThemeColor(tagTextColor))

        if (icon != null) {
            setTagIcon(icon)
        }
    }

    fun setTagIcon(drawable: Drawable) {

        DrawableCompat.setTint(DrawableCompat.wrap(drawable), context.getThemeColor(currentStyle.getStyle().second))

        val iconSize = context.convertDpToPx(16)
        drawable.setBounds(0, 0, iconSize, iconSize)

        setCompoundDrawablesRelative(drawable, null, null, null)
        compoundDrawablePadding = context.convertDpToPx(4)

        setPadding(context.convertDpToPx(8), paddingTop, paddingRight, paddingBottom)
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text?.toString()?.captitalizeFirstChar(), type)
    }

    private fun Int.getStyle() = when (this) {
        TYPE_PROMO -> R.attr.tagBackgroundPromo to R.attr.textTagPromo
        TYPE_ACTIVE -> R.attr.tagBackgroundActive to R.attr.textTagActive
        TYPE_INACTIVE -> R.attr.tagBackgroundInactive to R.attr.textTagInactive
        TYPE_SUCCESS -> R.attr.tagBackgroundSuccess to R.attr.textTagSuccess
        TYPE_WARNING -> R.attr.tagBackgroundWarning to R.attr.textTagWarning
        TYPE_ERROR -> R.attr.tagBackgroundError to R.attr.textTagError
        TYPE_INVERSE -> R.attr.colorInverse to R.attr.textTagActive
        else -> R.attr.tagBackgroundPromo to R.attr.textTagPromo
    }

    private fun String.captitalizeFirstChar(): String {
        return toLowerCase(Locale.getDefault()).capitalize(Locale.getDefault())
    }

    companion object {
        const val TYPE_PROMO = 0
        const val TYPE_ACTIVE = 1
        const val TYPE_INACTIVE = 2
        const val TYPE_SUCCESS = 3
        const val TYPE_WARNING = 4
        const val TYPE_ERROR = 5
        const val TYPE_INVERSE = 6
    }
}
