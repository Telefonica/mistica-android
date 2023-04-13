package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.LocalMinimumTouchTargetEnforcement
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CheckBoxInput(
    text: String,
    modifier: Modifier = Modifier,
    links: List<TextLink> = emptyList(),
    errorText: String? = null,
    checked: Boolean = false,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit = {},
) {
    Column(modifier = modifier) {
        Row {
            CompositionLocalProvider(LocalMinimumTouchTargetEnforcement provides false) {
                Checkbox(
                    checked = checked,
                    onCheckedChange = onCheckedChange,
                    enabled = enabled,
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            TextWithLinks(text, links)
        }
        Underline(
            isError = errorText?.isNotEmpty() ?: false,
            errorText = errorText,
            helperText = null,
            isInverse = isInverse,
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
