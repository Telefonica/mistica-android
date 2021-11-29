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

public val LightGroup.DollarSymbolLight: ImageVector
    get() {
        if (_dollarSymbolLight != null) {
            return _dollarSymbolLight!!
        }
        _dollarSymbolLight = Builder(name = "DollarSymbolLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.94f, 17.672f)
                curveToRelative(-0.63f, 0.641f, -1.429f, 0.977f, -2.289f, 1.1f)
                verticalLineToRelative(-6.12f)
                curveToRelative(0.625f, 0.087f, 1.208f, 0.205f, 1.72f, 0.445f)
                curveToRelative(0.799f, 0.37f, 1.317f, 1.031f, 1.468f, 1.858f)
                curveToRelative(0.174f, 0.958f, -0.162f, 1.972f, -0.9f, 2.717f)
                moveToRelative(-5.935f, -7.558f)
                curveToRelative(-0.622f, -0.65f, -0.68f, -1.409f, -0.622f, -1.93f)
                curveToRelative(0.107f, -0.958f, 0.706f, -1.924f, 1.527f, -2.465f)
                arcToRelative(3.802f, 3.802f, 0.0f, false, true, 1.406f, -0.554f)
                verticalLineToRelative(5.955f)
                curveToRelative(-0.896f, -0.146f, -1.714f, -0.381f, -2.31f, -1.006f)
                moveToRelative(5.932f, 1.768f)
                curveToRelative(-0.728f, -0.34f, -1.512f, -0.476f, -2.286f, -0.58f)
                verticalLineTo(5.125f)
                curveToRelative(1.076f, 0.115f, 2.115f, 0.555f, 2.86f, 1.166f)
                arcToRelative(0.662f, 0.662f, 0.0f, false, false, 0.939f, -0.098f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.096f, -0.944f)
                curveToRelative(-0.974f, -0.799f, -2.313f, -1.356f, -3.7f, -1.47f)
                verticalLineToRelative(-0.953f)
                arcToRelative(0.668f, 0.668f, 0.0f, true, false, -1.336f, 0.003f)
                verticalLineToRelative(0.991f)
                arcToRelative(5.162f, 5.162f, 0.0f, false, false, -2.14f, 0.782f)
                curveTo(8.021f, 5.36f, 7.206f, 6.68f, 7.055f, 8.036f)
                curveToRelative(-0.132f, 1.143f, 0.221f, 2.213f, 0.986f, 3.014f)
                curveToRelative(0.924f, 0.963f, 2.126f, 1.26f, 3.274f, 1.428f)
                verticalLineToRelative(6.334f)
                arcTo(7.561f, 7.561f, 0.0f, false, true, 7.8f, 17.495f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, -0.93f, 0.165f)
                verticalLineToRelative(0.003f)
                arcToRelative(0.675f, 0.675f, 0.0f, false, false, 0.165f, 0.936f)
                arcToRelative(8.868f, 8.868f, 0.0f, false, false, 4.28f, 1.557f)
                verticalLineToRelative(0.964f)
                arcToRelative(0.668f, 0.668f, 0.0f, true, false, 1.336f, 0.059f)
                verticalLineToRelative(-1.042f)
                curveToRelative(1.196f, -0.14f, 2.33f, -0.6f, 3.238f, -1.521f)
                curveToRelative(1.04f, -1.056f, 1.513f, -2.516f, 1.264f, -3.897f)
                curveToRelative(-0.224f, -1.271f, -1.014f, -2.28f, -2.216f, -2.837f)
            }
        }
        .build()
        return _dollarSymbolLight!!
    }

private var _dollarSymbolLight: ImageVector? = null
