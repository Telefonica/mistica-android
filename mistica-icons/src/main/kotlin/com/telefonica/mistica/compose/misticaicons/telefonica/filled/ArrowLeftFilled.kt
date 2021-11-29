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

public val FilledGroup.ArrowLeftFilled: ImageVector
    get() {
        if (_arrowLeftFilled != null) {
            return _arrowLeftFilled!!
        }
        _arrowLeftFilled = Builder(name = "ArrowLeftFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.826f, 2.011f)
                curveToRelative(0.152f, 0.0f, 0.3f, 0.028f, 0.44f, 0.084f)
                curveToRelative(0.434f, 0.177f, 0.7f, 0.602f, 0.695f, 1.107f)
                lineToRelative(0.003f, 3.65f)
                curveToRelative(0.01f, 0.02f, 0.022f, 0.039f, 0.039f, 0.056f)
                lineToRelative(6.882f, 0.02f)
                curveToRelative(0.616f, -0.01f, 1.07f, 0.145f, 1.384f, 0.467f)
                curveToRelative(0.314f, 0.322f, 0.46f, 0.776f, 0.442f, 1.392f)
                verticalLineToRelative(6.042f)
                curveToRelative(0.009f, 0.42f, -0.03f, 1.025f, -0.436f, 1.446f)
                curveToRelative(-0.407f, 0.42f, -1.009f, 0.481f, -1.426f, 0.487f)
                horizontalLineToRelative(-0.009f)
                lineToRelative(-6.711f, -0.003f)
                arcToRelative(0.453f, 0.453f, 0.0f, false, false, -0.157f, 0.053f)
                lineToRelative(0.006f, 3.563f)
                verticalLineToRelative(0.003f)
                curveToRelative(-0.006f, 0.857f, -0.415f, 1.149f, -0.659f, 1.247f)
                curveToRelative(-0.417f, 0.168f, -0.899f, 0.014f, -1.322f, -0.42f)
                lineTo(2.34f, 12.492f)
                curveToRelative(-0.087f, -0.084f, -0.336f, -0.33f, -0.333f, -0.69f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.274f, -0.593f)
                lineToRelative(8.48f, -8.706f)
                curveToRelative(0.302f, -0.32f, 0.691f, -0.493f, 1.066f, -0.493f)
                close()
            }
        }
        .build()
        return _arrowLeftFilled!!
    }

private var _arrowLeftFilled: ImageVector? = null
