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

public val LightGroup.BatteryLight: ImageVector
    get() {
        if (_batteryLight != null) {
            return _batteryLight!!
        }
        _batteryLight = Builder(name = "BatteryLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.306f, 18.632f)
                curveToRelative(0.0f, 0.827f, -0.193f, 1.415f, -0.59f, 1.796f)
                curveToRelative(-0.396f, 0.38f, -0.998f, 0.566f, -1.838f, 0.566f)
                lineTo(9.172f, 20.994f)
                curveToRelative(-0.84f, 0.0f, -1.443f, -0.185f, -1.838f, -0.566f)
                curveToRelative(-0.397f, -0.384f, -0.59f, -0.97f, -0.59f, -1.796f)
                lineTo(6.744f, 7.54f)
                curveToRelative(0.0f, -0.804f, 0.193f, -1.38f, 0.59f, -1.773f)
                curveToRelative(0.404f, -0.395f, 1.003f, -0.588f, 1.838f, -0.588f)
                horizontalLineToRelative(5.706f)
                curveToRelative(0.843f, 0.0f, 1.445f, 0.187f, 1.84f, 0.574f)
                curveToRelative(0.395f, 0.386f, 0.588f, 0.97f, 0.588f, 1.787f)
                verticalLineToRelative(11.092f)
                close()
                moveTo(10.323f, 3.666f)
                curveToRelative(0.0f, -0.358f, 0.118f, -0.473f, 0.154f, -0.51f)
                curveToRelative(0.04f, -0.039f, 0.157f, -0.154f, 0.53f, -0.154f)
                horizontalLineToRelative(2.224f)
                curveToRelative(0.38f, 0.0f, 0.493f, 0.112f, 0.532f, 0.149f)
                curveToRelative(0.036f, 0.036f, 0.151f, 0.148f, 0.151f, 0.515f)
                verticalLineToRelative(0.667f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-0.667f)
                close()
                moveTo(17.334f, 5.156f)
                curveToRelative(-0.568f, -0.554f, -1.372f, -0.823f, -2.459f, -0.823f)
                horizontalLineToRelative(-0.092f)
                verticalLineToRelative(-0.667f)
                curveToRelative(0.0f, -0.476f, -0.138f, -0.849f, -0.407f, -1.112f)
                curveToRelative(-0.269f, -0.263f, -0.655f, -0.398f, -1.145f, -0.398f)
                horizontalLineToRelative(-2.224f)
                curveToRelative(-0.49f, 0.0f, -0.874f, 0.138f, -1.149f, 0.404f)
                curveToRelative(-0.269f, 0.266f, -0.406f, 0.638f, -0.406f, 1.103f)
                verticalLineToRelative(0.667f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-1.079f, 0.0f, -1.88f, 0.274f, -2.457f, 0.84f)
                curveToRelative(-0.565f, 0.558f, -0.84f, 1.334f, -0.84f, 2.367f)
                lineTo(5.875f, 18.63f)
                curveToRelative(0.0f, 1.064f, 0.28f, 1.848f, 0.849f, 2.397f)
                curveToRelative(0.566f, 0.547f, 1.367f, 0.813f, 2.448f, 0.813f)
                horizontalLineToRelative(5.706f)
                curveToRelative(1.081f, 0.0f, 1.882f, -0.266f, 2.448f, -0.813f)
                curveToRelative(0.571f, -0.549f, 0.849f, -1.333f, 0.849f, -2.397f)
                lineTo(18.175f, 7.537f)
                curveToRelative(0.0f, -1.05f, -0.275f, -1.829f, -0.84f, -2.38f)
                close()
            }
        }
        .build()
        return _batteryLight!!
    }

private var _batteryLight: ImageVector? = null
