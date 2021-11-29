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

public val RegularGroup.PenRegular: ImageVector
    get() {
        if (_penRegular != null) {
            return _penRegular!!
        }
        _penRegular = Builder(name = "PenRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.616f, 8.373f)
                lineToRelative(-0.667f, 0.663f)
                lineTo(14.767f, 4.9f)
                lineToRelative(0.683f, -0.678f)
                curveToRelative(1.863f, -1.846f, 3.448f, -0.7f, 4.048f, -0.12f)
                curveToRelative(0.073f, 0.073f, 0.154f, 0.154f, 0.221f, 0.224f)
                curveToRelative(0.583f, 0.608f, 1.745f, 2.218f, -0.103f, 4.048f)
                close()
                moveTo(3.677f, 19.17f)
                lineToRelative(0.967f, 0.958f)
                lineToRelative(-1.149f, 0.21f)
                lineToRelative(0.182f, -1.168f)
                close()
                moveTo(6.254f, 16.654f)
                lineTo(4.568f, 14.99f)
                lineToRelative(9.339f, -9.238f)
                lineToRelative(1.683f, 1.666f)
                lineToRelative(-9.336f, 9.238f)
                close()
                moveTo(6.094f, 19.862f)
                lineTo(3.904f, 17.694f)
                lineTo(4.125f, 16.254f)
                lineTo(7.509f, 19.601f)
                lineTo(6.095f, 19.861f)
                close()
                moveTo(8.775f, 19.15f)
                lineTo(7.111f, 17.506f)
                lineTo(16.447f, 8.268f)
                lineTo(18.087f, 9.89f)
                curveToRelative(0.002f, 0.0f, -9.312f, 9.26f, -9.312f, 9.26f)
                close()
                moveTo(20.595f, 3.492f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, false, -0.248f, -0.25f)
                curveToRelative(-1.373f, -1.333f, -3.605f, -2.002f, -5.76f, 0.13f)
                lineTo(3.28f, 14.563f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.123f, 0.18f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.02f, 0.067f)
                curveToRelative(-0.008f, 0.028f, -0.022f, 0.056f, -0.027f, 0.084f)
                lineToRelative(-0.942f, 6.1f)
                curveToRelative(-0.03f, 0.194f, 0.037f, 0.39f, 0.18f, 0.524f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, false, 0.532f, 0.16f)
                lineToRelative(5.868f, -1.079f)
                curveToRelative(0.011f, 0.0f, 0.02f, 0.006f, 0.031f, 0.006f)
                arcToRelative(0.594f, 0.594f, 0.0f, false, false, 0.305f, -0.095f)
                curveToRelative(0.012f, -0.006f, 0.023f, -0.017f, 0.037f, -0.023f)
                curveToRelative(0.03f, -0.02f, 0.064f, -0.033f, 0.09f, -0.058f)
                lineToRelative(0.008f, -0.012f)
                lineToRelative(0.02f, -0.016f)
                lineTo(20.48f, 9.224f)
                curveToRelative(2.126f, -2.11f, 1.454f, -4.342f, 0.115f, -5.731f)
                close()
            }
        }
        .build()
        return _penRegular!!
    }

private var _penRegular: ImageVector? = null
