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

public val FilledGroup.ControlsFilled: ImageVector
    get() {
        if (_controlsFilled != null) {
            return _controlsFilled!!
        }
        _controlsFilled = Builder(name = "ControlsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.627f, 6.374f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, -0.591f)
                curveToRelative(0.0f, -0.325f, 0.27f, -0.588f, 0.602f, -0.588f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 0.396f, -0.984f)
                arcToRelative(2.996f, 2.996f, 0.0f, false, true, 1.88f, -1.3f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, 2.265f, 0.382f)
                arcToRelative(2.912f, 2.912f, 0.0f, false, true, 1.328f, 1.84f)
                curveToRelative(0.006f, 0.02f, 0.003f, 0.042f, 0.006f, 0.062f)
                horizontalLineToRelative(11.504f)
                curveToRelative(0.33f, 0.0f, 0.602f, 0.266f, 0.602f, 0.59f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, 0.592f)
                lineTo(9.555f, 6.377f)
                curveToRelative(-0.07f, 0.35f, -0.205f, 0.68f, -0.398f, 0.98f)
                arcToRelative(2.967f, 2.967f, 0.0f, false, true, -1.88f, 1.3f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -2.266f, -0.381f)
                arcToRelative(2.938f, 2.938f, 0.0f, false, true, -1.328f, -1.84f)
                curveToRelative(-0.005f, -0.02f, -0.005f, -0.04f, -0.008f, -0.062f)
                lineTo(2.627f, 6.374f)
                close()
                moveTo(21.034f, 11.506f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.263f, 0.602f, 0.59f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, true, -0.602f, 0.589f)
                horizontalLineToRelative(-1.082f)
                curveToRelative(-0.277f, 1.342f, -1.493f, 2.356f, -2.944f, 2.356f)
                curveToRelative(-1.45f, 0.0f, -2.663f, -1.014f, -2.944f, -2.356f)
                lineTo(2.602f, 12.685f)
                arcTo(0.597f, 0.597f, 0.0f, false, true, 2.0f, 12.094f)
                curveToRelative(0.0f, -0.325f, 0.269f, -0.591f, 0.602f, -0.591f)
                horizontalLineToRelative(11.46f)
                curveToRelative(0.28f, -1.342f, 1.493f, -2.356f, 2.944f, -2.356f)
                curveToRelative(1.45f, 0.0f, 2.666f, 1.014f, 2.944f, 2.356f)
                horizontalLineToRelative(1.084f)
                verticalLineToRelative(0.003f)
                close()
                moveTo(21.031f, 17.803f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.263f, 0.602f, 0.59f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, 0.592f)
                horizontalLineToRelative(-8.782f)
                curveToRelative(-0.28f, 1.341f, -1.493f, 2.355f, -2.944f, 2.355f)
                curveToRelative(-1.45f, 0.0f, -2.664f, -1.014f, -2.944f, -2.355f)
                lineTo(2.602f, 18.985f)
                arcTo(0.597f, 0.597f, 0.0f, false, true, 2.0f, 18.394f)
                curveToRelative(0.0f, -0.325f, 0.269f, -0.589f, 0.602f, -0.589f)
                horizontalLineToRelative(3.76f)
                curveToRelative(0.28f, -1.341f, 1.492f, -2.355f, 2.943f, -2.355f)
                reflectiveCurveToRelative(2.664f, 1.014f, 2.944f, 2.355f)
                lineToRelative(8.782f, -0.002f)
                close()
            }
        }
        .build()
        return _controlsFilled!!
    }

private var _controlsFilled: ImageVector? = null
