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

public val FilledGroup.ShoppingCartFilled: ImageVector
    get() {
        if (_shoppingCartFilled != null) {
            return _shoppingCartFilled!!
        }
        _shoppingCartFilled = Builder(name = "ShoppingCartFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.043f, 17.353f)
                horizontalLineTo(8.537f)
                lineToRelative(-0.632f, -2.5f)
                horizontalLineToRelative(11.406f)
                lineTo(22.0f, 4.14f)
                horizontalLineTo(5.209f)
                lineToRelative(-0.136f, -0.532f)
                arcTo(2.116f, 2.116f, 0.0f, false, false, 3.028f, 2.0f)
                horizontalLineToRelative(-0.324f)
                arcTo(0.707f, 0.707f, 0.0f, false, false, 2.0f, 2.71f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.704f, 0.715f)
                horizontalLineToRelative(0.324f)
                curveToRelative(0.32f, 0.0f, 0.604f, 0.219f, 0.684f, 0.54f)
                lineTo(7.11f, 17.458f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, false, -1.636f, 2.22f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 7.785f, 22.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, false, 2.133f, -3.214f)
                horizontalLineToRelative(5.985f)
                arcTo(2.32f, 2.32f, 0.0f, false, false, 18.035f, 22.0f)
                arcToRelative(2.315f, 2.315f, 0.0f, false, false, 2.313f, -2.321f)
                arcToRelative(2.306f, 2.306f, 0.0f, false, false, -2.305f, -2.326f)
            }
        }
        .build()
        return _shoppingCartFilled!!
    }

private var _shoppingCartFilled: ImageVector? = null
