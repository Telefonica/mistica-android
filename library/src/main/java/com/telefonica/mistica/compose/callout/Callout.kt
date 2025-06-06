package com.telefonica.mistica.compose.callout

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.callout.CalloutViewImageConfig
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.card.datacard.IconType
import com.telefonica.mistica.compose.card.datacard.noIcon
import com.telefonica.mistica.compose.card.datacard.resourceIconPainter
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Callout(
    modifier: Modifier = Modifier,
    title: String?,
    setTitleAsHeading: Boolean = true,
    description: String?,
    buttonConfig: CalloutButtonConfig,
    @DrawableRes iconRes: Int? = null,
    imageConfig: CalloutViewImageConfig = CalloutViewImageConfig.NONE,
    dismissable: Boolean,
    onDismiss: (() -> Unit)? = null,
    inverse: Boolean,
    primaryButtonText: String? = null,
    secondaryButtonText: String? = null,
    onPrimaryButtonClick: (() -> Unit)? = null,
    onSecondaryButtonClick: (() -> Unit)? = null,
    linkText: String? = null,
    onLinkClicked: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(MisticaTheme.radius.containerBorderRadius))
            .background(
                if (inverse) {
                    MisticaTheme.colors.backgroundContainer
                } else {
                    MisticaTheme.colors.backgroundAlternative
                }
            )
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.Top,
        ) {

            if (iconRes != null) {
                Icon(
                    iconRes = iconRes,
                    imageConfig = imageConfig
                )
            }

            Column(
                modifier = Modifier.weight(1F)
            ) {
                title?.let {
                    Text(
                        modifier = Modifier
                            .testTag(CalloutTestTag.TITLE)
                            .semantics { if (setTitleAsHeading) heading() },
                        text = it,
                        style = MisticaTheme.typography.preset3,
                    )
                }
                description?.let {
                    Text(
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .testTag(CalloutTestTag.DESCRIPTION),
                        text = it,
                        style = MisticaTheme.typography.preset2,
                        color = MisticaTheme.colors.textSecondary
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                ) {
                    when (buttonConfig) {
                        CalloutButtonConfig.NONE -> { /* No buttons are shown */
                        }

                        CalloutButtonConfig.PRIMARY -> {
                            PrimaryButton(
                                text = primaryButtonText,
                                onClick = onPrimaryButtonClick
                            )
                        }

                        CalloutButtonConfig.PRIMARY_AND_LINK -> {
                            PrimaryButton(
                                text = primaryButtonText,
                                modifier = Modifier.padding(end = 16.dp),
                                onClick = onPrimaryButtonClick,
                            )
                            LinkButton(
                                text = linkText,
                                onClick = onLinkClicked
                            )
                        }

                        CalloutButtonConfig.SECONDARY -> {
                            SecondaryButton(
                                text = secondaryButtonText,
                                onClick = onSecondaryButtonClick
                            )
                        }

                        CalloutButtonConfig.PRIMARY_AND_SECONDARY -> {
                            PrimaryButton(
                                text = primaryButtonText,
                                modifier = Modifier.padding(end = 16.dp),
                                onClick = onPrimaryButtonClick,
                            )
                            SecondaryButton(
                                text = secondaryButtonText,
                                onClick = onSecondaryButtonClick
                            )
                        }

                        CalloutButtonConfig.SECONDARY_AND_LINK -> {
                            SecondaryButton(
                                text = secondaryButtonText,
                                modifier = Modifier.padding(end = 16.dp),
                                onClick = onSecondaryButtonClick,
                            )
                            LinkButton(
                                text = linkText,
                                onClick = onLinkClicked
                            )
                        }

                        CalloutButtonConfig.LINK -> {
                            LinkButton(
                                text = linkText,
                                onClick = onLinkClicked
                            )
                        }
                    }
                }
            }

            if (dismissable) {
                Image(
                    modifier = Modifier
                        .clickable { onDismiss?.invoke() }
                        .semantics { traversalIndex = 1f }
                        .testTag(CalloutTestTag.CLOSE_BUTTON),
                    painter = painterResource(id = R.drawable.icn_cross),
                    contentDescription = stringResource(id = R.string.close_button_content_description)
                )
            }
        }
    }
}

@Composable
private fun PrimaryButton(
    text: String?,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(
        text = text,
        onClick = onClick,
        style = ButtonStyle.PRIMARY_SMALL,
        modifier = modifier.testTag(CalloutTestTag.PRIMARY_BUTTON)
    )
}

@Composable
private fun SecondaryButton(
    text: String?,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(
        text = text,
        onClick = onClick,
        style = ButtonStyle.SECONDARY_SMALL,
        modifier = modifier.testTag(CalloutTestTag.SECONDARY_BUTTON)
    )
}

@Composable
private fun LinkButton(
    text: String?,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(
        text = text,
        onClick = onClick,
        style = ButtonStyle.LINK,
        modifier = modifier.testTag(CalloutTestTag.LINK_BUTTON),
        invalidatePaddings = true
    )
}

@Composable
private fun CalloutButton(
    text: String?,
    onClick: (() -> Unit)?,
    style: ButtonStyle,
    modifier: Modifier = Modifier,
    invalidatePaddings: Boolean = false,
) {
    text?.let {
        Button(
            modifier = modifier,
            text = text,
            buttonStyle = style,
            onClickListener = { onClick?.invoke() },
            invalidatePaddings = invalidatePaddings,
        )
    }
}

@Composable
private fun Icon(
    @DrawableRes iconRes: Int,
    imageConfig: CalloutViewImageConfig,
) {
    val iconPainter = when (imageConfig) {
        CalloutViewImageConfig.ICON -> {
            resourceIconPainter(
                iconRes = iconRes,
                iconType = IconType.ICON,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .testTag(CalloutTestTag.ICON),
            )
        }

        CalloutViewImageConfig.SQUARE_IMAGE -> {
            resourceIconPainter(
                iconRes = iconRes,
                iconType = IconType.SQUARE_IMAGE,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .clip(RoundedCornerShape(MisticaTheme.radius.mediaSmallBorderRadius))
                    .testTag(CalloutTestTag.ICON),
            )
        }

        CalloutViewImageConfig.CIRCULAR_IMAGE -> {
            resourceIconPainter(
                iconRes = iconRes,
                iconType = IconType.CIRCULAR_ASSET,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .testTag(CalloutTestTag.ICON),
            )
        }

        CalloutViewImageConfig.NONE -> noIcon()
    }

    iconPainter.Paint()
}

enum class CalloutButtonConfig {
    NONE,
    PRIMARY,
    PRIMARY_AND_LINK,
    PRIMARY_AND_SECONDARY,
    SECONDARY,
    SECONDARY_AND_LINK,
    LINK,
}

private object CalloutTestTag {
    const val ICON = "callout_icon"
    const val TITLE = "callout_title"
    const val DESCRIPTION = "callout_description"
    const val PRIMARY_BUTTON = "callout_primary_button"
    const val SECONDARY_BUTTON = "callout_secondary_button"
    const val LINK_BUTTON = "callout_link_button"
    const val CLOSE_BUTTON = "callout_close_button"
}
