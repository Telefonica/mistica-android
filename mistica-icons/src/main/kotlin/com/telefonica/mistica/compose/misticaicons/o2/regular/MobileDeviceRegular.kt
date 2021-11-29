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
                moveTo(15.216f, 2.0f)
                lineTo(8.784f, 2.0f)
                arcToRelative(3.578f, 3.578f, 0.0f, false, false, -3.572f, 3.572f)
                verticalLineToRelative(12.856f)
                arcTo(3.578f, 3.578f, 0.0f, false, false, 8.784f, 22.0f)
                horizontalLineToRelative(6.428f)
                arcToRelative(3.578f, 3.578f, 0.0f, false, false, 3.572f, -3.572f)
                lineTo(18.784f, 5.572f)
                curveToRelative(0.0f, -1.968f, -1.6f, -3.572f, -3.568f, -3.572f)
                close()
                moveTo(6.644f, 17.356f)
                lineTo(6.644f, 6.644f)
                lineTo(17.36f, 6.644f)
                lineTo(17.36f, 17.36f)
                lineTo(6.644f, 17.36f)
                verticalLineToRelative(-0.004f)
                close()
                moveTo(8.784f, 3.428f)
                horizontalLineToRelative(6.428f)
                curveToRelative(1.06f, 0.0f, 1.94f, 0.772f, 2.112f, 1.784f)
                lineTo(6.672f, 5.212f)
                arcToRelative(2.149f, 2.149f, 0.0f, false, true, 2.112f, -1.784f)
                close()
                moveTo(15.216f, 20.572f)
                lineTo(8.784f, 20.572f)
                curveToRelative(-1.06f, 0.0f, -1.94f, -0.772f, -2.112f, -1.784f)
                horizontalLineToRelative(10.652f)
                arcToRelative(2.141f, 2.141f, 0.0f, false, true, -2.108f, 1.784f)
                close()
            }
        }
        .build()
        return _mobileDeviceRegular!!
    }

private var _mobileDeviceRegular: ImageVector? = null
