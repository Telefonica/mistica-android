package com.telefonica.mistica.compose.ui

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

fun Modifier.alpha(enabled: Boolean): Modifier =
    if (enabled) {
        alpha(ENABLED_ALPHA)
    } else {
        alpha(DISABLED_ALPHA)
    }

private const val ENABLED_ALPHA = 1F
private const val DISABLED_ALPHA = 0.5F