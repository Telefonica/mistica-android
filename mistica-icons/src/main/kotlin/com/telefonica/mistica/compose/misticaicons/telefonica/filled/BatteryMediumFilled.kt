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

public val FilledGroup.BatteryMediumFilled: ImageVector
    get() {
        if (_batteryMediumFilled != null) {
            return _batteryMediumFilled!!
        }
        _batteryMediumFilled = Builder(name = "BatteryMediumFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.542f, 18.499f)
                lineTo(16.542f, 7.639f)
                curveToRelative(0.0f, -0.742f, -0.165f, -1.266f, -0.507f, -1.605f)
                curveToRelative(-0.342f, -0.336f, -0.874f, -0.501f, -1.63f, -0.501f)
                lineTo(8.898f, 5.533f)
                curveToRelative(-0.745f, 0.0f, -1.278f, 0.168f, -1.625f, 0.515f)
                curveToRelative(-0.344f, 0.342f, -0.513f, 0.863f, -0.513f, 1.591f)
                verticalLineToRelative(10.857f)
                curveToRelative(0.0f, 0.748f, 0.166f, 1.277f, 0.51f, 1.61f)
                curveToRelative(0.34f, 0.334f, 0.871f, 0.494f, 1.625f, 0.494f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.753f, 0.0f, 1.288f, -0.16f, 1.627f, -0.493f)
                curveToRelative(0.345f, -0.33f, 0.51f, -0.86f, 0.51f, -1.608f)
                close()
                moveTo(10.217f, 3.49f)
                curveToRelative(-0.073f, 0.072f, -0.09f, 0.232f, -0.09f, 0.355f)
                verticalLineToRelative(0.446f)
                horizontalLineToRelative(3.048f)
                verticalLineToRelative(-0.446f)
                curveToRelative(0.0f, -0.103f, -0.011f, -0.285f, -0.087f, -0.358f)
                curveToRelative(-0.073f, -0.073f, -0.258f, -0.084f, -0.361f, -0.084f)
                horizontalLineToRelative(-2.149f)
                curveToRelative(-0.126f, 0.0f, -0.288f, 0.014f, -0.36f, 0.087f)
                close()
                moveTo(16.929f, 5.156f)
                curveToRelative(0.588f, 0.583f, 0.873f, 1.392f, 0.873f, 2.482f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 1.098f, -0.288f, 1.913f, -0.882f, 2.493f)
                curveToRelative(-0.588f, 0.574f, -1.412f, 0.854f, -2.515f, 0.854f)
                lineTo(8.898f, 21.845f)
                curveToRelative(-1.104f, 0.0f, -1.927f, -0.28f, -2.516f, -0.854f)
                curveToRelative(-0.593f, -0.583f, -0.882f, -1.398f, -0.882f, -2.496f)
                lineTo(5.5f, 7.64f)
                curveToRelative(0.0f, -1.073f, 0.286f, -1.88f, 0.874f, -2.465f)
                curveToRelative(0.591f, -0.588f, 1.409f, -0.877f, 2.493f, -0.882f)
                verticalLineToRelative(-0.446f)
                curveToRelative(0.0f, -0.515f, 0.151f, -0.93f, 0.454f, -1.23f)
                curveToRelative(0.302f, -0.302f, 0.725f, -0.456f, 1.255f, -0.456f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.532f, 0.0f, 0.955f, 0.151f, 1.258f, 0.451f)
                curveToRelative(0.3f, 0.3f, 0.454f, 0.714f, 0.454f, 1.235f)
                verticalLineToRelative(0.446f)
                curveToRelative(1.092f, 0.005f, 1.91f, 0.288f, 2.493f, 0.865f)
                close()
                moveTo(15.164f, 11.986f)
                curveToRelative(0.347f, 0.0f, 0.63f, 0.277f, 0.63f, 0.621f)
                verticalLineToRelative(5.266f)
                curveToRelative(0.0f, 1.219f, -1.006f, 2.207f, -2.24f, 2.207f)
                lineTo(9.751f, 20.08f)
                curveToRelative(-1.235f, 0.0f, -2.24f, -0.988f, -2.24f, -2.207f)
                verticalLineToRelative(-5.266f)
                curveToRelative(0.0f, -0.342f, 0.282f, -0.622f, 0.63f, -0.622f)
                horizontalLineToRelative(7.022f)
                close()
            }
        }
        .build()
        return _batteryMediumFilled!!
    }

private var _batteryMediumFilled: ImageVector? = null
