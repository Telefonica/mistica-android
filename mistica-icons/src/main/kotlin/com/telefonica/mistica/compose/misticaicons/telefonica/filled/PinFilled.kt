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

public val FilledGroup.PinFilled: ImageVector
    get() {
        if (_pinFilled != null) {
            return _pinFilled!!
        }
        _pinFilled = Builder(name = "PinFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.523f, 8.167f)
                lineToRelative(-5.66f, -5.689f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, false, -1.5f, 0.0f)
                curveToRelative(-0.736f, 0.743f, -1.178f, 1.56f, -1.316f, 2.437f)
                lineToRelative(-2.53f, 2.55f)
                curveToRelative(-1.456f, -0.253f, -3.529f, -0.01f, -5.719f, 2.195f)
                lineToRelative(-0.03f, 0.034f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, false, -0.362f, 0.88f)
                curveToRelative(0.0f, 0.33f, 0.129f, 0.641f, 0.361f, 0.876f)
                lineToRelative(3.443f, 3.468f)
                lineToRelative(-5.866f, 5.854f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.003f, 0.891f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, 0.886f, 0.003f)
                lineToRelative(5.868f, -5.857f)
                lineToRelative(3.518f, 3.546f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.86f, 0.359f)
                curveToRelative(0.333f, 0.0f, 0.672f, -0.135f, 0.947f, -0.412f)
                curveToRelative(1.767f, -1.782f, 2.49f, -3.709f, 2.143f, -5.734f)
                lineToRelative(2.532f, -2.552f)
                curveToRelative(0.877f, -0.148f, 1.7f, -0.602f, 2.462f, -1.37f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.291f, -0.708f)
                arcToRelative(1.093f, 1.093f, 0.0f, false, false, -0.325f, -0.77f)
            }
        }
        .build()
        return _pinFilled!!
    }

private var _pinFilled: ImageVector? = null
