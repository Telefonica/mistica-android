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

public val LightGroup.HeartLight: ImageVector
    get() {
        if (_heartLight != null) {
            return _heartLight!!
        }
        _heartLight = Builder(name = "HeartLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.458f, 1.0f)
                curveTo(19.715f, 1.0f, 22.0f, 2.642f, 22.0f, 5.78f)
                curveToRelative(0.0f, 2.318f, -1.285f, 5.258f, -3.934f, 8.988f)
                curveToRelative(-0.004f, 0.004f, -0.004f, 0.008f, -0.008f, 0.012f)
                lineToRelative(-2.657f, 3.448f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, -0.504f, 0.055f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, -0.052f, -0.53f)
                lineToRelative(2.653f, -3.443f)
                curveToRelative(2.513f, -3.54f, 3.786f, -6.414f, 3.786f, -8.535f)
                curveToRelative(0.0f, -2.646f, -1.925f, -4.032f, -3.826f, -4.032f)
                curveToRelative(-1.725f, 0.0f, -2.881f, 0.542f, -5.17f, 3.751f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, true, -0.288f, 0.151f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.288f, -0.151f)
                curveToRelative(-2.253f, -3.15f, -3.618f, -3.75f, -5.346f, -3.75f)
                curveToRelative(-1.761f, 0.0f, -3.654f, 1.26f, -3.654f, 4.027f)
                curveToRelative(0.0f, 4.822f, 6.447f, 12.096f, 9.548f, 15.59f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, -0.02f, 0.53f)
                arcTo(0.309f, 0.309f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, -0.26f, -0.122f)
                curveToRelative(-1.513f, -1.705f, -4.046f, -4.561f, -6.103f, -7.535f)
                curveTo(3.188f, 10.811f, 2.0f, 8.01f, 2.0f, 5.78f)
                curveToRelative(0.0f, -1.454f, 0.46f, -2.684f, 1.333f, -3.554f)
                curveTo(4.125f, 1.436f, 5.2f, 1.0f, 6.37f, 1.0f)
                curveToRelative(2.157f, 0.0f, 3.617f, 0.932f, 5.63f, 3.654f)
                curveTo(14.049f, 1.865f, 15.365f, 1.0f, 17.458f, 1.0f)
                close()
                moveTo(13.781f, 18.997f)
                curveToRelative(0.396f, 0.004f, 0.716f, 0.34f, 0.716f, 0.752f)
                curveToRelative(0.0f, 0.411f, -0.32f, 0.752f, -0.716f, 0.752f)
                curveToRelative(-0.396f, 0.0f, -0.717f, -0.336f, -0.717f, -0.752f)
                reflectiveCurveToRelative(0.32f, -0.752f, 0.717f, -0.752f)
                close()
            }
        }
        .build()
        return _heartLight!!
    }

private var _heartLight: ImageVector? = null
