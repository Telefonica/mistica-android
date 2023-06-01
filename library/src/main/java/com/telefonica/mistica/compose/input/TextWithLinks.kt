package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
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
    val linksText = remember { getAnnotatedLinksString(text = text, links = links, highlightColor = textLinkColour) }
    ClickableText(
        text = linksText,
        style = MisticaTheme.typography.preset3,
        modifier = modifier,
        onClick = { offset ->
            links.forEach { textLink ->
                linksText.getStringAnnotations(
                    tag = textLink.link,
                    start = offset,
                    end = offset,
                ).firstOrNull()?.let {
                    textLink.onLinkTapped()
                }
            }
        },
    )
}

internal fun getAnnotatedLinksString(
    text: String,
    links: List<TextLink>,
    highlightColor: Color,
): AnnotatedString = buildAnnotatedString {
    val toHighlight: List<String> = links.map { it.link }
    val toHighlightRegex =
        toHighlight.joinToString(separator = "|").toRegex()
    val notHighlights = getNotHighlightedElements(text, toHighlightRegex)
    if (toHighlight.isNotEmpty()) {
        notHighlights.zip(toHighlight + "") { message, highlight ->
            append(message)
            addHighlightedChunk(highlight, highlightColor)
        }
    } else {
        append(text)
    }
}

private fun getNotHighlightedElements(
    substring: String,
    toHighlightRegex: Regex,
) = substring.split(toHighlightRegex)

private fun AnnotatedString.Builder.addHighlightedChunk(
    highlight: String,
    highlightColor: Color,
) {
    if (highlight.isNotEmpty()) {
        highlight(
            text = highlight,
            tag = highlight,
            highlightColor = highlightColor,
        )
    }
}

private fun AnnotatedString.Builder.highlight(
    text: String,
    tag: String,
    textTransformation: (String) -> String = { it },
    highlightColor: Color,
) {
    pushStringAnnotation(
        tag = tag,
        annotation = text,
    )
    highlightText(textTransformation(text), highlightColor)
    pop()
}

private fun AnnotatedString.Builder.highlightText(
    highlight: String,
    highlightColor: Color,
) {
    withStyle(
        style = SpanStyle(
            color = highlightColor,
            textDecoration = TextDecoration.Underline,
        ),
    ) {
        append(highlight)
    }
}

data class TextLink(val link: String, val onLinkTapped: () -> Unit)

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
