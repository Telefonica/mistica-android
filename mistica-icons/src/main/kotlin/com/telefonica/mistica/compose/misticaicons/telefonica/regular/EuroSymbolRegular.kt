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

public val RegularGroup.EuroSymbolRegular: ImageVector
    get() {
        if (_euroSymbolRegular != null) {
            return _euroSymbolRegular!!
        }
        _euroSymbolRegular = Builder(name = "EuroSymbolRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.667f, 18.846f)
                curveToRelative(-1.084f, 0.538f, -2.443f, 0.81f, -4.034f, 0.81f)
                curveToRelative(-3.812f, 0.0f, -6.126f, -1.494f, -7.02f, -4.527f)
                horizontalLineToRelative(5.519f)
                curveToRelative(0.515f, 0.0f, 0.935f, -0.44f, 0.935f, -0.986f)
                curveToRelative(0.0f, -0.544f, -0.417f, -0.986f, -0.935f, -0.986f)
                horizontalLineTo(7.266f)
                curveToRelative(-0.04f, -0.434f, -0.081f, -0.863f, -0.081f, -1.342f)
                curveToRelative(0.0f, -0.207f, 0.028f, -0.386f, 0.036f, -0.588f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.516f, 0.0f, 0.936f, -0.44f, 0.936f, -0.986f)
                reflectiveCurveToRelative(-0.417f, -0.986f, -0.935f, -0.986f)
                horizontalLineTo(7.45f)
                curveToRelative(0.723f, -3.53f, 3.073f, -5.286f, 7.182f, -5.286f)
                curveToRelative(1.574f, 0.0f, 2.916f, 0.266f, 3.994f, 0.79f)
                curveToRelative(0.471f, 0.23f, 1.026f, 0.014f, 1.244f, -0.479f)
                curveToRelative(0.216f, -0.493f, 0.014f, -1.078f, -0.456f, -1.308f)
                curveTo(18.09f, 2.325f, 16.479f, 2.0f, 14.633f, 2.0f)
                curveToRelative(-5.143f, 0.0f, -8.3f, 2.557f, -9.106f, 7.255f)
                horizontalLineTo(3.936f)
                curveToRelative(-0.516f, 0.0f, -0.936f, 0.44f, -0.936f, 0.986f)
                reflectiveCurveToRelative(0.42f, 0.986f, 0.936f, 0.986f)
                horizontalLineToRelative(1.397f)
                curveToRelative(-0.005f, 0.196f, -0.02f, 0.386f, -0.02f, 0.588f)
                curveToRelative(0.0f, 0.465f, 0.023f, 0.908f, 0.06f, 1.342f)
                horizontalLineTo(3.936f)
                curveToRelative(-0.516f, 0.0f, -0.936f, 0.44f, -0.936f, 0.986f)
                curveToRelative(0.0f, 0.543f, 0.42f, 0.986f, 0.936f, 0.986f)
                horizontalLineToRelative(1.736f)
                curveToRelative(1.006f, 4.216f, 4.098f, 6.496f, 8.958f, 6.496f)
                curveToRelative(1.871f, 0.0f, 3.496f, -0.336f, 4.832f, -0.998f)
                curveToRelative(0.468f, -0.232f, 0.67f, -0.817f, 0.448f, -1.31f)
                curveToRelative(-0.218f, -0.493f, -0.773f, -0.706f, -1.243f, -0.471f)
            }
        }
        .build()
        return _euroSymbolRegular!!
    }

private var _euroSymbolRegular: ImageVector? = null
