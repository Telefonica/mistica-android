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

public val FilledGroup.WomanFilled: ImageVector
    get() {
        if (_womanFilled != null) {
            return _womanFilled!!
        }
        _womanFilled = Builder(name = "WomanFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.982f, 16.922f)
                arcToRelative(0.203f, 0.203f, 0.0f, false, false, 0.013f, -0.076f)
                curveToRelative(0.0f, -0.01f, 0.005f, -0.024f, 0.005f, -0.033f)
                curveToRelative(0.0f, -0.015f, -0.005f, -0.024f, -0.01f, -0.038f)
                curveToRelative(0.0f, -0.014f, 0.005f, -0.029f, 0.0f, -0.038f)
                lineTo(15.388f, 8.96f)
                curveToRelative(-0.247f, -1.186f, -1.029f, -2.134f, -2.043f, -2.59f)
                curveToRelative(0.59f, -0.435f, 0.978f, -1.151f, 0.978f, -1.962f)
                curveTo(14.322f, 3.08f, 13.284f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.28f, 0.0f, -2.322f, 1.081f, -2.322f, 2.409f)
                curveToRelative(0.0f, 0.81f, 0.389f, 1.527f, 0.983f, 1.963f)
                arcTo(3.642f, 3.642f, 0.0f, false, false, 8.618f, 8.96f)
                lineToRelative(-1.609f, 7.78f)
                curveToRelative(-0.004f, 0.015f, 0.0f, 0.024f, 0.0f, 0.039f)
                curveToRelative(0.0f, 0.014f, -0.009f, 0.023f, -0.009f, 0.037f)
                curveToRelative(0.0f, 0.015f, 0.005f, 0.024f, 0.005f, 0.034f)
                lineToRelative(0.013f, 0.07f)
                curveToRelative(0.005f, 0.024f, 0.014f, 0.043f, 0.023f, 0.062f)
                curveToRelative(0.01f, 0.02f, 0.023f, 0.038f, 0.037f, 0.057f)
                curveToRelative(0.013f, 0.02f, 0.027f, 0.033f, 0.045f, 0.052f)
                curveToRelative(0.019f, 0.015f, 0.037f, 0.029f, 0.055f, 0.038f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, false, 0.064f, 0.029f)
                curveToRelative(0.01f, 0.005f, 0.019f, 0.01f, 0.032f, 0.014f)
                curveToRelative(0.014f, 0.005f, 0.028f, 0.0f, 0.037f, 0.0f)
                curveToRelative(0.013f, 0.0f, 0.023f, 0.01f, 0.036f, 0.01f)
                horizontalLineToRelative(2.144f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.995f)
                verticalLineToRelative(-4.813f)
                horizontalLineToRelative(2.14f)
                curveToRelative(0.022f, 0.0f, 0.05f, -0.004f, 0.072f, -0.01f)
                curveToRelative(0.014f, -0.004f, 0.019f, -0.009f, 0.032f, -0.013f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, false, 0.064f, -0.029f)
                curveToRelative(0.019f, -0.01f, 0.037f, -0.024f, 0.055f, -0.038f)
                curveToRelative(0.018f, -0.014f, 0.032f, -0.033f, 0.046f, -0.052f)
                curveToRelative(0.014f, -0.019f, 0.027f, -0.038f, 0.036f, -0.057f)
                arcToRelative(0.085f, 0.085f, 0.0f, false, false, 0.05f, -0.066f)
                close()
            }
        }
        .build()
        return _womanFilled!!
    }

private var _womanFilled: ImageVector? = null
