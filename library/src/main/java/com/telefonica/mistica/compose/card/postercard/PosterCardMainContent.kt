package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun PosterCardMainContent(
    modifier: Modifier = Modifier,
    aspectRatio: PosterCardAspectRatio = PosterCardAspectRatio.AR_7_10,
    backgroundType: PosterCardBackgroundType,
    headline: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    customContent: @Composable () -> Unit = {},
    iconOrTopActions: @Composable (() -> Unit)? = null,
) {
    androidx.compose.material.Card(
        elevation = 0.dp,
        shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
        modifier = modifier.let { modifierValue ->
            if (!aspectRatio.ratio.isNaN()) {
                modifierValue.aspectRatio(aspectRatio.ratio)
            } else {
                modifierValue
            }
        },
    ) {
        PosterCardBackground(backgroundType = backgroundType) {
            Box(modifier = Modifier.fillMaxSize()) {
                iconOrTopActions?.let {
                    PosterCardTopContent(
                        modifier = Modifier.align(alignment = Alignment.TopCenter),
                    )
                }
                PosterCardTextContent(
                    modifier = Modifier.align(alignment = Alignment.BottomCenter),
                    backgroundType = backgroundType,
                    tag = headline,
                    preTitle = preTitle,
                    title = title,
                    description = description,
                    subtitle = subtitle
                )
                customContent()
            }
        }
    }
}

@Composable
fun PosterCardBackground(backgroundType: PosterCardBackgroundType, content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = if (backgroundType is PosterCardBackgroundType.Color) {
                    backgroundType.brush
                } else {
                    SolidColor(Color.Transparent)
                },
            )
    ) {
        when (backgroundType) {
            is PosterCardBackgroundType.Image -> {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = backgroundType.imageResource),
                    contentDescription = backgroundType.contentDescription,
                    contentScale = ContentScale.Crop
                )
            }

            is PosterCardBackgroundType.Video -> {
                //TODO:
            }

            else -> {}
        }
        content()
    }
}

fun buildCardTextContentBackgroundBrush(backgroundType: PosterCardBackgroundType): Brush =
    if( backgroundType.inverseDisplay ) {
        Brush.verticalGradient(
            colorStops = arrayOf(
                0.0f to Color.Black.copy(alpha = 0f),
                0.3f to Color.Black.copy(alpha = 0.4f),
                1.0f to Color.Black.copy(alpha = 0.7f)
            )
        )
    } else {
        SolidColor(Color.Transparent)
    }