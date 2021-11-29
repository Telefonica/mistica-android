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

public val LightGroup.PillLight: ImageVector
    get() {
        if (_pillLight != null) {
            return _pillLight!!
        }
        _pillLight = Builder(name = "PillLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.114f, 14.636f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.134f, 0.014f)
                curveToRelative(-1.294f, 0.412f, -2.827f, -0.252f, -4.555f, -1.983f)
                curveToRelative(-1.72f, -1.72f, -2.33f, -3.614f, -1.927f, -4.902f)
                curveToRelative(0.02f, -0.068f, 0.899f, -0.947f, 2.636f, -2.639f)
                curveToRelative(0.09f, -0.104f, 0.19f, -0.196f, 0.291f, -0.294f)
                lineToRelative(0.17f, -0.168f)
                curveToRelative(1.121f, -1.118f, 2.247f, -1.678f, 3.373f, -1.678f)
                curveToRelative(1.127f, 0.0f, 2.253f, 0.56f, 3.37f, 1.678f)
                curveToRelative(2.205f, 2.204f, 2.238f, 4.437f, 0.107f, 6.639f)
                lineToRelative(-3.33f, 3.333f)
                close()
                moveTo(11.408f, 19.342f)
                lineTo(11.327f, 19.423f)
                curveToRelative(-0.04f, 0.045f, -0.084f, 0.087f, -0.129f, 0.126f)
                curveToRelative(-2.162f, 2.025f, -4.358f, 1.955f, -6.53f, -0.213f)
                curveToRelative(-2.237f, -2.238f, -2.24f, -4.504f, -0.008f, -6.737f)
                lineToRelative(0.171f, -0.179f)
                curveToRelative(0.095f, -0.1f, 0.188f, -0.199f, 0.311f, -0.305f)
                lineToRelative(3.356f, -3.356f)
                curveToRelative(-0.053f, 1.381f, 0.717f, 2.888f, 2.33f, 4.501f)
                curveToRelative(1.538f, 1.541f, 2.986f, 2.323f, 4.314f, 2.345f)
                lineToRelative(-3.734f, 3.737f)
                close()
                moveTo(12.005f, 4.076f)
                lineTo(11.845f, 4.226f)
                curveToRelative(-0.12f, 0.119f, -0.24f, 0.23f, -0.325f, 0.331f)
                lineTo(4.582f, 11.5f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, false, -0.35f, 0.344f)
                lineToRelative(-0.16f, 0.163f)
                curveToRelative(-2.552f, 2.551f, -2.549f, 5.364f, 0.006f, 7.918f)
                curveToRelative(1.28f, 1.283f, 2.63f, 1.922f, 3.975f, 1.922f)
                curveToRelative(1.257f, 0.0f, 2.51f, -0.557f, 3.7f, -1.672f)
                curveToRelative(0.064f, -0.054f, 0.12f, -0.112f, 0.18f, -0.177f)
                lineToRelative(8.106f, -8.106f)
                curveToRelative(2.445f, -2.524f, 2.406f, -5.3f, -0.113f, -7.813f)
                curveToRelative(-2.551f, -2.557f, -5.364f, -2.557f, -7.921f, -0.002f)
                close()
            }
        }
        .build()
        return _pillLight!!
    }

private var _pillLight: ImageVector? = null
