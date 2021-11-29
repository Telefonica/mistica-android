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

public val FilledGroup.TechServiceFilled: ImageVector
    get() {
        if (_techServiceFilled != null) {
            return _techServiceFilled!!
        }
        _techServiceFilled = Builder(name = "TechServiceFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.139f, 2.15f)
                arcToRelative(6.313f, 6.313f, 0.0f, false, false, -1.079f, 0.11f)
                curveToRelative(-0.812f, 0.15f, -1.44f, 0.442f, -1.862f, 0.865f)
                curveToRelative(-0.426f, 0.426f, -0.72f, 1.064f, -0.871f, 1.89f)
                arcToRelative(6.328f, 6.328f, 0.0f, false, false, -0.101f, 1.029f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, -0.023f, 0.056f)
                lineToRelative(-8.106f, 8.106f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, -0.056f, 0.022f)
                arcToRelative(6.336f, 6.336f, 0.0f, false, false, -1.056f, 0.107f)
                curveToRelative(-0.815f, 0.151f, -1.44f, 0.442f, -1.863f, 0.865f)
                curveToRelative(-0.426f, 0.426f, -0.72f, 1.065f, -0.871f, 1.891f)
                curveToRelative(-0.064f, 0.347f, -0.098f, 0.7f, -0.101f, 1.053f)
                curveToRelative(-0.003f, 0.202f, 0.05f, 0.398f, 0.151f, 0.572f)
                curveToRelative(0.168f, 0.28f, 0.471f, 0.45f, 0.796f, 0.45f)
                curveToRelative(0.188f, 0.0f, 0.47f, -0.055f, 0.74f, -0.327f)
                lineToRelative(0.669f, -0.67f)
                lineToRelative(0.692f, 0.099f)
                lineToRelative(0.098f, 0.691f)
                lineToRelative(-0.667f, 0.67f)
                curveToRelative(-0.112f, 0.11f, -0.199f, 0.238f, -0.258f, 0.38f)
                arcToRelative(0.936f, 0.936f, 0.0f, false, false, 0.502f, 1.22f)
                curveToRelative(0.143f, 0.061f, 0.297f, 0.092f, 0.45f, 0.09f)
                horizontalLineToRelative(0.006f)
                arcToRelative(6.59f, 6.59f, 0.0f, false, false, 1.076f, -0.107f)
                curveToRelative(0.815f, -0.152f, 1.44f, -0.443f, 1.863f, -0.866f)
                curveToRelative(0.426f, -0.426f, 0.72f, -1.064f, 0.87f, -1.89f)
                curveToRelative(0.063f, -0.34f, 0.096f, -0.684f, 0.102f, -1.029f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, 0.022f, -0.056f)
                lineToRelative(8.107f, -8.106f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, 0.056f, -0.023f)
                arcToRelative(6.336f, 6.336f, 0.0f, false, false, 1.056f, -0.106f)
                curveToRelative(0.812f, -0.151f, 1.44f, -0.443f, 1.862f, -0.866f)
                curveToRelative(0.426f, -0.425f, 0.72f, -1.064f, 0.872f, -1.89f)
                curveToRelative(0.064f, -0.348f, 0.098f, -0.7f, 0.1f, -1.054f)
                arcToRelative(1.082f, 1.082f, 0.0f, false, false, -0.154f, -0.571f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, -0.795f, -0.45f)
                curveToRelative(-0.188f, 0.0f, -0.47f, 0.055f, -0.74f, 0.327f)
                lineToRelative(-0.67f, 0.67f)
                lineToRelative(-0.691f, -0.099f)
                lineToRelative(-0.098f, -0.692f)
                lineToRelative(0.672f, -0.67f)
                curveToRelative(0.112f, -0.108f, 0.199f, -0.237f, 0.258f, -0.38f)
                arcToRelative(0.936f, 0.936f, 0.0f, false, false, -0.502f, -1.219f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.45f, -0.09f)
                lineToRelative(-0.006f, -0.002f)
                close()
            }
        }
        .build()
        return _techServiceFilled!!
    }

private var _techServiceFilled: ImageVector? = null
