package com.telefonica.mistica.compose.util

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver

@Composable
internal fun VisibilityTracker(
    modifier: Modifier = Modifier,
    onIsFullyVisible: (isFullyVisible: Boolean) -> Unit,
    content: @Composable () -> Unit,
) {
    var isResumed by remember { mutableStateOf(false) }
    var contentArea by remember { mutableStateOf(Rect.Zero) }
    var visibleArea by remember { mutableStateOf(Rect.Zero) }
    val visibleRatio by remember {
        derivedStateOf {
            when {
                !isResumed -> 0F
                contentArea.isEmpty -> 0F
                else -> (visibleArea.width * visibleArea.height) / (contentArea.width * contentArea.height)
            }
        }
    }

    LaunchedEffect(isResumed, visibleRatio) {
        onIsFullyVisible(isResumed && visibleRatio >= 1F)
    }

    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(key1 = lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            isResumed = event == Lifecycle.Event.ON_RESUME
        }
        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }

    Box(
        modifier = modifier.onGloballyPositioned { layoutCoordinates ->
            contentArea = layoutCoordinates.toRect()
            var intersection = contentArea
            var outermostParent = layoutCoordinates
            while (outermostParent.parentLayoutCoordinates != null) {
                outermostParent = outermostParent.parentLayoutCoordinates!!
                intersection = intersection.intersect(outermostParent.toRect())
            }

            visibleArea = intersection
        }
    ) {
        content()
    }
}

private fun LayoutCoordinates.toRect() = Rect(
    left = this.positionInWindow().x,
    top = this.positionInWindow().y,
    right = this.positionInWindow().x + this.size.width,
    bottom = this.positionInWindow().y + this.size.height,
)