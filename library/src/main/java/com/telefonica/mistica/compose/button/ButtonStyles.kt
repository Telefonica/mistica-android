package com.telefonica.mistica.compose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
    ButtonStyle.LINK -> link(colorResource(R.color.text_button_link_selector))
    ButtonStyle.LINK_INVERSE -> linkInverse()
}

@Composable
private fun primary(
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(
        backgroundColor = colorResource(R.color.button_primary_background_selector),
        disabledBackgroundColor = colorResource(R.color.button_primary_background_selector).disabled()
    ),
    textColor: Color = colorResource(R.color.button_primary_text_selector),
    rippleTheme: MisticaRippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonPrimaryBackgroundSelected)
) = ButtonStyleConfig(
    buttonColors = buttonColors,
    textColor = textColor,
    rippleTheme = rippleTheme
)

@Composable
private fun primaryInverse() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = colorResource(R.color.button_primary_background_inverse_selector),
        disabledBackgroundColor = colorResource(R.color.button_primary_background_inverse_selector).disabled()
    ),
    textColor = colorResource(R.color.text_button_primary_inverse_selector),
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonPrimaryBackgroundSelectedInverse),
)

@Composable
private fun secondary(
    textColor: Color = colorResource(R.color.text_button_secondary_selector),
    backgroundColor: Color = colorResource(R.color.button_secondary_background_selector),
) = ButtonStyleConfig(
    buttonColors = ButtonDefaults.outlinedButtonColors(
        backgroundColor = Color.Transparent,
        disabledContentColor = Color.Transparent,
    ),
    textColor = textColor,
    disabledTextColor = textColor.disabled(),
    border = BorderStroke(
        dimensionResource(R.dimen.button_outline_stroke_width),
        backgroundColor
    ),
    disabledBorder = BorderStroke(
        dimensionResource(R.dimen.button_outline_stroke_width),
        backgroundColor.disabled()
    ),
    rippleTheme = MisticaRippleTheme(Color.Transparent, RippleAlpha(0f, 0f, 0f, 0f))
)

@Composable
private fun secondaryInverseConfig() =
    secondary(
        textColor = colorResource(R.color.text_button_secondary_inverse_selector),
        backgroundColor = colorResource(R.color.button_secondary_background_inverse_selector).disabled()
    )

@Composable
private fun danger() = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = colorResource(R.color.button_danger_background_selector),
        disabledBackgroundColor = colorResource(R.color.button_danger_background_selector).disabled()
    ),
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonDangerBackgroundSelected)
)

@Composable
private fun link(
    textColor: Color = colorResource(R.color.text_button_link_selector),
) = primary(
    buttonColors = ButtonDefaults.buttonColors(
        backgroundColor = Color.Transparent,
        disabledBackgroundColor = Color.Transparent
    ),
    textColor = textColor,
    rippleTheme = MisticaRippleTheme(MisticaTheme.colors.buttonLinkBackgroundSelected),
)

@Composable
private fun linkInverse() = link(
    textColor = colorResource(R.color.text_button_link_inverse_selector),
)

private fun Color.disabled() =
    copy(alpha = 0.5f)