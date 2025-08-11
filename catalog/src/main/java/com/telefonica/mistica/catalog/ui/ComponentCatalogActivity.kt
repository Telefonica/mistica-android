@file:Suppress("DEPRECATION")

package com.telefonica.mistica.catalog.ui

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
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
import com.telefonica.mistica.catalog.ui.classic.components.TextLinkCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TextPresetsCatalogFragment
import com.telefonica.mistica.catalog.ui.classic.components.TitleCatalogFragment
import com.telefonica.mistica.catalog.ui.compose.common.CatalogBlauBrand
import com.telefonica.mistica.catalog.ui.compose.common.CatalogMovistarBrand
import com.telefonica.mistica.catalog.ui.compose.common.CatalogO2NewBrand
import com.telefonica.mistica.catalog.ui.compose.common.CatalogTelefonicaBrand
import com.telefonica.mistica.catalog.ui.compose.common.CatalogTuBrand
import com.telefonica.mistica.catalog.ui.compose.common.CatalogVivoNewBrand
import com.telefonica.mistica.catalog.ui.compose.common.ComponentComposeFragment
import com.telefonica.mistica.catalog.ui.compose.components.Badges
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
import com.telefonica.mistica.catalog.ui.compose.components.PopOvers
import com.telefonica.mistica.catalog.ui.compose.components.PosterCards
import com.telefonica.mistica.catalog.ui.compose.components.Skeletons
import com.telefonica.mistica.catalog.ui.compose.components.Steppers
import com.telefonica.mistica.catalog.ui.compose.components.TabsCatalog
import com.telefonica.mistica.catalog.ui.compose.components.Tags
import com.telefonica.mistica.catalog.ui.compose.components.TextLinks
import com.telefonica.mistica.catalog.ui.compose.components.Texts
import com.telefonica.mistica.catalog.ui.compose.components.Titles
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.BrandType
import com.telefonica.mistica.compose.theme.brand.BrandType.BLAU
import com.telefonica.mistica.compose.theme.brand.BrandType.MOVISTAR
import com.telefonica.mistica.compose.theme.brand.BrandType.O2_NEW
import com.telefonica.mistica.compose.theme.brand.BrandType.TELEFONICA
import com.telefonica.mistica.compose.theme.brand.BrandType.TU
import com.telefonica.mistica.compose.theme.brand.BrandType.VIVO_NEW

class ComponentCatalogActivity : AppCompatActivity() {

    private lateinit var binding: ScreenComponentCatalogBinding

    @StyleRes
    private var classicThemeOverride: Int = DEFAULT_CLASSIC_THEME
    private var composeThemeOverride: Brand = DEFAULT_COMPOSE_THEME

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setUpThemes()

        binding = ScreenComponentCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updatePadding(top = insets.top, bottom = insets.bottom)
            WindowInsetsCompat.CONSUMED
        }
        setUpViews()
        showComponentCatalog()
    }

    private fun showComponentCatalog() {
        val sections: Map<Section, () -> Unit> = mapOf(
            Section.TEXTS to ::setTextPresetsCatalogFragment,
            Section.TITLES to ::setTitleCatalogFragment,
            Section.BUTTONS to ::setButtonsCatalogFragment,
            Section.INPUTS to ::setInputsCatalogFragment,
            Section.SNACKBARS to ::setSnackBarCatalogFragment,
            Section.FEEDBACKS to { setSingleInputLauncher { Feedbacks(classicThemeOverride) } },
            Section.LOAD_ERROR_FEEDBACK to ::setErrorFeedbackCatalogFragment,
            Section.POPOVERS to ::setPopOverCatalogFragment,
            Section.BADGES to ::setBadgesCatalogFragment,
            Section.FILTERS to ::setFiltersCatalogFragment,
            Section.SCROLL_CONTENT_INDICATOR to ::setScrollContentIndicatorCatalogFragment,
            Section.TAG to ::setTagsCatalogFragment,
            Section.LISTS to ::setListsCatalogFragment,
            Section.MEDIA_CARDS to ::setMediaCardsFragment,
            Section.DATA_CARDS to ::setDataCardFragment,
            Section.HEADERS to ::setHeadersCatalogFragment,
            Section.HIGHLIGHTED_CARDS to ::setHighlightedCardsCatalogFragment,
            Section.CONTROLS to ::setControlsCatalogFragment,
            Section.STEPPERS to ::setSteppersCatalogFragment,
            Section.TABS to ::setTabsCatalogFragment,
            Section.EMPTY_STATE to ::setEmptyStateScreenCatalogFragment,
            Section.EMPTY_STATE_CARD to ::setEmptyStateCardCatalogFragment,
            Section.CALLOUTS to ::setCalloutsCatalogFragment,
            Section.SHEET to ::setSheetCatalogFragment,
            Section.CAROUSEL to ::setCarouselFragment,
            Section.SKELETON to ::setSkeletonFragment,
            Section.POSTER_CARD to ::setPosterCardFragment,
            Section.LINKS to ::setTextLinkCatalogFragment,
        )

        val section = intent.getSerializableExtra(EXTRA_SECTION) as? Section
        sections[section]?.invoke() ?: setFiltersCatalogFragment()
    }

    private fun setSkeletonFragment() {
        setPageAdapterWithTabs(
            classicComponent = null,
            composeComponent = { Skeletons() })
    }

    private fun setCarouselFragment() {
        setPageAdapterWithTabs(
            classicComponent = CarouselFragment(),
            composeComponent = { Carousels() })
    }

    private fun setSheetCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = SheetCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setCalloutsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = CalloutsCatalogFragment(),
            composeComponent = { Callouts() })
    }

    private fun setEmptyStateCardCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = EmptyStateCardCatalogFragment(),
            composeComponent = { EmptyStateCards() })
    }

    private fun setEmptyStateScreenCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = EmptyStateScreenCatalogFragment(classicThemeOverride),
            composeComponent = { EmptyStateScreens() })
    }

    private fun setTabsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = TabsCatalogFragment(),
            composeComponent = { TabsCatalog() })
    }

    private fun setSteppersCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = SteppersCatalogFragment(),
            composeComponent = { Steppers() })
    }

    private fun setControlsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = ControlsCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setHighlightedCardsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = HighlightedCardsCatalogFragment(),
            composeComponent = { HighlightedCards() })
    }

    private fun setHeadersCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = HeadersCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setDataCardFragment() {
        setPageAdapterWithTabs(
            classicComponent = DataCardFragment(),
            composeComponent = { DataCards() })
    }

    private fun setPosterCardFragment() {
        setPageAdapterWithTabs(
            classicComponent = null,
            composeComponent = { PosterCards() })
    }

    private fun setMediaCardsFragment() {
        setPageAdapterWithTabs(
            classicComponent = MediaCardsFragment(),
            composeComponent = { MediaCards() })
    }

    private fun setListsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = ListsCatalogFragment(),
            composeComponent = { Lists() })
    }

    private fun setTagsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = TagsCatalogFragment(),
            composeComponent = { Tags() })
    }

    private fun setScrollContentIndicatorCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = ScrollContentIndicatorCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setFiltersCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = FiltersCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setBadgesCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = BadgesCatalogFragment(),
            composeComponent = { Badges() }
        )
    }

    private fun setPopOverCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = PopOverCatalogFragment(),
            composeComponent = { PopOvers() }
        )
    }

    private fun setErrorFeedbackCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = LoadErrorFeedbackCatalogFragment(),
            composeComponent = { LoadErrorFeedbacks() })
    }

    private fun setSnackBarCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = SnackBarCatalogFragment(),
            composeComponent = null
        )
    }

    private fun setInputsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = InputsCatalogFragment(),
            composeComponent = { Inputs() })
    }

    private fun setButtonsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = ButtonsCatalogFragment(),
            composeComponent = { Buttons() })
    }

    private fun setTitleCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = TitleCatalogFragment(),
            composeComponent = { Titles() })
    }

    private fun setTextPresetsCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = TextPresetsCatalogFragment(),
            composeComponent = { Texts() })
    }

    private fun setTextLinkCatalogFragment() {
        setPageAdapterWithTabs(
            classicComponent = TextLinkCatalogFragment(),
            composeComponent = { TextLinks() }
        )
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
            MOVISTAR -> CatalogMovistarBrand
            VIVO_NEW -> CatalogVivoNewBrand
            TELEFONICA -> CatalogTelefonicaBrand
            BLAU -> CatalogBlauBrand
            TU -> CatalogTuBrand
            O2_NEW -> CatalogO2NewBrand
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
    SKELETON,
    POSTER_CARD,
    LINKS,
}
