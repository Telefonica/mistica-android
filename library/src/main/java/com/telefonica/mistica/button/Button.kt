package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
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
}
