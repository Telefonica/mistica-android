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

public val FilledGroup.BatteryChargingFilled: ImageVector
    get() {
        if (_batteryChargingFilled != null) {
            return _batteryChargingFilled!!
        }
        _batteryChargingFilled = Builder(name = "BatteryChargingFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.874f, 3.783f)
                horizontalLineTo(14.82f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.173f)
                verticalLineToRelative(1.787f)
                horizontalLineTo(8.118f)
                curveTo(6.948f, 3.787f, 6.0f, 4.747f, 6.0f, 5.93f)
                verticalLineToRelative(13.927f)
                curveTo(6.0f, 21.04f, 6.948f, 22.0f, 8.118f, 22.0f)
                horizontalLineToRelative(7.764f)
                curveToRelative(1.17f, 0.0f, 2.118f, -0.96f, 2.118f, -2.143f)
                verticalLineTo(5.927f)
                curveToRelative(-0.008f, -1.184f, -0.956f, -2.144f, -2.126f, -2.144f)
                moveToRelative(-1.66f, 8.837f)
                lineToRelative(-2.43f, 4.274f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.726f, 0.196f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.194f, -0.732f)
                lineToRelative(1.976f, -3.47f)
                horizontalLineTo(10.2f)
                curveToRelative(-0.186f, 0.0f, -0.36f, -0.1f, -0.462f, -0.268f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.0f, -0.536f)
                lineToRelative(2.43f, -4.286f)
                arcToRelative(0.523f, 0.523f, 0.0f, false, true, 0.723f, -0.196f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.194f, 0.731f)
                lineToRelative(-1.98f, 3.483f)
                horizontalLineToRelative(2.643f)
                curveToRelative(0.186f, 0.0f, 0.36f, 0.104f, 0.463f, 0.268f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.004f, 0.536f)
            }
        }
        .build()
        return _batteryChargingFilled!!
    }

private var _batteryChargingFilled: ImageVector? = null
