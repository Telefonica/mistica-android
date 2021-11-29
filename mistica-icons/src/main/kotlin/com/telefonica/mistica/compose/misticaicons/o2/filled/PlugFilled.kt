package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.PlugFilled: ImageVector
    get() {
        if (_plugFilled != null) {
            return _plugFilled!!
        }
        _plugFilled = Builder(name = "PlugFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.695f)
                curveToRelative(0.0f, -2.54f, -1.997f, -4.615f, -4.443f, -4.615f)
                curveToRelative(-2.445f, 0.0f, -4.442f, 2.075f, -4.442f, 4.615f)
                verticalLineToRelative(7.695f)
                curveToRelative(0.0f, 1.654f, -1.481f, 3.076f, -3.146f, 3.076f)
                curveToRelative(-1.63f, 0.0f, -2.962f, -1.384f, -2.962f, -3.076f)
                verticalLineToRelative(-1.925f)
                curveToRelative(2.03f, -0.387f, 3.51f, -2.232f, 3.51f, -4.423f)
                verticalLineTo(5.845f)
                horizontalLineTo(8.852f)
                verticalLineTo(2.77f)
                curveToRelative(0.0f, -0.424f, -0.332f, -0.769f, -0.74f, -0.769f)
                curveToRelative(-0.409f, 0.0f, -0.74f, 0.345f, -0.74f, 0.77f)
                verticalLineToRelative(3.075f)
                horizontalLineTo(5.145f)
                verticalLineTo(2.77f)
                curveToRelative(0.0f, -0.424f, -0.332f, -0.769f, -0.74f, -0.769f)
                curveToRelative(-0.409f, 0.0f, -0.741f, 0.345f, -0.741f, 0.77f)
                verticalLineToRelative(3.075f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(5.193f)
                curveToRelative(0.0f, 2.19f, 1.48f, 4.04f, 3.518f, 4.423f)
                verticalLineToRelative(1.925f)
                curveToRelative(0.0f, 2.54f, 1.997f, 4.614f, 4.443f, 4.614f)
                curveToRelative(2.517f, 0.0f, 4.63f, -2.116f, 4.63f, -4.614f)
                verticalLineTo(9.695f)
                curveToRelative(0.0f, -1.692f, 1.333f, -3.076f, 2.962f, -3.076f)
                curveToRelative(1.63f, 0.0f, 2.962f, 1.384f, 2.962f, 3.076f)
                verticalLineToRelative(7.308f)
                curveToRelative(0.0f, 0.424f, 0.332f, 0.77f, 0.74f, 0.77f)
                curveToRelative(0.409f, 0.0f, 0.741f, -0.346f, 0.741f, -0.77f)
                verticalLineTo(9.695f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _plugFilled!!
    }

private var _plugFilled: ImageVector? = null
