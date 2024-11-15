package com.telefonica.mistica.compose.input

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
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
    label: String?,
    helperText: String?,
    isError: Boolean,
    errorText: String?,
    trailingIcon: @Composable (() -> Unit)?,
    isInverse: Boolean,
    enabled: Boolean,
    readOnly: Boolean,
    testTag: String,
    isTextArea: Boolean = false,
    onClick: (() -> Unit)?,
    visualTransformation: VisualTransformation,
    keyboardOptions: FoundationKeyboardOptions,
    underlineEnd: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
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
            leadingIcon = leadingIcon,
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
                }.testTag(testTag),
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
    label: String?,
    isError: Boolean,
    leadingIcon: @Composable (() -> Unit)?,
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
        label = label?.let {
            {
                val transformedText = remember(value) {
                    visualTransformation.filter(AnnotatedString(value))
                }
                TextInputLabel(
                    modifier = Modifier.testTag(TextInputTestTags.LABEL),
                    text = it,
                    inputIsNotEmpty = transformedText.text.isNotEmpty(),
                    isFocused = interactionSource.collectIsFocusedAsState().value,
                    isError = isError,
                )
            }
        },
        interactionSource = interactionSource,
        keyboardOptions = keyboardOptions,
        isError = isError,
        leadingIcon = leadingIcon?.let { icon ->
            {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .testTag(TextInputTestTags.START_ICON)
                ) {
                    icon()
                }
            }
        },
        trailingIcon = trailingIcon?.let { icon ->
            {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .testTag(TextInputTestTags.END_ICON)
                ) {
                    icon()
                }
            }
        },
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
    // Setting every Mistica preset separately except its fontSize.
    // We will rely on default fontSize values from Material so minimize/maximize
    // label animation is not broken. It would require to have
    // intermediate preset sizes to mimic the same animation
    Text(
        text = text,
        color = when {
            isError && isMinimized -> MisticaTheme.colors.error
            isFocused -> MisticaTheme.colors.textActivated
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
        leadingIcon = { },
        trailingIcon = { },
        isInverse = false,
        enabled = true,
        readOnly = false,
        testTag = "",
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
        leadingIcon = { },
        trailingIcon = { },
        isInverse = false,
        enabled = true,
        readOnly = false,
        testTag = "",
        onClick = { },
        visualTransformation = VisualTransformation.None,
        keyboardOptions = FoundationKeyboardOptions(),
    )
}
