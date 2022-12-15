package com.telefonica.mistica.carousel

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator
import com.telefonica.mistica.compose.carousel.CarouselState
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

class CarouselPageIndicatorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractComposeView(
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
        MisticaTheme(brand = MovistarBrand) {
            CarouselPagerIndicator(
                carouselState = carouselState,
                modifier = Modifier
                    .padding(16.dp),
                pagerCount = pageCount,
                debug = true,
            )
        }
    }

}