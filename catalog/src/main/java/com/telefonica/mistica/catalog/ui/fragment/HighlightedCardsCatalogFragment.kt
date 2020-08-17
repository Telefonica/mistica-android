package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.highlightedcard.HighlightedCardView
import com.telefonica.mistica.highlightedcard.HighlightedCardView.*
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class HighlightedCardsCatalogFragment : Fragment() {

    private var buttonStyle: ButtonStyle = ButtonStyle.PRIMARY

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
        view.findViewById<Button>(R.id.button_update).setOnClickListener { updateHighlightedCardView(view) }
        configureButtonDropdown(view)
        updateHighlightedCardView(view)
    }

    private fun configureButtonDropdown(view: View) {
        val buttonTypes: List<Pair<String, ButtonStyle>> = listOf(
            "Primary" to ButtonStyle.PRIMARY,
            "Secondary" to ButtonStyle.SECONDARY,
            "Link" to ButtonStyle.LINK,
            "No button" to ButtonStyle.NO_BUTTON
        )
        with(view.findViewById<DropDownInput>(R.id.dropdown_button_type)) {
            post {
                dropDown.setAdapter(
                    ArrayAdapter(
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
            setInverse(view.findViewById<CheckBoxInput>(R.id.check_inverse).isChecked())
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setContent(view.findViewById<TextInput>(R.id.input_content).text.toString())
            setButtonText(view.findViewById<TextInput>(R.id.input_button_text).text.toString())
            setButtonStyle(buttonStyle)

//            setFirstPretitleHasSecondaryColor(
//                view.findViewById<CheckBoxInput>(R.id.check_first_pretitle_secondary).isChecked()
//            )
//            setActionButtonText(view.findViewById<TextInput>(R.id.input_action_text).text.toString())
//            setActionButtonOnClick(View.OnClickListener {
//                Toast.makeText(
//                    view.context,
//                    "Action Clicked!",
//                    Toast.LENGTH_SHORT
//                ).show()
//            })
//            setSecondaryActionButtonText(view.findViewById<TextInput>(R.id.input_secondary_action_text).text)
//            setSecondaryActionButtonOnClick(View.OnClickListener {
//                Toast.makeText(
//                    view.context,
//                    "Secondary Action Clicked!",
//                    Toast.LENGTH_SHORT
//                ).show()
//            })
//            setSubtitle(view.findViewById<TextInput>(R.id.input_subtitle).text.toString())
//            setSubtitleHasSecondaryColor(
//                view.findViewById<CheckBoxInput>(R.id.check_subtitle_secondary).isChecked()
//            )
        }
    }
}