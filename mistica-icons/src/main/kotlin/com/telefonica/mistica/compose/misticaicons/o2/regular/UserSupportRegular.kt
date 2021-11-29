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

public val RegularGroup.UserSupportRegular: ImageVector
    get() {
        if (_userSupportRegular != null) {
            return _userSupportRegular!!
        }
        _userSupportRegular = Builder(name = "UserSupportRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.36f, 2.0f)
                curveTo(17.672f, 2.0f, 22.0f, 6.543f, 22.0f, 12.118f)
                reflectiveCurveToRelative(-4.328f, 10.118f, -9.64f, 10.118f)
                curveToRelative(-1.348f, 0.0f, -2.656f, -0.307f, -3.892f, -0.84f)
                lineTo(2.9f, 22.962f)
                curveTo(2.864f, 23.0f, 2.792f, 23.0f, 2.72f, 23.0f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, -0.508f, -0.227f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.184f, -0.726f)
                lineToRelative(1.528f, -5.844f)
                arcToRelative(10.445f, 10.445f, 0.0f, false, true, -0.836f, -4.085f)
                curveTo(2.72f, 6.543f, 7.048f, 2.0f, 12.36f, 2.0f)
                close()
                moveTo(12.356f, 3.528f)
                curveToRelative(-4.512f, 0.0f, -8.184f, 3.858f, -8.184f, 8.59f)
                curveToRelative(0.0f, 1.297f, 0.256f, 2.519f, 0.8f, 3.665f)
                curveToRelative(0.072f, 0.151f, 0.072f, 0.344f, 0.036f, 0.533f)
                lineTo(3.736f, 21.17f)
                lineToRelative(4.58f, -1.302f)
                curveToRelative(0.184f, -0.038f, 0.364f, -0.038f, 0.508f, 0.038f)
                curveToRelative(1.092f, 0.533f, 2.292f, 0.84f, 3.492f, 0.84f)
                curveToRelative(4.548f, -0.038f, 8.22f, -3.892f, 8.22f, -8.628f)
                curveToRelative(0.0f, -4.736f, -3.672f, -8.59f, -8.18f, -8.59f)
                close()
                moveTo(11.848f, 16.014f)
                curveToRelative(0.402f, 0.0f, 0.728f, 0.342f, 0.728f, 0.764f)
                reflectiveCurveToRelative(-0.326f, 0.764f, -0.728f, 0.764f)
                curveToRelative(-0.402f, 0.0f, -0.728f, -0.342f, -0.728f, -0.764f)
                reflectiveCurveToRelative(0.326f, -0.764f, 0.728f, -0.764f)
                close()
                moveTo(12.136f, 6.547f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, 2.436f, 1.26f)
                curveToRelative(0.692f, 0.952f, 0.8f, 2.67f, -0.108f, 3.627f)
                lineToRelative(-0.98f, 1.028f)
                curveToRelative(-0.508f, 0.533f, -0.8f, 1.26f, -0.8f, 2.062f)
                curveToRelative(-0.072f, 0.457f, -0.4f, 0.801f, -0.8f, 0.801f)
                reflectiveCurveToRelative(-0.728f, -0.344f, -0.728f, -0.764f)
                curveToRelative(0.0f, -1.184f, 0.436f, -2.292f, 1.236f, -3.132f)
                lineToRelative(0.98f, -1.028f)
                curveToRelative(0.364f, -0.382f, 0.292f, -1.222f, 0.0f, -1.642f)
                curveToRelative(-0.292f, -0.42f, -0.8f, -0.688f, -1.272f, -0.688f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-0.508f, 0.0f, -0.98f, 0.306f, -1.236f, 0.764f)
                curveToRelative(-0.216f, 0.382f, -0.656f, 0.495f, -0.98f, 0.269f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.256f, -1.029f)
                arcToRelative(2.868f, 2.868f, 0.0f, false, true, 2.508f, -1.528f)
                horizontalLineToRelative(0.184f)
                close()
            }
        }
        .build()
        return _userSupportRegular!!
    }

private var _userSupportRegular: ImageVector? = null
