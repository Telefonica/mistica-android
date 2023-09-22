package com.telefonica.mistica.input

import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ScrollView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotUtils
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowLog

@RunWith(RobolectricTestRunner::class)
internal class TextInputTest {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out
    }

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

    @Test
    fun `check TextInput from layout`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val inflater = LayoutInflater.from(activity)
            val customLayout = inflater.inflate(R.layout.screen_inputs_catalog, wrapper, false)
            wrapper.setPadding(0, 0, 0, 0)
            wrapper.addView(customLayout)

            repeat(times = 6) { i ->
                Log.d("TextInputTest", "Scrolling to $i")
                val scrollView: ScrollView = activity.findViewById(R.id.scroll_view)
                scrollView.scrollTo(0, wrapper.height * i)

                onView(withId(R.id.dummy_activity_wrapper)).captureRoboImage(ScreenshotUtils.getScreenshotName(extra = "_${i + 1}"))
            }
        }
    }
}
