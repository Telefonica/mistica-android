package com.telefonica.mistica.carousel

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import com.telefonica.mistica.compose.carousel.Carousel
import com.telefonica.mistica.compose.carousel.CarouselState

class CarouselView(context: Context) : AbstractComposeView(context, attrs = null, defStyleAttr = 0) {

    private lateinit var carouselState: CarouselState
    private lateinit var body: @Composable (Int)-> Unit

    fun setState(carouselState: CarouselState): CarouselView = this.apply {
        this.carouselState = carouselState
    }

    fun setContent(body: @Composable (Int)-> Unit): CarouselView = this.apply {
        this.body = body
    }

    @Composable
    override fun Content() {
        Carousel(itemCount = carouselState.pageCount) {
            body(it)
        }
    }

}