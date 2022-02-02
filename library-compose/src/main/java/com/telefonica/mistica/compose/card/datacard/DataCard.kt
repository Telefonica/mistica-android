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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.Card
import com.telefonica.mistica.compose.card.CardActions
import com.telefonica.mistica.compose.card.CardContent
import com.telefonica.mistica.compose.shape.Circle
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagView

@Composable
fun DataCard(
    modifier: Modifier = Modifier,
    iconPainter: IconPainter = IconPainter.NoIconPainter,
    tag: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    primaryButton: Action? = null,
    linkButton: Action? = null,
    customContent: @Composable () -> Unit = {},
) {
    Card(
        modifier = modifier,
    ) {
        iconPainter.Paint()
        CardContent(tag, preTitle, title, subtitle, description)
        customContent()
        CardActions(primaryButton, linkButton)
    }
}

@Preview
@Composable
fun CardPreview() {
    MisticaTheme(brand = MovistarBrand) {
        DataCard(
            iconPainter = resourceIconPainter(R.drawable.bg_list_image),
            tag = Tag("HEADLINE").withStyle(TagView.TYPE_PROMO),
            preTitle = "Pretitle",
            title = "Title",
            subtitle = "Subtitle",
            description = "Description",
            primaryButton = Action("Primary") {},
            linkButton = Action("Link") {}
        )
    }
}

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

@Composable
fun resourceIconPainter(@DrawableRes iconRes: Int) = IconPainter.ResourceIconPainter(iconRes)

@Composable
fun textIconPainter(
    text: String,
    colorBackground: Color,
    colorForeground: Color,
) = IconPainter.TextIconPainter(
    text = text,
    colorBackground = colorBackground,
    colorForeground = colorForeground,
)

@Composable
fun imageIconPainter(url: String) = IconPainter.ImageIconPainter(url)

@Composable
fun noIcon() = IconPainter.NoIconPainter
