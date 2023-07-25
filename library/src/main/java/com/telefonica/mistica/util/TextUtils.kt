package com.telefonica.mistica.util

import android.os.Build
import android.view.View
import android.widget.TextView
import androidx.annotation.StyleRes
import com.telefonica.mistica.button.Button

fun TextView.setTextAndVisibility(newText: CharSequence?) {
    if (newText?.isNotBlank() == true) {
        text = newText
        visibility = View.VISIBLE
    } else {
        visibility = View.GONE
    }
}

fun Button.setTextAndVisibility(newText: CharSequence?) {
    if (newText?.isNotBlank() == true) {
        text = newText.toString()
        visibility = View.VISIBLE
    } else {
        visibility = View.GONE
    }
}

fun TextView.setTextPreset(@StyleRes textPreset: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        setTextAppearance(textPreset)
    } else {
        @Suppress("DEPRECATION")
        setTextAppearance(context, textPreset)
    }
}
