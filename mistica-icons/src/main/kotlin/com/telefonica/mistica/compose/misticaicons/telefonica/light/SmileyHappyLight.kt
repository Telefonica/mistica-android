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

public val LightGroup.SmileyHappyLight: ImageVector
    get() {
        if (_smileyHappyLight != null) {
            return _smileyHappyLight!!
        }
        _smileyHappyLight = Builder(name = "SmileyHappyLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.308f, 13.907f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, 0.61f, 0.549f)
                curveToRelative(-0.09f, 0.098f, -2.207f, 2.406f, -5.854f, 2.448f)
                curveToRelative(-0.05f, 0.003f, -0.101f, 0.003f, -0.151f, 0.003f)
                curveToRelative(-0.726f, 0.0f, -3.799f, -0.14f, -5.832f, -2.415f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.613f, -0.546f)
                curveToRelative(2.017f, 2.258f, 5.314f, 2.143f, 5.347f, 2.137f)
                curveToRelative(3.286f, -0.036f, 5.247f, -2.156f, 5.267f, -2.176f)
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
                curveToRelative(0.0f, -0.667f, 0.398f, -1.068f, 1.064f, -1.068f)
                curveToRelative(0.667f, 0.0f, 1.065f, 0.4f, 1.065f, 1.068f)
                curveToRelative(0.0f, 0.327f, -0.093f, 0.585f, -0.277f, 0.775f)
                curveToRelative(-0.188f, 0.19f, -0.46f, 0.292f, -0.788f, 0.292f)
                close()
                moveTo(14.985f, 10.445f)
                curveToRelative(-0.327f, 0.0f, -0.6f, -0.101f, -0.787f, -0.292f)
                curveToRelative(-0.185f, -0.187f, -0.277f, -0.448f, -0.277f, -0.775f)
                curveToRelative(0.0f, -0.667f, 0.398f, -1.068f, 1.064f, -1.068f)
                curveToRelative(0.667f, 0.0f, 1.065f, 0.4f, 1.065f, 1.068f)
                curveToRelative(0.0f, 0.327f, -0.093f, 0.585f, -0.278f, 0.775f)
                curveToRelative(-0.187f, 0.19f, -0.459f, 0.292f, -0.787f, 0.292f)
                close()
            }
        }
        .build()
        return _smileyHappyLight!!
    }

private var _smileyHappyLight: ImageVector? = null
