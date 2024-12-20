package com.telefonica.mistica.compose.input

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun SearchInput(
    value: String,
    onValueChange: (String) -> Unit,
    label: String?,
    modifier: Modifier = Modifier,
    helperText: String? = null,
    isError: Boolean = false,
    errorText: String? = null,
    isInverse: Boolean = false,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    onClick: (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
) {
    TextInputImpl(
        modifier = modifier,
        testTag = TextInputTestTags.SEARCH_INPUT,
        value = value,
        onValueChange = onValueChange,
        label = label,
        helperText = helperText,
        isError = isError,
        errorText = errorText,
        isInverse = isInverse,
        enabled = enabled,
        readOnly = readOnly,
        onClick = onClick,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions.toFoundationKeyboardOptions(
            keyboardType = KeyboardType.Text
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search_regular),
                tint = MisticaTheme.colors.neutralHigh,
                contentDescription = null
            )
        },
        trailingIcon = {
            IconButton(
                modifier = Modifier.testTag(TextInputTestTags.CLEAR_SEARCH_BUTTON),
                onClick = {
                    onValueChange("")
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_close_regular),
                    tint = MisticaTheme.colors.neutralHigh,
                    contentDescription = stringResource(id = R.string.clear_search_content_description),
                )
            }
        }
    )
}