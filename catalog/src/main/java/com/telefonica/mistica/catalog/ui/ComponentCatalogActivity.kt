package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.fragment.BadgesCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.BottomSheetCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ButtonsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.CalloutsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ControlsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.DataCardFragment
import com.telefonica.mistica.catalog.ui.fragment.EmptyStateCardCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.EmptyStateScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.FeedbackScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.HeadersCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.HighlightedCardsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.InputsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ListsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.LoadErrorFeedbackCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.MediaCardsFragment
import com.telefonica.mistica.catalog.ui.fragment.OthersCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.PopOverCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.ScrollContentIndicatorCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.SnackBarCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.SteppersCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TabsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TagsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TextPresetsCatalogFragment
import com.telefonica.mistica.catalog.ui.fragment.TitleCatalogFragment

class ComponentCatalogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        @StyleRes
        val themeOverride: Int? =
            intent.getIntExtra(EXTRA_THEME, NO_THEME_OVERRIDE).takeIf { it != NO_THEME_OVERRIDE }

        themeOverride?.let {
            setTheme(it)
        }

        super.onCreate(savedInstanceState)

        setContentView(R.layout.screen_component_catalog)

        val fragment: Fragment = when (intent.getSerializableExtra(EXTRA_SECTION)) {
            Section.TEXTS -> TextPresetsCatalogFragment()
            Section.TITLES -> TitleCatalogFragment()
            Section.BUTTONS -> ButtonsCatalogFragment()
            Section.INPUTS -> InputsCatalogFragment()
            Section.SNACKBARS -> SnackBarCatalogFragment()
            Section.FEEDBACKS -> FeedbackScreenCatalogFragment(themeOverride)
            Section.LOAD_ERROR_FEEDBACK -> LoadErrorFeedbackCatalogFragment()
            Section.POPOVERS -> PopOverCatalogFragment()
            Section.BADGES -> BadgesCatalogFragment()
            Section.OTHERS -> OthersCatalogFragment()
            Section.SCROLL_CONTENT_INDICATOR -> ScrollContentIndicatorCatalogFragment()
            Section.TAG -> TagsCatalogFragment()
            Section.LISTS -> ListsCatalogFragment()
            Section.MEDIA_CARDS -> MediaCardsFragment()
            Section.DATA_CARDS -> DataCardFragment()
            Section.HEADERS -> HeadersCatalogFragment()
            Section.HIGHLIGHTED_CARDS -> HighlightedCardsCatalogFragment()
            Section.CONTROLS -> ControlsCatalogFragment()
            Section.STEPPERS -> SteppersCatalogFragment()
            Section.TABS -> TabsCatalogFragment()
            Section.EMPTY_STATE -> EmptyStateScreenCatalogFragment(themeOverride)
            Section.EMPTY_STATE_CARD -> EmptyStateCardCatalogFragment()
            Section.CALLOUTS -> CalloutsCatalogFragment()
            Section.BOTTOM_SHEET -> BottomSheetCatalogFragment()
            else -> OthersCatalogFragment()
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.catalog_container, fragment)
        }.commit()
    }

    companion object {
        const val EXTRA_SECTION = "extra_section"
        const val EXTRA_THEME = "extra_theme"

        private const val NO_THEME_OVERRIDE = -1
    }
}

enum class Section {
    TEXTS,
    TITLES,
    BUTTONS,
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
    HIGHLIGHTED_CARDS,
    MEDIA_CARDS,
    DATA_CARDS,
    CONTROLS,
    OTHERS,
    STEPPERS,
    TABS,
    EMPTY_STATE,
    EMPTY_STATE_CARD,
    CALLOUTS,
    BOTTOM_SHEET,
}
