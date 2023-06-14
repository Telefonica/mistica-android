package com.telefonica.mistica.compose.skeleton

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun LineSkeleton(
    infiniteTransition: InfiniteTransition,
    modifier: Modifier = Modifier,
) {
    val skeletonColor by skeletonColorTransition(infiniteTransition)
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(8.dp))
            .background(skeletonColor)
            .height(8.dp)
    )
}

@Composable
fun TextSkeleton(
    infiniteTransition: InfiniteTransition,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.wrapContentHeight()
    ) {
        LineSkeleton(infiniteTransition = infiniteTransition, modifier = Modifier.fillMaxWidth())
        LineSkeleton(
            infiniteTransition = infiniteTransition, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        )
        LineSkeleton(
            infiniteTransition = infiniteTransition, modifier = Modifier
                .fillMaxWidth(0.75F)
                .padding(top = 16.dp)
        )
    }
}

@Composable
fun CircleSkeleton(
    infiniteTransition: InfiniteTransition,
    modifier: Modifier = Modifier,
) {
    val skeletonColor by skeletonColorTransition(infiniteTransition)
    Box(
        modifier = modifier
            .clip(shape = CircleShape)
            .background(skeletonColor)
            .size(40.dp)
            .height(8.dp)
    )
}

@Composable
fun RowSkeleton(
    infiniteTransition: InfiniteTransition,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
    ) {
        CircleSkeleton(infiniteTransition = infiniteTransition)
        LineSkeleton(
            infiniteTransition = infiniteTransition,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp)
        )
    }
}

@Composable
fun RectangleSkeleton(
    infiniteTransition: InfiniteTransition,
    modifier: Modifier = Modifier,
) {
    val skeletonColor by skeletonColorTransition(infiniteTransition)
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(8.dp))
            .background(skeletonColor)
    )
}


@Composable
private fun skeletonColorTransition(infiniteTransition: InfiniteTransition) =
    infiniteTransition.animateColor(
        initialValue = MisticaTheme.colors.backgroundSkeleton.copy(alpha = 0.5f),
        targetValue = MisticaTheme.colors.backgroundSkeleton,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = LinearEasing),
            repeatMode = RepeatMode.Reverse
        )
    )


@Composable
@Preview
fun SkeletonPreview() {
    val infiniteTransition: InfiniteTransition =
        rememberInfiniteTransition()
    Column(
        modifier = Modifier
            .background(Color(0xFF019DF4))
            .fillMaxSize()
            .padding(16.dp)
    ) {


        Text("Line")
        LineSkeleton(
            infiniteTransition = infiniteTransition,
        )
        Text("Text")
        TextSkeleton(
            infiniteTransition = infiniteTransition,
        )
        Text("Circle")
        CircleSkeleton(
            infiniteTransition = infiniteTransition,
        )
        Text("Row")
        RowSkeleton(
            infiniteTransition = infiniteTransition,
        )
        Text("Rectangle")
        RectangleSkeleton(
            infiniteTransition = infiniteTransition,
            modifier = Modifier.height(100.dp)
        )
    }
}