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

public val FilledGroup.AddMoreCircleFilled: ImageVector
    get() {
        if (_addMoreCircleFilled != null) {
            return _addMoreCircleFilled!!
        }
        _addMoreCircleFilled = Builder(name = "AddMoreCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.484f, 2.0f, 2.0f, 6.484f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.484f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.484f, 10.0f, -10.0f)
                reflectiveCurveTo(17.516f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.067f, 11.467f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.376f, 0.914f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.376f, 0.161f)
                horizontalLineToRelative(-5.533f)
                verticalLineToRelative(5.532f)
                curveToRelative(0.0f, 0.148f, -0.065f, 0.28f, -0.161f, 0.377f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, -0.914f, -0.376f)
                verticalLineToRelative(-5.533f)
                lineToRelative(-5.52f, -0.011f)
                curveToRelative(-0.3f, 0.0f, -0.54f, -0.24f, -0.538f, -0.538f)
                curveToRelative(0.0f, -0.3f, 0.24f, -0.54f, 0.537f, -0.537f)
                horizontalLineToRelative(5.533f)
                lineTo(11.471f, 5.924f)
                curveToRelative(0.0f, -0.3f, 0.24f, -0.54f, 0.537f, -0.538f)
                curveToRelative(0.3f, 0.0f, 0.54f, 0.24f, 0.538f, 0.538f)
                verticalLineToRelative(5.532f)
                lineToRelative(5.52f, 0.011f)
                close()
            }
        }
        .build()
        return _addMoreCircleFilled!!
    }

private var _addMoreCircleFilled: ImageVector? = null
