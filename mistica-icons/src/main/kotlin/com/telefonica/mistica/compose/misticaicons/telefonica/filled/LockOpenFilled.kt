package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.LockOpenFilled: ImageVector
    get() {
        if (_lockOpenFilled != null) {
            return _lockOpenFilled!!
        }
        _lockOpenFilled = Builder(name = "LockOpenFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.284f, 11.095f)
                curveToRelative(0.003f, 0.0f, 0.0f, 5.163f, 0.003f, 7.709f)
                curveToRelative(0.0f, 0.896f, -0.272f, 1.608f, -0.812f, 2.117f)
                curveToRelative(-0.894f, 0.846f, -2.185f, 0.762f, -2.238f, 0.76f)
                lineToRelative(-8.717f, 0.005f)
                curveToRelative(-0.986f, 0.0f, -1.757f, -0.294f, -2.289f, -0.874f)
                curveToRelative(-0.779f, -0.848f, -0.706f, -1.989f, -0.703f, -2.036f)
                lineToRelative(-0.003f, -7.74f)
                curveToRelative(0.0f, -0.904f, 0.278f, -1.621f, 0.82f, -2.128f)
                curveToRelative(0.508f, -0.474f, 1.141f, -0.645f, 1.6f, -0.704f)
                verticalLineToRelative(-1.19f)
                curveToRelative(0.0f, -3.664f, 2.44f, -4.992f, 4.723f, -5.014f)
                curveToRelative(0.146f, 0.0f, 0.3f, 0.003f, 0.434f, 0.003f)
                curveToRelative(1.838f, 0.045f, 4.014f, 0.997f, 4.602f, 3.538f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, -0.442f, 0.725f)
                arcToRelative(0.599f, 0.599f, 0.0f, false, true, -0.717f, -0.448f)
                curveToRelative(-0.546f, -2.359f, -2.796f, -2.594f, -3.474f, -2.61f)
                curveToRelative(-0.12f, -0.004f, -0.263f, -0.004f, -0.395f, -0.004f)
                curveToRelative(-1.064f, 0.009f, -3.543f, 0.401f, -3.543f, 3.807f)
                verticalLineToRelative(1.165f)
                curveToRelative(1.625f, -0.002f, 6.04f, -0.008f, 8.14f, -0.008f)
                curveToRelative(1.006f, 0.0f, 1.787f, 0.297f, 2.322f, 0.885f)
                curveToRelative(0.776f, 0.855f, 0.692f, 1.989f, 0.69f, 2.042f)
                close()
                moveTo(11.867f, 16.263f)
                horizontalLineToRelative(-0.207f)
                curveToRelative(-1.356f, -0.02f, -1.356f, -1.087f, -1.356f, -1.487f)
                curveToRelative(0.0f, -0.398f, 0.0f, -1.457f, 1.33f, -1.47f)
                horizontalLineToRelative(0.042f)
                lineToRelative(0.168f, 0.002f)
                curveToRelative(1.376f, 0.034f, 1.376f, 1.126f, 1.376f, 1.485f)
                curveToRelative(0.003f, 0.395f, 0.003f, 1.448f, -1.353f, 1.47f)
                close()
                moveTo(11.875f, 12.103f)
                curveToRelative(-0.059f, -0.002f, -0.129f, -0.002f, -0.196f, -0.002f)
                horizontalLineToRelative(-0.053f)
                curveToRelative(-0.532f, 0.005f, -2.51f, 0.19f, -2.51f, 2.675f)
                curveToRelative(0.0f, 2.493f, 1.997f, 2.686f, 2.53f, 2.695f)
                horizontalLineToRelative(0.243f)
                curveToRelative(0.505f, -0.009f, 2.53f, -0.202f, 2.53f, -2.678f)
                curveToRelative(-0.006f, -2.468f, -2.025f, -2.675f, -2.544f, -2.69f)
                close()
            }
        }
        .build()
        return _lockOpenFilled!!
    }

private var _lockOpenFilled: ImageVector? = null
