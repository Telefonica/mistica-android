package com.telefonica.mistica.testutils

import android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.test.espresso.ViewInteraction
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.brand.Brand
import org.robolectric.annotation.Config

@Config(sdk = [UPSIDE_DOWN_CAKE], qualifiers = RobolectricDeviceQualifiers.Pixel5)
open class ScreenshotsTest {
    fun compareScreenshot(
        node: SemanticsNodeInteraction,
        component: String? = null,
        style: String? = null,
        brand: Brand? = null,
        darkTheme: Boolean = false,
        extra: String? = null,
    ) {
        node.captureRoboImage(screenshotName(component, style, brand, darkTheme, extra))
    }

    fun compareScreenshot(
        node: ViewInteraction,
        component: String? = null,
        style: String? = null,
        brand: Brand? = null,
        darkTheme: Boolean = false,
        extra: String? = null,
    ) {
        node.captureRoboImage(screenshotName(component, style, brand, darkTheme, extra))
    }

    private fun screenshotName(component: String?, style: String?, brand: Brand?, darkTheme: Boolean, extra: String?) =
        ScreenshotUtils.getScreenshotName(
            component = component,
            style = style,
            brand = brand,
            darkTheme = darkTheme,
            extra = extra
        )
}
