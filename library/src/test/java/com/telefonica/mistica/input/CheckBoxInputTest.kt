package com.telefonica.mistica.input

import android.content.Intent
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.FrameLayout
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(ParameterizedRobolectricTestRunner::class)
class CheckBoxInputTest(
    private val brand: Brand,
    private val checked: Boolean,
    private val isEnabled: Boolean,
    private val errorText: String?,
) : ScreenshotsTest() {
    private val intent = Intent(ApplicationProvider.getApplicationContext(), DummyActivity::class.java).apply {
        this.putExtra(DummyActivity.EXTRA_THEME, TestUtils.getBaseThemeForBrand(brand))
    }

    @get:Rule
    val rule = activityScenarioRule<DummyActivity>(intent)

    @Test
    fun `CheckBoxInput XML screenshot light`() {
        `compare CheckBoxInput XML screenshot`(darkTheme = false)
    }

    @Config(qualifiers = "+night")
    @Test
    fun `CheckBoxInput XML screenshot dark`() {
        `compare CheckBoxInput XML screenshot`(darkTheme = true)
    }

    private fun `compare CheckBoxInput XML screenshot`(darkTheme: Boolean) {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val checkbox = CheckBoxInput(activity).apply {
                setChecked(checked)
                error = errorText
                setText(createSpannableText())
                setMovementMethod(LinkMovementMethod.getInstance())
                isEnabled = this@CheckBoxInputTest.isEnabled
            }

            wrapper.removeAllViews()
            wrapper.addView(checkbox)

            val screenshotSuffix = StringBuilder()
            if (errorText != null) {
                screenshotSuffix.append("_errorText")
            }
            if (!isEnabled) {
                screenshotSuffix.append("_disabled")
            }

            if (checked) {
                screenshotSuffix.append("_checked")
            } else {
                screenshotSuffix.append("_unchecked")
            }

            compareScreenshot(
                node = Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)),
                component = "CheckBoxInputXML",
                style = null,
                brand = brand,
                darkTheme = darkTheme,
                extra = screenshotSuffix.toString()
            )
        }
    }

    private fun createSpannableText(): Spannable {
        val termsAndConditions = "terms and conditions"
        val message = "Some text with $termsAndConditions"
        return SpannableString(message).apply {
            setSpan(dummyClickableSpan, message.indexOf(termsAndConditions), message.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }

    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters
        fun brands(): List<Array<Any?>> {
            val brands = TestUtils.getAllBrands()
            val enabled = arrayOf(false, true)
            val checked = arrayOf(false, true)
            val errorTexts = arrayOf(null, "Some error text")

            return brands.flatMap { brand ->
                enabled.flatMap { isEnabled ->
                    checked.flatMap { isChecked ->
                        errorTexts.map { errorText ->
                            arrayOf(brand, isEnabled, isChecked, errorText)
                        }
                    }
                }
            }
        }

        private val dummyClickableSpan = object : ClickableSpan() { override fun onClick(widget: View) {} }
    }
}