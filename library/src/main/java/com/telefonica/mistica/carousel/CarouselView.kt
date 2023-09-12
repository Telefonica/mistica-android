package com.telefonica.mistica.carousel

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.accompanist.pager.PagerState
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

    private var carouselState: CarouselState = CarouselState(PagerState(0))
    private var itemCount: Int = 0
    private var data: List<View>? = null
    private var pageIndicatorView: CarouselPageIndicatorView? = null

    fun setPagerIndicatorView(pageIndicatorView: CarouselPageIndicatorView): CarouselView = this.apply {
        this.pageIndicatorView = pageIndicatorView
        initPageIndicator()
    }

    fun setItemCount(itemCount: Int): CarouselView = this.apply {
        this.itemCount = itemCount
        initPageIndicator()
    }

    private fun initPageIndicator() {
        this.pageIndicatorView?.setState(carouselState)
        this.pageIndicatorView?.setPageCount(itemCount)
    }

    fun setContent(pages: List<View>): CarouselView = this.apply {
        data = pages
    }

    @Composable
    override fun Content() {
        Theme {
            Carousel(
                itemCount = itemCount,
                carouselState = carouselState,
            ) { position ->
                data?.get(position)?.let { CarouselItem(it) }
            }
        }
    }
}

@Composable
private fun CarouselItem(view: View) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            view
        }
    )

}