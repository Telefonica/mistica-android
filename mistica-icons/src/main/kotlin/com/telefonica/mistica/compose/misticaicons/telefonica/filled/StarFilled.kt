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

public val FilledGroup.StarFilled: ImageVector
    get() {
        if (_starFilled != null) {
            return _starFilled!!
        }
        _starFilled = Builder(name = "StarFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.613f, 21.664f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -1.005f, -0.26f)
                lineToRelative(-3.56f, -1.953f)
                curveToRelative(-0.138f, -0.064f, -0.252f, -0.081f, -0.39f, 0.008f)
                lineToRelative(-3.546f, 1.944f)
                arcToRelative(2.079f, 2.079f, 0.0f, false, true, -2.216f, -0.128f)
                arcToRelative(2.218f, 2.218f, 0.0f, false, true, -0.899f, -2.191f)
                lineToRelative(0.664f, -4.028f)
                curveToRelative(0.064f, -0.317f, 0.011f, -0.392f, -0.18f, -0.591f)
                lineTo(2.67f, 11.608f)
                arcToRelative(2.234f, 2.234f, 0.0f, false, true, -0.52f, -2.291f)
                arcToRelative(2.152f, 2.152f, 0.0f, false, true, 1.714f, -1.468f)
                lineToRelative(3.896f, -0.591f)
                curveToRelative(0.238f, -0.045f, 0.308f, -0.079f, 0.457f, -0.381f)
                lineTo(9.938f, 3.24f)
                arcToRelative(2.111f, 2.111f, 0.0f, false, true, 1.922f, -1.238f)
                curveToRelative(0.826f, 0.0f, 1.563f, 0.476f, 1.924f, 1.238f)
                lineToRelative(1.731f, 3.655f)
                curveToRelative(0.14f, 0.264f, 0.185f, 0.322f, 0.49f, 0.367f)
                lineToRelative(3.858f, 0.586f)
                curveToRelative(0.795f, 0.12f, 1.45f, 0.683f, 1.714f, 1.468f)
                curveToRelative(0.272f, 0.8f, 0.07f, 1.689f, -0.521f, 2.29f)
                lineToRelative(-2.711f, 2.732f)
                curveToRelative(-0.311f, 0.31f, -0.323f, 0.339f, -0.272f, 0.714f)
                lineToRelative(0.65f, 4.031f)
                arcToRelative(2.223f, 2.223f, 0.0f, false, true, -0.9f, 2.19f)
                curveToRelative(-0.352f, 0.253f, -0.775f, 0.39f, -1.21f, 0.39f)
                close()
            }
        }
        .build()
        return _starFilled!!
    }

private var _starFilled: ImageVector? = null
