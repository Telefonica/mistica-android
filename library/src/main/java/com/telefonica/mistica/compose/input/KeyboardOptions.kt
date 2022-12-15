package com.telefonica.mistica.compose.input

import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions as FoundationKeyboardOptions

data class KeyboardOptions(
    val capitalization: KeyboardCapitalization = KeyboardCapitalization.None,
    val autoCorrect: Boolean = true,
    val imeAction: ImeAction = ImeAction.Default
) {
    companion object {
        val Default = KeyboardOptions()
    }
}

internal fun KeyboardOptions.toFoundationKeyboardOptions(
    keyboardType: KeyboardType
): FoundationKeyboardOptions =
    FoundationKeyboardOptions(
        capitalization = capitalization,
        autoCorrect = autoCorrect,
        keyboardType = keyboardType,
        imeAction = imeAction
    )