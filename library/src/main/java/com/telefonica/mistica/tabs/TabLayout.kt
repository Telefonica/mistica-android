package com.telefonica.mistica.tabs

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.Nullable
import com.google.android.material.tabs.TabLayout

class TabLayout : TabLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, @Nullable attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, @Nullable attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}
