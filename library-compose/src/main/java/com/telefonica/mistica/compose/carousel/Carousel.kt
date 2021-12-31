package com.telefonica.mistica.compose.carousel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Carousel(
    pagerState: CarouselState = rememberCarouselState(),
    itemCount: Int,
    paddingValues: PaddingValues = PaddingValues(start = 16.dp, end = 16.dp), //TODO Should vary for the first and last
    content: @Composable (page: Int) -> Unit,
) {
    HorizontalPager(
        state = pagerState,
        // Add 32.dp horizontal padding to 'center' the pages
        contentPadding = paddingValues,
        count = 6,
    ) { page ->
        Box(
            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
        ) {
            content(page)
        }
    }
}
