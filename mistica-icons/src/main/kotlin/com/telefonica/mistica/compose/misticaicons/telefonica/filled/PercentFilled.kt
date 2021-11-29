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

public val FilledGroup.PercentFilled: ImageVector
    get() {
        if (_percentFilled != null) {
            return _percentFilled!!
        }
        _percentFilled = Builder(name = "PercentFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.923f, 7.856f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, false, -0.907f, -0.706f)
                lineToRelative(-6.944f, 8.927f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, false, 0.45f, 0.927f)
                curveToRelative(0.171f, 0.0f, 0.342f, -0.075f, 0.454f, -0.221f)
                lineToRelative(6.947f, -8.927f)
                close()
                moveTo(14.315f, 16.483f)
                curveToRelative(1.045f, 0.0f, 1.656f, -0.526f, 1.656f, -1.655f)
                reflectiveCurveToRelative(-0.61f, -1.656f, -1.656f, -1.656f)
                curveToRelative(-1.045f, 0.0f, -1.655f, 0.527f, -1.655f, 1.656f)
                reflectiveCurveToRelative(0.608f, 1.655f, 1.655f, 1.655f)
                close()
                moveTo(9.671f, 7.626f)
                curveToRelative(-1.048f, 0.0f, -1.655f, 0.53f, -1.655f, 1.656f)
                reflectiveCurveToRelative(0.607f, 1.655f, 1.655f, 1.655f)
                curveToRelative(1.045f, 0.0f, 1.655f, -0.53f, 1.655f, -1.655f)
                curveToRelative(0.0f, -1.13f, -0.61f, -1.656f, -1.655f, -1.656f)
                close()
                moveTo(11.991f, 2.15f)
                curveToRelative(6.218f, 0.0f, 9.845f, 3.14f, 9.845f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.706f, 3.622f, -9.846f, 9.84f, -9.846f)
                close()
            }
        }
        .build()
        return _percentFilled!!
    }

private var _percentFilled: ImageVector? = null
