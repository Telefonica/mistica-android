package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R

class ControlsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_controls_catalog, container, false)
    }
}