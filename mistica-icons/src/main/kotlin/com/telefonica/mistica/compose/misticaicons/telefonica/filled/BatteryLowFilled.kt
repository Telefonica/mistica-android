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

public val FilledGroup.BatteryLowFilled: ImageVector
    get() {
        if (_batteryLowFilled != null) {
            return _batteryLowFilled!!
        }
        _batteryLowFilled = Builder(name = "BatteryLowFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.545f, 18.499f)
                lineTo(16.545f, 7.639f)
                curveToRelative(0.0f, -0.742f, -0.165f, -1.266f, -0.507f, -1.602f)
                curveToRelative(-0.342f, -0.34f, -0.874f, -0.502f, -1.63f, -0.502f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-0.745f, 0.0f, -1.278f, 0.168f, -1.625f, 0.516f)
                curveToRelative(-0.344f, 0.341f, -0.51f, 0.863f, -0.51f, 1.59f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 0.749f, 0.166f, 1.278f, 0.51f, 1.611f)
                curveToRelative(0.339f, 0.334f, 0.874f, 0.493f, 1.628f, 0.493f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.753f, 0.0f, 1.285f, -0.162f, 1.627f, -0.493f)
                curveToRelative(0.342f, -0.336f, 0.507f, -0.865f, 0.507f, -1.613f)
                close()
                moveTo(10.22f, 3.493f)
                curveToRelative(-0.073f, 0.07f, -0.087f, 0.233f, -0.087f, 0.353f)
                verticalLineToRelative(0.446f)
                horizontalLineToRelative(3.048f)
                verticalLineToRelative(-0.446f)
                curveToRelative(0.0f, -0.1f, -0.012f, -0.283f, -0.084f, -0.355f)
                curveToRelative(-0.076f, -0.076f, -0.26f, -0.085f, -0.365f, -0.085f)
                horizontalLineToRelative(-2.148f)
                curveToRelative(-0.129f, -0.002f, -0.291f, 0.012f, -0.364f, 0.087f)
                close()
                moveTo(16.931f, 5.157f)
                curveToRelative(0.589f, 0.583f, 0.874f, 1.392f, 0.874f, 2.482f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 1.098f, -0.288f, 1.913f, -0.882f, 2.493f)
                curveToRelative(-0.588f, 0.574f, -1.412f, 0.854f, -2.515f, 0.854f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-1.104f, 0.0f, -1.927f, -0.28f, -2.516f, -0.854f)
                curveToRelative(-0.593f, -0.58f, -0.882f, -1.398f, -0.882f, -2.493f)
                lineTo(5.5f, 7.639f)
                curveToRelative(0.0f, -1.07f, 0.286f, -1.877f, 0.874f, -2.465f)
                curveToRelative(0.591f, -0.588f, 1.409f, -0.877f, 2.493f, -0.882f)
                verticalLineToRelative(-0.446f)
                curveToRelative(0.0f, -0.515f, 0.154f, -0.93f, 0.454f, -1.23f)
                curveToRelative(0.305f, -0.302f, 0.728f, -0.456f, 1.255f, -0.456f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.535f, 0.0f, 0.958f, 0.151f, 1.258f, 0.451f)
                curveToRelative(0.3f, 0.297f, 0.45f, 0.711f, 0.45f, 1.232f)
                verticalLineToRelative(0.446f)
                curveToRelative(1.099f, 0.008f, 1.917f, 0.291f, 2.5f, 0.868f)
                close()
                moveTo(15.167f, 16.958f)
                curveToRelative(0.347f, 0.0f, 0.63f, 0.278f, 0.63f, 0.622f)
                verticalLineToRelative(0.294f)
                curveToRelative(0.0f, 1.219f, -0.941f, 2.21f, -2.095f, 2.21f)
                lineTo(9.609f, 20.084f)
                curveToRelative(-1.154f, 0.0f, -2.095f, -0.991f, -2.095f, -2.21f)
                verticalLineToRelative(-0.294f)
                curveToRelative(0.0f, -0.342f, 0.283f, -0.622f, 0.63f, -0.622f)
                horizontalLineToRelative(7.023f)
                close()
            }
        }
        .build()
        return _batteryLowFilled!!
    }

private var _batteryLowFilled: ImageVector? = null
