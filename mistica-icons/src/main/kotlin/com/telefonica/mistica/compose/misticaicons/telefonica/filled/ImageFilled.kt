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

public val FilledGroup.ImageFilled: ImageVector
    get() {
        if (_imageFilled != null) {
            return _imageFilled!!
        }
        _imageFilled = Builder(name = "ImageFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.839f, 13.408f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.115f, -0.872f)
                lineToRelative(-3.246f, -2.507f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.757f, 0.009f)
                lineToRelative(-3.711f, 2.977f)
                lineToRelative(-0.896f, -0.854f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.816f, -0.025f)
                lineToRelative(-5.277f, 4.44f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, -0.078f, 0.876f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, 0.865f, 0.082f)
                lineToRelative(4.86f, -4.087f)
                lineToRelative(3.378f, 3.213f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.869f, -0.026f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, -0.026f, -0.88f)
                lineToRelative(-1.969f, -1.873f)
                lineToRelative(3.196f, -2.566f)
                lineToRelative(2.866f, 2.213f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.857f, -0.12f)
                close()
                moveTo(7.046f, 6.606f)
                curveToRelative(-1.243f, 0.0f, -2.255f, 1.023f, -2.255f, 2.278f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, false, 2.255f, 2.277f)
                curveToRelative(1.244f, 0.0f, 2.255f, -1.022f, 2.255f, -2.277f)
                curveToRelative(0.0f, -1.255f, -1.011f, -2.278f, -2.255f, -2.278f)
                close()
                moveTo(20.413f, 4.522f)
                curveToRelative(0.743f, 0.0f, 1.42f, 0.583f, 1.42f, 1.224f)
                verticalLineToRelative(12.317f)
                curveToRelative(0.0f, 0.641f, -0.677f, 1.224f, -1.42f, 1.224f)
                lineTo(3.567f, 19.287f)
                curveToRelative(-0.756f, 0.0f, -1.417f, -0.574f, -1.417f, -1.224f)
                lineToRelative(0.003f, -12.317f)
                curveToRelative(0.0f, -0.652f, 0.664f, -1.224f, 1.417f, -1.224f)
                horizontalLineToRelative(16.843f)
                close()
                moveTo(7.046f, 9.92f)
                arcToRelative(1.031f, 1.031f, 0.0f, false, true, -1.025f, -1.033f)
                curveToRelative(0.0f, -0.572f, 0.46f, -1.034f, 1.025f, -1.034f)
                arcToRelative(1.035f, 1.035f, 0.0f, false, true, 0.0f, 2.067f)
                close()
            }
        }
        .build()
        return _imageFilled!!
    }

private var _imageFilled: ImageVector? = null
