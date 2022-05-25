package com.telefonica.mistica.compose.feedback

import android.view.ViewGroup
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView

@Composable
fun Feedback(
    @FeedbackScreenView.FeedbackType type: Int = FeedbackScreenView.TYPE_INFO,
    title: String = "",
    subtitle: String = "",
    errorReference: String = "",
    firstButtonText: String?,
    secondButtonText: String? = null,
    firstButtonOnClick: (() -> Unit)?,
    secondButtonOnClick: (() -> Unit)? = null,
    isFirstButtonLoading: Boolean = false,
    secondButtonAsLink: Boolean = false,
    onBackPressed: (() -> Unit)? = null
) {
    var shouldPerformTheAnimation by remember { mutableStateOf(true) }

    onBackPressed?.let {
        BackHandler(onBack = onBackPressed)
    }

    AndroidView(factory = { context ->
        FeedbackScreenView(context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
            )
            shouldAnimateOnAttachedToWindow = false
            setFeedbackType(type)
            setFeedbackTitle(title)
            setFeedbackSubtitle(subtitle)
            setFeedbackErrorReference(errorReference)
            firstButtonText?.let { setFeedbackFirstButtonText(firstButtonText) }
            secondButtonText?.let { setFeedbackSecondButtonText(secondButtonText) }
            firstButtonOnClick?.let { setFirstButtonOnClick { firstButtonOnClick() } }
            secondButtonOnClick?.let { setSecondButtonOnClick { secondButtonOnClick() } }
            setFeedbackSecondButtonAsLink(secondButtonAsLink)
            setIsLoading(isFirstButtonLoading)
            if (shouldPerformTheAnimation) {
                animateViews()
                shouldPerformTheAnimation = false
            }
        }
    })

}
