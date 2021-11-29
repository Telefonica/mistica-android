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

public val FilledGroup.AudioFilled: ImageVector
    get() {
        if (_audioFilled != null) {
            return _audioFilled!!
        }
        _audioFilled = Builder(name = "AudioFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.938f, 5.441f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, false, -1.481f, 0.079f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, false, 0.067f, 1.512f)
                curveToRelative(0.084f, 0.079f, 2.017f, 1.922f, 2.053f, 5.112f)
                curveToRelative(0.003f, 0.031f, 0.11f, 3.21f, -2.008f, 5.138f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -0.084f, 1.515f)
                curveToRelative(0.207f, 0.235f, 0.495f, 0.358f, 0.787f, 0.358f)
                curveToRelative(0.249f, 0.0f, 0.501f, -0.09f, 0.703f, -0.274f)
                curveToRelative(2.854f, -2.597f, 2.717f, -6.658f, 2.708f, -6.796f)
                curveToRelative(-0.044f, -4.126f, -2.635f, -6.543f, -2.745f, -6.644f)
                close()
                moveTo(18.109f, 12.119f)
                curveToRelative(-0.028f, -2.781f, -1.79f, -4.423f, -1.865f, -4.49f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, false, -1.488f, 0.081f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, false, 0.079f, 1.515f)
                curveToRelative(0.014f, 0.012f, 1.148f, 1.099f, 1.168f, 2.953f)
                curveToRelative(0.003f, 0.017f, 0.045f, 1.86f, -1.14f, 2.938f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -0.084f, 1.516f)
                arcToRelative(1.038f, 1.038f, 0.0f, false, false, 1.49f, 0.084f)
                curveToRelative(1.938f, -1.765f, 1.843f, -4.516f, 1.84f, -4.597f)
                close()
                moveTo(12.064f, 4.514f)
                curveToRelative(-3.117f, 0.0f, -4.862f, 1.314f, -5.826f, 2.591f)
                lineToRelative(-3.182f, 0.003f)
                curveToRelative(-0.28f, 0.0f, -0.549f, 0.115f, -0.745f, 0.316f)
                arcToRelative(1.075f, 1.075f, 0.0f, false, false, -0.308f, 0.757f)
                lineToRelative(0.008f, 7.54f)
                curveToRelative(0.0f, 0.591f, 0.474f, 1.07f, 1.053f, 1.07f)
                lineToRelative(3.16f, -0.002f)
                curveToRelative(0.958f, 1.277f, 2.714f, 2.582f, 5.922f, 2.582f)
                curveToRelative(0.921f, 0.0f, 1.67f, -0.762f, 1.67f, -1.7f)
                lineTo(13.816f, 6.223f)
                curveToRelative(0.0f, -0.941f, -0.754f, -1.709f, -1.752f, -1.709f)
                close()
            }
        }
        .build()
        return _audioFilled!!
    }

private var _audioFilled: ImageVector? = null
