# Feedbacks

Load Error Feedback is a view that shows a title, a description, and a button that allows to reload. All items are optional

<p align="center">
   <img width="50%" src="../../../../../../../../../../doc/images/load_feedback_error/load_feedback_error.png" />
</p>

### Example

```kotlin
val scope = rememberCoroutineScope()
var isLoading by remember { mutableStateOf(false) }

LoadErrorFeedback(
    titleText = "Title",
    descriptionText = "Something went wrong, this is the description of the failure. Try to retry if you want.",
    isLoading = isLoading,
    buttonText = "Retry",
    buttonLoadingText = "Loading"
) {
    isLoading = true
    scope.launch {
        delay(1000)
        MainScope().launch { isLoading = false }
    }
}
```
