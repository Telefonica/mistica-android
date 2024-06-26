package com.telefonica.mistica.compose.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPager
import com.telefonica.mistica.compose.util.VisibilityTracker
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

internal const val DEFAULT_AUTO_PLAY_SPEED_MILLIS = 5000L
internal const val DEFAULT_AUTO_PLAY = false
internal const val DEFAULT_LOOP = false

@Composable
fun Carousel(
    modifier: Modifier = Modifier,
    carouselState: CarouselState = rememberCarouselState(),
    contentPadding: PaddingValues = PaddingValuesWithStartAndEndMargin(carouselState, start = 16.dp, end = 16.dp),
    itemCount: Int,
    autoPlay: Boolean = DEFAULT_AUTO_PLAY,
    autoPlaySpeed: Long = DEFAULT_AUTO_PLAY_SPEED_MILLIS,
    loop: Boolean = DEFAULT_LOOP,
    content: @Composable (page: Int) -> Unit,
) {
    var isVisible by remember {
        mutableStateOf(false)
    }
    VisibilityTracker(
        onIsFullyVisible = { isVisible = it }
    ) {
        AutoPlay(
            carouselState = carouselState,
            itemCount = itemCount,
            autoPlay = autoPlay,
            autoPlaySpeed = autoPlaySpeed,
            loop = loop,
            isVisible = isVisible
        )
        HorizontalPager(
            modifier = modifier,
            state = carouselState.pagerState,
            contentPadding = contentPadding,
            count = itemCount,
        ) { page ->
            val (start, end) = when (page) {
                0 -> 16.dp to 4.dp
                itemCount - 1 -> 4.dp to 16.dp
                else -> 4.dp to 4.dp
            }
            Box(
                modifier = modifier.padding(start = start, end = end)
            ) {
                content(page)
            }
        }
    }
}

@Composable
private fun AutoPlay(
    carouselState: CarouselState,
    itemCount: Int,
    autoPlay: Boolean,
    autoPlaySpeed: Long,
    loop: Boolean,
    isVisible: Boolean,
) {
    val scope = rememberCoroutineScope()
    LaunchedEffect(isVisible, autoPlay, autoPlaySpeed, loop, carouselState.currentPage) {
        if (autoPlay && isVisible) {
            delay(autoPlaySpeed)

            val nextPage = carouselState.currentPage + 1
            if (nextPage < itemCount) {
                scope.launch {
                    carouselState.pagerState.animateScrollToPage(nextPage)
                }
            } else if (loop) {
                scope.launch {
                    carouselState.pagerState.animateScrollToPage(0)
                }
            }
        }
    }
}

data class PaddingValuesWithStartAndEndMargin(
    private val carouselState: CarouselState,
    private val start: Dp = 4.dp,
    private val end: Dp = 4.dp,
    private val top: Dp = 0.dp,
    private val bottom: Dp = 0.dp,
    private val firstItemStart: Dp = 0.dp,
    private val firstItemEnd: Dp = 32.dp,
    private val lastItemStart: Dp = 32.dp,
    private val lastItemEnd: Dp = 0.dp,
): PaddingValues {
    override fun calculateLeftPadding(layoutDirection: LayoutDirection): Dp = when (carouselState.currentPage) {
        0 -> firstItemStart
        carouselState.pageCount-1 -> lastItemStart
        else -> start
    }

    override fun calculateTopPadding() = top

    override fun calculateRightPadding(layoutDirection: LayoutDirection) = when (carouselState.currentPage) {
        0 -> firstItemEnd
        carouselState.pageCount-1 -> lastItemEnd
        else -> end
    }

    override fun calculateBottomPadding() = bottom

}
