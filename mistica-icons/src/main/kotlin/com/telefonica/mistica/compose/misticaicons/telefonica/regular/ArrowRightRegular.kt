package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ArrowRightRegular: ImageVector
    get() {
        if (_arrowRightRegular != null) {
            return _arrowRightRegular!!
        }
        _arrowRightRegular = Builder(name = "ArrowRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.894f, 21.689f)
                curveToRelative(-0.152f, 0.0f, -0.3f, -0.028f, -0.44f, -0.084f)
                curveToRelative(-0.434f, -0.176f, -0.7f, -0.6f, -0.695f, -1.106f)
                lineToRelative(-0.006f, -3.65f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, -0.039f, -0.056f)
                lineToRelative(-6.882f, -0.02f)
                curveToRelative(-0.616f, 0.008f, -1.067f, -0.146f, -1.384f, -0.468f)
                curveToRelative(-0.316f, -0.322f, -0.46f, -0.776f, -0.442f, -1.392f)
                verticalLineToRelative(-6.04f)
                curveToRelative(-0.009f, -0.42f, 0.028f, -1.021f, 0.434f, -1.444f)
                curveToRelative(0.409f, -0.423f, 1.008f, -0.482f, 1.426f, -0.488f)
                horizontalLineToRelative(0.008f)
                lineToRelative(6.711f, 0.003f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, false, 0.157f, -0.053f)
                lineToRelative(-0.003f, -3.56f)
                verticalLineToRelative(-0.006f)
                curveToRelative(0.006f, -0.857f, 0.415f, -1.149f, 0.659f, -1.247f)
                curveToRelative(0.417f, -0.168f, 0.899f, -0.014f, 1.322f, 0.42f)
                lineToRelative(8.658f, 8.712f)
                curveToRelative(0.087f, 0.084f, 0.336f, 0.33f, 0.333f, 0.692f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.274f, 0.594f)
                lineToRelative(-8.476f, 8.703f)
                curveToRelative(-0.306f, 0.32f, -0.692f, 0.49f, -1.067f, 0.49f)
                close()
                moveTo(3.832f, 15.683f)
                lineTo(10.79f, 15.703f)
                curveToRelative(0.585f, 0.0f, 1.056f, 0.614f, 1.056f, 1.12f)
                lineToRelative(0.006f, 3.678f)
                verticalLineToRelative(0.009f)
                curveToRelative(0.0f, 0.053f, 0.01f, 0.078f, 0.014f, 0.084f)
                curveToRelative(0.02f, 0.014f, 0.15f, 0.017f, 0.308f, -0.149f)
                lineToRelative(0.005f, -0.005f)
                lineToRelative(8.336f, -8.555f)
                lineToRelative(-8.568f, -8.619f)
                lineToRelative(-0.006f, -0.005f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, false, -0.098f, -0.09f)
                arcToRelative(1.193f, 1.193f, 0.0f, false, false, -0.011f, 0.162f)
                lineToRelative(0.006f, 3.712f)
                curveToRelative(0.0f, 0.652f, -0.81f, 0.994f, -1.247f, 0.994f)
                lineToRelative(-6.709f, -0.003f)
                curveToRelative(-0.336f, 0.006f, -0.563f, 0.06f, -0.655f, 0.154f)
                curveToRelative(-0.093f, 0.096f, -0.137f, 0.328f, -0.129f, 0.67f)
                verticalLineToRelative(6.084f)
                curveToRelative(-0.006f, 0.207f, 0.011f, 0.479f, 0.129f, 0.602f)
                curveToRelative(0.12f, 0.12f, 0.39f, 0.143f, 0.597f, 0.14f)
                curveToRelative(0.002f, -0.003f, 0.005f, -0.003f, 0.008f, -0.003f)
                close()
            }
        }
        .build()
        return _arrowRightRegular!!
    }

private var _arrowRightRegular: ImageVector? = null
