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

public val RegularGroup.EcoRegular: ImageVector
    get() {
        if (_ecoRegular != null) {
            return _ecoRegular!!
        }
        _ecoRegular = Builder(name = "EcoRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.28f, 2.054f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, -0.6f, 0.0f)
                curveTo(11.467f, 2.162f, 6.0f, 4.806f, 6.0f, 11.633f)
                curveToRelative(0.0f, 5.647f, 3.81f, 7.543f, 5.293f, 8.043f)
                verticalLineToRelative(1.608f)
                curveToRelative(0.0f, 0.396f, 0.32f, 0.716f, 0.707f, 0.716f)
                curveToRelative(0.39f, 0.0f, 0.707f, -0.324f, 0.707f, -0.716f)
                verticalLineToRelative(-1.608f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 2.364f, -1.324f)
                curveTo(16.41f, 17.28f, 18.0f, 15.241f, 18.0f, 11.633f)
                curveToRelative(-0.004f, -6.827f, -5.475f, -9.471f, -5.72f, -9.579f)
                close()
                moveTo(12.703f, 18.14f)
                lineTo(12.703f, 7.701f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, -0.707f, -0.715f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, false, -0.707f, 0.715f)
                verticalLineToRelative(10.44f)
                curveToRelative(-1.377f, -0.573f, -3.88f, -2.216f, -3.88f, -6.504f)
                curveToRelative(0.004f, -5.111f, 3.533f, -7.511f, 4.591f, -8.115f)
                curveToRelative(1.058f, 0.608f, 4.587f, 3.04f, 4.587f, 8.115f)
                curveToRelative(-0.004f, 4.288f, -2.507f, 5.931f, -3.884f, 6.503f)
                close()
            }
        }
        .build()
        return _ecoRegular!!
    }

private var _ecoRegular: ImageVector? = null
