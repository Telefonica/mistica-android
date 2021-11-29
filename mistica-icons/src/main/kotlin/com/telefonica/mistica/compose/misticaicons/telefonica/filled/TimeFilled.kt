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

public val FilledGroup.TimeFilled: ImageVector
    get() {
        if (_timeFilled != null) {
            return _timeFilled!!
        }
        _timeFilled = Builder(name = "TimeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.458f, 15.73f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, true, -0.868f, 0.0f)
                lineToRelative(-3.031f, -3.028f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, true, -0.18f, -0.437f)
                verticalLineTo(8.164f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 1.233f, 0.0f)
                verticalLineToRelative(3.846f)
                lineToRelative(2.852f, 2.849f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.006f, 0.87f)
                moveTo(11.99f, 2.15f)
                curveToRelative(-6.218f, 0.0f, -9.84f, 3.14f, -9.84f, 9.846f)
                curveToRelative(0.0f, 6.706f, 3.622f, 9.84f, 9.84f, 9.84f)
                curveToRelative(6.219f, 0.0f, 9.846f, -3.134f, 9.846f, -9.84f)
                curveToRelative(0.0f, -6.706f, -3.627f, -9.846f, -9.846f, -9.846f)
            }
        }
        .build()
        return _timeFilled!!
    }

private var _timeFilled: ImageVector? = null
