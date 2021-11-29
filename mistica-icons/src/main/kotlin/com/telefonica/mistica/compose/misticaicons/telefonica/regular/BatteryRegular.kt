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

public val RegularGroup.BatteryRegular: ImageVector
    get() {
        if (_batteryRegular != null) {
            return _batteryRegular!!
        }
        _batteryRegular = Builder(name = "BatteryRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.217f, 18.339f)
                curveToRelative(0.0f, 0.748f, -0.165f, 1.277f, -0.51f, 1.61f)
                curveToRelative(-0.341f, 0.334f, -0.874f, 0.494f, -1.627f, 0.494f)
                lineTo(9.573f, 20.443f)
                curveToRelative(-0.754f, 0.0f, -1.289f, -0.16f, -1.628f, -0.493f)
                curveToRelative(-0.344f, -0.334f, -0.51f, -0.863f, -0.51f, -1.611f)
                lineTo(7.435f, 7.479f)
                curveToRelative(0.0f, -0.728f, 0.166f, -1.25f, 0.513f, -1.591f)
                curveToRelative(0.348f, -0.347f, 0.88f, -0.515f, 1.625f, -0.515f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.756f, 0.0f, 1.288f, 0.165f, 1.63f, 0.5f)
                curveToRelative(0.342f, 0.34f, 0.507f, 0.864f, 0.507f, 1.606f)
                lineToRelative(-0.003f, 10.86f)
                close()
                moveTo(10.895f, 3.686f)
                curveToRelative(0.0f, -0.123f, 0.014f, -0.283f, 0.087f, -0.353f)
                curveToRelative(0.073f, -0.072f, 0.238f, -0.09f, 0.361f, -0.09f)
                horizontalLineToRelative(2.149f)
                curveToRelative(0.103f, 0.0f, 0.29f, 0.012f, 0.36f, 0.085f)
                curveToRelative(0.077f, 0.073f, 0.088f, 0.255f, 0.088f, 0.358f)
                verticalLineToRelative(0.446f)
                horizontalLineToRelative(-3.045f)
                verticalLineToRelative(-0.446f)
                close()
                moveTo(17.604f, 4.997f)
                curveToRelative(-0.569f, -0.56f, -1.359f, -0.837f, -2.404f, -0.86f)
                verticalLineToRelative(-0.45f)
                curveToRelative(0.0f, -0.522f, -0.151f, -0.936f, -0.454f, -1.236f)
                curveToRelative(-0.3f, -0.3f, -0.722f, -0.451f, -1.254f, -0.451f)
                horizontalLineToRelative(-2.149f)
                curveToRelative(-0.53f, 0.0f, -0.952f, 0.154f, -1.255f, 0.457f)
                curveToRelative(-0.302f, 0.3f, -0.454f, 0.711f, -0.454f, 1.23f)
                verticalLineToRelative(0.445f)
                horizontalLineToRelative(-0.061f)
                curveToRelative(-1.098f, 0.0f, -1.925f, 0.288f, -2.521f, 0.882f)
                curveToRelative(-0.588f, 0.585f, -0.874f, 1.392f, -0.874f, 2.465f)
                verticalLineToRelative(10.86f)
                curveToRelative(0.0f, 1.098f, 0.288f, 1.913f, 0.882f, 2.493f)
                curveToRelative(0.588f, 0.574f, 1.412f, 0.854f, 2.516f, 0.854f)
                horizontalLineToRelative(5.51f)
                curveToRelative(1.103f, 0.0f, 1.927f, -0.28f, 2.515f, -0.854f)
                curveToRelative(0.594f, -0.583f, 0.882f, -1.398f, 0.882f, -2.493f)
                lineTo(18.483f, 7.479f)
                curveToRelative(-0.005f, -1.087f, -0.291f, -1.9f, -0.88f, -2.482f)
                close()
            }
        }
        .build()
        return _batteryRegular!!
    }

private var _batteryRegular: ImageVector? = null
