package com.telefonica.mistica.catalog.ui.classic.components

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.tag.TagView

class TagsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View =
        inflater.inflate(R.layout.screen_tags_catalog, container, false)

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textInput: TextInput = view.findViewById(R.id.textInput)

        val tagViews = listOf<TagView>(
            view.findViewById(R.id.regular_tag),
            view.findViewById(R.id.regular_with_icon_tag),
        )

        textInput.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(
                inputText: CharSequence,
                start: Int,
                before: Int,
                count: Int,
            ) {
                tagViews.forEach { it.text = inputText.toString() }
            }
        })
    }
}