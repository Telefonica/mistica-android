package com.telefonica.mistica.compose.input

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun EmailInput(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isInverse: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    TextInputImpl(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = label,
        helperText = helperText,
        isError = isError,
        errorText = errorText,
        trailingIcon = trailingIcon,
        isInverse = isInverse,
        keyboardOptions = keyboardOptions.toFoundationKeyboardOptions(
            keyboardType = KeyboardType.Email
        )
    )
}