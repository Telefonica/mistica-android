package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.card.datacard.DataCardView
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.tag.TagView


class DataCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.data_card_fragment_catalog, container, false)
    }

    private var currentTagStyle: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.data_card_button_update)
            .setOnClickListener { updateDataCardView(view) }
        with(view.findViewById<DropDownInput>(R.id.tagStyleSelector).dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    TagView.Companion.Style.values().map { it.name }
                )
            )
            setText(TagView.Companion.Style.PROMO.name)
            setOnItemClickListener { _, _, _, _ ->
                currentTagStyle = TagView.Companion.Style.valueOf(text.toString()).type
                updateDataCardView(view)
            }
        }
        updateDataCardView(view)
    }

    private fun updateDataCardView(view: View) {
        with(view.findViewById<DataCardView>(R.id.data_card_view)) {
            setTag(view.findViewById<TextInput>(R.id.input_tag).text.toString())
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setSubtitle(view.findViewById<TextInput>(R.id.input_subtitle).text.toString())
            setDescription(view.findViewById<TextInput>(R.id.input_description).text.toString())
            setPrimaryButtonText(view.findViewById<TextInput>(R.id.input_primary_button).text.toString())
            setLinkButtonText(view.findViewById<TextInput>(R.id.input_link_button).text.toString())
            setTagStyle(currentTagStyle)
            if (view.findViewById<CheckBoxInput>(R.id.additional_content_checkbox).isChecked()) {
                setCardAdditionalContent(null)
                val additionalContent  = LayoutInflater.from(context).inflate(R.layout.card_custom_sample_content, this, false )
                setCardAdditionalContent(additionalContent)
            } else {
                setCardAdditionalContent(null)
            }
            if (view.findViewById<CheckBoxInput>(R.id.show_icon_checkbox).isChecked()) {
                setIcon(R.drawable.media_card_sample_image)
            } else {
                removeIcon()
            }
            setPrimaryButtonOnClick {
                Toast.makeText(
                    view.context,
                    "Primary button clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            setLinkButtonOnClick {
                Toast.makeText(
                    view.context,
                    "Secondary button clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            setOnClickListener {
                Toast.makeText(
                    view.context,
                    "Data card clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}