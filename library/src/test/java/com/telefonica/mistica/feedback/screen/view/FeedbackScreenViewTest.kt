package com.telefonica.mistica.feedback.screen.view

import android.content.Intent
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyFeedbackActivity
import com.telefonica.mistica.DummyFeedbackActivity.Companion.EXTRA_THEME
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import com.telefonica.mistica.testutils.TestUtils.getAllBrands
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class FeedbackScreenViewTest(
    private val brand: Brand,
    private val feedbackType: Int,
) : ScreenshotsTest() {

    private val intent = Intent(ApplicationProvider.getApplicationContext(), DummyFeedbackActivity::class.java).apply {
        this.putExtra(EXTRA_THEME, TestUtils.getBaseThemeForBrand(brand))
    }

    @get:Rule
    val rule = activityScenarioRule<DummyFeedbackActivity>(intent)

    @Test
    fun `check FeedbackScreenView light`() {
        checkFeedbackScreenView(brand, feedbackType, false)
    }

    @Test
    @Config(qualifiers = "+night")
    fun `check FeedbackScreenView dark`() {
        checkFeedbackScreenView(brand, feedbackType, true)
    }

    private fun checkFeedbackScreenView(
        brand: Brand,
        feedbackType: Int,
        darkTheme: Boolean,
    ) {
        rule.scenario.onActivity { activity ->
            val feedbackScreenView: FeedbackScreenView = activity.findViewById(R.id.dummy_activity_feedback)
            feedbackScreenView.apply {
                setTestMode(true)
                setFeedbackType(feedbackType)

                // Configure content based on feedback type
                when (feedbackType) {
                    FeedbackScreenView.TYPE_SUCCESS -> {
                        setFeedbackTitle("¡Éxito!")
                        setFeedbackSubtitle("La operación se completó correctamente")
                        setFeedbackFirstButtonText("Continuar")
                        setFeedbackSecondButtonText("Ver detalles")
                    }

                    FeedbackScreenView.TYPE_ERROR -> {
                        setFeedbackTitle("Error")
                        setFeedbackSubtitle("No se pudo completar la operación")
                        setFeedbackErrorReference("Error: E001234")
                        setFeedbackFirstButtonText("Reintentar")
                        setFeedbackSecondButtonText("Cancelar")
                    }

                    FeedbackScreenView.TYPE_INFO -> {
                        setFeedbackTitle("Información")
                        setFeedbackSubtitle("Esta es una pantalla informativa")
                        setFeedbackFirstButtonText("Aceptar")
                        setFeedbackSecondButtonText("Más info")
                    }
                }

            }

            val typeString = when (feedbackType) {
                FeedbackScreenView.TYPE_SUCCESS -> "SUCCESS"
                FeedbackScreenView.TYPE_ERROR -> "ERROR"
                FeedbackScreenView.TYPE_INFO -> "INFO"
                else -> "UNKNOWN"
            }

            compareScreenshot(
                Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_feedback)),
                component = "FeedbackScreenView",
                style = typeString,
                brand = brand,
                darkTheme = darkTheme
            )
        }
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "FeedbackScreenView {1} {0}")
        fun parameters(): List<Array<Any>> {
            val allBrands = getAllBrands()
            val feedbackTypes = listOf(
                FeedbackScreenView.TYPE_SUCCESS,
                FeedbackScreenView.TYPE_ERROR,
                FeedbackScreenView.TYPE_INFO
            )

            return allBrands.flatMap { brand ->
                feedbackTypes.map { type ->
                    arrayOf(brand, type)
                }
            }
        }
    }
}
