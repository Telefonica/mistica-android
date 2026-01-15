package com.telefonica.mistica.button

import android.content.Intent
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
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
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import com.telefonica.mistica.testutils.TestUtils.getAllBrands
import com.telefonica.mistica.testutils.TestUtils.isInverse
import com.telefonica.mistica.util.getMisticaThemeDrawable
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
        this.putExtra(EXTRA_THEME, TestUtils.getBaseThemeForBrand(brand))
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
            val button = activity.layoutInflater.inflate(
                style.getButtonLayout(),
                null,
                false
            ) as Button
            button.text = "textValue"
            var iconSuffix: String? = null
            if (icon) {
                button.setIconResource(android.R.drawable.ic_lock_power_off)
                iconSuffix = "icon"
            }
            if (style.isInverse()) {
                wrapper.background = activity.getMisticaThemeDrawable(R.attr.drawableBackgroundBrand)
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
            val buttonStyles = ButtonStyle.entries
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

@LayoutRes
@Suppress("CyclomaticComplexMethod")
private fun ButtonStyle.getButtonLayout(): Int = when (this) {
    ButtonStyle.PRIMARY_MAIN -> R.layout.primary_button
    ButtonStyle.PRIMARY_SMALL -> R.layout.primary_button_small
    ButtonStyle.SECONDARY -> R.layout.secondary_button
    ButtonStyle.SECONDARY_SMALL -> R.layout.secondary_button_small
    ButtonStyle.DANGER -> R.layout.danger_button
    ButtonStyle.DANGER_SMALL -> R.layout.danger_button_small
    ButtonStyle.LINK -> R.layout.link_regular_button
    ButtonStyle.PRIMARY_INVERSE -> R.layout.primary_button_inverse
    ButtonStyle.PRIMARY_SMALL_INVERSE -> R.layout.primary_button_inverse_small
    ButtonStyle.SECONDARY_INVERSE -> R.layout.secondary_button_inverse
    ButtonStyle.SECONDARY_SMALL_INVERSE -> R.layout.secondary_button_inverse_small
    ButtonStyle.LINK_INVERSE -> R.layout.link_button_inverse
    ButtonStyle.LINK_SMALL -> R.layout.link_small_button
    ButtonStyle.LINK_SMALL_INVERSE -> R.layout.link_small_button_inverse
    ButtonStyle.DANGER_LINK -> R.layout.danger_link_button
    ButtonStyle.DANGER_LINK_SMALL -> R.layout.danger_link_small_button
    ButtonStyle.DANGER_LINK_INVERSE -> R.layout.danger_link_button_inverse
    ButtonStyle.DANGER_LINK_SMALL_INVERSE -> R.layout.danger_link_small_button_inverse
}
