package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.link.TextLink

class TextLinkCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_text_link_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextLink>(R.id.single_link).apply {
            setSingleTextLink("Single link") {
                Toast.makeText(requireContext(), "Single link clicked!", Toast.LENGTH_SHORT).show()
            }
        }
        view.findViewById<TextLink>(R.id.single_link_inverse).apply {
            setSingleTextLink("Single link inverse") {
                Toast.makeText(requireContext(), "Single link inverse clicked!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
