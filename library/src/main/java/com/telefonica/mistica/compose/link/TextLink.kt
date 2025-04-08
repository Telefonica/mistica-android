package com.telefonica.mistica.compose.link

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun TextLink(
    originalText: String,
    links: List<MultiLink>,
    modifier: Modifier = Modifier,
) {
    val textLinkColour = MisticaTheme.colors.textLink
    val linksText = remember { getAnnotatedLinksString(originalText = originalText, links = links, linkColor = textLinkColour) }

    BasicText(
        text = linksText,
        style = MisticaTheme.typography.preset3,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextWithLinks() {
    val message =
        "I have read and agree to the promotion's Legal Grounds and Privacy Policy legal warning. (Tap on links to show error)."
    val links = listOf(
        MultiLink(
            linkedText = "Legal Grounds",
            onLinkTapped = {},
        ),
        MultiLink(
            linkedText = "Privacy Policy",
            onLinkTapped = {},
        ),
    )
    TextLink(
        originalText = message,
        links = links,
        modifier = Modifier.padding(16.dp),
    )
}
