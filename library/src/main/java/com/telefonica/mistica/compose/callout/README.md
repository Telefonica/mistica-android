# Callout

Compose implementation of Callout component. Example of use:

```kotlin
if (isShown) {
    Callout(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        title = "This is a title",
        description = "This is a description",
        buttonConfig = CalloutButtonConfig.PRIMARY,
        dismissable = true,
        inverse = false,
        onDismiss = { isShown = false },
        primaryButtonText = "Got it!",
        onPrimaryButtonClick = { /* .. */ }
    )
}
```
