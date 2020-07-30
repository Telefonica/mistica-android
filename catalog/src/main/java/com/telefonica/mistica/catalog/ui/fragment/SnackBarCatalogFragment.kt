package com.telefonica.mistica.catalog.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.feedback.SnackbarBuilder

class SnackBarCatalogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_snackbar_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputText: EditText = view.findViewById(R.id.input_snackbar_message)
        val inputAction: EditText = view.findViewById(R.id.input_snackbar_action)
        val typeSpinner: Spinner = view.findViewById(R.id.spinner_snackbar_type)
        val createButton: Button = view.findViewById(R.id.button_create_snackbar)

        typeSpinner.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_item, SnackBarType.values().map { it.name }).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        createButton.setOnClickListener {
            it.hideKeyboard()
            SnackbarBuilder(view, inputText.text.toString()).apply {
                inputAction.text.toString().let { actionText ->
                    if (actionText.isNotEmpty()) {
                        withAction(actionText, View.OnClickListener { })
                    }
                }
                when (SnackBarType.valueOf(typeSpinner.selectedItem as String)) {
                    SnackBarType.INFORMATIVE -> showInformative()
                    SnackBarType.CRITICAL -> showCritical()
                }
            }
        }
    }

    private fun View.hideKeyboard() {
        val inputMethodManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }

    private enum class SnackBarType {
        INFORMATIVE,
        CRITICAL
    }
}