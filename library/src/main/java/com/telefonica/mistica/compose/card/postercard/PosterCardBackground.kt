package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
internal fun PosterCardBackground(backgroundType: PosterCardBackgroundType, content: @Composable BoxScope.() -> Unit) {
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