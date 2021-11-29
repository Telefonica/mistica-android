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

public val LightGroup.PoundSymbolCircleLight: ImageVector
    get() {
        if (_poundSymbolCircleLight != null) {
            return _poundSymbolCircleLight!!
        }
        _poundSymbolCircleLight = Builder(name = "PoundSymbolCircleLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.026f)
                curveToRelative(5.99f, 0.0f, 9.023f, -3.034f, 9.023f, -9.02f)
                curveToRelative(0.0f, -5.989f, -3.037f, -9.022f, -9.023f, -9.022f)
                reflectiveCurveToRelative(-9.02f, 3.033f, -9.02f, 9.022f)
                curveToRelative(0.0f, 5.983f, 3.037f, 9.02f, 9.02f, 9.02f)
                close()
                moveTo(12.0f, 2.16f)
                curveToRelative(6.443f, 0.0f, 9.846f, 3.406f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.44f, 3.403f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(14.916f, 16.942f)
                curveToRelative(0.112f, 0.0f, 0.205f, 0.092f, 0.205f, 0.204f)
                verticalLineToRelative(0.44f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.205f, 0.204f)
                lineTo(8.62f, 17.79f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.184f, -0.112f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.07f, -0.336f)
                curveToRelative(0.0f, -0.367f, 0.19f, -0.552f, 0.647f, -0.994f)
                curveToRelative(0.938f, -0.905f, 1.126f, -1.58f, 1.126f, -2.373f)
                curveToRelative(0.0f, -0.557f, -0.096f, -1.106f, -0.303f, -1.765f)
                lineTo(8.667f, 12.21f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.204f, -0.204f)
                verticalLineToRelative(-0.277f)
                curveToRelative(0.0f, -0.11f, 0.08f, -0.196f, 0.19f, -0.205f)
                lineToRelative(0.936f, -0.064f)
                curveToRelative(-0.19f, -0.572f, -0.379f, -1.345f, -0.379f, -2.157f)
                curveToRelative(0.0f, -2.104f, 1.21f, -3.263f, 3.41f, -3.263f)
                curveToRelative(0.568f, 0.0f, 1.49f, 0.078f, 2.21f, 0.302f)
                arcToRelative(0.208f, 0.208f, 0.0f, false, true, 0.142f, 0.196f)
                verticalLineToRelative(0.376f)
                arcToRelative(0.208f, 0.208f, 0.0f, false, true, -0.073f, 0.156f)
                arcToRelative(0.219f, 0.219f, 0.0f, false, true, -0.17f, 0.045f)
                arcToRelative(10.94f, 10.94f, 0.0f, false, false, -1.947f, -0.207f)
                curveToRelative(-1.787f, 0.0f, -2.658f, 0.779f, -2.658f, 2.38f)
                curveToRelative(0.0f, 0.738f, 0.187f, 1.471f, 0.386f, 2.104f)
                horizontalLineToRelative(2.678f)
                curveToRelative(0.112f, 0.0f, 0.204f, 0.093f, 0.204f, 0.205f)
                verticalLineToRelative(0.409f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.204f, 0.204f)
                horizontalLineToRelative(-2.42f)
                curveToRelative(0.18f, 0.608f, 0.266f, 1.205f, 0.266f, 1.78f)
                curveToRelative(0.0f, 1.156f, -0.37f, 1.946f, -1.429f, 2.949f)
                horizontalLineToRelative(5.311f)
                verticalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleLight!!
    }

private var _poundSymbolCircleLight: ImageVector? = null
