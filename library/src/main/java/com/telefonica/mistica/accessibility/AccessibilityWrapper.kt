package com.telefonica.mistica.accessibility

import android.os.Build
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityManager

class AccessibilityWrapper(
    private val accessibilityManager: AccessibilityManager
) {

    fun announce(text: CharSequence) {
        if (accessibilityManager.isEnabled) {
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
            accessibilityManager.sendAccessibilityEvent(event)
        }
    }

    fun interrupt() {
        if (accessibilityManager.isEnabled) accessibilityManager.interrupt()
    }
}
