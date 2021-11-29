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

public val RegularGroup.BatteryChargingRegular: ImageVector
    get() {
        if (_batteryChargingRegular != null) {
            return _batteryChargingRegular!!
        }
        _batteryChargingRegular = Builder(name = "BatteryChargingRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.86f, 2.0f)
                verticalLineToRelative(1.788f)
                horizontalLineToRelative(1.068f)
                curveToRelative(1.18f, 0.0f, 2.144f, 0.96f, 2.144f, 2.144f)
                lineTo(18.072f, 19.86f)
                curveToRelative(0.0f, 1.176f, -0.96f, 2.14f, -2.144f, 2.14f)
                lineTo(8.076f, 22.0f)
                curveToRelative(-1.18f, 0.0f, -2.144f, -0.96f, -2.144f, -2.144f)
                lineTo(5.932f, 5.928f)
                curveToRelative(0.0f, -1.18f, 0.96f, -2.144f, 2.144f, -2.144f)
                horizontalLineToRelative(1.068f)
                lineTo(9.144f, 2.0f)
                horizontalLineToRelative(5.716f)
                close()
                moveTo(13.436f, 3.428f)
                lineTo(10.58f, 3.428f)
                verticalLineToRelative(1.788f)
                lineTo(8.076f, 5.216f)
                verticalLineToRelative(-0.004f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.712f, 0.712f)
                verticalLineToRelative(13.928f)
                curveToRelative(0.0f, 0.392f, 0.32f, 0.712f, 0.712f, 0.712f)
                horizontalLineToRelative(7.86f)
                curveToRelative(0.392f, 0.0f, 0.712f, -0.32f, 0.712f, -0.712f)
                lineTo(16.648f, 5.928f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.712f, -0.712f)
                horizontalLineToRelative(-2.5f)
                lineTo(13.436f, 3.428f)
                close()
                moveTo(13.088f, 7.452f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, 0.256f, 0.98f)
                lineToRelative(-1.876f, 3.208f)
                horizontalLineToRelative(2.328f)
                curveToRelative(0.256f, 0.0f, 0.492f, 0.136f, 0.616f, 0.356f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, true, -0.004f, 0.716f)
                lineTo(11.908f, 17.0f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, -0.98f, 0.26f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, -0.256f, -0.98f)
                lineToRelative(1.876f, -3.212f)
                lineTo(10.22f, 13.068f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, true, -0.616f, -0.356f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, true, 0.004f, -0.716f)
                lineToRelative(2.5f, -4.288f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, 0.98f, -0.256f)
                close()
            }
        }
        .build()
        return _batteryChargingRegular!!
    }

private var _batteryChargingRegular: ImageVector? = null
