package com.telefonica.mistica.compose.link

import android.text.Spannable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

/**
 * Creates a [Spannable] string with clickable links for Jetpack Compose implementation.
 */
fun getAnnotatedLinksString(
    originalText: String,
    links: List<MultiLink>,
    linkColor: Color,
) = buildAnnotatedString {
    val linkMap = links.associateBy { it.linkedText }
    var currentIndex = 0

    while (currentIndex < originalText.length) {
        val linkEntry = linkMap.entries.find { (linkText, _) ->
            originalText.startsWith(linkText, currentIndex)
        }

        if (linkEntry != null) {
            val (linkText, link) = linkEntry
            withLink(
                link = LinkAnnotation.Clickable(
                    tag = link.tag,
                    styles = TextLinkStyles(style = SpanStyle(color = linkColor)),
                    linkInteractionListener = { link.onLinkTapped.invoke() },
                ),
            ) {
                append(linkText)
            }
            currentIndex += linkText.length
        } else {
            append(originalText[currentIndex].toString())
            currentIndex++
        }
    }
}

private const val LINK_TAG = "Link"

data class MultiLink(val linkedText: String, val tag: String = LINK_TAG, val onLinkTapped: () -> Unit)
data class SingleLink(val tag: String = LINK_TAG, val onLinkTapped: () -> Unit)
