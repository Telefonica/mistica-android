package com.telefonica.mistica.button

import android.content.Intent
import android.widget.FrameLayout
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.DummyActivity.Companion.EXTRA_THEME
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils.getAllBrands
import com.telefonica.mistica.testutils.TestUtils.getAllButtonStyles
import com.telefonica.mistica.testutils.TestUtils.isInverse
import com.telefonica.mistica.util.getThemeColor
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class ButtonTest(
    private val brand: Brand,
    private val style: ButtonStyle,
    private val icon: Boolean,
) : ScreenshotsTest() {

    private val intent = Intent(ApplicationProvider.getApplicationContext(), DummyActivity::class.java).apply {
        this.putExtra(EXTRA_THEME, brand.getBaseThemeForBrand())
    }

    @get:Rule
    val rule = activityScenarioRule<DummyActivity>(intent)

    @Test
    fun `check Xml Button`() {
        checkXmlButton(brand, style, icon, false)
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check Xml Button dark`() {
        checkXmlButton(brand, style, icon, true)
    }

    private fun checkXmlButton(brand: Brand = MovistarBrand, style: ButtonStyle, icon: Boolean, darkTheme: Boolean) {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val button = Button(activity, null, style.getButtonStyleRef())
            button.text = "textValue"
            var iconSuffix: String? = null
            if (icon) {
                button.setIconResource(android.R.drawable.ic_lock_power_off)
                iconSuffix = "icon"
            }
            if (style.isInverse()) {
                wrapper.setBackgroundColor(activity.getThemeColor(R.attr.colorBackgroundBrand))
            } else {
                wrapper.setBackgroundColor(activity.getThemeColor(R.attr.colorBackground))
            }
            wrapper.removeAllViews()
            wrapper.addView(button)

            compareScreenshot(
                Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)),
                component = "XMLButton",
                style = style.toString(),
                brand = brand,
                darkTheme = darkTheme,
                extra = iconSuffix
            )
        }
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "ButtonXML {1} {0} icon={2}")
        fun brands(): List<Array<Any>> {
            val allBrands = getAllBrands()
            val buttonStyles = getAllButtonStyles()
            val icons = listOf(false, true)
            return allBrands.flatMap { brand ->
                buttonStyles.flatMap { buttonStyle ->
                    icons.map { hasIcon ->
                        arrayOf(brand, buttonStyle, hasIcon)
                    }
                }
            }
        }
    }
}

fun Brand.getBaseThemeForBrand() = when (this) {
    MovistarBrand -> R.style.MisticaTheme_Movistar_test
    VivoBrand -> R.style.MisticaTheme_Vivo_test
    VivoBrand -> R.style.MisticaTheme_O2_test
    VivoBrand -> R.style.MisticaTheme_Blau_test
    else -> R.style.MisticaTheme_Telefonica_test

}

fun ButtonStyle.getButtonStyleRef() = when (this) {
    ButtonStyle.PRIMARY -> R.attr.defaultButtonTest_test
    ButtonStyle.PRIMARY_SMALL -> R.attr.defaultButton_Small_test
    ButtonStyle.SECONDARY -> R.attr.secondaryButton_test
    ButtonStyle.SECONDARY_SMALL -> R.attr.secondaryButton_Small_test
    ButtonStyle.DANGER -> R.attr.dangerButton_test
    ButtonStyle.DANGER_SMALL -> R.attr.dangerButton_Small_test
    ButtonStyle.LINK -> R.attr.linkButton_test
    ButtonStyle.PRIMARY_INVERSE -> R.attr.primaryButtonInverse_test
    ButtonStyle.PRIMARY_SMALL_INVERSE -> R.attr.primaryButtonInverse_Small_test
    ButtonStyle.SECONDARY_INVERSE -> R.attr.secondaryButtonInverse_test
    ButtonStyle.SECONDARY_SMALL_INVERSE -> R.attr.secondaryButtonInverse_Small_test
    ButtonStyle.LINK_INVERSE -> R.attr.linkButtonInverse_test
}