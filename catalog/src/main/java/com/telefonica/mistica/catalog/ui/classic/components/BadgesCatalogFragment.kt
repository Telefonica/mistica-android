package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.telefonica.mistica.badge.Badge
import com.telefonica.mistica.catalog.R
import kotlin.random.Random

class BadgesCatalogFragment : Fragment() {

    private var badgeVisible: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_badges_catalog, container, false).apply {
            configureButtons()
        }
    }

    private fun View.configureButtons() {
        val imageView = findViewById<ImageView>(R.id.imageView)
        val imageContainer = findViewById<FrameLayout>(R.id.image_badge_parent)
        findViewById<Button>(R.id.button_add_non_numeric_badge).apply {
            setOnClickListener {
                if (!badgeVisible) {
                    Badge.showBadgeIn(imageView, imageContainer)
                } else {
                    Badge.removeBadge(imageView)
                }
                badgeVisible = !badgeVisible
            }
        }
        findViewById<Button>(R.id.button_add_numeric_badge).apply {
            setOnClickListener {
                if (!badgeVisible) {
                    Badge.showNumericBadgeIn(imageView, imageContainer, Random(System.currentTimeMillis()).nextInt(1, 11))
                } else {
                    Badge.removeBadge(imageView)
                }
                badgeVisible = !badgeVisible
            }
        }
        findViewById<Button>(R.id.button_remove_badge_if_numeric_with_count_zero).apply {
            setOnClickListener {
                Badge.showNumericBadgeIn(imageView, imageContainer, 0)
                badgeVisible = false
            }
        }
    }
}