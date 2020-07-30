package com.telefonica.mistica.catalog.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout

class CatalogMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_catalog)

        with(findViewById<RecyclerView>(R.id.list_sections)) {
            configureWithFullWidthLayout()
            adapter = SectionAdapter()
        }
    }

    class SectionAdapter : RecyclerView.Adapter<SectionAdapter.ViewHolder>() {

        private val sections: List<Pair<String, Section>> = listOf(
            "Buttons" to Section.BUTTONS,
            "Inputs" to Section.INPUTS,
            "Snackbars" to Section.SNACKBARS,
            "Feedbacks" to Section.FEEDBACKS,
            "Load Error Feedback" to Section.LOAD_ERROR_FEEDBACK,
            "PopOvers" to Section.POPOVERS,
            "Badges" to Section.BADGES,
            "Scroll Content indicator" to Section.SCROLL_CONTENT_INDICATOR,
            "Tag" to Section.TAG,
            "Lists" to Section.LISTS,
            "Headers" to Section.HEADERS,
            "Others" to Section.OTHERS
        )

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val item: ListRowView = view as ListRowView
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.list_item_main_catalog, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val section = sections[position]
            with(holder.item) {
                setTitle(section.first)
                setOnClickListener {
                    Intent(context, ComponentCatalogActivity::class.java)
                        .putExtra(ComponentCatalogActivity.EXTRA_SECTION, section.second)
                        .let {
                            context.startActivity(it)
                        }
                }
            }
        }

        override fun getItemCount(): Int {
            return sections.size
        }
    }
}
