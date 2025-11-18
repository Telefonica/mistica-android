package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.ParameterizedRobolectricTestRunner.Parameters

@RunWith(ParameterizedRobolectricTestRunner::class)
class ListRowItemTest(
    private val brand: Brand,
    private val smallAsset: Boolean,
    private val backgroundType: BackgroundType,
    private val darkTheme: Boolean,
) : ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `ListRowItem compose screenshot`() {
        composeTestRule.setContent {
            MisticaTheme(brand = brand, darkTheme = darkTheme) {
                Surface(
                    color = MisticaTheme.colors.background
                ) {
                    val dimensions = if (smallAsset) {
                        ImageDimensions(width = 32, height = 32)
                    } else {
                        ImageDimensions(width = 64, height = 64)
                    }
                    ListRowItem(
                            title = "Title",
                            subtitle = "Subtitle",
                            description = "Description",
                            backgroundType = backgroundType,
                            isBadgeVisible = true,
                            badge = "1",
                            onClick = {},
                            listRowIcon = ListRowIcon.ImageAsset(
                                painter = painterResource(id = android.R.drawable.ic_lock_power_off),
                                dimensions = dimensions
                            ),
                        )
                }
            }
        }

        val screenshotSuffix = StringBuilder()
        screenshotSuffix.append("${backgroundType.name}_")

        if (smallAsset) {
            screenshotSuffix.append("32x32")
        } else {
            screenshotSuffix.append("64x64")
        }

        compareScreenshot(
            node = composeTestRule.onRoot(),
            component = "ListRowItem",
            style = null,
            brand = brand,
            darkTheme = darkTheme,
            extra = screenshotSuffix.toString()
        )
    }

    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        @Parameters
        fun brands(): List<Array<Any?>> {
            val brands = TestUtils.getAllBrands()
            val smallAsset = arrayOf(false, true)
            val backgroundType = arrayOf(BackgroundType.TYPE_NORMAL, BackgroundType.TYPE_BOXED, BackgroundType.TYPE_BOXED_INVERSE)
            val darkTheme = arrayOf(false, true)

            return brands.flatMap { brand ->
                smallAsset.flatMap { isSmall ->
                    backgroundType.flatMap { backgroundType ->
                            darkTheme.map { darkTheme ->
                                arrayOf(brand, isSmall, backgroundType, darkTheme)
                            }

                    }
                }
            }
        }
    }
}