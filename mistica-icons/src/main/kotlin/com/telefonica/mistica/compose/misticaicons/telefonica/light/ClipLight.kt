package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ClipLight: ImageVector
    get() {
        if (_clipLight != null) {
            return _clipLight!!
        }
        _clipLight = Builder(name = "ClipLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.981f, 21.843f)
                curveToRelative(-2.907f, 0.0f, -4.512f, -1.457f, -4.512f, -4.107f)
                verticalLineTo(5.44f)
                curveToRelative(0.0f, -2.117f, 1.283f, -3.283f, 3.613f, -3.283f)
                curveToRelative(2.328f, 0.0f, 3.61f, 1.166f, 3.61f, 3.286f)
                verticalLineToRelative(10.65f)
                curveToRelative(0.0f, 1.557f, -0.98f, 2.454f, -2.694f, 2.454f)
                reflectiveCurveToRelative(-2.695f, -0.894f, -2.695f, -2.454f)
                verticalLineToRelative(-8.98f)
                curveToRelative(0.0f, -0.227f, 0.202f, -0.41f, 0.451f, -0.41f)
                curveToRelative(0.25f, 0.0f, 0.449f, 0.185f, 0.449f, 0.41f)
                verticalLineToRelative(8.98f)
                curveToRelative(0.0f, 1.115f, 0.571f, 1.633f, 1.792f, 1.633f)
                curveToRelative(1.224f, 0.0f, 1.793f, -0.518f, 1.793f, -1.633f)
                verticalLineTo(5.442f)
                curveToRelative(0.0f, -1.658f, -0.888f, -2.465f, -2.711f, -2.465f)
                curveToRelative(-1.824f, 0.0f, -2.712f, 0.807f, -2.712f, 2.465f)
                verticalLineToRelative(12.297f)
                curveToRelative(0.0f, 2.18f, 1.216f, 3.286f, 3.61f, 3.286f)
                curveToRelative(2.396f, 0.0f, 3.611f, -1.107f, 3.611f, -3.286f)
                lineToRelative(-0.01f, -10.633f)
                curveToRelative(0.0f, -0.227f, 0.2f, -0.41f, 0.447f, -0.41f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.25f, 0.0f, 0.451f, 0.183f, 0.451f, 0.41f)
                lineToRelative(0.014f, 10.636f)
                curveToRelative(0.003f, 2.644f, -1.602f, 4.1f, -4.51f, 4.1f)
            }
        }
        .build()
        return _clipLight!!
    }

private var _clipLight: ImageVector? = null
