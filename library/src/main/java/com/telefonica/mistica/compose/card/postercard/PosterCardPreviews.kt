package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.TuBrand

@Preview
@Composable
internal fun PosterCardSolidColor() {
    MisticaTheme(brand = TuBrand) {
        PosterCard(
            modifier = Modifier.width(300.dp),
            aspectRatio = PosterCardAspectRatio.AR_1_1,
            backgroundType = PosterCardBackgroundType.Color(brush = SolidColor(MisticaTheme.colors.background), inverseDisplay = false),
            headline = Tag(content = TAG_HEADLINE_VALUE),
            preTitle = PRE_TITLE_VALUE,
            title = TITLE_VALUE,
            subtitle = SUBTITLE_VALUE,
            description = DESCRIPTION_VALUE,
        )
    }
}

@Preview
@Composable
internal fun PosterCardGradientColor() {
    MisticaTheme(brand = TuBrand) {
        PosterCard(
            topActionsList = listOf(
                TopActionData(iconRes = R.drawable.icn_visibility),
                TopActionData(iconRes = R.drawable.ic_close_regular)
            ),
            aspectRatio = PosterCardAspectRatio.AR_16_9,
            backgroundType = PosterCardBackgroundType.Color(
                brush = Brush.verticalGradient(colors = listOf(Color.Magenta, Color.Red)),
                inverseDisplay = true
            ),
            headline = Tag(content = TAG_HEADLINE_VALUE),
            preTitle = PRE_TITLE_VALUE,
            title = TITLE_VALUE,
            subtitle = SUBTITLE_VALUE,
            description = DESCRIPTION_VALUE
        )
    }
}

@Preview
@Composable
internal fun PosterCardImage() {
    MisticaTheme(brand = TuBrand) {
        PosterCard(
            modifier = Modifier.fillMaxWidth(),
            aspectRatio = PosterCardAspectRatio.AR_16_9,
            backgroundType = PosterCardBackgroundType.Image(imageResource = R.drawable.sample_background),
            headline = Tag(content = TAG_HEADLINE_VALUE),
            preTitle = PRE_TITLE_VALUE,
            title = TITLE_VALUE,
            subtitle = SUBTITLE_VALUE,
            description = DESCRIPTION_VALUE,
            customContent = {
                CustomLowerContent()
            }
        )
    }
}

@Composable
internal fun CustomLowerContent() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(150.dp)
            .background(color = MisticaTheme.colors.successHighInverse.copy(alpha = 0.5f))
            .border(width = 1.dp, color = MisticaTheme.colors.success),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = CUSTOM_SLOT_VALUE,
            style = MisticaTheme.typography.preset2,
            color = MisticaTheme.colors.textPrimaryInverse
        )
    }
}

private const val TAG_HEADLINE_VALUE = "Headline"
private const val PRE_TITLE_VALUE = "Pretitle"
private const val TITLE_VALUE = "Title"
private const val SUBTITLE_VALUE = "Subtitle"
private const val DESCRIPTION_VALUE = "Description"

private const val CUSTOM_SLOT_VALUE = "Custom slot"