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

public val FilledGroup.TruckFilled: ImageVector
    get() {
        if (_truckFilled != null) {
            return _truckFilled!!
        }
        _truckFilled = Builder(name = "TruckFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.356f)
                arcToRelative(2.144f, 2.144f, 0.0f, true, true, 0.0f, 4.288f)
                arcToRelative(2.144f, 2.144f, 0.0f, false, true, 0.0f, -4.288f)
                close()
                moveTo(15.152f, 5.928f)
                lineTo(22.0f, 12.736f)
                verticalLineToRelative(7.136f)
                horizontalLineToRelative(-1.808f)
                curveToRelative(0.012f, -0.12f, 0.024f, -0.248f, 0.024f, -0.372f)
                arcTo(3.221f, 3.221f, 0.0f, false, false, 17.0f, 16.284f)
                arcToRelative(3.221f, 3.221f, 0.0f, false, false, -3.216f, 3.216f)
                curveToRelative(0.0f, 0.124f, -0.016f, 0.236f, 0.0f, 0.356f)
                horizontalLineToRelative(-1.428f)
                lineTo(12.356f, 5.928f)
                horizontalLineToRelative(2.796f)
                close()
                moveTo(8.072f, 2.356f)
                arcToRelative(3.228f, 3.228f, 0.0f, false, true, 3.212f, 3.216f)
                verticalLineToRelative(14.284f)
                lineTo(2.0f, 19.856f)
                lineTo(2.0f, 14.32f)
                horizontalLineToRelative(6.428f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.0f, -1.072f)
                lineTo(2.0f, 13.248f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.216f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.0f, -1.072f)
                lineTo(2.0f, 9.676f)
                verticalLineToRelative(-7.32f)
                close()
            }
        }
        .build()
        return _truckFilled!!
    }

private var _truckFilled: ImageVector? = null
