package com.telefonica.mistica.badge

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import com.google.android.material.badge.BadgeDrawable
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

object Badge {

    var contentDescriptions: MutableMap<Int, CharSequence?> = mutableMapOf()

    @JvmStatic
    fun showBadgeIn(anchor: View, badgeDescription: String? = null): BadgeDrawable {
        val parent = anchor.parent
        if (parent is ViewGroup) {
            return showBadgeIn(anchor, parent, badgeDescription)
        } else {
            throw RuntimeException("The view's parent is not a ViewGroup. Use showBadgeIn(anchor,parent) instead")
        }
    }

    @JvmStatic
    fun showBadgeIn(
        anchor: View,
        parent: ViewGroup,
        badgeDescription: String? = null
    ): BadgeDrawable =
        createBadge(anchor, NON_NUMERIC_BADGE).apply {
            addToView(
                anchor,
                parent,
                buildBadgeContentDescription(anchor, NON_NUMERIC_BADGE, badgeDescription)
            )
        }

    @JvmStatic
    fun showNumericBadgeIn(
        anchor: View,
        count: Int,
        badgeDescription: String? = null
    ): BadgeDrawable {
        val parent = anchor.parent
        if (parent is ViewGroup) {
            return showNumericBadgeIn(anchor, parent, count, badgeDescription)
        } else {
            throw RuntimeException("The view's parent is not a ViewGroup. Use showNumericBadgeIn(anchor, parent, count) instead")
        }
    }

    @JvmStatic
    fun showNumericBadgeIn(
        anchor: View,
        parent: ViewGroup,
        count: Int,
        badgeDescription: String? = null
    ): BadgeDrawable =
        createBadge(anchor, count).apply {
            when (count) {
                NON_NUMERIC_BADGE -> removeBadge(anchor)
                else -> addToView(
                    anchor,
                    parent,
                    buildBadgeContentDescription(anchor, count, badgeDescription)
                )
            }
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

    private fun createBadge(
        anchor: View,
        count: Int
    ) = BadgeDrawable.create(anchor.context).apply {
        maxCharacterCount = 2
        backgroundColor = anchor.context.getThemeColor(R.attr.colorBadgeBackground)
        setupCount(count)
    }

    private fun buildBadgeContentDescription(
        anchor: View,
        count: Int,
        badgeDescription: String?
    ): String {
        if (!contentDescriptions.containsKey(anchor.hashCode())) {
            contentDescriptions[anchor.hashCode()] = anchor.contentDescription
        }

        val suffix = badgeDescription ?: getDefaultBadgeDescription(anchor, count)

        return when (contentDescriptions[anchor.hashCode()]) {
            null -> suffix
            else -> "${contentDescriptions[anchor.hashCode()]}, $suffix"
        }
    }

    private fun getDefaultBadgeDescription(
        anchor: View,
        count: Int
    ) = if (count == 0) {
        anchor.context.getString(R.string.badge_notification_description)
    } else {
        count.toString()
    }

    private fun resetContentDescription(anchor: View) {
        if (contentDescriptions.containsKey(anchor.hashCode())) {
            anchor.contentDescription = contentDescriptions[anchor.hashCode()]
        }
    }

    private fun BadgeDrawable.setupCount(count: Int) {
        this.maxCharacterCount = 2
        when (count) {
            NON_NUMERIC_BADGE -> this.clearNumber()
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


    private const val NON_NUMERIC_BADGE = 0
}
