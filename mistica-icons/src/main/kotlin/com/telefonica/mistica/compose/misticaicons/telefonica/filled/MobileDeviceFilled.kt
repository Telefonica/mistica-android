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
                moveTo(17.695f, 2.832f)
                curveTo(17.15f, 2.272f, 16.35f, 2.0f, 15.24f, 2.0f)
                lineTo(8.602f, 2.0f)
                curveToRelative(-2.157f, 0.0f, -3.25f, 1.106f, -3.25f, 3.291f)
                verticalLineToRelative(13.104f)
                curveToRelative(0.0f, 2.216f, 1.063f, 3.291f, 3.25f, 3.291f)
                horizontalLineToRelative(6.639f)
                curveToRelative(2.188f, 0.0f, 3.25f, -1.075f, 3.25f, -3.291f)
                lineTo(18.491f, 5.291f)
                curveToRelative(0.0f, -1.106f, -0.261f, -1.91f, -0.796f, -2.46f)
                close()
                moveTo(12.748f, 19.053f)
                curveToRelative(-0.196f, 0.2f, -0.48f, 0.306f, -0.82f, 0.306f)
                curveToRelative(-0.343f, 0.0f, -0.628f, -0.107f, -0.822f, -0.306f)
                curveToRelative(-0.193f, -0.199f, -0.288f, -0.47f, -0.288f, -0.81f)
                curveToRelative(0.0f, -0.697f, 0.414f, -1.114f, 1.112f, -1.114f)
                curveToRelative(0.697f, 0.0f, 1.11f, 0.417f, 1.11f, 1.115f)
                curveToRelative(-0.004f, 0.339f, -0.102f, 0.61f, -0.292f, 0.81f)
                close()
            }
        }
        .build()
        return _mobileDeviceFilled!!
    }

private var _mobileDeviceFilled: ImageVector? = null
