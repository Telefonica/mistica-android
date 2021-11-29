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

public val RegularGroup.HotelRegular: ImageVector
    get() {
        if (_hotelRegular != null) {
            return _hotelRegular!!
        }
        _hotelRegular = Builder(name = "HotelRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.518f, 2.0f)
                curveToRelative(0.252f, 0.0f, 0.513f, 0.003f, 0.737f, 0.011f)
                curveToRelative(1.927f, 0.045f, 9.431f, 0.807f, 9.431f, 9.86f)
                curveToRelative(0.0f, 9.073f, -7.515f, 9.776f, -9.392f, 9.812f)
                curveToRelative(-0.196f, 0.003f, -0.395f, 0.006f, -0.59f, 0.006f)
                curveToRelative(-0.105f, 0.0f, -0.208f, 0.0f, -0.31f, -0.003f)
                curveTo(9.418f, 21.656f, 2.0f, 20.941f, 2.0f, 11.812f)
                curveTo(2.0f, 2.697f, 9.347f, 2.017f, 11.322f, 2.0f)
                horizontalLineToRelative(0.196f)
                close()
                moveTo(11.518f, 3.23f)
                horizontalLineToRelative(-0.185f)
                curveToRelative(-2.437f, 0.022f, -8.1f, 0.902f, -8.1f, 8.582f)
                curveToRelative(0.0f, 7.695f, 5.72f, 8.608f, 8.179f, 8.642f)
                arcToRelative(35.346f, 35.346f, 0.0f, false, false, 0.863f, -0.003f)
                curveToRelative(2.459f, -0.045f, 8.182f, -0.972f, 8.182f, -8.583f)
                curveToRelative(-0.003f, -7.61f, -5.757f, -8.568f, -8.233f, -8.63f)
                curveToRelative(-0.235f, -0.006f, -0.47f, -0.008f, -0.706f, -0.008f)
                close()
                moveTo(15.672f, 6.045f)
                curveToRelative(0.588f, 0.0f, 1.067f, 0.476f, 1.067f, 1.067f)
                verticalLineToRelative(9.465f)
                curveToRelative(0.0f, 0.588f, -0.476f, 1.067f, -1.067f, 1.067f)
                horizontalLineToRelative(-2.16f)
                arcToRelative(1.067f, 1.067f, 0.0f, false, true, -1.067f, -1.067f)
                verticalLineToRelative(-2.922f)
                horizontalLineToRelative(-1.204f)
                verticalLineToRelative(2.92f)
                curveToRelative(0.0f, 0.587f, -0.48f, 1.066f, -1.067f, 1.064f)
                horizontalLineToRelative(-2.16f)
                arcToRelative(1.067f, 1.067f, 0.0f, false, true, -1.067f, -1.068f)
                lineTo(6.947f, 7.112f)
                curveToRelative(0.0f, -0.588f, 0.476f, -1.067f, 1.067f, -1.067f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.588f, 0.0f, 1.067f, 0.476f, 1.067f, 1.064f)
                verticalLineToRelative(2.799f)
                horizontalLineToRelative(1.202f)
                lineTo(12.443f, 7.112f)
                curveToRelative(0.0f, -0.588f, 0.476f, -1.067f, 1.067f, -1.067f)
                horizontalLineToRelative(2.162f)
                close()
                moveTo(15.672f, 7.112f)
                horizontalLineToRelative(-2.16f)
                verticalLineToRelative(3.86f)
                horizontalLineToRelative(-3.338f)
                verticalLineToRelative(-3.86f)
                horizontalLineToRelative(-2.16f)
                verticalLineToRelative(9.465f)
                horizontalLineToRelative(2.16f)
                verticalLineToRelative(-3.986f)
                horizontalLineToRelative(3.339f)
                verticalLineToRelative(3.986f)
                horizontalLineToRelative(2.16f)
                lineTo(15.673f, 7.112f)
                close()
            }
        }
        .build()
        return _hotelRegular!!
    }

private var _hotelRegular: ImageVector? = null
