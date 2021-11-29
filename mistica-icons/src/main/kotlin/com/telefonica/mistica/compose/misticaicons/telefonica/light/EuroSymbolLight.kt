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

public val LightGroup.EuroSymbolLight: ImageVector
    get() {
        if (_euroSymbolLight != null) {
            return _euroSymbolLight!!
        }
        _euroSymbolLight = Builder(name = "EuroSymbolLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.447f, 19.91f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, -0.863f, -0.325f)
                curveToRelative(-1.171f, 0.577f, -2.63f, 0.868f, -4.336f, 0.868f)
                curveToRelative(-4.25f, 0.0f, -6.81f, -1.823f, -7.695f, -5.372f)
                horizontalLineToRelative(6.134f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, false, 0.65f, -0.681f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, false, -0.65f, -0.68f)
                horizontalLineToRelative(-6.4f)
                arcToRelative(14.617f, 14.617f, 0.0f, false, true, -0.112f, -1.732f)
                curveToRelative(0.0f, -0.336f, 0.042f, -0.63f, 0.061f, -0.95f)
                horizontalLineToRelative(6.449f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, false, 0.65f, -0.677f)
                verticalLineToRelative(-0.003f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, false, -0.65f, -0.68f)
                horizontalLineTo(7.376f)
                curveToRelative(0.69f, -4.076f, 3.317f, -6.16f, 7.872f, -6.16f)
                curveToRelative(1.686f, 0.0f, 3.128f, 0.288f, 4.294f, 0.851f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, false, 0.863f, -0.33f)
                arcToRelative(0.699f, 0.699f, 0.0f, false, false, -0.317f, -0.905f)
                curveToRelative(-1.339f, -0.65f, -2.966f, -0.978f, -4.84f, -0.978f)
                curveToRelative(-5.26f, 0.0f, -8.46f, 2.65f, -9.202f, 7.521f)
                horizontalLineTo(4.119f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, false, -0.65f, 0.68f)
                curveToRelative(0.0f, 0.376f, 0.291f, 0.682f, 0.65f, 0.682f)
                horizontalLineToRelative(1.79f)
                curveToRelative(-0.017f, 0.308f, -0.034f, 0.621f, -0.034f, 0.95f)
                curveToRelative(0.0f, 0.607f, 0.04f, 1.176f, 0.098f, 1.73f)
                horizontalLineTo(4.12f)
                arcToRelative(0.666f, 0.666f, 0.0f, false, false, -0.65f, 0.68f)
                curveToRelative(0.0f, 0.376f, 0.291f, 0.682f, 0.65f, 0.682f)
                horizontalLineToRelative(2.059f)
                curveToRelative(0.927f, 4.417f, 4.01f, 6.734f, 9.067f, 6.734f)
                curveToRelative(1.899f, 0.0f, 3.546f, -0.337f, 4.888f, -1.0f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, false, 0.314f, -0.905f)
            }
        }
        .build()
        return _euroSymbolLight!!
    }

private var _euroSymbolLight: ImageVector? = null
