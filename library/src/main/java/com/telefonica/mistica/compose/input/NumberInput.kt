package com.telefonica.mistica.compose.input

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun NumberInput(
    modifier: Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String?,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    onClick: (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
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
        enabled = enabled,
        readOnly = readOnly,
        onClick = onClick,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions.toFoundationKeyboardOptions(
            keyboardType = KeyboardType.Decimal
        )
    )

}