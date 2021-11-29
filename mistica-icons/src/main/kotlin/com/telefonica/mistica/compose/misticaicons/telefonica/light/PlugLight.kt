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

public val LightGroup.PlugLight: ImageVector
    get() {
        if (_plugLight != null) {
            return _plugLight!!
        }
        _plugLight = Builder(name = "PlugLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.192f, 2.0f)
                curveToRelative(0.801f, 0.0f, 1.448f, 0.641f, 1.448f, 1.429f)
                verticalLineToRelative(3.95f)
                horizontalLineToRelative(0.84f)
                curveToRelative(0.547f, 0.0f, 0.99f, 0.439f, 0.995f, 0.974f)
                verticalLineToRelative(0.07f)
                curveToRelative(0.0f, 2.787f, -1.227f, 4.246f, -2.336f, 5.0f)
                verticalLineToRelative(1.28f)
                curveToRelative(0.0f, 0.636f, -0.202f, 1.154f, -0.586f, 1.496f)
                curveToRelative(-0.364f, 0.333f, -0.877f, 0.501f, -1.524f, 0.501f)
                horizontalLineToRelative(-0.044f)
                verticalLineToRelative(4.227f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, true, -0.77f, 0.76f)
                horizontalLineToRelative(-1.788f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, true, -0.77f, -0.76f)
                lineTo(10.657f, 16.7f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.652f, 0.0f, -1.168f, -0.168f, -1.535f, -0.501f)
                curveToRelative(-0.39f, -0.336f, -0.6f, -0.854f, -0.6f, -1.493f)
                verticalLineToRelative(-1.272f)
                curveToRelative(-1.108f, -0.75f, -2.335f, -2.218f, -2.335f, -5.039f)
                curveToRelative(0.0f, -0.583f, 0.445f, -1.02f, 0.991f, -1.02f)
                horizontalLineToRelative(0.687f)
                lineTo(7.845f, 3.43f)
                curveTo(7.845f, 2.639f, 8.492f, 2.0f, 9.29f, 2.0f)
                curveToRelative(0.801f, 0.0f, 1.448f, 0.641f, 1.448f, 1.429f)
                verticalLineToRelative(3.946f)
                lineToRelative(3.008f, 0.003f)
                verticalLineToRelative(-3.95f)
                curveToRelative(0.0f, -0.79f, 0.65f, -1.428f, 1.446f, -1.428f)
                close()
                moveTo(13.139f, 16.7f)
                horizontalLineToRelative(-1.642f)
                verticalLineToRelative(4.154f)
                horizontalLineToRelative(1.642f)
                lineTo(13.139f, 16.7f)
                close()
                moveTo(7.16f, 8.207f)
                arcToRelative(0.147f, 0.147f, 0.0f, false, false, -0.148f, 0.146f)
                curveToRelative(0.0f, 2.137f, 0.72f, 3.639f, 2.134f, 4.504f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, 0.199f, 0.353f)
                verticalLineToRelative(1.499f)
                curveToRelative(0.0f, 0.395f, 0.106f, 0.689f, 0.32f, 0.874f)
                curveToRelative(0.215f, 0.193f, 0.537f, 0.288f, 0.968f, 0.288f)
                horizontalLineToRelative(3.39f)
                curveToRelative(0.428f, 0.0f, 0.75f, -0.095f, 0.955f, -0.283f)
                curveToRelative(0.207f, -0.187f, 0.31f, -0.482f, 0.31f, -0.882f)
                verticalLineToRelative(-1.504f)
                curveToRelative(0.0f, -0.146f, 0.077f, -0.278f, 0.2f, -0.353f)
                curveToRelative(1.417f, -0.871f, 2.137f, -2.362f, 2.137f, -4.423f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.07f, 0.006f, -0.067f)
                arcToRelative(0.147f, 0.147f, 0.0f, false, false, -0.149f, -0.146f)
                close()
                moveTo(15.19f, 2.832f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, false, -0.601f, 0.597f)
                lineToRelative(0.002f, 3.95f)
                horizontalLineToRelative(1.205f)
                verticalLineToRelative(-3.95f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.605f, -0.597f)
                close()
                moveTo(9.289f, 2.832f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, false, -0.602f, 0.597f)
                verticalLineToRelative(3.946f)
                horizontalLineToRelative(1.207f)
                lineTo(9.894f, 3.43f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.605f, -0.597f)
                close()
            }
        }
        .build()
        return _plugLight!!
    }

private var _plugLight: ImageVector? = null
