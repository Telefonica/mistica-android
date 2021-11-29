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

public val LightGroup.ArrowUpLight: ImageVector
    get() {
        if (_arrowUpLight != null) {
            return _arrowUpLight!!
        }
        _arrowUpLight = Builder(name = "ArrowUpLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.842f, 21.882f)
                curveToRelative(-0.616f, 0.0f, -1.045f, -0.138f, -1.344f, -0.426f)
                curveToRelative(-0.289f, -0.28f, -0.435f, -0.684f, -0.443f, -1.238f)
                verticalLineToRelative(-0.006f)
                lineToRelative(0.003f, -6.902f)
                curveToRelative(0.0f, -0.095f, -0.065f, -0.173f, -0.146f, -0.173f)
                lineToRelative(-3.518f, 0.022f)
                curveToRelative(-0.524f, 0.017f, -0.992f, -0.244f, -1.165f, -0.653f)
                curveToRelative(-0.166f, -0.383f, -0.045f, -0.818f, 0.33f, -1.184f)
                lineTo(11.52f, 2.42f)
                curveToRelative(0.174f, -0.177f, 0.342f, -0.264f, 0.515f, -0.264f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.154f, 0.0f, 0.297f, 0.07f, 0.426f, 0.205f)
                lineToRelative(8.93f, 8.966f)
                curveToRelative(0.378f, 0.361f, 0.518f, 0.854f, 0.356f, 1.255f)
                curveToRelative(-0.14f, 0.345f, -0.465f, 0.549f, -0.874f, 0.549f)
                horizontalLineToRelative(-0.017f)
                lineToRelative(-3.779f, 0.006f)
                curveToRelative(-0.081f, 0.0f, -0.145f, 0.078f, -0.145f, 0.173f)
                verticalLineToRelative(6.9f)
                curveToRelative(0.008f, 0.523f, -0.14f, 0.935f, -0.44f, 1.23f)
                curveToRelative(-0.311f, 0.304f, -0.779f, 0.456f, -1.353f, 0.439f)
                lineTo(8.923f, 21.879f)
                curveToRelative(-0.025f, 0.0f, -0.053f, 0.003f, -0.08f, 0.003f)
                close()
                moveTo(7.646f, 20.209f)
                curveToRelative(0.006f, 0.387f, 0.093f, 0.656f, 0.263f, 0.821f)
                curveToRelative(0.19f, 0.185f, 0.521f, 0.27f, 1.009f, 0.26f)
                horizontalLineToRelative(6.24f)
                curveToRelative(0.286f, 0.01f, 0.679f, -0.03f, 0.925f, -0.271f)
                curveToRelative(0.18f, -0.176f, 0.269f, -0.445f, 0.263f, -0.801f)
                lineTo(16.346f, 13.31f)
                curveToRelative(0.0f, -0.42f, 0.33f, -0.762f, 0.737f, -0.762f)
                lineToRelative(3.782f, -0.005f)
                horizontalLineToRelative(0.014f)
                curveToRelative(0.162f, 0.0f, 0.277f, -0.065f, 0.327f, -0.182f)
                curveToRelative(0.054f, -0.135f, 0.031f, -0.373f, -0.218f, -0.608f)
                curveToRelative(-0.003f, -0.003f, -0.006f, -0.003f, -0.006f, -0.006f)
                lineToRelative(-8.938f, -8.975f)
                lineToRelative(-0.006f, -0.005f)
                curveToRelative(-0.003f, -0.006f, -0.008f, -0.009f, -0.011f, -0.011f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.087f, 0.075f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-8.96f, 8.908f)
                curveToRelative(-0.115f, 0.112f, -0.292f, 0.33f, -0.205f, 0.532f)
                curveToRelative(0.079f, 0.182f, 0.333f, 0.305f, 0.608f, 0.294f)
                horizontalLineToRelative(0.008f)
                lineToRelative(3.524f, -0.022f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.737f, 0.762f)
                lineToRelative(-0.003f, 6.901f)
                close()
            }
        }
        .build()
        return _arrowUpLight!!
    }

private var _arrowUpLight: ImageVector? = null
