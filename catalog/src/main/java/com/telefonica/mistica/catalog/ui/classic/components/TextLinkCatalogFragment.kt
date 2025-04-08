package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.link.MultiLink.DefaultMultiLink
import com.telefonica.mistica.link.SingleLink.DefaultSingleLink
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
            setSingleTextLink(
                originalText = "Single link", singleLink = DefaultSingleLink {
                    Toast.makeText(requireContext(), "Link clicked!", Toast.LENGTH_SHORT).show()
                })
        }
        view.findViewById<TextLink>(R.id.single_link_color).apply {
            setSingleTextLink(singleLink = DefaultSingleLink {
                Toast.makeText(requireContext(), "Link clicked!", Toast.LENGTH_SHORT).show()
            })
        }
        view.findViewById<TextLink>(R.id.single_link_style).apply {
            setSingleTextLink(singleLink = DefaultSingleLink {
                Toast.makeText(requireContext(), "Link clicked!", Toast.LENGTH_SHORT).show()
            })
        }
        view.findViewById<TextLink>(R.id.multi_link).apply {
            setMultiLinkText(
                originalText = "This a text showing first link and second link",
                links = listOf(
                    DefaultMultiLink(
                        linkedText = "first link",
                        onLinkTapped = { Toast.makeText(requireContext(), "First link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                    DefaultMultiLink(
                        linkedText = "second link",
                        onLinkTapped = { Toast.makeText(requireContext(), "Second link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                )
            )
        }
        view.findViewById<TextLink>(R.id.multi_link_color).apply {
            setMultiLinkText(
                links = listOf(
                    DefaultMultiLink(
                        linkedText = "first link",
                        onLinkTapped = { Toast.makeText(requireContext(), "First link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                    DefaultMultiLink(
                        linkedText = "second link",
                        onLinkTapped = { Toast.makeText(requireContext(), "Second link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                )
            )
        }
        view.findViewById<TextLink>(R.id.multi_link_style).apply {
            setMultiLinkText(
                links = listOf(
                    DefaultMultiLink(
                        linkedText = "first link",
                        onLinkTapped = { Toast.makeText(requireContext(), "First link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                    DefaultMultiLink(
                        linkedText = "second link",
                        onLinkTapped = { Toast.makeText(requireContext(), "Second link clicked!", Toast.LENGTH_SHORT).show() }
                    ),
                )
            )
        }
    }
}
