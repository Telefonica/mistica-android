# HighLightedCard (Compose version)

This composable is the migration of the component based on classic views highLightedCard, presenting the same functionality and styles (based on Mistica).

In addition, several classes and enums are added that will be useful when configuring different aspects of the UI (image position, backgrounds, etc. Its definition (its use can be seen in the example code of use)

```kotlin
enum class HighLightCardImageConfig {
    FIT,
    FILL,
    NONE,
}

data class HighLightCardButtonSettings(
    val buttonText: String = "",
    val buttonStyle: ButtonStyle? = null
){
    fun getButtonStyle(inverse: Boolean): ButtonStyle? {
        return buttonStyle?.let { style ->
            return if (!inverse) {
                style
            } else {
                when (style){
                    ButtonStyle.PRIMARY -> ButtonStyle.PRIMARY_INVERSE
                    ButtonStyle.PRIMARY_SMALL -> ButtonStyle.PRIMARY_SMALL_INVERSE
                    ButtonStyle.SECONDARY -> ButtonStyle.SECONDARY_INVERSE
                    ButtonStyle.SECONDARY_SMALL -> ButtonStyle.SECONDARY_SMALL_INVERSE
                    ButtonStyle.LINK -> ButtonStyle.LINK_INVERSE
                    else -> style
                }
            }
        }
    }
}

data class HighLightCardImageSettings(
    val imageVector: ImageVector? = null,
    val bitmap: ImageBitmap? = null,
    @DrawableRes val drawableResource: Int? = null,
    val config: HighLightCardImageConfig = HighLightCardImageConfig.NONE,
){
    val withImage: Boolean
        get() = this.config != HighLightCardImageConfig.NONE && (this.imageVector != null || this.bitmap != null || this.drawableResource != null)
}

data class HighLightCardCustomBackgroundSettings(
    val imageVector: ImageVector? = null,
    val bitmap: ImageBitmap? = null,
    @DrawableRes val drawableResource: Int? = null,
){
    val withCustomBackground: Boolean
        get() = this.imageVector != null || this.bitmap != null || this.drawableResource != null
}

```

Use HighlightedCard composable. There are some examples below

```kotlin
@Preview(name = "Only Title and text")
@Composable
fun PreviewHighLightedCardOnlyTitleAndText(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue"
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button")
@Composable
fun PreviewHighLightedCardTitleTextAndCloseButton(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Primary")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonAndButtonPrimary(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.PRIMARY)
            )
        }
    }
}

@Preview(name = "[Inverse] Only Title,Text, Close Button, Action Button Primary")
@Composable
fun PreviewInverseHighLightedCardTitleTextCloseButtonAndButtonPrimary(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                inverseDisplay = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.PRIMARY)
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Secondary")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonAndButtonSecondary(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.SECONDARY)
            )
        }
    }
}

@Preview(name = "Inverse Only Title,Text, Close Button, Action Button Secondary")
@Composable
fun PreviewInverseHighLightedCardTitleTextCloseButtonAndButtonSecondary(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                inverseDisplay = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.SECONDARY)
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Link")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonAndButtonLink(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK)
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Link")
@Composable
fun PreviewInverseHighLightedCardTitleTextCloseButtonAndButtonLink(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                inverseDisplay = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK)
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Link, Image Fit")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonButtonLinkAndImageFit(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.SECONDARY),
                image = HighLightCardImageSettings(drawableResource = R.drawable.icn_creditcard, config = HighLightCardImageConfig.FIT)
            )
        }
    }
}

@Preview(name = "Only Title,Text, Close Button, Action Button Link, Image Fill")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonButtonLinkAndImageFill(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK),
                image = HighLightCardImageSettings(drawableResource = R.drawable.icn_creditcard, config = HighLightCardImageConfig.FILL)
            )
        }
    }
}
@Preview(name = "Only Title,Text, Close Button, Action Button Link, Image Fill, Background")
@Composable
fun PreviewHighLightedCardTitleTextCloseButtonButtonLinkAndImageFillBackground(){
    MisticaTheme(brand = MovistarBrand) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)) {
            HighLightedCard(
                modifier = Modifier.fillMaxWidth(),
                title = "Solve Technical issue",
                message = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK),
                image = HighLightCardImageSettings(
                    drawableResource = R.drawable.icn_creditcard,
                    config = HighLightCardImageConfig.FILL
                ),
                customBackground = HighLightCardCustomBackgroundSettings(
                    drawableResource = R.drawable.icn_visibility
                )
            )
        }
    }
}

```
