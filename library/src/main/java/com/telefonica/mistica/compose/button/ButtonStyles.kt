package com.telefonica.mistica.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
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
    val rippleTheme: MisticaRippleTheme
)

class MisticaRippleTheme(
    private val color: Color,
    private val alpha: RippleAlpha? = null
) : RippleTheme {

    @Composable
    override fun defaultColor(): Color = color

    @Composable
    override fun rippleAlpha(): RippleAlpha = alpha ?: RippleTheme.defaultRippleAlpha(color, !isSystemInDarkTheme())

}

@Composable
internal fun ButtonStyle.getButtonStyleCompose(): ButtonStyleConfig = when (this) {
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
    ButtonStyle.LINK -> link(MisticaTheme.colors.textLink)
    ButtonStyle.LINK_INVERSE -> linkInverse()
}

@Composable
private fun primary(
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonPrimaryBackground,
        disabledBackgroundColor = MisticaTheme.colors.buttonPrimaryBackground.disabled(),
    ),
    textColor: Color = MisticaTheme.colors.textButtonPrimary,
    disabledTextColor: Color = textColor.disabled(),
    rippleTheme: MisticaRippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonPrimaryBackgroundSelected),
) = ButtonStyleConfig(
    buttonColors = buttonColors,
    textColor = textColor,
    disabledTextColor = disabledTextColor,
    rippleTheme = rippleTheme
)

@Composable
private fun primaryInverse() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonPrimaryBackgroundInverse,
        disabledBackgroundColor = MisticaTheme.colors.buttonPrimaryBackgroundInverse.disabled()
    ),
    textColor = MisticaTheme.colors.textButtonPrimaryInverseSelected,
    disabledTextColor = MisticaTheme.colors.textButtonPrimaryInverse,
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonPrimaryBackgroundInverseSelected),
)

@Composable
private fun secondary(
    textColor: Color = MisticaTheme.colors.textButtonSecondary,
    strokeColor: Color = MisticaTheme.colors.buttonSecondaryBorder,
    rippleTheme: MisticaRippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonSecondaryBackgroundSelected)
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
    rippleTheme = rippleTheme
)

@Composable
private fun secondaryInverseConfig() =
    secondary(
        textColor = MisticaTheme.colors.textButtonSecondaryInverse,
        strokeColor = MisticaTheme.colors.buttonSecondaryBorderInverse,
        rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonSecondaryBackgroundInverseSelected)
    )

@Composable
private fun danger() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = MisticaTheme.colors.buttonDangerBackground,
        disabledBackgroundColor = MisticaTheme.colors.buttonDangerBackground.disabled()
    ),
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonDangerBackgroundSelected)
)

@Composable
private fun link(
    textColor: Color = MisticaTheme.colors.textLink,
) = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = Color.Transparent,
        disabledBackgroundColor = Color.Transparent
    ),
    textColor = textColor,
    disabledTextColor = textColor.disabled(),
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonLinkBackgroundSelected),
)

@Composable
private fun linkInverse() = link(
    textColor = MisticaTheme.colors.textLinkInverse,
)

private fun Color.disabled() =
    copy(alpha = 0.5f)