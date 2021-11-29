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

public val FilledGroup.LockClosedFilled: ImageVector
    get() {
        if (_lockClosedFilled != null) {
            return _lockClosedFilled!!
        }
        _lockClosedFilled = Builder(name = "LockClosedFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.912f, 9.499f)
                verticalLineTo(8.07f)
                curveTo(17.912f, 4.723f, 15.26f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(6.088f, 4.723f, 6.088f, 8.07f)
                verticalLineTo(9.5f)
                curveToRelative(-1.153f, 0.0f, -2.088f, 0.96f, -2.088f, 2.143f)
                verticalLineToRelative(8.214f)
                curveTo(4.0f, 21.04f, 4.935f, 22.0f, 6.088f, 22.0f)
                horizontalLineToRelative(11.824f)
                curveTo(19.065f, 22.0f, 20.0f, 21.04f, 20.0f, 19.856f)
                verticalLineToRelative(-8.214f)
                curveToRelative(0.0f, -1.184f, -0.939f, -2.143f, -2.088f, -2.143f)
                moveToRelative(-2.064f, 4.307f)
                lineToRelative(-4.892f, 5.019f)
                lineTo(8.85f, 16.66f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, true, 0.0f, -0.756f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, 0.736f, 0.0f)
                lineToRelative(1.371f, 1.408f)
                lineToRelative(4.152f, -4.263f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.736f, 0.0f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, 0.004f, 0.756f)
                moveToRelative(0.674f, -4.307f)
                horizontalLineTo(7.478f)
                verticalLineTo(8.07f)
                curveToRelative(0.0f, -2.56f, 2.03f, -4.643f, 4.522f, -4.643f)
                curveToRelative(2.493f, 0.0f, 4.522f, 2.083f, 4.522f, 4.643f)
                verticalLineToRelative(1.428f)
                close()
            }
        }
        .build()
        return _lockClosedFilled!!
    }

private var _lockClosedFilled: ImageVector? = null
