package com.telefonica.mistica.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.util.TypedValue
import androidx.annotation.AttrRes
import com.telefonica.mistica.theme.drawable.LinearGradientWithAngleDrawable
import com.telefonica.mistica.theme.drawable.MisticaDrawableCompatibilityMapper

fun Context.getMisticaThemeDrawableBuilder(@AttrRes themeDrawable: Int): DrawableBuilder {
    return DrawableBuilder(this, getMisticaThemePaintDrawable(themeDrawable))
}

fun Context.getMisticaThemeDrawable(@AttrRes themeDrawable: Int): Drawable =
    getMisticaThemePaintDrawable(themeDrawable)

private fun Context.getMisticaThemePaintDrawable(@AttrRes themeDrawable: Int): PaintDrawable {
    val typedValue = TypedValue()
    theme.resolveAttribute(themeDrawable, typedValue, true)
    if (typedValue.data == TypedValue.DATA_NULL_UNDEFINED) {
        throw RuntimeException("Theme drawable is not specified!")
    }

    return if (typedValue.type.isColorType()) {
        return PaintDrawable(typedValue.data)
    } else {
        MisticaDrawableCompatibilityMapper.getDrawable(typedValue.resourceId)
            ?.apply {
                if (this is LinearGradientWithAngleDrawable) {
                    initialize(resources, theme)
                }
            }
            ?: throw RuntimeException("Drawable is not a mistica Drawable!")
    }
}

private fun Int.isColorType() =
    this >= TypedValue.TYPE_FIRST_COLOR_INT && this <= TypedValue.TYPE_LAST_COLOR_INT