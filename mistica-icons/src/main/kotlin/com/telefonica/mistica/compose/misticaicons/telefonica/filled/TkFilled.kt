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

public val FilledGroup.TkFilled: ImageVector
    get() {
        if (_tkFilled != null) {
            return _tkFilled!!
        }
        _tkFilled = Builder(name = "TkFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.727f, 16.553f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, -0.35f, 0.205f)
                horizontalLineToRelative(-0.434f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, true, -0.345f, -0.196f)
                lineToRelative(-2.585f, -4.325f)
                lineToRelative(-1.028f, 1.286f)
                verticalLineToRelative(2.831f)
                curveToRelative(0.0f, 0.222f, -0.18f, 0.404f, -0.404f, 0.404f)
                horizontalLineToRelative(-0.383f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.404f, -0.404f)
                lineTo(12.794f, 7.626f)
                curveToRelative(0.0f, -0.221f, 0.18f, -0.403f, 0.404f, -0.403f)
                horizontalLineToRelative(0.383f)
                curveToRelative(0.222f, 0.0f, 0.404f, 0.18f, 0.404f, 0.403f)
                verticalLineToRelative(4.065f)
                lineToRelative(3.428f, -4.317f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, 0.317f, -0.151f)
                horizontalLineToRelative(0.445f)
                curveToRelative(0.154f, 0.0f, 0.294f, 0.09f, 0.362f, 0.227f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.048f, 0.425f)
                lineToRelative(-2.695f, 3.404f)
                lineToRelative(2.93f, 4.865f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.003f, 0.41f)
                close()
                moveTo(11.999f, 8.063f)
                arcToRelative(0.401f, 0.401f, 0.0f, false, true, -0.392f, 0.314f)
                lineTo(9.228f, 8.377f)
                verticalLineToRelative(7.98f)
                curveToRelative(0.0f, 0.222f, -0.179f, 0.404f, -0.403f, 0.404f)
                horizontalLineToRelative(-0.38f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, true, -0.404f, -0.404f)
                verticalLineToRelative(-7.98f)
                lineTo(5.609f, 8.377f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.403f, -0.403f)
                verticalLineToRelative(-0.345f)
                curveToRelative(0.0f, -0.221f, 0.18f, -0.403f, 0.403f, -0.403f)
                horizontalLineToRelative(6.073f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, 0.392f, 0.49f)
                lineTo(12.0f, 8.063f)
                close()
                moveTo(11.99f, 2.15f)
                curveToRelative(-6.437f, 0.0f, -9.84f, 3.403f, -9.84f, 9.846f)
                curveToRelative(0.0f, 6.437f, 3.403f, 9.84f, 9.84f, 9.84f)
                curveToRelative(6.443f, 0.0f, 9.846f, -3.403f, 9.846f, -9.84f)
                curveToRelative(0.0f, -6.443f, -3.403f, -9.846f, -9.846f, -9.846f)
                close()
            }
        }
        .build()
        return _tkFilled!!
    }

private var _tkFilled: ImageVector? = null
