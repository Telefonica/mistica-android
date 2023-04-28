package com.telefonica.mistica.util

import android.content.Context
import android.content.res.Resources.NotFoundException
import android.util.TypedValue
import androidx.annotation.AttrRes

fun Context.getDimension(@AttrRes themeDimension: Int): Float =
    getDimension(themeDimension, true)

private fun Context.getDimension(@AttrRes themeDimension: Int, resolveRefs: Boolean): Float {
    val value = TypedValue()
    theme.resolveAttribute(themeDimension, value, resolveRefs)
    if (value.type == TypedValue.TYPE_DIMENSION) {
        return TypedValue.complexToDimension(value.data, resources.displayMetrics)
    }
    throw NotFoundException(
        "Resource ID #0x" + Integer.toHexString(themeDimension)
                + " type #0x" + Integer.toHexString(value.type) + " is not valid"
    )
}
