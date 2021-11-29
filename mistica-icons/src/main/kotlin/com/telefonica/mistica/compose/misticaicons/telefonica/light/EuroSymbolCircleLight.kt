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

public val LightGroup.EuroSymbolCircleLight: ImageVector
    get() {
        if (_euroSymbolCircleLight != null) {
            return _euroSymbolCircleLight!!
        }
        _euroSymbolCircleLight = Builder(name = "EuroSymbolCircleLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 21.022f)
                curveToRelative(5.988f, 0.0f, 9.022f, -3.034f, 9.022f, -9.02f)
                curveToRelative(0.0f, -5.989f, -3.034f, -9.022f, -9.022f, -9.022f)
                curveToRelative(-5.986f, 0.0f, -9.02f, 3.036f, -9.02f, 9.022f)
                curveToRelative(0.0f, 5.986f, 3.036f, 9.02f, 9.02f, 9.02f)
                close()
                moveTo(11.997f, 2.156f)
                curveToRelative(6.442f, 0.0f, 9.846f, 3.406f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.404f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.44f, 3.403f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(15.985f, 16.582f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.535f, 0.224f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.184f, 0.518f)
                curveToRelative(-0.85f, 0.4f, -1.891f, 0.605f, -3.096f, 0.605f)
                curveToRelative(-3.199f, 0.0f, -5.151f, -1.4f, -5.74f, -4.064f)
                lineTo(6.199f, 13.865f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.0f, -0.824f)
                horizontalLineToRelative(1.174f)
                curveToRelative(-0.04f, -0.347f, -0.059f, -0.694f, -0.062f, -1.044f)
                curveToRelative(0.0f, -0.196f, 0.009f, -0.387f, 0.02f, -0.572f)
                lineTo(6.198f, 11.425f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.0f, -0.823f)
                horizontalLineToRelative(1.219f)
                curveTo(7.885f, 7.66f, 9.913f, 6.06f, 13.24f, 6.06f)
                curveToRelative(1.188f, 0.0f, 2.219f, 0.199f, 3.065f, 0.591f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.168f, 0.557f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.513f, 0.188f)
                curveToRelative(-0.737f, -0.342f, -1.652f, -0.515f, -2.72f, -0.515f)
                curveToRelative(-2.885f, 0.0f, -4.546f, 1.257f, -4.98f, 3.717f)
                horizontalLineToRelative(3.994f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.0f, 0.823f)
                lineTo(8.167f, 11.421f)
                curveToRelative(-0.01f, 0.19f, -0.039f, 0.37f, -0.039f, 0.572f)
                curveToRelative(0.0f, 0.37f, 0.031f, 0.714f, 0.07f, 1.045f)
                horizontalLineToRelative(4.05f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, 0.0f, 0.823f)
                lineTo(8.367f, 13.861f)
                curveToRelative(0.56f, 2.143f, 2.182f, 3.244f, 4.871f, 3.244f)
                curveToRelative(1.085f, 0.003f, 2.006f, -0.174f, 2.748f, -0.524f)
                close()
            }
        }
        .build()
        return _euroSymbolCircleLight!!
    }

private var _euroSymbolCircleLight: ImageVector? = null
