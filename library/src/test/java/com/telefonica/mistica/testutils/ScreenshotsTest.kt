package com.telefonica.mistica.testutils

import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.test.espresso.ViewInteraction
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.brand.Brand
import org.robolectric.annotation.Config

@Config(qualifiers = RobolectricDeviceQualifiers.Pixel5)
open class ScreenshotsTest {
    fun compareScreenshot(
        node: SemanticsNodeInteraction,
        brand: Brand? = null,
        darkTheme: Boolean = false,
        extra: String = "",
    ) {
        node.captureRoboImage(screenshotName(brand, darkTheme, extra))
    }

    fun compareScreenshot(
        node: ViewInteraction,
        brand: Brand? = null,
        darkTheme: Boolean = false,
        extra: String = "",
    ) {
        node.captureRoboImage(screenshotName(brand, darkTheme, extra))
    }

    private fun screenshotName(brand: Brand?, darkTheme: Boolean, extra: String) = ScreenshotUtils.getScreenshotName(
        brand = brand,
        extra = if (darkTheme) "_dark$extra" else extra
    )
}
