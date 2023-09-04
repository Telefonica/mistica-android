package com.telefonica.mistica.testutils

object ScreenshotUtils {
    fun getScreenshotName(): String {
        return "screenshots/${TestUtils.findRunningTestMethodName()}.png"
    }
}
