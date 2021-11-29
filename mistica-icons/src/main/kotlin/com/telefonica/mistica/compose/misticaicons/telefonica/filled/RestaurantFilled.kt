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
                moveTo(10.12f, 2.153f)
                curveToRelative(0.328f, 0.0f, 0.594f, 0.269f, 0.594f, 0.602f)
                verticalLineToRelative(7.395f)
                curveToRelative(0.0f, 0.613f, -0.359f, 1.073f, -0.835f, 1.073f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(0.521f, 3.658f, 0.953f, 8.011f, 0.958f, 8.056f)
                curveToRelative(0.003f, 1.871f, -1.274f, 2.538f, -2.372f, 2.557f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.089f, -0.014f, -2.372f, -0.683f, -2.372f, -2.51f)
                curveToRelative(0.011f, -0.12f, 0.61f, -5.137f, 1.028f, -8.109f)
                lineToRelative(-0.386f, 0.003f)
                curveToRelative(-0.476f, 0.0f, -0.835f, -0.46f, -0.835f, -1.073f)
                lineTo(5.4f, 2.79f)
                curveToRelative(0.0f, -0.33f, 0.266f, -0.62f, 0.594f, -0.62f)
                curveToRelative(0.328f, 0.0f, 0.594f, 0.25f, 0.594f, 0.583f)
                verticalLineToRelative(4.535f)
                horizontalLineToRelative(0.82f)
                lineTo(7.408f, 2.752f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.594f, -0.602f)
                curveToRelative(0.328f, 0.0f, 0.594f, 0.269f, 0.594f, 0.602f)
                verticalLineToRelative(4.535f)
                horizontalLineToRelative(0.922f)
                lineToRelative(0.005f, -4.532f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.597f, -0.602f)
                close()
                moveTo(17.876f, 13.581f)
                curveToRelative(0.373f, 2.933f, 0.647f, 5.715f, 0.65f, 5.743f)
                curveToRelative(0.003f, 1.834f, -1.252f, 2.49f, -2.328f, 2.512f)
                horizontalLineToRelative(-0.187f)
                curveToRelative(-1.079f, -0.014f, -2.337f, -0.666f, -2.337f, -2.462f)
                curveToRelative(0.006f, -0.067f, 0.348f, -2.958f, 0.695f, -5.613f)
                horizontalLineToRelative(-0.185f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.594f, -0.603f)
                lineTo(13.59f, 6.083f)
                curveToRelative(0.0f, -2.157f, 1.734f, -3.91f, 3.863f, -3.91f)
                curveToRelative(0.328f, 0.0f, 0.594f, 0.268f, 0.594f, 0.602f)
                verticalLineToRelative(10.383f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, true, -0.17f, 0.423f)
                close()
            }
        }
        .build()
        return _restaurantFilled!!
    }

private var _restaurantFilled: ImageVector? = null
