package com.telefonica.mistica.compose.card.highlightedcard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

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
                content = "use our tools to solve technical issue"
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
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
                content = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.SECONDARY),
                image = HighLightCardImageSettings(HighLightedCardImage.CardResource(R.drawable.icn_creditcard), config = HighLightCardImageConfig.FIT)
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
                title = "Solve Technical issue and with large text, not a lorem ipsum but...",
                content = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK),
                image = HighLightCardImageSettings(HighLightedCardImage.CardResource(R.drawable.icn_creditcard), config = HighLightCardImageConfig.FILL)
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
                title = "Solve Technical issue and with large text, not a lorem ipsum but...",
                content = "use our tools to solve technical issue",
                showCloseButton = true,
                button = HighLightCardButtonSettings("Start tests", ButtonStyle.LINK),
                image = HighLightCardImageSettings(
                    HighLightedCardImage.CardResource(R.drawable.icn_creditcard),
                    config = HighLightCardImageConfig.FILL
                ),
                customBackground = HighLightCardCustomBackgroundSettings(
                    drawableResource = R.drawable.icn_visibility
                )
            )
        }
    }
}
