package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class InputsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_inputs_catalog, container, false).apply {

            findViewById<TextInput>(R.id.textInputError)?.apply {
                error = "Error Text!"
            }

            val countries = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")

            val arrayAdapter = ArrayAdapter(
                context,
                R.layout.dropdown_menu_popup_item,
                countries
            )

            findViewById<DropDownInput>(R.id.dropDownInput)?.apply {
                dropDown.setAdapter(arrayAdapter)
            }

            findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                setText(createdSpannableText())
                setMovementMethod(LinkMovementMethod.getInstance())
            }
        }
    }

    private fun createdSpannableText(): Spannable {
        val message =
            "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error)."
        val link1 = "Legal Grounds"
        val link2 = "Privacy Policy"

        val link1ClickableSpan = object : ClickableSpan() {
            override fun onClick(checkBox: View) {
                view?.findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                    error = "Error Text! Tapped on $link1"
                }
            }
        }

        val start1 = message.indexOf(link1)
        val end1 = start1 + link1.length

        val link2ClickableSpan = object : ClickableSpan() {
            override fun onClick(checkBox: View) {
                view?.findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                    error = "Error Text! Tapped on $link2"
                }
            }
        }

        val start2 = message.indexOf(link2)
        val end2 = start2 + link2.length

        return SpannableString(message).apply {
            setSpan(link1ClickableSpan, start1, end1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(link2ClickableSpan, start2, end2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
}