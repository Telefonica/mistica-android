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

public val RegularGroup.ShopRegular: ImageVector
    get() {
        if (_shopRegular != null) {
            return _shopRegular!!
        }
        _shopRegular = Builder(name = "ShopRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.477f, 6.53f)
                horizontalLineToRelative(-2.654f)
                verticalLineToRelative(-0.567f)
                curveToRelative(0.0f, -2.19f, -1.711f, -3.963f, -3.82f, -3.963f)
                curveToRelative(-2.107f, 0.0f, -3.818f, 1.776f, -3.818f, 3.963f)
                verticalLineToRelative(0.567f)
                lineTo(5.53f, 6.53f)
                lineTo(4.0f, 19.661f)
                verticalLineToRelative(0.076f)
                curveTo(4.0f, 21.094f, 4.727f, 22.0f, 5.815f, 22.0f)
                horizontalLineToRelative(12.37f)
                curveTo(19.277f, 22.0f, 20.0f, 21.094f, 20.0f, 19.737f)
                lineTo(18.477f, 6.53f)
                close()
                moveTo(9.638f, 5.963f)
                curveToRelative(0.0f, -1.357f, 1.054f, -2.454f, 2.366f, -2.454f)
                curveToRelative(1.311f, 0.0f, 2.365f, 1.093f, 2.365f, 2.454f)
                verticalLineToRelative(0.567f)
                lineTo(9.64f, 6.53f)
                verticalLineToRelative(-0.567f)
                close()
                moveTo(18.185f, 20.491f)
                lineTo(5.819f, 20.491f)
                curveToRelative(-0.327f, 0.0f, -0.361f, -0.49f, -0.361f, -0.714f)
                lineTo(6.842f, 8.043f)
                horizontalLineToRelative(10.366f)
                lineToRelative(1.346f, 11.734f)
                curveToRelative(-0.004f, 0.223f, -0.042f, 0.714f, -0.37f, 0.714f)
                close()
            }
        }
        .build()
        return _shopRegular!!
    }

private var _shopRegular: ImageVector? = null
