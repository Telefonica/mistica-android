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

public val RegularGroup.ArrowDownRegular: ImageVector
    get() {
        if (_arrowDownRegular != null) {
            return _arrowDownRegular!!
        }
        _arrowDownRegular = Builder(name = "ArrowDownRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.815f, 21.734f)
                horizontalLineToRelative(-0.005f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.594f, -0.275f)
                lineTo(2.513f, 12.98f)
                curveToRelative(-0.449f, -0.425f, -0.608f, -1.016f, -0.407f, -1.507f)
                curveToRelative(0.177f, -0.431f, 0.591f, -0.694f, 1.09f, -0.694f)
                horizontalLineToRelative(0.017f)
                lineToRelative(3.65f, -0.003f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, 0.056f, -0.04f)
                lineToRelative(0.02f, -6.882f)
                curveToRelative(-0.009f, -0.616f, 0.145f, -1.07f, 0.467f, -1.386f)
                curveToRelative(0.322f, -0.317f, 0.776f, -0.46f, 1.392f, -0.443f)
                horizontalLineToRelative(6.042f)
                curveToRelative(0.42f, -0.008f, 1.026f, 0.031f, 1.446f, 0.437f)
                curveToRelative(0.423f, 0.41f, 0.479f, 1.009f, 0.487f, 1.426f)
                verticalLineToRelative(0.008f)
                lineToRelative(-0.003f, 6.712f)
                curveToRelative(0.003f, 0.039f, 0.025f, 0.103f, 0.053f, 0.157f)
                lineToRelative(3.564f, -0.006f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.857f, 0.006f, 1.149f, 0.415f, 1.247f, 0.658f)
                curveToRelative(0.168f, 0.418f, 0.014f, 0.9f, -0.42f, 1.322f)
                lineToRelative(-8.712f, 8.659f)
                curveToRelative(-0.09f, 0.09f, -0.333f, 0.336f, -0.692f, 0.336f)
                close()
                moveTo(3.193f, 11.87f)
                curveToRelative(-0.05f, 0.0f, -0.073f, 0.011f, -0.078f, 0.014f)
                curveToRelative(-0.014f, 0.02f, -0.017f, 0.151f, 0.148f, 0.308f)
                lineToRelative(0.006f, 0.006f)
                lineToRelative(8.557f, 8.336f)
                lineToRelative(8.62f, -8.566f)
                lineToRelative(0.005f, -0.005f)
                arcToRelative(0.866f, 0.866f, 0.0f, false, false, 0.09f, -0.098f)
                arcToRelative(1.182f, 1.182f, 0.0f, false, false, -0.16f, -0.012f)
                lineToRelative(-3.712f, 0.006f)
                curveToRelative(-0.652f, 0.0f, -0.994f, -0.81f, -0.994f, -1.247f)
                lineToRelative(0.003f, -6.708f)
                curveToRelative(-0.006f, -0.336f, -0.059f, -0.563f, -0.154f, -0.656f)
                curveToRelative(-0.095f, -0.092f, -0.328f, -0.137f, -0.672f, -0.129f)
                horizontalLineTo(8.767f)
                curveToRelative(-0.207f, -0.005f, -0.478f, 0.012f, -0.602f, 0.13f)
                curveToRelative(-0.12f, 0.12f, -0.143f, 0.389f, -0.14f, 0.596f)
                verticalLineToRelative(0.008f)
                lineToRelative(-0.02f, 6.956f)
                curveToRelative(0.0f, 0.585f, -0.613f, 1.056f, -1.12f, 1.056f)
                lineToRelative(-3.678f, 0.002f)
                horizontalLineTo(3.2f)
                curveToRelative(0.0f, 0.003f, -0.003f, 0.003f, -0.006f, 0.003f)
                close()
            }
        }
        .build()
        return _arrowDownRegular!!
    }

private var _arrowDownRegular: ImageVector? = null
