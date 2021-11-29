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
                moveTo(12.36f, 7.352f)
                curveToRelative(0.392f, 0.0f, 1.0f, 0.072f, 1.536f, 0.536f)
                curveToRelative(0.324f, 0.248f, 0.324f, 0.716f, 0.072f, 1.0f)
                curveToRelative(-0.248f, 0.324f, -0.716f, 0.324f, -1.0f, 0.072f)
                curveToRelative(-0.144f, -0.108f, -0.284f, -0.18f, -0.608f, -0.18f)
                curveToRelative(-0.54f, 0.0f, -0.896f, 0.36f, -0.896f, 0.896f)
                verticalLineToRelative(1.428f)
                horizontalLineToRelative(1.428f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.716f, 0.716f)
                curveToRelative(0.0f, 0.392f, -0.32f, 0.716f, -0.716f, 0.716f)
                horizontalLineToRelative(-1.428f)
                verticalLineToRelative(1.536f)
                curveToRelative(0.0f, 0.144f, 0.0f, 0.284f, -0.036f, 0.428f)
                horizontalLineToRelative(2.892f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.716f, 0.716f)
                curveToRelative(0.0f, 0.392f, -0.32f, 0.716f, -0.716f, 0.716f)
                lineTo(9.608f, 15.932f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, false, 0.428f, -0.428f)
                verticalLineToRelative(-1.536f)
                lineTo(9.68f, 12.536f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                horizontalLineToRelative(0.356f)
                lineTo(10.036f, 9.676f)
                curveToRelative(0.0f, -1.324f, 1.0f, -2.324f, 2.324f, -2.324f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleRegular!!
    }

private var _poundSymbolCircleRegular: ImageVector? = null
