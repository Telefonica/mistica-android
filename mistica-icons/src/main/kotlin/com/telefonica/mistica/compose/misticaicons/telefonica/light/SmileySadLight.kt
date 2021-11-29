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

public val LightGroup.SmileySadLight: ImageVector
    get() {
        if (_smileySadLight != null) {
            return _smileySadLight!!
        }
        _smileySadLight = Builder(name = "SmileySadLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.078f, 13.772f)
                curveToRelative(3.633f, 0.04f, 5.75f, 2.35f, 5.84f, 2.449f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, -0.61f, 0.549f)
                curveToRelative(-0.02f, -0.02f, -1.98f, -2.14f, -5.253f, -2.177f)
                curveToRelative(-0.044f, 0.003f, -3.353f, -0.109f, -5.36f, 2.137f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, -0.614f, -0.546f)
                curveToRelative(2.271f, -2.54f, 5.848f, -2.409f, 5.997f, -2.412f)
                close()
                moveTo(11.997f, 21.022f)
                curveToRelative(5.988f, 0.0f, 9.025f, -3.034f, 9.025f, -9.02f)
                curveToRelative(0.0f, -5.989f, -3.037f, -9.025f, -9.025f, -9.025f)
                curveToRelative(-5.986f, 0.0f, -9.02f, 3.036f, -9.02f, 9.025f)
                curveToRelative(0.0f, 5.986f, 3.034f, 9.02f, 9.02f, 9.02f)
                close()
                moveTo(11.997f, 2.156f)
                curveToRelative(6.218f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.628f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.219f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.706f, 3.621f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(9.013f, 10.445f)
                curveToRelative(-0.327f, 0.0f, -0.599f, -0.101f, -0.787f, -0.292f)
                curveToRelative(-0.185f, -0.187f, -0.277f, -0.448f, -0.277f, -0.775f)
                curveToRelative(0.0f, -0.67f, 0.398f, -1.068f, 1.064f, -1.068f)
                curveToRelative(0.667f, 0.0f, 1.065f, 0.4f, 1.065f, 1.068f)
                curveToRelative(0.0f, 0.327f, -0.093f, 0.588f, -0.277f, 0.775f)
                curveToRelative(-0.188f, 0.19f, -0.46f, 0.292f, -0.788f, 0.292f)
                close()
                moveTo(14.985f, 10.445f)
                curveToRelative(-0.327f, 0.0f, -0.6f, -0.101f, -0.787f, -0.292f)
                curveToRelative(-0.185f, -0.187f, -0.277f, -0.448f, -0.277f, -0.775f)
                curveToRelative(0.0f, -0.67f, 0.398f, -1.068f, 1.064f, -1.068f)
                curveToRelative(0.667f, 0.0f, 1.065f, 0.4f, 1.065f, 1.068f)
                curveToRelative(0.0f, 0.327f, -0.093f, 0.588f, -0.278f, 0.775f)
                curveToRelative(-0.187f, 0.19f, -0.459f, 0.292f, -0.787f, 0.292f)
                close()
            }
        }
        .build()
        return _smileySadLight!!
    }

private var _smileySadLight: ImageVector? = null
