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

public val FilledGroup.PodiumFilled: ImageVector
    get() {
        if (_podiumFilled != null) {
            return _podiumFilled!!
        }
        _podiumFilled = Builder(name = "PodiumFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.773f, 16.2f)
                curveToRelative(0.622f, 0.0f, 1.073f, 0.335f, 1.073f, 0.798f)
                verticalLineToRelative(4.022f)
                curveToRelative(0.0f, 0.47f, -0.442f, 0.82f, -1.075f, 0.82f)
                horizontalLineToRelative(-3.852f)
                lineTo(16.919f, 16.2f)
                horizontalLineToRelative(3.854f)
                close()
                moveTo(2.16f, 14.72f)
                curveToRelative(0.0f, -0.554f, 0.557f, -0.899f, 1.073f, -0.899f)
                horizontalLineToRelative(3.851f)
                verticalLineToRelative(8.02f)
                lineTo(3.233f, 21.841f)
                curveToRelative(-0.591f, 0.0f, -1.073f, -0.423f, -1.073f, -0.92f)
                verticalLineToRelative(-6.2f)
                close()
                moveTo(14.622f, 10.787f)
                curveToRelative(0.572f, 0.0f, 1.073f, 0.48f, 1.073f, 1.028f)
                verticalLineToRelative(10.031f)
                horizontalLineToRelative(-7.38f)
                lineTo(8.315f, 11.818f)
                curveToRelative(0.0f, -0.546f, 0.5f, -1.025f, 1.072f, -1.025f)
                horizontalLineToRelative(5.235f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(10.9f, 4.933f)
                lineToRelative(-1.196f, 0.182f)
                lineToRelative(0.888f, 0.986f)
                curveToRelative(0.138f, 0.14f, 0.208f, 0.364f, 0.174f, 0.558f)
                lineToRelative(-0.21f, 1.283f)
                lineToRelative(1.129f, -0.558f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, true, 0.622f, 0.014f)
                lineToRelative(1.084f, 0.594f)
                lineToRelative(0.002f, 0.003f)
                reflectiveCurveToRelative(0.003f, 0.0f, 0.006f, -0.003f)
                lineToRelative(-0.196f, -1.333f)
                arcToRelative(0.675f, 0.675f, 0.0f, false, true, 0.193f, -0.575f)
                lineToRelative(0.877f, -0.89f)
                lineToRelative(-1.244f, -0.266f)
                arcToRelative(0.643f, 0.643f, 0.0f, false, true, -0.47f, -0.345f)
                lineTo(12.0f, 3.403f)
                lineToRelative(-0.585f, 1.169f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, true, -0.516f, 0.361f)
                close()
                moveTo(9.507f, 6.751f)
                lineToRelative(-0.683f, -0.695f)
                arcToRelative(1.274f, 1.274f, 0.0f, false, true, -0.297f, -1.308f)
                curveToRelative(0.148f, -0.45f, 0.532f, -0.776f, 0.994f, -0.846f)
                lineToRelative(0.922f, -0.14f)
                lineToRelative(0.417f, -0.882f)
                curveToRelative(0.21f, -0.443f, 0.642f, -0.72f, 1.126f, -0.72f)
                curveToRelative(0.482f, 0.0f, 0.913f, 0.275f, 1.124f, 0.72f)
                lineToRelative(0.42f, 0.885f)
                lineToRelative(0.921f, 0.137f)
                curveToRelative(0.465f, 0.07f, 0.849f, 0.398f, 1.0f, 0.849f)
                curveToRelative(0.152f, 0.465f, 0.037f, 0.964f, -0.302f, 1.308f)
                lineToRelative(-0.684f, 0.698f)
                lineToRelative(0.163f, 0.991f)
                arcTo(1.292f, 1.292f, 0.0f, false, true, 14.11f, 9.0f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, true, -1.306f, 0.076f)
                lineToRelative(-0.608f, -0.333f)
                lineToRelative(-0.21f, -0.115f)
                lineToRelative(-0.21f, 0.115f)
                lineToRelative(-0.605f, 0.333f)
                arcTo(1.242f, 1.242f, 0.0f, false, true, 9.6f, 8.743f)
                arcToRelative(1.276f, 1.276f, 0.0f, false, true, -0.25f, -0.995f)
                lineToRelative(0.157f, -0.997f)
                close()
            }
        }
        .build()
        return _podiumFilled!!
    }

private var _podiumFilled: ImageVector? = null
