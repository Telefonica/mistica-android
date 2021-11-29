package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.WifiLight: ImageVector
    get() {
        if (_wifiLight != null) {
            return _wifiLight!!
        }
        _wifiLight = Builder(name = "WifiLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.034f, 14.353f)
                curveToRelative(1.712f, 0.0f, 3.283f, 0.72f, 4.5f, 2.003f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, 0.0f, 0.53f)
                arcToRelative(0.438f, 0.438f, 0.0f, false, true, -0.249f, 0.08f)
                arcToRelative(0.319f, 0.319f, 0.0f, false, true, -0.252f, -0.114f)
                curveToRelative(-1.072f, -1.135f, -2.5f, -1.78f, -3.999f, -1.78f)
                horizontalLineToRelative(-0.036f)
                curveToRelative(-1.5f, 0.0f, -2.963f, 0.645f, -4.035f, 1.814f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.5f, 0.0f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, 0.0f, -0.53f)
                curveToRelative(1.212f, -1.283f, 2.855f, -2.003f, 4.535f, -2.003f)
                horizontalLineToRelative(0.036f)
                close()
                moveTo(12.002f, 10.155f)
                curveToRelative(2.711f, 0.0f, 5.283f, 1.173f, 7.215f, 3.33f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, 0.0f, 0.529f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.5f, 0.0f)
                curveToRelative(-1.788f, -2.004f, -4.18f, -3.1f, -6.715f, -3.1f)
                reflectiveCurveToRelative(-4.891f, 1.096f, -6.715f, 3.104f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, -0.248f, 0.11f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, -0.252f, -0.644f)
                curveToRelative(1.928f, -2.156f, 4.5f, -3.329f, 7.215f, -3.329f)
                close()
                moveTo(21.284f, 9.778f)
                curveToRelative(0.392f, 0.004f, 0.716f, 0.343f, 0.716f, 0.758f)
                curveToRelative(0.0f, 0.42f, -0.324f, 0.759f, -0.716f, 0.759f)
                curveToRelative(-0.392f, 0.0f, -0.716f, -0.344f, -0.716f, -0.759f)
                curveToRelative(0.0f, -0.419f, 0.324f, -0.758f, 0.716f, -0.758f)
                close()
                moveTo(11.998f, 6.0f)
                curveToRelative(2.891f, 0.0f, 5.607f, 0.949f, 7.926f, 2.724f)
                curveToRelative(0.144f, 0.114f, 0.18f, 0.343f, 0.072f, 0.529f)
                curveToRelative(-0.108f, 0.152f, -0.356f, 0.19f, -0.5f, 0.076f)
                arcToRelative(12.136f, 12.136f, 0.0f, false, false, -7.53f, -2.57f)
                curveToRelative(-3.64f, 0.0f, -6.963f, 1.511f, -9.39f, 4.235f)
                curveToRelative(-0.036f, 0.076f, -0.108f, 0.11f, -0.216f, 0.11f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, -0.252f, -0.644f)
                arcTo(13.063f, 13.063f, 0.0f, false, true, 11.998f, 6.0f)
                close()
            }
        }
        .build()
        return _wifiLight!!
    }

private var _wifiLight: ImageVector? = null
