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

public val LightGroup.PersonalComputerLight: ImageVector
    get() {
        if (_personalComputerLight != null) {
            return _personalComputerLight!!
        }
        _personalComputerLight = Builder(name = "PersonalComputerLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.51f, 6.531f)
                curveToRelative(0.495f, 0.0f, 1.327f, 0.238f, 1.327f, 1.843f)
                lineToRelative(0.003f, 7.241f)
                curveToRelative(0.0f, 1.605f, -0.832f, 1.843f, -1.328f, 1.843f)
                horizontalLineToRelative(-2.283f)
                curveToRelative(-0.493f, 0.0f, -1.316f, -0.238f, -1.316f, -1.843f)
                lineToRelative(-0.003f, -7.24f)
                curveToRelative(0.0f, -1.603f, 0.823f, -1.844f, 1.316f, -1.844f)
                horizontalLineToRelative(2.283f)
                close()
                moveTo(14.036f, 6.531f)
                curveToRelative(0.767f, 0.0f, 1.358f, 0.21f, 1.756f, 0.625f)
                curveToRelative(0.384f, 0.4f, 0.58f, 0.98f, 0.58f, 1.725f)
                verticalLineToRelative(4.56f)
                curveToRelative(0.0f, 1.527f, -0.83f, 2.37f, -2.336f, 2.37f)
                lineToRelative(-2.644f, 0.001f)
                lineToRelative(1.07f, 1.084f)
                horizontalLineToRelative(3.633f)
                curveToRelative(0.154f, 0.0f, 0.277f, 0.123f, 0.277f, 0.277f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, true, -0.277f, 0.277f)
                lineToRelative(-3.711f, 0.004f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, true, -0.034f, 0.002f)
                lineToRelative(-0.036f, -0.005f)
                lineToRelative(-9.88f, 0.005f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, true, -0.278f, -0.278f)
                curveToRelative(0.0f, -0.154f, 0.123f, -0.277f, 0.278f, -0.277f)
                lineToRelative(3.543f, -0.002f)
                lineToRelative(1.058f, -1.087f)
                lineToRelative(-2.543f, 0.002f)
                curveToRelative(-1.507f, 0.0f, -2.336f, -0.84f, -2.336f, -2.37f)
                lineTo(2.156f, 8.887f)
                curveToRelative(0.0f, -0.745f, 0.196f, -1.325f, 0.58f, -1.725f)
                curveToRelative(0.398f, -0.415f, 0.989f, -0.625f, 1.756f, -0.625f)
                lineToRelative(9.544f, -0.006f)
                close()
                moveTo(10.618f, 15.812f)
                lineTo(7.811f, 15.812f)
                lineToRelative(-1.059f, 1.086f)
                horizontalLineToRelative(4.931f)
                lineToRelative(-1.05f, -1.067f)
                lineToRelative(-0.015f, -0.019f)
                close()
                moveTo(20.536f, 7.092f)
                horizontalLineToRelative(-2.31f)
                curveToRelative(-0.207f, 0.0f, -0.756f, 0.0f, -0.756f, 1.282f)
                lineToRelative(0.003f, 7.241f)
                curveToRelative(0.0f, 1.222f, 0.498f, 1.28f, 0.724f, 1.283f)
                horizontalLineToRelative(2.315f)
                curveToRelative(0.19f, 0.0f, 0.767f, 0.0f, 0.767f, -1.283f)
                lineToRelative(-0.005f, -7.24f)
                curveToRelative(0.0f, -1.222f, -0.523f, -1.28f, -0.738f, -1.283f)
                close()
                moveTo(14.036f, 7.089f)
                lineTo(4.492f, 7.094f)
                curveToRelative(-0.61f, 0.0f, -1.067f, 0.154f, -1.358f, 0.454f)
                curveToRelative(-0.283f, 0.294f, -0.426f, 0.745f, -0.426f, 1.339f)
                verticalLineToRelative(4.56f)
                curveToRelative(0.0f, 1.222f, 0.583f, 1.815f, 1.782f, 1.815f)
                lineToRelative(9.543f, -0.005f)
                curveToRelative(1.199f, 0.0f, 1.782f, -0.594f, 1.782f, -1.815f)
                verticalLineToRelative(-4.56f)
                curveToRelative(0.0f, -0.597f, -0.143f, -1.048f, -0.426f, -1.34f)
                curveToRelative(-0.286f, -0.302f, -0.743f, -0.453f, -1.353f, -0.453f)
                close()
            }
        }
        .build()
        return _personalComputerLight!!
    }

private var _personalComputerLight: ImageVector? = null
