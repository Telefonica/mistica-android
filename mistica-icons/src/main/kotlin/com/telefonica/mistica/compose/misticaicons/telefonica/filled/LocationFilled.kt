package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.LocationFilled: ImageVector
    get() {
        if (_locationFilled != null) {
            return _locationFilled!!
        }
        _locationFilled = Builder(name = "LocationFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.328f, 2.0f)
                curveToRelative(4.367f, 0.014f, 6.963f, 2.644f, 6.952f, 7.042f)
                curveToRelative(-0.014f, 4.28f, -5.347f, 11.154f, -6.711f, 12.527f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.577f, 0.0f)
                curveTo(10.633f, 20.202f, 5.322f, 13.322f, 5.333f, 9.0f)
                curveToRelative(0.006f, -2.17f, 0.647f, -3.958f, 1.855f, -5.165f)
                curveTo(8.387f, 2.633f, 10.15f, 2.0f, 12.294f, 2.0f)
                horizontalLineToRelative(0.034f)
                close()
                moveTo(14.848f, 8.597f)
                curveToRelative(0.0f, -1.566f, -0.935f, -2.499f, -2.498f, -2.499f)
                curveToRelative(-1.563f, 0.0f, -2.498f, 0.936f, -2.498f, 2.499f)
                curveToRelative(0.0f, 1.565f, 0.935f, 2.498f, 2.498f, 2.498f)
                curveToRelative(1.566f, 0.0f, 2.499f, -0.933f, 2.499f, -2.498f)
                close()
            }
        }
        .build()
        return _locationFilled!!
    }

private var _locationFilled: ImageVector? = null
