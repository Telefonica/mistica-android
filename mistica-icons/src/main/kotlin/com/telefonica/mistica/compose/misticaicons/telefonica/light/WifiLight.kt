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

public val LightGroup.WifiLight: ImageVector
    get() {
        if (_wifiLight != null) {
            return _wifiLight!!
        }
        _wifiLight = Builder(name = "WifiLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.155f)
                curveToRelative(0.625f, 0.0f, 1.112f, 0.162f, 1.453f, 0.48f)
                curveToRelative(0.356f, 0.33f, 0.536f, 0.814f, 0.536f, 1.442f)
                curveToRelative(0.0f, 1.24f, -0.707f, 1.923f, -1.988f, 1.923f)
                curveToRelative(-1.282f, 0.0f, -1.988f, -0.683f, -1.988f, -1.923f)
                curveToRelative(0.0f, -1.239f, 0.706f, -1.922f, 1.988f, -1.922f)
                close()
                moveTo(12.0f, 16.722f)
                curveToRelative(-0.956f, 0.0f, -1.4f, 0.43f, -1.4f, 1.355f)
                curveToRelative(0.0f, 0.926f, 0.444f, 1.356f, 1.4f, 1.356f)
                curveToRelative(0.958f, 0.0f, 1.402f, -0.43f, 1.402f, -1.356f)
                curveToRelative(0.0f, -0.468f, -0.12f, -0.815f, -0.356f, -1.035f)
                curveToRelative(-0.228f, -0.212f, -0.578f, -0.32f, -1.045f, -0.32f)
                close()
                moveTo(12.038f, 12.277f)
                curveToRelative(0.911f, 0.0f, 1.794f, 0.173f, 2.629f, 0.515f)
                curveToRelative(0.769f, 0.314f, 1.467f, 0.76f, 2.07f, 1.327f)
                curveToRelative(0.117f, 0.11f, 0.12f, 0.29f, 0.006f, 0.403f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.416f, 0.005f)
                arcToRelative(6.14f, 6.14f, 0.0f, false, false, -1.89f, -1.212f)
                arcToRelative(6.314f, 6.314f, 0.0f, false, false, -2.402f, -0.47f)
                curveToRelative(-0.852f, 0.0f, -1.675f, 0.164f, -2.453f, 0.487f)
                curveToRelative(-0.715f, 0.3f, -1.355f, 0.721f, -1.91f, 1.258f)
                arcToRelative(0.278f, 0.278f, 0.0f, false, true, -0.203f, 0.083f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.208f, -0.083f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.0f, -0.402f)
                arcToRelative(6.739f, 6.739f, 0.0f, false, true, 2.094f, -1.377f)
                arcToRelative(6.911f, 6.911f, 0.0f, false, true, 2.683f, -0.534f)
                close()
                moveTo(12.041f, 8.14f)
                curveToRelative(1.398f, 0.0f, 2.76f, 0.264f, 4.041f, 0.788f)
                arcToRelative(10.41f, 10.41f, 0.0f, false, true, 3.245f, 2.087f)
                curveToRelative(0.117f, 0.11f, 0.117f, 0.29f, 0.003f, 0.402f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.416f, 0.003f)
                arcToRelative(9.793f, 9.793f, 0.0f, false, false, -3.06f, -1.97f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, false, -3.813f, -0.743f)
                curveToRelative(-1.34f, 0.0f, -2.635f, 0.256f, -3.854f, 0.758f)
                arcToRelative(9.884f, 9.884f, 0.0f, false, false, -3.088f, 2.013f)
                lineToRelative(-0.011f, 0.011f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, true, -0.413f, 0.003f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, true, -0.003f, -0.4f)
                lineToRelative(0.014f, -0.013f)
                arcToRelative(10.448f, 10.448f, 0.0f, false, true, 3.27f, -2.135f)
                arcToRelative(10.635f, 10.635f, 0.0f, false, true, 4.085f, -0.804f)
                close()
                moveTo(12.046f, 4.0f)
                curveToRelative(1.889f, 0.0f, 3.723f, 0.355f, 5.452f, 1.058f)
                arcToRelative(14.062f, 14.062f, 0.0f, false, true, 4.415f, 2.845f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.003f, 0.402f)
                arcToRelative(0.303f, 0.303f, 0.0f, false, true, -0.416f, 0.003f)
                arcToRelative(13.444f, 13.444f, 0.0f, false, false, -4.23f, -2.727f)
                arcToRelative(13.842f, 13.842f, 0.0f, false, false, -5.227f, -1.014f)
                curveToRelative(-1.823f, 0.0f, -3.591f, 0.345f, -5.255f, 1.028f)
                arcToRelative(13.543f, 13.543f, 0.0f, false, false, -4.272f, 2.779f)
                lineToRelative(-0.018f, 0.016f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.205f, 0.086f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.208f, -0.083f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.0f, -0.402f)
                lineToRelative(0.02f, -0.02f)
                arcToRelative(14.12f, 14.12f, 0.0f, false, true, 4.458f, -2.9f)
                arcTo(14.396f, 14.396f, 0.0f, false, true, 12.046f, 4.0f)
                close()
            }
        }
        .build()
        return _wifiLight!!
    }

private var _wifiLight: ImageVector? = null
