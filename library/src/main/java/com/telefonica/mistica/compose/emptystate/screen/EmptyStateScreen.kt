package com.telefonica.mistica.compose.emptystate.screen

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.emptystate.screen.EmptyStateScreenView

@Composable
fun EmptyStateScreen(
    modifier: Modifier = Modifier,
    @DrawableRes imageResId: Int,
    imageContentDescription: String? = null,
    imageSize: EmptyStateScreen.ImageSize,
    buttonConfig: EmptyStateScreen.ButtonConfig,
    title: String,
    subtitle: String,
    primaryButtonText: String? = null,
    onPrimaryButtonClickListener: (() -> Unit)? = null,
    secondaryButtonText: String? = null,
    onSecondaryButtonClickListener: (() -> Unit)? = null,
    linkButtonText: String? = null,
    onLinkButtonClickListener: (() -> Unit)? = null,
) {
    fun EmptyStateScreenView.update(): EmptyStateScreenView = apply {
        setImage(imageResId)
        imageContentDescription?.let { setImageContentDescription(it) }
        setImageSize(imageSize.toInt())

        setTitle(title)
        setSubtitle(subtitle)

        setButtonsConfig(buttonConfig.toInt())
        primaryButtonText?.let { setPrimaryButtonText(it) }
        onPrimaryButtonClickListener?.let { setPrimaryButtonOnClick{ it() } }

        secondaryButtonText?.let { setSecondaryButtonText(it) }
        onSecondaryButtonClickListener?.let { setSecondaryButtonOnClick{ it() } }

        linkButtonText?.let { setLinkButtonText(it) }
        onLinkButtonClickListener?.let { setLinkButtonOnClick{ it() } }
    }

    AndroidView(
        modifier = modifier,
        factory = { context -> EmptyStateScreenView(context).update() },
        update = { it.update() }
    )
}

@EmptyStateScreenView.ImageSize
private fun EmptyStateScreen.ImageSize.toInt(): Int =
    when (this) {
        EmptyStateScreen.ImageSize.ICON -> EmptyStateScreenView.IMAGE_SIZE_ICON
        EmptyStateScreen.ImageSize.SMALL -> EmptyStateScreenView.IMAGE_SIZE_SMALL
        EmptyStateScreen.ImageSize.FULL_WIDTH -> EmptyStateScreenView.IMAGE_SIZE_FULL_WIDTH
    }

@EmptyStateScreenView.ButtonsConfig
private fun EmptyStateScreen.ButtonConfig.toInt(): Int =
    when (this) {
        EmptyStateScreen.ButtonConfig.NONE -> EmptyStateScreenView.BUTTONS_CONFIG_NONE
        EmptyStateScreen.ButtonConfig.PRIMARY -> EmptyStateScreenView.BUTTONS_CONFIG_PRIMARY
        EmptyStateScreen.ButtonConfig.PRIMARY_LINK -> EmptyStateScreenView.BUTTONS_CONFIG_PRIMARY_LINK
        EmptyStateScreen.ButtonConfig.SECONDARY -> EmptyStateScreenView.BUTTONS_CONFIG_SECONDARY
        EmptyStateScreen.ButtonConfig.SECONDARY_LINK -> EmptyStateScreenView.BUTTONS_CONFIG_SECONDARY_LINK
    }

object EmptyStateScreen {
    enum class ImageSize {
        ICON,
        SMALL,
        FULL_WIDTH
    }

    enum class ButtonConfig {
        NONE,
        PRIMARY,
        PRIMARY_LINK,
        SECONDARY,
        SECONDARY_LINK
    }
}