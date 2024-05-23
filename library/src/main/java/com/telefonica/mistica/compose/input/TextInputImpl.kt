package com.telefonica.mistica.compose.input

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.ui.alpha
import androidx.compose.foundation.text.KeyboardOptions as FoundationKeyboardOptions

@Composable
internal fun TextInputImpl(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    helperText: String?,
    isError: Boolean,
    errorText: String?,
    trailingIcon: @Composable (() -> Unit)?,
    isInverse: Boolean,
    enabled: Boolean,
    readOnly: Boolean,
    isTextArea: Boolean = false,
    onClick: (() -> Unit)?,
    visualTransformation: VisualTransformation,
    keyboardOptions: FoundationKeyboardOptions,
    underlineEnd: @Composable (() -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .alpha(enabled),
    ) {
        TextBox(
            value = value,
            onValueChange = onValueChange,
            label = label,
            isError = isError,
            trailingIcon = trailingIcon,
            enabled = enabled,
            readOnly = readOnly,
            onClick = onClick,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            singleLine = !isTextArea,
            modifier = Modifier.then(
                if (isTextArea) {
                    Modifier.height(152.dp)
                } else {
                    Modifier
                },
            ),
        )
        Underline(
            isError = isError,
            errorText = errorText,
            helperText = helperText,
            isInverse = isInverse,
            underlineEnd = underlineEnd,
        )
    }
}

@Composable
private fun TextBox(
    value: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    label: String,
    isError: Boolean,
    trailingIcon: @Composable (() -> Unit)?,
    enabled: Boolean,
    readOnly: Boolean,
    onClick: (() -> Unit)?,
    visualTransformation: VisualTransformation,
    keyboardOptions: FoundationKeyboardOptions,
    singleLine: Boolean = false,
) {
    val interactionSource = remember {
        MutableInteractionSource()
    }

    if (onClick != null && interactionSource.collectIsPressedAsState().value) {
        onClick()
    }

    TextField(
        modifier = modifier
            .testTag(TextInputTestTags.TEXT_INPUT)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = MisticaTheme.colors.border,
                shape = RoundedCornerShape(MisticaTheme.radius.inputBorderRadius)
            ),
        enabled = enabled,
        readOnly = readOnly,
        value = value,
        onValueChange = onValueChange,
        label = {
            val transformedText = remember(value) {
                visualTransformation.filter(AnnotatedString(value))
            }
            TextInputLabel(
                text = label,
                inputIsNotEmpty = transformedText.text.isNotEmpty(),
                isFocused = interactionSource.collectIsFocusedAsState().value,
                isError = isError,
            )
        },
        interactionSource = interactionSource,
        keyboardOptions = keyboardOptions,
        isError = isError,
        trailingIcon = trailingIcon,
        shape = RoundedCornerShape(MisticaTheme.radius.inputBorderRadius),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MisticaTheme.colors.backgroundContainer,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            errorCursorColor = MisticaTheme.colors.controlActivated,
        ),
        singleLine = singleLine,
        maxLines = if (singleLine) 1 else Int.MAX_VALUE,
        visualTransformation = visualTransformation,
    )
}

@Composable
private fun TextInputLabel(
    text: String,
    inputIsNotEmpty: Boolean,
    isFocused: Boolean,
    isError: Boolean,
    modifier: Modifier = Modifier,
) {
    val isMinimized = inputIsNotEmpty || isFocused
    val preset = if (isMinimized) {
        MisticaTheme.typography.preset1
    } else {
        MisticaTheme.typography.preset3
    }
    Text(
        text = text,
        color = when {
            isError && isMinimized -> MisticaTheme.colors.error
            isFocused -> MisticaTheme.colors.controlActivated
            else -> MisticaTheme.colors.textSecondary
        },
        fontFamily = preset.fontFamily,
        fontWeight = preset.fontWeight,
        lineHeight = preset.lineHeight,
        letterSpacing = preset.letterSpacing,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextInput() {
    TextInputImpl(
        value = "value",
        onValueChange = {},
        label = "label",
        helperText = "helperText",
        isError = false,
        errorText = "",
        trailingIcon = { },
        isInverse = false,
        enabled = true,
        readOnly = false,
        onClick = { },
        visualTransformation = VisualTransformation.None,
        keyboardOptions = FoundationKeyboardOptions(),
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewEmptyTextInput() {
    TextInputImpl(
        value = "",
        onValueChange = {},
        label = "label",
        helperText = "helperText",
        isError = false,
        errorText = "",
        trailingIcon = { },
        isInverse = false,
        enabled = true,
        readOnly = false,
        onClick = { },
        visualTransformation = VisualTransformation.None,
        keyboardOptions = FoundationKeyboardOptions(),
    )
}
