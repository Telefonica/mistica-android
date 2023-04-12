package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CheckBoxInput(
    text: String,
    modifier: Modifier = Modifier,
    links: List<TextLink> = emptyList(),
    errorText: String? = null,
    checked: Boolean = false,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit = {},
) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
            )
            TextWithLinks(text, links)
        }
        Underline(
            isError = errorText?.isNotEmpty() ?: false,
            errorText = errorText,
            helperText = null,
            underlineEnd = null,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCheckBoxInput() {
    CheckBoxInput(
        text = "hola caracola",
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCheckBoxLongTextInput() {
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
    CheckBoxInput(
        text = message,
        links = links,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewDisabledCheckBoxInput() {
    CheckBoxInput(
        text = "Disabled checkbox",
        enabled = false,
    )
}
