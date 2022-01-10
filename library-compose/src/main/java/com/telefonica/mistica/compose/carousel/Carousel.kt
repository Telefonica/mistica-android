package com.telefonica.mistica.compose.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Carousel(
    modifier: Modifier = Modifier,
    carouselState: CarouselState = rememberCarouselState(),
    contentPadding: PaddingValues = PaddingValuesWithStartAndEndMargin(carouselState, start = 16.dp, end = 16.dp),
    itemCount: Int,
    content: @Composable (page: Int) -> Unit,
) {
    HorizontalPager(
        state = carouselState.pagerState,
        contentPadding = contentPadding,
        count = itemCount,
    ) { page ->
        val (start, end) = when (page) {
            0 -> 16.dp to 4.dp
            itemCount-1 -> 4.dp to 16.dp
            else -> 4.dp to 4.dp
        }
        Box(
            modifier = modifier.padding(start = start, end = end, top = 0.dp, bottom = 0.dp)
        ) {
            content(page)
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
internal data class PaddingValuesWithStartAndEndMargin(
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
