package com.telefonica.mistica.carousel

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.compose.carousel.Carousel
import com.telefonica.mistica.compose.carousel.CarouselState
import com.telefonica.mistica.compose.carousel.DEFAULT_AUTO_PLAY
import com.telefonica.mistica.compose.carousel.DEFAULT_AUTO_PLAY_SPEED_MILLIS
import com.telefonica.mistica.compose.carousel.DEFAULT_LOOP
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
    private var autoPlay: Boolean = DEFAULT_AUTO_PLAY
    private var autoPlaySpeed: Long = DEFAULT_AUTO_PLAY_SPEED_MILLIS
    private var loop: Boolean = DEFAULT_LOOP

    /**If composable is set it will render it by default*/
    private var body: (@Composable (Int) -> Unit)? = null

    /**If the default body composable body is null a list of View elements will be rendered*/
    private var data: List<View>? = null

    fun setState(carouselState: CarouselState): CarouselView = this.apply {
        this.carouselState = carouselState
    }

    fun setAutoPlay(autoPlay: Boolean) = apply {
        this.autoPlay = autoPlay
    }

    fun setLoop(loop: Boolean) = apply {
        this.loop = loop
    }

    fun setAutoPlaySpeed(autoPlaySpeed: Long) = apply {
        this.autoPlaySpeed = autoPlaySpeed
    }

    fun setItemCount(itemCount: Int): CarouselView = this.apply {
        this.itemCount = itemCount
    }

    /**A list of views to be rendered in each page of the carousel.
     * If a composable has been set it will render it by default
     * @param pages: List of views to be rendered in each page of the carousel
     */
    fun setContent(pages: List<View>): CarouselView = this.apply {
        data = pages
    }

    /**If a composable is set it will render it by default
     * @param body: Composable that will be rendered in the carousel
     */
    fun setContent(body: @Composable (Int) -> Unit): CarouselView = this.apply {
        this.body = body
    }

    @Composable
    override fun Content() {
        Theme {
            Carousel(
                itemCount = itemCount,
                carouselState = carouselState,
                autoPlay = autoPlay,
                autoPlaySpeed = autoPlaySpeed,
                loop = loop,
            ) { position ->
                body?.let { it(position) } ?: data?.get(position)?.let { CarouselItem(it) }
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