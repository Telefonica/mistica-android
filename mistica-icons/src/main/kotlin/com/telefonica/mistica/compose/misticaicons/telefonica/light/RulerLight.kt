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

public val LightGroup.RulerLight: ImageVector
    get() {
        if (_rulerLight != null) {
            return _rulerLight!!
        }
        _rulerLight = Builder(name = "RulerLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.854f, 17.665f)
                arcToRelative(0.451f, 0.451f, 0.0f, false, false, 0.0f, -0.638f)
                lineToRelative(-3.47f, -3.474f)
                lineToRelative(-1.502f, 1.474f)
                arcToRelative(0.425f, 0.425f, 0.0f, false, true, -0.602f, -0.003f)
                lineToRelative(-0.003f, -0.003f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, true, 0.005f, -0.605f)
                lineToRelative(1.496f, -1.47f)
                lineToRelative(-1.507f, -1.51f)
                lineToRelative(-2.263f, 2.26f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, -0.605f, 0.0f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.0f, -0.605f)
                lineToRelative(2.26f, -2.263f)
                lineToRelative(-1.504f, -1.504f)
                lineToRelative(-1.333f, 1.313f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, true, -0.602f, -0.61f)
                lineToRelative(0.002f, -0.003f)
                lineToRelative(1.328f, -1.305f)
                lineToRelative(-1.507f, -1.507f)
                lineToRelative(-2.507f, 2.51f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, -0.605f, 0.0f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.0f, -0.606f)
                lineToRelative(2.507f, -2.507f)
                lineTo(8.935f, 5.1f)
                lineToRelative(-1.25f, 1.23f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, true, -0.607f, -0.005f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, true, 0.006f, -0.608f)
                lineTo(8.33f, 4.492f)
                lineTo(6.971f, 3.133f)
                arcToRelative(0.454f, 0.454f, 0.0f, false, false, -0.638f, -0.003f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-3.185f, 3.188f)
                arcToRelative(0.455f, 0.455f, 0.0f, false, false, 0.0f, 0.641f)
                lineToRelative(13.882f, 13.891f)
                arcToRelative(0.457f, 0.457f, 0.0f, false, false, 0.64f, 0.0f)
                lineToRelative(3.187f, -3.188f)
                close()
                moveTo(21.459f, 16.416f)
                curveToRelative(0.246f, 0.247f, 0.384f, 0.577f, 0.384f, 0.927f)
                curveToRelative(0.0f, 0.35f, -0.135f, 0.68f, -0.384f, 0.927f)
                lineToRelative(-3.185f, 3.188f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, true, -0.927f, 0.384f)
                curveToRelative(-0.35f, 0.0f, -0.678f, -0.135f, -0.925f, -0.384f)
                lineTo(2.54f, 7.568f)
                arcToRelative(1.288f, 1.288f, 0.0f, false, true, -0.384f, -0.925f)
                curveToRelative(0.0f, -0.35f, 0.135f, -0.678f, 0.384f, -0.927f)
                lineToRelative(3.185f, -3.188f)
                curveToRelative(0.493f, -0.496f, 1.359f, -0.496f, 1.851f, 0.0f)
                lineTo(21.46f, 16.416f)
                close()
                moveTo(17.989f, 17.696f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.194f, -0.72f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.714f, 0.19f)
                reflectiveCurveToRelative(0.0f, 0.004f, -0.003f, 0.004f)
                arcToRelative(0.525f, 0.525f, 0.0f, true, false, 0.91f, 0.526f)
                close()
                moveTo(18.117f, 16.419f)
                curveToRelative(0.56f, 0.322f, 0.754f, 1.036f, 0.434f, 1.596f)
                arcToRelative(1.172f, 1.172f, 0.0f, false, true, -1.596f, 0.435f)
                arcToRelative(1.166f, 1.166f, 0.0f, false, true, -0.55f, -0.715f)
                arcToRelative(1.168f, 1.168f, 0.0f, false, true, 1.711f, -1.317f)
                close()
            }
        }
        .build()
        return _rulerLight!!
    }

private var _rulerLight: ImageVector? = null
