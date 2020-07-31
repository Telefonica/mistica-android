package com.telefonica.mistica.catalog.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.contentindicator.ScrollContentIndicator
import com.telefonica.mistica.catalog.R

class ScrollContentIndicatorCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.screen_scroll_content_indicator_catalog, container, false)

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val scrollContentIndicator =
            view.findViewById<ScrollContentIndicator>(R.id.scrollContentIndicator)
        val showHideButton = view.findViewById<Button>(R.id.showHide)

        showHideButton.setOnClickListener {
            when (scrollContentIndicator.visibility) {
                View.VISIBLE -> {
                    showHideButton.text = "Show"
                    scrollContentIndicator.visibility = View.GONE
                }
                View.GONE -> {
                    showHideButton.text = "Hide"
                    scrollContentIndicator.visibility = View.VISIBLE
                }
            }
        }
    }
}