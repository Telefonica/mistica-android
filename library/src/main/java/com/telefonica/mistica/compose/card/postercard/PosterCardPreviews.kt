package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
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
//            iconOrTopActions = {},
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
//            iconOrTopActions = {},
            modifier = Modifier.width(300.dp),
            aspectRatio = PosterCardAspectRatio.AR_1_1,
            backgroundType = PosterCardBackgroundType.Color(
                brush = Brush.verticalGradient(colors = listOf(Color.Blue, Color.LightGray)), inverseDisplay =
                true
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
internal fun PosterCardSampleContent() {
    MisticaTheme(brand = TuBrand) {
        PosterCard(
//            iconOrTopActions = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            aspectRatio = PosterCardAspectRatio.AR_AUTO,
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
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .size(30.dp)
            .background(color = MisticaTheme.colors.successHighInverse.copy(alpha = 0.5f))
            .border(width = 1.dp, color = MisticaTheme.colors.success)
    )
}

private const val TAG_HEADLINE_VALUE = "Headline"
private const val PRE_TITLE_VALUE = "Pretitle"
private const val TITLE_VALUE = "Title"
private const val SUBTITLE_VALUE = "Subtitle"
private const val DESCRIPTION_VALUE = "Description"