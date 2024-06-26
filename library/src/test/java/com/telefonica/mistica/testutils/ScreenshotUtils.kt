package com.telefonica.mistica.testutils

import com.telefonica.mistica.compose.theme.brand.Brand

object ScreenshotUtils {

    fun getScreenshotName(component: String?, style: String?, brand: Brand?, darkTheme: Boolean, extra: String?): String {
        val componentOrTestName = if(component == null) {
            TestUtils.findRunningTestMethodName()
        } else {
            var componentName = component
            if (style != null) {
                componentName += "_$style"
            }
            componentName
        }
        val brandValue = if (brand != null) {
            brand::class.java.simpleName
        } else {
            null
        }
        val nonNullParams = listOfNotNull(
            componentOrTestName,
            brandValue,
            extra,
            "dark".takeIf { darkTheme }
        ).joinToString(separator = "_")

        return "screenshots/$nonNullParams.png".replace("\\s+".toRegex(), "")
    }

}
