package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import androidx.annotation.StyleRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.telefonica.mistica.catalog.databinding.ScreenComponentCatalogBinding
import com.telefonica.mistica.catalog.ui.classic.components.BadgesCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ButtonsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.CalloutsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.CarouselFragment
import com.telefonica.mistica.catalog.ui.classic.components.ControlsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.DataCardFragment
import com.telefonica.mistica.catalog.ui.classic.components.EmptyStateCardCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.EmptyStateScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.FeedbackScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.HeadersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.HighlightedCardsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.InputsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ListsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.LoadErrorFeedbackCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.MediaCardsFragment
import com.telefonica.mistica.catalog.ui.classic.components.OthersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.PopOverCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ScrollContentIndicatorCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SheetCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SnackBarCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SteppersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TabsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TagsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TextPresetsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TitleCatalogFragment
import com.telefonica.mistica.catalog.ui.compose.components.ButtonsComposeFragment

class ComponentCatalogActivity : FragmentActivity() {

    private lateinit var binding: ScreenComponentCatalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        @StyleRes
        val themeOverride: Int? =
            intent.getIntExtra(EXTRA_THEME, NO_THEME_OVERRIDE).takeIf { it != NO_THEME_OVERRIDE }

        themeOverride?.let {
            setTheme(it)
        }

        super.onCreate(savedInstanceState)

        binding = ScreenComponentCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.componentViewPager.apply {
            offscreenPageLimit = 2
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    binding.componentTabs.getTabAt(position)?.select()
                }
            })
            adapter = ComponentPageAdapter(listOf(ButtonsCatalogFragment(), ButtonsComposeFragment()), this@ComponentCatalogActivity)
        }

        binding.componentTabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let { binding.componentViewPager.currentItem = tab.position }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        when (intent.getSerializableExtra(EXTRA_SECTION)) {
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
            Section.SHEET -> SheetCatalogFragment()
            Section.CAROUSEL -> CarouselFragment()
            else -> OthersCatalogFragment()
        }

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (binding.componentViewPager.currentItem == 0) {
            finish()
        } else {
            binding.componentViewPager.currentItem = binding.componentViewPager.currentItem - 1
        }
    }

    companion object {
        const val EXTRA_SECTION = "extra_section"
        const val EXTRA_THEME = "extra_theme"

        private const val NO_THEME_OVERRIDE = -1

        private const val CLASSIC_TAB_POS = 0
        private const val COMPOSE_TAB_POS = 1
    }
}

class ComponentPageAdapter(private val fragmentList: List<Fragment>, fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment = fragmentList[position]
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
    SHEET,
    CAROUSEL,
}
