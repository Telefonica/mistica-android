# Empty State Cards

<p align="left">
    <img height=300 src="../../../../../../../../../doc/images/empty_states/cards/empty_state_card_1.png" />
    <img height=300 src="../../../../../../../../../doc/images/empty_states/cards/empty_state_card_2.png" />
</p>

Empty State Cards require a minimum content of **an image and a title**

# Example
```kotlin
var imageSize by remember { mutableStateOf(EmptyStateCard.ImageSize.ICON) }
var title: String by remember { mutableStateOf("title") }
var subtitle: String by remember { mutableStateOf("subtitle") }
var buttonConfig by remember { mutableStateOf(EmptyStateCard.ButtonConfig.PRIMARY) }
var primaryButtonText: String by remember { mutableStateOf("Explore Marketplace") }
var secondaryButtonText: String by remember { mutableStateOf("Secondary Action") }
var linkButtonText: String by remember { mutableStateOf("More info") }

EmptyStateCard(
	modifier = Modifier,
	imageResId = R.drawable.empty_state_card_image,
	imageSize = imageSize,
	title = title,
	subtitle = subtitle,
	buttonConfig = buttonConfig,
	primaryButtonText = primaryButtonText,
	secondaryButtonText = secondaryButtonText,
	linkButtonText = linkButtonText
)
```