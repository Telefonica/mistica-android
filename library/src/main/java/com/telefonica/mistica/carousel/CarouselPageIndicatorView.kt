package com.telefonica.mistica.carousel

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator
import com.telefonica.mistica.compose.carousel.CarouselState
import com.telefonica.mistica.compose.composeview.AbstractMisticaComposeView

class CarouselPageIndicatorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractMisticaComposeView(
    context,
    attrs,
    defStyleAttr,
) {

    private lateinit var carouselState: CarouselState
    private var pageCount: Int = 0

    fun setState(carouselState: CarouselState): CarouselPageIndicatorView = this.apply {
        this.carouselState = carouselState
    }

    fun setPageCount(pageCount: Int) {
        this.pageCount = pageCount
    }

    @Composable
    override fun Content() {
        Theme {
            CarouselPagerIndicator(
                carouselState = carouselState,
                pagerCount = pageCount,
            )
        }
    }

}