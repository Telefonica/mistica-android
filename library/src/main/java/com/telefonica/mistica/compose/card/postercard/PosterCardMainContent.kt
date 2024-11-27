package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun PosterCardMainContent(
    modifier: Modifier = Modifier,
    backgroundType: PosterCardBackgroundType,
    tag: Tag?,
    preTitle: String?,
    title: String?,
    subtitle: String?,
    description: String?,
    customContent: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                brush = if (backgroundType.inverseDisplay) {
                    MisticaTheme.brushes.cardContentOverlay
                } else {
                    SolidColor(Color.Transparent)
                }
            )
            .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = if (customContent != null) {
                    0.dp
                } else {
                    24.dp
                },
            )
    ) {
        if (tag != null) {
            Box(modifier = Modifier.padding(top = 16.dp, bottom = 20.dp)) {
                tag.build()
            }
        }

        preTitle?.let {
            PosterCardText(
                modifier = Modifier.padding(top = 4.dp),
                textValue = preTitle,
                textStyle = MisticaTheme.typography.preset1,
                inverseDisplay = backgroundType.inverseDisplay
            )
        }

        title?.let {
            PosterCardText(
                modifier = Modifier.padding(top = 4.dp),
                textValue = title,
                textStyle = MisticaTheme.typography.presetCardTitle,
                inverseDisplay = backgroundType.inverseDisplay
            )
        }
        subtitle?.let {
            PosterCardText(
                modifier = Modifier.padding(top = 4.dp),
                textValue = subtitle,
                textStyle = MisticaTheme.typography.preset2,
                inverseDisplay = backgroundType.inverseDisplay
            )
        }
        description?.let {
            PosterCardText(
                modifier = Modifier.padding(top = 8.dp),
                textValue = description,
                textStyle = MisticaTheme.typography.preset2,
                inverseDisplay = backgroundType.inverseDisplay
            )
        }
        customContent?.let {
            Box(modifier = Modifier.padding(top = 4.dp, bottom = 24.dp)) {
                it()
            }
        }
    }
}

@Composable
internal fun PosterCardText(
    modifier: Modifier = Modifier,
    textValue: String,
    textStyle: TextStyle,
    inverseDisplay: Boolean,
) {
    Text(
        modifier = modifier,
        text = textValue,
        style = textStyle.also { style ->
            if (inverseDisplay) {
                style.copy(shadow = buildPosterCardTextShadow())
            }
        },
        color = if (inverseDisplay) {
            MisticaTheme.colors.textPrimaryInverse
        } else {
            MisticaTheme.colors.textPrimary
        }
    )
}

internal fun buildPosterCardTextShadow() = Shadow(
    color = Color.Black.copy(alpha = 0.4f),
    blurRadius = 15f
)
