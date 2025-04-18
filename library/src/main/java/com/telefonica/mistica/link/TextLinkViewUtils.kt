package com.telefonica.mistica.link

import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan
import android.util.Log
import androidx.annotation.ColorInt
import com.telefonica.mistica.link.MultiLink.DefaultMultiLink
import com.telefonica.mistica.link.MultiLink.CustomMultiLink

private const val WARNING_TAG = "TextLinkUtils"

/**
 * Creates a [Spannable] string with clickable links for classic View implementation.
 */
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
                    when (link) {
                        is DefaultMultiLink -> TextLinkSpan(linkColor) { link.onLinkTapped.invoke() }
                        is CustomMultiLink -> link.customSpan
                    },
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

sealed class MultiLink(open val linkedText: String) {
    data class DefaultMultiLink(
        override val linkedText: String,
        val onLinkTapped: () -> Unit
    ) : MultiLink(linkedText)

    data class CustomMultiLink(
        override val linkedText: String,
        val customSpan: ClickableSpan,
    ) : MultiLink(linkedText)
}

sealed class SingleLink {
    data class DefaultSingleLink(val onLinkTapped: () -> Unit) : SingleLink()
    data class CustomSingleLink(val customSpan: ClickableSpan) : SingleLink()
}

