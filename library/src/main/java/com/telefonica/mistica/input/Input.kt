package com.telefonica.mistica.input

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R

@BindingMethods(
    BindingMethod(
        type = Input::class,
        attribute = "inputHint",
        method = "setHint"
    ),
    BindingMethod(
        type = Input::class,
        attribute = "inputError",
        method = "setError"
    ),
    BindingMethod(
        type = Input::class,
        attribute = "inputHelperText",
        method = "setHelperText"
    ),
    BindingMethod(
        type = Input::class,
        attribute = "inputEnabled",
        method = "setEnabled"
    )
)
abstract class Input @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    var helperText: String?
        get() = layoutView.helperText.toString()
        set(value) {
            layoutView.helperText = value
        }

    var error: String?
        get() = layoutView.error.toString()
        set(value) {
            layoutView.error = value
        }

    var hint: String?
        get() = layoutView.hint.toString()
        set(value) {
            layoutView.hint = value
        }

    protected val layoutView: TextInputLayout

    init {
        var initialHint: String? = null
        var initialError: String? = null
        var initialHelperText: String? = null
        var initialEnabled: Boolean = true

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.Input, defStyleAttr, defStyleRes)
            try {
                initialHint = styledAttrs.getString(R.styleable.Input_inputHint)
                initialError = styledAttrs.getString(R.styleable.Input_inputError)
                initialHelperText = styledAttrs.getString(R.styleable.Input_inputHelperText)
                initialEnabled = styledAttrs.getBoolean(R.styleable.Input_inputEnabled, true)
            } finally {
                styledAttrs.recycle()
            }
        }

        layoutView = handleAttrsAndInflateLayout(attrs, defStyleAttr, defStyleRes)

        isEnabled = initialEnabled
        hint = initialHint
        error = initialError
        helperText = initialHelperText
    }

    fun setError(@StringRes textRes: Int?) {
        layoutView.error = textRes?.let { context.getString(it) }
    }

    fun setErrorEnabled(enabled: Boolean) {
        layoutView.isErrorEnabled = enabled
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        layoutView.isEnabled = enabled
    }

    abstract fun handleAttrsAndInflateLayout(
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0
    ): TextInputLayout
}
