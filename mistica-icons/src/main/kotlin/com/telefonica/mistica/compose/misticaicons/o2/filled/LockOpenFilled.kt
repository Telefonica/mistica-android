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

public val FilledGroup.LockOpenFilled: ImageVector
    get() {
        if (_lockOpenFilled != null) {
            return _lockOpenFilled!!
        }
        _lockOpenFilled = Builder(name = "LockOpenFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.298f, 9.893f)
                verticalLineTo(8.07f)
                curveToRelative(0.0f, -3.355f, -2.592f, -6.07f, -5.794f, -6.07f)
                curveToRelative(-2.317f, 0.0f, -4.397f, 1.427f, -5.317f, 3.643f)
                curveToRelative(-0.137f, 0.355f, 0.0f, 0.783f, 0.34f, 0.927f)
                curveToRelative(0.34f, 0.144f, 0.748f, 0.0f, 0.885f, -0.356f)
                curveToRelative(0.748f, -1.679f, 2.317f, -2.783f, 4.088f, -2.783f)
                curveToRelative(2.454f, 0.0f, 4.431f, 2.072f, 4.431f, 4.643f)
                verticalLineToRelative(1.783f)
                horizontalLineTo(7.046f)
                curveTo(5.92f, 9.857f, 5.0f, 10.82f, 5.0f, 12.0f)
                verticalLineToRelative(7.857f)
                curveTo(5.0f, 21.037f, 5.92f, 22.0f, 7.046f, 22.0f)
                horizontalLineToRelative(10.908f)
                curveTo(19.08f, 22.0f, 20.0f, 21.036f, 20.0f, 19.857f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -1.072f, -0.748f, -1.927f, -1.702f, -2.107f)
                close()
            }
        }
        .build()
        return _lockOpenFilled!!
    }

private var _lockOpenFilled: ImageVector? = null
