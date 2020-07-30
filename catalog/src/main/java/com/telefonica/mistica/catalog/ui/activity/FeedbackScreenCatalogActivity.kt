package com.telefonica.mistica.catalog.ui.activity

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
    @LayoutRes
    var customContentLayout: Int? = null
    var firstButtonText: String? = null
    var secondButtonText: String? = null
    var showSecondButtonAsLink: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_activity_feedback_catalog)

        handleIntentExtras(intent)

        findViewById<FeedbackScreenView>(R.id.feedback).apply {
            type?.let { setFeedbackType(it) }
            title?.let { setFeedbackTitle(it) }
            subtitle?.let { setFeedbackSubtitle(it) }
            customContentLayout?.let { setCustomContentLayout(it) }
            firstButtonText?.let { setFeedbackFirstButtonText(it) }
            secondButtonText?.let { setFeedbackSecondButtonText(it) }
            showSecondButtonAsLink?.let { setFeedbackSecondButtonAsLink(it) }
            setFirstButtonOnClick(View.OnClickListener { finish() })
        }
    }

    fun handleIntentExtras(intent: Intent) {
        type = intent.getIntExtra(
            EXTRA_TYPE,
            INVALID_DEFAULT_VALUE
        )
        title = intent.getStringExtra(EXTRA_TITLE)
        subtitle = intent.getStringExtra(EXTRA_SUBTITLE)
        customContentLayout = intent.getIntExtra(
            EXTRA_CUSTOM_CONTENT,
            INVALID_DEFAULT_VALUE
        ).takeIf { it != INVALID_DEFAULT_VALUE }
        firstButtonText = intent.getStringExtra(EXTRA_FIRST_BUTTON_TEXT)
        secondButtonText = intent.getStringExtra(EXTRA_SECOND_BUTTON_TEXT)
        showSecondButtonAsLink = intent.getBooleanExtra(
            EXTRA_SHOW_SECOND_BUTTON_AS_LINK,
            SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE
        )
    }

    companion object {
        const val INVALID_DEFAULT_VALUE = -1
        const val SHOW_SECOND_BUTTON_AS_LINK_DEFAULT_VALUE = false

        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_SUBTITLE = "extra_subtitle"
        const val EXTRA_CUSTOM_CONTENT = "extra_custom_content"
        const val EXTRA_FIRST_BUTTON_TEXT = "extra_first_button_text"
        const val EXTRA_SECOND_BUTTON_TEXT = "extra_second_button_text"
        const val EXTRA_SHOW_SECOND_BUTTON_AS_LINK = "extra_second_button_as_link"
    }
}