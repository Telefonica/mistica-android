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

public val FilledGroup.HeadphonesFilled: ImageVector
    get() {
        if (_headphonesFilled != null) {
            return _headphonesFilled!!
        }
        _headphonesFilled = Builder(name = "HeadphonesFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 1.0f)
                curveTo(6.49f, 1.0f, 2.0f, 5.713f, 2.0f, 11.5f)
                verticalLineToRelative(6.56f)
                curveToRelative(0.0f, 2.246f, 1.536f, 3.935f, 3.571f, 3.935f)
                horizontalLineTo(7.36f)
                verticalLineToRelative(-7.87f)
                horizontalLineTo(5.57f)
                curveToRelative(-0.818f, 0.0f, -1.555f, 0.278f, -2.144f, 0.749f)
                verticalLineTo(11.5f)
                curveToRelative(0.0f, -4.962f, 3.845f, -8.998f, 8.573f, -8.998f)
                reflectiveCurveToRelative(8.573f, 4.036f, 8.573f, 8.998f)
                verticalLineToRelative(3.374f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, -2.144f, -0.749f)
                horizontalLineTo(16.64f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.788f)
                curveTo(20.464f, 22.0f, 22.0f, 20.306f, 22.0f, 18.065f)
                verticalLineTo(11.5f)
                curveTo(22.01f, 5.713f, 17.519f, 1.0f, 12.005f, 1.0f)
                close()
            }
        }
        .build()
        return _headphonesFilled!!
    }

private var _headphonesFilled: ImageVector? = null
