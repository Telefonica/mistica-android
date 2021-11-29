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

public val FilledGroup.PenFilled: ImageVector
    get() {
        if (_penFilled != null) {
            return _penFilled!!
        }
        _penFilled = Builder(name = "PenFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.78f, 19.151f)
                lineToRelative(-1.663f, -1.644f)
                lineToRelative(9.339f, -9.238f)
                lineToRelative(1.639f, 1.622f)
                lineToRelative(-9.314f, 9.26f)
                close()
                moveTo(5.12f, 20.07f)
                lineTo(3.747f, 18.728f)
                lineTo(4.134f, 16.255f)
                lineTo(7.517f, 19.602f)
                lineTo(5.12f, 20.07f)
                close()
                moveTo(13.91f, 5.75f)
                lineTo(15.596f, 7.42f)
                lineTo(6.26f, 16.658f)
                lineTo(4.574f, 14.992f)
                lineTo(13.91f, 5.75f)
                close()
                moveTo(20.6f, 3.494f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, false, -0.249f, -0.25f)
                curveToRelative(-1.37f, -1.335f, -3.605f, -2.002f, -5.759f, 0.13f)
                lineToRelative(-11.31f, 11.19f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.124f, 0.182f)
                lineToRelative(-0.022f, 0.067f)
                curveToRelative(-0.009f, 0.028f, -0.023f, 0.054f, -0.028f, 0.084f)
                lineToRelative(-0.942f, 6.096f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.712f, 0.68f)
                lineToRelative(5.865f, -1.075f)
                curveToRelative(0.012f, 0.0f, 0.023f, 0.005f, 0.034f, 0.005f)
                curveToRelative(0.11f, 0.0f, 0.213f, -0.039f, 0.308f, -0.095f)
                curveToRelative(0.009f, -0.003f, 0.014f, -0.008f, 0.023f, -0.014f)
                curveToRelative(0.033f, -0.022f, 0.07f, -0.036f, 0.1f, -0.067f)
                curveToRelative(0.006f, -0.006f, 0.006f, -0.011f, 0.012f, -0.014f)
                curveToRelative(0.005f, -0.006f, 0.014f, -0.009f, 0.02f, -0.014f)
                lineTo(20.48f, 9.22f)
                curveToRelative(2.132f, -2.103f, 1.46f, -4.336f, 0.12f, -5.728f)
                close()
            }
        }
        .build()
        return _penFilled!!
    }

private var _penFilled: ImageVector? = null
