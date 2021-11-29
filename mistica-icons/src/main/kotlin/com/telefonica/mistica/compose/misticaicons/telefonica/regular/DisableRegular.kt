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

public val RegularGroup.DisableRegular: ImageVector
    get() {
        if (_disableRegular != null) {
            return _disableRegular!!
        }
        _disableRegular = Builder(name = "DisableRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 22.5f)
                curveToRelative(-3.166f, 0.0f, -5.597f, -0.696f, -7.322f, -2.092f)
                lineToRelative(15.73f, -15.73f)
                curveToRelative(1.4f, 1.725f, 2.096f, 4.16f, 2.096f, 7.329f)
                curveToRelative(0.0f, 7.058f, -3.439f, 10.494f, -10.504f, 10.494f)
                moveToRelative(0.0f, -21.002f)
                curveToRelative(3.182f, 0.0f, 5.62f, 0.704f, 7.348f, 2.114f)
                lineTo(3.613f, 19.349f)
                curveToRelative(-1.41f, -1.728f, -2.114f, -4.166f, -2.114f, -7.346f)
                curveTo(1.5f, 4.935f, 4.935f, 1.5f, 11.997f, 1.5f)
                moveToRelative(0.0f, -1.499f)
                curveTo(4.415f, 0.0f, 0.0f, 3.828f, 0.0f, 12.003f)
                curveTo(0.0f, 20.18f, 4.415f, 24.0f, 11.997f, 24.0f)
                curveTo(19.577f, 24.0f, 24.0f, 20.179f, 24.0f, 12.003f)
                curveTo(24.0f, 3.828f, 19.578f, 0.0f, 11.997f, 0.0f)
            }
        }
        .build()
        return _disableRegular!!
    }

private var _disableRegular: ImageVector? = null
