package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ParkingLight: ImageVector
    get() {
        if (_parkingLight != null) {
            return _parkingLight!!
        }
        _parkingLight = Builder(name = "ParkingLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.629f, 3.8f)
                curveToRelative(1.084f, 1.024f, 1.639f, 2.615f, 1.622f, 4.725f)
                arcToRelative(7.095f, 7.095f, 0.0f, false, true, -1.507f, 4.854f)
                arcToRelative(5.264f, 5.264f, 0.0f, false, true, -2.283f, 1.493f)
                arcToRelative(10.294f, 10.294f, 0.0f, false, true, -3.26f, 0.46f)
                horizontalLineToRelative(-2.609f)
                verticalLineToRelative(6.1f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.409f, 0.41f)
                lineTo(5.91f, 21.842f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, -0.41f)
                lineTo(5.501f, 2.572f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.409f, -0.409f)
                horizontalLineToRelative(6.437f)
                curveToRelative(1.26f, -0.025f, 2.518f, 0.098f, 3.748f, 0.37f)
                curveToRelative(0.941f, 0.193f, 1.815f, 0.63f, 2.535f, 1.266f)
                close()
                moveTo(18.155f, 12.821f)
                arcToRelative(6.353f, 6.353f, 0.0f, false, false, 1.297f, -4.305f)
                curveToRelative(0.0f, -1.863f, -0.465f, -3.28f, -1.378f, -4.1f)
                arcToRelative(4.765f, 4.765f, 0.0f, false, false, -2.143f, -1.09f)
                arcToRelative(15.415f, 15.415f, 0.0f, false, false, -3.585f, -0.345f)
                horizontalLineToRelative(-6.03f)
                verticalLineToRelative(18.045f)
                lineTo(9.78f, 21.026f)
                verticalLineToRelative(-6.112f)
                curveToRelative(0.0f, -0.227f, 0.182f, -0.41f, 0.406f, -0.41f)
                lineTo(13.2f, 14.504f)
                arcToRelative(9.381f, 9.381f, 0.0f, false, false, 3.014f, -0.416f)
                arcToRelative(4.402f, 4.402f, 0.0f, false, false, 1.941f, -1.267f)
                close()
                moveTo(13.895f, 5.441f)
                curveToRelative(0.454f, 0.09f, 0.874f, 0.3f, 1.221f, 0.607f)
                curveToRelative(0.605f, 0.698f, 0.9f, 1.614f, 0.815f, 2.535f)
                arcToRelative(3.696f, 3.696f, 0.0f, false, true, -0.888f, 2.69f)
                curveToRelative(-0.31f, 0.316f, -0.697f, 0.548f, -1.123f, 0.672f)
                arcToRelative(6.646f, 6.646f, 0.0f, false, true, -1.63f, 0.165f)
                horizontalLineToRelative(-2.104f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.406f, -0.409f)
                lineTo(9.78f, 5.687f)
                curveToRelative(0.0f, -0.227f, 0.182f, -0.409f, 0.406f, -0.409f)
                horizontalLineToRelative(1.997f)
                arcToRelative(7.642f, 7.642f, 0.0f, false, true, 1.712f, 0.163f)
                close()
                moveTo(14.466f, 10.69f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, false, 0.645f, -2.084f)
                arcToRelative(2.631f, 2.631f, 0.0f, false, false, -0.586f, -1.936f)
                arcToRelative(1.708f, 1.708f, 0.0f, false, false, -0.815f, -0.409f)
                arcToRelative(7.152f, 7.152f, 0.0f, false, false, -1.524f, -0.165f)
                horizontalLineToRelative(-1.588f)
                verticalLineToRelative(5.193f)
                horizontalLineToRelative(1.658f)
                curveToRelative(0.485f, 0.014f, 0.97f, -0.03f, 1.443f, -0.14f)
                curveToRelative(0.294f, -0.081f, 0.557f, -0.24f, 0.767f, -0.46f)
                close()
            }
        }
        .build()
        return _parkingLight!!
    }

private var _parkingLight: ImageVector? = null
