package com.telefonica.mistica.input

import android.widget.FrameLayout
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
internal class TextInputTest: ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check TextInput`() {
        checkTextInput()
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check TextInput dark`() {
        checkTextInput()
    }

    @Test
    fun `check TextInputWithError`() {
        checkTextInput {
            error = "Whatever error"
        }
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check TextInputWithError dark`() {
        checkTextInput {
            error = "Whatever error"
        }
    }

    @Test
    fun `check TextInputDisabled`() {
        checkTextInput {
            isEnabled = false
        }
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check TextInputDisabled dark`() {
        checkTextInput {
            isEnabled = false
        }
    }

    private fun checkTextInput(onTextInput: TextInput.() -> Unit = {}) {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val textInput = TextInput(activity)
            wrapper.addView(textInput)
            textInput.text = "Hello android devs!"
            textInput.onTextInput()

            compareScreenshot(onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }
}
