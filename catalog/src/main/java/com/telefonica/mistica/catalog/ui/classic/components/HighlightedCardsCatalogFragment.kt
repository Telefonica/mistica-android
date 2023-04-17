package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.highlightedcard.HighlightedCardView
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class HighlightedCardsCatalogFragment : Fragment() {

    private var buttonStyle: Int = HighlightedCardView.BUTTON_STYLE_NO_BUTTON
    private var imageStyle: Int = HighlightedCardView.IMAGE_STYLE_NO_IMAGE

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.highlighted_cards_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_update)
            .setOnClickListener { updateHighlightedCardView(view) }
        configureButtonDropdown(view)
        configureImageDropdown(view)
        updateHighlightedCardView(view)
    }

    private fun configureImageDropdown(view: View) {
        val imageTypes: List<Pair<String, Int>> = listOf(
            "Fit" to HighlightedCardView.IMAGE_STYLE_MODE_FIT,
            "Fill" to HighlightedCardView.IMAGE_STYLE_MODE_FILL,
            "No image" to HighlightedCardView.IMAGE_STYLE_NO_IMAGE
        )
        with(view.findViewById<DropDownInput>(R.id.dropdown_image_type)) {
            post {
                dropDown.setAdapter(
                    ArrayAdapter(
                        context,
                        R.layout.dropdown_menu_popup_item,
                        imageTypes.map { it.first }
                    )
                )
                dropDown.onItemClickListener =
                    AdapterView.OnItemClickListener { _, _, position, _ ->
                        imageStyle = imageTypes[position].second
                    }
            }
        }
    }

    private fun configureButtonDropdown(view: View) {
        val buttonTypes: List<Pair<String, Int>> = listOf(
            "Primary" to HighlightedCardView.BUTTON_STYLE_PRIMARY,
            "Secondary" to HighlightedCardView.BUTTON_STYLE_SECONDARY,
            "Link" to HighlightedCardView.BUTTON_STYLE_LINK,
            "No button" to HighlightedCardView.BUTTON_STYLE_NO_BUTTON
        )
        with(view.findViewById<DropDownInput>(R.id.dropdown_button_type)) {
            post {
                dropDown.setAdapter(
                    DropDownInput.Adapter(
                        context,
                        R.layout.dropdown_menu_popup_item,
                        buttonTypes.map { it.first }
                    )
                )
                dropDown.onItemClickListener =
                    AdapterView.OnItemClickListener { _, _, position, _ ->
                        buttonStyle = buttonTypes[position].second
                    }
            }
        }
    }

    private fun updateHighlightedCardView(view: View) {
        with(view.findViewById<HighlightedCardView>(R.id.highlighted_card_view)) {
            when (imageStyle) {
                HighlightedCardView.IMAGE_STYLE_MODE_FIT -> setImage(R.drawable.higlighted_card_image)
                HighlightedCardView.IMAGE_STYLE_MODE_FILL -> setImage(R.drawable.highlighted_card_fill_mode_example)
            }
            setImageStyle(imageStyle)
            setInverse(view.findViewById<CheckBoxInput>(R.id.check_inverse).isChecked())
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setContent(view.findViewById<TextInput>(R.id.input_content).text.toString())
            setButtonText(view.findViewById<TextInput>(R.id.input_button_text).text.toString())
            setButtonStyle(buttonStyle)
            if (view.findViewById<CheckBoxInput>(R.id.check_custom_background).isChecked()) {
                setCustomBackground(R.drawable.highlighted_card_custom_background)
            } else {
                disableCustomBackground()
            }
            setCloseButton(view)
            setButtonOnClick(View.OnClickListener {
                Toast.makeText(
                    view.context,
                    "Action Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }

    private fun HighlightedCardView.setCloseButton(view: View) {
        if (view.findViewById<CheckBoxInput>(R.id.checkbox_close_button).isChecked()) {
            val onButtonClicked = View.OnClickListener {
                Toast.makeText(
                    view.context,
                    "Close Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            setCloseButtonOnClick(onButtonClicked)
            setCloseButton("Dismiss card")
        } else {
            removeCloseButton()
        }
    }
}