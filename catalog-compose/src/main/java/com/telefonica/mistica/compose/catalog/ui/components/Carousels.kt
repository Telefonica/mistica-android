package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.telefonica.mistica.compose.carousel.Carousel
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator
import com.telefonica.mistica.compose.carousel.rememberCarouselState

@OptIn(ExperimentalPagerApi::class)
@ExperimentalFoundationApi
@Composable
fun Carousels() {
    val carouselState = rememberCarouselState()
    val itemCount by remember { mutableStateOf(6)}
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Carousel(
            itemCount = itemCount,
            pagerState = carouselState,
        ) { page ->
            CarouselItem(page)
        }
        CarouselPagerIndicator(
            pagerState = carouselState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            pagerCount = itemCount,
            debug = true,
        )
    }
}

@Composable
private fun CarouselItem(page: Int) {
    Card(
        Modifier
            .fillMaxWidth()
    ) {
        // Our page content
        Box(modifier = Modifier
            .height(100.dp)
            .width(200.dp)
            .background(Color.Cyan)) {
            Text(
                text = "Page: $page",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

