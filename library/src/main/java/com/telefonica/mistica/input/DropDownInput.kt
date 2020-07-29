package com.telefonica.mistica.input

import android.widget.AutoCompleteTextView
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R

class DropDownInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Input(context, attrs, defStyleAttr, defStyleRes) {

    lateinit var dropDown: AutoCompleteTextView

    override fun handleAttrsAndInflateLayout(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int): TextInputLayout {

        LayoutInflater.from(context).inflate(R.layout.input_dropdown, this, true)

        dropDown = findViewById(R.id.dropdown_input)

        return findViewById(R.id.text_input_layout)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        dropDown.isEnabled = enabled
    }
}
