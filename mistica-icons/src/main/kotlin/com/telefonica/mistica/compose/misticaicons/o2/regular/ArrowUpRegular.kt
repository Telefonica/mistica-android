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

public val RegularGroup.ArrowUpRegular: ImageVector
    get() {
        if (_arrowUpRegular != null) {
            return _arrowUpRegular!!
        }
        _arrowUpRegular = Builder(name = "ArrowUpRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.849f, 23.0f)
                curveToRelative(0.407f, 0.0f, 0.742f, -0.356f, 0.742f, -0.788f)
                verticalLineToRelative(-9.23f)
                horizontalLineTo(4.213f)
                curveToRelative(-0.37f, 0.0f, -0.593f, -0.313f, -0.666f, -0.59f)
                curveToRelative(-0.038f, -0.12f, -0.15f, -0.51f, 0.112f, -0.788f)
                lineToRelative(8.34f, -8.444f)
                lineToRelative(8.341f, 8.444f)
                curveToRelative(0.262f, 0.277f, 0.19f, 0.669f, 0.112f, 0.788f)
                curveToRelative(-0.112f, 0.237f, -0.335f, 0.59f, -0.666f, 0.59f)
                horizontalLineToRelative(-5.378f)
                verticalLineToRelative(9.23f)
                curveToRelative(0.0f, 0.436f, 0.335f, 0.788f, 0.742f, 0.788f)
                curveToRelative(0.408f, 0.0f, 0.743f, -0.356f, 0.743f, -0.788f)
                verticalLineToRelative(-7.66f)
                horizontalLineToRelative(3.893f)
                curveToRelative(0.889f, 0.0f, 1.705f, -0.63f, 2.04f, -1.531f)
                curveToRelative(0.334f, -0.863f, 0.188f, -1.848f, -0.447f, -2.477f)
                lineTo(11.999f, 1.0f)
                lineTo(2.62f, 10.508f)
                curveToRelative(-0.631f, 0.67f, -0.781f, 1.61f, -0.446f, 2.513f)
                curveToRelative(0.369f, 0.906f, 1.15f, 1.531f, 2.039f, 1.531f)
                horizontalLineToRelative(3.893f)
                verticalLineToRelative(7.66f)
                curveToRelative(0.0f, 0.432f, 0.335f, 0.788f, 0.743f, 0.788f)
                close()
            }
        }
        .build()
        return _arrowUpRegular!!
    }

private var _arrowUpRegular: ImageVector? = null
