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

public val FilledGroup.CafeFilled: ImageVector
    get() {
        if (_cafeFilled != null) {
            return _cafeFilled!!
        }
        _cafeFilled = Builder(name = "CafeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.964f, 17.288f)
                curveToRelative(1.288f, -0.114f, 3.481f, -0.767f, 3.481f, -3.893f)
                curveToRelative(0.0f, -3.112f, -2.182f, -3.784f, -3.481f, -3.91f)
                verticalLineToRelative(7.803f)
                close()
                moveTo(16.964f, 8.258f)
                curveToRelative(1.338f, 0.12f, 4.75f, 0.846f, 4.75f, 5.137f)
                curveToRelative(0.0f, 4.367f, -3.518f, 5.028f, -4.804f, 5.123f)
                curveToRelative(-0.109f, 0.93f, -0.431f, 1.664f, -0.997f, 2.205f)
                curveToRelative(-0.7f, 0.666f, -1.683f, 0.991f, -3.011f, 0.991f)
                lineTo(6.084f, 21.714f)
                curveToRelative(-1.328f, 0.0f, -2.31f, -0.325f, -3.011f, -0.991f)
                curveToRelative(-0.706f, -0.673f, -1.048f, -1.628f, -1.048f, -2.916f)
                lineTo(2.025f, 7.249f)
                curveToRelative(0.0f, -0.339f, 0.286f, -0.613f, 0.636f, -0.613f)
                horizontalLineToRelative(13.664f)
                curveToRelative(0.35f, 0.0f, 0.636f, 0.274f, 0.636f, 0.613f)
                verticalLineToRelative(1.009f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(7.482f, 5.625f)
                curveToRelative(0.0f, -0.21f, -0.081f, -0.336f, -0.236f, -0.563f)
                curveToRelative(-0.165f, -0.236f, -0.37f, -0.53f, -0.372f, -0.953f)
                curveToRelative(-0.003f, -0.431f, 0.21f, -0.717f, 0.364f, -0.93f)
                curveToRelative(0.149f, -0.201f, 0.247f, -0.336f, 0.244f, -0.619f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.546f, -0.535f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.302f, 0.0f, 0.549f, 0.236f, 0.551f, 0.524f)
                curveToRelative(0.006f, 0.625f, -0.266f, 0.997f, -0.448f, 1.244f)
                curveToRelative(-0.123f, 0.165f, -0.162f, 0.227f, -0.16f, 0.308f)
                curveToRelative(0.0f, 0.1f, 0.065f, 0.196f, 0.185f, 0.37f)
                curveToRelative(0.18f, 0.257f, 0.426f, 0.61f, 0.423f, 1.154f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.551f, 0.53f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, true, -0.552f, -0.53f)
                close()
                moveTo(10.216f, 5.672f)
                curveToRelative(-0.017f, -0.067f, -0.13f, -0.238f, -0.188f, -0.327f)
                curveToRelative(-0.137f, -0.21f, -0.269f, -0.407f, -0.275f, -0.64f)
                curveToRelative(-0.01f, -0.285f, 0.16f, -0.529f, 0.309f, -0.741f)
                curveToRelative(0.053f, -0.079f, 0.145f, -0.208f, 0.16f, -0.258f)
                curveToRelative(-0.015f, -0.294f, 0.218f, -0.516f, 0.52f, -0.53f)
                curveToRelative(0.289f, 0.009f, 0.56f, 0.239f, 0.574f, 0.533f)
                curveToRelative(0.017f, 0.333f, -0.182f, 0.616f, -0.341f, 0.846f)
                arcToRelative(8.805f, 8.805f, 0.0f, false, false, -0.084f, 0.123f)
                lineToRelative(0.067f, 0.1f)
                curveToRelative(0.148f, 0.228f, 0.336f, 0.508f, 0.356f, 0.816f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, true, -0.513f, 0.566f)
                lineToRelative(-0.04f, 0.002f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.545f, -0.49f)
                close()
            }
        }
        .build()
        return _cafeFilled!!
    }

private var _cafeFilled: ImageVector? = null
