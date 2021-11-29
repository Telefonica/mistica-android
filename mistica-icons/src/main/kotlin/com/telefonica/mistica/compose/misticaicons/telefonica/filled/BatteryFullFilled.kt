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

public val FilledGroup.BatteryFullFilled: ImageVector
    get() {
        if (_batteryFullFilled != null) {
            return _batteryFullFilled!!
        }
        _batteryFullFilled = Builder(name = "BatteryFullFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.542f, 18.499f)
                lineTo(16.542f, 7.639f)
                curveToRelative(0.0f, -0.742f, -0.165f, -1.266f, -0.507f, -1.602f)
                curveToRelative(-0.342f, -0.34f, -0.874f, -0.502f, -1.63f, -0.502f)
                lineTo(8.898f, 5.535f)
                curveToRelative(-0.745f, 0.0f, -1.278f, 0.168f, -1.625f, 0.516f)
                curveToRelative(-0.344f, 0.341f, -0.513f, 0.862f, -0.513f, 1.59f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 0.751f, 0.166f, 1.278f, 0.51f, 1.611f)
                curveToRelative(0.34f, 0.334f, 0.871f, 0.493f, 1.628f, 0.493f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.753f, 0.0f, 1.288f, -0.162f, 1.627f, -0.493f)
                curveToRelative(0.342f, -0.336f, 0.507f, -0.862f, 0.507f, -1.613f)
                close()
                moveTo(10.217f, 3.49f)
                curveToRelative(-0.073f, 0.072f, -0.09f, 0.232f, -0.09f, 0.355f)
                verticalLineToRelative(0.443f)
                horizontalLineToRelative(3.048f)
                verticalLineToRelative(-0.446f)
                curveToRelative(0.0f, -0.103f, -0.011f, -0.285f, -0.084f, -0.358f)
                curveToRelative(-0.073f, -0.073f, -0.26f, -0.084f, -0.364f, -0.084f)
                horizontalLineToRelative(-2.149f)
                curveToRelative(-0.126f, 0.003f, -0.288f, 0.017f, -0.36f, 0.09f)
                close()
                moveTo(16.929f, 5.156f)
                curveToRelative(0.588f, 0.583f, 0.873f, 1.392f, 0.873f, 2.482f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 1.098f, -0.288f, 1.913f, -0.882f, 2.493f)
                curveToRelative(-0.588f, 0.577f, -1.412f, 0.854f, -2.515f, 0.854f)
                lineTo(8.898f, 21.845f)
                curveToRelative(-1.104f, 0.0f, -1.927f, -0.28f, -2.516f, -0.854f)
                curveToRelative(-0.593f, -0.58f, -0.882f, -1.395f, -0.882f, -2.496f)
                lineTo(5.5f, 7.64f)
                curveToRelative(0.0f, -1.07f, 0.286f, -1.877f, 0.874f, -2.465f)
                curveToRelative(0.591f, -0.588f, 1.409f, -0.877f, 2.493f, -0.882f)
                verticalLineToRelative(-0.449f)
                curveToRelative(0.0f, -0.515f, 0.151f, -0.93f, 0.454f, -1.226f)
                curveToRelative(0.302f, -0.303f, 0.725f, -0.457f, 1.255f, -0.457f)
                horizontalLineToRelative(2.148f)
                curveToRelative(0.532f, 0.0f, 0.955f, 0.151f, 1.258f, 0.451f)
                curveToRelative(0.3f, 0.297f, 0.45f, 0.714f, 0.45f, 1.235f)
                verticalLineToRelative(0.448f)
                curveToRelative(1.096f, 0.003f, 1.914f, 0.286f, 2.497f, 0.863f)
                close()
                moveTo(15.164f, 6.52f)
                curveToRelative(0.347f, 0.0f, 0.63f, 0.28f, 0.63f, 0.622f)
                verticalLineToRelative(10.731f)
                curveToRelative(0.0f, 1.219f, -1.006f, 2.207f, -2.24f, 2.207f)
                lineTo(9.748f, 20.08f)
                curveToRelative(-1.235f, 0.0f, -2.24f, -0.988f, -2.24f, -2.207f)
                lineTo(7.508f, 7.144f)
                curveToRelative(0.0f, -0.343f, 0.282f, -0.623f, 0.63f, -0.623f)
                horizontalLineToRelative(7.025f)
                close()
            }
        }
        .build()
        return _batteryFullFilled!!
    }

private var _batteryFullFilled: ImageVector? = null
