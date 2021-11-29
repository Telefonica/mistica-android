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

public val RegularGroup.MoonRegular: ImageVector
    get() {
        if (_moonRegular != null) {
            return _moonRegular!!
        }
        _moonRegular = Builder(name = "MoonRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.771f, 3.235f)
                curveToRelative(-2.087f, 0.065f, -7.983f, 0.936f, -7.983f, 8.583f)
                curveToRelative(0.0f, 7.888f, 6.3f, 8.608f, 8.233f, 8.639f)
                curveToRelative(0.268f, 0.0f, 0.568f, 0.0f, 0.82f, -0.009f)
                curveToRelative(1.09f, -0.02f, 4.353f, -0.288f, 6.42f, -2.745f)
                arcToRelative(9.609f, 9.609f, 0.0f, false, true, -2.322f, 0.339f)
                curveToRelative(-0.196f, 0.008f, -0.453f, 0.008f, -0.692f, 0.008f)
                curveToRelative(-3.733f, -0.058f, -7.711f, -2.201f, -7.711f, -8.047f)
                curveToRelative(-0.003f, -3.717f, 1.549f, -5.706f, 3.235f, -6.768f)
                moveToRelative(0.236f, 18.451f)
                curveToRelative(-4.577f, -0.078f, -9.457f, -2.708f, -9.457f, -9.868f)
                curveToRelative(0.0f, -7.151f, 4.849f, -9.76f, 9.387f, -9.818f)
                lineToRelative(0.88f, 0.008f)
                curveToRelative(0.332f, 0.006f, 0.988f, 0.04f, 1.795f, 0.188f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.02f, 1.207f)
                curveToRelative(-2.22f, 0.474f, -4.864f, 2.003f, -4.864f, 6.603f)
                curveToRelative(0.0f, 6.232f, 4.967f, 6.792f, 6.485f, 6.818f)
                curveToRelative(0.213f, 0.0f, 0.451f, 0.0f, 0.647f, -0.006f)
                curveToRelative(0.765f, -0.017f, 2.233f, -0.163f, 3.594f, -0.936f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, true, 0.866f, 0.793f)
                curveToRelative(-2.107f, 4.552f, -7.034f, 4.983f, -8.493f, 5.008f)
                curveToRelative(-0.253f, 0.003f, -0.566f, 0.003f, -0.86f, 0.003f)
            }
        }
        .build()
        return _moonRegular!!
    }

private var _moonRegular: ImageVector? = null
