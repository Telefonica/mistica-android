package com.telefonica.mistica.compose.input

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PasswordInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    onClick: (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    var passwordVisible by remember {
        mutableStateOf(false)
    }

    TextInputImpl(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = label,
        helperText = helperText,
        isError = isError,
        errorText = errorText,
        trailingIcon = {
            PasswordVisibleIcon(
                passwordVisible = passwordVisible,
                onIconClicked = { passwordVisible = !passwordVisible },
                showContentDescription = "Show",
                hideContentDescription = "Hide",
            )
        },
        isInverse = isInverse,
        enabled = enabled,
        readOnly = readOnly,
        onClick = onClick,
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardOptions = keyboardOptions.toFoundationKeyboardOptions(KeyboardType.Password),
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewEmptyPasswordInput() {
    PasswordInput(
        value = "",
        onValueChange = {},
        label = "empty",
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPasswordInput() {
    PasswordInput(
        value = "value",
        onValueChange = {},
        label = "label",
    )
}
