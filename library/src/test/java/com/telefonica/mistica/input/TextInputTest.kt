package com.telefonica.mistica.input

import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.github.takahirom.roborazzi.captureRoboImage
import com.github.takahirom.roborazzi.withViewId
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.testutils.ScreenshotUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import com.telefonica.mistica.R

@RunWith(RobolectricTestRunner::class)
internal class TextInputTest {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check TextInput`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val textInput = TextInput(activity)
            wrapper.addView(textInput)
            textInput.text = "Hello android devs!"

            onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)).captureRoboImage(ScreenshotUtils.getScreenshotName())
        }
    }
}
