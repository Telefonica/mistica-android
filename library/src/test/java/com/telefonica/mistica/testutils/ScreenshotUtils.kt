package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.theme.brand.Brand

object ScreenshotUtils {
    fun getScreenshotName(brand: Brand? = null): String {
        return "screenshots/${brandName(brand)}/${TestUtils.findRunningTestMethodName()}.png"
    }

    private fun brandName(brand: Brand?): String {
        return if (brand != null) {
            brand::class.java.simpleName
        } else {
            ""
        }
    }
}
