package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.ui.alpha

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
    Column(
        modifier = modifier.alpha(enabled)
    ) {
        Row(modifier = Modifier.toggleable(
            value = checked,
            onValueChange = onCheckedChange,
            role = Role.Checkbox
        )) {
            Checkbox(
                modifier = Modifier.testTag(CheckBoxInputTestTags.CHECKBOX),
                checked = checked,
                onCheckedChange = null,
                enabled = enabled,
                colors = CheckboxDefaults.colors(
                    checkedColor = MisticaTheme.colors.controlActivated,
                    uncheckedColor = MisticaTheme.colors.control,
                    disabledColor = if (checked) {
                        MisticaTheme.colors.controlActivated
                    } else {
                        MisticaTheme.colors.control
                    }
                )
            )
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

object CheckBoxInputTestTags {
    const val CHECKBOX = "checkbox"
}