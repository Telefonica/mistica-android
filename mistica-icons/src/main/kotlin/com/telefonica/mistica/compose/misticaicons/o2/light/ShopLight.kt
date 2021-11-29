package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.ShopLight: ImageVector
    get() {
        if (_shopLight != null) {
            return _shopLight!!
        }
        _shopLight = Builder(name = "ShopLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.806f, 20.464f)
                curveToRelative(0.42f, 0.0f, 0.764f, 0.344f, 0.76f, 0.768f)
                curveToRelative(0.0f, 0.424f, -0.34f, 0.768f, -0.76f, 0.768f)
                arcToRelative(0.764f, 0.764f, 0.0f, false, true, -0.76f, -0.768f)
                curveToRelative(0.0f, -0.424f, 0.34f, -0.768f, 0.76f, -0.768f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.98f, 0.0f, 3.62f, 1.656f, 3.62f, 3.655f)
                verticalLineToRelative(0.96f)
                horizontalLineToRelative(2.816f)
                lineTo(20.0f, 19.692f)
                curveToRelative(0.0f, 1.156f, -0.61f, 1.924f, -1.525f, 1.924f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.226f, 0.0f, -0.38f, -0.152f, -0.38f, -0.384f)
                curveToRelative(0.0f, -0.228f, 0.15f, -0.384f, 0.38f, -0.384f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.685f, 0.0f, 0.76f, -0.808f, 0.76f, -1.116f)
                lineTo(17.75f, 7.387f)
                lineTo(6.25f, 7.387f)
                lineTo(4.764f, 19.732f)
                curveToRelative(0.0f, 0.272f, 0.076f, 1.116f, 0.76f, 1.116f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.226f, 0.0f, 0.381f, 0.152f, 0.381f, 0.384f)
                curveToRelative(0.0f, 0.228f, -0.15f, 0.384f, -0.38f, 0.384f)
                horizontalLineToRelative(-8.0f)
                curveTo(4.61f, 21.616f, 4.0f, 20.848f, 4.0f, 19.692f)
                verticalLineToRelative(-0.036f)
                lineTo(5.564f, 6.62f)
                lineTo(8.38f, 6.62f)
                verticalLineToRelative(-0.964f)
                curveTo(8.38f, 3.655f, 10.02f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 2.772f)
                curveToRelative(-1.56f, 0.0f, -2.855f, 1.308f, -2.855f, 2.883f)
                verticalLineToRelative(0.964f)
                horizontalLineToRelative(5.71f)
                verticalLineToRelative(-0.964f)
                curveToRelative(0.0f, -1.575f, -1.295f, -2.883f, -2.855f, -2.883f)
                close()
            }
        }
        .build()
        return _shopLight!!
    }

private var _shopLight: ImageVector? = null
