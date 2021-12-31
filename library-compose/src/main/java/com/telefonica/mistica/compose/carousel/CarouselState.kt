package com.telefonica.mistica.compose.carousel

import androidx.annotation.IntRange
import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
typealias CarouselState = PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun rememberCarouselState(
    @IntRange(from = 0) initialPage: Int = 0
): CarouselState = rememberPagerState(initialPage)