package com.telefonica.mistica.catalog.ui.classic.activity

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.emptystate.screen.EmptyStateScreenView

class EmptyStateScreenCatalogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        intent.getIntExtra(
            EXTRA_THEME,
            NO_THEME_OVERRIDE
        )
            .takeIf { it != NO_THEME_OVERRIDE }
            ?.let { setTheme(it) }

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.empty_state_screen_activity_catalog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { view, windowInsets ->
            val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updatePadding(top = insets.top, bottom = insets.bottom)
            WindowInsetsCompat.CONSUMED
        }

        @EmptyStateScreenView.ImageSize
        val imageSize: Int? = intent.getIntExtra(
            EXTRA_IMAGE_SIZE,
            INVALID_DEFAULT_VALUE
        ).takeIf { it != INVALID_DEFAULT_VALUE }
        val title: String? = intent.getStringExtra(EXTRA_TITLE)
        val subtitle: String? = intent.getStringExtra(EXTRA_SUBTITLE)

        @EmptyStateScreenView.ButtonsConfig
        val buttonsConfig: Int? = intent.getIntExtra(
            EXTRA_BUTTONS_CONFIG,
            INVALID_DEFAULT_VALUE
        ).takeIf { it != INVALID_DEFAULT_VALUE }
        val primaryButtonText: String? = intent.getStringExtra(EXTRA_PRIMARY_BUTTON_TEXT)
        val primaryButtonLoadingText: String? = intent.getStringExtra(EXTRA_PRIMARY_BUTTON_LOADING_TEXT)
        val secondaryButtonText: String? = intent.getStringExtra(EXTRA_SECONDARY_BUTTON_TEXT)
        val linkButtonText: String? = intent.getStringExtra(EXTRA_LINK_BUTTON_TEXT)

        findViewById<EmptyStateScreenView>(R.id.empty_state_screen).apply {
            imageSize?.let { setImageSize(it) }
            title?.let { setTitle(it) }
            subtitle?.let { setSubtitle(it) }
            buttonsConfig?.let { setButtonsConfig(it) }
            primaryButtonText?.let { setPrimaryButtonText(it) }
            primaryButtonLoadingText?.let { setPrimaryButtonLoadingText(it) }
            secondaryButtonText?.let { setSecondaryButtonText(it) }
            linkButtonText?.let { setLinkButtonText(it) }
            setPrimaryButtonOnClick {
                if (primaryButtonLoadingText?.isNotEmpty() == true) {
                    setIsLoading(true)
                    handler.postDelayed({ setIsLoading(false) }, RETRY_DELAY)
                } else {
                    showToast(context, "Primary button clicked!")
                }
            }
            setSecondaryButtonOnClick { showToast(context, "Secondary button clicked!") }
            setLinkButtonOnClick { showToast(context, "Link button clicked!") }
        }
    }

    private fun showToast(context: Context, message: String) {
        android.widget.Toast.makeText(
            context,
            message,
            android.widget.Toast.LENGTH_SHORT
        ).show()
    }

    companion object {
        const val EXTRA_THEME = "extra_theme"
        const val EXTRA_IMAGE_SIZE = "extra_image_size"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_SUBTITLE = "extra_subtitle"
        const val EXTRA_BUTTONS_CONFIG = "extra_buttons_config"
        const val EXTRA_PRIMARY_BUTTON_TEXT = "extra_primary_button_text"
        const val EXTRA_PRIMARY_BUTTON_LOADING_TEXT = "extra_primary_button_loading_text"
        const val EXTRA_SECONDARY_BUTTON_TEXT = "extra_secondary_button_text"
        const val EXTRA_LINK_BUTTON_TEXT = "extra_link_button_text"

        private const val RETRY_DELAY = 2000L
        private const val NO_THEME_OVERRIDE = -1
        private const val INVALID_DEFAULT_VALUE = -1
    }
}
