package com.telefonica.mistica.compose.input

import androidx.annotation.VisibleForTesting
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.telefonica.mistica.R
import java.lang.reflect.Modifier.PRIVATE

@VisibleForTesting(otherwise = PRIVATE)
internal const val TOGGLE_VISIBILITY_TEST_TAG = "ToggleVisibility"

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

@Composable
private fun PasswordVisibleIcon(
    passwordVisible: Boolean,
    onIconClicked: (Boolean) -> Unit,
    showContentDescription: String? = null,
    hideContentDescription: String? = null,
) {
    IconToggleButton(
        checked = passwordVisible,
        onCheckedChange = onIconClicked,
        modifier = Modifier.testTag(TOGGLE_VISIBILITY_TEST_TAG),
    ) {
        Icon(
            painter = if (passwordVisible) {
                painterResource(id = R.drawable.icn_visibility_off)
            } else {
                painterResource(id = R.drawable.icn_visibility)
            },
            contentDescription = if (passwordVisible) hideContentDescription else showContentDescription,
        )
    }
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

@Preview(showBackground = true)
@Composable
fun PreviewPasswordVisibleIconVisible() {
    PasswordVisibleIcon(
        passwordVisible = true,
        onIconClicked = {},
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPasswordVisibleIconInVisible() {
    PasswordVisibleIcon(
        passwordVisible = false,
        onIconClicked = {},
    )
}

