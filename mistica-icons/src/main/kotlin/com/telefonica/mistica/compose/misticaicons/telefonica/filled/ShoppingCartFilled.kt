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
                moveTo(21.552f, 6.849f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, -0.443f, -0.216f)
                lineTo(7.056f, 6.633f)
                curveToRelative(-0.23f, -1.288f, -0.4f, -2.501f, -0.403f, -2.53f)
                curveToRelative(-0.219f, -1.218f, -1.367f, -2.1f, -2.737f, -2.1f)
                lineTo(2.56f, 2.003f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, 0.252f, 0.56f, 0.56f, 0.56f)
                horizontalLineToRelative(1.356f)
                curveToRelative(0.812f, 0.0f, 1.513f, 0.507f, 1.633f, 1.177f)
                curveToRelative(0.23f, 1.285f, 1.507f, 8.708f, 1.636f, 9.535f)
                curveToRelative(0.162f, 1.025f, 0.543f, 1.829f, 1.137f, 2.389f)
                curveToRelative(0.566f, 0.535f, 1.311f, 0.815f, 2.149f, 0.815f)
                horizontalLineToRelative(6.008f)
                curveToRelative(0.83f, 0.0f, 1.532f, -0.283f, 2.092f, -0.84f)
                curveToRelative(0.53f, -0.53f, 0.886f, -1.294f, 1.182f, -2.308f)
                curveToRelative(0.132f, -0.451f, 1.729f, -5.941f, 1.902f, -6.558f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, -0.103f, -0.484f)
                close()
                moveTo(10.47f, 21.683f)
                curveToRelative(-0.502f, 0.0f, -0.902f, -0.142f, -1.194f, -0.423f)
                curveToRelative(-0.305f, -0.294f, -0.46f, -0.705f, -0.46f, -1.23f)
                curveToRelative(0.0f, -0.523f, 0.155f, -0.935f, 0.46f, -1.229f)
                curveToRelative(0.292f, -0.28f, 0.695f, -0.423f, 1.194f, -0.423f)
                curveToRelative(0.498f, 0.0f, 0.902f, 0.143f, 1.193f, 0.423f)
                curveToRelative(0.305f, 0.294f, 0.46f, 0.706f, 0.46f, 1.23f)
                reflectiveCurveToRelative(-0.155f, 0.935f, -0.46f, 1.23f)
                curveToRelative(-0.291f, 0.28f, -0.692f, 0.422f, -1.193f, 0.422f)
                close()
                moveTo(15.932f, 21.683f)
                curveToRelative(-0.502f, 0.0f, -0.902f, -0.142f, -1.194f, -0.423f)
                curveToRelative(-0.305f, -0.294f, -0.459f, -0.705f, -0.459f, -1.23f)
                curveToRelative(0.0f, -0.523f, 0.154f, -0.935f, 0.46f, -1.229f)
                curveToRelative(0.29f, -0.28f, 0.694f, -0.423f, 1.193f, -0.423f)
                curveToRelative(0.498f, 0.0f, 0.902f, 0.143f, 1.193f, 0.423f)
                curveToRelative(0.303f, 0.294f, 0.46f, 0.706f, 0.46f, 1.23f)
                reflectiveCurveToRelative(-0.155f, 0.935f, -0.46f, 1.23f)
                curveToRelative(-0.291f, 0.28f, -0.692f, 0.422f, -1.193f, 0.422f)
                close()
            }
        }
        .build()
        return _shoppingCartFilled!!
    }

private var _shoppingCartFilled: ImageVector? = null
