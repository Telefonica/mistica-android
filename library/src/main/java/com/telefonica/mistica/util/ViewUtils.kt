package com.telefonica.mistica.util

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup

fun ViewGroup.children(): Iterable<View> = (0 until childCount)
    .map { index -> getChildAt(index) }

fun Context.convertDpToPx(dps: Int): Int =
    TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dps.toFloat(),
        resources.displayMetrics
    ).toInt()

fun View.show() {
    visibility = VISIBLE
}

fun View.hide() {
    visibility = GONE
}
