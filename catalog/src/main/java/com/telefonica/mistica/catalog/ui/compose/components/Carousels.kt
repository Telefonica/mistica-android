package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
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
import com.telefonica.mistica.compose.input.CheckBoxInput
import com.telefonica.mistica.compose.input.TextInput
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView
import java.util.concurrent.TimeUnit

private const val ITEM_COUNT = 6
private const val DEFAULT_AUTO_PLAY_SPEED_SECONDS = 5L

@Composable
fun Carousels() {
    val carouselState = rememberCarouselState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        var autoPlay by remember {
            mutableStateOf(false)
        }
        CheckBoxInput(
            modifier = Modifier.padding(16.dp),
            text = "Autoplay",
            checked = autoPlay,
            onCheckedChange = { autoPlay = it }
        )
        var loop by remember {
            mutableStateOf(false)
        }
        CheckBoxInput(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp),
            text = "Loop",
            checked = loop,
            onCheckedChange = { loop = it }
        )

        var autoPlaySpeed by remember {
            mutableStateOf("")
        }
        TextInput(
            modifier = Modifier.padding(horizontal = 16.dp),
            value = autoPlaySpeed,
            onValueChange = { autoPlaySpeed = it },
            label = "Auto play speed in seconds"
        )

        Carousel(
            modifier = Modifier.padding(top = 8.dp),
            itemCount = ITEM_COUNT,
            carouselState = carouselState,
            autoPlay = autoPlay,
            autoPlaySpeed = TimeUnit.SECONDS.toMillis(autoPlaySpeed.toLongOrNull() ?: DEFAULT_AUTO_PLAY_SPEED_SECONDS),
            loop = loop,
        ) { page ->
            CarouselItem(page)
        }
        CarouselPagerIndicator(
            carouselState = carouselState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            pagerCount = ITEM_COUNT,
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

