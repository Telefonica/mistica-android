package com.telefonica.mistica.tag

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.IntDef
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import com.google.android.material.textview.MaterialTextView
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor


class TagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(
    ContextThemeWrapper(context, R.style.AppTheme_Widgets_Tag),
    attrs,
    defStyleAttr
) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TAG_STYLE_PROMO,
        TAG_STYLE_BRAND,
        TAG_STYLE_NEUTRAL_HIGH,
        TAG_STYLE_NEUTRAL_MEDIUM,
        TAG_STYLE_SUCCESS,
        TAG_STYLE_WARNING,
        TAG_STYLE_ERROR,
        TAG_STYLE_INVERSE,
    )
    annotation class TagStyle

    init {
        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.TagView,
                    defStyleAttr,
                    0
                )
            setTagStyle(styledAttrs.getInt(R.styleable.TagView_tagStyle, TAG_STYLE_PROMO))
            styledAttrs.recycle()
        }
    }

    fun setTagStyle(@TagStyle tagStyle: Int) {
        setTagColor(mapTagStyleToColor(tagStyle))
    }

    private fun setTagColor(@ColorInt colorRes: Int) {
        background.colorFilter = BlendModeColorFilterCompat
            .createBlendModeColorFilterCompat(colorRes, BlendModeCompat.SRC_ATOP)
        if (colorRes == context.getThemeColor(R.attr.colorInverse)) {
            setTextColor(context.getThemeColor(R.attr.colorTextPrimary))
        }
    }

    private fun mapTagStyleToColor(@TagStyle tagStyle: Int): Int =
        when (tagStyle) {
            TAG_STYLE_PROMO -> context.getThemeColor(R.attr.colorPromo)
            TAG_STYLE_BRAND -> context.getThemeColor(R.attr.colorBrand)
            TAG_STYLE_NEUTRAL_HIGH -> context.getThemeColor(R.attr.colorNeutralHigh)
            TAG_STYLE_NEUTRAL_MEDIUM -> context.getThemeColor(R.attr.colorNeutralMedium)
            TAG_STYLE_SUCCESS -> context.getThemeColor(R.attr.colorSuccess)
            TAG_STYLE_WARNING -> context.getThemeColor(R.attr.colorWarning)
            TAG_STYLE_ERROR -> context.getThemeColor(R.attr.colorError)
            TAG_STYLE_INVERSE -> context.getThemeColor(R.attr.colorInverse)
            else -> context.getThemeColor(R.attr.colorPromo)
        }

    companion object {
        const val TAG_STYLE_PROMO = 0
        const val TAG_STYLE_BRAND = 1
        const val TAG_STYLE_NEUTRAL_HIGH = 2
        const val TAG_STYLE_NEUTRAL_MEDIUM = 3
        const val TAG_STYLE_SUCCESS = 4
        const val TAG_STYLE_WARNING = 5
        const val TAG_STYLE_ERROR = 6
        const val TAG_STYLE_INVERSE = 7

        enum class Style(@TagView.TagStyle val type: Int) {
            PROMO(TAG_STYLE_PROMO),
            BRAND(TAG_STYLE_BRAND),
            NEUTRAL_HIGH(TAG_STYLE_NEUTRAL_HIGH),
            NEUTRAL_MEDIUM(TAG_STYLE_NEUTRAL_MEDIUM),
            SUCCESS(TAG_STYLE_SUCCESS),
            WARNING(TAG_STYLE_WARNING),
            ERROR(TAG_STYLE_ERROR),
            INVERSE(TAG_STYLE_INVERSE),
        }
    }
}
