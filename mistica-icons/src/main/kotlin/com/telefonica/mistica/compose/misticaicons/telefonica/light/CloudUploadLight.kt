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

public val LightGroup.CloudUploadLight: ImageVector
    get() {
        if (_cloudUploadLight != null) {
            return _cloudUploadLight!!
        }
        _cloudUploadLight = Builder(name = "CloudUploadLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.666f, 16.975f)
                lineToRelative(-2.098f, 0.009f)
                lineToRelative(0.008f, -1.583f)
                horizontalLineToRelative(1.67f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.583f, -0.4f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.124f, -0.707f)
                lineToRelative(-4.202f, -4.487f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, false, -0.459f, -0.196f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, false, -0.451f, 0.196f)
                lineToRelative(-4.3f, 4.574f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, -0.132f, 0.706f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.583f, 0.41f)
                horizontalLineToRelative(1.678f)
                verticalLineToRelative(1.523f)
                lineToRelative(-3.042f, 0.017f)
                curveToRelative(-1.02f, 0.0f, -3.404f, -0.342f, -3.404f, -3.51f)
                curveToRelative(0.0f, -1.782f, 0.748f, -2.905f, 2.213f, -3.33f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.297f, -0.41f)
                lineToRelative(-0.008f, -0.12f)
                curveToRelative(0.0f, -5.076f, 4.277f, -5.468f, 5.586f, -5.468f)
                curveToRelative(0.74f, 0.0f, 4.482f, 0.18f, 5.37f, 3.619f)
                curveToRelative(0.05f, 0.188f, 0.204f, 0.314f, 0.386f, 0.314f)
                curveToRelative(1.266f, 0.042f, 4.202f, 0.546f, 4.202f, 4.412f)
                curveToRelative(-0.006f, 4.11f, -3.336f, 4.431f, -4.356f, 4.431f)
                close()
                moveTo(13.744f, 17.367f)
                lineTo(13.736f, 19.727f)
                lineTo(10.24f, 19.727f)
                verticalLineToRelative(-4.43f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, -0.633f, -0.655f)
                lineTo(8.184f, 14.642f)
                lineToRelative(3.857f, -4.104f)
                lineToRelative(3.76f, 4.011f)
                horizontalLineToRelative(-1.415f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.633f, 0.656f)
                lineToRelative(-0.009f, 2.162f)
                close()
                moveTo(17.142f, 7.303f)
                curveTo(15.966f, 3.546f, 11.88f, 3.35f, 11.058f, 3.35f)
                curveToRelative(-1.062f, 0.0f, -6.292f, 0.297f, -6.4f, 6.12f)
                curveToRelative(-1.054f, 0.401f, -2.508f, 1.424f, -2.508f, 4.054f)
                curveToRelative(0.0f, 3.21f, 2.188f, 4.362f, 4.227f, 4.362f)
                lineToRelative(3.042f, -0.017f)
                verticalLineToRelative(2.053f)
                curveToRelative(0.0f, 0.367f, 0.289f, 0.656f, 0.633f, 0.656f)
                horizontalLineToRelative(3.874f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, 0.634f, -0.656f)
                lineToRelative(0.008f, -2.087f)
                lineToRelative(2.098f, -0.008f)
                curveToRelative(0.863f, 0.0f, 5.174f, -0.255f, 5.174f, -5.28f)
                curveToRelative(-0.003f, -4.393f, -3.283f, -5.135f, -4.698f, -5.244f)
                close()
            }
        }
        .build()
        return _cloudUploadLight!!
    }

private var _cloudUploadLight: ImageVector? = null
