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

public val RegularGroup.LogoutRegular: ImageVector
    get() {
        if (_logoutRegular != null) {
            return _logoutRegular!!
        }
        _logoutRegular = Builder(name = "LogoutRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.506f, 2.0f)
                horizontalLineToRelative(-6.293f)
                curveTo(8.293f, 2.0f, 6.72f, 3.608f, 6.72f, 5.571f)
                verticalLineToRelative(5.715f)
                lineTo(4.727f, 11.286f)
                lineToRelative(0.908f, -0.928f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.0f, -1.0f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, -0.978f, 0.0f)
                lineTo(2.0f, 12.003f)
                lineToRelative(2.657f, 2.64f)
                curveToRelative(0.14f, 0.143f, 0.317f, 0.215f, 0.49f, 0.215f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, false, 0.488f, -0.216f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.0f, -1.0f)
                lineToRelative(-0.908f, -0.927f)
                horizontalLineToRelative(9.157f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.7f, -0.716f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, -0.7f, -0.716f)
                lineTo(8.12f, 11.283f)
                lineTo(8.12f, 6.643f)
                horizontalLineToRelative(10.483f)
                verticalLineToRelative(10.714f)
                lineTo(8.12f, 17.357f)
                verticalLineToRelative(-3.035f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.7f, -0.716f)
                curveToRelative(-0.384f, 0.0f, -0.7f, 0.324f, -0.7f, 0.716f)
                verticalLineToRelative(4.107f)
                curveTo(6.72f, 20.392f, 8.291f, 22.0f, 10.212f, 22.0f)
                horizontalLineToRelative(6.293f)
                curveTo(18.427f, 22.0f, 20.0f, 20.392f, 20.0f, 18.429f)
                lineTo(20.0f, 5.57f)
                curveTo(20.0f, 3.608f, 18.427f, 2.0f, 16.506f, 2.0f)
                close()
                moveTo(10.213f, 3.428f)
                horizontalLineToRelative(6.293f)
                curveToRelative(1.048f, 0.0f, 1.886f, 0.784f, 2.062f, 1.783f)
                lineTo(8.15f, 5.211f)
                curveToRelative(0.176f, -0.995f, 1.018f, -1.783f, 2.062f, -1.783f)
                close()
                moveTo(16.506f, 20.572f)
                horizontalLineToRelative(-6.293f)
                curveToRelative(-1.048f, 0.0f, -1.886f, -0.784f, -2.062f, -1.783f)
                horizontalLineToRelative(10.417f)
                curveToRelative(-0.172f, 0.995f, -1.014f, 1.783f, -2.062f, 1.783f)
                close()
            }
        }
        .build()
        return _logoutRegular!!
    }

private var _logoutRegular: ImageVector? = null
