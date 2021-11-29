package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ShareFilled: ImageVector
    get() {
        if (_shareFilled != null) {
            return _shareFilled!!
        }
        _shareFilled = Builder(name = "ShareFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.296f, 15.499f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, -2.878f, 1.394f)
                lineToRelative(-6.172f, -3.31f)
                arcToRelative(3.788f, 3.788f, 0.0f, false, false, -0.037f, -2.285f)
                lineToRelative(6.196f, -3.208f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, 2.887f, 1.411f)
                curveToRelative(2.04f, 0.0f, 3.704f, -1.684f, 3.704f, -3.75f)
                curveToRelative(0.0f, -2.067f, -1.66f, -3.751f, -3.7f, -3.751f)
                reflectiveCurveToRelative(-3.704f, 1.684f, -3.704f, 3.75f)
                curveToRelative(0.0f, 0.35f, 0.054f, 0.685f, 0.137f, 1.004f)
                lineTo(8.458f, 10.01f)
                arcToRelative(3.643f, 3.643f, 0.0f, false, false, -2.754f, -1.26f)
                curveTo(3.664f, 8.75f, 2.0f, 10.434f, 2.0f, 12.5f)
                reflectiveCurveToRelative(1.663f, 3.75f, 3.704f, 3.75f)
                arcToRelative(3.686f, 3.686f, 0.0f, false, false, 2.837f, -1.343f)
                lineToRelative(6.196f, 3.322f)
                arcToRelative(3.767f, 3.767f, 0.0f, false, false, -0.145f, 1.02f)
                curveToRelative(0.0f, 2.067f, 1.663f, 3.751f, 3.704f, 3.751f)
                curveTo(20.336f, 23.0f, 22.0f, 21.316f, 22.0f, 19.25f)
                curveToRelative(0.0f, -2.067f, -1.663f, -3.751f, -3.704f, -3.751f)
            }
        }
        .build()
        return _shareFilled!!
    }

private var _shareFilled: ImageVector? = null
