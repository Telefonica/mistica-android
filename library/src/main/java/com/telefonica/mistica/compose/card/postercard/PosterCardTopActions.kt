package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
internal fun PosterCardTopActions(
    modifier: Modifier = Modifier,
    firstTopAction: TopActionData?,
    secondTopAction: TopActionData?
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        firstTopAction?.let {
            TopAction(topActionData = it, modifier = Modifier.semantics {
                traversalIndex = 8f
            })
        }
        secondTopAction?.let {
            if (firstTopAction != null) {
                Spacer(modifier = Modifier.width(16.dp))
            }
            TopAction(topActionData = it, modifier = Modifier.semantics {
                traversalIndex = 9f
            })
        }
    }
}

@Composable
internal fun TopAction(modifier: Modifier, topActionData: TopActionData) {
    with(topActionData) {
        Box(
            modifier = modifier
                .testTag(testTag.orEmpty())
                .size(40.dp)
                .clip(CircleShape)
                .clickable { onClick() }
                .background(
                    color = when {
                        isInverse -> Color.Transparent
                        withBackground -> MisticaTheme.colors.controlInverse.copy(alpha = 0.8f)
                        else -> Color.Transparent
                    }
                )
                .wrapContentSize(align = Alignment.Center)

        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = contentDescription,
                colorFilter = ColorFilter.tint(
                    if (isInverse) {
                        MisticaTheme.colors.inverse
                    } else {
                        MisticaTheme.colors.neutralHigh
                    }
                ),
                contentScale = ContentScale.Crop
            )
        }
    }
}

data class TopActionData(
    val iconRes: Int,
    val contentDescription: String = "",
    val testTag: String? = null,
    val withBackground: Boolean = true,
    val isInverse: Boolean = false,
    val onClick: () -> Unit = {},
)