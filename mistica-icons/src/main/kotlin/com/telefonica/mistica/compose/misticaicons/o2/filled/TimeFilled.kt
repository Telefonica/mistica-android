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

public val FilledGroup.TimeFilled: ImageVector
    get() {
        if (_timeFilled != null) {
            return _timeFilled!!
        }
        _timeFilled = Builder(name = "TimeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.488f, 2.0f, 2.0f, 6.488f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.488f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.488f, 10.0f, -10.0f)
                reflectiveCurveTo(17.512f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.236f, 9.52f)
                lineTo(12.0f, 12.756f)
                lineTo(6.616f, 7.384f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, 0.0f, -0.756f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, 0.756f, 0.0f)
                lineToRelative(4.616f, 4.616f)
                lineToRelative(2.488f, -2.48f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, 0.756f, 0.0f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.004f, 0.756f)
                close()
            }
        }
        .build()
        return _timeFilled!!
    }

private var _timeFilled: ImageVector? = null
