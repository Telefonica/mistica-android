package com.telefonica.mistica.compose.carousel

import androidx.annotation.IntRange
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
open class CarouselState(open val pagerState: PagerState) {
    open val currentPage: Int by derivedStateOf { pagerState.currentPage }
    open val pageCount: Int  by derivedStateOf { pagerState.pageCount }
    open val currentPageOffset: Float by derivedStateOf { pagerState.currentPageOffset }

    companion object {
        val Saver: Saver<CarouselState, *> = listSaver(
            save = {
                listOf<Any>(
                    it.currentPage,
                )
            },
            restore = {
                CarouselState(PagerState(it[0] as Int))
            }
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun rememberCarouselState(
    @IntRange(from = 0) initialPage: Int = 0,
): CarouselState = rememberSaveable(saver = CarouselState.Saver) { CarouselState(PagerState(initialPage)) }