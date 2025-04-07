package com.telefonica.mistica.link

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.util.Log
import androidx.annotation.ColorInt

private const val WARNING_TAG = "TextLinkUtils"

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
                Log.w(WARNING_TAG, "Link \"${link.linkedText}\" not found in text \"$originalText\".")
            }
        }
    } else {
        Log.w(
            WARNING_TAG, "None of the provided links match the text:" +
                    "\n- Links: $links" +
                    "\n Provided text: \"$originalText\"."
        )
    }
    return spannableString
}

private fun String.containsAnyLink(links: List<MultiLink>): Boolean {
    return links.any { link -> contains(link.linkedText) }
}

private const val LINK_TAG = "Link"

data class MultiLink(val linkedText: String, val tag: String = LINK_TAG, val onLinkTapped: () -> Unit)
data class SingleLink(val tag: String = LINK_TAG, val onLinkTapped: () -> Unit)
