package com.telefonica.mistica.util

import android.content.Context
import android.os.Build
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityManager

class AccessibilityWrapper(context: Context) {
    private val accessibilityManager = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

    fun isAccessibilityEnabled() = accessibilityManager.isEnabled

    fun sendAccessibilityAnnouncement(announcement: String, interrupt: Boolean) {
        if (isAccessibilityEnabled()) {
            getNewEvent().let { accessibilityEvent ->
                accessibilityEvent.eventType = AccessibilityEvent.TYPE_ANNOUNCEMENT
                accessibilityEvent.text.add(announcement)
                if (interrupt) accessibilityManager.interrupt()
                accessibilityManager.sendAccessibilityEvent(accessibilityEvent)
            }
        }
    }

    @Suppress("DEPRECATION")
    private fun getNewEvent() =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) AccessibilityEvent()
        else AccessibilityEvent.obtain()
}
