package com.telefonica.mistica.compose.card.datacard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
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

    class ResourceIconPainter(val iconRes: Int) : IconPainter() {
        @Composable
        override fun Paint() {
            Box(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
            ) {
                Circle {
                    Image(
                        painter = painterResource(id = iconRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
            }
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
                    painter = rememberImagePainter(
                        data = url,
                        builder = {
                            transformations(CircleCropTransformation())
                        }
                    ),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}

fun resourceIconPainter(@DrawableRes iconRes: Int) = IconPainter.ResourceIconPainter(iconRes)

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

