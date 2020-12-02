package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        findViewById<Button>(R.id.button_add_to_image_view).apply {
            setOnClickListener {
                if (!badgeVisible) {
                    Badge.showBadgeIn(imageView)
                } else {
                    Badge.removeBadge(imageView)
                }
                badgeVisible = !badgeVisible
            }
        }
        findViewById<Button>(R.id.button_add_to_image_view_number).apply {
            setOnClickListener {
                if (!badgeVisible) {
                    Badge.showBadgeIn(imageView, Random(System.currentTimeMillis()).nextInt(1, 11))
                } else {
                    Badge.removeBadge(imageView)
                }
                badgeVisible = !badgeVisible
            }
        }
        findViewById<Button>(R.id.button_hide_badge_when_count_zero).apply {
            setOnClickListener {
                Badge.showBadgeIn(imageView, 0)
                badgeVisible = false
            }
        }
    }
}