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

public val LightGroup.ArrowDownLight: ImageVector
    get() {
        if (_arrowDownLight != null) {
            return _arrowDownLight!!
        }
        _arrowDownLight = Builder(name = "ArrowDownLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.939f, 21.883f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.154f, 0.0f, -0.297f, -0.07f, -0.426f, -0.204f)
                lineToRelative(-8.93f, -8.967f)
                curveToRelative(-0.38f, -0.361f, -0.52f, -0.854f, -0.355f, -1.258f)
                curveToRelative(0.143f, -0.35f, 0.473f, -0.554f, 0.888f, -0.549f)
                lineTo(6.89f, 10.9f)
                curveToRelative(0.082f, 0.0f, 0.146f, -0.079f, 0.146f, -0.174f)
                lineTo(7.036f, 3.827f)
                curveToRelative(-0.008f, -0.524f, 0.14f, -0.936f, 0.44f, -1.23f)
                curveToRelative(0.31f, -0.305f, 0.778f, -0.456f, 1.353f, -0.44f)
                horizontalLineToRelative(6.218f)
                curveToRelative(0.658f, -0.01f, 1.112f, 0.124f, 1.426f, 0.426f)
                curveToRelative(0.288f, 0.28f, 0.434f, 0.684f, 0.443f, 1.238f)
                verticalLineToRelative(0.006f)
                lineToRelative(-0.003f, 6.902f)
                curveToRelative(0.0f, 0.095f, 0.064f, 0.174f, 0.145f, 0.174f)
                lineToRelative(3.519f, -0.023f)
                curveToRelative(0.523f, -0.017f, 0.991f, 0.244f, 1.165f, 0.653f)
                curveToRelative(0.165f, 0.384f, 0.045f, 0.818f, -0.33f, 1.185f)
                lineToRelative(-8.959f, 8.902f)
                curveToRelative(-0.17f, 0.176f, -0.341f, 0.263f, -0.515f, 0.263f)
                close()
                moveTo(3.096f, 11.493f)
                curveToRelative(-0.163f, 0.0f, -0.277f, 0.065f, -0.325f, 0.183f)
                curveToRelative(-0.056f, 0.134f, -0.03f, 0.372f, 0.218f, 0.608f)
                lineToRelative(0.006f, 0.005f)
                lineToRelative(8.936f, 8.975f)
                lineToRelative(0.005f, 0.006f)
                curveToRelative(0.003f, 0.005f, 0.009f, 0.008f, 0.011f, 0.01f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, 0.087f, -0.075f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(8.96f, -8.907f)
                curveToRelative(0.116f, -0.112f, 0.292f, -0.33f, 0.205f, -0.532f)
                curveToRelative(-0.078f, -0.183f, -0.333f, -0.306f, -0.608f, -0.295f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(-3.524f, 0.023f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.736f, -0.762f)
                lineToRelative(0.002f, -6.9f)
                curveToRelative(-0.005f, -0.386f, -0.092f, -0.655f, -0.263f, -0.82f)
                curveToRelative(-0.19f, -0.185f, -0.521f, -0.269f, -1.008f, -0.26f)
                lineTo(8.813f, 2.749f)
                curveToRelative(-0.286f, -0.009f, -0.678f, 0.03f, -0.924f, 0.271f)
                curveToRelative(-0.18f, 0.177f, -0.27f, 0.446f, -0.264f, 0.801f)
                verticalLineToRelative(6.908f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.736f, 0.762f)
                lineToRelative(-3.782f, 0.005f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(0.003f, -0.002f, -0.002f, -0.002f, -0.005f, -0.002f)
                close()
            }
        }
        .build()
        return _arrowDownLight!!
    }

private var _arrowDownLight: ImageVector? = null
