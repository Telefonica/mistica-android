package com.telefonica.mistica.util

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt

@ColorInt
fun Context.getThemeColor(@AttrRes themeColor: Int): Int =
    getThemeColor(themeColor, true)

private fun Context.getThemeColor(@AttrRes themeColor: Int, resolveRefs: Boolean): Int {
    val typedValue = TypedValue()
    theme.resolveAttribute(themeColor, typedValue, resolveRefs)
    if (typedValue.data == TypedValue.DATA_NULL_UNDEFINED) {
        throw RuntimeException("Theme color is not specified!")
    }
    return typedValue.data
}