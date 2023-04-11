package com.telefonica.mistica.catalog.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout

class CatalogMainActivity : AppCompatActivity() {

    @StyleRes
    private var classicThemeOverride: Int? = null
    private var composeThemeOverride: Brand = DEFAULT_COMPOSE_BRAND

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_catalog)

        with(findViewById<RecyclerView>(R.id.list_sections)) {
            configureWithFullWidthLayout()
            adapter = SectionAdapter()
        }
        configureThemeDropDown()
    }

    private fun configureThemeDropDown() {

        val styles: List<Triple<String, Int, Brand>> = listOf(
            Triple("Movistar", R.style.MisticaTheme_Movistar, MovistarBrand),
            Triple("O2", R.style.MisticaTheme_O2, O2Brand),
            Triple("Vivo", R.style.MisticaTheme_Vivo, VivoBrand),
            Triple("Telefonica", R.style.MisticaTheme_Telefonica, TelefonicaBrand),
            Triple("Blau", R.style.MisticaTheme_Blau, BlauBrand)
        )

        findViewById<DropDownInput>(R.id.drop_down_themes)?.apply {
            dropDown.setAdapter(
                DropDownInput.Adapter(
                    context,
                    R.layout.dropdown_menu_popup_item,
                    styles.map { it.first }
                )
            )
            dropDown.onItemClickListener =
                AdapterView.OnItemClickListener { _, _, position, _ ->
                    classicThemeOverride = styles[position].second
                    composeThemeOverride = styles[position].third
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
            SectionItem("Lists", R.drawable.ic_lists, Section.LISTS),
            SectionItem("Load Error Feedback", R.drawable.ic_load_feedback_error, Section.LOAD_ERROR_FEEDBACK),
            SectionItem("Media Card", R.drawable.ic_cards, Section.MEDIA_CARDS),
            SectionItem("Others", R.drawable.ic_others, Section.OTHERS),
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
                            classicThemeOverride?.let { putExtra(ComponentCatalogActivity.EXTRA_CLASSIC_THEME, it) }
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

    companion object {
        val DEFAULT_COMPOSE_BRAND = MovistarBrand
    }
}
