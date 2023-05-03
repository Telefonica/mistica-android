package com.telefonica.mistica.compose.card.highlightedcard

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme

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

@Composable
fun HighLightedCard(
    modifier: Modifier = Modifier,
    title: String = "",
    message: String = "",
    button: HighLightCardButtonSettings = HighLightCardButtonSettings(),
    image: HighLightCardImageSettings = HighLightCardImageSettings(),
    customBackground: HighLightCardCustomBackgroundSettings = HighLightCardCustomBackgroundSettings(),
    showCloseButton: Boolean = false,
    inverseDisplay: Boolean = false,
    onCloseButton: () -> Unit = {},
    onButtonClick: () -> Unit = {}
){
    androidx.compose.material.Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        elevation = 0.dp,
        backgroundColor = if (inverseDisplay)
            MisticaTheme.colors.buttonPrimaryBackground
        else
            MisticaTheme.colors.buttonPrimaryBackgroundInverse,
        border = BorderStroke(width = 1.dp, color = MisticaTheme.colors.border)
    ) {
        ConstraintLayout(
            modifier = modifier.padding(bottom = if(button.buttonStyle != null) 0.dp else 16.dp)
        ) {
            val (
                titleComposable,
                messageComposable,
                closeButtonComposable,
                actionButtonComposable,
                pictureComposable,
                backgroundComposable,
            ) = createRefs()

            HighLightCardBackground(
                modifier = modifier.constrainAs(backgroundComposable){
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                },
                backgroundSettings = customBackground
            )

            Text(
                modifier = Modifier.constrainAs(titleComposable){
                    top.linkTo(parent.top, 16.dp)
                    start.linkTo(parent.start, 16.dp)
                },
                style = MisticaTheme.typography.preset4Light,
                color = if(inverseDisplay)
                    MisticaTheme.colors.textPrimaryInverse
                else
                    MisticaTheme.colors.textPrimary,
                text = title
            )

            Text(
                modifier = Modifier.constrainAs(messageComposable){
                    top.linkTo(titleComposable.bottom)
                    start.linkTo(titleComposable.start)
                },
                style = MisticaTheme.typography.preset2,
                color = if(inverseDisplay)
                    MisticaTheme.colors.textSecondaryInverse
                else
                    MisticaTheme.colors.textSecondary,
                text = message
            )

            if (showCloseButton){
                FloatingActionButton(
                    modifier = Modifier
                        .size(32.dp)
                        .constrainAs(closeButtonComposable) {
                            top.linkTo(parent.top, 8.dp)
                            end.linkTo(parent.end, 8.dp)
                        },
                    backgroundColor = if(customBackground.withCustomBackground || inverseDisplay)
                            MisticaTheme.colors.closeButtonOverlay.copy(alpha = 0.7f)
                        else
                            Color.Transparent,
                    elevation = FloatingActionButtonDefaults.elevation(0.dp),
                    onClick = onCloseButton
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = null,
                        tint = MisticaTheme.colors.neutralHigh
                    )
                }
            }

            HighLightCardButton(
                modifier = Modifier
                    .constrainAs(actionButtonComposable) {
                        top.linkTo(messageComposable.bottom, 16.dp)
                        start.linkTo(titleComposable.start)
                        bottom.linkTo(parent.bottom)
                    }
                    .padding(bottom = 16.dp),
                inverseDisplay = inverseDisplay,
                buttonConfig = button,
                onButtonClick = onButtonClick
            )

            HighLightCardImage(
                modifier = Modifier.constrainAs(pictureComposable){
                    top.linkTo(
                        if (image.config == HighLightCardImageConfig.FIT && showCloseButton)
                            closeButtonComposable.bottom
                        else
                            parent.top
                    )
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                },
                imageSettings = image
            )
        }
    }
}

@Composable
private fun HighLightCardBackground(modifier: Modifier, backgroundSettings: HighLightCardCustomBackgroundSettings){
    if (backgroundSettings.withCustomBackground){
        if (backgroundSettings.imageVector != null){
            Image(
                modifier = modifier,
                contentScale = ContentScale.FillBounds,
                imageVector = backgroundSettings.imageVector,
                contentDescription = null
            )
        } else if(backgroundSettings.bitmap != null){
            Image(
                modifier = modifier,
                contentScale = ContentScale.FillBounds,
                bitmap = backgroundSettings.bitmap,
                contentDescription = null
            )
        }else if (backgroundSettings.drawableResource != null){
            Image(
                modifier = modifier,
                contentScale = ContentScale.FillBounds,
                painter = painterResource(id = backgroundSettings.drawableResource),
                contentDescription = null
            )
        }
    }
}

@Composable
private fun HighLightCardImage(modifier: Modifier, imageSettings: HighLightCardImageSettings){
    if (imageSettings.withImage){
        if (imageSettings.imageVector != null){
            Image(
                modifier = modifier,
                imageVector = imageSettings.imageVector,
                contentDescription = null
            )
        } else if(imageSettings.bitmap != null){
            Image(
                modifier = modifier,
                bitmap = imageSettings.bitmap,
                contentDescription = null
            )
        }else if (imageSettings.drawableResource != null){
            Image(
                modifier = modifier,
                painter = painterResource(id = imageSettings.drawableResource),
                contentDescription = null
            )
        }
    }
}

@Composable
private fun HighLightCardButton(
    modifier: Modifier,
    inverseDisplay: Boolean,
    buttonConfig: HighLightCardButtonSettings,
    onButtonClick: () -> Unit = {}
){
    val buttonStyle = buttonConfig.getButtonStyle(inverseDisplay)

    if (buttonStyle != null){
        Button(
            modifier = modifier,
            text = buttonConfig.buttonText,
            buttonStyle = buttonStyle,
            onClickListener = onButtonClick
        )
    }
}
