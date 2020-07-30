package com.telefonica.mistica.catalog.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.catalog.R

class CatalogMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_catalog)
        configureButtons()
    }

    private fun configureButtons() {
        configureButton(R.id.button_buttons, Section.BUTTONS)
        configureButton(R.id.button_texts, Section.TEXTS)
        configureButton(R.id.button_inputs, Section.INPUTS)
        configureButton(R.id.button_snackbars, Section.SNACKBARS)
        configureButton(R.id.button_feedbacks, Section.FEEDBACKS)
        configureButton(R.id.button_load_error_feedback, Section.LOAD_ERROR_FEEDBACK)
        configureButton(R.id.button_pop_overs, Section.POPOVERS)
        configureButton(R.id.button_badges, Section.BADGES)
        configureButton(R.id.button_scroll_content_indicator, Section.SCROLL_CONTENT_INDICATOR)
        configureButton(R.id.button_tags, Section.TAG)
        configureButton(R.id.button_lists, Section.LISTS)
        configureButton(R.id.button_headers, Section.HEADERS)
        configureButton(R.id.button_others, Section.OTHERS)
    }

    private fun configureButton(@IdRes buttonId: Int, sectionToOpen: Section) {
        findViewById<Button>(buttonId).setOnClickListener {
            Intent(this, ComponentCatalogActivity::class.java)
                .putExtra(ComponentCatalogActivity.EXTRA_SECTION, sectionToOpen)
                .let {
                    startActivity(it)
                }
        }
    }
}
