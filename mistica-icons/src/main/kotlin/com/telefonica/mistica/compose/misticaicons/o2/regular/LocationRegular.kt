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

public val RegularGroup.LocationRegular: ImageVector
    get() {
        if (_locationRegular != null) {
            return _locationRegular!!
        }
        _locationRegular = Builder(name = "LocationRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.502f, 22.0f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, -0.527f, -0.26f)
                curveTo(11.728f, 21.444f, 6.0f, 14.74f, 6.0f, 9.368f)
                curveTo(6.004f, 5.22f, 8.849f, 2.0f, 12.502f, 2.0f)
                curveTo(16.155f, 2.0f, 19.0f, 5.22f, 19.0f, 9.368f)
                curveToRelative(0.0f, 5.368f, -5.724f, 12.112f, -5.97f, 12.372f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, true, -0.528f, 0.26f)
                close()
                moveTo(12.502f, 3.484f)
                curveToRelative(-2.913f, 0.0f, -5.09f, 2.52f, -5.09f, 5.888f)
                curveToRelative(0.0f, 3.924f, 3.686f, 9.0f, 5.09f, 10.74f)
                curveToRelative(1.407f, -1.776f, 5.09f, -6.816f, 5.09f, -10.74f)
                curveToRelative(0.0f, -3.372f, -2.177f, -5.888f, -5.09f, -5.888f)
                close()
            }
        }
        .build()
        return _locationRegular!!
    }

private var _locationRegular: ImageVector? = null
