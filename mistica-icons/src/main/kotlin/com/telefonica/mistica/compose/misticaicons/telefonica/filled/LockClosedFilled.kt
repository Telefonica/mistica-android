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

public val FilledGroup.LockClosedFilled: ImageVector
    get() {
        if (_lockClosedFilled != null) {
            return _lockClosedFilled!!
        }
        _lockClosedFilled = Builder(name = "LockClosedFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.738f, 2.02f)
                curveToRelative(2.656f, 0.0f, 4.815f, 2.028f, 4.815f, 4.52f)
                verticalLineToRelative(2.552f)
                curveToRelative(0.505f, 0.136f, 0.93f, 0.366f, 1.272f, 0.687f)
                curveToRelative(0.619f, 0.577f, 0.938f, 1.425f, 0.952f, 2.52f)
                verticalLineToRelative(6.096f)
                curveToRelative(-0.014f, 1.092f, -0.336f, 1.941f, -0.952f, 2.52f)
                curveToRelative(-0.591f, 0.556f, -1.431f, 0.836f, -2.499f, 0.836f)
                lineTo(7.934f, 21.751f)
                curveToRelative(-1.067f, 0.0f, -1.907f, -0.283f, -2.496f, -0.838f)
                curveToRelative(-0.616f, -0.58f, -0.93f, -1.431f, -0.93f, -2.526f)
                lineToRelative(0.003f, -5.645f)
                verticalLineToRelative(-0.197f)
                lineToRelative(-0.002f, -0.179f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0.0f, -1.096f, 0.313f, -1.945f, 0.93f, -2.527f)
                curveToRelative(0.345f, -0.327f, 0.779f, -0.559f, 1.294f, -0.695f)
                lineTo(6.733f, 6.541f)
                curveToRelative(0.0f, -2.493f, 2.16f, -4.521f, 4.815f, -4.521f)
                horizontalLineToRelative(0.19f)
                close()
                moveTo(11.648f, 14.535f)
                curveToRelative(-0.52f, 0.0f, -0.938f, 0.148f, -1.243f, 0.443f)
                curveToRelative(-0.317f, 0.305f, -0.476f, 0.736f, -0.476f, 1.28f)
                curveToRelative(0.0f, 0.543f, 0.16f, 0.974f, 0.476f, 1.28f)
                curveToRelative(0.305f, 0.294f, 0.722f, 0.442f, 1.243f, 0.442f)
                curveToRelative(0.521f, 0.0f, 0.939f, -0.148f, 1.244f, -0.442f)
                curveToRelative(0.32f, -0.306f, 0.476f, -0.737f, 0.476f, -1.28f)
                curveToRelative(0.0f, -0.544f, -0.157f, -0.975f, -0.476f, -1.28f)
                curveToRelative(-0.305f, -0.295f, -0.723f, -0.443f, -1.244f, -0.443f)
                close()
                moveTo(11.738f, 3.179f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-2.017f, 0.0f, -3.656f, 1.507f, -3.656f, 3.362f)
                verticalLineToRelative(2.4f)
                lineTo(15.395f, 8.941f)
                lineToRelative(-0.002f, -2.4f)
                curveToRelative(0.0f, -1.852f, -1.64f, -3.362f, -3.656f, -3.362f)
                close()
            }
        }
        .build()
        return _lockClosedFilled!!
    }

private var _lockClosedFilled: ImageVector? = null
