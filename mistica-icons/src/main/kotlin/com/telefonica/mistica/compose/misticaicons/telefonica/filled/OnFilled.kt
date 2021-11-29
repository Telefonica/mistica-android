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

public val FilledGroup.OnFilled: ImageVector
    get() {
        if (_onFilled != null) {
            return _onFilled!!
        }
        _onFilled = Builder(name = "OnFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.463f, 15.665f)
                lineTo(17.463f, 8.942f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.41f, -0.409f)
                horizontalLineToRelative(-0.274f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.409f, 0.41f)
                verticalLineToRelative(4.772f)
                lineToRelative(-3.314f, -5.0f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.341f, -0.185f)
                horizontalLineToRelative(-0.219f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, false, -0.409f, 0.41f)
                verticalLineToRelative(6.722f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.41f, 0.41f)
                horizontalLineToRelative(0.274f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, -0.41f)
                verticalLineToRelative(-4.765f)
                lineToRelative(3.3f, 4.995f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.341f, 0.185f)
                horizontalLineToRelative(0.227f)
                curveToRelative(0.23f, 0.0f, 0.415f, -0.185f, 0.415f, -0.412f)
                close()
                moveTo(8.535f, 16.214f)
                curveToRelative(1.286f, 0.0f, 2.818f, -0.675f, 2.818f, -3.9f)
                curveToRelative(0.0f, -3.232f, -1.532f, -3.91f, -2.818f, -3.91f)
                curveToRelative(-1.291f, 0.0f, -2.829f, 0.678f, -2.829f, 3.91f)
                curveToRelative(0.0f, 3.222f, 1.538f, 3.9f, 2.83f, 3.9f)
                close()
                moveTo(12.406f, 2.169f)
                curveToRelative(1.575f, 0.037f, 9.44f, 0.69f, 9.44f, 9.86f)
                curveToRelative(0.0f, 9.177f, -7.834f, 9.784f, -9.403f, 9.812f)
                curveToRelative(-0.171f, 0.003f, -0.364f, 0.006f, -0.563f, 0.006f)
                curveToRelative(-0.104f, 0.0f, -0.213f, 0.0f, -0.314f, -0.003f)
                curveToRelative(-8.952f, -0.129f, -9.406f, -8.246f, -9.406f, -9.87f)
                curveToRelative(0.0f, -1.626f, 0.451f, -9.738f, 9.339f, -9.813f)
                curveToRelative(0.3f, -0.003f, 0.63f, 0.003f, 0.907f, 0.008f)
                close()
                moveTo(8.536f, 9.519f)
                curveToRelative(0.784f, 0.0f, 1.683f, 0.32f, 1.683f, 2.796f)
                curveToRelative(0.0f, 2.445f, -0.852f, 2.776f, -1.684f, 2.776f)
                curveToRelative(-0.837f, 0.0f, -1.694f, -0.33f, -1.694f, -2.776f)
                curveToRelative(0.0f, -2.465f, 0.857f, -2.796f, 1.694f, -2.796f)
                close()
            }
        }
        .build()
        return _onFilled!!
    }

private var _onFilled: ImageVector? = null
