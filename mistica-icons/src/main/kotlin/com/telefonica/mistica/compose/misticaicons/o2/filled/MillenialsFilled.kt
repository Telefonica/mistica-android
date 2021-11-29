package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.MillenialsFilled: ImageVector
    get() {
        if (_millenialsFilled != null) {
            return _millenialsFilled!!
        }
        _millenialsFilled = Builder(name = "MillenialsFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.637f, 6.72f)
                curveToRelative(0.195f, 0.466f, 0.311f, 0.977f, 0.311f, 1.513f)
                curveToRelative(0.0f, 1.38f, -0.726f, 2.579f, -1.804f, 3.225f)
                curveToRelative(2.335f, 0.552f, 3.896f, 2.18f, 3.896f, 4.264f)
                lineTo(14.04f, 22.0f)
                lineTo(2.619f, 22.0f)
                verticalLineToRelative(-6.278f)
                curveToRelative(0.0f, -2.085f, 1.56f, -3.712f, 3.896f, -4.268f)
                arcToRelative(3.66f, 3.66f, 0.0f, false, true, -0.46f, -0.334f)
                curveToRelative(0.085f, -0.523f, 0.36f, -1.14f, 0.48f, -1.367f)
                curveToRelative(0.627f, -1.211f, 1.673f, -2.06f, 3.082f, -2.509f)
                close()
                moveTo(19.892f, 5.37f)
                curveToRelative(0.008f, 0.12f, 0.016f, 0.243f, 0.016f, 0.362f)
                curveToRelative(0.0f, 1.38f, -0.726f, 2.579f, -1.804f, 3.226f)
                curveTo(20.439f, 9.51f, 22.0f, 11.137f, 22.0f, 13.22f)
                verticalLineToRelative(6.637f)
                horizontalLineToRelative(-6.918f)
                verticalLineToRelative(-4.136f)
                curveToRelative(0.0f, -1.99f, -1.126f, -3.7f, -2.982f, -4.676f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.686f, -1.42f)
                arcToRelative(6.284f, 6.284f, 0.0f, false, true, 1.697f, -0.668f)
                arcToRelative(3.722f, 3.722f, 0.0f, false, true, -1.469f, -1.669f)
                close()
                moveTo(5.046f, 2.66f)
                curveToRelative(1.118f, 0.0f, 2.032f, 0.926f, 2.056f, 2.071f)
                curveToRelative(0.383f, -0.14f, 0.794f, -0.23f, 1.225f, -0.23f)
                curveToRelative(1.082f, 0.0f, 2.048f, 0.49f, 2.707f, 1.272f)
                lineToRelative(-1.705f, 0.441f)
                curveTo(7.645f, 6.75f, 6.36f, 7.8f, 5.613f, 9.246f)
                curveToRelative(-0.032f, 0.066f, -0.216f, 0.429f, -0.38f, 0.898f)
                arcToRelative(3.932f, 3.932f, 0.0f, false, true, -0.439f, -1.166f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -0.654f, 0.116f)
                curveToRelative(-0.192f, 0.0f, -0.356f, -0.03f, -0.491f, -0.07f)
                curveToRelative(-0.787f, -0.235f, -1.142f, -0.948f, -1.174f, -1.03f)
                lineTo(2.0f, 6.968f)
                horizontalLineToRelative(0.99f)
                lineTo(2.99f, 4.781f)
                curveToRelative(0.0f, -1.17f, 0.922f, -2.122f, 2.056f, -2.122f)
                close()
                moveTo(16.29f, 2.0f)
                curveToRelative(0.986f, 0.0f, 1.88f, 0.412f, 2.535f, 1.071f)
                lineToRelative(2.304f, -0.634f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, 0.846f, 0.506f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, true, -0.483f, 0.874f)
                horizontalLineToRelative(-0.004f)
                lineToRelative(-0.04f, 0.012f)
                lineToRelative(-1.808f, 0.503f)
                lineToRelative(-6.926f, 1.932f)
                arcToRelative(3.365f, 3.365f, 0.0f, false, true, -0.04f, -0.532f)
                curveTo(12.675f, 3.677f, 14.299f, 2.0f, 16.29f, 2.0f)
                close()
            }
        }
        .build()
        return _millenialsFilled!!
    }

private var _millenialsFilled: ImageVector? = null
