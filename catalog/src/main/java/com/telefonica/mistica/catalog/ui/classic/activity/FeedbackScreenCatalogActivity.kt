package com.telefonica.mistica.catalog.ui.classic.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView.FeedbackType

class FeedbackScreenCatalogActivity : AppCompatActivity() {

    @FeedbackType
    var type: Int? = null
    var title: String? = null
    var subtitle: String? = null
    var errorReference: String? = null

    @LayoutRes
    var customContentLayout: Int? = null
    var firstButtonText: String? = null
    var firstButtonLoadingText: String? = null
    var secondButtonText: String? = null
    var showSecondButtonAsLink: Boolean? = null
    var showLoadingInButton: Boolean? = null
    var customIcon: Int? = null
    var customAnimation: Int? = null
    var shouldAnimateOnAttached: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {

        intent.getIntExtra(EXTRA_THEME, NO_THEME_OVERRIDE)
            .takeIf { it != NO_THEME_OVERRIDE }
            ?.let { setTheme(it) }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_activity_feedback_catalog)

        handleIntentExtras(intent)

        findViewById<FeedbackScreenView>(R.id.feedback).apply {
            type?.let { setFeedbackType(it) }
            title?.let { setFeedbackTitle(it) }
            subtitle?.let { setFeedbackSubtitle(it) }
            errorReference?.let { setFeedbackErrorReference(it) }
            customContentLayout?.let { setCustomContentLayout(it) }
            firstButtonText?.let { setFeedbackFirstButtonText(it) }
            firstButtonLoadingText?.let { setFeedbackFirstButtonLoadingText(it) }
            secondButtonText?.let { setFeedbackSecondButtonText(it) }
            showSecondButtonAsLink?.let { setFeedbackSecondButtonAsLink(it) }
            setFirstButtonOnClick(View.OnClickListener {
                if (showLoadingInButton == true) {
                    setIsLoading(true)
                    handler.postDelayed({ setIsLoading(false) }, RETRY_DELAY)
                } else {
                    finish()
                }
            })
            customIcon?.let { setCustomIcon(it) }
            customAnimation?.let { setCustomAnimation(it) }
            setShouldAnimateOnAttached(shouldAnimateOnAttached)
            if (!shouldAnimateOnAttached){
                animateViews()
            }
        }
    }

    fun handleIntentExtras(intent: Intent) {
        type = intent.getIntExtra(
            EXTRA_TYPE,
            INVALID_DEFAULT_VALUE
        )
        title = intent.getStringExtra(EXTRA_TITLE)
        subtitle = intent.getStringExtra(EXTRA_SUBTITLE)
        errorReference = intent.getStringExtra(EXTRA_ERROR_REFERENCE)
        customContentLayout = intent.getIntExtra(
            EXTRA_CUSTOM_CONTENT,
            INVALID_DEFAULT_VALUE
        ).takeIf { it != INVALID_DEFAULT_VALUE }
        firstButtonText = intent.getStringExtra(EXTRA_FIRST_BUTTON_TEXT)
        secondButtonText = intent.getStringExtra(EXTRA_SECOND_BUTTON_TEXT)
        firstButtonLoadingText = intent.getStringExtra(EXTRA_FIRST_BUTTON_LOADING_TEXT)
        showSecondButtonAsLink = intent.getBooleanExtra(
            EXTRA_SHOW_SECOND_BUTTON_AS_LINK,
            SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE
        )
        showLoadingInButton = intent.getBooleanExtra(
            EXTRA_SHOW_LOADING_IN_BUTTON,
            SHOW_LOADING_IN_BUTTON_DEFAULT_VALUE
        )
        customIcon = intent.getIntExtra(EXTRA_CUSTOM_ICON, 0).takeIf { it != 0 }
        customAnimation = intent.getIntExtra(EXTRA_CUSTOM_ANIMATION, 0).takeIf { it != 0 }
        shouldAnimateOnAttached = intent.getBooleanExtra(EXTRA_SHOULD_ANIMATE_ON_ATTACHED, SHOULD_ANIMATE_ON_ATTACHED_DEFAULT_VALUE)
    }

    companion object {
        const val INVALID_DEFAULT_VALUE = -1
        const val SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE = false
        const val SHOW_LOADING_IN_BUTTON_DEFAULT_VALUE = false
        const val SHOULD_ANIMATE_ON_ATTACHED_DEFAULT_VALUE = false

        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_SUBTITLE = "extra_subtitle"
        const val EXTRA_ERROR_REFERENCE = "extra_error_reference"
        const val EXTRA_CUSTOM_CONTENT = "extra_custom_content"
        const val EXTRA_FIRST_BUTTON_TEXT = "extra_first_button_text"
        const val EXTRA_FIRST_BUTTON_LOADING_TEXT = "extra_first_button_loading_text"
        const val EXTRA_SECOND_BUTTON_TEXT = "extra_second_button_text"
        const val EXTRA_SHOW_SECOND_BUTTON_AS_LINK = "extra_second_button_as_link"
        const val EXTRA_SHOW_LOADING_IN_BUTTON = "extra_show_loading_in_button"
        const val EXTRA_CUSTOM_ICON = "extra_custom_icon"
        const val EXTRA_CUSTOM_ANIMATION = "extra_custom_animation"
        const val EXTRA_SHOULD_ANIMATE_ON_ATTACHED = "should_animate_on_attached"
        const val EXTRA_THEME = "extra_theme"

        private const val NO_THEME_OVERRIDE = -1
        private const val RETRY_DELAY = 2000L
    }
}
