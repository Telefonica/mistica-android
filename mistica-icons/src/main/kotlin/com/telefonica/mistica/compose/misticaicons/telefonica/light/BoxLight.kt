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

public val LightGroup.BoxLight: ImageVector
    get() {
        if (_boxLight != null) {
            return _boxLight!!
        }
        _boxLight = Builder(name = "BoxLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.85f, 20.338f)
                curveToRelative(0.0f, 0.367f, -0.285f, 0.667f, -0.635f, 0.667f)
                lineTo(3.781f, 21.005f)
                curveToRelative(-0.347f, 0.0f, -0.633f, -0.3f, -0.633f, -0.667f)
                lineTo(3.148f, 8.646f)
                curveToRelative(0.0f, -0.367f, 0.286f, -0.666f, 0.633f, -0.666f)
                horizontalLineToRelative(5.417f)
                verticalLineToRelative(2.72f)
                curveToRelative(0.0f, 0.23f, 0.222f, 0.417f, 0.496f, 0.417f)
                horizontalLineToRelative(4.286f)
                curveToRelative(0.274f, 0.0f, 0.496f, -0.188f, 0.496f, -0.417f)
                lineToRelative(-0.003f, -2.72f)
                horizontalLineToRelative(5.745f)
                curveToRelative(0.35f, 0.0f, 0.636f, 0.3f, 0.636f, 0.666f)
                verticalLineToRelative(11.692f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(4.583f, 3.476f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.014f, -0.098f)
                curveToRelative(0.0f, -0.213f, 0.205f, -0.387f, 0.46f, -0.387f)
                horizontalLineToRelative(4.638f)
                lineToRelative(-0.44f, 4.151f)
                lineTo(3.781f, 7.142f)
                curveToRelative(-0.084f, 0.0f, -0.163f, 0.011f, -0.241f, 0.023f)
                lineToRelative(1.042f, -3.69f)
                close()
                moveTo(13.485f, 10.282f)
                lineTo(10.19f, 10.282f)
                lineToRelative(-0.003f, -2.302f)
                horizontalLineToRelative(3.297f)
                verticalLineToRelative(2.302f)
                close()
                moveTo(12.891f, 2.997f)
                lineTo(13.421f, 7.142f)
                horizontalLineToRelative(-3.174f)
                lineToRelative(0.44f, -4.145f)
                horizontalLineToRelative(2.204f)
                close()
                moveTo(19.421f, 3.478f)
                lineTo(20.493f, 7.17f)
                arcToRelative(1.547f, 1.547f, 0.0f, false, false, -0.277f, -0.025f)
                horizontalLineToRelative(-5.801f)
                lineToRelative(-0.527f, -4.151f)
                horizontalLineToRelative(5.06f)
                curveToRelative(0.251f, 0.0f, 0.456f, 0.173f, 0.456f, 0.386f)
                curveToRelative(0.0f, 0.034f, 0.005f, 0.068f, 0.017f, 0.098f)
                close()
                moveTo(21.81f, 8.181f)
                lineTo(20.393f, 3.324f)
                curveToRelative(-0.031f, -0.65f, -0.67f, -1.168f, -1.449f, -1.168f)
                lineTo(5.055f, 2.156f)
                curveToRelative(-0.781f, 0.0f, -1.417f, 0.518f, -1.45f, 1.168f)
                lineTo(2.231f, 8.181f)
                curveToRelative(-0.003f, 0.012f, 0.0f, 0.026f, -0.003f, 0.037f)
                curveToRelative(-0.045f, 0.14f, -0.07f, 0.283f, -0.073f, 0.428f)
                verticalLineToRelative(11.692f)
                curveToRelative(0.0f, 0.83f, 0.729f, 1.505f, 1.625f, 1.505f)
                horizontalLineToRelative(16.437f)
                curveToRelative(0.896f, 0.0f, 1.625f, -0.676f, 1.625f, -1.505f)
                lineTo(21.842f, 8.646f)
                curveToRelative(0.0f, -0.1f, -0.012f, -0.196f, -0.031f, -0.288f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.003f, -0.177f)
                close()
            }
        }
        .build()
        return _boxLight!!
    }

private var _boxLight: ImageVector? = null
