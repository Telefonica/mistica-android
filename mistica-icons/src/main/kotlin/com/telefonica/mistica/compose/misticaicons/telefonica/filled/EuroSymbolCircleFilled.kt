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

public val FilledGroup.EuroSymbolCircleFilled: ImageVector
    get() {
        if (_euroSymbolCircleFilled != null) {
            return _euroSymbolCircleFilled!!
        }
        _euroSymbolCircleFilled = Builder(name = "EuroSymbolCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.398f, 16.95f)
                curveToRelative(-0.863f, 0.406f, -1.91f, 0.61f, -3.118f, 0.61f)
                curveToRelative(-3.137f, 0.0f, -5.131f, -1.398f, -5.778f, -3.98f)
                horizontalLineToRelative(-1.12f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.0f, -1.205f)
                horizontalLineToRelative(0.926f)
                arcToRelative(9.72f, 9.72f, 0.0f, false, true, -0.039f, -0.823f)
                curveToRelative(0.0f, -0.123f, 0.009f, -0.241f, 0.014f, -0.359f)
                horizontalLineToRelative(-0.902f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.0f, -1.204f)
                horizontalLineToRelative(1.025f)
                curveToRelative(0.522f, -2.88f, 2.558f, -4.446f, 5.874f, -4.446f)
                curveToRelative(1.19f, 0.0f, 2.23f, 0.202f, 3.084f, 0.597f)
                arcToRelative(0.603f, 0.603f, 0.0f, true, true, -0.507f, 1.095f)
                curveToRelative(-0.694f, -0.322f, -1.56f, -0.484f, -2.577f, -0.484f)
                curveToRelative(-2.65f, 0.0f, -4.165f, 1.075f, -4.633f, 3.24f)
                horizontalLineToRelative(3.664f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.0f, 1.205f)
                horizontalLineTo(8.5f)
                curveToRelative(-0.006f, 0.123f, -0.025f, 0.233f, -0.025f, 0.359f)
                curveToRelative(0.0f, 0.29f, 0.028f, 0.554f, 0.056f, 0.823f)
                horizontalLineToRelative(3.781f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, 0.0f, 1.205f)
                horizontalLineToRelative(-3.56f)
                curveToRelative(0.577f, 1.857f, 2.067f, 2.773f, 4.527f, 2.773f)
                curveToRelative(1.025f, 0.0f, 1.902f, -0.168f, 2.602f, -0.496f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.518f, 1.09f)
                moveTo(12.0f, 2.0f)
                curveToRelative(-6.437f, 0.0f, -9.84f, 3.403f, -9.84f, 9.846f)
                curveToRelative(0.0f, 6.44f, 3.403f, 9.84f, 9.84f, 9.84f)
                curveToRelative(6.443f, 0.0f, 9.846f, -3.403f, 9.846f, -9.84f)
                curveTo(21.846f, 5.403f, 18.443f, 2.0f, 12.0f, 2.0f)
            }
        }
        .build()
        return _euroSymbolCircleFilled!!
    }

private var _euroSymbolCircleFilled: ImageVector? = null
