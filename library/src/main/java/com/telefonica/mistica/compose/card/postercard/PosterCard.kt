package com.telefonica.mistica.compose.card.postercard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun PosterCard(
    aspectRatio: PosterCardAspectRatio,
    backgroundType: PosterCardBackgroundType,
    modifier: Modifier = Modifier,
    headline: Tag? = null,
    preTitle: String? = null,
    title: String? = null,
    subtitle: String? = null,
    description: String? = null,
    firstTopAction: TopActionData? = null,
    secondTopAction: TopActionData? = null,
    onClickAction: (() -> Unit)? = null,
    customContent: (@Composable () -> Unit)? = null,
) {
    val anyTopActionsLoaded = firstTopAction != null || secondTopAction != null

    BoxWithConstraints(modifier = modifier) {
        androidx.compose.material.Card(
            elevation = 0.dp,
            shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
            modifier = Modifier
                .width(maxWidth)
                .clickable(enabled = onClickAction != null) {
                    onClickAction?.invoke()
                }
                .heightIn(
                    min = maxWidth / aspectRatio.ratio,
                    max = Dp.Infinity
                )
        ) {
            PosterCardBackground(backgroundType = backgroundType) {
                Column(
                    modifier = Modifier.align(alignment = Alignment.BottomCenter),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    if (anyTopActionsLoaded) {
                        Spacer(modifier = Modifier.height(40.dp))
                    }
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
                if (anyTopActionsLoaded) {
                    PosterCardTopActions(
                        modifier = Modifier.align(alignment = Alignment.TopCenter).zIndex(1f),
                        firstTopAction = firstTopAction,
                        secondTopAction = secondTopAction
                    )
                }
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
    data class Image(@DrawableRes val imageResource: Int, val contentDescription: String = "") : PosterCardBackgroundType(inverseDisplay = true)
    data class Color(val brush: Brush, override var inverseDisplay: Boolean = true) : PosterCardBackgroundType(inverseDisplay = inverseDisplay)
}

