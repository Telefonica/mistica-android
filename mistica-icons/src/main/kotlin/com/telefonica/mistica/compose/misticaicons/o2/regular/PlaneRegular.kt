package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.PlaneRegular: ImageVector
    get() {
        if (_planeRegular != null) {
            return _planeRegular!!
        }
        _planeRegular = Builder(name = "PlaneRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.352f, 21.0f)
                lineToRelative(-3.973f, -6.971f)
                lineToRelative(-3.691f, 3.878f)
                arcToRelative(2.114f, 2.114f, 0.0f, false, true, -2.59f, 0.354f)
                lineTo(2.0f, 15.255f)
                lineToRelative(1.346f, -1.375f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, true, 2.069f, -0.565f)
                lineToRelative(1.75f, 0.48f)
                lineToRelative(2.996f, -3.06f)
                lineTo(3.38f, 6.742f)
                lineTo(5.222f, 4.86f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, true, 2.069f, -0.565f)
                lineToRelative(7.242f, 1.982f)
                lineToRelative(3.513f, -3.586f)
                curveToRelative(0.9f, -0.919f, 2.373f, -0.924f, 3.274f, 0.0f)
                curveToRelative(0.436f, 0.446f, 0.68f, 1.04f, 0.68f, 1.671f)
                curveToRelative(0.0f, 0.632f, -0.24f, 1.226f, -0.68f, 1.671f)
                lineTo(17.807f, 9.62f)
                lineToRelative(1.942f, 7.393f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, true, -0.554f, 2.111f)
                lineTo(17.352f, 21.0f)
                close()
                moveTo(13.67f, 11.573f)
                lineTo(17.657f, 18.568f)
                lineTo(18.149f, 18.065f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, 0.174f, -0.665f)
                lineToRelative(-2.158f, -8.226f)
                lineToRelative(4.114f, -4.199f)
                arcToRelative(0.877f, 0.877f, 0.0f, false, false, 0.0f, -1.226f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, false, -1.201f, 0.0f)
                lineToRelative(-4.114f, 4.2f)
                lineToRelative(-8.058f, -2.203f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, false, -0.652f, 0.177f)
                lineToRelative(-0.492f, 0.503f)
                lineToRelative(6.782f, 3.998f)
                lineTo(7.6f, 15.465f)
                lineToRelative(-2.565f, -0.704f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, false, -0.648f, 0.173f)
                lineToRelative(3.443f, 2.03f)
                curveToRelative(0.263f, 0.158f, 0.6f, 0.11f, 0.816f, -0.11f)
                lineToRelative(5.024f, -5.281f)
                close()
            }
        }
        .build()
        return _planeRegular!!
    }

private var _planeRegular: ImageVector? = null
