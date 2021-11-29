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

public val RegularGroup.WarningRegular: ImageVector
    get() {
        if (_warningRegular != null) {
            return _warningRegular!!
        }
        _warningRegular = Builder(name = "WarningRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.5f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.428f)
                curveToRelative(-4.716f, 0.0f, -8.572f, 3.856f, -8.572f, 8.572f)
                curveToRelative(0.0f, 4.716f, 3.856f, 8.572f, 8.572f, 8.572f)
                curveToRelative(4.716f, 0.0f, 8.572f, -3.856f, 8.572f, -8.572f)
                curveToRelative(0.0f, -4.716f, -3.856f, -8.572f, -8.572f, -8.572f)
                close()
                moveTo(12.0f, 15.928f)
                arcToRelative(0.892f, 0.892f, 0.0f, true, true, 0.0f, 1.784f)
                arcToRelative(0.892f, 0.892f, 0.0f, false, true, 0.0f, -1.784f)
                close()
                moveTo(12.0f, 6.644f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                verticalLineToRelative(6.784f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, 0.716f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                lineTo(11.284f, 7.36f)
                curveToRelative(0.0f, -0.396f, 0.324f, -0.716f, 0.716f, -0.716f)
                close()
            }
        }
        .build()
        return _warningRegular!!
    }

private var _warningRegular: ImageVector? = null
