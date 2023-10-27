package com.telefonica.mistica.catalog.ui.classic.components

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.feedback.SnackbarBuilder
import com.telefonica.mistica.feedback.SnackbarLength
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class SnackBarCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_snackbar_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputText: TextInput = view.findViewById(R.id.input_snackbar_message)
        val inputAction: TextInput = view.findViewById(R.id.input_snackbar_action)
        val dropDownInput: DropDownInput = view.findViewById(R.id.dropdown_snackbar_type)
        val createButton: Button = view.findViewById(R.id.button_create_snackbar)
        val snackbarIndefiniteLength: CheckBoxInput = view.findViewById(R.id.infinite_length_checkbox)
        val alwaysShowDismiss: CheckBoxInput = view.findViewById(R.id.always_show_dismiss_checkbox)

        with(dropDownInput.dropDown) {
            setAdapter(
                DropDownInput.Adapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    SnackBarType.values().map { it.name }
                )
            )
            setText(SnackBarType.INFORMATIVE.toString())
        }

        createButton.setOnClickListener {
            it.hideKeyboard()
            SnackbarBuilder(view, inputText.text.toString()).apply {
                inputAction.text.toString().let { actionText ->
                    if (actionText.isNotEmpty()) {
                        withAction(actionText) { }
                    }
                }
                if (alwaysShowDismiss.isChecked()) {
                    withDismiss()
                }

                val withIndefiniteLength = snackbarIndefiniteLength.isChecked()
                when (SnackBarType.valueOf(dropDownInput.dropDown.text.toString())) {
                    SnackBarType.INFORMATIVE -> show(withIndefiniteLength, SnackbarBuilder::showInformative, SnackbarBuilder::showInformative)
                    SnackBarType.CRITICAL -> show(withIndefiniteLength, SnackbarBuilder::showCritical, SnackbarBuilder::showCritical)
                }
            }
        }
    }

    private inline fun SnackbarBuilder.show(
        withIndefiniteLength: Boolean,
        showWithLength: SnackbarBuilder.(SnackbarLength) -> Unit,
        showWithoutLength: SnackbarBuilder.() -> Unit,
    ) {
        if (withIndefiniteLength) {
            showWithLength(SnackbarLength.INDEFINITE)
        } else {
            showWithoutLength()
        }
    }

    private fun View.hideKeyboard() {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }

    private enum class SnackBarType {
        INFORMATIVE,
        CRITICAL
    }
}