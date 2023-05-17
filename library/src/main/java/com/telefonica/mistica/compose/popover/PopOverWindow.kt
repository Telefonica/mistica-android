package com.telefonica.mistica.compose.popover

import com.skydoves.balloon.compose.BalloonWindow

class PopOverWindow(private val balloonWindow: BalloonWindow) {
    fun showAlignTop() {
        balloonWindow.showAlignTop()
    }

    fun dismiss() {
        balloonWindow.dismiss()
    }
}