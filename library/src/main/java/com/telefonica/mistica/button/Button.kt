package com.telefonica.mistica.button

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.util.setAlpha

class Button : MaterialButton {

    constructor(context: Context) : super(context)

    constructor(context: Context, @Nullable attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, @Nullable attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        setAlpha(enabled)
    }
}