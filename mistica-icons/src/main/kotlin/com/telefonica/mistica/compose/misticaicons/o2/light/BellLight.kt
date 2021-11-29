package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.BellLight: ImageVector
    get() {
        if (_bellLight != null) {
            return _bellLight!!
        }
        _bellLight = Builder(name = "BellLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 1.0f)
                curveToRelative(4.203f, 0.0f, 7.602f, 3.463f, 7.598f, 7.74f)
                verticalLineToRelative(2.85f)
                curveToRelative(0.0f, 0.815f, 0.082f, 1.668f, 0.28f, 2.566f)
                curveToRelative(0.04f, 0.202f, -0.12f, 0.449f, -0.32f, 0.488f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.479f, -0.325f)
                curveToRelative(-0.16f, -0.937f, -0.28f, -1.83f, -0.28f, -2.728f)
                lineTo(18.8f, 8.74f)
                curveToRelative(0.0f, -3.828f, -3.041f, -6.926f, -6.799f, -6.926f)
                curveToRelative(-3.758f, 0.0f, -6.798f, 3.098f, -6.798f, 6.926f)
                verticalLineToRelative(2.85f)
                curveToRelative(0.0f, 2.447f, -0.717f, 4.894f, -2.039f, 6.926f)
                horizontalLineToRelative(18.439f)
                curveToRelative(0.237f, 0.0f, 0.397f, 0.163f, 0.397f, 0.41f)
                curveToRelative(0.0f, 0.246f, -0.16f, 0.409f, -0.402f, 0.409f)
                lineTo(14.68f, 19.335f)
                curveToRelative(0.082f, 0.286f, 0.12f, 0.528f, 0.12f, 0.814f)
                curveTo(14.8f, 21.737f, 13.56f, 23.0f, 12.002f, 23.0f)
                curveToRelative(-1.56f, 0.0f, -2.799f, -1.263f, -2.799f, -2.851f)
                curveToRelative(0.0f, -0.286f, 0.04f, -0.528f, 0.121f, -0.814f)
                horizontalLineToRelative(-6.92f)
                curveToRelative(-0.159f, 0.0f, -0.275f, -0.123f, -0.358f, -0.247f)
                curveToRelative(-0.082f, -0.123f, -0.043f, -0.286f, 0.04f, -0.409f)
                curveToRelative(1.48f, -2.037f, 2.319f, -4.563f, 2.319f, -7.088f)
                lineTo(4.405f, 8.74f)
                curveTo(4.404f, 4.463f, 7.799f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(13.802f, 19.335f)
                horizontalLineToRelative(-3.64f)
                curveToRelative(-0.079f, 0.242f, -0.16f, 0.528f, -0.16f, 0.814f)
                curveToRelative(0.0f, 1.14f, 0.88f, 2.037f, 2.0f, 2.037f)
                curveToRelative(1.118f, 0.0f, 1.999f, -0.898f, 1.999f, -2.037f)
                curveToRelative(0.0f, -0.286f, -0.078f, -0.572f, -0.199f, -0.814f)
                close()
                moveTo(20.402f, 15.67f)
                curveToRelative(0.441f, 0.0f, 0.799f, 0.364f, 0.799f, 0.814f)
                curveToRelative(0.0f, 0.45f, -0.358f, 0.814f, -0.8f, 0.814f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, true, -0.798f, -0.814f)
                curveToRelative(0.0f, -0.45f, 0.358f, -0.814f, 0.799f, -0.814f)
                close()
            }
        }
        .build()
        return _bellLight!!
    }

private var _bellLight: ImageVector? = null
