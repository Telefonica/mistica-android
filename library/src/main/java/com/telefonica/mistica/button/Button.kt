package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.R
import com.telefonica.mistica.util.setAlpha

class Button @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : MaterialButton(context, attrs, defStyleAttr) {

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        setAlpha(enabled)
    }

    init {
        val styledAttrs =
            context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Button,
                0,
                0,
            )
        val withChevron = styledAttrs.getBoolean(R.styleable.Button_withChevron, false)
        if (withChevron) {
            val chevronImage = ContextCompat.getDrawable(context, R.drawable.icn_chevron)
            chevronImage?.setTint(currentTextColor)
            compoundDrawablePadding = resources.getDimensionPixelSize(R.dimen.button_chevron_padding)
            this.setCompoundDrawablesWithIntrinsicBounds(null, null, chevronImage, null)
        }
    }
}
