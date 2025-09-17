@file:OptIn(ExperimentalMaterialApi::class) // Required for RippleConfiguration usage

package com.telefonica.mistica.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.RippleDefaults
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme

internal class ButtonStyleConfig(
    val buttonColors: ButtonColors,
    val textColor: Color,
    val disabledTextColor: Color = textColor,
    val border: BorderStroke? = null,
    val disabledBorder: BorderStroke? = null,
    val rippleConfiguration: RippleConfiguration,
)

@Composable
private fun getMisticaRippleConfiguration(color: Color, alpha: RippleAlpha? = null) =
    RippleConfiguration(color, alpha ?: RippleDefaults.rippleAlpha(color, !isSystemInDarkTheme()))

private var isFocused: Boolean? = null

@Composable
@Suppress("CyclomaticComplexMethod")
internal fun ButtonStyle.getButtonStyleCompose(newFocusState: Boolean? = null): ButtonStyleConfig {
    isFocused = newFocusState
    return when (this) {
        ButtonStyle.PRIMARY -> primary()
        ButtonStyle.PRIMARY_INVERSE -> primaryInverse()
        ButtonStyle.PRIMARY_SMALL -> primary()
        ButtonStyle.PRIMARY_SMALL_INVERSE -> primaryInverse()
        ButtonStyle.SECONDARY -> secondary()
        ButtonStyle.SECONDARY_INVERSE -> secondaryInverseConfig()
        ButtonStyle.SECONDARY_SMALL -> secondary()
        ButtonStyle.SECONDARY_SMALL_INVERSE -> secondaryInverseConfig()
        ButtonStyle.DANGER -> danger()
        ButtonStyle.DANGER_SMALL -> danger()
        ButtonStyle.LINK -> link()
        ButtonStyle.LINK_INVERSE -> linkInverse()
        ButtonStyle.LINK_SMALL -> link()
        ButtonStyle.LINK_SMALL_INVERSE -> linkInverse()
        ButtonStyle.DANGER_LINK -> dangerLink()
        ButtonStyle.DANGER_LINK_INVERSE -> dangerLinkInverse()
        ButtonStyle.DANGER_LINK_SMALL -> dangerLink()
        ButtonStyle.DANGER_LINK_SMALL_INVERSE -> dangerLinkInverse()
    }
}

@Composable
private fun primary(
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonPrimaryBackground,
        disabledBackgroundColor = MisticaTheme.colors.buttonPrimaryBackground.disabled(),
    ),
    textColor: Color = MisticaTheme.colors.textButtonPrimary,
    disabledTextColor: Color = textColor.disabled(),
    rippleConfiguration: RippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonPrimaryBackgroundPressed),
) = ButtonStyleConfig(
    buttonColors = buttonColors,
    textColor = textColor,
    disabledTextColor = disabledTextColor,
    rippleConfiguration = rippleConfiguration,
)

@Composable
private fun primaryInverse() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonPrimaryBackgroundInverse,
        disabledBackgroundColor = MisticaTheme.colors.buttonPrimaryBackgroundInverse.disabled()
    ),
    textColor = MisticaTheme.colors.textButtonPrimaryInversePressed,
    disabledTextColor = MisticaTheme.colors.textButtonPrimaryInverse,
    rippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonPrimaryBackgroundInversePressed),
)

@Composable
private fun secondary(
    textColor: Color = MisticaTheme.colors.textButtonSecondary,
    strokeColor: Color = MisticaTheme.colors.buttonSecondaryBorder,
    rippleConfiguration: RippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonSecondaryBackgroundPressed)
) = ButtonStyleConfig(
    buttonColors = ButtonDefaults.outlinedButtonColors(
        backgroundColor = Color.Transparent,
        disabledContentColor = Color.Transparent,
        contentColor = textColor,
    ),
    textColor = textColor,
    disabledTextColor = textColor.disabled(),
    border = BorderStroke(
        dimensionResource(R.dimen.button_outline_stroke_width),
        strokeColor
    ),
    disabledBorder = BorderStroke(
        dimensionResource(R.dimen.button_outline_stroke_width),
        strokeColor.disabled()
    ),
    rippleConfiguration = rippleConfiguration
)


@Composable
private fun secondaryInverseConfig() =
    secondary(
        textColor = MisticaTheme.colors.textButtonSecondaryInverse,
        strokeColor = MisticaTheme.colors.buttonSecondaryBorderInverse,
        rippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonSecondaryBackgroundInversePressed)
    )

@Composable
private fun danger() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonDangerBackground,
        disabledBackgroundColor = MisticaTheme.colors.buttonDangerBackground.disabled()
    ),
    rippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonDangerBackgroundPressed)
)

@Composable
private fun link(
    textColor: Color = MisticaTheme.colors.textLink,
) = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = if (isFocused == true) Color.Green else Color.Transparent,
        //backgroundColor =Color.Transparent,
        disabledBackgroundColor = Color.Transparent,
    ),
    textColor = textColor,
    disabledTextColor = textColor.disabled(),
    rippleConfiguration = getMisticaRippleConfiguration(MisticaTheme.colors.buttonLinkBackgroundPressed),
)

@Composable
private fun linkInverse() = link(
    textColor = MisticaTheme.colors.textLinkInverse,
)


@Composable
private fun dangerLink(
    textColor: Color = MisticaTheme.colors.textLinkDanger,
    backgroundColor: Color = Color.Transparent,
    selectedBackgroundColor: Color = MisticaTheme.colors.buttonLinkDangerBackgroundPressed,
) = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = if (isFocused == true) Color.Green else backgroundColor,
        disabledBackgroundColor = Color.Transparent,
    ),
    textColor = textColor,
    disabledTextColor = textColor.disabled(),
    rippleConfiguration = getMisticaRippleConfiguration(selectedBackgroundColor),
)

@Composable
private fun dangerLinkInverse() = dangerLink(
    backgroundColor = MisticaTheme.colors.buttonLinkDangerBackgroundInverse,
    selectedBackgroundColor = MisticaTheme.colors.buttonLinkDangerBackgroundInversePressed,
)

private fun Color.disabled() =
    copy(alpha = 0.5f)
