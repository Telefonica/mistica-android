package com.telefonica.mistica.util

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup

fun ViewGroup.children(): Iterable<View> = (0 until childCount)
    .map { index -> getChildAt(index) }

fun Context.convertDpToPx(dps: Int): Int = convertDpToPx(dps.toFloat())

fun Context.convertDpToPx(dps: Float): Int =
    TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dps,
        resources.displayMetrics
    ).toInt()

fun View.show() {
    visibility = VISIBLE
}

fun View.hide() {
    visibility = GONE
}

fun View.padding(
    left: Int = paddingLeft,
    top: Int = paddingTop,
    right: Int = paddingRight,
    bottom: Int = paddingBottom
) {
    setPadding(left, top, right, bottom)
}

fun View.setAlpha(enabled: Boolean) {
    alpha = if (enabled) {
        ENABLED_ALPHA
    } else {
        DISABLED_ALPHA
    }
}

private const val ENABLED_ALPHA = 1F
private const val DISABLED_ALPHA = 0.5F