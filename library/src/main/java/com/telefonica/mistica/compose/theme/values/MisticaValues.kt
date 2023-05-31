package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import com.telefonica.mistica.compose.title.TitleStyle

class MisticaValues(
    titleStyle: TitleStyle = TitleStyle.TITLE_1,
) {

    var titleStyle by mutableStateOf(titleStyle, structuralEqualityPolicy())
        private set

    fun copy(
        titleStyle: TitleStyle = this.titleStyle,
    ) = MisticaValues(
        titleStyle,
    )

    fun updateWith(
        other: MisticaValues,
    ) {
        titleStyle = other.titleStyle
    }
}

internal val LocalMisticaValues = staticCompositionLocalOf { MisticaValues() }
