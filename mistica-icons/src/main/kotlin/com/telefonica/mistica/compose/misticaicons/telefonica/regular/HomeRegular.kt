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

public val RegularGroup.HomeRegular: ImageVector
    get() {
        if (_homeRegular != null) {
            return _homeRegular!!
        }
        _homeRegular = Builder(name = "HomeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.415f, 20.476f)
                horizontalLineToRelative(2.249f)
                curveToRelative(0.28f, 0.0f, 0.507f, -0.18f, 0.507f, -0.4f)
                verticalLineToRelative(-7.538f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.627f, -0.605f)
                horizontalLineToRelative(1.13f)
                curveToRelative(0.265f, 0.0f, 0.422f, -0.14f, 0.478f, -0.275f)
                curveToRelative(0.04f, -0.095f, 0.059f, -0.232f, -0.087f, -0.378f)
                lineToRelative(-8.084f, -7.944f)
                curveToRelative(-0.196f, -0.193f, -0.59f, -0.193f, -0.787f, 0.0f)
                lineToRelative(-8.081f, 7.95f)
                curveToRelative(-0.146f, 0.143f, -0.126f, 0.283f, -0.084f, 0.378f)
                curveToRelative(0.056f, 0.132f, 0.213f, 0.272f, 0.479f, 0.272f)
                horizontalLineToRelative(1.017f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, 0.624f, 0.605f)
                verticalLineToRelative(7.537f)
                curveToRelative(0.0f, 0.222f, 0.227f, 0.401f, 0.505f, 0.401f)
                horizontalLineToRelative(2.417f)
                verticalLineToRelative(-3.762f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.627f, -0.605f)
                horizontalLineToRelative(5.838f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, 0.625f, 0.605f)
                verticalLineToRelative(3.76f)
                close()
                moveTo(17.664f, 21.686f)
                horizontalLineToRelative(-2.877f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, -0.625f, -0.605f)
                verticalLineToRelative(-3.759f)
                lineTo(9.577f, 17.322f)
                verticalLineToRelative(3.76f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.625f, 0.604f)
                lineTo(5.908f, 21.686f)
                curveToRelative(-0.97f, 0.0f, -1.76f, -0.722f, -1.76f, -1.608f)
                verticalLineToRelative(-6.932f)
                horizontalLineToRelative(-0.386f)
                curveToRelative(-0.723f, 0.0f, -1.367f, -0.398f, -1.633f, -1.014f)
                curveToRelative(-0.255f, -0.583f, -0.123f, -1.233f, 0.347f, -1.69f)
                lineToRelative(8.081f, -7.952f)
                curveToRelative(0.661f, -0.652f, 1.91f, -0.652f, 2.575f, 0.0f)
                lineToRelative(8.08f, 7.95f)
                curveToRelative(0.469f, 0.46f, 0.603f, 1.106f, 0.348f, 1.689f)
                curveToRelative(-0.266f, 0.616f, -0.91f, 1.014f, -1.633f, 1.014f)
                horizontalLineToRelative(-0.504f)
                verticalLineToRelative(6.933f)
                curveToRelative(0.0f, 0.888f, -0.79f, 1.61f, -1.76f, 1.61f)
                close()
            }
        }
        .build()
        return _homeRegular!!
    }

private var _homeRegular: ImageVector? = null
