package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ClipRegular: ImageVector
    get() {
        if (_clipRegular != null) {
            return _clipRegular!!
        }
        _clipRegular = Builder(name = "ClipRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.363f, 21.836f)
                curveToRelative(-2.863f, 0.0f, -4.507f, -1.563f, -4.507f, -4.291f)
                verticalLineTo(5.305f)
                curveToRelative(0.0f, -2.004f, 1.207f, -3.155f, 3.31f, -3.155f)
                curveToRelative(2.104f, 0.0f, 3.312f, 1.148f, 3.312f, 3.154f)
                lineToRelative(0.025f, 11.053f)
                curveToRelative(0.0f, 1.166f, -0.76f, 1.888f, -1.98f, 1.888f)
                curveToRelative(-1.222f, 0.0f, -1.981f, -0.722f, -1.981f, -1.885f)
                verticalLineTo(6.28f)
                curveToRelative(0.0f, -0.34f, 0.289f, -0.61f, 0.641f, -0.61f)
                curveToRelative(0.356f, 0.0f, 0.642f, 0.274f, 0.642f, 0.61f)
                verticalLineToRelative(10.078f)
                curveToRelative(0.0f, 0.496f, 0.176f, 0.661f, 0.695f, 0.661f)
                curveToRelative(0.52f, 0.0f, 0.694f, -0.165f, 0.694f, -0.66f)
                lineToRelative(-0.028f, -11.054f)
                curveToRelative(0.0f, -1.316f, -0.644f, -1.93f, -2.025f, -1.93f)
                curveToRelative(-1.38f, 0.0f, -2.025f, 0.614f, -2.025f, 1.93f)
                verticalLineToRelative(12.241f)
                curveToRelative(0.0f, 2.064f, 1.053f, 3.067f, 3.221f, 3.067f)
                reflectiveCurveToRelative(3.221f, -1.003f, 3.221f, -3.067f)
                lineToRelative(0.012f, -11.32f)
                curveToRelative(0.0f, -0.338f, 0.288f, -0.61f, 0.641f, -0.61f)
                curveToRelative(0.356f, 0.0f, 0.642f, 0.274f, 0.642f, 0.613f)
                lineToRelative(-0.012f, 11.32f)
                curveToRelative(0.009f, 2.725f, -1.636f, 4.288f, -4.498f, 4.288f)
            }
        }
        .build()
        return _clipRegular!!
    }

private var _clipRegular: ImageVector? = null
