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

public val FilledGroup.CancelFilled: ImageVector
    get() {
        if (_cancelFilled != null) {
            return _cancelFilled!!
        }
        _cancelFilled = Builder(name = "CancelFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.484f, 2.0f, 2.0f, 6.484f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.484f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.484f, 10.0f, -10.0f)
                reflectiveCurveTo(17.516f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.664f, 15.912f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, -0.38f, 0.912f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, -0.152f)
                lineToRelative(-3.912f, -3.912f)
                lineToRelative(-3.912f, 3.912f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, 0.152f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, -0.38f, -0.912f)
                lineTo(11.232f, 12.0f)
                lineTo(7.336f, 8.088f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.0f, -0.76f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.76f, 0.0f)
                lineToRelative(3.912f, 3.912f)
                lineToRelative(3.912f, -3.912f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.76f, 0.0f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.0f, 0.76f)
                lineTo(12.768f, 12.0f)
                lineToRelative(3.896f, 3.912f)
                close()
            }
        }
        .build()
        return _cancelFilled!!
    }

private var _cancelFilled: ImageVector? = null
