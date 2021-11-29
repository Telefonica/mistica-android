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

public val LightGroup.MapLight: ImageVector
    get() {
        if (_mapLight != null) {
            return _mapLight!!
        }
        _mapLight = Builder(name = "MapLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.026f, 20.2f)
                lineToRelative(-3.762f, -0.62f)
                lineTo(17.264f, 3.054f)
                lineToRelative(3.762f, 0.619f)
                verticalLineToRelative(16.526f)
                close()
                moveTo(2.98f, 3.674f)
                lineToRelative(3.958f, -0.624f)
                verticalLineToRelative(16.526f)
                lineToRelative(-3.958f, 0.625f)
                lineTo(2.98f, 3.675f)
                close()
                moveTo(12.411f, 4.38f)
                lineTo(16.441f, 3.125f)
                verticalLineToRelative(16.499f)
                lineToRelative(-4.03f, 1.252f)
                lineTo(12.411f, 4.381f)
                close()
                moveTo(7.76f, 3.135f)
                lineToRelative(3.835f, 1.243f)
                verticalLineToRelative(16.493f)
                lineTo(7.76f, 19.628f)
                lineTo(7.76f, 3.135f)
                close()
                moveTo(21.503f, 2.919f)
                lineTo(16.92f, 2.166f)
                curveToRelative(-0.011f, -0.003f, -0.02f, 0.002f, -0.028f, 0.002f)
                curveToRelative(-0.014f, 0.0f, -0.022f, -0.008f, -0.036f, -0.008f)
                curveToRelative(-0.028f, 0.0f, -0.05f, 0.011f, -0.076f, 0.014f)
                curveToRelative(-0.014f, 0.003f, -0.03f, -0.003f, -0.045f, 0.003f)
                lineToRelative(-4.728f, 1.47f)
                lineTo(7.474f, 2.18f)
                curveToRelative(-0.014f, -0.006f, -0.031f, 0.0f, -0.045f, -0.003f)
                curveToRelative(-0.028f, -0.006f, -0.053f, -0.017f, -0.081f, -0.017f)
                curveToRelative(-0.012f, 0.0f, -0.023f, 0.006f, -0.037f, 0.008f)
                lineToRelative(-0.028f, -0.002f)
                lineToRelative(-4.776f, 0.753f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.347f, 0.406f)
                verticalLineToRelative(17.356f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.409f)
                curveToRelative(0.022f, 0.0f, 0.042f, -0.003f, 0.064f, -0.006f)
                lineToRelative(4.681f, -0.736f)
                lineToRelative(4.56f, 1.476f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.247f, 0.003f)
                lineToRelative(4.759f, -1.48f)
                lineToRelative(4.487f, 0.74f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, false, 0.477f, -0.403f)
                lineTo(21.844f, 3.325f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.342f, -0.406f)
                close()
            }
        }
        .build()
        return _mapLight!!
    }

private var _mapLight: ImageVector? = null
