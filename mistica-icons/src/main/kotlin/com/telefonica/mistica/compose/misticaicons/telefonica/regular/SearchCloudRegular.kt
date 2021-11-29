package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.SearchCloudRegular: ImageVector
    get() {
        if (_searchCloudRegular != null) {
            return _searchCloudRegular!!
        }
        _searchCloudRegular = Builder(name = "SearchCloudRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.773f, 17.815f)
                curveToRelative(-1.893f, 0.0f, -3.434f, -1.554f, -3.434f, -3.462f)
                curveToRelative(0.0f, -1.91f, 1.54f, -3.462f, 3.434f, -3.462f)
                curveToRelative(1.894f, 0.0f, 3.431f, 1.554f, 3.431f, 3.462f)
                curveToRelative(0.003f, 1.91f, -1.537f, 3.462f, -3.43f, 3.462f)
                close()
                moveTo(5.936f, 15.036f)
                curveToRelative(-1.244f, -0.128f, -2.732f, -0.775f, -2.732f, -3.126f)
                curveToRelative(0.0f, -1.596f, 0.678f, -2.602f, 2.017f, -2.983f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.437f, -0.585f)
                lineToRelative(-0.005f, -0.112f)
                curveToRelative(0.0f, -4.656f, 4.033f, -5.014f, 5.269f, -5.014f)
                curveToRelative(0.7f, 0.0f, 4.238f, 0.16f, 5.075f, 3.305f)
                curveToRelative(0.07f, 0.26f, 0.3f, 0.443f, 0.566f, 0.451f)
                curveToRelative(1.18f, 0.034f, 3.919f, 0.49f, 3.919f, 4.003f)
                curveToRelative(0.0f, 3.736f, -3.11f, 4.028f, -4.065f, 4.028f)
                horizontalLineToRelative(-0.056f)
                curveToRelative(0.028f, -0.213f, 0.048f, -0.429f, 0.048f, -0.647f)
                curveToRelative(0.0f, -2.583f, -2.076f, -4.678f, -4.636f, -4.678f)
                reflectiveCurveToRelative(-4.639f, 2.095f, -4.639f, 4.678f)
                curveToRelative(0.0f, 0.23f, 0.023f, 0.454f, 0.054f, 0.678f)
                lineToRelative(-1.252f, 0.002f)
                close()
                moveTo(16.42f, 16.216f)
                curveToRelative(2.429f, 0.0f, 5.266f, -1.373f, 5.266f, -5.241f)
                curveToRelative(0.0f, -3.521f, -2.33f, -4.975f, -4.655f, -5.19f)
                curveTo(15.787f, 2.187f, 11.745f, 2.0f, 10.92f, 2.0f)
                curveToRelative(-1.061f, 0.0f, -6.274f, 0.289f, -6.464f, 5.908f)
                curveTo(3.387f, 8.336f, 2.0f, 9.384f, 2.0f, 11.91f)
                curveToRelative(0.0f, 2.468f, 1.426f, 4.09f, 3.874f, 4.34f)
                lineToRelative(1.658f, -0.004f)
                arcToRelative(4.635f, 4.635f, 0.0f, false, false, 4.241f, 2.788f)
                curveToRelative(1.025f, 0.0f, 1.97f, -0.34f, 2.737f, -0.908f)
                curveToRelative(0.005f, 0.006f, 0.008f, 0.017f, 0.014f, 0.022f)
                lineToRelative(3.333f, 3.365f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.852f, 0.0f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.0f, -0.86f)
                lineToRelative(-3.33f, -3.359f)
                curveToRelative(0.26f, -0.325f, 0.478f, -0.686f, 0.643f, -1.073f)
                lineToRelative(0.398f, -0.005f)
                close()
            }
        }
        .build()
        return _searchCloudRegular!!
    }

private var _searchCloudRegular: ImageVector? = null
