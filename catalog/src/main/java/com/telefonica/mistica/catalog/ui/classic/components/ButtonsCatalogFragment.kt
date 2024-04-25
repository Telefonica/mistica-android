package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.telefonica.mistica.button2.Button
import com.telefonica.mistica.button.ProgressButton
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.theme.gradient.MisticaCompatibilityGradient
import com.telefonica.mistica.theme.gradient.getThemeGradient

class ButtonsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_buttons_catalog, container, false).apply {
            findViewById<View>(R.id.inverse_buttons_container).background =
                context.getThemeGradient(MisticaCompatibilityGradient.BackgroundBrand)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listOf(
            R.id.primary_progress,
            R.id.primary_small_progress,
            R.id.secondary_progress,
            R.id.secondary_small_progress,
            R.id.danger_progress,
            R.id.danger_small_progress,
            R.id.primary_inverse_progress,
            R.id.primary_small_inverse_progress,
            R.id.secondary_inverse_progress,
            R.id.secondary_small_inverse_progress,
        )
            .map { view.findViewById<ProgressButton>(it) }
            .forEach { button ->
                button.setLoadingText("Loading")
                button.setOnClickListener {
                    button.showLoading()
                    button.postDelayed({ button.hideLoading() }, LOADING_TIME)
                }
            }

        listOf(
            R.id.link_progress,
            R.id.link_inverse_progress
        )
            .map { view.findViewById<Button>(it) }
            .forEach { button ->
                button.updateLoadingText("Loading")
                button.setOnClickListener {
                    button.showLoading()
                    button.postDelayed({ button.hideLoading() }, LOADING_TIME)
                }
            }

    }

    private companion object {
        const val LOADING_TIME = 2000L
    }
}