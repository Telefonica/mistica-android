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

public val FilledGroup.ComputerUserFilled: ImageVector
    get() {
        if (_computerUserFilled != null) {
            return _computerUserFilled!!
        }
        _computerUserFilled = Builder(name = "ComputerUserFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.157f, 12.23f)
                curveToRelative(0.353f, 0.347f, 0.53f, 0.857f, 0.53f, 1.51f)
                verticalLineToRelative(4.114f)
                curveToRelative(0.0f, 0.656f, -0.177f, 1.168f, -0.53f, 1.521f)
                curveToRelative(-0.364f, 0.367f, -0.905f, 0.552f, -1.61f, 0.552f)
                lineToRelative(-9.037f, 0.006f)
                curveToRelative(-0.703f, 0.0f, -1.244f, -0.185f, -1.61f, -0.552f)
                curveToRelative(-0.351f, -0.353f, -0.53f, -0.863f, -0.53f, -1.521f)
                verticalLineToRelative(-4.115f)
                curveToRelative(0.0f, -0.655f, 0.179f, -1.162f, 0.53f, -1.513f)
                curveToRelative(0.363f, -0.358f, 0.904f, -0.54f, 1.607f, -0.54f)
                lineToRelative(9.036f, -0.006f)
                curveToRelative(0.71f, 0.003f, 1.253f, 0.185f, 1.614f, 0.544f)
                close()
                moveTo(20.983f, 20.501f)
                curveToRelative(0.34f, 0.0f, 0.61f, 0.267f, 0.61f, 0.594f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, -0.61f, 0.594f)
                horizontalLineToRelative(-11.8f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, true, -0.612f, -0.594f)
                curveToRelative(0.0f, -0.327f, 0.275f, -0.594f, 0.611f, -0.594f)
                horizontalLineToRelative(11.801f)
                close()
                moveTo(10.32f, 11.2f)
                curveToRelative(-1.406f, 0.0f, -2.518f, -0.39f, -3.305f, -1.154f)
                curveToRelative(-0.818f, -0.799f, -1.235f, -1.955f, -1.235f, -3.437f)
                curveToRelative(0.0f, -1.482f, 0.414f, -2.639f, 1.232f, -3.443f)
                curveToRelative(0.787f, -0.77f, 1.9f, -1.162f, 3.306f, -1.162f)
                curveToRelative(1.406f, 0.0f, 2.52f, 0.39f, 3.31f, 1.16f)
                curveToRelative(0.824f, 0.803f, 1.241f, 1.96f, 1.241f, 3.442f)
                curveToRelative(0.0f, 1.482f, -0.417f, 2.639f, -1.24f, 3.44f)
                curveToRelative(-0.788f, 0.765f, -1.903f, 1.154f, -3.309f, 1.154f)
                close()
                moveTo(8.141f, 12.071f)
                curveToRelative(-0.314f, 0.457f, -0.476f, 1.028f, -0.476f, 1.712f)
                verticalLineToRelative(4.114f)
                curveToRelative(0.0f, 0.625f, 0.137f, 1.157f, 0.398f, 1.6f)
                horizontalLineToRelative(-4.98f)
                curveToRelative(-0.597f, 0.0f, -1.082f, -0.47f, -1.082f, -1.048f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -1.429f, 0.468f, -2.659f, 1.356f, -3.555f)
                curveToRelative(0.96f, -0.975f, 2.37f, -1.487f, 4.073f, -1.487f)
                horizontalLineToRelative(0.711f)
                verticalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _computerUserFilled!!
    }

private var _computerUserFilled: ImageVector? = null
