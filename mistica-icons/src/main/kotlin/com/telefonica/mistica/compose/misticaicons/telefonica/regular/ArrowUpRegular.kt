package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ArrowUpRegular: ImageVector
    get() {
        if (_arrowUpRegular != null) {
            return _arrowUpRegular!!
        }
        _arrowUpRegular = Builder(name = "ArrowUpRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.028f, 21.734f)
                curveToRelative(-0.034f, 0.0f, -0.067f, 0.0f, -0.1f, -0.003f)
                lineTo(8.881f, 21.731f)
                curveToRelative(-0.42f, 0.008f, -1.025f, -0.03f, -1.445f, -0.437f)
                curveToRelative(-0.423f, -0.409f, -0.479f, -1.008f, -0.487f, -1.426f)
                verticalLineToRelative(-0.008f)
                lineToRelative(0.002f, -6.712f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, false, -0.053f, -0.156f)
                lineToRelative(-3.563f, 0.005f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.858f, -0.005f, -1.149f, -0.414f, -1.247f, -0.658f)
                curveToRelative(-0.168f, -0.417f, -0.014f, -0.9f, 0.42f, -1.322f)
                lineToRelative(8.712f, -8.658f)
                curveToRelative(0.084f, -0.087f, 0.327f, -0.334f, 0.686f, -0.334f)
                horizontalLineToRelative(0.006f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.593f, 0.275f)
                lineToRelative(8.703f, 8.481f)
                curveToRelative(0.446f, 0.426f, 0.608f, 1.017f, 0.407f, 1.505f)
                curveToRelative(-0.177f, 0.434f, -0.6f, 0.703f, -1.107f, 0.694f)
                lineToRelative(-3.65f, 0.003f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, false, -0.056f, 0.037f)
                lineToRelative(-0.02f, 6.882f)
                curveToRelative(0.01f, 0.616f, -0.145f, 1.067f, -0.467f, 1.384f)
                curveToRelative(-0.297f, 0.302f, -0.72f, 0.448f, -1.283f, 0.448f)
                close()
                moveTo(14.933f, 20.641f)
                horizontalLineToRelative(0.017f)
                curveToRelative(0.207f, 0.006f, 0.479f, -0.01f, 0.602f, -0.128f)
                curveToRelative(0.12f, -0.12f, 0.143f, -0.39f, 0.14f, -0.597f)
                verticalLineToRelative(-0.008f)
                lineToRelative(0.02f, -6.956f)
                curveToRelative(0.0f, -0.585f, 0.613f, -1.056f, 1.12f, -1.056f)
                lineToRelative(3.678f, -0.005f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.193f, 0.193f, 0.0f, false, false, 0.084f, -0.014f)
                curveToRelative(0.014f, -0.02f, 0.017f, -0.152f, -0.148f, -0.308f)
                lineToRelative(-0.006f, -0.006f)
                lineToRelative(-8.554f, -8.336f)
                lineToRelative(-8.62f, 8.566f)
                lineToRelative(-0.005f, 0.005f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, false, -0.09f, 0.098f)
                curveToRelative(0.042f, 0.006f, 0.096f, 0.012f, 0.163f, 0.012f)
                lineToRelative(3.711f, -0.006f)
                curveToRelative(0.653f, 0.0f, 0.995f, 0.81f, 0.995f, 1.246f)
                lineToRelative(-0.003f, 6.71f)
                curveToRelative(0.005f, 0.335f, 0.059f, 0.562f, 0.154f, 0.655f)
                curveToRelative(0.095f, 0.092f, 0.328f, 0.137f, 0.672f, 0.128f)
                horizontalLineToRelative(6.062f)
                close()
            }
        }
        .build()
        return _arrowUpRegular!!
    }

private var _arrowUpRegular: ImageVector? = null
