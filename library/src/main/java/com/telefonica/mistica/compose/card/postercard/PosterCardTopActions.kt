package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.card.datacard.IconPainter

@Composable
internal fun PosterCardTopActions(modifier: Modifier = Modifier, firstTopAction: TopActionData?, secondTopAction: TopActionData?) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        firstTopAction?.let { TopAction(topActionData = it) }
        secondTopAction?.let { TopAction(topActionData = it) }
    }
}

@Composable
internal fun TopAction(modifier: Modifier = Modifier, topActionData: TopActionData) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(horizontal = 4.dp)
            .clickable {
                topActionData.onClick?.invoke()
            }
    ) {
        topActionData.iconPainter.Paint()
    }
}

data class TopActionData(
    val iconPainter: IconPainter = IconPainter.NoIconPainter,
    val onClick: (() -> Unit)? = null,
)