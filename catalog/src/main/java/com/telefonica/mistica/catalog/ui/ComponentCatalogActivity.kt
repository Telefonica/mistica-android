package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.fragment.BadgesCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ButtonsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.FeedbackScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.HeadersCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.InputsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ListsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.LoadErrorFeedbackCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.OthersCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.PopOverCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ScrollContentIndicatorCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.SnackBarCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TagsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TextsCatalogFragment
import java.io.Serializable

class ComponentCatalogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_component_catalog)

        val fragment: Fragment = when (intent.getSerializableExtra(EXTRA_SECTION)) {
            Section.BUTTONS -> ButtonsCatalogFragment()
            Section.TEXTS -> TextsCatalogFragment()
            Section.INPUTS -> InputsCatalogFragment()
            Section.SNACKBARS -> SnackBarCatalogFragment()
            Section.FEEDBACKS -> FeedbackScreenCatalogFragment()
            Section.LOAD_ERROR_FEEDBACK -> LoadErrorFeedbackCatalogFragment()
            Section.POPOVERS -> PopOverCatalogFragment()
            Section.BADGES -> BadgesCatalogFragment()
            Section.OTHERS -> OthersCatalogFragment()
            Section.SCROLL_CONTENT_INDICATOR -> ScrollContentIndicatorCatalogFragment()
            Section.TAG -> TagsCatalogFragment()
            Section.LISTS -> ListsCatalogFragment()
            Section.HEADERS -> HeadersCatalogFragment()
            else -> OthersCatalogFragment()
        }

        supportFragmentManager.beginTransaction().apply {
            add(R.id.catalog_container, fragment)
        }.commit()
    }

    companion object {
        const val EXTRA_SECTION = "extra_section"
    }
}

enum class Section {
    BUTTONS,
    TEXTS,
    INPUTS,
    SNACKBARS,
    FEEDBACKS,
    LOAD_ERROR_FEEDBACK,
    POPOVERS,
    BADGES,
    SCROLL_CONTENT_INDICATOR,
    TAG,
    LISTS,
    HEADERS,
    OTHERS
}