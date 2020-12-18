package com.telefonica.mistica.mediacard

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods


@BindingMethods(
    BindingMethod(
        type = MediaCardView::class,
        attribute = "headerInverse",
        method = "setInverse"
    )
)
class MediaCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    init {

    }
}
