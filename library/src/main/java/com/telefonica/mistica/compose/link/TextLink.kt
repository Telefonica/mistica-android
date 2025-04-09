package com.telefonica.mistica.compose.link

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun TextLink(
    originalText: String,
    link: SingleLink,
    modifier: Modifier = Modifier,
    linkColor: Color = MisticaTheme.colors.textLink,
    textStyle: TextStyle = MisticaTheme.typography.preset2Medium,
) {
    TextLink(
        originalText = originalText,
        links = listOf(MultiLink(originalText, link.tag, link.onLinkTapped)),
        modifier = modifier,
        linkColor = linkColor,
        textStyle = textStyle,
    )
}

@Composable
fun TextLink(
    originalText: String,
    links: List<MultiLink>,
    modifier: Modifier = Modifier,
    linkColor: Color = MisticaTheme.colors.textLink,
    textStyle: TextStyle = MisticaTheme.typography.preset2Medium,
) {
    val linksText = remember { getAnnotatedLinksString(originalText = originalText, links = links, linkColor = linkColor) }

    BasicText(
        text = linksText,
        style = textStyle,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSingleLink() {
    val message =
        "Single link"
    TextLink(
        originalText = message,
        link = SingleLink {},
        modifier = Modifier.padding(16.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMultiLinks() {
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
