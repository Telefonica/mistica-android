package com.telefonica.mistica.compose.list

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.telefonica.mistica.compose.shape.Circle

sealed class ListRowIcon(val contentDescription: String?) {

    data class NormalIcon(
        @DrawableRes val iconResId: Int? = null,
        private val description: String? = null,
    ) : ListRowIcon(description)

    data class CircleIcon(
        @DrawableRes val iconResId: Int? = null,
        private val description: String? = null,
        val backgroundColor: Color = Color.Transparent,
    ) : ListRowIcon(description)

    data class SmallAsset(
        val iconUrl: String? = null,
        @DrawableRes val iconResId: Int? = null,
        private val description: String? = null,
    ) : ListRowIcon(description)

    data class LargeAsset(
        val iconUrl: String? = null,
        @DrawableRes val iconResId: Int? = null,
        val aspectRatio: AspectRatio = AspectRatio.RATIO_1_1,
        val contentScale: ContentScale = ContentScale.Crop,
        private val description: String? = null,
    ) : ListRowIcon(description)

    enum class AspectRatio(val width: Dp, val height: Dp) {
        RATIO_1_1(80.dp, 80.dp),
        RATIO_7_10(80.dp, 116.dp),
        RATIO_16_9(138.dp, 80.dp)
    }

    @Composable
    fun Draw() {
        when (this) {
            is NormalIcon -> DrawNormalIcon()
            is CircleIcon -> DrawCircleIcon()
            is SmallAsset -> DrawSmallAsset()
            is LargeAsset -> DrawLargeAsset()
        }
    }

    @Composable
    private fun NormalIcon.DrawNormalIcon() {
        Box(
            modifier = Modifier
                .size(40.dp)
                .wrapContentSize(align = Alignment.Center)
        ) {
            iconResId?.let {
                Icon(
                    painter = painterResource(id = iconResId),
                    modifier = Modifier.size(24.dp),
                    contentDescription = contentDescription
                )
            }
        }

    }

    @Composable
    private fun CircleIcon.DrawCircleIcon() {
        Circle(
            color = backgroundColor,
        ) {
            iconResId?.let {
                Icon(
                    painter = painterResource(id = iconResId),
                    contentDescription = contentDescription
                )
            }
        }
    }

    @Composable
    private fun SmallAsset.DrawSmallAsset() {
        val painter = when {
            iconResId != null -> painterResource(iconResId)
            iconUrl != null -> rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current)
                    .data(iconUrl)
                    .build()
            )

            else -> null
        }
        painter?.let {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
        }
    }

    @Composable
    private fun LargeAsset.DrawLargeAsset() {
        val painter = when {
            iconResId != null -> painterResource(iconResId)
            iconUrl != null -> rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current)
                    .data(iconUrl)
                    .build()
            )

            else -> null
        }
        painter?.let {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .height(aspectRatio.height)
                    .width(aspectRatio.width)
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = contentScale,
            )
        }
    }
}
