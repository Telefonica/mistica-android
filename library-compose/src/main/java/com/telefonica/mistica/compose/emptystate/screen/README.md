# Empty States

<p align="left">
    <img height=400 src="../../../../../../../../../doc/images/empty_states/screens/empty_state_screen_1.png" />
    <img height=400 src="../../../../../../../../../doc/images/empty_states/screens/empty_state_screen_2.png" />
</p>

Empty States require a minimum content of **an image and a title**

# Example
```kotlin
var imageSize by remember { mutableStateOf(EmptyStateScreen.ImageSize.ICON) }
var title: String by remember { mutableStateOf("title") }
var subtitle: String by remember { mutableStateOf("subtitle") }
var buttonConfig by remember { mutableStateOf(EmptyStateScreen.ButtonConfig.PRIMARY) }
var primaryButtonText: String by remember { mutableStateOf("Explore Marketplace") }
var secondaryButtonText: String by remember { mutableStateOf("Secondary Action") }
var linkButtonText: String by remember { mutableStateOf("More info") }

EmptyStateScreen(
	modifier = Modifier,
	imageResId = R.drawable.empty_state_screen_image,
	imageSize = imageSize,
	title = title,
	subtitle = subtitle,
	buttonConfig = buttonConfig,
	primaryButtonText = primaryButtonText,
	secondaryButtonText = secondaryButtonText,
	linkButtonText = linkButtonText
)
```