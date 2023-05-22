package com.telefonica.mistica.compose.feedback

import android.view.ViewGroup
import androidx.activity.compose.BackHandler
import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView

@Composable
fun Feedback(
    modifier: Modifier = Modifier,
    @FeedbackScreenView.FeedbackType type: Int = FeedbackScreenView.TYPE_INFO,
    title: String = "",
    subtitle: String = "",
    errorReference: String = "",
    firstButtonText: String?,
    firstButtonLoadingText: String? = null,
    secondButtonText: String? = null,
    firstButtonOnClick: (() -> Unit)?,
    secondButtonOnClick: (() -> Unit)? = null,
    isFirstButtonLoading: Boolean = false,
    secondButtonAsLink: Boolean = false,
    onBackPressed: (() -> Unit)? = null,
    shouldAnimateOnAttached: Boolean = true,
    @RawRes customAnimation: Int? = null,
    @DrawableRes customIcon: Int? = null,
) {
    var shouldPerformTheAnimation by remember { mutableStateOf(true) }

    onBackPressed?.let {
        BackHandler(onBack = onBackPressed)
    }

    fun FeedbackScreenView.update(): FeedbackScreenView = apply {
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        )
        setShouldAnimateOnAttached(shouldAnimateOnAttached)
        setFeedbackType(type)
        setFeedbackTitle(title)
        setFeedbackSubtitle(subtitle)
        setFeedbackErrorReference(errorReference)
        firstButtonText?.let { setFeedbackFirstButtonText(firstButtonText) }
        firstButtonLoadingText?.let { setFeedbackFirstButtonLoadingText(firstButtonLoadingText) }
        secondButtonText?.let { setFeedbackSecondButtonText(secondButtonText) }
        firstButtonOnClick?.let { setFirstButtonOnClick { firstButtonOnClick() } }
        secondButtonOnClick?.let { setSecondButtonOnClick { secondButtonOnClick() } }
        setFeedbackSecondButtonAsLink(secondButtonAsLink)
        setIsLoading(isFirstButtonLoading)
        customAnimation?.let { setCustomAnimation(it) }
        customIcon?.let { setCustomIcon(it) }
        setFeedbackType(type)
        if (shouldPerformTheAnimation) {
            animateViews()
            shouldPerformTheAnimation = false
        }
    }

    AndroidView(
        modifier = modifier,
        factory = { context -> FeedbackScreenView(context).update() },
        update = { it.update() }
    )

}

@Preview
@Composable
fun FeedbackPreview() {
    Feedback(
        type = FeedbackScreenView.TYPE_INFO,
        title = "This is a title",
        subtitle = "This is the feedback description",
        errorReference = "Error reference: #95001",
        firstButtonText = "Feedback First Button Text",
        firstButtonLoadingText = "Feedback First Button Loading Text",
        secondButtonText = "Feedback Second Button Text",
        firstButtonOnClick = { }
    )
}
