package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.theme.brand.Brand

object ScreenshotUtils {
    fun getScreenshotName(brand: Brand? = null, extra: String = ""): String {
        return "screenshots/${TestUtils.findRunningTestMethodName()}${brandName(brand)}${extra}.png"
    }

    private fun brandName(brand: Brand?): String {
        return if (brand != null) {
            "_${brand::class.java.simpleName}"
        } else {
            ""
        }
    }
}
