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

public val FilledGroup.ClipFilled: ImageVector
    get() {
        if (_clipFilled != null) {
            return _clipFilled!!
        }
        _clipFilled = Builder(name = "ClipFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.762f, 23.0f)
                arcToRelative(3.602f, 3.602f, 0.0f, false, true, -2.58f, -1.095f)
                lineTo(3.49f, 10.93f)
                arcTo(5.254f, 5.254f, 0.0f, false, true, 2.0f, 7.23f)
                curveToRelative(0.0f, -1.397f, 0.53f, -2.709f, 1.49f, -3.7f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, true, 7.207f, 0.0f)
                lineTo(21.78f, 14.897f)
                arcToRelative(0.789f, 0.789f, 0.0f, false, true, 0.0f, 1.095f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.066f, 0.0f)
                lineTo(9.632f, 4.625f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, false, -2.538f, -1.08f)
                curveToRelative(-0.96f, 0.0f, -1.857f, 0.382f, -2.537f, 1.08f)
                arcTo(3.693f, 3.693f, 0.0f, false, false, 3.505f, 7.23f)
                curveToRelative(0.0f, 0.986f, 0.372f, 1.907f, 1.052f, 2.605f)
                lineToRelative(10.69f, 10.976f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, 3.03f, 0.0f)
                arcToRelative(2.245f, 2.245f, 0.0f, false, false, 0.0f, -3.11f)
                lineTo(7.587f, 6.73f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, false, -0.98f, 0.0f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, false, -0.202f, 0.505f)
                curveToRelative(0.0f, 0.193f, 0.072f, 0.372f, 0.202f, 0.505f)
                lineToRelative(9.663f, 9.92f)
                arcToRelative(0.789f, 0.789f, 0.0f, false, true, 0.0f, 1.095f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.066f, 0.0f)
                lineTo(5.54f, 8.83f)
                arcToRelative(2.303f, 2.303f, 0.0f, false, true, 0.0f, -3.195f)
                curveToRelative(0.415f, -0.426f, 0.97f, -0.663f, 1.558f, -0.663f)
                curveToRelative(0.589f, 0.0f, 1.139f, 0.232f, 1.558f, 0.663f)
                lineToRelative(10.69f, 10.976f)
                curveToRelative(1.424f, 1.46f, 1.424f, 3.838f, 0.0f, 5.294f)
                arcTo(3.629f, 3.629f, 0.0f, false, true, 16.763f, 23.0f)
                close()
            }
        }
        .build()
        return _clipFilled!!
    }

private var _clipFilled: ImageVector? = null
