package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.telefonica.mistica.compose.title.TitleStyle

class MisticaValues {

    var titleStyle by mutableStateOf(TitleStyle.TITLE_1, structuralEqualityPolicy())
        private set

    fun updateWith(
        titleStyle: TitleStyle,
    ) {
        this.titleStyle = titleStyle
    }
}

internal val LocalMisticaValues = staticCompositionLocalOf { MisticaValues() }
