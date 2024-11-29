package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex

@Composable
internal fun PosterCardBackground(
    modifier: Modifier = Modifier,
    backgroundType: PosterCardBackgroundType,
    content: @Composable BoxScope.() -> Unit)
{
    Box(
        modifier = modifier.background(
                brush = if (backgroundType is PosterCardBackgroundType.Color) {
                    backgroundType.brush
                } else {
                    SolidColor(Color.Transparent)
                },
            )
    ) {
        if (backgroundType is PosterCardBackgroundType.Image) {
            Image(
                modifier = Modifier.matchParentSize().semantics { traversalIndex = 0f },
                painter = painterResource(id = backgroundType.imageResource),
                contentDescription = backgroundType.contentDescription,
                contentScale = ContentScale.Crop
            )
        }
        content()
    }
}

