package com.telefonica.mistica.list

import android.content.Intent
import android.widget.FrameLayout
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.list.ListRowView.BackgroundType.Companion.TYPE_BOXED
import com.telefonica.mistica.list.ListRowView.BackgroundType.Companion.TYPE_BOXED_INVERSE
import com.telefonica.mistica.list.ListRowView.BackgroundType.Companion.TYPE_NORMAL
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(ParameterizedRobolectricTestRunner::class)
class ListRowItemTest(
    private val brand: Brand,
    private val smallAsset: Boolean,
    @ListRowView.BackgroundType private val backgroundType: Int,
) : ScreenshotsTest() {
    private val intent = Intent(ApplicationProvider.getApplicationContext(), DummyActivity::class.java).apply {
        this.putExtra(DummyActivity.EXTRA_THEME, TestUtils.getBaseThemeForBrand(brand))
    }

    @get:Rule
    val rule = activityScenarioRule<DummyActivity>(intent)

    @Test
    fun `ListRowItem XML screenshot light`() {
        `listRowItem XML screenshot`(darkTheme = false)
    }

    @Config(qualifiers = "+night")
    @Test
    fun `ListRowItem XML screenshot dark`() {
        `listRowItem XML screenshot`(darkTheme = true)
    }

    private fun `listRowItem XML screenshot`(darkTheme: Boolean) {
        rule.scenario.onActivity { activity ->
            val dimensions = if (smallAsset) {
                ImageDimensions(width = 32, height = 32)
            } else {
                ImageDimensions(width = 64, height = 64)
            }
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val listRowView = ListRowView(activity).apply {
                setAssetType(
                    if(smallAsset) TYPE_SMALL_ICON else ListRowView.TYPE_IMAGE_1_1,
                    dimensions = ImageDimensions(width = dimensions.width, height = dimensions.height),
                )
                setTitle("Title")
                setSubtitle("Subtitle")
                setDescription("Description")
                setBadge(show = true)
                setNumericBadge(1)
                setAssetDrawable(activity.getDrawable(android.R.drawable.ic_lock_power_off))
                setBackgroundType(backgroundType)

            }

            wrapper.removeAllViews()
            wrapper.addView(listRowView)

            val screenshotSuffix = StringBuilder()
            val backgroundTypeName = when (backgroundType) {
                TYPE_NORMAL -> "TYPE_NORMAL"
                TYPE_BOXED -> "TYPE_BOXED"
                TYPE_BOXED_INVERSE -> "TYPE_BOXED_INVERSE"
                else -> "TYPE_NORMAL"

            }
            screenshotSuffix.append("${backgroundTypeName}_")

            if (smallAsset) {
                screenshotSuffix.append("32x32")
            } else {
                screenshotSuffix.append("64x64")
            }

            compareScreenshot(
                node = Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)),
                component = "ListRowItemXML",
                style = null,
                brand = brand,
                darkTheme = darkTheme,
                extra = screenshotSuffix.toString()
            )
        }
    }


    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters
        fun brands(): List<Array<Any?>> {
            val brands = TestUtils.getAllBrands()
            val smallAsset = arrayOf(false, true)
            val backgroundType = arrayOf(TYPE_NORMAL, TYPE_BOXED, TYPE_BOXED_INVERSE)

            return brands.flatMap { brand ->
                smallAsset.flatMap { isSmall ->
                    backgroundType.map { backgroundType ->
                        arrayOf(brand, isSmall, backgroundType)
                    }
                }
            }
        }
    }
}