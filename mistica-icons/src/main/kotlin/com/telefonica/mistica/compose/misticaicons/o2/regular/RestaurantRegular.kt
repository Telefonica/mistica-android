package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.RestaurantRegular: ImageVector
    get() {
        if (_restaurantRegular != null) {
            return _restaurantRegular!!
        }
        _restaurantRegular = Builder(name = "RestaurantRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.514f, 3.07f)
                verticalLineToRelative(5.357f)
                curveToRelative(0.0f, 1.18f, -0.922f, 2.135f, -2.057f, 2.144f)
                verticalLineToRelative(10.716f)
                curveToRelative(0.0f, 0.393f, -0.31f, 0.713f, -0.689f, 0.713f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.689f, -0.713f)
                lineTo(9.079f, 10.57f)
                horizontalLineToRelative(-0.008f)
                curveTo(7.93f, 10.571f, 7.0f, 9.611f, 7.0f, 8.427f)
                lineTo(7.0f, 3.07f)
                curveToRelative(0.0f, -0.393f, 0.31f, -0.713f, 0.689f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.688f, 0.32f, 0.688f, 0.713f)
                verticalLineToRelative(5.357f)
                curveToRelative(0.0f, 0.394f, 0.31f, 0.714f, 0.69f, 0.714f)
                horizontalLineToRelative(0.008f)
                lineTo(9.075f, 3.07f)
                curveToRelative(0.0f, -0.393f, 0.31f, -0.713f, 0.689f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.689f, 0.32f, 0.689f, 0.713f)
                verticalLineToRelative(6.07f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.68f, -0.713f)
                lineTo(11.133f, 3.07f)
                curveToRelative(0.0f, -0.393f, 0.309f, -0.713f, 0.688f, -0.713f)
                curveToRelative(0.38f, 0.0f, 0.693f, 0.32f, 0.693f, 0.713f)
                close()
                moveTo(17.0f, 2.713f)
                verticalLineToRelative(18.57f)
                curveToRelative(0.0f, 0.392f, -0.31f, 0.712f, -0.689f, 0.712f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.688f, -0.713f)
                verticalLineToRelative(-8.571f)
                horizontalLineToRelative(-1.378f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.689f, -0.713f)
                verticalLineToRelative(-7.14f)
                curveTo(13.556f, 3.28f, 14.792f, 2.0f, 16.316f, 2.0f)
                curveToRelative(0.375f, -0.004f, 0.684f, 0.316f, 0.684f, 0.713f)
                close()
                moveTo(15.618f, 3.618f)
                curveToRelative(-0.41f, 0.247f, -0.689f, 0.709f, -0.689f, 1.24f)
                verticalLineToRelative(6.427f)
                horizontalLineToRelative(0.69f)
                lineTo(15.619f, 3.618f)
                close()
            }
        }
        .build()
        return _restaurantRegular!!
    }

private var _restaurantRegular: ImageVector? = null
