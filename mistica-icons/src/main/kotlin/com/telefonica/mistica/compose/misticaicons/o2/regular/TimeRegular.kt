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

public val RegularGroup.TimeRegular: ImageVector
    get() {
        if (_timeRegular != null) {
            return _timeRegular!!
        }
        _timeRegular = Builder(name = "TimeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.516f, 0.0f, 10.0f, 4.484f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.484f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.484f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.424f)
                curveToRelative(-4.728f, 0.0f, -8.576f, 3.848f, -8.576f, 8.576f)
                curveToRelative(0.0f, 4.728f, 3.848f, 8.576f, 8.576f, 8.576f)
                curveToRelative(4.728f, 0.0f, 8.576f, -3.848f, 8.576f, -8.576f)
                curveToRelative(0.0f, -4.728f, -3.848f, -8.576f, -8.576f, -8.576f)
                close()
                moveTo(7.864f, 6.852f)
                lineTo(12.0f, 10.988f)
                lineToRelative(2.348f, -2.348f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 1.012f, 0.0f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.0f, 1.012f)
                lineTo(12.0f, 13.012f)
                lineTo(6.852f, 7.864f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.0f, -1.012f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 1.012f, 0.0f)
                close()
            }
        }
        .build()
        return _timeRegular!!
    }

private var _timeRegular: ImageVector? = null
