package com.telefonica.mistica.util

import android.os.Build
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityManager

fun AccessibilityManager.announce(text: CharSequence) {
    val event =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            AccessibilityEvent().apply {
                eventType = AccessibilityEvent.TYPE_ANNOUNCEMENT
            }
        } else {
            @Suppress("DEPRECATION")
            AccessibilityEvent.obtain(AccessibilityEvent.TYPE_ANNOUNCEMENT)
        }
    event.contentDescription = text
    sendAccessibilityEvent(event)
}
