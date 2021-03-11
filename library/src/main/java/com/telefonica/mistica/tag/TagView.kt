package com.telefonica.mistica.tag

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.view.ContextThemeWrapper
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import com.google.android.material.textview.MaterialTextView
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor


class TagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : MaterialTextView(
    ContextThemeWrapper(context, R.style.AppTheme_Widgets_Tag),
    attrs,
    defStyleAttr
) {
    init {
        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.TagView,
                    defStyleAttr,
                    0
                )
            styledAttrs.getColor(R.styleable.TagView_tagColor, context.getThemeColor(R.attr.colorPromo))
                .let {
                    background.colorFilter = BlendModeColorFilterCompat
                        .createBlendModeColorFilterCompat(it, BlendModeCompat.SRC_ATOP)
                    if (it == context.getThemeColor(R.attr.colorInverse)) {
                        setTextColor(context.getThemeColor(R.attr.colorTextPrimary))
                    }
                }
            styledAttrs.recycle()
        }
    }
}