package com.telefonica.mistica.compose.button

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.testutils.ScreenshotUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(ParameterizedRobolectricTestRunner::class)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel5)
internal class ButtonKtTest(private val brand: Brand) {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the button screenshot`() {
        `when Button`(brand)

        `then screenshot is OK`(brand)
    }

    private fun `when Button`(brand: Brand = MovistarBrand) {
        composeTestRule.setContent {
            MisticaTheme(brand = brand) {
                Button(
                    text = "textValue",
                    onClickListener = { },
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }

    private fun `then screenshot is OK`(brand: Brand) {
        composeTestRule.onRoot()
            .captureRoboImage(ScreenshotUtils.getScreenshotName(brand = brand))
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "Input: {0}")
        fun brands() = listOf(
            arrayOf(MovistarBrand),
            arrayOf(VivoBrand),
            arrayOf(O2Brand),
            arrayOf(BlauBrand),
            arrayOf(TelefonicaBrand),
        )
    }
}
