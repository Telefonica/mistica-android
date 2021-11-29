package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.RestaurantLight: ImageVector
    get() {
        if (_restaurantLight != null) {
            return _restaurantLight!!
        }
        _restaurantLight = Builder(name = "RestaurantLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.154f, 3.074f)
                verticalLineToRelative(5.358f)
                curveToRelative(0.0f, 0.983f, -0.771f, 1.778f, -1.72f, 1.783f)
                verticalLineToRelative(11.428f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.346f, 0.357f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.346f, -0.357f)
                lineTo(8.742f, 10.215f)
                horizontalLineToRelative(-0.009f)
                curveTo(7.78f, 10.215f, 7.0f, 9.415f, 7.0f, 8.427f)
                lineTo(7.0f, 3.074f)
                curveToRelative(0.0f, -0.196f, 0.155f, -0.356f, 0.346f, -0.356f)
                curveToRelative(0.19f, 0.0f, 0.346f, 0.16f, 0.346f, 0.356f)
                verticalLineToRelative(5.358f)
                curveToRelative(0.0f, 0.59f, 0.465f, 1.07f, 1.037f, 1.07f)
                horizontalLineToRelative(0.009f)
                lineTo(8.738f, 3.074f)
                curveToRelative(0.0f, -0.196f, 0.155f, -0.356f, 0.346f, -0.356f)
                curveToRelative(0.19f, 0.0f, 0.346f, 0.16f, 0.346f, 0.356f)
                verticalLineToRelative(6.428f)
                curveToRelative(0.567f, -0.005f, 1.028f, -0.485f, 1.028f, -1.07f)
                lineTo(10.458f, 3.074f)
                curveToRelative(0.0f, -0.196f, 0.155f, -0.356f, 0.346f, -0.356f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.16f, 0.35f, 0.356f)
                close()
                moveTo(14.963f, 12.359f)
                horizontalLineToRelative(-1.734f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.346f, -0.357f)
                lineTo(12.883f, 4.501f)
                curveTo(12.883f, 3.12f, 13.97f, 2.0f, 15.308f, 2.0f)
                curveToRelative(0.191f, 0.0f, 0.346f, 0.16f, 0.346f, 0.357f)
                verticalLineToRelative(16.786f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.346f, 0.356f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.345f, -0.356f)
                verticalLineToRelative(-6.784f)
                close()
                moveTo(14.963f, 11.646f)
                lineTo(14.963f, 2.754f)
                curveToRelative(-0.79f, 0.165f, -1.384f, 0.887f, -1.384f, 1.751f)
                verticalLineToRelative(7.14f)
                horizontalLineToRelative(1.384f)
                close()
                moveTo(15.308f, 20.574f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, -0.691f, 0.713f)
                curveToRelative(0.0f, 0.393f, 0.31f, 0.713f, 0.691f, 0.713f)
                curveToRelative(0.382f, 0.0f, 0.692f, -0.32f, 0.692f, -0.713f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.692f, -0.713f)
                close()
            }
        }
        .build()
        return _restaurantLight!!
    }

private var _restaurantLight: ImageVector? = null
