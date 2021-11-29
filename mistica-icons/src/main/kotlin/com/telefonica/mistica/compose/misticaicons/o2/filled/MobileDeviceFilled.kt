package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.MobileDeviceFilled: ImageVector
    get() {
        if (_mobileDeviceFilled != null) {
            return _mobileDeviceFilled!!
        }
        _mobileDeviceFilled = Builder(name = "MobileDeviceFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.989f, 5.388f)
                curveTo(18.897f, 3.504f, 17.402f, 2.0f, 15.579f, 2.0f)
                lineTo(9.418f, 2.0f)
                curveTo(7.594f, 2.0f, 6.1f, 3.504f, 6.008f, 5.388f)
                horizontalLineToRelative(12.98f)
                close()
                moveTo(6.0f, 6.46f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(11.08f)
                lineTo(6.0f, 17.54f)
                lineTo(6.0f, 6.46f)
                close()
                moveTo(6.008f, 18.612f)
                curveTo(6.096f, 20.496f, 7.59f, 22.0f, 9.418f, 22.0f)
                horizontalLineToRelative(6.157f)
                curveToRelative(1.827f, 0.0f, 3.322f, -1.504f, 3.41f, -3.388f)
                lineTo(6.008f, 18.612f)
                close()
            }
        }
        .build()
        return _mobileDeviceFilled!!
    }

private var _mobileDeviceFilled: ImageVector? = null
