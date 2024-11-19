package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.TuBrand

@Composable
fun PosterCard(
    modifier: Modifier = Modifier,
    aspectRatio: PosterCardAspectRatio,
    backgroundType: PosterCardBackgroundType,
    headline: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    customContent: @Composable () -> Unit = {},
    iconOrTopActions: @Composable (() -> Unit) ? = null,
) {
    PosterCardMainContent(
        modifier = modifier,
        aspectRatio = aspectRatio,
        backgroundType = backgroundType,
        preTitle = preTitle,
        title = title,
        subtitle = subtitle,
        description = description,
        headline = headline,
        customContent = customContent,
        iconOrTopActions = iconOrTopActions
    )
}

enum class PosterCardAspectRatio(val ratio: Float) {
    AR_AUTO(ratio = Float.NaN),
    AR_1_1(ratio = 1f),
    AR_7_10(ratio = 0.7f),
    AR_9_10(ratio = 0.9f),
    AR_16_9(16 / 9f)
}

sealed class PosterCardBackgroundType(open val inverseDisplay: Boolean) {
    data class Image(val imageResource: Int, val contentDescription: String = "") : PosterCardBackgroundType(inverseDisplay = true)
    data class Video(val videoContent: @Composable (() -> Unit)) : PosterCardBackgroundType(inverseDisplay = true)
    data class Color(val brush: Brush, override val inverseDisplay: Boolean = true) : PosterCardBackgroundType(inverseDisplay = inverseDisplay)
}

@Preview
@Composable
internal fun PosterCardSampleContent() {
    MisticaTheme(brand = TuBrand) {
        PosterCard(
            modifier = Modifier.width(6000.dp).background(color = Color.Black),
            iconOrTopActions = {},
            aspectRatio = PosterCardAspectRatio.AR_9_10,
            backgroundType = PosterCardBackgroundType.Color(brush = SolidColor(Color.Red), inverseDisplay = false),
            headline = Tag(content = "Headline"),
            preTitle = "Pretitle",
            title = "Title",
            subtitle = "Subtitle",
            description = "Description",
        )
    }
}
