package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

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
                moveTo(12.0f, 2.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                curveToRelative(0.0f, 5.536f, -4.5f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-5.536f, 0.0f, -10.0f, -4.5f, -10.0f, -10.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.428f)
                arcTo(8.552f, 8.552f, 0.0f, false, false, 3.428f, 12.0f)
                arcTo(8.548f, 8.548f, 0.0f, false, false, 12.0f, 20.568f)
                arcTo(8.548f, 8.548f, 0.0f, false, false, 20.572f, 12.0f)
                curveToRelative(0.0f, -4.716f, -3.82f, -8.572f, -8.572f, -8.572f)
                close()
                moveTo(12.54f, 7.348f)
                curveToRelative(0.824f, 0.0f, 1.608f, 0.248f, 2.324f, 0.644f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.252f, 0.964f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.964f, 0.252f)
                arcToRelative(3.205f, 3.205f, 0.0f, false, false, -1.608f, -0.428f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, -2.68f, 1.428f)
                horizontalLineToRelative(2.68f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                curveToRelative(0.0f, 0.392f, -0.32f, 0.716f, -0.716f, 0.716f)
                horizontalLineToRelative(-3.18f)
                curveToRelative(-0.036f, 0.104f, -0.036f, 0.252f, -0.036f, 0.356f)
                curveToRelative(0.0f, 0.104f, 0.036f, 0.248f, 0.036f, 0.356f)
                horizontalLineToRelative(3.176f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                curveToRelative(0.0f, 0.392f, -0.32f, 0.716f, -0.716f, 0.716f)
                lineTo(9.86f, 13.784f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, false, 2.68f, 1.428f)
                curveToRelative(0.572f, 0.0f, 1.108f, -0.144f, 1.608f, -0.428f)
                curveToRelative(0.32f, -0.212f, 0.748f, -0.104f, 0.964f, 0.252f)
                curveToRelative(0.212f, 0.32f, 0.104f, 0.748f, -0.252f, 0.964f)
                curveToRelative(-0.716f, 0.428f, -1.5f, 0.644f, -2.324f, 0.644f)
                curveToRelative(-1.928f, 0.0f, -3.568f, -1.176f, -4.284f, -2.856f)
                horizontalLineToRelative(-0.716f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.396f, 0.32f, -0.716f, 0.72f, -0.724f)
                horizontalLineToRelative(0.356f)
                curveToRelative(-0.036f, -0.104f, -0.036f, -0.252f, -0.036f, -0.356f)
                curveToRelative(0.0f, -0.104f, 0.036f, -0.248f, 0.036f, -0.356f)
                lineTo(7.54f, 11.636f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                horizontalLineToRelative(0.716f)
                curveToRelative(0.712f, -1.676f, 2.356f, -2.856f, 4.284f, -2.856f)
                close()
            }
        }
        .build()
        return _euroSymbolCircleRegular!!
    }

private var _euroSymbolCircleRegular: ImageVector? = null
