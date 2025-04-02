package com.telefonica.mistica.link

import android.content.Context
import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.annotation.ColorInt
import androidx.appcompat.widget.AppCompatTextView
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

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
    private var linkColor: Int

    private var linkTextView: AppCompatTextView

    init {
        LayoutInflater.from(context).inflate(R.layout.text_link_view, this, true)

        // todo - check if it is inverse or not
        linkColor = context.getThemeColor(R.attr.colorTextLink)

        linkTextView = findViewById(R.id.link_text_view)

        linkTextView.movementMethod = LinkMovementMethod.getInstance()
        linkTextView.highlightColor = Color.TRANSPARENT
    }

    fun setTextLink(linkText: String, onLinkTapped: () -> Unit) {
        linkTextView.text = getSpannableLinkText(
            originalText = linkText,
            links = listOf(
                Link(
                    text = linkText,
                    onLinkTapped = onLinkTapped,
                )
            )
        )
    }

    fun setTextWithLinks(originalText: String, links: List<Link>) {
        linkTextView.text = getSpannableLinkText(originalText, links)
    }

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
    }
}

private const val TAG = "Link"

data class Link(val text: String, val tag: String = TAG, val onLinkTapped: () -> Unit)
