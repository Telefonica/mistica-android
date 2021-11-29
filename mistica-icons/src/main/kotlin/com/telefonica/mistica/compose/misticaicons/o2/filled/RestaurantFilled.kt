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

public val FilledGroup.RestaurantFilled: ImageVector
    get() {
        if (_restaurantFilled != null) {
            return _restaurantFilled!!
        }
        _restaurantFilled = Builder(name = "RestaurantFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.517f, 3.074f)
                verticalLineToRelative(5.357f)
                curveToRelative(0.0f, 1.179f, -0.923f, 2.134f, -2.059f, 2.143f)
                verticalLineToRelative(10.713f)
                curveToRelative(0.0f, 0.393f, -0.309f, 0.713f, -0.689f, 0.713f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.689f, -0.713f)
                verticalLineTo(10.574f)
                horizontalLineToRelative(-0.008f)
                curveTo(7.932f, 10.574f, 7.0f, 9.614f, 7.0f, 8.431f)
                verticalLineTo(3.074f)
                curveToRelative(0.0f, -0.393f, 0.31f, -0.713f, 0.689f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.32f, 0.69f, 0.713f)
                verticalLineToRelative(5.357f)
                curveToRelative(0.0f, 0.393f, 0.308f, 0.713f, 0.688f, 0.713f)
                horizontalLineToRelative(0.009f)
                verticalLineToRelative(-6.07f)
                curveToRelative(0.0f, -0.393f, 0.31f, -0.713f, 0.689f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.689f, 0.32f, 0.689f, 0.713f)
                verticalLineToRelative(6.07f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.68f, -0.713f)
                verticalLineTo(3.074f)
                curveToRelative(0.0f, -0.393f, 0.31f, -0.713f, 0.69f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.693f, 0.32f, 0.693f, 0.713f)
                close()
                moveTo(16.315f, 2.0f)
                curveToRelative(-1.524f, 0.0f, -2.76f, 1.28f, -2.76f, 2.856f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 0.393f, 0.309f, 0.713f, 0.689f, 0.713f)
                horizontalLineToRelative(1.378f)
                verticalLineToRelative(8.57f)
                curveToRelative(0.0f, 0.393f, 0.31f, 0.712f, 0.689f, 0.712f)
                curveToRelative(0.38f, 0.0f, 0.689f, -0.32f, 0.689f, -0.713f)
                verticalLineTo(2.718f)
                arcTo(0.697f, 0.697f, 0.0f, false, false, 16.315f, 2.0f)
                close()
            }
        }
        .build()
        return _restaurantFilled!!
    }

private var _restaurantFilled: ImageVector? = null
