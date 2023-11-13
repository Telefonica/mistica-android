package com.telefonica.mistica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DummyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(intent.getIntExtra(EXTRA_THEME, DEFAULT_CLASSIC_THEME))
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_dummy_activity)
    }
    companion object {
        const val EXTRA_THEME = "extra_theme"
        val DEFAULT_CLASSIC_THEME = R.style.MisticaTheme_Movistar
    }
}
