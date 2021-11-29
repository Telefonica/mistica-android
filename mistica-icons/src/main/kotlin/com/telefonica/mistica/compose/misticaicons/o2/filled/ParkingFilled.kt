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

public val FilledGroup.ParkingFilled: ImageVector
    get() {
        if (_parkingFilled != null) {
            return _parkingFilled!!
        }
        _parkingFilled = Builder(name = "ParkingFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.52f, 8.813f)
                curveToRelative(0.0f, 1.607f, -1.247f, 2.916f, -2.778f, 2.916f)
                lineTo(9.594f, 11.729f)
                lineTo(9.594f, 5.897f)
                horizontalLineToRelative(3.148f)
                curveToRelative(1.531f, 0.0f, 2.778f, 1.308f, 2.778f, 2.916f)
                close()
                moveTo(22.0f, 2.946f)
                verticalLineToRelative(17.108f)
                curveToRelative(0.0f, 1.07f, -0.83f, 1.946f, -1.854f, 1.946f)
                lineTo(3.854f, 22.0f)
                curveTo(2.834f, 22.0f, 2.0f, 21.13f, 2.0f, 20.054f)
                lineTo(2.0f, 2.946f)
                curveTo(2.0f, 1.876f, 2.83f, 1.0f, 3.854f, 1.0f)
                lineTo(20.15f, 1.0f)
                curveTo(21.171f, 1.0f, 22.0f, 1.87f, 22.0f, 2.946f)
                close()
                moveTo(16.634f, 8.813f)
                curveToRelative(0.0f, -2.25f, -1.745f, -4.08f, -3.887f, -4.08f)
                lineTo(8.49f, 4.733f)
                verticalLineToRelative(13.022f)
                curveToRelative(0.0f, 0.324f, 0.246f, 0.582f, 0.554f, 0.582f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, false, 0.555f, -0.582f)
                verticalLineToRelative(-4.862f)
                horizontalLineToRelative(3.148f)
                curveToRelative(2.142f, 0.0f, 3.887f, -1.83f, 3.887f, -4.08f)
                close()
            }
        }
        .build()
        return _parkingFilled!!
    }

private var _parkingFilled: ImageVector? = null
