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

public val RegularGroup.EuroSymbolCircleRegular: ImageVector
    get() {
        if (_euroSymbolCircleRegular != null) {
            return _euroSymbolCircleRegular!!
        }
        _euroSymbolCircleRegular = Builder(name = "EuroSymbolCircleRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.479f)
                curveToRelative(5.731f, 0.0f, 8.639f, -2.905f, 8.639f, -8.633f)
                curveToRelative(0.0f, -5.734f, -2.905f, -8.639f, -8.639f, -8.639f)
                curveToRelative(-5.728f, 0.0f, -8.633f, 2.905f, -8.633f, 8.639f)
                curveToRelative(0.0f, 5.728f, 2.905f, 8.633f, 8.633f, 8.633f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveTo(2.16f, 5.403f, 5.563f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.883f, 15.857f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.8f, 0.283f)
                curveToRelative(0.0f, 0.003f, 0.004f, 0.003f, 0.004f, 0.006f)
                curveToRelative(0.142f, 0.3f, 0.014f, 0.66f, -0.289f, 0.804f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.862f, 0.406f, -1.91f, 0.61f, -3.117f, 0.61f)
                curveToRelative(-3.135f, 0.0f, -5.13f, -1.398f, -5.78f, -3.98f)
                horizontalLineToRelative(-1.12f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, -1.21f)
                horizontalLineToRelative(0.928f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, true, -0.04f, -0.821f)
                curveToRelative(0.0f, -0.123f, 0.009f, -0.24f, 0.014f, -0.361f)
                horizontalLineToRelative(-0.902f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.0f, -1.204f)
                horizontalLineToRelative(1.028f)
                curveToRelative(0.522f, -2.88f, 2.558f, -4.446f, 5.874f, -4.446f)
                curveToRelative(1.19f, 0.0f, 2.23f, 0.199f, 3.084f, 0.596f)
                arcToRelative(0.603f, 0.603f, 0.0f, true, true, -0.507f, 1.096f)
                curveToRelative(-0.694f, -0.322f, -1.563f, -0.485f, -2.577f, -0.485f)
                curveToRelative(-2.65f, 0.0f, -4.168f, 1.076f, -4.633f, 3.238f)
                horizontalLineToRelative(3.664f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, 0.0f, 1.205f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-0.005f, 0.123f, -0.022f, 0.232f, -0.022f, 0.361f)
                curveToRelative(0.0f, 0.294f, 0.028f, 0.557f, 0.054f, 0.82f)
                horizontalLineToRelative(3.784f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.21f)
                lineTo(8.754f, 13.579f)
                curveToRelative(0.577f, 1.858f, 2.067f, 2.774f, 4.526f, 2.774f)
                curveToRelative(1.028f, 0.003f, 1.902f, -0.165f, 2.603f, -0.496f)
                close()
            }
        }
        .build()
        return _euroSymbolCircleRegular!!
    }

private var _euroSymbolCircleRegular: ImageVector? = null
