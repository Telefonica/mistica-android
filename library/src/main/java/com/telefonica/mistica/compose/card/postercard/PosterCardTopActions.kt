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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
internal fun PosterCardTopActions(modifier: Modifier = Modifier, firstTopAction: TopActionData?, secondTopAction: TopActionData?) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        firstTopAction?.let {
            TopAction(topActionData = it)
        }
        secondTopAction?.let {
            Spacer(modifier = Modifier.width(16.dp))
            TopAction(topActionData = it)
        }
    }
}

@Composable
internal fun TopAction(topActionData: TopActionData) {
    with(topActionData) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(color = backgroundColor)
                .clickable { topActionData.onClick?.invoke() }
                .wrapContentSize(align = Alignment.Center)
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = contentDescription,
                colorFilter = iconTint?.let { ColorFilter.tint(iconTint) },
                contentScale = ContentScale.Crop
            )
        }
    }
}

data class TopActionData(
    val iconRes: Int,
    val iconTint: Color?,
    val backgroundColor: Color = Color.Transparent,
    val contentDescription: String? = null,
    val onClick: (() -> Unit)? = null,
)