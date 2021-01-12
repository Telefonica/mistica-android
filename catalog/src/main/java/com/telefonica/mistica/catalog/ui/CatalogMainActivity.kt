package com.telefonica.mistica.catalog.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout


class CatalogMainActivity : AppCompatActivity() {

    @StyleRes
    private var themeOverride: Int? = null

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

        val styles: List<Pair<String, Int>> = listOf(
            "Movistar" to R.style.MisticaTheme_Movistar,
            "Movistar Priority" to R.style.MisticaTheme_Movistar_Prominent,
            "O2" to R.style.MisticaTheme_O2,
            "O2 Classic" to R.style.MisticaTheme_O2Classic,
            "Vivo" to R.style.MisticaTheme_Vivo
        )

        findViewById<DropDownInput>(R.id.drop_down_themes)?.apply {
            post {
                dropDown.setAdapter(
                    ArrayAdapter(
                        context,
                        R.layout.dropdown_menu_popup_item,
                        styles.map { it.first }
                    )
                )
                dropDown.onItemClickListener =
                    AdapterView.OnItemClickListener { _, _, position, _ ->
                        themeOverride = styles[position].second
                    }
            }
        }
    }

    data class SectionItem(
        val title: String,
        @DrawableRes val icon: Int,
        val sectionToOpen: Section
    )

    inner class SectionAdapter : RecyclerView.Adapter<SectionAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val item: ListRowView = view as ListRowView
        }

        private val sections: List<SectionItem> = listOf(
            SectionItem("Texts", R.drawable.ic_texts, Section.TEXTS),
            SectionItem("Buttons", R.drawable.ic_buttons, Section.BUTTONS),
            SectionItem("Inputs", R.drawable.ic_inputs, Section.INPUTS),
            SectionItem("Snackbars", R.drawable.ic_snackbars, Section.SNACKBARS),
            SectionItem("Feedbacks", R.drawable.ic_feedbacks, Section.FEEDBACKS),
            SectionItem(
                "Load Error Feedback",
                R.drawable.ic_load_feedback_error,
                Section.LOAD_ERROR_FEEDBACK
            ),
            SectionItem("PopOvers", R.drawable.ic_popovers, Section.POPOVERS),
            SectionItem("Badges", R.drawable.ic_badges, Section.BADGES),
            SectionItem(
                "Scroll Content indicator",
                R.drawable.ic_feedbacks,
                Section.SCROLL_CONTENT_INDICATOR
            ),
            SectionItem("Tags", R.drawable.ic_tags, Section.TAG),
            SectionItem("Lists", R.drawable.ic_lists, Section.LISTS),
            SectionItem("Media Card", R.drawable.ic_cards, Section.MEDIA_CARDS),
            SectionItem("Data Card", R.drawable.ic_cards, Section.DATA_CARDS),
            SectionItem("Highlighted Cards", R.drawable.ic_cards, Section.HIGHLIGHTED_CARDS),
            SectionItem("Headers", R.drawable.ic_header, Section.HEADERS),
            SectionItem("Controls", R.drawable.ic_controls, Section.CONTROLS),
            SectionItem("Others", R.drawable.ic_others, Section.OTHERS),
            SectionItem("Steppers", R.drawable.ic_stepper, Section.STEPPERS)
        )

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(this@CatalogMainActivity)
                    .inflate(R.layout.list_item_main_catalog, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val section = sections[position]
            with(holder.item) {
                setTitle(section.title)
                setOnClickListener {
                    Intent(this@CatalogMainActivity, ComponentCatalogActivity::class.java)
                        .putExtra(ComponentCatalogActivity.EXTRA_SECTION, section.sectionToOpen)
                        .apply {
                            themeOverride?.let {
                                putExtra(ComponentCatalogActivity.EXTRA_THEME, it)
                            }
                            context.startActivity(this)
                        }
                }
                setAssetType(TYPE_SMALL_ICON)
                setAssetResource(section.icon)
            }
        }

        override fun getItemCount(): Int {
            return sections.size
        }
    }
}
