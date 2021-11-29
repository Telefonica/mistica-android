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

public val RegularGroup.ShoppingCartRegular: ImageVector
    get() {
        if (_shoppingCartRegular != null) {
            return _shoppingCartRegular!!
        }
        _shoppingCartRegular = Builder(name = "ShoppingCartRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.076f, 17.36f)
                curveToRelative(-0.036f, 0.0f, -0.072f, 0.0f, -0.104f, 0.004f)
                curveToRelative(-0.016f, 0.0f, -0.036f, -0.004f, -0.052f, -0.004f)
                lineTo(8.548f, 17.36f)
                lineToRelative(-0.632f, -2.472f)
                horizontalLineToRelative(11.432f)
                lineTo(22.0f, 4.312f)
                lineTo(5.212f, 4.312f)
                lineToRelative(-0.132f, -0.524f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, false, -2.052f, -1.596f)
                horizontalLineToRelative(-0.324f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, false, 0.0f, 1.408f)
                horizontalLineToRelative(0.324f)
                curveToRelative(0.32f, 0.0f, 0.6f, 0.22f, 0.68f, 0.532f)
                lineTo(7.12f, 17.46f)
                arcToRelative(2.296f, 2.296f, 0.0f, false, false, -1.64f, 2.196f)
                curveToRelative(0.0f, 1.268f, 1.04f, 2.292f, 2.316f, 2.292f)
                curveToRelative(1.276f, 0.0f, 2.316f, -1.028f, 2.316f, -2.292f)
                curveToRelative(0.0f, -0.312f, -0.064f, -0.612f, -0.18f, -0.884f)
                horizontalLineToRelative(6.004f)
                curveToRelative(-0.116f, 0.272f, -0.18f, 0.572f, -0.18f, 0.884f)
                curveToRelative(0.0f, 1.268f, 1.04f, 2.292f, 2.316f, 2.292f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.316f, -2.292f)
                arcToRelative(2.305f, 2.305f, 0.0f, false, false, -2.312f, -2.296f)
                close()
                moveTo(20.188f, 5.72f)
                lineTo(18.248f, 13.484f)
                lineTo(7.556f, 13.484f)
                lineTo(5.572f, 5.72f)
                horizontalLineToRelative(14.616f)
                close()
                moveTo(8.444f, 20.268f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, true, -0.644f, 0.268f)
                curveToRelative(-0.5f, 0.0f, -0.908f, -0.396f, -0.908f, -0.88f)
                curveToRelative(0.0f, -0.236f, 0.092f, -0.452f, 0.26f, -0.62f)
                arcToRelative(0.891f, 0.891f, 0.0f, false, true, 0.644f, -0.268f)
                curveToRelative(0.5f, 0.0f, 0.908f, 0.396f, 0.908f, 0.88f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, true, -0.26f, 0.62f)
                close()
                moveTo(18.72f, 20.268f)
                arcToRelative(0.891f, 0.891f, 0.0f, false, true, -0.644f, 0.268f)
                curveToRelative(-0.5f, 0.0f, -0.908f, -0.396f, -0.908f, -0.88f)
                curveToRelative(0.0f, -0.236f, 0.092f, -0.452f, 0.26f, -0.62f)
                arcToRelative(0.891f, 0.891f, 0.0f, false, true, 0.644f, -0.268f)
                curveToRelative(0.5f, 0.0f, 0.908f, 0.396f, 0.908f, 0.88f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, true, -0.26f, 0.62f)
                close()
            }
        }
        .build()
        return _shoppingCartRegular!!
    }

private var _shoppingCartRegular: ImageVector? = null
