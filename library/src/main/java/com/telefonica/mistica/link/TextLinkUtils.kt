package com.telefonica.mistica.link

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import androidx.annotation.ColorInt

fun getSpannableLinkText(
    originalText: String,
    links: List<Link>,
    @ColorInt linkColor: Int? = null,
): Spannable {
    val spannableString = SpannableString(originalText)

    if (originalText.containsAnyLink(links)) {
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

private const val TAG = "Link"

data class Link(val text: String, val tag: String = TAG, val onLinkTapped: () -> Unit)
