package com.telefonica.mistica.util

import android.view.View
import android.widget.TextView
import androidx.annotation.StyleRes

fun TextView.setTextAndVisibility(newText: CharSequence?) {
    if (newText?.isNotBlank() == true) {
        text = newText
        visibility = View.VISIBLE
    } else {
        visibility = View.GONE
    }
}

fun TextView.setTextPreset(@StyleRes textPreset: Int) {
    setTextAppearance(textPreset)
}