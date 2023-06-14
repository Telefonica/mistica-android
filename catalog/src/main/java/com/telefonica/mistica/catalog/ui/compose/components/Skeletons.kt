package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.animation.core.InfiniteTransition
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.skeleton.CircleSkeleton
import com.telefonica.mistica.compose.skeleton.LineSkeleton
import com.telefonica.mistica.compose.skeleton.RectangleSkeleton
import com.telefonica.mistica.compose.skeleton.RowSkeleton
import com.telefonica.mistica.compose.skeleton.TextSkeleton
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Skeletons() {
    val infiniteTransition: InfiniteTransition =
        rememberInfiniteTransition()
    Column(
        modifier = Modifier
            .background(MisticaTheme.colors.background)
            .fillMaxSize()
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
}

@Composable
private fun Separator(text: String) {
    Text(text, modifier = Modifier.padding(top = 16.dp))
    Divider(modifier = Modifier.padding(bottom = 8.dp))
}