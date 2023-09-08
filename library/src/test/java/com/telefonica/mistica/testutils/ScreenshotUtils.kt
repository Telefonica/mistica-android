package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.theme.brand.Brand

object ScreenshotUtils {
    fun getScreenshotName(brand: Brand? = null): String {
        return "screenshots/${TestUtils.findRunningTestMethodName()}${brandName(brand)}.png"
    }

    private fun brandName(brand: Brand?): String {
        return if (brand != null) {
            "_${brand::class.java.simpleName}"
        } else {
            ""
        }
    }
}
