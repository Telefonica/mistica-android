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

public val RegularGroup.HeadphonesRegular: ImageVector
    get() {
        if (_headphonesRegular != null) {
            return _headphonesRegular!!
        }
        _headphonesRegular = Builder(name = "HeadphonesRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 1.0f)
                curveTo(6.49f, 1.0f, 2.0f, 5.713f, 2.0f, 11.5f)
                verticalLineToRelative(6.56f)
                curveToRelative(0.0f, 2.246f, 1.536f, 3.935f, 3.571f, 3.935f)
                lineTo(7.36f, 21.995f)
                verticalLineToRelative(-7.87f)
                lineTo(5.57f, 14.125f)
                curveToRelative(-0.818f, 0.0f, -1.555f, 0.278f, -2.144f, 0.749f)
                lineTo(3.426f, 11.5f)
                curveToRelative(0.0f, -4.962f, 3.845f, -8.998f, 8.573f, -8.998f)
                reflectiveCurveToRelative(8.573f, 4.036f, 8.573f, 8.998f)
                verticalLineToRelative(3.374f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, -2.144f, -0.749f)
                lineTo(16.64f, 14.125f)
                lineTo(16.64f, 22.0f)
                horizontalLineToRelative(1.788f)
                curveTo(20.464f, 22.0f, 22.0f, 20.306f, 22.0f, 18.065f)
                lineTo(22.0f, 11.5f)
                curveTo(22.01f, 5.713f, 17.519f, 1.0f, 12.005f, 1.0f)
                close()
                moveTo(5.575f, 15.622f)
                horizontalLineToRelative(0.357f)
                verticalLineToRelative(4.876f)
                horizontalLineToRelative(-0.356f)
                curveToRelative(-1.244f, 0.0f, -2.145f, -1.027f, -2.145f, -2.438f)
                curveToRelative(0.0f, -1.41f, 0.901f, -2.438f, 2.145f, -2.438f)
                close()
                moveTo(18.433f, 20.498f)
                horizontalLineToRelative(-0.356f)
                verticalLineToRelative(-4.876f)
                horizontalLineToRelative(0.356f)
                curveToRelative(1.244f, 0.0f, 2.145f, 1.027f, 2.145f, 2.438f)
                curveToRelative(0.0f, 1.411f, -0.9f, 2.438f, -2.145f, 2.438f)
                close()
            }
        }
        .build()
        return _headphonesRegular!!
    }

private var _headphonesRegular: ImageVector? = null
