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

public val FilledGroup.HandDownFilled: ImageVector
    get() {
        if (_handDownFilled != null) {
            return _handDownFilled!!
        }
        _handDownFilled = Builder(name = "HandDownFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.758f, 2.16f)
                horizontalLineTo(6.974f)
                curveToRelative(-0.984f, 0.0f, -1.824f, 0.308f, -2.364f, 0.866f)
                curveToRelative(-0.538f, 0.554f, -0.81f, 1.33f, -0.81f, 2.3f)
                verticalLineToRelative(6.996f)
                curveToRelative(0.0f, 1.272f, 0.782f, 2.062f, 2.036f, 2.062f)
                curveToRelative(0.283f, 0.0f, 0.541f, -0.04f, 0.774f, -0.118f)
                curveToRelative(0.238f, 0.858f, 0.94f, 1.367f, 1.946f, 1.367f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.776f, -0.117f)
                curveToRelative(0.244f, 0.848f, 0.941f, 1.353f, 1.944f, 1.353f)
                curveToRelative(0.247f, 0.0f, 0.476f, -0.031f, 0.684f, -0.09f)
                verticalLineToRelative(2.902f)
                curveToRelative(0.0f, 1.333f, 0.818f, 2.162f, 2.134f, 2.162f)
                curveToRelative(1.266f, 0.0f, 2.042f, -0.773f, 2.129f, -2.117f)
                lineToRelative(0.003f, -0.045f)
                verticalLineToRelative(-7.384f)
                curveToRelative(0.339f, 0.577f, 0.641f, 0.98f, 1.008f, 1.272f)
                curveToRelative(0.359f, 0.286f, 0.787f, 0.431f, 1.207f, 0.431f)
                curveToRelative(0.404f, 0.0f, 0.802f, -0.131f, 1.132f, -0.397f)
                curveToRelative(0.65f, -0.521f, 0.81f, -1.41f, 0.409f, -2.26f)
                arcToRelative(430.285f, 430.285f, 0.0f, false, false, -2.745f, -5.648f)
                curveToRelative(-0.574f, -1.165f, -1.07f, -2.17f, -1.21f, -2.476f)
                curveToRelative(-0.143f, -0.317f, -0.488f, -1.059f, -1.269f, -1.059f)
            }
        }
        .build()
        return _handDownFilled!!
    }

private var _handDownFilled: ImageVector? = null
