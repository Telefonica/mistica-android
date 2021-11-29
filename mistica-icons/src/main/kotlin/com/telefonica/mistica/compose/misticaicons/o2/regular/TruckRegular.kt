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

public val RegularGroup.TruckRegular: ImageVector
    get() {
        if (_truckRegular != null) {
            return _truckRegular!!
        }
        _truckRegular = Builder(name = "TruckRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.14f, 2.0f)
                curveToRelative(1.776f, 0.0f, 3.216f, 1.47f, 3.216f, 3.274f)
                verticalLineToRelative(0.362f)
                horizontalLineToRelative(2.796f)
                lineTo(22.0f, 12.606f)
                verticalLineToRelative(7.212f)
                horizontalLineToRelative(-2.328f)
                curveTo(19.232f, 21.088f, 18.04f, 22.0f, 16.644f, 22.0f)
                curveToRelative(-1.396f, 0.0f, -2.584f, -0.912f, -3.028f, -2.182f)
                horizontalLineToRelative(-10.9f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.716f, -0.73f)
                curveToRelative(0.0f, -0.402f, 0.32f, -0.728f, 0.716f, -0.728f)
                horizontalLineToRelative(8.212f)
                lineTo(10.928f, 5.274f)
                curveToRelative(0.0f, -1.002f, -0.8f, -1.816f, -1.784f, -1.816f)
                lineTo(2.716f, 3.458f)
                arcTo(0.724f, 0.724f, 0.0f, false, true, 2.0f, 2.728f)
                curveToRelative(0.0f, -0.398f, 0.32f, -0.724f, 0.716f, -0.728f)
                close()
                moveTo(16.644f, 16.91f)
                curveToRelative(-0.984f, 0.0f, -1.784f, 0.815f, -1.784f, 1.816f)
                curveToRelative(0.0f, 1.002f, 0.8f, 1.816f, 1.784f, 1.816f)
                reflectiveCurveToRelative(1.784f, -0.814f, 1.784f, -1.816f)
                curveToRelative(0.0f, -1.001f, -0.8f, -1.816f, -1.784f, -1.816f)
                close()
                moveTo(14.56f, 7.094f)
                horizontalLineToRelative(-2.2f)
                lineTo(12.36f, 18.36f)
                horizontalLineToRelative(1.092f)
                curveToRelative(0.176f, -1.633f, 1.544f, -2.907f, 3.192f, -2.907f)
                curveToRelative(1.648f, 0.0f, 3.012f, 1.274f, 3.192f, 2.907f)
                horizontalLineToRelative(0.736f)
                verticalLineToRelative(-5.147f)
                lineToRelative(-6.012f, -6.12f)
                close()
                moveTo(8.432f, 12.904f)
                curveToRelative(0.396f, 0.0f, 0.716f, 0.326f, 0.716f, 0.729f)
                curveToRelative(0.0f, 0.403f, -0.32f, 0.729f, -0.716f, 0.729f)
                lineTo(2.716f, 14.362f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.716f, -0.73f)
                curveToRelative(0.0f, -0.402f, 0.32f, -0.728f, 0.716f, -0.728f)
                close()
                moveTo(5.216f, 9.268f)
                curveToRelative(0.396f, 0.0f, 0.716f, 0.326f, 0.716f, 0.729f)
                curveToRelative(0.0f, 0.403f, -0.32f, 0.729f, -0.716f, 0.729f)
                horizontalLineToRelative(-2.5f)
                arcTo(0.718f, 0.718f, 0.0f, false, true, 2.0f, 10.0f)
                curveToRelative(0.0f, -0.403f, 0.32f, -0.729f, 0.716f, -0.733f)
                close()
            }
        }
        .build()
        return _truckRegular!!
    }

private var _truckRegular: ImageVector? = null
