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

public val LightGroup.AppointmentLight: ImageVector
    get() {
        if (_appointmentLight != null) {
            return _appointmentLight!!
        }
        _appointmentLight = Builder(name = "AppointmentLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.002f, 16.462f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, false, 0.098f, -0.05f)
                lineToRelative(-0.005f, -1.421f)
                arcToRelative(0.148f, 0.148f, 0.0f, false, false, -0.093f, -0.042f)
                horizontalLineToRelative(-1.84f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, -0.409f)
                verticalLineToRelative(-1.838f)
                curveToRelative(0.0f, -0.039f, -0.02f, -0.075f, -0.05f, -0.098f)
                lineToRelative(-1.437f, 0.006f)
                curveToRelative(0.011f, 0.003f, -0.02f, 0.045f, -0.02f, 0.092f)
                verticalLineToRelative(1.84f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, 0.41f)
                horizontalLineToRelative(-1.84f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, false, -0.095f, 0.045f)
                lineToRelative(0.002f, 1.445f)
                curveToRelative(0.0f, -0.003f, 0.003f, -0.003f, 0.003f, -0.003f)
                curveToRelative(0.011f, 0.0f, 0.045f, 0.02f, 0.087f, 0.02f)
                horizontalLineToRelative(1.84f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.41f, 0.409f)
                verticalLineToRelative(1.843f)
                curveToRelative(0.0f, 0.05f, 0.03f, 0.087f, 0.041f, 0.092f)
                lineToRelative(1.449f, -0.002f)
                curveToRelative(-0.012f, -0.003f, 0.02f, -0.04f, 0.02f, -0.09f)
                lineToRelative(-0.004f, -1.84f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.12f, -0.292f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.292f, -0.12f)
                lineToRelative(1.84f, 0.003f)
                close()
                moveTo(15.002f, 14.128f)
                curveToRelative(0.488f, 0.0f, 0.914f, 0.395f, 0.914f, 0.84f)
                verticalLineToRelative(1.474f)
                curveToRelative(0.0f, 0.448f, -0.426f, 0.84f, -0.914f, 0.84f)
                horizontalLineToRelative(-1.428f)
                lineToRelative(0.003f, 1.429f)
                curveToRelative(0.0f, 0.496f, -0.384f, 0.91f, -0.84f, 0.91f)
                horizontalLineToRelative(-1.471f)
                curveToRelative(-0.454f, 0.0f, -0.84f, -0.417f, -0.84f, -0.91f)
                verticalLineToRelative(-1.429f)
                lineTo(8.993f, 17.282f)
                curveToRelative(-0.493f, 0.0f, -0.91f, -0.386f, -0.91f, -0.84f)
                verticalLineToRelative(-1.468f)
                curveToRelative(0.0f, -0.456f, 0.417f, -0.84f, 0.91f, -0.84f)
                horizontalLineToRelative(1.431f)
                verticalLineToRelative(-1.432f)
                curveToRelative(0.0f, -0.495f, 0.384f, -0.913f, 0.84f, -0.913f)
                horizontalLineToRelative(1.469f)
                curveToRelative(0.456f, 0.0f, 0.84f, 0.418f, 0.84f, 0.913f)
                verticalLineToRelative(1.426f)
                horizontalLineToRelative(1.428f)
                close()
                moveTo(18.515f, 21.022f)
                curveToRelative(1.143f, 0.0f, 2.504f, -0.493f, 2.504f, -2.838f)
                verticalLineToRelative(-7.79f)
                lineTo(2.977f, 10.394f)
                verticalLineToRelative(7.866f)
                curveToRelative(0.0f, 0.005f, -0.059f, 1.218f, 0.687f, 2.005f)
                curveToRelative(0.462f, 0.49f, 1.176f, 0.74f, 2.117f, 0.74f)
                horizontalLineToRelative(12.423f)
                curveToRelative(0.034f, 0.0f, 0.067f, 0.003f, 0.101f, 0.006f)
                curveToRelative(0.011f, 0.002f, 0.09f, 0.01f, 0.21f, 0.01f)
                close()
                moveTo(4.02f, 5.342f)
                curveToRelative(-0.692f, 0.439f, -1.042f, 1.24f, -1.042f, 2.383f)
                verticalLineToRelative(1.849f)
                horizontalLineToRelative(18.04f)
                lineTo(21.018f, 7.742f)
                curveToRelative(0.0f, -0.023f, 0.0f, -0.045f, 0.002f, -0.065f)
                curveToRelative(0.0f, -0.008f, 0.073f, -1.21f, -0.664f, -1.997f)
                curveToRelative(-0.465f, -0.499f, -1.19f, -0.75f, -2.156f, -0.75f)
                horizontalLineToRelative(-1.356f)
                verticalLineToRelative(0.59f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.818f, 0.0f)
                verticalLineToRelative(-0.59f)
                lineToRelative(-8.042f, 0.002f)
                verticalLineToRelative(0.588f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.818f, 0.0f)
                verticalLineToRelative(-0.585f)
                lineTo(5.767f, 4.935f)
                curveToRelative(-0.025f, 0.0f, -0.05f, 0.0f, -0.073f, -0.003f)
                curveToRelative(-0.008f, 0.0f, -0.053f, -0.003f, -0.126f, -0.003f)
                curveToRelative(-0.269f, 0.0f, -0.96f, 0.04f, -1.549f, 0.412f)
                close()
                moveTo(18.2f, 4.108f)
                curveToRelative(3.927f, 0.0f, 3.638f, 3.635f, 3.638f, 3.635f)
                lineToRelative(0.003f, 10.443f)
                curveToRelative(0.0f, 3.356f, -2.443f, 3.658f, -3.325f, 3.658f)
                curveToRelative(-0.193f, 0.0f, -0.314f, -0.014f, -0.314f, -0.014f)
                lineTo(5.778f, 21.83f)
                curveToRelative(-3.862f, -0.002f, -3.619f, -3.624f, -3.619f, -3.624f)
                lineTo(2.159f, 7.725f)
                curveToRelative(0.0f, -3.378f, 2.656f, -3.616f, 3.41f, -3.616f)
                curveToRelative(0.125f, 0.0f, 0.198f, 0.005f, 0.198f, 0.005f)
                horizontalLineToRelative(1.395f)
                lineTo(7.162f, 2.565f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.82f, 0.0f)
                verticalLineToRelative(1.546f)
                lineToRelative(8.043f, -0.002f)
                lineTo(16.025f, 2.565f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.818f, 0.0f)
                lineTo(16.843f, 4.11f)
                horizontalLineToRelative(1.356f)
                close()
            }
        }
        .build()
        return _appointmentLight!!
    }

private var _appointmentLight: ImageVector? = null
