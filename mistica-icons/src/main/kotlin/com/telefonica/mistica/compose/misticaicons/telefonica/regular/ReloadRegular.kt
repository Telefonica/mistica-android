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

public val RegularGroup.ReloadRegular: ImageVector
    get() {
        if (_reloadRegular != null) {
            return _reloadRegular!!
        }
        _reloadRegular = Builder(name = "ReloadRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.581f, 8.781f)
                curveToRelative(0.096f, 0.202f, 0.3f, 0.328f, 0.521f, 0.325f)
                horizontalLineToRelative(0.034f)
                lineToRelative(5.81f, -0.336f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.535f, -0.516f)
                lineToRelative(0.352f, -5.518f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.333f, -0.538f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.636f, 0.11f)
                lineToRelative(-2.571f, 2.448f)
                arcToRelative(10.112f, 10.112f, 0.0f, false, false, -6.21f, -2.12f)
                curveToRelative(-5.48f, 0.0f, -9.933f, 4.305f, -9.933f, 9.599f)
                curveToRelative(0.0f, 5.294f, 4.454f, 9.6f, 9.93f, 9.6f)
                curveToRelative(4.123f, 0.0f, 7.863f, -2.51f, 9.305f, -6.247f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -0.479f, -1.054f)
                lineToRelative(-0.025f, -0.008f)
                arcToRelative(0.865f, 0.865f, 0.0f, false, false, -1.1f, 0.485f)
                curveToRelative(-1.194f, 3.092f, -4.29f, 5.17f, -7.701f, 5.17f)
                curveToRelative(-4.532f, 0.003f, -8.219f, -3.562f, -8.219f, -7.946f)
                reflectiveCurveToRelative(3.687f, -7.95f, 8.219f, -7.95f)
                curveToRelative(1.818f, 0.0f, 3.56f, 0.574f, 4.989f, 1.63f)
                lineToRelative(-2.37f, 2.25f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, -0.118f, 0.616f)
            }
        }
        .build()
        return _reloadRegular!!
    }

private var _reloadRegular: ImageVector? = null
