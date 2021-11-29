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

public val LightGroup.ShoppingCartLight: ImageVector
    get() {
        if (_shoppingCartLight != null) {
            return _shoppingCartLight!!
        }
        _shoppingCartLight = Builder(name = "ShoppingCartLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.42f, 2.34f)
                curveToRelative(0.796f, 0.0f, 1.388f, 0.48f, 1.592f, 1.276f)
                lineToRelative(2.58f, 10.096f)
                horizontalLineToRelative(11.32f)
                lineToRelative(2.168f, -8.528f)
                lineTo(9.816f, 5.184f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.0f, -0.712f)
                lineTo(22.0f, 4.472f)
                lineToRelative(-2.532f, 9.948f)
                horizontalLineToRelative(-11.7f)
                lineToRelative(0.728f, 2.844f)
                horizontalLineToRelative(10.048f)
                arcToRelative(2.307f, 2.307f, 0.0f, false, true, 1.648f, 3.936f)
                arcToRelative(2.323f, 2.323f, 0.0f, false, true, -1.66f, 0.688f)
                curveToRelative(-1.284f, 0.0f, -2.332f, -1.04f, -2.332f, -2.312f)
                curveToRelative(0.0f, -0.624f, 0.252f, -1.188f, 0.656f, -1.6f)
                lineTo(9.744f, 17.976f)
                curveToRelative(0.404f, 0.412f, 0.656f, 0.976f, 0.656f, 1.6f)
                curveToRelative(0.0f, 1.276f, -1.048f, 2.312f, -2.332f, 2.312f)
                curveToRelative(-1.284f, 0.0f, -2.332f, -1.04f, -2.332f, -2.312f)
                curveToRelative(0.0f, -1.172f, 0.88f, -2.148f, 2.028f, -2.292f)
                lineTo(4.32f, 3.788f)
                curveToRelative(-0.12f, -0.492f, -0.428f, -0.736f, -0.904f, -0.736f)
                horizontalLineToRelative(-1.06f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.0f, -0.712f)
                close()
                moveTo(8.068f, 17.976f)
                curveToRelative(-0.892f, 0.0f, -1.62f, 0.716f, -1.62f, 1.6f)
                curveToRelative(0.0f, 0.88f, 0.728f, 1.6f, 1.62f, 1.6f)
                curveToRelative(0.892f, 0.0f, 1.62f, -0.72f, 1.62f, -1.6f)
                curveToRelative(0.0f, -0.88f, -0.728f, -1.6f, -1.62f, -1.6f)
                close()
                moveTo(18.544f, 17.976f)
                curveToRelative(-0.892f, 0.0f, -1.62f, 0.716f, -1.62f, 1.6f)
                curveToRelative(0.0f, 0.88f, 0.728f, 1.6f, 1.62f, 1.6f)
                curveToRelative(0.436f, 0.0f, 0.852f, -0.168f, 1.156f, -0.476f)
                curveToRelative(0.3f, -0.3f, 0.464f, -0.704f, 0.464f, -1.12f)
                curveToRelative(0.0f, -0.884f, -0.728f, -1.604f, -1.62f, -1.604f)
                close()
                moveTo(7.517f, 4.139f)
                arcToRelative(0.708f, 0.708f, 0.0f, true, true, 0.326f, 1.378f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, true, -0.326f, -1.378f)
                close()
            }
        }
        .build()
        return _shoppingCartLight!!
    }

private var _shoppingCartLight: ImageVector? = null
