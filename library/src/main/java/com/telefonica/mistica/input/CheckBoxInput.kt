package com.telefonica.mistica.input

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.text.method.MovementMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.CompoundButton
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.databinding.InverseBindingListener
import androidx.databinding.InverseBindingMethod
import androidx.databinding.InverseBindingMethods
import com.google.android.material.textfield.TextInputLayout
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = CheckBoxInput::class,
        attribute = "inputCheckText",
        method = "setText"
    ),
    BindingMethod(
        type = CheckBoxInput::class,
        attribute = "inputChecked",
        method = "setChecked"
    )
)
@InverseBindingMethods(
    InverseBindingMethod(
        type = CheckBoxInput::class,
        attribute = "inputChecked",
        method = "isChecked"
    )
)
class CheckBoxInput @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : Input(context, attrs, defStyleAttr, defStyleRes) {

    private lateinit var checkBox: AppCompatCheckBox
    private var onCheckedChangeListener: CompoundButton.OnCheckedChangeListener? = null

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): TextInputLayout {

        var initialInputChecked: Boolean = true
        var initialInputText: String? = null

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.CheckBoxInput,
                defStyleAttr,
                defStyleRes
            )
            try {
                initialInputChecked =
                    styledAttrs.getBoolean(R.styleable.CheckBoxInput_inputChecked, true)
                initialInputText = styledAttrs.getString(R.styleable.CheckBoxInput_inputCheckText)
            } finally {
                styledAttrs.recycle()
            }
        }

        LayoutInflater.from(context).inflate(R.layout.input_checkbox, this, true)

        checkBox = findViewById(R.id.checkbox_input)
        setChecked(initialInputChecked)
        setText(initialInputText)
        configureErrorResetOnCheckChange()
        setButtonTint()

        return findViewById(R.id.text_input_layout)
    }

    private fun configureErrorResetOnCheckChange() {
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            setErrorEnabled(false)
            onCheckedChangeListener?.onCheckedChanged(buttonView, isChecked)
        }
    }

    private fun setButtonTint() {
        val states = arrayOf(
            intArrayOf(android.R.attr.state_checked),
            intArrayOf(-android.R.attr.state_checked),
        )
        val colors = intArrayOf(
            context.getThemeColor(R.attr.colorControlActive),
            context.getThemeColor(R.attr.colorControl),
        )
        checkBox.buttonTintList = ColorStateList(states, colors)
    }

    fun setChecked(checked: Boolean) {
        checkBox.isChecked = checked
    }

    fun isChecked(): Boolean =
        checkBox.isChecked

    fun setText(text: CharSequence?) {
        checkBox.text = text
    }

    fun getText(): CharSequence? =
        checkBox.text

    fun setOnCheckedChangeListener(listener: CompoundButton.OnCheckedChangeListener?) {
        onCheckedChangeListener = listener
    }

    fun setMovementMethod(movementMethod: MovementMethod) {
        checkBox.movementMethod = movementMethod
    }

    fun getButtonDrawable(): Drawable? =
        checkBox.buttonDrawable

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        checkBox.isEnabled = enabled
    }

    companion object {
        @BindingAdapter(
            value = ["inputCheckedAttrChanged"]
        )
        @JvmStatic
        fun setCheckWatcher(input: CheckBoxInput, listener: InverseBindingListener) {
            input.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, _ -> listener.onChange() })
        }
    }
}
