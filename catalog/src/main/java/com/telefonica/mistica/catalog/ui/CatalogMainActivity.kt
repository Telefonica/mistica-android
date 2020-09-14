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
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.distribute.Distribute
import com.telefonica.mistica.catalog.BuildConfig
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout


class CatalogMainActivity : AppCompatActivity() {

    @StyleRes
    private var themeOverride: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_catalog)
        initializeAppCenterIfNeeded()

        with(findViewById<RecyclerView>(R.id.list_sections)) {
            configureWithFullWidthLayout()
            adapter = SectionAdapter()
        }
        configureThemeDropDown()
    }

    private fun initializeAppCenterIfNeeded() {
        if (!BuildConfig.APPCENTER_KEY.isNullOrEmpty() && BuildConfig.APPCENTER_KEY != "null") {
            AppCenter.start(
                application, BuildConfig.APPCENTER_KEY,
                Distribute::class.java, Analytics::class.java, Crashes::class.java
            )
            Distribute.setEnabledForDebuggableBuild(true)
        }
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
            SectionItem("Headers", R.drawable.ic_headers, Section.HEADERS),
            SectionItem("Highlighted Cards", R.drawable.ic_cards, Section.HIGHLIGHTED_CARDS),
            SectionItem("Others", R.drawable.ic_others, Section.OTHERS)
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
                setAssetResource(section.icon)
                setSmallAsset(true)
            }
        }

        override fun getItemCount(): Int {
            return sections.size
        }
    }
}
