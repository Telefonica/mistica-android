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

public val LightGroup.BookLight: ImageVector
    get() {
        if (_bookLight != null) {
            return _bookLight!!
        }
        _bookLight = Builder(name = "BookLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.022f, 17.308f)
                curveToRelative(-4.101f, 0.076f, -7.325f, 1.291f, -8.614f, 1.857f)
                lineTo(12.408f, 6.355f)
                curveToRelative(3.404f, -1.725f, 7.384f, -1.753f, 8.614f, -1.716f)
                verticalLineToRelative(12.669f)
                close()
                moveTo(2.977f, 4.641f)
                curveToRelative(1.224f, -0.039f, 5.21f, -0.008f, 8.613f, 1.717f)
                verticalLineToRelative(12.81f)
                curveToRelative(-1.285f, -0.566f, -4.512f, -1.779f, -8.613f, -1.857f)
                lineTo(2.977f, 4.64f)
                close()
                moveTo(21.464f, 3.846f)
                curveToRelative(-0.215f, -0.02f, -5.193f, -0.378f, -9.467f, 1.81f)
                curveToRelative(-4.275f, -2.186f, -9.25f, -1.827f, -9.463f, -1.807f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, -0.378f, 0.403f)
                verticalLineToRelative(13.46f)
                curveToRelative(0.0f, 0.223f, 0.185f, 0.406f, 0.41f, 0.406f)
                curveToRelative(5.24f, 0.0f, 9.204f, 2.03f, 9.243f, 2.05f)
                curveToRelative(0.059f, 0.03f, 0.123f, 0.045f, 0.19f, 0.045f)
                curveToRelative(0.017f, 0.0f, 0.034f, -0.011f, 0.05f, -0.014f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.138f, -0.034f)
                lineToRelative(0.02f, -0.011f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.241f, -0.12f, 4.118f, -2.04f, 9.219f, -2.04f)
                curveToRelative(0.227f, 0.0f, 0.41f, -0.181f, 0.41f, -0.408f)
                lineTo(21.838f, 4.249f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, false, -0.374f, -0.403f)
                close()
            }
        }
        .build()
        return _bookLight!!
    }

private var _bookLight: ImageVector? = null
