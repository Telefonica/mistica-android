package com.telefonica.mistica.compose.button

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

private val iconSpacing = 10.dp
private val easing = CubicBezierEasing(0.77f, 0f, 0.175f, 1f)

@Composable
fun Button(
    modifier: Modifier = Modifier,
    text: String,
    loadingText: String = "",
    buttonStyle: ButtonStyle = ButtonStyle.PRIMARY,
    isLoading: Boolean = false,
    enabled: Boolean = true,
    @DrawableRes icon: Int? = null,
    withChevron: Boolean = false,
    onClickListener: () -> Unit,
) {

    val density = LocalDensity.current

    val style = buttonStyle.getButtonStyleCompose()
    val size = buttonStyle.getButtonSizeCompose()
    val textColor = if (enabled) style.textColor else style.disabledTextColor

    var originalWidth: Dp? by remember { mutableStateOf(null) }

    CompositionLocalProvider(LocalRippleTheme provides style.rippleTheme) {
        androidx.compose.material.Button(
            modifier = modifier
                .defaultMinSize(size.minWidth, size.height)
                .onGloballyPositioned {
                    if (originalWidth == null) {
                        originalWidth = with(density) { it.size.width.toDp() }
                    }
                }
                .height(size.height)
                .applyWidth(originalWidth),
            contentPadding = PaddingValues(horizontal = size.contentPadding, vertical = 0.dp),
            onClick = onClickListener,
            enabled = enabled,
            colors = style.buttonColors,
            border = if (enabled) style.border else style.disabledBorder,
            elevation = ButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
            shape = RoundedCornerShape(MisticaTheme.radius.buttonBorderRadius)
        ) {
            Box(contentAlignment = Alignment.Center) {
                androidx.compose.animation.AnimatedVisibility(
                    modifier = Modifier.fillMaxHeight(),
                    visible = isLoading,
                    enter = slideInVertically(tween(easing = easing)) { it },
                    exit = slideOutVertically(tween(easing = easing)) { it },
                ) {
                    Row {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .size(size.progressBarSize)
                                .align(Alignment.CenterVertically),
                            color = textColor,
                            strokeWidth = size.progressBarStroke,
                        )
                        loadingText.takeIf { it.isNotEmpty() }?.let {
                            Spacer(modifier = Modifier.width(iconSpacing))
                            Text(
                                modifier = Modifier.align(Alignment.CenterVertically),
                                text = it,
                                color = textColor,
                                style = size.textStyle,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                androidx.compose.animation.AnimatedVisibility(
                    modifier = Modifier.fillMaxHeight(),
                    visible = !isLoading,
                    enter = slideInVertically(tween(easing = easing)) { -it },
                    exit = slideOutVertically(tween(easing = easing)) { -it },
                ) {
                    Row {
                        icon?.let {
                            Image(
                                painterResource(id = it),
                                null,
                                modifier = Modifier
                                    .size(size.iconSize)
                                    .align(Alignment.CenterVertically),
                                colorFilter = ColorFilter.tint(style.textColor)
                            )
                            Spacer(modifier = Modifier.width(iconSpacing))
                        }
                        Text(
                            modifier = Modifier.align(Alignment.CenterVertically),
                            text = text,
                            color = textColor,
                            style = size.textStyle,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        if (withChevron) {
                            Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.button_chevron_padding)))
                            CompositionLocalProvider(
                                LocalContentAlpha provides if (enabled) ContentAlpha.high else ContentAlpha.disabled,
                            ) {
                                Image(
                                    painterResource(id = R.drawable.icn_chevron),
                                    null,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically),
                                    colorFilter = ColorFilter.tint(style.textColor.copy(LocalContentAlpha.current)),
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun Modifier.applyWidth(originalWidth: Dp?): Modifier =
    originalWidth?.let { width(it) } ?: this

enum class ButtonStyle {
    PRIMARY,
    PRIMARY_SMALL,
    SECONDARY,
    SECONDARY_SMALL,
    DANGER,
    DANGER_SMALL,
    LINK,
    PRIMARY_INVERSE,
    PRIMARY_SMALL_INVERSE,
    SECONDARY_INVERSE,
    SECONDARY_SMALL_INVERSE,
    LINK_INVERSE
}

@Preview
@Composable
fun ButtonPreview(@PreviewParameter(PreviewBooleanProvider::class) enabled: Boolean) {
    MisticaTheme(brand = MovistarBrand) {
        Button(text = "Text", loadingText = "Loading", enabled = enabled, isLoading = false) {}
    }
}

@Preview
@Composable
fun ProgressButtonNewPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Button(text = "Text", loadingText = "Loading", isLoading = true) {}
    }
}

@Preview
@Composable
fun ProgressButtonNoTextPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Button(text = "Text", isLoading = true) {}
    }
}

@Preview
@Composable
fun ProgressButtonIconPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Button(text = "Text", icon = R.drawable.icn_creditcard) {}
    }
}

@Preview
@Composable
fun ProgressButtonIconSmallPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Button(text = "Text", icon = R.drawable.icn_creditcard, buttonStyle = ButtonStyle.PRIMARY_SMALL) {}
    }
}

@Preview
@Composable
fun LinkWithChevronPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Button(
            text = "Text",
            withChevron = true,
            buttonStyle = ButtonStyle.LINK,
            onClickListener = {},
        )
    }
}

class PreviewBooleanProvider : PreviewParameterProvider<Boolean> {
    override val values = sequenceOf(false, true)
}