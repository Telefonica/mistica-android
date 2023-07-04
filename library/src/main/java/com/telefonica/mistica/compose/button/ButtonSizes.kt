package com.telefonica.mistica.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

internal class ButtonSizeConfig(
    val textStyle: TextStyle,
    val height: Dp,
    val minWidth: Dp,
    val iconSize: Dp,
    val progressBarSize: Dp,
    val progressBarStroke: Dp,
    val contentPadding: Dp,
)

@Composable
internal fun ButtonStyle.getButtonSizeCompose(): ButtonSizeConfig =
    when (this) {
        ButtonStyle.DANGER_SMALL,
        ButtonStyle.PRIMARY_SMALL_INVERSE,
        ButtonStyle.PRIMARY_SMALL,
        ButtonStyle.SECONDARY_SMALL_INVERSE,
        ButtonStyle.SECONDARY_SMALL,
        ButtonStyle.LINK,
        ButtonStyle.LINK_INVERSE,
        -> getSmallButtonSizeConfig()
        else -> getDefaultButtonSizeConfig()
    }

@Composable
private fun getDefaultButtonSizeConfig() = ButtonSizeConfig(
    textStyle = MisticaTheme.typography.presetButton,
    height = 48.dp,
    minWidth = 136.dp,
    iconSize = 24.dp,
    progressBarSize = 20.dp,
    progressBarStroke = 2.dp,
    contentPadding = 16.dp
)

@Composable
private fun getSmallButtonSizeConfig() = ButtonSizeConfig(
    textStyle = MisticaTheme.typography.presetSmallButton,
    height = 32.dp,
    minWidth = 104.dp,
    iconSize = 16.dp,
    progressBarSize = 16.dp,
    progressBarStroke = 1.dp,
    contentPadding = 12.dp
)