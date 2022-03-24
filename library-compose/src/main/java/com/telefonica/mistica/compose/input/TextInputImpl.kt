package com.telefonica.mistica.compose.input

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions as FoundationKeyboardOptions
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun TextInputImpl(
    modifier: Modifier,
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
    onClick: (() -> Unit)?,
    visualTransformation: VisualTransformation,
    keyboardOptions: FoundationKeyboardOptions,
) {
    val colors = if (isInverse) {
        TextInputColors(
            errorTextColor = MisticaTheme.colors.textPrimaryInverse,
            helperTextColor = MisticaTheme.colors.textPrimaryInverse,
        )
    } else {
        TextInputColors(
            errorTextColor = MisticaTheme.colors.error,
            helperTextColor = MisticaTheme.colors.textSecondary,
        )
    }
    CompositionLocalProvider(LocalTextInputColors provides colors) {
        Column(modifier = modifier) {
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
                keyboardOptions = keyboardOptions
            )
            Underline(
                isError = isError,
                errorText = errorText,
                helperText = helperText
            )
        }
    }
}

@Composable
private fun TextBox(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isError: Boolean,
    trailingIcon: @Composable (() -> Unit)?,
    enabled: Boolean,
    readOnly: Boolean,
    onClick: (() -> Unit)?,
    visualTransformation: VisualTransformation,
    keyboardOptions: FoundationKeyboardOptions,
) {
    val interactionSource = remember {
        MutableInteractionSource()
    }

    if (onClick != null && interactionSource.collectIsPressedAsState().value) {
        onClick()
    }

    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = MisticaTheme.colors.border, shape = RoundedCornerShape(4.dp)),
        enabled = enabled,
        readOnly = readOnly,
        value = value,
        onValueChange = onValueChange,
        label = {
            TextInputLabel(
                text = label,
                isMinimized = interactionSource.collectIsFocusedAsState().value,
                isError = isError
            )
        },
        interactionSource = interactionSource,
        keyboardOptions = keyboardOptions,
        isError = isError,
        trailingIcon = trailingIcon,
        shape = MaterialTheme.shapes.small,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MisticaTheme.colors.backgroundContainer,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            errorCursorColor = MisticaTheme.colors.controlActive,
        ),
        singleLine = true,
        maxLines = 1,
        visualTransformation = visualTransformation,
    )
}

@Composable
private fun Underline(
    isError: Boolean,
    errorText: String?,
    helperText: String?,
) {
    Box {
        UnderlineTextAnimatedVisibility(
            visible = !isError && helperText != null,
            text = helperText,
            color = LocalTextInputColors.current.helperTextColor
        )
        UnderlineTextAnimatedVisibility(
            visible = isError && errorText != null,
            text = errorText,
            color = LocalTextInputColors.current.errorTextColor
        )
    }
}

@Composable
private fun UnderlineTextAnimatedVisibility(
    visible: Boolean,
    text: String?,
    color: Color
) {
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically() + fadeIn(),
        exit = fadeOut(animationSpec = tween(0))
    ) {
        if (text != null) {
            UnderlineText(text = text, color = color)
        }
    }
}

@Composable
private fun UnderlineText(
    text: String,
    color: Color
) {
    Text(
        modifier = Modifier.padding(top = 4.dp, start = 14.dp, end = 14.dp),
        text = text,
        style = MisticaTheme.typography.preset1,
        color = color
    )
}

@Composable
private fun TextInputLabel(
    text: String,
    isMinimized: Boolean,
    isError: Boolean
) {
    Text(
        text = text,
        color = when {
            isError && isMinimized-> MisticaTheme.colors.error
            isMinimized -> MisticaTheme.colors.controlActive
            else -> MisticaTheme.colors.textSecondary
        }
    )
}

private data class TextInputColors(
    val errorTextColor: Color = Color.Unspecified,
    val helperTextColor: Color = Color.Unspecified
)

private val LocalTextInputColors = compositionLocalOf { TextInputColors() }