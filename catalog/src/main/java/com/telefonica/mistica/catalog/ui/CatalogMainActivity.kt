package com.telefonica.mistica.catalog.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.theme.brand.BrandType
import com.telefonica.mistica.compose.theme.brand.BrandType.BLAU
import com.telefonica.mistica.compose.theme.brand.BrandType.MOVISTAR
import com.telefonica.mistica.compose.theme.brand.BrandType.O2_NEW
import com.telefonica.mistica.compose.theme.brand.BrandType.TELEFONICA
import com.telefonica.mistica.compose.theme.brand.BrandType.TU
import com.telefonica.mistica.compose.theme.brand.BrandType.VIVO_NEW
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout

class CatalogMainActivity : AppCompatActivity() {

    @StyleRes
    private var classicThemeOverride: Int = DEFAULT_CLASSIC_THEME
    private var composeThemeOverride: BrandType = DEFAULT_BRAND_TYPE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_catalog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { view, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updatePadding(top = insets.top, bottom = insets.bottom)
            WindowInsetsCompat.CONSUMED
        }

        with(findViewById<RecyclerView>(R.id.list_sections)) {
            configureWithFullWidthLayout()
            adapter = SectionAdapter()
        }
        configureThemeDropDown()
    }

    private fun configureThemeDropDown() {

        val styles: List<ComponentStyle> = listOf(
            ComponentStyle("Movistar", R.style.CatalogMovistar, MOVISTAR),
            ComponentStyle("Vivo New", R.style.CatalogVivoNew, VIVO_NEW),
            ComponentStyle("Telefonica", R.style.CatalogTelefonica, TELEFONICA),
            ComponentStyle("Blau", R.style.CatalogBlau, BLAU),
            ComponentStyle("Tu", R.style.CatalogTu, TU),
            ComponentStyle("O2New", R.style.CatalogO2New, O2_NEW),
        )

        findViewById<DropDownInput>(R.id.drop_down_themes)?.apply {
            dropDown.setAdapter(
                DropDownInput.Adapter(
                    context,
                    R.layout.dropdown_menu_popup_item,
                    styles.map { it.styleName }
                )
            )

            dropDown.onItemClickListener =
                AdapterView.OnItemClickListener { _, _, position, _ ->
                    classicThemeOverride = styles[position].classicStyle
                    composeThemeOverride = styles[position].composeStyle
                }
        }
    }

    data class SectionItem(
        val title: String,
        @DrawableRes val icon: Int,
        val sectionToOpen: Section,
    )

    inner class SectionAdapter : RecyclerView.Adapter<SectionAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val item: ListRowView = view as ListRowView
        }

        private val sections: List<SectionItem> = listOf(
            SectionItem("Badges", R.drawable.ic_badges, Section.BADGES),
            SectionItem("Buttons", R.drawable.ic_buttons, Section.BUTTONS),
            SectionItem("Callouts", R.drawable.ic_callout, Section.CALLOUTS),
            SectionItem("Controls", R.drawable.ic_controls, Section.CONTROLS),
            SectionItem("Data Card", R.drawable.ic_cards, Section.DATA_CARDS),
            SectionItem("Empty State", R.drawable.ic_empty_states, Section.EMPTY_STATE),
            SectionItem("Empty State Card", R.drawable.ic_empty_states, Section.EMPTY_STATE_CARD),
            SectionItem("Feedbacks", R.drawable.ic_feedbacks, Section.FEEDBACKS),
            SectionItem("Headers", R.drawable.ic_header, Section.HEADERS),
            SectionItem("Highlighted Cards", R.drawable.ic_cards, Section.HIGHLIGHTED_CARDS),
            SectionItem("Inputs", R.drawable.ic_inputs, Section.INPUTS),
            SectionItem("Links", R.drawable.ic_links, Section.LINKS),
            SectionItem("Lists", R.drawable.ic_lists, Section.LISTS),
            SectionItem("Load Error Feedback", R.drawable.ic_load_feedback_error, Section.LOAD_ERROR_FEEDBACK),
            SectionItem("Media Card", R.drawable.ic_cards, Section.MEDIA_CARDS),
            SectionItem("Poster Card", R.drawable.ic_cards, Section.POSTER_CARD),
            SectionItem("Filters", R.drawable.ic_filters, Section.FILTERS),
            SectionItem("PopOvers", R.drawable.ic_popovers, Section.POPOVERS),
            SectionItem("Scroll Content indicator", R.drawable.ic_feedbacks, Section.SCROLL_CONTENT_INDICATOR),
            SectionItem("Steppers", R.drawable.ic_stepper, Section.STEPPERS),
            SectionItem("Snackbars", R.drawable.ic_snackbars, Section.SNACKBARS),
            SectionItem("Tabs", R.drawable.ic_tab, Section.TABS),
            SectionItem("Tags", R.drawable.ic_tags, Section.TAG),
            SectionItem("Texts", R.drawable.ic_texts, Section.TEXTS),
            SectionItem("Titles", R.drawable.ic_texts, Section.TITLES),
            SectionItem("Sheet", R.drawable.ic_sheets, Section.SHEET),
            SectionItem("Carousel", R.drawable.ic_cards, Section.CAROUSEL),
            SectionItem("Skeletons", R.drawable.ic_lists, Section.SKELETON),
        )
            .sortedBy { it.title }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(
                LayoutInflater.from(this@CatalogMainActivity)
                    .inflate(R.layout.list_item_main_catalog, parent, false)
            )

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val section = sections[position]
            with(holder.item) {
                setTitle(section.title)
                setOnClickListener {
                    Intent(this@CatalogMainActivity, ComponentCatalogActivity::class.java)
                        .putExtra(ComponentCatalogActivity.EXTRA_SECTION, section.sectionToOpen)
                        .apply {
                            putExtra(ComponentCatalogActivity.EXTRA_CLASSIC_THEME, classicThemeOverride)
                            putExtra(ComponentCatalogActivity.EXTRA_COMPOSE_THEME, composeThemeOverride)
                            context.startActivity(this)
                        }
                }
                setAssetType(TYPE_SMALL_ICON)
                setAssetResource(section.icon)
            }
        }

        override fun getItemCount(): Int = sections.size
    }

    private data class ComponentStyle(val styleName: String, @StyleRes val classicStyle: Int, val composeStyle: BrandType)

    companion object {
        val DEFAULT_BRAND_TYPE = TELEFONICA
        val DEFAULT_CLASSIC_THEME = R.style.MisticaTheme_Telefonica
        val DEFAULT_COMPOSE_THEME = MovistarBrand
    }
}
