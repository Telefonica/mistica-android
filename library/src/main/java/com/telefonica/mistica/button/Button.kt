package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.util.setAlpha

// This should be deprecated soon, when it's confirmed no problem appears when using button2.Button instead
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
