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

public val FilledGroup.MapFilled: ImageVector
    get() {
        if (_mapFilled != null) {
            return _mapFilled!!
        }
        _mapFilled = Builder(name = "MapFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.589f, 19.743f)
                lineToRelative(-3.222f, -0.53f)
                lineTo(17.367f, 3.53f)
                lineToRelative(3.222f, 0.53f)
                verticalLineToRelative(15.683f)
                close()
                moveTo(11.373f, 20.356f)
                lineTo(8.084f, 19.289f)
                lineTo(8.084f, 3.653f)
                lineToRelative(3.289f, 1.067f)
                verticalLineToRelative(15.636f)
                close()
                moveTo(21.32f, 2.908f)
                lineToRelative(-4.477f, -0.737f)
                curveToRelative(-0.014f, -0.003f, -0.03f, 0.003f, -0.044f, 0.003f)
                curveToRelative(-0.02f, -0.003f, -0.037f, -0.011f, -0.06f, -0.011f)
                curveToRelative(-0.041f, 0.0f, -0.078f, 0.014f, -0.117f, 0.022f)
                curveToRelative(-0.022f, 0.006f, -0.047f, -0.003f, -0.07f, 0.006f)
                lineToRelative(-4.546f, 1.414f)
                lineTo(7.65f, 2.191f)
                curveToRelative(-0.022f, -0.006f, -0.047f, 0.0f, -0.073f, -0.006f)
                curveToRelative(-0.039f, -0.008f, -0.078f, -0.025f, -0.12f, -0.025f)
                curveToRelative(-0.02f, 0.0f, -0.037f, 0.008f, -0.053f, 0.008f)
                curveToRelative(-0.014f, 0.003f, -0.028f, -0.005f, -0.045f, -0.002f)
                lineToRelative(-4.67f, 0.736f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, -0.529f, 0.622f)
                verticalLineToRelative(16.958f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, 0.725f, 0.62f)
                lineToRelative(4.521f, -0.715f)
                lineToRelative(4.404f, 1.431f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.38f, 0.0f)
                lineToRelative(4.597f, -1.431f)
                lineToRelative(4.328f, 0.714f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, 0.734f, -0.619f)
                lineTo(21.849f, 3.527f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.53f, -0.62f)
                close()
            }
        }
        .build()
        return _mapFilled!!
    }

private var _mapFilled: ImageVector? = null
