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

public val RegularGroup.PoundSymbolCircleRegular: ImageVector
    get() {
        if (_poundSymbolCircleRegular != null) {
            return _poundSymbolCircleRegular!!
        }
        _poundSymbolCircleRegular = Builder(name = "PoundSymbolCircleRegular", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.639f)
                curveToRelative(5.731f, 0.0f, 8.639f, -2.905f, 8.639f, -8.633f)
                curveToRelative(0.0f, -5.731f, -2.905f, -8.639f, -8.639f, -8.639f)
                curveToRelative(-5.728f, 0.0f, -8.633f, 2.908f, -8.633f, 8.639f)
                curveToRelative(0.0f, 5.728f, 2.905f, 8.633f, 8.633f, 8.633f)
                close()
                moveTo(12.0f, 2.16f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.44f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveTo(2.16f, 5.563f, 5.563f, 2.16f, 12.0f, 2.16f)
                close()
                moveTo(14.843f, 16.547f)
                curveToRelative(0.222f, 0.0f, 0.404f, 0.182f, 0.404f, 0.403f)
                verticalLineToRelative(0.431f)
                curveToRelative(0.0f, 0.224f, -0.18f, 0.404f, -0.404f, 0.404f)
                lineTo(8.675f, 17.785f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.358f, -0.219f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -0.093f, -0.423f)
                curveToRelative(0.0f, -0.445f, 0.233f, -0.672f, 0.698f, -1.117f)
                curveToRelative(0.871f, -0.84f, 1.04f, -1.437f, 1.04f, -2.183f)
                curveToRelative(0.0f, -0.481f, -0.077f, -0.963f, -0.245f, -1.526f)
                lineTo(8.72f, 12.317f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.403f, -0.403f)
                verticalLineToRelative(-0.272f)
                curveToRelative(0.0f, -0.213f, 0.165f, -0.387f, 0.375f, -0.404f)
                lineToRelative(0.661f, -0.044f)
                arcToRelative(6.852f, 6.852f, 0.0f, false, true, -0.302f, -1.93f)
                curveToRelative(0.0f, -2.16f, 1.291f, -3.4f, 3.54f, -3.4f)
                curveToRelative(0.572f, 0.0f, 1.496f, 0.08f, 2.224f, 0.304f)
                curveToRelative(0.169f, 0.054f, 0.283f, 0.21f, 0.283f, 0.387f)
                verticalLineToRelative(0.367f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.476f, 0.398f)
                curveToRelative(-0.683f, -0.13f, -1.347f, -0.202f, -1.871f, -0.202f)
                curveToRelative(-1.639f, 0.0f, -2.403f, 0.678f, -2.403f, 2.134f)
                curveToRelative(0.0f, 0.642f, 0.154f, 1.286f, 0.325f, 1.86f)
                horizontalLineToRelative(2.476f)
                curveToRelative(0.224f, 0.0f, 0.403f, 0.182f, 0.403f, 0.404f)
                verticalLineToRelative(0.398f)
                curveToRelative(0.0f, 0.224f, -0.18f, 0.403f, -0.403f, 0.403f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(0.132f, 0.526f, 0.2f, 1.042f, 0.2f, 1.54f)
                curveToRelative(0.0f, 1.062f, -0.297f, 1.818f, -1.115f, 2.69f)
                horizontalLineToRelative(4.72f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleRegular!!
    }

private var _poundSymbolCircleRegular: ImageVector? = null
