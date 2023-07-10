package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.skeleton.CircleSkeleton
import com.telefonica.mistica.compose.skeleton.LineSkeleton
import com.telefonica.mistica.compose.skeleton.RectangleSkeleton
import com.telefonica.mistica.compose.skeleton.RowSkeleton
import com.telefonica.mistica.compose.skeleton.SkeletonStyle
import com.telefonica.mistica.compose.skeleton.TextSkeleton
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Skeletons() {
    val infiniteTransition: InfiniteTransition =
        rememberInfiniteTransition()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .background(MisticaTheme.colors.background)
                .wrapContentHeight()
                .padding(16.dp)
        ) {

            Separator("Line")
            LineSkeleton(
                infiniteTransition = infiniteTransition,
            )
            Separator("Text")
            TextSkeleton(
                infiniteTransition = infiniteTransition,
            )
            Separator("Circle")
            CircleSkeleton(
                infiniteTransition = infiniteTransition,
            )
            Separator("Row")
            RowSkeleton(
                infiniteTransition = infiniteTransition,
            )
            Separator("Rectangle")
            RectangleSkeleton(
                infiniteTransition = infiniteTransition,
                modifier = Modifier.height(100.dp)
            )
        }
        Column(
            modifier = Modifier
                .background(MisticaTheme.colors.backgroundBrand)
                .wrapContentHeight()
                .padding(16.dp)
        ) {

            Separator("Line")
            LineSkeleton(
                infiniteTransition = infiniteTransition,
                style = SkeletonStyle.Inverse,
            )
            Separator("Text")
            TextSkeleton(
                infiniteTransition = infiniteTransition,
                style = SkeletonStyle.Inverse,
            )
            Separator("Circle")
            CircleSkeleton(
                infiniteTransition = infiniteTransition,
                style = SkeletonStyle.Inverse,
            )
            Separator("Row")
            RowSkeleton(
                infiniteTransition = infiniteTransition,
                style = SkeletonStyle.Inverse,
            )
            Separator("Rectangle")
            RectangleSkeleton(
                infiniteTransition = infiniteTransition,
                modifier = Modifier.height(100.dp),
                style = SkeletonStyle.Inverse,
            )
        }
    }
}

@Composable
private fun Separator(text: String) {
    Text(text, modifier = Modifier.padding(top = 16.dp))
    Divider(modifier = Modifier.padding(bottom = 8.dp))
}