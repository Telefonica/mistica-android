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
                moveTo(12.502f, 2.0f)
                curveTo(8.847f, 2.0f, 6.0f, 5.22f, 6.0f, 9.37f)
                curveToRelative(0.0f, 5.369f, 5.728f, 12.11f, 5.97f, 12.37f)
                curveToRelative(0.14f, 0.148f, 0.32f, 0.26f, 0.528f, 0.26f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, false, 0.528f, -0.26f)
                curveTo(13.276f, 21.444f, 19.0f, 14.739f, 19.0f, 9.37f)
                curveTo(19.0f, 5.22f, 16.153f, 2.0f, 12.502f, 2.0f)
                close()
            }
        }
        .build()
        return _locationFilled!!
    }

private var _locationFilled: ImageVector? = null
