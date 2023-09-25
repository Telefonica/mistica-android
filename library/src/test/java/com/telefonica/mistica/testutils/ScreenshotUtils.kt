package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.theme.brand.Brand

object ScreenshotUtils {
    fun getScreenshotName(brand: Brand? = null, extra: String = ""): String {
        return """screenshots/
            ${TestUtils.findRunningTestMethodName()}
            ${brandName(brand, prepend = "_")}${extra}.png"""
            .replace("\\s+".toRegex(), "")
    }

    private fun brandName(brand: Brand?, prepend: String = "", append: String = ""): String {
        return if (brand != null) {
            "$prepend${brand::class.java.simpleName}$append"
        } else {
            ""
        }
    }
}
