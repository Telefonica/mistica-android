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

public val LightGroup.MultideviceLight: ImageVector
    get() {
        if (_multideviceLight != null) {
            return _multideviceLight!!
        }
        _multideviceLight = Builder(name = "MultideviceLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.086f, 18.282f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(7.624f, 18.842f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(5.462f)
                close()
                moveTo(15.537f, 5.156f)
                curveToRelative(1.014f, 0.0f, 1.785f, 0.294f, 2.292f, 0.874f)
                curveToRelative(0.476f, 0.546f, 0.72f, 1.353f, 0.72f, 2.398f)
                verticalLineToRelative(0.285f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.613f, 0.0f, 1.059f, 0.15f, 1.364f, 0.454f)
                curveToRelative(0.303f, 0.306f, 0.451f, 0.751f, 0.451f, 1.362f)
                verticalLineToRelative(6.49f)
                curveToRelative(0.0f, 1.224f, -0.594f, 1.818f, -1.815f, 1.818f)
                horizontalLineToRelative(-2.938f)
                curveToRelative(-1.222f, 0.0f, -1.816f, -0.594f, -1.816f, -1.815f)
                verticalLineToRelative(-0.382f)
                lineTo(5.167f, 16.64f)
                curveToRelative(-1.014f, 0.0f, -1.784f, -0.293f, -2.29f, -0.873f)
                curveToRelative(-0.477f, -0.546f, -0.72f, -1.353f, -0.72f, -2.398f)
                lineTo(2.157f, 8.428f)
                curveToRelative(0.0f, -1.045f, 0.24f, -1.852f, 0.72f, -2.398f)
                curveToRelative(0.506f, -0.58f, 1.276f, -0.874f, 2.29f, -0.874f)
                horizontalLineToRelative(10.37f)
                close()
                moveTo(20.019f, 9.276f)
                horizontalLineToRelative(-2.938f)
                curveToRelative(-0.891f, 0.0f, -1.255f, 0.365f, -1.255f, 1.256f)
                verticalLineToRelative(6.49f)
                curveToRelative(0.0f, 0.905f, 0.353f, 1.255f, 1.255f, 1.255f)
                horizontalLineToRelative(2.938f)
                curveToRelative(0.905f, 0.0f, 1.255f, -0.353f, 1.255f, -1.255f)
                verticalLineToRelative(-6.49f)
                curveToRelative(0.0f, -0.905f, -0.353f, -1.255f, -1.255f, -1.255f)
                close()
                moveTo(18.551f, 16.462f)
                curveToRelative(0.283f, 0.0f, 0.465f, 0.148f, 0.468f, 0.47f)
                curveToRelative(0.0f, 0.154f, -0.042f, 0.266f, -0.118f, 0.345f)
                curveToRelative(-0.084f, 0.084f, -0.201f, 0.123f, -0.35f, 0.123f)
                curveToRelative(-0.148f, 0.0f, -0.269f, -0.04f, -0.35f, -0.123f)
                curveToRelative(-0.076f, -0.076f, -0.118f, -0.19f, -0.118f, -0.345f)
                curveToRelative(0.0f, -0.322f, 0.185f, -0.47f, 0.468f, -0.47f)
                close()
                moveTo(15.537f, 5.714f)
                lineTo(5.167f, 5.714f)
                curveToRelative(-1.672f, 0.0f, -2.45f, 0.862f, -2.45f, 2.714f)
                verticalLineToRelative(4.938f)
                curveToRelative(0.0f, 1.852f, 0.778f, 2.715f, 2.45f, 2.715f)
                horizontalLineToRelative(10.098f)
                verticalLineToRelative(-5.55f)
                curveToRelative(0.0f, -0.602f, 0.149f, -1.041f, 0.454f, -1.352f)
                curveToRelative(0.308f, -0.311f, 0.754f, -0.465f, 1.362f, -0.465f)
                horizontalLineToRelative(0.906f)
                lineToRelative(0.001f, -0.286f)
                curveToRelative(0.0f, -1.852f, -0.779f, -2.714f, -2.45f, -2.714f)
                close()
            }
        }
        .build()
        return _multideviceLight!!
    }

private var _multideviceLight: ImageVector? = null
