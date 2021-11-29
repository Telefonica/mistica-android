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

public val FilledGroup.PoundSymbolCircleFilled: ImageVector
    get() {
        if (_poundSymbolCircleFilled != null) {
            return _poundSymbolCircleFilled!!
        }
        _poundSymbolCircleFilled = Builder(name = "PoundSymbolCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.464f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, -4.464f, 10.0f, -10.0f)
                curveToRelative(0.0f, -5.5f, -4.5f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(14.32f, 15.752f)
                lineTo(9.608f, 15.752f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, -0.536f)
                curveToRelative(0.0f, -0.284f, 0.252f, -0.536f, 0.536f, -0.536f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.608f, -0.608f)
                lineTo(10.216f, 12.36f)
                lineTo(9.68f, 12.36f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, -0.536f)
                curveToRelative(0.0f, -0.284f, 0.252f, -0.536f, 0.536f, -0.536f)
                horizontalLineToRelative(0.536f)
                lineTo(10.216f, 9.68f)
                curveToRelative(0.0f, -1.252f, 0.896f, -2.144f, 2.144f, -2.144f)
                curveToRelative(0.396f, 0.0f, 0.928f, 0.036f, 1.428f, 0.5f)
                curveToRelative(0.216f, 0.216f, 0.252f, 0.536f, 0.036f, 0.752f)
                curveToRelative(-0.216f, 0.216f, -0.536f, 0.252f, -0.752f, 0.036f)
                curveToRelative(-0.144f, -0.144f, -0.324f, -0.216f, -0.716f, -0.216f)
                curveToRelative(-0.644f, 0.0f, -1.072f, 0.428f, -1.072f, 1.072f)
                verticalLineToRelative(1.608f)
                horizontalLineToRelative(1.608f)
                curveToRelative(0.284f, 0.0f, 0.536f, 0.252f, 0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, 0.536f)
                horizontalLineToRelative(-1.608f)
                verticalLineToRelative(1.712f)
                curveToRelative(0.0f, 0.216f, -0.036f, 0.396f, -0.108f, 0.608f)
                horizontalLineToRelative(3.144f)
                curveToRelative(0.284f, 0.0f, 0.536f, 0.252f, 0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, 0.536f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleFilled!!
    }

private var _poundSymbolCircleFilled: ImageVector? = null
