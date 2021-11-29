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

public val RegularGroup.ParkingRegular: ImageVector
    get() {
        if (_parkingRegular != null) {
            return _parkingRegular!!
        }
        _parkingRegular = Builder(name = "ParkingRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.861f, 12.687f)
                curveToRelative(0.807f, -0.91f, 1.213f, -2.286f, 1.213f, -4.087f)
                curveToRelative(0.0f, -1.779f, -0.428f, -3.087f, -1.277f, -3.883f)
                curveToRelative(-0.493f, -0.467f, -1.163f, -0.81f, -1.992f, -1.02f)
                curveToRelative(-0.882f, -0.218f, -2.042f, -0.333f, -3.445f, -0.333f)
                lineTo(6.688f, 3.364f)
                verticalLineToRelative(17.278f)
                lineTo(9.66f, 20.642f)
                verticalLineToRelative(-5.776f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.596f, -0.602f)
                horizontalLineToRelative(2.933f)
                curveToRelative(1.14f, 0.0f, 2.107f, -0.135f, 2.874f, -0.4f)
                curveToRelative(0.734f, -0.253f, 1.339f, -0.648f, 1.798f, -1.177f)
                close()
                moveTo(18.609f, 3.837f)
                curveToRelative(1.098f, 1.032f, 1.656f, 2.634f, 1.656f, 4.763f)
                curveToRelative(0.0f, 2.106f, -0.51f, 3.75f, -1.513f, 4.888f)
                curveToRelative(-0.596f, 0.686f, -1.372f, 1.199f, -2.305f, 1.518f)
                curveToRelative(-0.894f, 0.308f, -1.989f, 0.465f, -3.258f, 0.465f)
                lineTo(10.85f, 15.471f)
                verticalLineToRelative(5.773f)
                curveToRelative(0.003f, 0.33f, -0.263f, 0.6f, -0.594f, 0.602f)
                lineTo(6.094f, 21.846f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.594f, -0.602f)
                lineTo(5.5f, 2.762f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, 0.594f, -0.602f)
                horizontalLineToRelative(6.266f)
                curveToRelative(1.501f, 0.0f, 2.756f, 0.126f, 3.731f, 0.367f)
                curveToRelative(1.03f, 0.26f, 1.877f, 0.7f, 2.518f, 1.31f)
                close()
                moveTo(14.315f, 10.577f)
                curveToRelative(0.362f, -0.367f, 0.546f, -1.014f, 0.546f, -1.927f)
                curveToRelative(0.0f, -0.832f, -0.17f, -1.423f, -0.512f, -1.753f)
                curveToRelative(-0.165f, -0.154f, -0.406f, -0.275f, -0.712f, -0.348f)
                curveToRelative(-0.364f, -0.086f, -0.848f, -0.131f, -1.434f, -0.131f)
                lineTo(10.85f, 6.418f)
                verticalLineToRelative(4.686f)
                horizontalLineToRelative(1.46f)
                curveToRelative(0.747f, 0.0f, 1.145f, -0.067f, 1.344f, -0.126f)
                curveToRelative(0.25f, -0.073f, 0.465f, -0.202f, 0.661f, -0.4f)
                close()
                moveTo(13.912f, 5.378f)
                curveToRelative(0.51f, 0.124f, 0.93f, 0.34f, 1.252f, 0.645f)
                curveToRelative(0.588f, 0.577f, 0.885f, 1.46f, 0.885f, 2.63f)
                curveToRelative(0.0f, 1.244f, -0.3f, 2.176f, -0.893f, 2.779f)
                arcToRelative(2.682f, 2.682f, 0.0f, false, true, -1.18f, 0.706f)
                curveToRelative(-0.4f, 0.114f, -0.947f, 0.17f, -1.67f, 0.17f)
                horizontalLineToRelative(-2.052f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.594f, -0.602f)
                verticalLineToRelative(-5.89f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, 0.594f, -0.603f)
                lineTo(12.2f, 5.213f)
                curveToRelative(0.684f, 0.0f, 1.258f, 0.056f, 1.712f, 0.165f)
                close()
            }
        }
        .build()
        return _parkingRegular!!
    }

private var _parkingRegular: ImageVector? = null
