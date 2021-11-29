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

public val FilledGroup.TrashCanFilled: ImageVector
    get() {
        if (_trashCanFilled != null) {
            return _trashCanFilled!!
        }
        _trashCanFilled = Builder(name = "TrashCanFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.254f, 3.624f)
                horizontalLineToRelative(-5.922f)
                verticalLineToRelative(-0.373f)
                curveToRelative(0.0f, -1.239f, -1.0f, -2.251f, -2.223f, -2.251f)
                horizontalLineToRelative(-2.222f)
                curveTo(9.663f, 1.0f, 8.664f, 2.012f, 8.664f, 3.25f)
                verticalLineToRelative(0.374f)
                lineTo(2.742f, 3.624f)
                arcTo(0.749f, 0.749f, 0.0f, false, false, 2.0f, 4.376f)
                curveToRelative(0.0f, 0.416f, 0.332f, 0.752f, 0.742f, 0.752f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(14.621f)
                curveToRelative(0.0f, 1.239f, 1.0f, 2.251f, 2.223f, 2.251f)
                horizontalLineToRelative(11.11f)
                curveToRelative(1.223f, 0.0f, 2.222f, -1.012f, 2.222f, -2.25f)
                lineTo(19.777f, 5.123f)
                horizontalLineToRelative(1.48f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.003f, -1.5f)
                close()
                moveTo(9.962f, 18.246f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.556f, 0.563f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.555f, -0.563f)
                lineTo(8.851f, 7.374f)
                curveToRelative(0.0f, -0.298f, 0.26f, -0.562f, 0.555f, -0.562f)
                curveToRelative(0.295f, 0.0f, 0.556f, 0.264f, 0.556f, 0.562f)
                verticalLineToRelative(10.872f)
                close()
                moveTo(13.847f, 3.624f)
                horizontalLineToRelative(-3.703f)
                verticalLineToRelative(-0.373f)
                curveToRelative(0.0f, -0.412f, 0.332f, -0.752f, 0.743f, -0.752f)
                horizontalLineToRelative(2.222f)
                curveToRelative(0.407f, 0.0f, 0.743f, 0.336f, 0.743f, 0.752f)
                verticalLineToRelative(0.373f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(15.145f, 18.246f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.555f, 0.563f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.556f, -0.563f)
                lineTo(14.034f, 7.374f)
                curveToRelative(0.0f, -0.298f, 0.261f, -0.562f, 0.556f, -0.562f)
                curveToRelative(0.294f, 0.0f, 0.555f, 0.264f, 0.555f, 0.562f)
                verticalLineToRelative(10.872f)
                close()
            }
        }
        .build()
        return _trashCanFilled!!
    }

private var _trashCanFilled: ImageVector? = null
