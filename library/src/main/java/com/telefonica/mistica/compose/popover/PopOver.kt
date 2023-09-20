package com.telefonica.mistica.compose.popover

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTagsAsResourceId
import androidx.compose.ui.unit.dp
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec
import com.skydoves.balloon.compose.Balloon
import com.skydoves.balloon.compose.BalloonWindow
import com.skydoves.balloon.compose.rememberBalloonBuilder
import com.skydoves.balloon.compose.setBackgroundColor
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.popover.Popover.TestTag.CLOSE_BUTTON
import com.telefonica.mistica.compose.popover.Popover.TestTag.POPOVER_CONTENT
import com.telefonica.mistica.compose.popover.Popover.TestTag.POPOVER_SUBTITLE
import com.telefonica.mistica.compose.popover.Popover.TestTag.POPOVER_TITLE
import com.telefonica.mistica.compose.theme.MisticaTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PopOver(
    modifier: Modifier = Modifier,
    @DrawableRes imageRes: Int?,
    title: String,
    subtitle: String,
    popoverWindow: @Composable (popoverWindow: PopOverWindow) -> Unit,
) {
    val colorBackground = MisticaTheme.colors.background
    val builder = rememberBalloonBuilder {
        setArrowSize(12)
        setArrowPosition(0.5f)
        setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
        setArrowDrawableResource(R.drawable.icn_arrow_popover_compose)
        setWidth(BalloonSizeSpec.WRAP)
        setHeight(BalloonSizeSpec.WRAP)
        setCornerRadius(8f)
        setBackgroundColor(colorBackground)
        setBalloonAnimation(BalloonAnimation.NONE)
        setElevation(9)
        dismissWhenTouchOutside = false
        dismissWhenOverlayClicked = false
    }

    val popOverWindow = PopOverWindow(null, null)
    var window: BalloonWindow? by remember { mutableStateOf(null) }

    key("$title$subtitle") {
        Balloon(
            modifier = modifier
                .onGloballyPositioned {
                    popOverWindow.coordinates = it
                },
            builder = builder,
            balloonContent = {
                Box(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 8.dp, end = 8.dp, bottom = 16.dp)
                        .background(Color.Transparent)
                        .semantics { testTagsAsResourceId = true }
                        .testTag(POPOVER_CONTENT),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.TopStart),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        if (imageRes != null) {
                            Image(
                                painter = painterResource(id = imageRes),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .size(40.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 14.dp, top = 8.dp)
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 4.dp)
                                    .testTag(POPOVER_TITLE),
                                text = title,
                                style = MisticaTheme.typography.preset3,
                                maxLines = 2,
                            )
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag(POPOVER_SUBTITLE),
                                text = subtitle,
                                style = MisticaTheme.typography.preset2,
                                color = MisticaTheme.colors.textSecondary
                            )
                        }
                    }
                    Spacer(modifier = Modifier.fillMaxWidth())
                    Image(
                        painter = painterResource(id = R.drawable.icn_cross),
                        contentDescription = null,
                        modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.TopEnd)
                            .clickable {
                                window?.dismiss()
                            }
                            .testTag(CLOSE_BUTTON)
                    )
                }
            }
        ) { balloonWindow ->
            window = balloonWindow
            popOverWindow.balloonWindow = balloonWindow
            popoverWindow(popOverWindow)
        }
    }
}

object Popover {
    object TestTag {
        const val POPOVER_CONTENT = "popover_content"
        const val POPOVER_TITLE = "popover_title"
        const val POPOVER_SUBTITLE = "popover_subtitle"
        const val CLOSE_BUTTON = "close_button"
    }
}