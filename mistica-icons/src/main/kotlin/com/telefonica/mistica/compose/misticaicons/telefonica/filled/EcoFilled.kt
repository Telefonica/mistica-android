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

public val FilledGroup.EcoFilled: ImageVector
    get() {
        if (_ecoFilled != null) {
            return _ecoFilled!!
        }
        _ecoFilled = Builder(name = "EcoFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.557f, 2.845f)
                curveToRelative(1.418f, 0.0f, 2.524f, 0.378f, 3.292f, 1.123f)
                curveToRelative(0.79f, 0.77f, 1.193f, 1.907f, 1.193f, 3.38f)
                curveToRelative(0.0f, 1.15f, -0.25f, 2.09f, -0.731f, 2.813f)
                lineToRelative(-0.093f, -0.176f)
                curveToRelative(-0.899f, -1.67f, -2.156f, -2.821f, -3.736f, -3.426f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.387f, 1.008f)
                curveToRelative(1.33f, 0.507f, 2.398f, 1.493f, 3.174f, 2.93f)
                curveToRelative(0.067f, 0.123f, 0.132f, 0.25f, 0.196f, 0.376f)
                curveToRelative(0.02f, 0.042f, 0.042f, 0.08f, 0.073f, 0.114f)
                lineToRelative(-0.004f, -0.004f)
                lineToRelative(0.777f, -0.822f)
                curveToRelative(0.914f, 1.868f, 1.329f, 4.132f, 1.535f, 6.011f)
                curveToRelative(0.383f, -1.333f, 0.845f, -2.534f, 1.377f, -3.533f)
                curveToRelative(-0.386f, -0.686f, -0.584f, -1.548f, -0.584f, -2.57f)
                curveToRelative(0.0f, -1.474f, 0.4f, -2.611f, 1.193f, -3.381f)
                curveToRelative(0.767f, -0.745f, 1.874f, -1.124f, 3.291f, -1.124f)
                horizontalLineToRelative(2.905f)
                curveToRelative(0.905f, 0.0f, 1.639f, 0.734f, 1.641f, 1.64f)
                verticalLineToRelative(2.887f)
                curveToRelative(0.0f, 2.888f, -1.605f, 4.479f, -4.518f, 4.479f)
                curveToRelative(-1.37f, 0.0f, -2.423f, -0.33f, -3.185f, -1.011f)
                curveToRelative(0.045f, -0.042f, 0.056f, -0.118f, 0.087f, -0.177f)
                curveToRelative(1.079f, -2.145f, 2.426f, -3.378f, 4.006f, -3.666f)
                arcToRelative(0.538f, 0.538f, 0.0f, true, false, -0.193f, -1.062f)
                curveToRelative(-1.863f, 0.339f, -3.423f, 1.68f, -4.642f, 3.986f)
                lineToRelative(0.001f, -0.002f)
                lineToRelative(0.741f, 0.92f)
                curveToRelative(-0.803f, 1.657f, -1.419f, 3.764f, -1.83f, 6.267f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -1.066f, 0.103f)
                lineToRelative(-0.008f, -0.047f)
                curveToRelative(-0.054f, -0.33f, -0.082f, -0.82f, -0.118f, -1.443f)
                curveToRelative(-0.106f, -1.87f, -0.266f, -4.977f, -1.41f, -7.45f)
                curveToRelative(-0.744f, 0.569f, -1.751f, 0.862f, -3.002f, 0.862f)
                curveToRelative(-2.913f, 0.0f, -4.518f, -1.59f, -4.518f, -4.479f)
                verticalLineTo(4.483f)
                curveToRelative(0.0f, -0.905f, 0.737f, -1.638f, 1.641f, -1.638f)
                close()
            }
        }
        .build()
        return _ecoFilled!!
    }

private var _ecoFilled: ImageVector? = null
