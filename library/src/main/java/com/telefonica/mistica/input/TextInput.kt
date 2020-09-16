package com.telefonica.mistica.input

import android.content.Context
import android.os.Build
import android.text.Editable
import android.text.InputFilter.LengthFilter
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputConnection
import android.widget.TextView
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.databinding.*
import androidx.databinding.adapters.ListenerUtil
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R
import com.telefonica.mistica.input.validations.TextInputValidation

@BindingMethods(
    BindingMethod(
        type = TextInput::class,
        attribute = "inputCounterEnabled",
        method = "setCounterEnabled"
    ),
    BindingMethod(
        type = TextInput::class,
        attribute = "inputMaxLength",
        method = "setMaxLength"
    ),
    BindingMethod(
        type = TextInput::class,
        attribute = "inputAutofillEnabled",
        method = "setAutofillEnabled"
    ),
    BindingMethod(
        type = TextInput::class,
        attribute = "inputText",
        method = "setText"
    )
)
@InverseBindingMethods(
    InverseBindingMethod(
        type = TextInput::class,
        attribute = "inputText",
        method = "getText"
    )
)
class TextInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Input(context, attrs, defStyleAttr, defStyleRes) {

    var text: String?
        get() = editTextView.text.toString()
        set(value) {
            if (value != text) {
                editTextView.setText(value)
            }
        }

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_TEXT,
        TYPE_EMAIL,
        TYPE_PASSWORD,
        TYPE_TEXT_AREA,
        TYPE_PHONE
    )
    annotation class TextInputType

    @TextInputType
    private var type: Int = TYPE_TEXT

    private lateinit var editTextView: TextInputEditText

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): TextInputLayout {

        var initialText: String? = null
        var initialCounterEnabled: Boolean = false
        var initialMaxLength: Int = NO_MAX_LENGTH
        var initialAutofillEnabled: Boolean = true

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.TextInput,
                defStyleAttr,
                defStyleRes
            )
            try {
                type = styledAttrs.getInt(R.styleable.TextInput_inputType, TYPE_TEXT)
                initialText = styledAttrs.getString(R.styleable.TextInput_inputText)
                initialCounterEnabled =
                    styledAttrs.getBoolean(R.styleable.TextInput_inputCounterEnabled, false)
                initialMaxLength =
                    styledAttrs.getInt(R.styleable.TextInput_inputMaxLength, NO_MAX_LENGTH)
                initialAutofillEnabled =
                    styledAttrs.getBoolean(R.styleable.TextInput_inputAutofillEnabled, true)
            } finally {
                styledAttrs.recycle()
            }
        }

        @LayoutRes val layout: Int = when (type) {
            TYPE_EMAIL -> R.layout.input_text_email
            TYPE_PASSWORD -> R.layout.input_text_password
            TYPE_TEXT_AREA -> R.layout.input_text_area
            TYPE_PHONE -> R.layout.input_text_phone
            else -> R.layout.input_text
        }

        LayoutInflater.from(context).inflate(layout, this, true)

        editTextView = findViewById(R.id.text_input)

        setMaxTextLength(initialMaxLength)
        text = initialText
        configureAutoFill()
        setAutofillEnabled(initialAutofillEnabled)
        configureErrorResetOnTextChange()

        return findViewById<TextInputLayout>(R.id.text_input_layout).apply {
            isCounterEnabled = initialCounterEnabled
            counterMaxLength = initialMaxLength
        }
    }

    fun clear() {
        editTextView.text?.clear()
    }

    fun setCounterEnabled(enabled: Boolean) {
        layoutView.isCounterEnabled = enabled
    }

    fun setMaxLength(maxLength: Int) {
        layoutView.counterMaxLength = maxLength
        setMaxTextLength(maxLength)
    }

    fun setAutofillEnabled(enabled: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            editTextView.importantForAutofill =
                if (enabled) View.IMPORTANT_FOR_AUTOFILL_AUTO else View.IMPORTANT_FOR_AUTOFILL_NO
        }
    }

    fun addTextChangedListener(watcher: TextWatcher) {
        editTextView.addTextChangedListener(watcher)
    }

    fun removeTextChangedListener(watcher: TextWatcher) {
        editTextView.removeTextChangedListener(watcher)
    }

    fun setTopTextPadding(padding: Int) {
        editTextView.setPadding(
            editTextView.paddingLeft,
            padding,
            editTextView.paddingRight,
            editTextView.paddingBottom
        )
    }

    fun setOnEditorActionListener(l: TextView.OnEditorActionListener) {
        editTextView.setOnEditorActionListener(l)
    }

    fun isValid(textInputValidation: TextInputValidation) = textInputValidation.isValid(text)

    override fun onCreateInputConnection(outAttrs: EditorInfo): InputConnection? =
        editTextView.onCreateInputConnection(outAttrs)

    private fun configureAutoFill() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val hint: String? = when (type) {
                TYPE_EMAIL -> View.AUTOFILL_HINT_EMAIL_ADDRESS
                TYPE_PASSWORD -> View.AUTOFILL_HINT_PASSWORD
                TYPE_PHONE -> View.AUTOFILL_HINT_PHONE
                else -> null
            }
            hint?.let { editTextView.setAutofillHints(it) }
        }
    }

    private fun configureErrorResetOnTextChange() {
        editTextView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setErrorEnabled(false)
            }
        })
    }

    private fun setMaxTextLength(maxLength: Int) {
        editTextView.filters.filterNot {
            it is LengthFilter
        }.let {
            if (maxLength != NO_MAX_LENGTH) {
                it.plus(LengthFilter(maxLength))
            } else {
                it
            }
        }.let {
            editTextView.filters = it.toTypedArray()
        }
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        editTextView.isEnabled = enabled
    }

    companion object {
        const val TYPE_TEXT = 0
        const val TYPE_EMAIL = 1
        const val TYPE_PASSWORD = 2
        const val TYPE_TEXT_AREA = 3
        const val TYPE_PHONE = 4

        const val NO_MAX_LENGTH = 0

        @BindingAdapter(
            value = ["inputTextAttrChanged"]
        )
        @JvmStatic
        fun setTextWatcher(input: TextInput, listener: InverseBindingListener) {
            val textWatcher: TextWatcher = object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    listener.onChange()
                }

                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            }
            val oldTextWatcher = ListenerUtil.trackListener(input, textWatcher, R.id.textWatcher)
            if (oldTextWatcher != null) {
                input.removeTextChangedListener(oldTextWatcher);
            }
            input.addTextChangedListener(textWatcher);
        }
    }
}
