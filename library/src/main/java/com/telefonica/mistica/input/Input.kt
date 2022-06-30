package com.telefonica.mistica.input

import android.content.Context
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.setAlpha

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
    ),
    BindingMethod(
        type = Input::class,
        attribute = "inputInverse",
        method = "setInverse"
    )
)
abstract class Input @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    var helperText: String?
        get() = layoutView.helperText?.toString()
        set(value) {
            layoutView.helperText = value
        }

    var error: String?
        get() = layoutView.error?.toString()
        set(value) {
            layoutView.error = if (value != null && inverse) {
                /* TextInputLayout errorTextAppearance always affect both hint and subtitle colors.
                As colors should be different by design requirement, just override text color using
                spans */
                SpannableString(value).apply {
                    setSpan(
                        ForegroundColorSpan(context.getThemeColor(R.attr.colorTextPrimaryInverse)),
                        0,
                        value.length,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    )
                }
            } else {
                value
            }
        }

    var hint: String?
        get() = layoutView.hint?.toString()
        set(value) {
            layoutView.hint = value
        }

    protected val layoutView: TextInputLayout
    private var inverse: Boolean = false

    init {
        var initialHint: String? = null
        var initialError: String? = null
        var initialHelperText: String? = null
        var initialEnabled: Boolean = true
        var initialInverse: Boolean = false

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Input,
                defStyleAttr,
                defStyleRes
            )
            try {
                initialHint = styledAttrs.getString(R.styleable.Input_inputHint)
                initialError = styledAttrs.getString(R.styleable.Input_inputError)
                initialHelperText = styledAttrs.getString(R.styleable.Input_inputHelperText)
                initialEnabled = styledAttrs.getBoolean(R.styleable.Input_inputEnabled, true)
                initialInverse = styledAttrs.getBoolean(R.styleable.Input_inputInverse, false)
            } finally {
                styledAttrs.recycle()
            }
        }

        layoutView = handleAttrsAndInflateLayout(attrs, defStyleAttr, defStyleRes)

        isEnabled = initialEnabled
        hint = initialHint
        error = initialError
        helperText = initialHelperText
        setInverse(initialInverse)
    }

    fun setError(@StringRes textRes: Int?) {
        error = textRes?.let { context.getString(it) }
    }

    fun setErrorEnabled(enabled: Boolean) {
        layoutView.isErrorEnabled = enabled
    }

    fun setInverse(inverse: Boolean) {
        this.inverse = inverse
        layoutView.setHelperTextTextAppearance(
            if (inverse) {
                R.style.AppTheme_Forms_TextInputLayout_Helper_Inverse
            } else {
                R.style.AppTheme_Forms_TextInputLayout_Helper
            }
        )
        reconfigureErrorTextColor()
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        layoutView.isEnabled = enabled
        setAlpha(enabled)
    }

    abstract fun handleAttrsAndInflateLayout(
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0
    ): TextInputLayout

    private fun reconfigureErrorTextColor() {
        if (layoutView.isErrorEnabled) {
            error = error
        }
    }
}
