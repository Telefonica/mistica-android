package com.telefonica.mistica.compose.tag

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_ERROR
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INACTIVE
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INFO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.tag.TagView.Companion.TYPE_SUCCESS
import com.telefonica.mistica.tag.TagView.Companion.TYPE_WARNING
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class TagTest(
    private val brand: Brand,
) : ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check tags appearance`() = test {
        `when Tags`(brand)

        Thread.sleep(5000)
        `then screenshot is OK`(brand)
    }

    private fun TestScope.`when Tags`(brand: Brand) {
        composeTestRule.setContent {
            MisticaTheme(brand = brand) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier.padding(16.dp)
                ) {
                    buttons.forEach {
                        item {
                            Tag(
                                text = it.text,
                                style = it.style,
                                customColors = it.customColors,
                                modifier = Modifier.padding(4.dp)
                            )
                        }
                    }
                }
            }
        }
    }

    private fun `then screenshot is OK`(brand: Brand) {
        compareScreenshot(composeTestRule.onRoot(), brand = brand)
    }

    private fun test(block: TestScope.() -> Unit) {
        TestScope().block()
    }

    private class TestScope {
        val buttons: List<ButtonInfo> = listOf(
            ButtonInfo("Promotion", TYPE_PROMO),
            ButtonInfo("Info", TYPE_INFO),
            ButtonInfo("Active", TYPE_ACTIVE),
            ButtonInfo("Inactive", TYPE_INACTIVE),
            ButtonInfo("Success", TYPE_SUCCESS),
            ButtonInfo("Warning", TYPE_WARNING),
            ButtonInfo("Error", TYPE_ERROR),
            ButtonInfo(
                text = "CustomColor",
                style = TYPE_ERROR,
                customColors = TagColors(
                    backgroundColor = Color(CUSTOM_TAG_COLOR),
                    textColor = Color.White,
                )
            ),
        )
    }

    companion object {
        private const val CUSTOM_TAG_COLOR = 0xFF00CAB3

        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "Brand: {0}")
        fun brands() = TestUtils.getAllBrands().map { arrayOf(it) }
    }

    data class ButtonInfo(
        val text: String,
        @TagStyle val style: Int,
        val customColors: TagColors? = null,
    )
}
