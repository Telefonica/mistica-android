package com.telefonica.mistica.input

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Filter
import androidx.annotation.LayoutRes
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R

class DropDownInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Input(context, attrs, defStyleAttr, defStyleRes) {

    lateinit var dropDown: AutoCompleteTextView

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): TextInputLayout {

        LayoutInflater.from(context).inflate(R.layout.input_dropdown, this, true)

        dropDown = findViewById(R.id.dropdown_input)

        return findViewById(R.id.text_input_layout)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        dropDown.isEnabled = enabled
    }

    /**
     * Almost unbelievably, if we want to create a Material Spinner,
     * we're forced to subclass ArrayAdapter. That statement alone
     * is maddening. The issue is that there's no such thing as a Material
     * Spinner. Instead, there's an Exposed Dropdown Menu, which is really
     * an AutoCompleteTextView wrapped in a TextInputLayout, which replaces a
     * Spinner. The reason we have to subclass ArrayAdapter is because we need
     * the AutoCompleteTextView to act like a proper Spinner. Thus we have to
     * override the AutoCompleteTextView's Filter so that it NEVER performs
     * filtering of the dropdown menu items.
     *
     * https://blog.usejournal.com/there-is-no-material-design-spinner-for-android-3261b7c77da8
     */
    class Adapter(
        context: Context,
        @LayoutRes layout: Int,
        val values: List<String>
    ) : ArrayAdapter<String>(context, layout, values) {
        private val filterThatDoesNothing = object : Filter() {
            override fun performFiltering(constraint: CharSequence?) = FilterResults().apply {
                values = this@Adapter.values
                count = this@Adapter.values.size
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                notifyDataSetChanged()
            }
        }

        override fun getFilter(): Filter = filterThatDoesNothing
    }
}
