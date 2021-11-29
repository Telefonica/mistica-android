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

public val FilledGroup.RouterFilled: ImageVector
    get() {
        if (_routerFilled != null) {
            return _routerFilled!!
        }
        _routerFilled = Builder(name = "RouterFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.465f, 2.0f, 2.0f, 6.465f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.465f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.465f, 10.0f, -10.0f)
                reflectiveCurveTo(17.535f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.93f, 15.748f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.534f, 0.534f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.535f, -0.534f)
                verticalLineToRelative(-0.86f)
                lineTo(7.22f, 17.53f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.393f, 0.142f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.393f, -0.142f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, 0.0f, -0.75f)
                lineToRelative(2.642f, -2.641f)
                horizontalLineToRelative(-0.86f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.534f, -0.535f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, -0.535f)
                horizontalLineToRelative(2.715f)
                verticalLineToRelative(2.679f)
                close()
                moveTo(10.784f, 10.784f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.393f, 0.142f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.393f, -0.142f)
                lineTo(7.356f, 8.106f)
                verticalLineToRelative(0.86f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.534f, 0.534f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.535f, -0.535f)
                lineTo(6.287f, 6.287f)
                horizontalLineToRelative(2.678f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, 0.535f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.535f, 0.534f)
                horizontalLineToRelative(-0.859f)
                lineToRelative(2.642f, 2.642f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.036f, 0.786f)
                close()
                moveTo(17.713f, 17.713f)
                horizontalLineToRelative(-2.678f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.535f, -0.535f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, -0.534f)
                horizontalLineToRelative(0.859f)
                lineToRelative(-2.642f, -2.642f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, 0.0f, -0.75f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, 0.75f, 0.0f)
                lineToRelative(2.642f, 2.642f)
                verticalLineToRelative(-0.86f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.534f, -0.534f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, 0.535f)
                verticalLineToRelative(2.678f)
                close()
                moveTo(17.571f, 7.215f)
                lineTo(14.893f, 9.856f)
                horizontalLineToRelative(0.855f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.534f, 0.535f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.534f, 0.535f)
                horizontalLineToRelative(-2.679f)
                lineTo(13.069f, 8.252f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, -0.534f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.535f, 0.534f)
                verticalLineToRelative(0.86f)
                lineTo(16.78f, 6.47f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, 0.75f, 0.0f)
                curveToRelative(0.219f, 0.174f, 0.219f, 0.53f, 0.04f, 0.745f)
                close()
            }
        }
        .build()
        return _routerFilled!!
    }

private var _routerFilled: ImageVector? = null
