package com.telefonica.mistica.catalog.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.feedback.popover.PopOver
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput

class PopOverCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return layoutInflater.inflate(R.layout.screen_popovers_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputTitle: TextInput = view.findViewById(R.id.input_popover_title)
        val inputMessage: TextInput = view.findViewById(R.id.input_popover_message)
        val createButton: Button = view.findViewById(R.id.button_create_popover)
        val createButtonOnTop: Button = view.findViewById(R.id.button_create_popover_on_top)
        val addImage: CheckBoxInput = view.findViewById(R.id.input_popover_checkbox_image)

        createButton.setOnClickListener {
            createPopOverOnView(
                it,
                inputTitle,
                inputMessage,
                addImage
            )
        }
        createButtonOnTop.setOnClickListener {
            createPopOverOnView(
                inputTitle,
                inputTitle,
                inputMessage,
                addImage
            )
        }
    }

    private fun createPopOverOnView(
        it: View,
        inputTitle: TextInput,
        inputMessage: TextInput,
        addImage: CheckBoxInput
    ) {
        it.hideKeyboard()
        val popover = PopOver(requireActivity(), it)
            .setTitle(inputTitle.text.toString())
            .setDescription(inputMessage.text.toString())

        if (addImage.isChecked()) {
            popover.setImage(R.drawable.ic_popovers)
        }

        popover.show(requireActivity())
    }

    private fun View.hideKeyboard() {
        val inputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0)
    }
}