package com.telefonica.mistica.badge

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import androidx.annotation.PluralsRes
import com.google.android.material.badge.BadgeDrawable
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

object Badge {

    var contentDescriptions: MutableMap<Int, CharSequence?> = mutableMapOf()

    @PluralsRes
    var badgeNotificationsDescriptionResource: Int = R.plurals.badge_notifications_description

    @JvmStatic
    fun showBadgeIn(anchor: View, count: Int = 0): BadgeDrawable {
        val parent = anchor.parent
        if (parent is ViewGroup) {
            return showBadgeIn(anchor, parent, count)
        } else {
            throw RuntimeException("The view's parent is not a ViewGroup. Use showBadgeIn(anchor,parent) instead")
        }
    }

    @JvmStatic
    fun showBadgeIn(anchor: View, parent: ViewGroup, count: Int = 0): BadgeDrawable =
        BadgeDrawable.create(anchor.context).apply {
            maxCharacterCount = 2
            backgroundColor = anchor.context.getThemeColor(R.attr.colorBadgeBackground)
            setupCount(count)
            addToView(anchor, parent, getContentDescription(anchor, count))
        }

    @JvmStatic
    fun removeBadge(anchor: View) {
        val parent = anchor.parent
        if (parent is ViewGroup) {
            removeBadgeWithParent(parent, anchor)
        } else {
            throw RuntimeException("The view's parent is not a ViewGroup. Use removeBadge(badge,parent) instead")
        }
    }

    @JvmStatic
    fun removeBadgeWithParent(parent: ViewGroup, anchor: View) {
        parent.post {
            resetContentDescription(anchor)
            parent.overlay.clear()
        }
    }

    private fun getContentDescription(anchor: View, count: Int): String {
        if (!contentDescriptions.containsKey(anchor.hashCode())) {
            contentDescriptions[anchor.hashCode()] = anchor.contentDescription
        }
        val countValueForStringsRetrieval = when {
            count != 0 -> count
            else -> 1
        }
        val suffix = anchor.context.resources.getQuantityString(
            badgeNotificationsDescriptionResource,
            countValueForStringsRetrieval,
            countValueForStringsRetrieval
        )

        return when (contentDescriptions[anchor.hashCode()]) {
            null -> suffix
            else -> "${contentDescriptions[anchor.hashCode()]}, $suffix"
        }
    }

    private fun resetContentDescription(anchor: View) {
        if (contentDescriptions.containsKey(anchor.hashCode())) {
            anchor.contentDescription = contentDescriptions[anchor.hashCode()]
        }
    }

    private fun BadgeDrawable.setupCount(count: Int) {
        this.maxCharacterCount = 2
        when (count) {
            0 -> this.clearNumber()
            else -> this.number = count
        }
    }

    private fun BadgeDrawable.addToView(
        anchor: View,
        parent: ViewGroup,
        contentDescription: CharSequence?
    ) {
        parent.post {
            this.setBoundsFor(anchor, parent)
            val overlay = parent.overlay
            overlay.add(this)
            anchor.contentDescription = contentDescription
        }
    }

    private fun BadgeDrawable.setBoundsFor(anchor: View, parent: ViewGroup) {
        val rect = Rect()
        parent.getDrawingRect(rect)
        this.bounds = rect
        this.updateBadgeCoordinates(anchor, parent)
    }
}