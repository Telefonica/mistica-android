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

public val RegularGroup.StormRegular: ImageVector
    get() {
        if (_stormRegular != null) {
            return _stormRegular!!
        }
        _stormRegular = Builder(name = "StormRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.565f, 15.18f)
                lineToRelative(-0.555f, 0.004f)
                lineToRelative(0.028f, -0.031f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, -0.303f, -1.02f)
                lineToRelative(-2.831f, -0.641f)
                lineToRelative(1.689f, -4.404f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.244f, -0.74f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.762f, 0.102f)
                lineToRelative(-5.941f, 6.462f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.146f, 0.316f)
                lineToRelative(-1.008f, 0.003f)
                curveToRelative(-0.941f, 0.0f, -3.132f, -0.308f, -3.132f, -3.151f)
                curveToRelative(0.0f, -1.6f, 0.678f, -2.605f, 2.014f, -2.989f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.44f, -0.588f)
                lineToRelative(-0.006f, -0.112f)
                curveToRelative(0.0f, -4.661f, 4.031f, -5.025f, 5.266f, -5.025f)
                curveToRelative(0.7f, 0.0f, 4.236f, 0.16f, 5.073f, 3.31f)
                curveToRelative(0.07f, 0.261f, 0.3f, 0.446f, 0.566f, 0.454f)
                curveToRelative(1.18f, 0.034f, 3.916f, 0.49f, 3.916f, 4.012f)
                curveToRelative(0.0f, 3.747f, -3.106f, 4.039f, -4.064f, 4.039f)
                moveToRelative(-4.7f, 0.596f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, false, -0.401f, -0.305f)
                lineToRelative(-2.219f, -0.504f)
                lineToRelative(3.081f, -3.35f)
                lineToRelative(-0.803f, 2.095f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, 0.43f, 0.818f)
                lineToRelative(2.472f, 0.557f)
                lineToRelative(-3.415f, 3.58f)
                lineToRelative(0.888f, -2.386f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.034f, -0.505f)
                moveToRelative(5.317f, -9.834f)
                curveTo(15.934f, 2.34f, 11.895f, 2.15f, 11.07f, 2.15f)
                curveToRelative(-1.061f, 0.0f, -6.274f, 0.291f, -6.467f, 5.922f)
                curveToRelative(-1.07f, 0.43f, -2.454f, 1.479f, -2.454f, 4.014f)
                curveToRelative(0.0f, 3.224f, 2.244f, 4.372f, 4.345f, 4.372f)
                lineToRelative(3.683f, -0.017f)
                curveToRelative(0.008f, 0.0f, 0.014f, -0.002f, 0.025f, -0.005f)
                lineToRelative(0.322f, 0.073f)
                lineToRelative(-1.675f, 4.498f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.566f, 0.826f)
                curveToRelative(0.16f, 0.0f, 0.32f, -0.064f, 0.434f, -0.187f)
                lineToRelative(4.992f, -5.238f)
                lineToRelative(1.728f, -0.009f)
                curveToRelative(2.432f, 0.0f, 5.266f, -1.375f, 5.266f, -5.255f)
                curveToRelative(0.0f, -3.526f, -2.327f, -4.983f, -4.655f, -5.201f)
            }
        }
        .build()
        return _stormRegular!!
    }

private var _stormRegular: ImageVector? = null
