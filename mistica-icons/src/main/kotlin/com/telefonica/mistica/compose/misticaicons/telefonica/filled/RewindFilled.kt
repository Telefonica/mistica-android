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

public val FilledGroup.RewindFilled: ImageVector
    get() {
        if (_rewindFilled != null) {
            return _rewindFilled!!
        }
        _rewindFilled = Builder(name = "RewindFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.237f, 4.579f)
                curveTo(17.565f, 2.968f, 15.13f, 2.15f, 11.999f, 2.15f)
                curveToRelative(-3.132f, 0.0f, -5.563f, 0.818f, -7.233f, 2.429f)
                curveTo(3.03f, 6.254f, 2.15f, 8.749f, 2.15f, 12.004f)
                reflectiveCurveToRelative(0.88f, 5.751f, 2.613f, 7.423f)
                curveToRelative(1.673f, 1.61f, 4.107f, 2.429f, 7.236f, 2.429f)
                curveToRelative(3.129f, 0.0f, 5.566f, -0.818f, 7.238f, -2.429f)
                curveToRelative(1.737f, -1.672f, 2.616f, -4.17f, 2.616f, -7.423f)
                curveToRelative(0.0f, -3.252f, -0.88f, -5.75f, -2.616f, -7.425f)
                close()
                moveTo(17.6f, 14.682f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.846f, 0.482f)
                lineToRelative(-4.989f, -2.97f)
                arcToRelative(0.564f, 0.564f, 0.0f, false, true, -0.215f, -0.234f)
                verticalLineToRelative(2.717f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.846f, 0.481f)
                lineToRelative(-4.99f, -2.969f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.002f, -0.96f)
                lineToRelative(4.989f, -2.998f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.849f, 0.48f)
                verticalLineToRelative(2.756f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.212f, -0.233f)
                lineToRelative(4.99f, -2.997f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.848f, 0.479f)
                verticalLineToRelative(5.966f)
                close()
            }
        }
        .build()
        return _rewindFilled!!
    }

private var _rewindFilled: ImageVector? = null
