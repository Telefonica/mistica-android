package com.telefonica.mistica.compose.card.datacard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.telefonica.mistica.compose.shape.Circle
import com.telefonica.mistica.compose.theme.MisticaTheme

sealed class IconPainter {
    @Composable
    abstract fun Paint()

    object NoIconPainter : IconPainter() {
        @Composable
        override fun Paint() {
        }
    }

    class ResourceIconPainter(
        val iconRes: Int,
        val iconTint: Color?,
        val backgroundColor: Color,
        val iconType: IconType = IconType.CIRCULAR_ASSET,
        val modifier: Modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
    ) : IconPainter() {
        @Composable
        override fun Paint() {
            Box(
                modifier = modifier
            ) {
                when (iconType) {
                    IconType.ICON -> {
                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .wrapContentSize(align = Alignment.Center)
                        ) {
                            Image()
                        }
                    }
                    IconType.CIRCULAR_ASSET,
                    -> {
                        Circle(
                            color = backgroundColor
                        ) {
                            Image()
                        }
                    }
                    IconType.SQUARE_IMAGE -> {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .wrapContentSize(align = Alignment.Center)
                        ) {
                            Image()
                        }
                    }
                }
            }
        }

        @Composable
        private fun Image() {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                colorFilter = iconTint?.let { ColorFilter.tint(iconTint) },
                contentScale = ContentScale.Crop
            )
        }
    }

    class TextIconPainter(
        private val text: String,
        private val colorBackground: Color,
        private val colorForeground: Color,
    ) : IconPainter() {
        @Composable
        override fun Paint() {
            Box(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
            ) {
                Circle(
                    color = colorBackground,
                ) {
                    Text(
                        text = text,
                        style = MisticaTheme.typography.preset2,
                        color = colorForeground,
                    )
                }
            }
        }
    }

    class ImageIconPainter(
        private val url: String,
    ) : IconPainter() {
        @Composable
        override fun Paint() {
            Box(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
            ) {
                Image(
                    painter = rememberAsyncImagePainter(
                        ImageRequest.Builder(LocalContext.current)
                            .data(url)
                            .apply { transformations(CircleCropTransformation()) }
                            .build()
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}

@Composable
fun resourceIconPainter(
    @DrawableRes iconRes: Int,
    iconTint: Color? = null,
    backgroundColor: Color = MisticaTheme.colors.neutralLow,
    iconType: IconType = IconType.CIRCULAR_ASSET,
    modifier: Modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
) = IconPainter.ResourceIconPainter(
    iconRes = iconRes,
    iconTint = iconTint,
    backgroundColor = backgroundColor,
    iconType = iconType,
    modifier = modifier
)

fun textIconPainter(
    text: String,
    colorBackground: Color,
    colorForeground: Color,
) = IconPainter.TextIconPainter(
    text = text,
    colorBackground = colorBackground,
    colorForeground = colorForeground,
)

fun imageIconPainter(url: String) = IconPainter.ImageIconPainter(url)

fun noIcon() = IconPainter.NoIconPainter

enum class IconType {
    ICON,
    CIRCULAR_ASSET,
    SQUARE_IMAGE,
}
