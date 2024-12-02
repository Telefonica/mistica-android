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

@Composable
internal fun PosterCardBackground(
    modifier: Modifier = Modifier,
    backgroundType: PosterCardBackgroundType,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = Modifier
            .background(
                brush = if (backgroundType is PosterCardBackgroundType.Color) {
                    backgroundType.brush
                } else {
                    SolidColor(Color.Transparent)
                },
            )
            .then(modifier)
    ) {
        if (backgroundType is PosterCardBackgroundType.Image) {
            Image(
                modifier = Modifier.matchParentSize(),
                painter = painterResource(id = backgroundType.imageResource),
                contentDescription = backgroundType.contentDescription,
                contentScale = ContentScale.Crop
            )
        }
        content()
    }
}

