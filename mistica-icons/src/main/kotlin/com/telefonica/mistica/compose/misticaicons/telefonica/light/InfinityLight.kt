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

public val LightGroup.InfinityLight: ImageVector
    get() {
        if (_infinityLight != null) {
            return _infinityLight!!
        }
        _infinityLight = Builder(name = "InfinityLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.97f, 15.122f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(-1.627f, -0.006f, -4.397f, -2.146f, -5.501f, -3.188f)
                curveToRelative(1.106f, -1.042f, 3.885f, -3.188f, 5.513f, -3.188f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.93f, 0.003f, 1.653f, 0.28f, 2.143f, 0.827f)
                curveToRelative(0.493f, 0.546f, 0.74f, 1.342f, 0.737f, 2.37f)
                curveToRelative(-0.003f, 2.05f, -1.028f, 3.179f, -2.88f, 3.179f)
                moveToRelative(-12.25f, 0.0f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-0.924f, 0.0f, -1.641f, -0.275f, -2.132f, -0.812f)
                curveToRelative(-0.495f, -0.541f, -0.747f, -1.337f, -0.75f, -2.365f)
                curveToRelative(-0.003f, -1.025f, 0.243f, -1.823f, 0.736f, -2.37f)
                curveTo(4.05f, 9.03f, 4.77f, 8.753f, 5.7f, 8.75f)
                horizontalLineToRelative(0.006f)
                curveToRelative(1.627f, 0.0f, 4.406f, 2.143f, 5.513f, 3.188f)
                curveToRelative(-1.101f, 1.036f, -3.869f, 3.18f, -5.5f, 3.185f)
                moveToRelative(14.984f, -6.193f)
                curveToRelative(-0.644f, -0.715f, -1.585f, -1.093f, -2.728f, -1.096f)
                horizontalLineToRelative(-0.009f)
                curveToRelative(-2.103f, 0.0f, -5.128f, 2.544f, -6.126f, 3.488f)
                curveToRelative(-1.0f, -0.944f, -4.022f, -3.488f, -6.126f, -3.488f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-1.143f, 0.003f, -2.087f, 0.384f, -2.728f, 1.096f)
                curveToRelative(-0.642f, 0.714f, -0.98f, 1.756f, -0.978f, 3.016f)
                curveToRelative(0.003f, 1.26f, 0.347f, 2.303f, 0.994f, 3.012f)
                curveToRelative(0.645f, 0.705f, 1.583f, 1.078f, 2.718f, 1.078f)
                horizontalLineToRelative(0.016f)
                curveToRelative(2.107f, -0.008f, 5.118f, -2.546f, 6.115f, -3.487f)
                curveToRelative(0.997f, 0.94f, 4.011f, 3.479f, 6.112f, 3.487f)
                horizontalLineToRelative(0.02f)
                curveToRelative(2.316f, 0.0f, 3.703f, -1.527f, 3.711f, -4.09f)
                curveToRelative(-0.002f, -1.257f, -0.341f, -2.302f, -0.983f, -3.016f)
            }
        }
        .build()
        return _infinityLight!!
    }

private var _infinityLight: ImageVector? = null
