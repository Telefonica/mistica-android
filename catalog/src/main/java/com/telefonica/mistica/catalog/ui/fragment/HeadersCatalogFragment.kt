package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.header.HeaderView
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput

class HeadersCatalogFragment : Fragment() {

    private lateinit var headerView: HeaderView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.headers_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_update).setOnClickListener {
            updateHeaderView(view)
        }
        updateHeaderView(view)
    }

    private fun updateHeaderView(view: View) {
        with(view.findViewById<HeaderView>(R.id.header_view)) {
            headerView = this
            setInverse(view.findViewById<CheckBoxInput>(R.id.check_inverse).isChecked())
            setHasTopPadding(view.findViewById<CheckBoxInput>(R.id.check_top_padding).isChecked())
            setFirstPretitle(view.findViewById<TextInput>(R.id.input_first_pretitle).text.toString())
            setFirstPretitleHasSecondaryColor(
                view.findViewById<CheckBoxInput>(R.id.check_first_pretitle_secondary).isChecked()
            )
            setTitle(view.findViewById<TextInput>(R.id.input_title).text.toString())
            setSecondPretitle(view.findViewById<TextInput>(R.id.input_second_pretitle).text.toString())
            setSecondPretitleHasSecondaryColor(
                view.findViewById<CheckBoxInput>(R.id.check_second_pretitle_secondary).isChecked()
            )
            setNumeral(view.findViewById<TextInput>(R.id.input_numeral).text.toString())
            setNumeralHasDangerColor(
                view.findViewById<CheckBoxInput>(R.id.check_numeral_danger).isChecked()
            )
            setActionButtonText(view.findViewById<TextInput>(R.id.input_action_text).text.toString())
            setActionButtonOnClick {
                Toast.makeText(
                    view.context,
                    "Action Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            setSecondaryActionButtonText(view.findViewById<TextInput>(R.id.input_secondary_action_text).text)
            setSecondaryActionButtonOnClick {
                Toast.makeText(
                    view.context,
                    "Secondary Action Clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            setSubtitle(view.findViewById<TextInput>(R.id.input_subtitle).text.toString())
            setSubtitleHasSecondaryColor(
                view.findViewById<CheckBoxInput>(R.id.check_subtitle_secondary).isChecked()
            )
            setSampleBottomLayout(view.findViewById<CheckBoxInput>(R.id.check_bottom_layout).isChecked())
        }
    }

    private fun setSampleBottomLayout(checked: Boolean) {
        if (checked) {
            headerView.setBottomLayout(R.layout.headers_fragment_catalog_sample_bottom_layout)
        } else {
            headerView.setBottomLayout(HeaderView.BOTTOM_VIEW_NONE)
        }
    }
}