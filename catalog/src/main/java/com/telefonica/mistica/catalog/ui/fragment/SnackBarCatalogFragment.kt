package com.telefonica.mistica.catalog.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.feedback.SnackbarBuilder
import com.telefonica.mistica.input.DropDownInput
import com.telefonica.mistica.input.TextInput

class SnackBarCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
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

        with(dropDownInput.dropDown) {
            setAdapter(
                ArrayAdapter(
                    view.context,
                    R.layout.dropdown_menu_popup_item,
                    SnackBarType.values().map { it.name }
                )
            )
            setText(SnackBarType.INFORMATIVE.toString(), false)
        }

        createButton.setOnClickListener {
            it.hideKeyboard()
            SnackbarBuilder(view, inputText.text.toString()).apply {
                inputAction.text.toString().let { actionText ->
                    if (actionText.isNotEmpty()) {
                        withAction(actionText, View.OnClickListener { })
                    }
                }
                when (SnackBarType.valueOf(dropDownInput.dropDown.text.toString())) {
                    SnackBarType.INFORMATIVE -> showInformative()
                    SnackBarType.CRITICAL -> showCritical()
                }
            }
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