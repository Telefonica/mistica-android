package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.MobileDeviceRegular: ImageVector
    get() {
        if (_mobileDeviceRegular != null) {
            return _mobileDeviceRegular!!
        }
        _mobileDeviceRegular = Builder(name = "MobileDeviceRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.11f, 3.35f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.76f, 0.76f)
                verticalLineToRelative(15.78f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.76f, 0.76f, 0.76f)
                horizontalLineToRelative(7.172f)
                curveToRelative(0.42f, 0.0f, 0.76f, -0.34f, 0.76f, -0.76f)
                verticalLineTo(4.11f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.76f, -0.76f)
                horizontalLineTo(8.11f)
                close()
                moveTo(15.281f, 22.0f)
                horizontalLineTo(8.11f)
                arcTo(2.112f, 2.112f, 0.0f, false, true, 6.0f, 19.89f)
                verticalLineTo(4.11f)
                curveTo(6.0f, 2.945f, 6.946f, 2.0f, 8.11f, 2.0f)
                horizontalLineToRelative(7.172f)
                curveToRelative(1.163f, 0.0f, 2.11f, 0.946f, 2.11f, 2.11f)
                verticalLineToRelative(15.78f)
                curveToRelative(0.0f, 1.164f, -0.947f, 2.11f, -2.11f, 2.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.096f, 19.437f)
                horizontalLineToRelative(3.2f)
                verticalLineToRelative(-3.2f)
                horizontalLineToRelative(-3.2f)
                close()
            }
        }
        .build()
        return _mobileDeviceRegular!!
    }

private var _mobileDeviceRegular: ImageVector? = null
