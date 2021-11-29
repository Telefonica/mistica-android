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

public val FilledGroup.ShopFilled: ImageVector
    get() {
        if (_shopFilled != null) {
            return _shopFilled!!
        }
        _shopFilled = Builder(name = "ShopFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.478f, 6.53f)
                horizontalLineToRelative(-2.654f)
                verticalLineToRelative(-0.565f)
                curveTo(15.82f, 3.775f, 14.113f, 2.0f, 12.004f, 2.0f)
                curveToRelative(-2.11f, 0.0f, -3.817f, 1.776f, -3.817f, 3.96f)
                verticalLineToRelative(0.566f)
                horizontalLineTo(5.53f)
                lineTo(4.0f, 19.659f)
                verticalLineToRelative(0.076f)
                curveTo(4.0f, 21.094f, 4.73f, 22.0f, 5.816f, 22.0f)
                horizontalLineToRelative(12.368f)
                curveTo(19.278f, 22.0f, 20.0f, 21.094f, 20.0f, 19.735f)
                lineTo(18.478f, 6.53f)
                close()
                moveTo(9.64f, 5.96f)
                curveToRelative(0.0f, -1.358f, 1.054f, -2.453f, 2.364f, -2.453f)
                curveToRelative(1.31f, 0.0f, 2.364f, 1.095f, 2.364f, 2.454f)
                verticalLineToRelative(0.565f)
                horizontalLineTo(9.64f)
                verticalLineToRelative(-0.565f)
                close()
            }
        }
        .build()
        return _shopFilled!!
    }

private var _shopFilled: ImageVector? = null
