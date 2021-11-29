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

public val RegularGroup.MobileDeviceRegular: ImageVector
    get() {
        if (_mobileDeviceRegular != null) {
            return _mobileDeviceRegular!!
        }
        _mobileDeviceRegular = Builder(name = "MobileDeviceRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.238f, 2.0f)
                curveToRelative(2.182f, 0.0f, 3.47f, 1.243f, 3.47f, 3.472f)
                verticalLineToRelative(13.376f)
                curveToRelative(0.0f, 2.23f, -1.288f, 3.473f, -3.47f, 3.473f)
                lineTo(8.47f, 22.321f)
                curveTo(6.289f, 22.321f, 5.0f, 21.077f, 5.0f, 18.848f)
                lineTo(5.0f, 5.472f)
                curveTo(5.0f, 3.242f, 6.289f, 2.0f, 8.47f, 2.0f)
                close()
                moveTo(15.238f, 3.5f)
                lineTo(8.47f, 3.5f)
                curveTo(7.105f, 3.5f, 6.5f, 4.084f, 6.5f, 5.472f)
                verticalLineToRelative(13.376f)
                curveToRelative(0.0f, 1.389f, 0.606f, 1.973f, 1.97f, 1.973f)
                horizontalLineToRelative(6.768f)
                curveToRelative(1.365f, 0.0f, 1.97f, -0.584f, 1.97f, -1.973f)
                lineTo(17.208f, 5.472f)
                curveToRelative(0.0f, -1.388f, -0.604f, -1.972f, -1.97f, -1.972f)
                close()
                moveTo(11.854f, 16.16f)
                curveToRelative(0.61f, 0.0f, 1.007f, 0.317f, 1.007f, 1.0f)
                curveToRelative(0.0f, 0.328f, -0.092f, 0.572f, -0.254f, 0.735f)
                curveToRelative(-0.177f, 0.18f, -0.436f, 0.265f, -0.753f, 0.265f)
                reflectiveCurveToRelative(-0.576f, -0.085f, -0.753f, -0.265f)
                curveToRelative(-0.162f, -0.163f, -0.254f, -0.407f, -0.254f, -0.735f)
                curveToRelative(0.0f, -0.683f, 0.397f, -1.0f, 1.007f, -1.0f)
                close()
            }
        }
        .build()
        return _mobileDeviceRegular!!
    }

private var _mobileDeviceRegular: ImageVector? = null
