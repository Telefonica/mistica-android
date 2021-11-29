package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.DownloadCloudLight: ImageVector
    get() {
        if (_downloadCloudLight != null) {
            return _downloadCloudLight!!
        }
        _downloadCloudLight = Builder(name = "DownloadCloudLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.213f, 18.015f)
                lineToRelative(-1.092f, 0.009f)
                lineToRelative(1.139f, -1.193f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.137f, -0.787f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.654f, -0.442f)
                horizontalLineToRelative(-1.865f)
                lineToRelative(-0.01f, -4.987f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, false, -0.716f, -0.722f)
                horizontalLineToRelative(-4.32f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, -0.716f, 0.722f)
                verticalLineToRelative(4.894f)
                lineTo(7.24f, 15.509f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, false, -0.654f, 0.442f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, 0.147f, 0.79f)
                lineToRelative(1.277f, 1.335f)
                lineToRelative(-2.297f, 0.01f)
                curveToRelative(-1.14f, 0.0f, -3.797f, -0.377f, -3.797f, -3.868f)
                curveToRelative(0.0f, -1.953f, 0.83f, -3.195f, 2.463f, -3.674f)
                curveToRelative(0.204f, -0.055f, 0.329f, -0.367f, 0.329f, -0.571f)
                curveToRelative(0.0f, -5.595f, 4.77f, -6.03f, 6.232f, -6.03f)
                curveToRelative(0.826f, 0.0f, 5.01f, 0.188f, 6.012f, 3.99f)
                curveToRelative(0.047f, 0.199f, 0.22f, 0.338f, 0.432f, 0.347f)
                curveToRelative(1.408f, 0.037f, 4.689f, 0.59f, 4.689f, 4.856f)
                curveToRelative(0.003f, 4.53f, -3.719f, 4.879f, -4.861f, 4.879f)
                close()
                moveTo(12.058f, 20.965f)
                lineTo(7.736f, 16.448f)
                horizontalLineToRelative(1.59f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, 0.707f, -0.723f)
                verticalLineToRelative(-4.893f)
                horizontalLineToRelative(3.915f)
                lineToRelative(0.01f, 4.986f)
                curveToRelative(0.0f, 0.405f, 0.322f, 0.723f, 0.716f, 0.723f)
                horizontalLineToRelative(1.572f)
                lineToRelative(-4.188f, 4.424f)
                close()
                moveTo(17.748f, 7.356f)
                curveTo(16.433f, 3.213f, 11.867f, 3.0f, 10.947f, 3.0f)
                curveToRelative(-1.186f, 0.0f, -7.033f, 0.327f, -7.152f, 6.753f)
                curveTo(2.618f, 10.195f, 1.0f, 11.323f, 1.0f, 14.215f)
                curveToRelative(0.0f, 3.55f, 2.438f, 4.807f, 4.726f, 4.807f)
                lineToRelative(3.18f, -0.019f)
                lineToRelative(2.639f, 2.771f)
                arcToRelative(0.721f, 0.721f, 0.0f, false, false, 0.516f, 0.226f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.504f, -0.226f)
                lineToRelative(2.667f, -2.799f)
                lineToRelative(1.984f, -0.018f)
                curveToRelative(0.967f, 0.0f, 5.784f, -0.272f, 5.784f, -5.824f)
                curveToRelative(-0.003f, -4.847f, -3.671f, -5.656f, -5.252f, -5.777f)
                close()
            }
        }
        .build()
        return _downloadCloudLight!!
    }

private var _downloadCloudLight: ImageVector? = null
