package com.telefonica.mistica.catalog.ui.compose.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.card.highlightedcard.HighLightCardButtonSettings
import com.telefonica.mistica.compose.card.highlightedcard.HighLightCardCustomBackgroundSettings
import com.telefonica.mistica.compose.card.highlightedcard.HighLightCardImageConfig
import com.telefonica.mistica.compose.card.highlightedcard.HighLightCardImageSettings
import com.telefonica.mistica.compose.card.highlightedcard.HighLightedCard
import com.telefonica.mistica.compose.card.highlightedcard.HighLightedCardImage
import com.telefonica.mistica.compose.input.TextInput
import com.telefonica.mistica.compose.theme.MisticaTheme

@Preview(showSystemUi = true)
@Composable
@Suppress("LongMethod")
fun HighlightedCards() {
    val context = LocalContext.current
    var cardTitle by remember { mutableStateOf("Card Title Text") }
    var cardContent by remember { mutableStateOf("Card Title Content") }
    var buttonConfig by remember { mutableStateOf(HighLightCardButtonSettings(buttonText = "Start Here")) }
    var imageConfig by remember { mutableStateOf(HighLightCardImageSettings()) }
    var showCloseButton by remember { mutableStateOf(false) }
    var inverseDisplay by remember { mutableStateOf(false) }
    var showBackground by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (settingsContainer, highLightedCard) = createRefs()

        HighLightedCard(
            modifier = Modifier.constrainAs(highLightedCard){
                start.linkTo(parent.start, 8.dp)
                end.linkTo(parent.end, 8.dp)
                bottom.linkTo(parent.bottom, 8.dp)
                width = Dimension.fillToConstraints
                height = Dimension.wrapContent
            },
            title = cardTitle,
            content = cardContent,
            button = buttonConfig,
            image = imageConfig,
            customBackground = HighLightCardCustomBackgroundSettings(
                bitmap = if (showBackground)
                    ImageBitmap.imageResource(
                        id = R.drawable.highlighted_card_custom_background
                    )
                else
                    null
            ),
            showCloseButton = showCloseButton,
            inverseDisplay = inverseDisplay,
            onCloseButton = Toast.makeText(
                context,
                "Close clicked!",
                Toast.LENGTH_LONG
            )::show,
            onButtonClick = Toast.makeText(
                context,
                "Action Clicked!",
                Toast.LENGTH_LONG
            )::show
        )

        Column(
            modifier = Modifier
                .constrainAs(settingsContainer) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(highLightedCard.top, 8.dp)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .padding(16.dp)
                .verticalScroll(
                    state = scrollState,
                    enabled = true,
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(text = "HIGHLIGHTED CARD TESTER")

            TextInput(
                value = cardTitle,
                modifier = Modifier.fillMaxWidth(),
                label = "Title",
                onValueChange = { tx -> cardTitle = tx }
            )
            TextInput(
                value = cardContent,
                modifier = Modifier.fillMaxWidth(),
                label = "Message",
                onValueChange = { tx -> cardContent = tx }
            )
            HighLightedCardButtonType(buttonConfig) { newButtonConfig ->
                buttonConfig = newButtonConfig
            }
            HighLightedImageType(imageConfig.config) { imageSettings ->
                imageConfig = imageConfig.copy(
                    config = imageSettings,
                    picture = when (imageSettings){
                        HighLightCardImageConfig.FIT -> HighLightedCardImage.CardResource(R.drawable.higlighted_card_image)
                        HighLightCardImageConfig.FILL -> HighLightedCardImage.CardResource(R.drawable.highlighted_card_fill_mode_example)
                        HighLightCardImageConfig.NONE -> HighLightedCardImage.None
                    }
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showCloseButton = !showCloseButton },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = showCloseButton, onCheckedChange = { showCloseButton = !showCloseButton })
                Text(text = "Show Close Button")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { inverseDisplay = !inverseDisplay },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = inverseDisplay, onCheckedChange = { inverseDisplay = !inverseDisplay })
                Text(text = "Inverse Display")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showBackground = !showBackground },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = showBackground,
                    onCheckedChange = { showBackground = !showBackground }
                )
                Text(text = "Custom Background")
            }
        }
    }
}

@Composable
fun HighLightedImageType(imageConfig: HighLightCardImageConfig, onImageTypeSelected: (HighLightCardImageConfig) -> Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        border = BorderStroke(1.dp, MisticaTheme.colors.borderHigh),
        elevation = 3.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Image Configuration")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onImageTypeSelected(HighLightCardImageConfig.NONE) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = imageConfig == HighLightCardImageConfig.NONE,
                    onClick = { onImageTypeSelected(HighLightCardImageConfig.NONE) }
                )
                Text(text = "No Image")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onImageTypeSelected(HighLightCardImageConfig.FIT) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = imageConfig == HighLightCardImageConfig.FIT,
                    onClick = { onImageTypeSelected(HighLightCardImageConfig.FIT) }
                )
                Text(text = "Fit Image")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onImageTypeSelected(HighLightCardImageConfig.FILL) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = imageConfig == HighLightCardImageConfig.FILL,
                    onClick = { onImageTypeSelected(HighLightCardImageConfig.FILL) }
                )
                Text(text = "Fill Image")
            }
        }
    }
}

@Composable
@Suppress("LongMethod")
fun HighLightedCardButtonType(buttonConfig: HighLightCardButtonSettings, onButtonTypeSelected: (HighLightCardButtonSettings) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        border = BorderStroke(1.dp, MisticaTheme.colors.borderHigh),
        elevation = 3.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Button Type")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onButtonTypeSelected(buttonConfig.copy(buttonStyle = null))
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = buttonConfig.buttonStyle == null,
                    onClick = {
                        onButtonTypeSelected(buttonConfig.copy(buttonStyle = null))
                    }
                )
                Text(text = "None")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.PRIMARY)) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = buttonConfig.buttonStyle == ButtonStyle.PRIMARY,
                    onClick = {
                        onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.PRIMARY))
                    }
                )
                Text(text = "Primary")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.SECONDARY)) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = buttonConfig.buttonStyle == ButtonStyle.SECONDARY,
                    onClick = {
                        onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.SECONDARY))
                    }
                )
                Text(text = "Secondary")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.LINK)) },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = buttonConfig.buttonStyle == ButtonStyle.LINK,
                    onClick = {
                        onButtonTypeSelected(buttonConfig.copy(buttonStyle = ButtonStyle.LINK))
                    }
                )
                Text(text = "Link")
            }

            OutlinedTextField(
                value = buttonConfig.buttonText,
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Button message", modifier = Modifier.background(color = MaterialTheme.colors.background)) },
                onValueChange = { tx -> onButtonTypeSelected(buttonConfig.copy(buttonText = tx)) }
            )
        }
    }
}
