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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Callout(
    modifier: Modifier = Modifier,
    title: String?,
    description: String?,
    buttonConfig: CalloutButtonConfig,
    @DrawableRes iconRes: Int? = null,
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
            iconRes?.let {
                Image(
                    modifier = Modifier.padding(end = 16.dp),
                    painter = painterResource(id = iconRes),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(MisticaTheme.colors.neutralHigh)
                )
            }

            Column(
                modifier = Modifier.weight(1F)
            ) {
                title?.let {
                    Text(
                        text = it,
                        style = MisticaTheme.typography.preset3,
                    )
                }
                description?.let {
                    Text(
                        modifier = Modifier.padding(top = 4.dp),
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
                            PrimaryButton(text = primaryButtonText, onClick = onPrimaryButtonClick)
                        }
                        CalloutButtonConfig.PRIMARY_AND_LINK -> {
                            PrimaryButton(
                                modifier = Modifier.padding(end = 16.dp),
                                text = primaryButtonText,
                                onClick = onPrimaryButtonClick
                            )
                            LinkButton(text = linkText, onClick = onLinkClicked)
                        }
                        CalloutButtonConfig.SECONDARY -> {
                            SecondaryButton(text = secondaryButtonText, onClick = onSecondaryButtonClick)
                        }
                        CalloutButtonConfig.PRIMARY_AND_SECONDARY -> {
                            PrimaryButton(
                                modifier = Modifier.padding(end = 16.dp),
                                text = primaryButtonText,
                                onClick = onPrimaryButtonClick
                            )
                            SecondaryButton(text = secondaryButtonText, onClick = onSecondaryButtonClick)
                        }
                        CalloutButtonConfig.SECONDARY_AND_LINK -> {
                            SecondaryButton(
                                modifier = Modifier.padding(end = 16.dp),
                                text = secondaryButtonText,
                                onClick = onSecondaryButtonClick
                            )
                            LinkButton(text = linkText, onClick = onLinkClicked)
                        }
                        CalloutButtonConfig.LINK -> {
                            LinkButton(text = linkText, onClick = onLinkClicked)
                        }
                    }
                }
            }

            if (dismissable) {
                Image(
                    modifier = Modifier
                        .clickable { onDismiss?.invoke() },
                    painter = painterResource(id = R.drawable.icn_cross),
                    contentDescription = stringResource(id = R.string.close_button_content_description)
                )
            }
        }
    }
}

@Composable
private fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String?,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(modifier, text, onClick, ButtonStyle.PRIMARY_SMALL)
}

@Composable
private fun SecondaryButton(
    modifier: Modifier = Modifier,
    text: String?,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(modifier, text, onClick, ButtonStyle.SECONDARY_SMALL)
}

@Composable
private fun LinkButton(
    modifier: Modifier = Modifier,
    text: String?,
    onClick: (() -> Unit)? = null,
) {
    CalloutButton(modifier, text, onClick, ButtonStyle.LINK)
}

@Composable
private fun CalloutButton(
    modifier: Modifier = Modifier,
    text: String?,
    onClick: (() -> Unit)?,
    style: ButtonStyle,
) {
    text?.let {
        Button(
            modifier = modifier,
            text = text,
            buttonStyle = style,
            onClickListener = { onClick?.invoke() }
        )
    }
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
