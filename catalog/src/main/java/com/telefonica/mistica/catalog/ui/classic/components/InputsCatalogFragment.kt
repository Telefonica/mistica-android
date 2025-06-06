package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.CallSuper
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.input.validations.EmailTextInputValidation
import com.telefonica.mistica.input.validations.PhoneTextInputValidation
import com.telefonica.mistica.input.validations.TextInputValidation
import com.telefonica.mistica.input.validations.TextInputValidationResult
import com.telefonica.mistica.link.MultiLink.CustomMultiLink
import com.telefonica.mistica.link.getSpannableLinkText
import com.telefonica.mistica.title.TitleView

class InputsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_inputs_catalog, container, false).apply {

            val countries = listOf("Item 1", "Item 2", "Item 3", "Item 4")

            findViewById<DropDownInput>(R.id.dropDownInput)?.apply {
                dropDown.setAdapter(
                    DropDownInput.Adapter(
                        context,
                        R.layout.dropdown_menu_popup_item,
                        countries
                    )
                )
            }

            findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                setText(
                    getSpannableLinkText(
                        originalText = "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error).",
                        links = listOf(
                            getCustomCheckboxMultiLink("Legal Grounds"),
                            getCustomCheckboxMultiLink("Privacy Policy"),
                        ),
                    )
                )
                setMovementMethod(LinkMovementMethod.getInstance())
            }

            findViewById<TitleView>(R.id.section_title_with_link)?.apply {
                setOnLinkClickedListener {
                    Toast.makeText(this.context, "Link tapped!", Toast.LENGTH_SHORT).show()
                }
            }

            val textInputEmail = findViewById<TextInput>(R.id.text_input_email).apply {
                setValidation(EmailTextInputValidation("Email invalid"))
            }
            findViewById<Button>(R.id.button_text_input_email)?.apply {
                setOnClickListener {
                    textInputEmail?.let { textInputEmail.validate() }
                }
            }

            val textInputPhone = findViewById<TextInput>(R.id.text_input_phone).apply {
                setValidation(PhoneTextInputValidation("Phone invalid"))
            }
            findViewById<Button>(R.id.button_text_input_phone)?.apply {
                setOnClickListener {
                    textInputEmail?.let { textInputPhone.validate() }
                }
            }

            val textInputCustom = findViewById<TextInput>(R.id.text_input_custom).apply {
                setValidation(customTextInputValidation)
            }
            findViewById<Button>(R.id.button_text_input_custom)?.apply {
                setOnClickListener {
                    textInputEmail?.let { textInputCustom.validate() }
                }
            }
        }
    }

    private fun getCustomCheckboxMultiLink(linkedText: String) =
        CustomMultiLink(
            linkedText = linkedText,
            customSpan = object : CheckBoxClickableSpan() {
                override fun onClick(checkBox: View) {
                    super.onClick(checkBox)
                    view?.findViewById<CheckBoxInput>(R.id.checkboxInput)?.apply {
                        error = "Error Text! Tapped on $linkedText"
                    }
                }
            }
        )

    /**
     * Avoids toggling checkbox state when tapping on the span
     */
    abstract class CheckBoxClickableSpan : ClickableSpan() {
        @CallSuper
        override fun onClick(checkBox: View) {
            checkBox.cancelPendingInputEvents()
        }

        override fun updateDrawState(ds: TextPaint) {
            ds.color = ds.linkColor
            ds.isUnderlineText = false
        }
    }

    private val customTextInputValidation = object : TextInputValidation {
        override fun isValid(text: String?): TextInputValidationResult =
            if (text.equals("Mistica rules")) {
                TextInputValidationResult.Success
            } else {
                TextInputValidationResult.Invalid("Message should be \"Mistica Rules\"")
            }
    }
}