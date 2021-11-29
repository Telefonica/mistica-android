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

public val LightGroup.UserAccountLight: ImageVector
    get() {
        if (_userAccountLight != null) {
            return _userAccountLight!!
        }
        _userAccountLight = Builder(name = "UserAccountLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.881f, 18.582f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, false, 0.146f, -0.473f)
                curveToRelative(-1.11f, -2.166f, -3.488f, -3.72f, -6.363f, -4.274f)
                curveToRelative(2.176f, -0.932f, 3.706f, -3.125f, 3.706f, -5.679f)
                curveTo(18.37f, 4.761f, 15.66f, 2.0f, 12.325f, 2.0f)
                curveTo(8.991f, 2.0f, 6.281f, 4.76f, 6.281f, 8.156f)
                curveToRelative(0.0f, 2.554f, 1.53f, 4.747f, 3.71f, 5.679f)
                curveTo(5.976f, 14.619f, 3.0f, 17.375f, 3.0f, 20.649f)
                curveToRelative(0.0f, 0.193f, 0.155f, 0.351f, 0.345f, 0.351f)
                curveToRelative(0.19f, 0.0f, 0.345f, -0.158f, 0.345f, -0.351f)
                curveToRelative(0.0f, -3.49f, 3.873f, -6.332f, 8.635f, -6.332f)
                curveToRelative(3.577f, 0.0f, 6.827f, 1.657f, 8.088f, 4.12f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, 0.468f, 0.145f)
                close()
                moveTo(6.971f, 8.156f)
                curveToRelative(0.0f, -3.008f, 2.4f, -5.453f, 5.354f, -5.453f)
                reflectiveCurveToRelative(5.355f, 2.445f, 5.355f, 5.453f)
                curveToRelative(0.0f, 3.008f, -2.401f, 5.454f, -5.355f, 5.454f)
                curveToRelative(-2.953f, 0.0f, -5.354f, -2.446f, -5.354f, -5.454f)
                close()
                moveTo(22.0f, 20.293f)
                curveToRelative(0.0f, 0.387f, -0.31f, 0.702f, -0.69f, 0.702f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, -0.69f, -0.702f)
                curveToRelative(0.0f, -0.387f, 0.31f, -0.703f, 0.69f, -0.703f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.316f, 0.69f, 0.703f)
                close()
            }
        }
        .build()
        return _userAccountLight!!
    }

private var _userAccountLight: ImageVector? = null
