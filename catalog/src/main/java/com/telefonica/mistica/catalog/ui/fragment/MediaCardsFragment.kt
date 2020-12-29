package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.mediacard.MediaCardView


class MediaCardsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.media_card_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.media_card_button_update)
            .setOnClickListener { updateMediaCardView(view) }
        updateMediaCardView(view)
    }

    private fun updateMediaCardView(view: View) {
        with(view.findViewById<MediaCardView>(R.id.media_card_view)) {
            setImage(R.drawable.media_card_sample_image)
            setTag(view.findViewById<TextInput>(R.id.input_tag).text.toString())
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setSubtitle(view.findViewById<TextInput>(R.id.input_subtitle).text.toString())
            setDescription(view.findViewById<TextInput>(R.id.input_description).text.toString())
            setPrimaryButtonText(view.findViewById<TextInput>(R.id.input_primary_button).text.toString())
            setLinkButtonText(view.findViewById<TextInput>(R.id.input_link_button).text.toString())
            if (view.findViewById<CheckBoxInput>(R.id.additional_content_checkbox).isChecked()) {
                val additionalContent  = LayoutInflater.from(context).inflate(R.layout.media_card_additional_sample_content, this, false )
                setMediaCardAdditionalContent(additionalContent)
            } else {
                setMediaCardAdditionalContent(null)
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
            setMediaCardOnClick(View.OnClickListener {
                Toast.makeText(
                    view.context,
                    "Media card clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            })
        }
    }
}