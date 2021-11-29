package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.HomeLight: ImageVector
    get() {
        if (_homeLight != null) {
            return _homeLight!!
        }
        _homeLight = Builder(name = "HomeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.433f, 21.018f)
                horizontalLineToRelative(2.513f)
                curveToRelative(0.403f, 0.0f, 0.73f, -0.274f, 0.73f, -0.613f)
                lineTo(18.676f, 12.71f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.427f, -0.412f)
                horizontalLineToRelative(1.154f)
                curveToRelative(0.375f, 0.0f, 0.6f, -0.21f, 0.686f, -0.406f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.132f, -0.608f)
                lineToRelative(-8.257f, -8.112f)
                curveToRelative(-0.28f, -0.274f, -0.83f, -0.274f, -1.107f, 0.0f)
                lineToRelative(-8.26f, 8.115f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, -0.132f, 0.608f)
                curveToRelative(0.087f, 0.196f, 0.311f, 0.406f, 0.686f, 0.406f)
                horizontalLineToRelative(1.037f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.426f, 0.412f)
                verticalLineToRelative(7.695f)
                curveToRelative(0.0f, 0.339f, 0.327f, 0.613f, 0.728f, 0.613f)
                horizontalLineToRelative(2.683f)
                verticalLineToRelative(-4.048f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.426f, -0.411f)
                horizontalLineToRelative(5.964f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.425f, 0.411f)
                lineToRelative(0.003f, 4.045f)
                close()
                moveTo(17.946f, 21.842f)
                horizontalLineToRelative(-2.939f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.425f, -0.412f)
                verticalLineToRelative(-4.042f)
                lineTo(9.47f, 17.388f)
                verticalLineToRelative(4.045f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.426f, 0.412f)
                horizontalLineToRelative(-3.11f)
                curveToRelative(-0.873f, 0.0f, -1.582f, -0.645f, -1.582f, -1.437f)
                verticalLineToRelative(-7.283f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-0.653f, 0.0f, -1.23f, -0.356f, -1.474f, -0.908f)
                arcToRelative(1.326f, 1.326f, 0.0f, false, true, 0.31f, -1.501f)
                lineToRelative(8.259f, -8.12f)
                curveToRelative(0.596f, -0.586f, 1.728f, -0.586f, 2.325f, 0.0f)
                lineToRelative(8.26f, 8.114f)
                curveToRelative(0.415f, 0.41f, 0.535f, 0.983f, 0.308f, 1.502f)
                curveToRelative(-0.24f, 0.551f, -0.818f, 0.91f, -1.473f, 0.91f)
                horizontalLineToRelative(-0.726f)
                verticalLineToRelative(7.283f)
                curveToRelative(0.0f, 0.793f, -0.711f, 1.437f, -1.585f, 1.437f)
                close()
            }
        }
        .build()
        return _homeLight!!
    }

private var _homeLight: ImageVector? = null
