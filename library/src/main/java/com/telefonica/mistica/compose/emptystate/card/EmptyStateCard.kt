package com.telefonica.mistica.compose.emptystate.card

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.telefonica.mistica.emptystate.card.EmptyStateCardView

@Composable
fun EmptyStateCard(
    modifier: Modifier = Modifier,
    @DrawableRes imageResId: Int,
    imageContentDescription: String? = null,
    imageSize: EmptyStateCard.ImageSize,
    buttonConfig: EmptyStateCard.ButtonConfig,
    title: String,
    subtitle: String,
    primaryButtonText: String? = null,
    primaryButtonLoadingText: String? = null,
    onPrimaryButtonClickListener: (() -> Unit)? = null,
    secondaryButtonText: String? = null,
    onSecondaryButtonClickListener: (() -> Unit)? = null,
    linkButtonText: String? = null,
    onLinkButtonClickListener: (() -> Unit)? = null,
    isPrimaryButtonLoading: Boolean = false
) {
    fun EmptyStateCardView.update(): EmptyStateCardView = apply {
        setImage(imageResId)
        imageContentDescription?.let { setImageContentDescription(it) }
        setImageSize(imageSize.toInt())

        setTitle(title)
        setSubtitle(subtitle)

        setButtonsConfig(buttonConfig.toInt())
        primaryButtonText?.let { setPrimaryButtonText(it) }
        primaryButtonLoadingText?.let { setPrimaryButtonLoadingText(it) }
        onPrimaryButtonClickListener?.let { setPrimaryButtonOnClick{ it() } }

        secondaryButtonText?.let { setSecondaryButtonText(it) }
        onSecondaryButtonClickListener?.let { setSecondaryButtonOnClick{ it() } }

        linkButtonText?.let { setLinkButtonText(it) }
        onLinkButtonClickListener?.let { setLinkButtonOnClick{ it() } }

        setIsLoading(isPrimaryButtonLoading)
    }

    AndroidView(
        modifier = modifier,
        factory = { context -> EmptyStateCardView(context).update() },
        update = { it.update() }
    )
}

@EmptyStateCardView.ImageSize
private fun EmptyStateCard.ImageSize.toInt(): Int =
    when (this) {
        EmptyStateCard.ImageSize.ICON -> EmptyStateCardView.IMAGE_SIZE_ICON
        EmptyStateCard.ImageSize.SMALL -> EmptyStateCardView.IMAGE_SIZE_SMALL
    }

@EmptyStateCardView.ButtonsConfig
private fun EmptyStateCard.ButtonConfig.toInt(): Int =
    when (this) {
        EmptyStateCard.ButtonConfig.NONE -> EmptyStateCardView.BUTTONS_CONFIG_NONE
        EmptyStateCard.ButtonConfig.PRIMARY -> EmptyStateCardView.BUTTONS_CONFIG_PRIMARY
        EmptyStateCard.ButtonConfig.PRIMARY_LINK -> EmptyStateCardView.BUTTONS_CONFIG_PRIMARY_LINK
        EmptyStateCard.ButtonConfig.PRIMARY_SECONDARY -> EmptyStateCardView.BUTTONS_CONFIG_PRIMARY_SECONDARY
        EmptyStateCard.ButtonConfig.SECONDARY -> EmptyStateCardView.BUTTONS_CONFIG_SECONDARY
        EmptyStateCard.ButtonConfig.SECONDARY_LINK -> EmptyStateCardView.BUTTONS_CONFIG_SECONDARY_LINK
        EmptyStateCard.ButtonConfig.LINK -> EmptyStateCardView.LINK
    }

object EmptyStateCard {
    enum class ButtonConfig {
        NONE,
        PRIMARY,
        PRIMARY_LINK,
        PRIMARY_SECONDARY,
        SECONDARY,
        SECONDARY_LINK,
        LINK
    }

    enum class ImageSize {
        ICON,
        SMALL
    }
}
