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
import com.telefonica.mistica.input.TextInput


class DataCardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.data_card_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.data_card_button_update)
            .setOnClickListener { updateDataCardView(view) }
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
            setPrimaryButtonOnClick(View.OnClickListener {
                Toast.makeText(
                    view.context,
                    "Primary button clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            })
            setLinkButtonOnClick(View.OnClickListener {
                Toast.makeText(
                    view.context,
                    "Secondary button clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            })
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