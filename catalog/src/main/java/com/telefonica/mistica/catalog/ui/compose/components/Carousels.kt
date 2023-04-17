package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.mediacard.MediaCard
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage
import com.telefonica.mistica.compose.carousel.Carousel
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator
import com.telefonica.mistica.compose.carousel.rememberCarouselState
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView

@Composable
fun Carousels() {
    val carouselState = rememberCarouselState()
    val itemCount by remember { mutableStateOf(6)}
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Carousel(
            itemCount = itemCount,
            carouselState = carouselState,
        ) { page ->
            CarouselItem(page)
        }
        CarouselPagerIndicator(
            carouselState = carouselState,
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
    MediaCard(
        modifier = Modifier.height(500.dp),
        image = MediaCardImage.MediaCardImageResource(R.drawable.card_image_sample),
        tag = Tag("HEADLINE").withStyle(TagView.TYPE_PROMO),
        title = "Page ${page+1} ",
        subtitle = "(position ${page})",
        description = "Description",
        primaryButton = Action("Primary") {},
        linkButton = Action("Link") {}
    )
}

