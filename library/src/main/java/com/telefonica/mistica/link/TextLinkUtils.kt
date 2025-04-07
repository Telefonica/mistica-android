package com.telefonica.mistica.link

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import androidx.annotation.ColorInt

fun getSpannableLinkText(
    originalText: String,
    links: List<MultiLink>,
    @ColorInt linkColor: Int? = null,
): Spannable {
    val spannableString = SpannableString(originalText)

    if (originalText.containsAnyLink(links)) {
        links.forEach { link ->
            val start = originalText.indexOf(link.linkedText)
            if (start >= 0) {
                val end = start + link.linkedText.length
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

private fun String.containsAnyLink(links: List<MultiLink>): Boolean {
    return links.any { link -> contains(link.linkedText) }
}

private const val TAG = "Link"

data class MultiLink(val linkedText: String, val tag: String = TAG, val onLinkTapped: () -> Unit)
data class SingleLink(val tag: String = TAG, val onLinkTapped: () -> Unit)
