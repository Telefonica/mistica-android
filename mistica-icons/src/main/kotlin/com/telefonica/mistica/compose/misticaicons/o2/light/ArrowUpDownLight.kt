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

public val LightGroup.ArrowUpDownLight: ImageVector
    get() {
        if (_arrowUpDownLight != null) {
            return _arrowUpDownLight!!
        }
        _arrowUpDownLight = Builder(name = "ArrowUpDownLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.227f, 2.0f)
                curveToRelative(0.407f, 0.0f, 0.78f, 0.27f, 0.952f, 0.684f)
                curveToRelative(0.168f, 0.414f, 0.09f, 0.878f, -0.19f, 1.17f)
                lineToRelative(-1.18f, 1.201f)
                lineToRelative(6.1f, 6.21f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, 0.0f, 0.478f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, -0.47f, 0.0f)
                lineTo(9.86f, 5.055f)
                lineToRelative(1.646f, -1.676f)
                curveToRelative(0.112f, -0.114f, 0.097f, -0.3f, 0.045f, -0.421f)
                curveToRelative(-0.052f, -0.122f, -0.168f, -0.27f, -0.332f, -0.27f)
                lineTo(5.668f, 2.688f)
                lineTo(5.668f, 8.35f)
                curveToRelative(0.0f, 0.17f, 0.142f, 0.285f, 0.265f, 0.338f)
                curveToRelative(0.127f, 0.053f, 0.303f, 0.068f, 0.415f, -0.046f)
                lineToRelative(1.646f, -1.675f)
                lineToRelative(8.004f, 8.147f)
                lineToRelative(1.18f, -1.201f)
                curveToRelative(0.288f, -0.293f, 0.732f, -0.369f, 1.15f, -0.194f)
                curveToRelative(0.407f, 0.179f, 0.672f, 0.555f, 0.672f, 0.97f)
                lineTo(18.996f, 21.0f)
                lineTo(12.77f, 21.0f)
                curveToRelative(-0.407f, 0.0f, -0.78f, -0.27f, -0.952f, -0.684f)
                curveToRelative(-0.168f, -0.414f, -0.09f, -0.878f, 0.19f, -1.17f)
                lineToRelative(1.18f, -1.201f)
                lineToRelative(-3.763f, -3.83f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, 0.0f, -0.48f)
                curveToRelative(0.127f, -0.129f, 0.34f, -0.129f, 0.47f, 0.0f)
                lineToRelative(4.234f, 4.31f)
                lineToRelative(-1.631f, 1.676f)
                curveToRelative(-0.112f, 0.114f, -0.098f, 0.3f, -0.045f, 0.421f)
                curveToRelative(0.052f, 0.122f, 0.168f, 0.27f, 0.332f, 0.27f)
                horizontalLineToRelative(5.563f)
                verticalLineToRelative(-5.658f)
                curveToRelative(0.0f, -0.171f, -0.142f, -0.285f, -0.265f, -0.338f)
                curveToRelative(-0.127f, -0.053f, -0.303f, -0.069f, -0.415f, 0.045f)
                lineToRelative(-1.646f, 1.676f)
                lineToRelative(-8.012f, -8.132f)
                lineToRelative(-1.187f, 1.201f)
                curveToRelative(-0.288f, 0.293f, -0.732f, 0.369f, -1.15f, 0.194f)
                curveTo(5.265f, 9.12f, 5.0f, 8.745f, 5.0f, 8.33f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(6.227f)
                close()
                moveTo(8.334f, 11.838f)
                curveToRelative(0.37f, 0.0f, 0.664f, 0.308f, 0.664f, 0.677f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, true, -0.664f, 0.676f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, true, -0.665f, -0.676f)
                curveToRelative(0.0f, -0.377f, 0.303f, -0.677f, 0.665f, -0.677f)
                close()
            }
        }
        .build()
        return _arrowUpDownLight!!
    }

private var _arrowUpDownLight: ImageVector? = null
