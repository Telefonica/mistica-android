# Feedbacks

Feedback screens are full screen dialogs that display a feedback after a user interaction. They can be `INFO`, `SUCCESS` or `ERROR`
`INFO` type accepts custom icon or animation

<p align="center">
    <img src="../../../../../../../../../doc/images/screen_feedbacks/feedbacks.gif">
</p>

### Example
```kotlin
var showFeedback by remember { mutableStateOf(false) }

var title: String by remember { mutableStateOf("") }
var subtitle: String by remember { mutableStateOf("") }
var firstButtonText: String? by remember { mutableStateOf(null) }
var firstButtonLoadingText: String? by remember { mutableStateOf(null) }
var secondButtonText: String? by remember { mutableStateOf(null) }
var isFirstButtonLoading: Boolean by remember { mutableStateOf(false) }
var type: Int by remember { mutableStateOf(FeedbackScreenView.TYPE_INFO) }

if (showFeedback) {
    Feedback(
        type = type,
        title = title,
        subtitle = subtitle,
        firstButtonText = firstButtonText,
        firstButtonLoadingText = firstButtonLoadingText,
        secondButtonText = secondButtonText,
        firstButtonOnClick = {},
        secondButtonOnClick = {},
        isFirstButtonLoading = isFirstButtonLoading,
        onBackPressed = { showFeedback = false }, 
        shouldAnimateOnAttached = true,
        @RawRes customAnimation = R.raw.custom_animation,
        @DrawableRes customIcon = R.drawable.custom_icon,
    )
} else {
    //...
}
```
