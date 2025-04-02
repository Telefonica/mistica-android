package com.telefonica.mistica.link

import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import androidx.annotation.ColorInt

class TextLinkSpan(
    @ColorInt private val linkColor: Int,
    private val onClickAction: () -> Unit,
) : ClickableSpan() {
    override fun onClick(widget: View) {
        onClickAction()
    }

    override fun updateDrawState(ds: TextPaint) {
        super.updateDrawState(ds)
        ds.isUnderlineText = true
        ds.color = linkColor
    }
}
