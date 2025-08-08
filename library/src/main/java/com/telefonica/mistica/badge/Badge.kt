package com.telefonica.mistica.badge

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.badge.BadgeDrawable
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

object Badge {

    var contentDescriptions: MutableMap<Int, CharSequence?> = mutableMapOf()

    @JvmStatic
    fun showBadgeIn(
        anchor: View,
        parent: FrameLayout,
        badgeDescription: String? = null
    ): BadgeDrawable =
        createBadge(anchor, NON_NUMERIC_BADGE).apply {
            addToView(
                anchor,
                parent,
                buildBadgeContentDescription(anchor, badgeDescription)
            )
        }

    @JvmStatic
    fun showNumericBadgeIn(
        anchor: View,
        parent: FrameLayout,
        count: Int,
        badgeDescription: String? = null
    ): BadgeDrawable =
        createBadge(anchor, count).apply {
            when (count) {
                NON_NUMERIC_BADGE -> removeBadge(anchor)
                else -> addToView(
                    anchor,
                    parent,
                    buildBadgeContentDescription(anchor, badgeDescription)
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
        count: Int,
    ) = BadgeDrawable.create(anchor.context).apply {
        maxCharacterCount = 2
        backgroundColor = anchor.context.getThemeColor(R.attr.colorBadge)
        badgeTextColor = anchor.context.getThemeColor(R.attr.colorTextPrimaryInverse)
        setupCount(count)
    }

    private fun buildBadgeContentDescription(
        anchor: View,
        badgeDescription: String?,
    ): String? {
        if (!contentDescriptions.containsKey(anchor.hashCode())) {
            contentDescriptions[anchor.hashCode()] = anchor.contentDescription
        }

        val suffix = badgeDescription

        return when (contentDescriptions[anchor.hashCode()]) {
            null -> suffix
            else -> if (suffix.isNullOrEmpty()) "${contentDescriptions[anchor.hashCode()]}" else "${contentDescriptions[anchor.hashCode()]}, $suffix"
        }
    }

    private fun resetContentDescription(anchor: View) {
        if (contentDescriptions.containsKey(anchor.hashCode())) {
            anchor.contentDescription = contentDescriptions[anchor.hashCode()]
        }
    }

    private fun BadgeDrawable.setupCount(count: Int) {
        this.maxCharacterCount = 2
        when {
            count == NON_NUMERIC_BADGE -> this.clearNumber()
            count.toString().length < this.maxCharacterCount -> this.number = count
            else -> this.text = "+9"
        }
    }

    private fun BadgeDrawable.addToView(
        anchor: View,
        parent: FrameLayout,
        contentDescription: CharSequence?
    ) {
        parent.post {
            this.setBoundsFor(anchor, parent)
            val overlay = parent.overlay
            overlay.clear()
            overlay.add(this)
            anchor.contentDescription = contentDescription
        }
    }

    private fun BadgeDrawable.setBoundsFor(anchor: View, parent: FrameLayout) {
        val rect = Rect()
        parent.getDrawingRect(rect)
        this.bounds = rect
        this.updateBadgeCoordinates(anchor, parent)
    }


    private const val NON_NUMERIC_BADGE = 0
}
