package com.telefonica.mistica.button

import android.content.Context
import android.graphics.Typeface
import android.os.Build
import android.text.SpannableStringBuilder
import android.text.TextPaint
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import android.util.AttributeSet
import androidx.core.content.res.ResourcesCompat
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
            text = addChevronToText(context, text)
        }
    }

    private fun addChevronToText(context: Context, initialText: CharSequence): SpannableStringBuilder {
        val spannable = SpannableStringBuilder("$initialText >")
        val misticaFont = ResourcesCompat.getFont(context, R.font.misticafont)
        val startPosition = spannable.indexOf(">")
        if (misticaFont != null) {
            spannable.setSpan(CustomTypefaceSpan(misticaFont), startPosition, startPosition + 1, SpannableStringBuilder.SPAN_INCLUSIVE_INCLUSIVE)
            spannable.setSpan(RelativeSizeSpan(1.3f), startPosition, startPosition + 1, SpannableStringBuilder.SPAN_INCLUSIVE_INCLUSIVE)
        }
        return spannable
    }

    // This is needed as TypefaceSpan doesn't work on android < 28
    private class CustomTypefaceSpan(private val typeface: Typeface) : StyleSpan(Typeface.NORMAL) {
        override fun updateDrawState(ds: TextPaint) {
            ds.typeface = typeface
        }
    }
}
