package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.TkRegular: ImageVector
    get() {
        if (_tkRegular != null) {
            return _tkRegular!!
        }
        _tkRegular = Builder(name = "TkRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 3.357f)
                curveToRelative(-5.728f, 0.0f, -8.633f, 2.908f, -8.633f, 8.639f)
                curveToRelative(0.0f, 5.728f, 2.905f, 8.633f, 8.633f, 8.633f)
                curveToRelative(5.731f, 0.0f, 8.639f, -2.905f, 8.639f, -8.633f)
                curveToRelative(0.0f, -5.731f, -2.908f, -8.639f, -8.639f, -8.639f)
                close()
                moveTo(11.99f, 21.837f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.404f, -9.84f, -9.841f)
                curveToRelative(0.0f, -6.443f, 3.403f, -9.846f, 9.84f, -9.846f)
                curveToRelative(6.443f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                close()
                moveTo(11.682f, 7.228f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, 0.392f, 0.49f)
                lineTo(12.0f, 8.064f)
                arcToRelative(0.401f, 0.401f, 0.0f, false, true, -0.392f, 0.314f)
                lineTo(9.228f, 8.378f)
                verticalLineToRelative(7.98f)
                curveToRelative(0.0f, 0.222f, -0.179f, 0.404f, -0.403f, 0.404f)
                horizontalLineToRelative(-0.38f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.404f, -0.404f)
                verticalLineToRelative(-7.98f)
                lineTo(5.609f, 8.378f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.403f, -0.403f)
                verticalLineToRelative(-0.345f)
                curveToRelative(0.0f, -0.221f, 0.18f, -0.403f, 0.403f, -0.403f)
                horizontalLineToRelative(6.073f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(18.722f, 16.148f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, -0.345f, 0.61f)
                horizontalLineToRelative(-0.434f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.345f, -0.196f)
                lineToRelative(-2.585f, -4.325f)
                lineToRelative(-1.031f, 1.286f)
                verticalLineToRelative(2.831f)
                curveToRelative(0.0f, 0.222f, -0.18f, 0.404f, -0.403f, 0.404f)
                horizontalLineToRelative(-0.381f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.404f, -0.404f)
                lineTo(12.794f, 7.63f)
                curveToRelative(0.0f, -0.221f, 0.18f, -0.403f, 0.404f, -0.403f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.225f, 0.0f, 0.404f, 0.179f, 0.404f, 0.403f)
                verticalLineToRelative(4.064f)
                lineToRelative(3.429f, -4.316f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, 0.316f, -0.151f)
                horizontalLineToRelative(0.445f)
                curveToRelative(0.154f, 0.0f, 0.295f, 0.086f, 0.365f, 0.227f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.048f, 0.425f)
                lineToRelative(-2.698f, 3.404f)
                lineToRelative(2.93f, 4.865f)
                close()
            }
        }
        .build()
        return _tkRegular!!
    }

private var _tkRegular: ImageVector? = null
