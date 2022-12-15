package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.util.setAlpha

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