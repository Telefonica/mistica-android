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

public val FilledGroup.TalkFilled: ImageVector
    get() {
        if (_talkFilled != null) {
            return _talkFilled!!
        }
        _talkFilled = Builder(name = "TalkFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.006f, 15.941f)
                curveToRelative(1.339f, 0.0f, 2.372f, 0.359f, 3.075f, 1.067f)
                curveToRelative(0.703f, 0.71f, 1.06f, 1.746f, 1.06f, 3.09f)
                verticalLineToRelative(1.04f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.561f, 0.56f)
                lineTo(2.56f, 21.698f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0.0f, -1.344f, 0.356f, -2.384f, 1.059f, -3.09f)
                curveToRelative(0.703f, -0.705f, 1.74f, -1.067f, 3.075f, -1.067f)
                horizontalLineToRelative(4.872f)
                close()
                moveTo(8.57f, 7.647f)
                curveToRelative(1.216f, 0.0f, 2.163f, 0.353f, 2.818f, 1.045f)
                curveToRelative(0.617f, 0.653f, 0.93f, 1.563f, 0.93f, 2.703f)
                reflectiveCurveToRelative(-0.313f, 2.05f, -0.93f, 2.703f)
                curveToRelative(-0.655f, 0.692f, -1.605f, 1.045f, -2.818f, 1.045f)
                curveToRelative(-1.215f, 0.0f, -2.162f, -0.35f, -2.817f, -1.045f)
                curveToRelative(-0.62f, -0.653f, -0.93f, -1.563f, -0.93f, -2.703f)
                reflectiveCurveToRelative(0.313f, -2.05f, 0.93f, -2.703f)
                curveToRelative(0.655f, -0.695f, 1.602f, -1.045f, 2.817f, -1.045f)
                close()
                moveTo(20.154f, 2.0f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, true, 1.507f, 1.31f)
                curveToRelative(0.02f, 0.103f, 0.03f, 0.209f, 0.03f, 0.317f)
                lineTo(21.691f, 7.53f)
                curveToRelative(0.0f, 0.891f, -0.722f, 1.614f, -1.613f, 1.614f)
                lineTo(16.79f, 9.144f)
                curveToRelative(-0.314f, 0.496f, -0.978f, 1.54f, -1.11f, 1.74f)
                curveToRelative(-0.29f, 0.445f, -0.705f, 0.714f, -1.08f, 0.714f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.113f, -0.009f)
                curveToRelative(-0.414f, -0.064f, -0.75f, -0.462f, -0.75f, -0.888f)
                lineTo(13.737f, 9.143f)
                horizontalLineToRelative(-0.11f)
                curveToRelative(-0.87f, 0.0f, -1.529f, -0.695f, -1.529f, -1.614f)
                lineTo(12.098f, 3.627f)
                curveToRelative(0.0f, -0.89f, 0.723f, -1.613f, 1.613f, -1.613f)
                horizontalLineToRelative(0.232f)
                curveToRelative(0.067f, -0.01f, 0.136f, -0.014f, 0.205f, -0.014f)
                close()
                moveTo(14.71f, 5.025f)
                arcToRelative(0.547f, 0.547f, 0.0f, true, false, 0.001f, 1.094f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.001f, -1.094f)
                close()
                moveTo(16.895f, 5.025f)
                arcToRelative(0.547f, 0.547f, 0.0f, true, false, 0.001f, 1.094f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.001f, -1.094f)
                close()
                moveTo(19.079f, 5.025f)
                arcToRelative(0.547f, 0.547f, 0.0f, true, false, 0.002f, 1.094f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.002f, -1.094f)
                close()
            }
        }
        .build()
        return _talkFilled!!
    }

private var _talkFilled: ImageVector? = null
