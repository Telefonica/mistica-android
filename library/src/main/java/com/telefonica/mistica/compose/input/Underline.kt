package com.telefonica.mistica.compose.input

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun Underline(
    isError: Boolean,
    errorText: String?,
    helperText: String?,
    isInverse: Boolean,
    underlineEnd: @Composable (() -> Unit)?,
) {
    val colors = if (isInverse) {
        UnderlineTextColors(
            errorTextColor = MisticaTheme.colors.textPrimaryInverse,
            helperTextColor = MisticaTheme.colors.textPrimaryInverse,
        )
    } else {
        UnderlineTextColors(
            errorTextColor = MisticaTheme.colors.error,
            helperTextColor = MisticaTheme.colors.textSecondary,
        )
    }
    CompositionLocalProvider(LocalUnderlineTextColors provides colors) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Box {
                UnderlineTextAnimatedVisibility(
                    isError = isError,
                    visible = !isError && helperText != null,
                    text = helperText,
                    color = LocalUnderlineTextColors.current.helperTextColor,
                )
                UnderlineTextAnimatedVisibility(
                    isError = isError,
                    visible = isError && errorText != null,
                    text = errorText,
                    color = LocalUnderlineTextColors.current.errorTextColor,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            underlineEnd?.let {
                Box(Modifier.padding(top = 4.dp, start = 14.dp, end = 14.dp)) {
                    underlineEnd()
                }
            }
        }
    }
}

@Composable
private fun UnderlineTextAnimatedVisibility(
    isError: Boolean,
    visible: Boolean,
    text: String?,
    color: Color,
) {
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically() + fadeIn(),
        exit = fadeOut(animationSpec = tween(0)),
    ) {
        if (text != null) {
            UnderlineText(
                modifier = Modifier.testTag(
                    if (isError) {
                        TextInputTestTags.ERROR_TEXT
                    } else {
                        TextInputTestTags.HELPER_TEXT
                    }
                ),
                text = text,
                color = color,
            )
        }
    }
}

@Composable
private fun UnderlineText(
    modifier: Modifier,
    text: String,
    color: Color,
) {
    Text(
        modifier = modifier.padding(top = 4.dp, start = 14.dp, end = 14.dp),
        text = text,
        style = MisticaTheme.typography.preset1,
        color = color,
    )
}

private data class UnderlineTextColors(
    val errorTextColor: Color = Color.Unspecified,
    val helperTextColor: Color = Color.Unspecified,
)

private val LocalUnderlineTextColors = compositionLocalOf { UnderlineTextColors() }

@Preview(showBackground = true)
@Composable
fun PreviewUnderlineErrorText() {
    Underline(
        isError = true,
        errorText = "Error",
        helperText = "Helper text",
        isInverse = false,
        underlineEnd = null,
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewUnderlineHelperText() {
    Underline(
        isError = false,
        errorText = null,
        helperText = "Helper text",
        isInverse = false,
        underlineEnd = null,
    )
}
