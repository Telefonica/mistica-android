package com.telefonica.mistica.section

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import com.google.android.material.textview.MaterialTextView
import com.telefonica.mistica.R

class SectionTitleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(ContextThemeWrapper(context, R.style.AppTheme_SectionTitle), attrs, defStyleAttr)