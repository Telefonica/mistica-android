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

public val FilledGroup.TachometerFilled: ImageVector
    get() {
        if (_tachometerFilled != null) {
            return _tachometerFilled!!
        }
        _tachometerFilled = Builder(name = "TachometerFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.595f, 14.445f)
                lineToRelative(-6.375f, 1.832f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.227f, 0.972f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, true, -1.255f, -1.232f)
                curveToRelative(0.0f, -0.68f, 0.563f, -1.23f, 1.255f, -1.23f)
                curveToRelative(0.345f, 0.0f, 0.656f, 0.135f, 0.882f, 0.356f)
                lineToRelative(6.381f, -1.835f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.748f, 0.4f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, -0.409f, 0.737f)
                close()
                moveTo(7.971f, 10.986f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.855f, 0.0f)
                lineToRelative(-0.577f, -0.566f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, true, 0.0f, -0.837f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.855f, 0.0f)
                lineToRelative(0.577f, 0.565f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.0f, 0.838f)
                close()
                moveTo(5.95f, 14.93f)
                horizontalLineToRelative(-0.818f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, -0.591f)
                curveToRelative(0.0f, -0.325f, 0.272f, -0.591f, 0.602f, -0.591f)
                horizontalLineToRelative(0.818f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.266f, 0.602f, 0.59f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, 0.592f)
                close()
                moveTo(11.376f, 8.398f)
                curveToRelative(0.0f, -0.328f, 0.272f, -0.591f, 0.602f, -0.591f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.266f, 0.602f, 0.59f)
                lineTo(12.58f, 9.2f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, 0.59f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.602f, -0.59f)
                verticalLineToRelative(-0.801f)
                close()
                moveTo(15.981f, 10.151f)
                lineTo(16.558f, 9.585f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.854f, 0.0f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, true, 0.0f, 0.838f)
                lineToRelative(-0.577f, 0.566f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.851f, 0.0f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.003f, -0.838f)
                close()
                moveTo(11.99f, 5.333f)
                curveToRelative(-6.437f, 0.0f, -9.84f, 3.34f, -9.84f, 9.653f)
                curveToRelative(0.0f, 1.44f, 0.182f, 2.742f, 0.54f, 3.874f)
                curveToRelative(0.079f, 0.246f, 0.312f, 0.414f, 0.578f, 0.414f)
                lineTo(20.71f, 19.274f)
                curveToRelative(0.23f, 0.0f, 0.44f, -0.128f, 0.54f, -0.33f)
                lineToRelative(0.02f, -0.042f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, false, 0.037f, -0.087f)
                curveToRelative(0.35f, -1.12f, 0.53f, -2.409f, 0.53f, -3.829f)
                curveToRelative(0.0f, -6.314f, -3.404f, -9.653f, -9.847f, -9.653f)
                close()
            }
        }
        .build()
        return _tachometerFilled!!
    }

private var _tachometerFilled: ImageVector? = null
