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

public val LightGroup.ArrowRightLight: ImageVector
    get() {
        if (_arrowRightLight != null) {
            return _arrowRightLight!!
        }
        _arrowRightLight = Builder(name = "ArrowRightLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.805f, 21.814f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, true, -0.35f, -0.067f)
                curveToRelative(-0.35f, -0.143f, -0.555f, -0.473f, -0.55f, -0.888f)
                lineTo(10.9f, 17.08f)
                curveToRelative(0.0f, -0.081f, -0.079f, -0.145f, -0.174f, -0.145f)
                lineTo(3.827f, 16.935f)
                curveToRelative(-0.524f, 0.008f, -0.936f, -0.14f, -1.23f, -0.44f)
                curveToRelative(-0.305f, -0.311f, -0.456f, -0.779f, -0.44f, -1.353f)
                lineTo(2.157f, 8.923f)
                curveToRelative(-0.01f, -0.66f, 0.124f, -1.112f, 0.426f, -1.425f)
                curveToRelative(0.28f, -0.289f, 0.684f, -0.435f, 1.238f, -0.443f)
                horizontalLineToRelative(0.006f)
                lineToRelative(6.902f, 0.003f)
                curveToRelative(0.095f, 0.0f, 0.174f, -0.065f, 0.174f, -0.146f)
                lineToRelative(-0.023f, -3.518f)
                curveToRelative(-0.017f, -0.524f, 0.244f, -0.992f, 0.653f, -1.165f)
                curveToRelative(0.384f, -0.166f, 0.818f, -0.045f, 1.185f, 0.33f)
                lineToRelative(8.904f, 8.958f)
                curveToRelative(0.18f, 0.174f, 0.267f, 0.345f, 0.264f, 0.518f)
                curveToRelative(0.0f, 0.154f, -0.07f, 0.297f, -0.205f, 0.426f)
                lineToRelative(-8.974f, 8.93f)
                curveToRelative(-0.261f, 0.275f, -0.589f, 0.423f, -0.902f, 0.423f)
                close()
                moveTo(3.825f, 16.344f)
                horizontalLineToRelative(6.901f)
                curveToRelative(0.42f, 0.0f, 0.762f, 0.33f, 0.762f, 0.736f)
                lineToRelative(0.006f, 3.782f)
                verticalLineToRelative(0.005f)
                curveToRelative(-0.003f, 0.168f, 0.061f, 0.289f, 0.182f, 0.336f)
                curveToRelative(0.134f, 0.054f, 0.372f, 0.031f, 0.608f, -0.218f)
                curveToRelative(0.002f, -0.003f, 0.002f, -0.006f, 0.005f, -0.006f)
                lineToRelative(8.975f, -8.935f)
                lineToRelative(0.006f, -0.006f)
                curveToRelative(0.005f, -0.003f, 0.008f, -0.008f, 0.01f, -0.011f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.075f, -0.087f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-8.907f, -8.96f)
                curveToRelative(-0.112f, -0.115f, -0.33f, -0.292f, -0.532f, -0.205f)
                curveToRelative(-0.183f, 0.079f, -0.306f, 0.333f, -0.295f, 0.608f)
                verticalLineToRelative(0.008f)
                lineToRelative(0.023f, 3.524f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.762f, 0.737f)
                lineToRelative(-6.9f, -0.003f)
                curveToRelative(-0.386f, 0.006f, -0.655f, 0.093f, -0.82f, 0.263f)
                curveToRelative(-0.185f, 0.19f, -0.269f, 0.521f, -0.26f, 1.009f)
                verticalLineToRelative(6.243f)
                curveToRelative(-0.009f, 0.286f, 0.03f, 0.678f, 0.271f, 0.925f)
                curveToRelative(0.177f, 0.18f, 0.446f, 0.269f, 0.801f, 0.263f)
                curveToRelative(0.0f, -0.005f, 0.0f, -0.005f, 0.003f, -0.005f)
                close()
            }
        }
        .build()
        return _arrowRightLight!!
    }

private var _arrowRightLight: ImageVector? = null
