package com.telefonica.mistica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DummyFeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(intent.getIntExtra(EXTRA_THEME, DEFAULT_CLASSIC_THEME))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_dummy_activity_feedback)
    }
    companion object Companion {
        const val EXTRA_THEME = "extra_theme"
        val DEFAULT_CLASSIC_THEME = R.style.MisticaTheme_Movistar
    }
}
