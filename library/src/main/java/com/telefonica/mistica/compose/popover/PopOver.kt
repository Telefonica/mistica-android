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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec
import com.skydoves.balloon.compose.Balloon
import com.skydoves.balloon.compose.BalloonWindow
import com.skydoves.balloon.compose.rememberBalloonBuilder
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun PopOver(
    modifier: Modifier = Modifier,
    @DrawableRes imageRes: Int?,
    title: String,
    subtitle: String,
    popoverWindow: @Composable (popoverWindow: PopOverWindow) -> Unit,
) {
    val builder = rememberBalloonBuilder {
        setArrowSize(11)
        setArrowPosition(0.5f)
        setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
        setArrowDrawableResource(R.drawable.icn_arrow_popover_up)
        setWidth(BalloonSizeSpec.WRAP)
        setHeight(BalloonSizeSpec.WRAP)
        setCornerRadius(8f)
        setBackgroundColorResource(R.color.cardview_light_background)
        setBalloonAnimation(BalloonAnimation.NONE)
        dismissWhenTouchOutside = false
        dismissWhenOverlayClicked = false
    }

    var window: BalloonWindow? by remember { mutableStateOf(null) }

    Balloon(
        modifier = modifier,
        builder = builder,
        balloonContent = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp, end = 8.dp, bottom = 16.dp)
                    .background(Color.Transparent),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    if (imageRes != null) {
                        Image(
                            painter = painterResource(id = imageRes),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .wrapContentHeight()
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            text = title,
                            style = MisticaTheme.typography.preset3
                        )
                        Text(
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
                )
            }
        }
    ) { balloonWindow ->
        window = balloonWindow
        popoverWindow(PopOverWindow(balloonWindow))
    }
}
