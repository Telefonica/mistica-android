package com.telefonica.mistica.compose.input

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun CharsCounter(
    current: Int,
    max: LimitCharacters.Limited,
    modifier: Modifier = Modifier,
    isError: Boolean = false,
) {
    Text(
        text = "$current/${max.characterLimit}",
        color = if (isError) MisticaTheme.colors.error else MisticaTheme.colors.textSecondary,
        textAlign = TextAlign.End,
        style = MisticaTheme.typography.preset1,
        modifier = modifier.testTag(TextInputTestTags.END_HELPER_TEXT),
    )
}

sealed interface LimitCharacters {
    object Unlimited : LimitCharacters
    data class Limited(val characterLimit: Int) : LimitCharacters
}
