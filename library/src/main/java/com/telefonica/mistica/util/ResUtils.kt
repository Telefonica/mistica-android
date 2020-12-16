package com.telefonica.mistica.util

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes

fun Context.getThemeRes(@AttrRes attributeRes: Int, resolveRefs: Boolean = true): Int? {
    val typedValue = TypedValue()
    theme.resolveAttribute(attributeRes, typedValue, resolveRefs)
    return typedValue.data.takeIf {
        when (typedValue.type) {
            TypedValue.TYPE_NULL -> false
            TypedValue.TYPE_REFERENCE -> typedValue.data != 0
            else -> true
        }
    }
}
