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

public val FilledGroup.PauseFilled: ImageVector
    get() {
        if (_pauseFilled != null) {
            return _pauseFilled!!
        }
        _pauseFilled = Builder(name = "PauseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.488f, 2.0f, 2.0f, 6.488f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.488f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.488f, 10.0f, -10.0f)
                reflectiveCurveTo(17.512f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.035f, 16.465f)
                arcTo(0.533f, 0.533f, 0.0f, false, true, 9.5f, 17.0f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, -0.535f)
                verticalLineToRelative(-8.93f)
                curveToRelative(0.0f, -0.297f, 0.238f, -0.535f, 0.535f, -0.535f)
                curveToRelative(0.297f, 0.0f, 0.535f, 0.238f, 0.535f, 0.535f)
                verticalLineToRelative(8.93f)
                close()
                moveTo(15.035f, 16.465f)
                arcTo(0.533f, 0.533f, 0.0f, false, true, 14.5f, 17.0f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, -0.535f)
                verticalLineToRelative(-8.93f)
                curveToRelative(0.0f, -0.297f, 0.238f, -0.535f, 0.535f, -0.535f)
                curveToRelative(0.297f, 0.0f, 0.535f, 0.238f, 0.535f, 0.535f)
                verticalLineToRelative(8.93f)
                close()
            }
        }
        .build()
        return _pauseFilled!!
    }

private var _pauseFilled: ImageVector? = null
