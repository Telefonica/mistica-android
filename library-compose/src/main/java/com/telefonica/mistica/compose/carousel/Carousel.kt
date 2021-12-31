package com.telefonica.mistica.compose.carousel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.telefonica.mistica.compose.theme.MisticaTheme

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Carousel(
    pagerIndicatorActiveColor: Color = MisticaTheme.colors.carouselIndicatorActiveColor,
    pagerIndicatorInactiveColor: Color = MisticaTheme.colors.carouselIndicatorInactiveColor,
    paddingValues: PaddingValues = PaddingValues(start = 8.dp, end = 24.dp),
) {
    val pagerState = rememberPagerState()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            state = pagerState,
            // Add 32.dp horizontal padding to 'center' the pages
            contentPadding = paddingValues,
            count = 6,
        ) { page ->
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

        CarouselPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            activeColor = pagerIndicatorActiveColor,
            inactiveColor = pagerIndicatorInactiveColor,
            pagerCount = 6, //TODO
            debug = true,
        )
    }

}