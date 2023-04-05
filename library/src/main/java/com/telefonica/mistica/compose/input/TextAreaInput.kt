package com.telefonica.mistica.compose.input

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
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
    label: String,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    onClick: (() -> Unit)? = null,
    maxChars: Int = Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    var currentChars by remember {
        mutableStateOf(0)
    }

    TextInputImpl(
        modifier = modifier,
        value = value,
        onValueChange = { newValue ->
            val text = if (newValue.length > maxChars) newValue.substring(startIndex = 0, endIndex = maxChars) else newValue
            currentChars = text.length
            onValueChange(text)
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
            if (maxChars < Int.MAX_VALUE) {
                CharsCounter(current = currentChars, max = maxChars)
            }
        },
        keyboardOptions = keyboardOptions.copy(imeAction = ImeAction.None)
            .toFoundationKeyboardOptions(KeyboardType.Text),
    )
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
