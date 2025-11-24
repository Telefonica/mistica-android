package com.telefonica.mistica.compose.card.highlightedcard

import android.content.res.Resources
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
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
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme
import androidx.compose.ui.platform.LocalResources

@Composable
fun HighLightedCard(
    modifier: Modifier = Modifier,
    title: String = "",
    content: String = "",
    button: HighLightCardButtonSettings = HighLightCardButtonSettings(),
    image: HighLightCardImageSettings = HighLightCardImageSettings(),
    customBackground: HighLightCardCustomBackgroundSettings = HighLightCardCustomBackgroundSettings(),
    showCloseButton: Boolean = false,
    inverseDisplay: Boolean = false,
    onCloseButton: () -> Unit = {},
    onButtonClick: () -> Unit = {}
){
    val verticalMargin = 24.dp
    val resources = LocalResources.current
    androidx.compose.material.Card(
        modifier = modifier
            .defaultMinSize(minHeight = 100.dp),
        shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius),
        elevation = 0.dp,
        border = BorderStroke(width = 1.dp, color = MisticaTheme.colors.border)
    ) {
        val bitmap = getBackgroundBitmap(resources, customBackground)
        ConstraintLayout(
            modifier = modifier.let {
                when {
                    bitmap != null ->
                        it.drawBehind {
                            drawImage(
                                image = bitmap,
                                dstSize = IntSize(this.size.width.toInt(), this.size.height.toInt())
                            )
                        }
                    inverseDisplay ->
                        it.background(MisticaTheme.brushes.backgroundBrand)
                    else ->
                        it.background(MisticaTheme.colors.backgroundContainer)
                }
            }
        ) {
            val (
                titleComposable,
                messageComposable,
                closeButtonComposable
            ) = createRefs()

            val (
                actionButtonComposable,
                pictureComposable,
            ) = createRefs()

            Text(
                modifier = Modifier.constrainAs(titleComposable){
                    top.linkTo(parent.top, verticalMargin)
                    start.linkTo(parent.start, 16.dp)
                    end.linkTo(if(image.withImage) pictureComposable.start else parent.end, 8.dp)
                    width = Dimension.fillToConstraints
                },
                maxLines = 2,
                style = MisticaTheme.typography.presetCardTitle,
                color = if(inverseDisplay)
                    MisticaTheme.colors.textPrimaryInverse
                else
                    MisticaTheme.colors.textPrimary,
                text = title
            )

            Text(
                modifier = Modifier.constrainAs(messageComposable){
                    top.linkTo(titleComposable.bottom, 8.dp)
                    start.linkTo(titleComposable.start)
                    end.linkTo(titleComposable.end)
                    width = Dimension.fillToConstraints
                },
                style = MisticaTheme.typography.preset2,
                maxLines = 10,
                overflow = TextOverflow.Visible,
                color = if(inverseDisplay)
                    MisticaTheme.colors.textSecondaryInverse
                else
                    MisticaTheme.colors.textSecondary,
                text = content
            )

            HighLightCardButton(
                modifier = Modifier
                    .constrainAs(actionButtonComposable) {
                        top.linkTo(messageComposable.bottom, 16.dp)
                        start.linkTo(titleComposable.start)
                        bottom.linkTo(parent.bottom)
                    }
                    .padding(bottom = verticalMargin),
                inverseDisplay = inverseDisplay,
                buttonConfig = button,
                onButtonClick = onButtonClick,
            )

            HighLightCardImage(
                modifier = Modifier.constrainAs(pictureComposable){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    height = Dimension.fillToConstraints
                    width = Dimension.wrapContent
                },
                imageSettings = image
            )

            if (showCloseButton){
                FloatingActionButton(
                    modifier = Modifier
                        .size(24.dp)
                        .constrainAs(closeButtonComposable) {
                            top.linkTo(parent.top, 8.dp)
                            end.linkTo(parent.end, 8.dp)
                        },
                    backgroundColor = if(customBackground.withCustomBackground || inverseDisplay || image.withImage)
                        MisticaTheme.colors.background.copy(alpha = 0.7f)
                    else
                        Color.Transparent,
                    elevation = FloatingActionButtonDefaults.elevation(0.dp),
                    onClick = onCloseButton
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        tint = MisticaTheme.colors.neutralHigh
                    )
                }
            }
        }
    }
}

private fun getBackgroundBitmap(resources: Resources, backgroundSettings: HighLightCardCustomBackgroundSettings): ImageBitmap?{
    var imageBitmap: ImageBitmap? = null

    if (backgroundSettings.drawableResource != null)
        imageBitmap = BitmapFactory.decodeResource(resources, backgroundSettings.drawableResource).asImageBitmap()
    if (backgroundSettings.bitmap != null)
        imageBitmap = backgroundSettings.bitmap

    return imageBitmap


}

@Composable
private fun HighLightCardImage(modifier: Modifier, imageSettings: HighLightCardImageSettings){
    if (imageSettings.withImage){
        when (imageSettings.picture){
            is HighLightedCardImage.CardImageVector -> Image(
                alignment = Alignment.BottomEnd,
                modifier = modifier,
                imageVector = imageSettings.picture.imageVector,
                contentDescription = null,
                contentScale = if (imageSettings.config == HighLightCardImageConfig.FILL) ContentScale.FillHeight else ContentScale.Fit,
            )
            is HighLightedCardImage.CardBitmap -> Image(
                alignment = Alignment.BottomEnd,
                modifier = modifier,
                bitmap = imageSettings.picture.bitmap,
                contentDescription = null,
                contentScale = if (imageSettings.config == HighLightCardImageConfig.FILL) ContentScale.FillHeight else ContentScale.Fit,
            )
            is HighLightedCardImage.CardResource -> Image(
                alignment = Alignment.BottomEnd,
                modifier = modifier,
                painter = painterResource(id = imageSettings.picture.resourceId),
                contentDescription = null,
                contentScale = if (imageSettings.config == HighLightCardImageConfig.FILL) ContentScale.FillHeight else ContentScale.Fit,
            )
            else -> {}
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

    if (buttonStyle != null) {
        key(buttonStyle) {
            val isLink = buttonStyle == ButtonStyle.LINK || buttonStyle == ButtonStyle.LINK_INVERSE
            Button(
                modifier = modifier,
                text = if (isLink) applyLinkTextFix(buttonConfig.buttonText) else buttonConfig.buttonText,
                buttonStyle = buttonStyle,
                invalidatePaddings = isLink,
                invalidateMinWidth = isLink,
                onClickListener = onButtonClick,
            )
        }
    }else{
        Spacer(modifier = modifier)
    }
}

private fun applyLinkTextFix(text: String): String {
    return text.padEnd(18, ' ')
}

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

sealed class HighLightedCardImage{
    object None: HighLightedCardImage()
    data class CardBitmap(val bitmap: ImageBitmap): HighLightedCardImage()
    data class CardImageVector(val imageVector: ImageVector): HighLightedCardImage()


    data class CardResource(@DrawableRes val resourceId: Int): HighLightedCardImage()
}

data class HighLightCardImageSettings(
    val picture: HighLightedCardImage = HighLightedCardImage.None,
    val config: HighLightCardImageConfig = HighLightCardImageConfig.NONE,
){
    val withImage: Boolean
        get() = this.config != HighLightCardImageConfig.NONE
}

data class HighLightCardCustomBackgroundSettings(
    val bitmap: ImageBitmap? = null,
    @DrawableRes val drawableResource: Int? = null,
){
    val withCustomBackground: Boolean
        get() = this.bitmap != null || this.drawableResource != null
}
