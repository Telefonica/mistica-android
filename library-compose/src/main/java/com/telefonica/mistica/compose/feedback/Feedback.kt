package com.telefonica.mistica.compose.feedback

import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.feedback.screen.view.FeedbackScreenView

@Composable
fun Feedback(
    @FeedbackScreenView.FeedbackType type: Int = FeedbackScreenView.TYPE_INFO,
    title: String = "",
    subtitle: String = "",
    firstButtonText: String?,
    secondButtonText: String?,
    firstButtonOnClick: (() -> Unit)?,
    secondButtonOnClick: (() -> Unit)?,
    isFirstButtonLoading: Boolean = false,
    secondButtonAsLink: Boolean = false,
    onBackPressed: (() -> Unit)
    ) {

    val currentOnBack by rememberUpdatedState(newValue = onBackPressed)
    var shouldPerformTheAnimation by remember { mutableStateOf(true) }

    val backCallback = remember {
        object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                currentOnBack()
            }

        }
    }

    val backDispatcher = checkNotNull(LocalOnBackPressedDispatcherOwner.current) {
        "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"
    }.onBackPressedDispatcher
    val lifecycleOwner = LocalLifecycleOwner.current

    DisposableEffect(lifecycleOwner, backDispatcher) {
        backDispatcher.addCallback(lifecycleOwner, backCallback)
        onDispose {
            backCallback.remove()
        }
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
    }
    )
}