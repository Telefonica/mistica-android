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

public val RegularGroup.PowerRegular: ImageVector
    get() {
        if (_powerRegular != null) {
            return _powerRegular!!
        }
        _powerRegular = Builder(name = "PowerRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 2.15f)
                curveToRelative(3.129f, 0.0f, 5.563f, 0.818f, 7.238f, 2.429f)
                curveToRelative(1.737f, 1.675f, 2.616f, 4.17f, 2.616f, 7.425f)
                curveToRelative(0.0f, 3.252f, -0.88f, 5.751f, -2.616f, 7.423f)
                curveToRelative(-1.675f, 1.611f, -4.11f, 2.426f, -7.238f, 2.426f)
                curveToRelative(-3.13f, 0.0f, -5.563f, -0.818f, -7.236f, -2.428f)
                curveToRelative(-1.733f, -1.673f, -2.613f, -4.169f, -2.613f, -7.423f)
                curveToRelative(0.0f, -3.253f, 0.88f, -5.751f, 2.613f, -7.426f)
                curveTo(6.436f, 2.968f, 8.87f, 2.15f, 12.0f, 2.15f)
                close()
                moveTo(11.999f, 3.24f)
                curveToRelative(-5.813f, 0.0f, -8.76f, 2.95f, -8.76f, 8.764f)
                curveToRelative(0.0f, 5.813f, 2.947f, 8.76f, 8.76f, 8.76f)
                curveToRelative(5.815f, 0.0f, 8.764f, -2.947f, 8.764f, -8.76f)
                curveTo(20.761f, 6.19f, 17.813f, 3.24f, 12.0f, 3.24f)
                close()
                moveTo(13.693f, 6.072f)
                curveToRelative(1.435f, 0.263f, 2.544f, 0.899f, 3.303f, 1.89f)
                curveToRelative(0.77f, 1.009f, 1.16f, 2.37f, 1.16f, 4.05f)
                curveToRelative(0.0f, 1.995f, -0.547f, 3.536f, -1.625f, 4.572f)
                curveToRelative(-1.036f, 1.006f, -2.535f, 1.513f, -4.454f, 1.513f)
                curveToRelative(-1.919f, 0.0f, -3.417f, -0.507f, -4.454f, -1.507f)
                curveToRelative(-1.075f, -1.037f, -1.621f, -2.577f, -1.621f, -4.572f)
                curveToRelative(0.0f, -1.658f, 0.378f, -3.005f, 1.126f, -4.008f)
                curveToRelative(0.736f, -0.989f, 1.82f, -1.633f, 3.218f, -1.91f)
                arcToRelative(0.559f, 0.559f, 0.0f, true, true, 0.219f, 1.098f)
                curveToRelative(-2.32f, 0.462f, -3.446f, 2.039f, -3.446f, 4.82f)
                curveToRelative(0.0f, 1.681f, 0.432f, 2.947f, 1.28f, 3.765f)
                curveToRelative(0.821f, 0.79f, 2.06f, 1.19f, 3.678f, 1.19f)
                curveToRelative(1.62f, 0.0f, 2.857f, -0.4f, 3.678f, -1.193f)
                curveToRelative(0.849f, -0.818f, 1.28f, -2.084f, 1.28f, -3.764f)
                curveToRelative(0.0f, -2.821f, -1.16f, -4.404f, -3.543f, -4.84f)
                arcToRelative(0.56f, 0.56f, 0.0f, true, true, 0.201f, -1.104f)
                close()
                moveTo(12.05f, 4.326f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.253f, 0.56f, 0.56f)
                verticalLineToRelative(4.099f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                lineTo(11.49f, 4.887f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                close()
            }
        }
        .build()
        return _powerRegular!!
    }

private var _powerRegular: ImageVector? = null
