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

public val RegularGroup.MultideviceoRegular: ImageVector
    get() {
        if (_multideviceoRegular != null) {
            return _multideviceoRegular!!
        }
        _multideviceoRegular = Builder(name = "MultideviceoRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.773f, 2.0f)
                horizontalLineToRelative(-5.185f)
                curveToRelative(-1.223f, 0.0f, -2.223f, 1.013f, -2.223f, 2.25f)
                verticalLineToRelative(0.375f)
                lineTo(4.223f, 4.625f)
                curveTo(3.0f, 4.625f, 2.0f, 5.638f, 2.0f, 6.875f)
                lineTo(2.0f, 20.75f)
                curveTo(2.0f, 21.987f, 3.0f, 23.0f, 4.223f, 23.0f)
                horizontalLineToRelative(10.37f)
                curveToRelative(1.222f, 0.0f, 2.222f, -1.013f, 2.222f, -2.25f)
                lineTo(16.815f, 17.0f)
                horizontalLineToRelative(2.962f)
                curveTo(21.0f, 17.001f, 22.0f, 15.99f, 22.0f, 14.751f)
                lineTo(22.0f, 4.25f)
                curveTo(21.995f, 3.013f, 20.995f, 2.0f, 19.773f, 2.0f)
                close()
                moveTo(13.848f, 5.753f)
                horizontalLineToRelative(6.664f)
                verticalLineToRelative(7.496f)
                horizontalLineToRelative(-6.664f)
                lineTo(13.848f, 5.753f)
                close()
                moveTo(14.588f, 3.503f)
                horizontalLineToRelative(5.185f)
                curveToRelative(0.407f, 0.0f, 0.739f, 0.335f, 0.739f, 0.748f)
                verticalLineToRelative(0.374f)
                horizontalLineToRelative(-6.664f)
                verticalLineToRelative(-0.374f)
                curveToRelative(0.0f, -0.413f, 0.332f, -0.749f, 0.74f, -0.749f)
                close()
                moveTo(4.223f, 6.126f)
                horizontalLineToRelative(8.147f)
                lineTo(12.37f, 7.25f)
                lineTo(3.479f, 7.25f)
                verticalLineToRelative(-0.374f)
                curveToRelative(0.0f, -0.375f, 0.37f, -0.749f, 0.744f, -0.749f)
                close()
                moveTo(14.588f, 21.496f)
                lineTo(4.223f, 21.496f)
                curveToRelative(-0.37f, 0.0f, -0.74f, -0.373f, -0.74f, -0.748f)
                verticalLineToRelative(-0.374f)
                horizontalLineToRelative(11.849f)
                verticalLineToRelative(0.374f)
                curveToRelative(-0.005f, 0.375f, -0.375f, 0.749f, -0.744f, 0.749f)
                close()
                moveTo(15.327f, 19.246f)
                lineTo(3.479f, 19.246f)
                lineTo(3.479f, 8.377f)
                horizontalLineToRelative(8.886f)
                verticalLineToRelative(6.374f)
                curveToRelative(0.0f, 1.238f, 1.0f, 2.25f, 2.223f, 2.25f)
                horizontalLineToRelative(0.739f)
                verticalLineToRelative(2.246f)
                close()
                moveTo(19.773f, 15.498f)
                horizontalLineToRelative(-5.185f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, -0.748f)
                verticalLineToRelative(-0.375f)
                horizontalLineToRelative(6.664f)
                verticalLineToRelative(0.375f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, 0.748f)
                close()
            }
        }
        .build()
        return _multideviceoRegular!!
    }

private var _multideviceoRegular: ImageVector? = null
