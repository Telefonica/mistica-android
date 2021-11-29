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
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.464f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, -4.464f, 10.0f, -10.0f)
                curveToRelative(0.0f, -5.5f, -4.5f, -10.0f, -10.0f, -10.0f)
                close()
                moveTo(12.536f, 10.392f)
                curveToRelative(0.284f, 0.0f, 0.536f, 0.252f, 0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, 0.536f)
                lineTo(9.18f, 11.464f)
                curveToRelative(-0.036f, 0.18f, -0.036f, 0.356f, -0.036f, 0.536f)
                curveToRelative(0.0f, 0.18f, 0.0f, 0.356f, 0.036f, 0.536f)
                horizontalLineToRelative(3.356f)
                curveToRelative(0.284f, 0.0f, 0.536f, 0.252f, 0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, 0.536f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(3.395f, 3.395f, 0.0f, false, false, 3.0f, 1.784f)
                curveToRelative(0.608f, 0.0f, 1.18f, -0.144f, 1.68f, -0.464f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.716f, 0.18f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.18f, 0.716f)
                arcToRelative(4.461f, 4.461f, 0.0f, false, true, -2.212f, 0.608f)
                curveToRelative(-1.892f, 0.0f, -3.5f, -1.18f, -4.18f, -2.856f)
                horizontalLineToRelative(-0.824f)
                arcTo(0.552f, 0.552f, 0.0f, false, true, 7.0f, 13.04f)
                curveToRelative(0.0f, -0.284f, 0.252f, -0.536f, 0.536f, -0.536f)
                horizontalLineToRelative(0.572f)
                curveToRelative(-0.036f, -0.144f, -0.036f, -0.324f, -0.036f, -0.5f)
                reflectiveCurveToRelative(0.0f, -0.356f, 0.036f, -0.536f)
                horizontalLineToRelative(-0.572f)
                arcTo(0.552f, 0.552f, 0.0f, false, true, 7.0f, 10.932f)
                curveToRelative(0.0f, -0.284f, 0.252f, -0.536f, 0.536f, -0.536f)
                horizontalLineToRelative(0.824f)
                arcToRelative(4.473f, 4.473f, 0.0f, false, true, 4.18f, -2.856f)
                curveToRelative(0.784f, 0.0f, 1.572f, 0.216f, 2.252f, 0.608f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 0.18f, 0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.752f, 0.18f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, false, -1.68f, -0.464f)
                arcToRelative(3.408f, 3.408f, 0.0f, false, false, -3.0f, 1.784f)
                curveToRelative(-0.004f, -0.008f, 2.996f, -0.008f, 2.996f, -0.008f)
                close()
            }
        }
        .build()
        return _euroSymbolCircleFilled!!
    }

private var _euroSymbolCircleFilled: ImageVector? = null
