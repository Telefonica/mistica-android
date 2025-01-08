package com.telefonica.mistica.compose.input

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextAreaInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String?,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    onClick: (() -> Unit)? = null,
    maxChars: LimitCharacters = LimitCharacters.Unlimited,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    var currentChars by remember {
        mutableIntStateOf(0)
    }

    TextInputImpl(
        modifier = modifier,
        testTag = TextInputTestTags.TEXT_INPUT,
        value = value,
        onValueChange = { newValue ->
            currentChars = doOnValueChange(maxChars, newValue, onValueChange)
        },
        label = label,
        helperText = helperText,
        isError = isError,
        errorText = errorText,
        trailingIcon = trailingIcon,
        isInverse = isInverse,
        enabled = enabled,
        readOnly = readOnly,
        onClick = onClick,
        isTextArea = true,
        visualTransformation = visualTransformation,
        underlineEnd = {
            if (maxChars is LimitCharacters.Limited) {
                CharsCounter(
                    current = currentChars,
                    max = maxChars,
                    isError = isError,
                )
            }
        },
        keyboardOptions = keyboardOptions.copy(imeAction = ImeAction.None)
            .toFoundationKeyboardOptions(KeyboardType.Text),
    )
}

private fun doOnValueChange(
    maxChars: LimitCharacters,
    newValue: String,
    onValueChange: (String) -> Unit,
): Int {
    return if (maxChars is LimitCharacters.Limited) {
        val text = if (newValue.length > maxChars.characterLimit) {
            newValue.substring(startIndex = 0, endIndex = maxChars.characterLimit)
        } else {
            newValue
        }
        onValueChange(text)
        text.length
    } else {
        onValueChange(newValue)
        newValue.length
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEmptyTextAreaInput() {
    TextAreaInput(
        value = "",
        onValueChange = {},
        label = "empty",
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextAreaInput() {
    TextAreaInput(
        value = "value",
        onValueChange = {},
        label = "label",
        helperText = "helper",
    )
}
