package com.telefonica.mistica.carousel

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import com.telefonica.mistica.compose.carousel.Carousel
import com.telefonica.mistica.compose.carousel.CarouselState
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView

class CarouselView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractMisticaComposeView(
    context,
    attrs,
    defStyleAttr,
) {

    private lateinit var carouselState: CarouselState
    private var itemCount: Int = 0
    private lateinit var body: @Composable (Int) -> Unit

    fun setState(carouselState: CarouselState): CarouselView = this.apply {
        this.carouselState = carouselState
    }

    fun setItemCount(itemCount: Int): CarouselView = this.apply {
        this.itemCount = itemCount
    }

    fun setContent(body: @Composable (Int) -> Unit): CarouselView = this.apply {
        this.body = body
    }

    @Composable
    override fun Content() {
        Theme {
            Carousel(
                itemCount = itemCount,
                carouselState = carouselState,
            ) {
                body(it)
            }
        }
    }

}