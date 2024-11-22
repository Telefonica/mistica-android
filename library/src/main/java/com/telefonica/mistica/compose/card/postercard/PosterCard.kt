package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme

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
    onClickAction: (() -> Unit)? = null,
    customContent: (@Composable () -> Unit)? = null,
    firstTopAction: TopActionData? = null,
    secondTopAction: TopActionData? = null,
) {
    androidx.compose.material.Card(
        elevation = 0.dp,
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = MisticaTheme.colors.border),
        modifier = modifier.let { modifierValue ->
            onClickAction?.let {
                modifierValue.clickable { it.invoke() }
            }
            if (!aspectRatio.ratio.isNaN()) {
                modifierValue.aspectRatio(aspectRatio.ratio)
            } else {
                modifierValue
            }
        },
    ) {
        PosterCardBackground(backgroundType = backgroundType) {
            if (firstTopAction != null || secondTopAction != null) {
                PosterCardTopActions(
                    modifier = Modifier.align(alignment = Alignment.TopCenter),
                    firstTopAction = firstTopAction,
                    secondTopAction = secondTopAction
                )
            }
            Column(
                modifier = Modifier.align(alignment = Alignment.BottomCenter),
                verticalArrangement = Arrangement.Bottom
            ) {
                PosterCardMainContent(
                    backgroundType = backgroundType,
                    tag = headline,
                    preTitle = preTitle,
                    title = title,
                    description = description,
                    subtitle = subtitle,
                    customContent = customContent
                )
            }
        }
    }
}

enum class PosterCardAspectRatio(val ratio: Float) {
    AR_AUTO(ratio = Float.NaN),
    AR_1_1(ratio = 1f),
    AR_7_10(ratio = 0.7f),
    AR_9_10(ratio = 0.9f),
    AR_16_9(16 / 9f)
}

sealed class PosterCardBackgroundType(open var inverseDisplay: Boolean) {
    data class Image(val imageResource: Int, val contentDescription: String = "") : PosterCardBackgroundType(inverseDisplay = true)
    data class Color(val brush: Brush, override var inverseDisplay: Boolean = true) : PosterCardBackgroundType(inverseDisplay = inverseDisplay)
}

