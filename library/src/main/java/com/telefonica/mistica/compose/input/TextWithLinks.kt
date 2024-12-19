package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun TextWithLinks(
    text: String,
    links: List<TextLink>,
    modifier: Modifier = Modifier,
) {
    val textLinkColour = MisticaTheme.colors.textLink
    val linksText = remember { getAnnotatedLinksString(originalText = text, links = links, highlightColor = textLinkColour) }

    BasicText(
        text = linksText,
        style = MisticaTheme.typography.preset3,
        modifier = modifier,
    )
}

fun getAnnotatedLinksString(
    originalText: String,
    links: List<TextLink>,
    highlightColor: Color,
) = buildAnnotatedString {
    val linkMap = links.associateBy { it.link }
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
                    styles = TextLinkStyles(style = SpanStyle(color = highlightColor)),
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

data class TextLink(val link: String, val tag: String = TAG, val onLinkTapped: () -> Unit)

private const val TAG = "TextWithLinks"

@Preview(showBackground = true)
@Composable
fun PreviewTextWithLinks() {
    val message =
        "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error)."
    val links = listOf(
        TextLink(
            link = "Legal Grounds",
            onLinkTapped = {},
        ),
        TextLink(
            link = "Privacy Policy",
            onLinkTapped = {},
        ),
    )
    TextWithLinks(
        text = message,
        links = links,
        modifier = Modifier.padding(16.dp),
    )
}
