package com.telefonica.mistica.compose.popover

import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.positionInRoot
import com.skydoves.balloon.compose.BalloonWindow

class PopOverWindow(var balloonWindow: BalloonWindow?, var coordinates: LayoutCoordinates?) {
    fun showAlignAuto() {
        coordinates?.let {
            val popOverViewAboveY: Float = it.parentCoordinates?.positionInRoot()?.y?.minus(it.size.height) ?: 0f

            if (popOverViewAboveY < 0) {
                balloonWindow?.showAlignBottom()
            } else {
                balloonWindow?.showAlignTop()
            }
        } ?: run {
            balloonWindow?.showAlignBottom()
        }
    }

    fun showAlignTop() {
        balloonWindow?.showAlignTop()
    }

    fun showAlignBottom() {
        balloonWindow?.showAlignBottom()
    }
}
