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

public val FilledGroup.DollarSymbolFilled: ImageVector
    get() {
        if (_dollarSymbolFilled != null) {
            return _dollarSymbolFilled!!
        }
        _dollarSymbolFilled = Builder(name = "DollarSymbolFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.454f, 16.731f)
                arcToRelative(2.757f, 2.757f, 0.0f, false, true, -1.017f, 0.672f)
                verticalLineToRelative(-4.165f)
                curveToRelative(0.244f, 0.059f, 0.485f, 0.118f, 0.686f, 0.219f)
                curveToRelative(0.675f, 0.333f, 0.897f, 0.88f, 0.967f, 1.28f)
                curveToRelative(0.12f, 0.683f, -0.126f, 1.448f, -0.636f, 1.994f)
                moveToRelative(-4.42f, -7.078f)
                curveToRelative(-0.314f, -0.345f, -0.446f, -0.785f, -0.393f, -1.303f)
                curveToRelative(0.079f, -0.717f, 0.507f, -1.448f, 1.096f, -1.854f)
                curveToRelative(0.103f, -0.073f, 0.218f, -0.123f, 0.33f, -0.18f)
                verticalLineToRelative(3.936f)
                curveToRelative(-0.412f, -0.12f, -0.762f, -0.3f, -1.033f, -0.6f)
                moveToRelative(7.395f, 4.642f)
                arcToRelative(4.218f, 4.218f, 0.0f, false, false, -2.306f, -3.12f)
                curveToRelative(-0.552f, -0.272f, -1.12f, -0.412f, -1.686f, -0.513f)
                verticalLineTo(6.168f)
                arcToRelative(4.141f, 4.141f, 0.0f, false, true, 1.571f, 0.826f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 1.608f, -0.106f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, false, -0.112f, -1.843f)
                arcToRelative(6.542f, 6.542f, 0.0f, false, false, -3.07f, -1.443f)
                verticalLineToRelative(-0.344f)
                curveToRelative(0.0f, -0.695f, -0.53f, -1.258f, -1.185f, -1.258f)
                reflectiveCurveToRelative(-1.187f, 0.563f, -1.187f, 1.258f)
                verticalLineToRelative(0.409f)
                arcToRelative(4.932f, 4.932f, 0.0f, false, false, -1.63f, 0.725f)
                curveToRelative(-1.174f, 0.812f, -1.998f, 2.221f, -2.155f, 3.678f)
                curveToRelative(-0.134f, 1.26f, 0.236f, 2.445f, 1.04f, 3.328f)
                curveToRelative(0.809f, 0.893f, 1.781f, 1.243f, 2.742f, 1.437f)
                verticalLineToRelative(4.68f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, -2.188f, -1.022f)
                arcToRelative(1.141f, 1.141f, 0.0f, false, false, -1.653f, 0.31f)
                curveToRelative(-0.375f, 0.572f, -0.243f, 1.354f, 0.295f, 1.752f)
                arcToRelative(8.298f, 8.298f, 0.0f, false, false, 3.549f, 1.512f)
                verticalLineToRelative(0.334f)
                curveToRelative(0.0f, 0.694f, 0.529f, 1.257f, 1.187f, 1.257f)
                curveToRelative(0.656f, 0.0f, 1.185f, -0.563f, 1.185f, -1.257f)
                verticalLineToRelative(-0.379f)
                arcToRelative(5.119f, 5.119f, 0.0f, false, false, 2.703f, -1.523f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 1.292f, -4.205f)
            }
        }
        .build()
        return _dollarSymbolFilled!!
    }

private var _dollarSymbolFilled: ImageVector? = null
