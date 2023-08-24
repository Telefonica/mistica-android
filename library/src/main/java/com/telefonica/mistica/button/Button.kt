package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.util.setAlpha

// This should be deprecated soon, when it's confirmed no problem appears when using button2.Button instead
class Button : MaterialButton {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        setAlpha(enabled)
    }
}
