@file:Suppress("DEPRECATION")

package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.StyleRes
import androidx.compose.runtime.Composable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.telefonica.mistica.catalog.databinding.ScreenComponentCatalogBinding
import com.telefonica.mistica.catalog.ui.CatalogMainActivity.Companion.DEFAULT_BRAND_TYPE
import com.telefonica.mistica.catalog.ui.CatalogMainActivity.Companion.DEFAULT_CLASSIC_THEME
import com.telefonica.mistica.catalog.ui.CatalogMainActivity.Companion.DEFAULT_COMPOSE_THEME
import com.telefonica.mistica.catalog.ui.classic.components.BadgesCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ButtonsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.CalloutsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.CarouselFragment
import com.telefonica.mistica.catalog.ui.classic.components.ControlsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.DataCardFragment
import com.telefonica.mistica.catalog.ui.classic.components.EmptyStateCardCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.EmptyStateScreenCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.FiltersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.HeadersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.HighlightedCardsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.InputsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ListsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.LoadErrorFeedbackCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.MediaCardsFragment
import com.telefonica.mistica.catalog.ui.classic.components.PopOverCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.ScrollContentIndicatorCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SheetCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SnackBarCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.SteppersCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TabsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TagsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TextPresetsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TitleCatalogFragment
import com.telefonica.mistica.catalog.ui.compose.common.ComponentComposeFragment
import com.telefonica.mistica.catalog.ui.compose.components.Buttons
import com.telefonica.mistica.catalog.ui.compose.components.Callouts
import com.telefonica.mistica.catalog.ui.compose.components.Carousels
import com.telefonica.mistica.catalog.ui.compose.components.DataCards
import com.telefonica.mistica.catalog.ui.compose.components.EmptyStateCards
import com.telefonica.mistica.catalog.ui.compose.components.EmptyStateScreens
import com.telefonica.mistica.catalog.ui.compose.components.Feedbacks
import com.telefonica.mistica.catalog.ui.compose.components.HighlightedCards
import com.telefonica.mistica.catalog.ui.compose.components.Inputs
import com.telefonica.mistica.catalog.ui.compose.components.Lists
import com.telefonica.mistica.catalog.ui.compose.components.LoadErrorFeedbacks
import com.telefonica.mistica.catalog.ui.compose.components.MediaCards
import com.telefonica.mistica.catalog.ui.compose.components.Steppers
import com.telefonica.mistica.catalog.ui.compose.components.TabsCatalog
import com.telefonica.mistica.catalog.ui.compose.components.Tags
import com.telefonica.mistica.catalog.ui.compose.components.Texts
import com.telefonica.mistica.catalog.ui.compose.components.Titles
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.BrandType
import com.telefonica.mistica.compose.theme.brand.BrandType.*
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.compose.theme.brand.VivoNewBrand

class ComponentCatalogActivity : FragmentActivity() {

    private lateinit var binding: ScreenComponentCatalogBinding

    @StyleRes
    private var classicThemeOverride: Int = DEFAULT_CLASSIC_THEME
    private var composeThemeOverride: Brand = DEFAULT_COMPOSE_THEME

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpThemes()

        binding = ScreenComponentCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViews()
        showComponentCatalog()
    }

    private fun showComponentCatalog() {
        when (intent.getSerializableExtra(EXTRA_SECTION)) {
            Section.TEXTS -> setPageAdapterWithTabs(
                classicComponent = TextPresetsCatalogFragment(),
                composeComponent = { Texts() })

            Section.TITLES -> setPageAdapterWithTabs(
                classicComponent = TitleCatalogFragment(),
                composeComponent = { Titles() })

            Section.BUTTONS -> setPageAdapterWithTabs(
                classicComponent = ButtonsCatalogFragment(),
                composeComponent = { Buttons() })

            Section.INPUTS -> setPageAdapterWithTabs(
                classicComponent = InputsCatalogFragment(),
                composeComponent = { Inputs() })

            Section.SNACKBARS -> setPageAdapterWithTabs(
                classicComponent = SnackBarCatalogFragment(),
                composeComponent = null
            )

            Section.FEEDBACKS -> setSingleInputLauncher { Feedbacks(classicThemeOverride) }

            Section.LOAD_ERROR_FEEDBACK -> setPageAdapterWithTabs(
                classicComponent = LoadErrorFeedbackCatalogFragment(),
                composeComponent = { LoadErrorFeedbacks() })

            Section.POPOVERS -> setPageAdapterWithTabs(
                classicComponent = PopOverCatalogFragment(),
                composeComponent = null
            )

            Section.BADGES -> setPageAdapterWithTabs(
                classicComponent = BadgesCatalogFragment(),
                composeComponent = null
            )

            Section.FILTERS -> setPageAdapterWithTabs(
                classicComponent = FiltersCatalogFragment(),
                composeComponent = null
            )

            Section.SCROLL_CONTENT_INDICATOR -> setPageAdapterWithTabs(
                classicComponent = ScrollContentIndicatorCatalogFragment(),
                composeComponent = null
            )

            Section.TAG -> setPageAdapterWithTabs(
                classicComponent = TagsCatalogFragment(),
                composeComponent = { Tags() })

            Section.LISTS -> setPageAdapterWithTabs(
                classicComponent = ListsCatalogFragment(),
                composeComponent = { Lists() })

            Section.MEDIA_CARDS -> setPageAdapterWithTabs(
                classicComponent = MediaCardsFragment(),
                composeComponent = { MediaCards() })

            Section.DATA_CARDS -> setPageAdapterWithTabs(
                classicComponent = DataCardFragment(),
                composeComponent = { DataCards() })

            Section.HEADERS -> setPageAdapterWithTabs(
                classicComponent = HeadersCatalogFragment(),
                composeComponent = null
            )

            Section.HIGHLIGHTED_CARDS -> setPageAdapterWithTabs(
                classicComponent = HighlightedCardsCatalogFragment(),
                composeComponent = { HighlightedCards() })

            Section.CONTROLS -> setPageAdapterWithTabs(
                classicComponent = ControlsCatalogFragment(),
                composeComponent = null
            )

            Section.STEPPERS -> setPageAdapterWithTabs(
                classicComponent = SteppersCatalogFragment(),
                composeComponent = { Steppers() })

            Section.TABS -> setPageAdapterWithTabs(
                classicComponent = TabsCatalogFragment(),
                composeComponent = { TabsCatalog() })

            Section.EMPTY_STATE -> setPageAdapterWithTabs(
                classicComponent = EmptyStateScreenCatalogFragment(classicThemeOverride),
                composeComponent = { EmptyStateScreens() })

            Section.EMPTY_STATE_CARD -> setPageAdapterWithTabs(
                classicComponent = EmptyStateCardCatalogFragment(),
                composeComponent = { EmptyStateCards() })

            Section.CALLOUTS -> setPageAdapterWithTabs(
                classicComponent = CalloutsCatalogFragment(),
                composeComponent = { Callouts() })

            Section.SHEET -> setPageAdapterWithTabs(
                classicComponent = SheetCatalogFragment(),
                composeComponent = null
            )

            Section.CAROUSEL -> setPageAdapterWithTabs(
                classicComponent = CarouselFragment(),
                composeComponent = { Carousels() })

            else -> setPageAdapterWithTabs(
                classicComponent = FiltersCatalogFragment(),
                composeComponent = null
            )
        }
    }

    private fun setPageAdapterWithTabs(classicComponent: Fragment?, composeComponent: (@Composable () -> Unit)?) {
        binding.tabLayoutViewGroup.visibility = View.VISIBLE
        if (classicComponent == null && composeComponent == null) throw ExceptionInInitializerError("At least one of the components must be not null.")

        val adapterList: List<Fragment> = buildList {
            if (classicComponent != null) add(classicComponent)
            else binding.componentTabs.removeTabAt(CLASSIC_TAB_POS)

            if (composeComponent != null) add(ComponentComposeFragment(composeThemeOverride, composeComponent))
            else binding.componentTabs.removeTabAt(COMPOSE_TAB_POS)
        }

        binding.componentViewPager.adapter = ComponentPageAdapter(adapterList, this)
    }

    private fun setSingleInputLauncher(
        component: (@Composable () -> Unit),
    ) {
        binding.singleInputOptions.visibility = View.VISIBLE
        binding.singleInputOptions.setContent {
            MisticaTheme(composeThemeOverride) {
                component()
            }
        }
    }

    private fun setUpThemes() {
        classicThemeOverride = intent.getIntExtra(EXTRA_CLASSIC_THEME, DEFAULT_CLASSIC_THEME)
        composeThemeOverride = when ((intent.getSerializableExtra(EXTRA_COMPOSE_THEME) ?: DEFAULT_BRAND_TYPE) as BrandType) {
            MOVISTAR -> MovistarBrand
            O2 -> O2Brand
            VIVO -> VivoBrand
            VIVO_NEW -> VivoNewBrand
            TELEFONICA -> TelefonicaBrand
            BLAU -> BlauBrand
        }

        setTheme(classicThemeOverride)
    }

    private fun setUpViews() {
        binding.componentViewPager.apply {
            offscreenPageLimit = 2
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    binding.componentTabs.getTabAt(position)?.select()
                }
            })
        }

        binding.componentTabs.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let { binding.componentViewPager.currentItem = tab.position }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }

    companion object {
        const val EXTRA_SECTION = "extra_section"
        const val EXTRA_CLASSIC_THEME = "extra_classic_theme"
        const val EXTRA_COMPOSE_THEME = "extra_compose_theme"

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
    FILTERS,
    STEPPERS,
    TABS,
    EMPTY_STATE,
    EMPTY_STATE_CARD,
    CALLOUTS,
    SHEET,
    CAROUSEL,
}

