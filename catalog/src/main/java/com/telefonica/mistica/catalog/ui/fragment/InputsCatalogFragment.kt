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
import android.widget.Button
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.input.isEmailValid
import com.telefonica.mistica.input.isPhoneValid
import com.telefonica.mistica.input.validations.TextInputValidation

class InputsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_inputs_catalog, container, false).apply {

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

            val textInputEmail = findViewById<TextInput>(R.id.text_input_email)
            findViewById<Button>(R.id.button_text_input_email)?.apply {
                setOnClickListener {
                    textInputEmail?.let { onEmailValidation(textInputEmail) }
                }
            }

            val textInputPhone = findViewById<TextInput>(R.id.text_input_phone)
            findViewById<Button>(R.id.button_text_input_phone)?.apply {
                setOnClickListener {
                    textInputEmail?.let { onPhoneValidation(textInputPhone) }
                }
            }

            val textInputCustom = findViewById<TextInput>(R.id.text_input_custom)
            findViewById<Button>(R.id.button_text_input_custom)?.apply {
                setOnClickListener {
                    textInputEmail?.let { onCustomValidation(textInputCustom) }
                }
            }
        }
    }

    private fun onEmailValidation(textInput: TextInput) {
        if (textInput.isEmailValid()) {
            textInput.setErrorEnabled(false)
        } else {
            textInput.setErrorEnabled(true)
            textInput.error = "Email invalid"
        }
    }

    private fun onPhoneValidation(textInput: TextInput) {
        if (textInput.isPhoneValid()) {
            textInput.setErrorEnabled(false)
        } else {
            textInput.setErrorEnabled(true)
            textInput.error = "Phone invalid"
        }
    }

    private fun onCustomValidation(textInput: TextInput) {
        if (textInput.isValid(customTextInputValidation)) {
            textInput.setErrorEnabled(false)
        } else {
            textInput.setErrorEnabled(true)
            textInput.error = "Should match \"Mistica rules\""
        }
    }

    private fun createdSpannableText(): Spannable {
        val message =
            "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error)."
        val link1 = "Legal Grounds"
        val link2 = "Privacy Policy"

        val link1ClickableSpan = object : CheckBoxClickableSpan() {
            override fun onClick(checkBox: View) {
                super.onClick(checkBox)
                view?.findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                    error = "Error Text! Tapped on $link1"
                }
            }
        }

        val start1 = message.indexOf(link1)
        val end1 = start1 + link1.length

        val link2ClickableSpan = object : CheckBoxClickableSpan() {
            override fun onClick(checkBox: View) {
                super.onClick(checkBox)
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

    /**
     * Avoids toggling checkbox state when tapping on the span
     */
    abstract class CheckBoxClickableSpan : ClickableSpan() {
        @CallSuper
        override fun onClick(checkBox: View) {
            checkBox.cancelPendingInputEvents()
        }
    }

    private val customTextInputValidation = object : TextInputValidation {
        override fun isValid(text: String?): Boolean =
            text.equals("Mistica rules")
    }
}