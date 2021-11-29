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

public val RegularGroup.PauseRegular: ImageVector
    get() {
        if (_pauseRegular != null) {
            return _pauseRegular!!
        }
        _pauseRegular = Builder(name = "PauseRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.488f, 22.0f, 2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.488f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.488f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.488f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 3.43f)
                curveToRelative(-4.726f, 0.0f, -8.57f, 3.844f, -8.57f, 8.57f)
                curveToRelative(0.0f, 4.726f, 3.844f, 8.57f, 8.57f, 8.57f)
                curveToRelative(4.726f, 0.0f, 8.57f, -3.844f, 8.57f, -8.57f)
                curveToRelative(0.0f, -4.726f, -3.844f, -8.57f, -8.57f, -8.57f)
                close()
                moveTo(10.213f, 16.287f)
                lineTo(10.213f, 7.713f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -1.426f, 0.0f)
                verticalLineToRelative(8.57f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 1.426f, 0.004f)
                close()
                moveTo(15.213f, 16.287f)
                lineTo(15.213f, 7.713f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -1.426f, 0.0f)
                verticalLineToRelative(8.57f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 1.426f, 0.004f)
                close()
            }
        }
        .build()
        return _pauseRegular!!
    }

private var _pauseRegular: ImageVector? = null
