package com.telefonica.mistica.link

import android.content.Context
import android.graphics.Color
import android.text.method.LinkMovementMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = TextLinkView::class,
        attribute = "linkInverse",
        method = "setLinkInverse"
    ),
)
class TextLinkView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(
    context,
    attrs,
    defStyleAttr
) {

    @ColorInt
    private var linkColor: Int = context.getThemeColor(R.attr.colorTextLink)

    private var linkTextView: AppCompatTextView

    init {
        LayoutInflater.from(context).inflate(R.layout.text_link_view, this, true)

        linkTextView = findViewById(R.id.link_text_view)

        linkTextView.movementMethod = LinkMovementMethod.getInstance()
        linkTextView.highlightColor = Color.TRANSPARENT

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(attrs, R.styleable.TextLinkView, defStyleAttr, 0)

            setLinkInverse(styledAttrs.getBoolean(R.styleable.TextLinkView_linkInverse, false))
        }
    }

    fun setSingleTextLink(linkText: String, onLinkTapped: () -> Unit) {
        linkTextView.text = getSpannableLinkText(
            originalText = linkText,
            links = listOf(
                Link(
                    text = linkText,
                    onLinkTapped = onLinkTapped,
                )
            ),
            linkColor = linkColor,
        )
    }

    fun setTextWithLinks(originalText: String, links: List<Link>) {
        linkTextView.text = getSpannableLinkText(
            originalText = originalText,
            links = links,
            linkColor = linkColor,
        )
    }

    fun setLinkInverse(inverse: Boolean) {
        linkColor = context.getThemeColor(if (inverse) R.attr.colorTextLinkInverse else R.attr.colorTextLink)
    }
}

/*
private fun getSpannableLinkText(originalText: String, links: List<Link>): Spannable {
    val spannableString = SpannableString(originalText)

    if (originalText.isSingleLinkMatchingText(links)) {
        spannableString.setSpan(
            TextLinkSpan(linkColor) { links[0].onLinkTapped.invoke() },
            0,
            originalText.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    } else if (originalText.containsAnyLink(links)) {
        links.forEach { link ->
            val start = originalText.indexOf(link.text)
            if (start >= 0) {
                val end = start + link.text.length
                spannableString.setSpan(
                    TextLinkSpan(linkColor) { link.onLinkTapped.invoke() },
                    start,
                    end,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            } else {
                // todo show error while matching specific link
            }
        }
    } else {
        // todo show error while matching links, returning spannable without links
    }
    return spannableString
}

private fun String.containsAnyLink(links: List<Link>): Boolean {
    return links.any { link -> contains(link.text) }
}

private fun String.isSingleLinkMatchingText(links: List<Link>): Boolean {
    return links.size == 1 && this == links[0].text
}*/