package com.telefonica.mistica.tag

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.annotation.ColorInt
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
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INFO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor

@Retention(AnnotationRetention.SOURCE)
@IntDef(
    TYPE_PROMO,
    TYPE_INFO,
    TYPE_ACTIVE,
    TYPE_INACTIVE,
    TYPE_SUCCESS,
    TYPE_WARNING,
    TYPE_ERROR,
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
            val textColor: Int? =
                styledAttrs.getColor(R.styleable.TagView_tagTextColor, UNDEFINED_COLOR)
                    .takeIf { it != UNDEFINED_COLOR }
            val backgroundColor: Int? =
                styledAttrs.getColor(R.styleable.TagView_tagBackgroundColor, UNDEFINED_COLOR)
                    .takeIf { it != UNDEFINED_COLOR }
            setTagStyle(style, icon, TagColors(textColor, backgroundColor))

            styledAttrs.recycle()
        }
    }

    @JvmOverloads
    fun setTagStyle(@TagStyle style: Int, icon: Drawable? = null, customColors: TagColors? = null) {
        currentStyle = style
        val styleColors = style.getStyle()

        val tagBackgroundColor = customColors?.backgroundColor ?: context.getThemeColor(styleColors.first)
        val tagTextColor = customColors?.textColor ?: context.getThemeColor(styleColors.second)
        background.colorFilter = BlendModeColorFilterCompat
            .createBlendModeColorFilterCompat(tagBackgroundColor, BlendModeCompat.SRC_IN)
        setTextColor(tagTextColor)

        if (icon != null) {
            setTagIcon(icon, tagTextColor)
        }
    }

    fun setTagIcon(drawable: Drawable, @ColorInt textColor: Int) {

        DrawableCompat.setTint(DrawableCompat.wrap(drawable), textColor)

        val iconSize = context.convertDpToPx(16)
        val fixedMargin = context.convertDpToPx(1.5F)
        drawable.setBounds(0, fixedMargin, iconSize, iconSize + fixedMargin)

        setCompoundDrawablesRelative(drawable, null, null, null)
        compoundDrawablePadding = context.convertDpToPx(4)

        setPadding(context.convertDpToPx(8), paddingTop, paddingRight, paddingBottom)
    }

    override fun setText(text: CharSequence?, type: BufferType?) {
        super.setText(text?.toString(), type)
    }

    private fun Int.getStyle() = when (this) {
        TYPE_PROMO -> R.attr.colorTagBackgroundPromo to R.attr.colorTagTextPromo
        TYPE_INFO -> R.attr.colorTagBackgroundInfo to R.attr.colorTagTextInfo
        TYPE_ACTIVE -> R.attr.colorTagBackgroundActive to R.attr.colorTagTextActive
        TYPE_INACTIVE -> R.attr.colorTagBackgroundInactive to R.attr.colorTagTextInactive
        TYPE_SUCCESS -> R.attr.colorTagBackgroundSuccess to R.attr.colorTagTextSuccess
        TYPE_WARNING -> R.attr.colorTagBackgroundWarning to R.attr.colorTagTextWarning
        TYPE_ERROR -> R.attr.colorTagBackgroundError to R.attr.colorTagTextError
        else -> R.attr.colorTagBackgroundPromo to R.attr.colorTagTextPromo
    }

    companion object {
        const val TYPE_PROMO = 0
        const val TYPE_INFO = 1
        const val TYPE_ACTIVE = 2
        const val TYPE_INACTIVE = 3
        const val TYPE_SUCCESS = 4
        const val TYPE_WARNING = 5
        const val TYPE_ERROR = 6

        private const val UNDEFINED_COLOR = Int.MIN_VALUE
    }
}
