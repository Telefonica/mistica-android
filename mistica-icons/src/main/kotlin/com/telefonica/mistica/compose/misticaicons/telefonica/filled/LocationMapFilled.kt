package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.LocationMapFilled: ImageVector
    get() {
        if (_locationMapFilled != null) {
            return _locationMapFilled!!
        }
        _locationMapFilled = Builder(name = "LocationMapFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.365f, 18.873f)
                lineToRelative(-0.664f, -3.869f)
                lineToRelative(1.863f, -0.93f)
                lineToRelative(1.742f, 6.093f)
                lineToRelative(-2.941f, -1.294f)
                close()
                moveTo(12.603f, 20.343f)
                lineTo(12.617f, 18.315f)
                curveToRelative(0.476f, -0.532f, 1.493f, -1.773f, 2.521f, -3.305f)
                lineToRelative(0.364f, 0.118f)
                lineToRelative(0.647f, 3.792f)
                lineToRelative(-3.546f, 1.423f)
                close()
                moveTo(12.03f, 9.111f)
                curveToRelative(-0.89f, 0.0f, -1.305f, -0.415f, -1.305f, -1.306f)
                curveToRelative(0.0f, -0.89f, 0.414f, -1.305f, 1.305f, -1.305f)
                curveToRelative(0.89f, 0.0f, 1.305f, 0.415f, 1.305f, 1.305f)
                curveToRelative(0.003f, 0.888f, -0.412f, 1.306f, -1.305f, 1.306f)
                close()
                moveTo(11.397f, 20.36f)
                lineTo(7.853f, 18.906f)
                lineTo(8.29f, 15.077f)
                lineTo(8.806f, 14.926f)
                curveToRelative(1.02f, 1.557f, 2.05f, 2.843f, 2.605f, 3.44f)
                lineToRelative(-0.014f, 1.994f)
                close()
                moveTo(6.643f, 18.89f)
                lineTo(3.725f, 20.158f)
                lineTo(5.632f, 14.102f)
                lineTo(7.1f, 14.932f)
                lineTo(6.643f, 18.889f)
                close()
                moveTo(21.817f, 21.069f)
                lineTo(19.523f, 13.044f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.849f, -0.376f)
                lineToRelative(-2.695f, 1.345f)
                lineToRelative(-0.168f, -0.053f)
                curveToRelative(1.166f, -1.902f, 2.174f, -4.06f, 2.18f, -5.816f)
                curveToRelative(0.01f, -3.742f, -2.216f, -5.983f, -5.958f, -5.994f)
                horizontalLineToRelative(-0.028f)
                curveToRelative(-3.726f, 0.0f, -5.956f, 2.227f, -5.97f, 5.96f)
                curveToRelative(-0.005f, 1.687f, 0.964f, 3.83f, 2.107f, 5.749f)
                lineToRelative(-0.322f, 0.092f)
                lineToRelative(-2.244f, -1.269f)
                arcToRelative(0.599f, 0.599f, 0.0f, false, false, -0.871f, 0.342f)
                lineToRelative(-2.527f, 8.025f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.815f, 0.737f)
                lineToRelative(4.23f, -1.838f)
                lineToRelative(4.429f, 1.815f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, 0.09f, 0.028f)
                lineToRelative(0.111f, 0.026f)
                curveToRelative(0.12f, 0.03f, 0.247f, 0.02f, 0.365f, -0.026f)
                lineToRelative(4.605f, -1.843f)
                lineToRelative(4.168f, 1.838f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, 0.641f, -0.098f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, false, 0.185f, -0.62f)
                close()
            }
        }
        .build()
        return _locationMapFilled!!
    }

private var _locationMapFilled: ImageVector? = null
