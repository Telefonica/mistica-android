package com.telefonica.mistica.compose.list

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.shape.Circle
import com.telefonica.mistica.list.model.ImageDimensions

sealed class ListRowIcon(val contentDescription: String?) {

    data class NormalIcon(
        val painter: Painter? = null,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
        val tint: Color? = null,
    ) : ListRowIcon(description)

    data class CircleIcon(
        val painter: Painter? = null,
        val backgroundColor: Color = Color.Transparent,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
        val tint: Color? = null,
    ) : ListRowIcon(description)

    data class ResizableIcon(
        val painter: Painter? = null,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
        val tint: Color? = null,
    ) : ListRowIcon(description)

    data class SmallAsset(
        val painter: Painter? = null,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
    ) : ListRowIcon(description)

    data class LargeAsset(
        val painter: Painter? = null,
        val aspectRatio: AspectRatio = AspectRatio.RATIO_1_1,
        val contentScale: ContentScale = ContentScale.Crop,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
    ) : ListRowIcon(description)

    /**
     * Use either ResizableIcon for solid colour icons instead of this.
     * ImageAsset should only be used for multicolour images
     */
    data class ImageAsset(
        val painter: Painter? = null,
        val dimensions: ImageDimensions? = null,
        val contentScale: ContentScale = ContentScale.Crop,
        private val description: String? = null,
        val modifier: Modifier = Modifier,
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
            is ResizableIcon -> DrawResizableIcon()
            is SmallAsset -> DrawSmallAsset()
            is LargeAsset -> DrawLargeAsset()
            is ImageAsset -> DrawImageAsset()
        }
    }

    @Composable
    private fun NormalIcon.DrawNormalIcon() {
        Box(
            modifier = modifier
                .size(40.dp)
                .wrapContentSize(align = Alignment.Center),
        ) {
            painter?.let {
                Icon(
                    painter = painter,
                    modifier = Modifier.size(24.dp),
                    contentDescription = contentDescription,
                    tint = tint ?: MaterialTheme.colors.onSurface,
                )
            }
        }
    }

    @Composable
    private fun CircleIcon.DrawCircleIcon() {
        Circle(
            color = backgroundColor,
            modifier = modifier,
        ) {
           painter?.let {
                Icon(
                    painter = painter,
                    contentDescription = contentDescription,
                    tint = tint ?: MaterialTheme.colors.onSurface,
                )
            }
        }
    }

    @Composable
    private fun ResizableIcon.DrawResizableIcon() {
        Box(
            modifier = Modifier.wrapContentSize(align = Alignment.Center),
        ) {
            painter?.let {
                Icon(
                    painter = painter,
                    modifier = modifier,
                    contentDescription = contentDescription,
                    tint = tint ?: MaterialTheme.colors.onSurface,
                )
            }
        }
    }

    @Composable
    private fun SmallAsset.DrawSmallAsset() {
        painter?.let {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
        }
    }

    @Composable
    private fun LargeAsset.DrawLargeAsset() {
        painter?.let {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = modifier
                    .height(aspectRatio.height)
                    .width(aspectRatio.width)
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = contentScale,
            )
        }
    }

    @Composable
    private fun ImageAsset.DrawImageAsset() {
        painter?.let {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = modifier
                    .width(dimensions?.width?.dp ?: dimensionResource(id = R.dimen.asset_default_size))
                    .height(dimensions?.height?.dp ?: dimensionResource(id = R.dimen.asset_default_size))
                    .clip(RoundedCornerShape(4.dp)),
                contentScale = contentScale,
            )
        }
    }
}
