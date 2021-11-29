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

public val FilledGroup.TshirtFilled: ImageVector
    get() {
        if (_tshirtFilled != null) {
            return _tshirtFilled!!
        }
        _tshirtFilled = Builder(name = "TshirtFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.487f, 5.756f)
                lineTo(15.384f, 2.06f)
                curveToRelative(-0.003f, -0.003f, -0.009f, -0.003f, -0.011f, -0.003f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, false, -0.098f, -0.036f)
                curveToRelative(-0.023f, -0.006f, -0.045f, -0.014f, -0.07f, -0.014f)
                curveToRelative(-0.009f, 0.0f, -0.017f, -0.006f, -0.023f, -0.006f)
                curveToRelative(-0.014f, 0.0f, -0.028f, 0.006f, -0.04f, 0.008f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.1f, 0.023f)
                curveToRelative(-0.014f, 0.005f, -0.022f, 0.011f, -0.036f, 0.017f)
                arcToRelative(0.344f, 0.344f, 0.0f, false, false, -0.101f, 0.07f)
                lineToRelative(-0.017f, 0.016f)
                curveToRelative(-0.02f, 0.023f, -0.045f, 0.04f, -0.059f, 0.068f)
                curveToRelative(-0.008f, 0.016f, -0.008f, 0.033f, -0.017f, 0.047f)
                curveToRelative(0.0f, 0.003f, 0.0f, 0.006f, -0.002f, 0.006f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, -0.031f, 0.16f)
                curveToRelative(0.0f, 1.907f, -0.919f, 2.837f, -2.801f, 2.837f)
                curveToRelative(-1.886f, 0.0f, -2.801f, -0.927f, -2.801f, -2.84f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.202f, -0.356f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.406f, -0.003f)
                lineTo(2.205f, 5.751f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.168f, 0.526f)
                lineToRelative(1.974f, 4.398f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, 0.54f, 0.202f)
                lineToRelative(1.614f, -0.773f)
                lineToRelative(-0.033f, 11.168f)
                curveToRelative(0.0f, 0.109f, 0.042f, 0.215f, 0.117f, 0.294f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.289f, 0.12f)
                horizontalLineToRelative(10.868f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, 0.286f, -0.12f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.118f, -0.294f)
                lineToRelative(-0.034f, -11.163f)
                lineToRelative(1.583f, 0.768f)
                curveToRelative(0.1f, 0.047f, 0.218f, 0.053f, 0.322f, 0.014f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.23f, -0.23f)
                lineToRelative(1.744f, -4.4f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.168f, -0.505f)
            }
        }
        .build()
        return _tshirtFilled!!
    }

private var _tshirtFilled: ImageVector? = null
