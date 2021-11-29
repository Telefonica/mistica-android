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

public val LightGroup.EyeLight: ImageVector
    get() {
        if (_eyeLight != null) {
            return _eyeLight!!
        }
        _eyeLight = Builder(name = "EyeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.036f, 5.0f)
                curveToRelative(2.792f, 0.0f, 5.44f, 1.11f, 7.472f, 3.134f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, true, 0.0f, 0.536f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.508f, 0.0f)
                curveToRelative(-1.92f, -1.873f, -4.388f, -2.907f, -7.0f, -2.907f)
                curveToRelative(-2.32f, 0.0f, -4.497f, 0.802f, -6.309f, 2.295f)
                curveToRelative(-1.236f, 1.038f, -2.252f, 2.413f, -2.94f, 3.944f)
                curveToRelative(1.668f, 3.788f, 5.296f, 6.235f, 9.285f, 6.235f)
                curveToRelative(3.952f, 0.0f, 7.58f, -2.447f, 9.284f, -6.235f)
                curveToRelative(0.072f, -0.19f, 0.292f, -0.266f, 0.472f, -0.19f)
                curveToRelative(0.18f, 0.076f, 0.252f, 0.308f, 0.18f, 0.498f)
                curveTo(20.16f, 16.402f, 16.28f, 19.0f, 12.036f, 19.0f)
                curveToRelative(-4.317f, 0.0f, -8.233f, -2.679f, -10.009f, -6.846f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, true, 0.0f, -0.308f)
                curveToRelative(0.724f, -1.721f, 1.848f, -3.252f, 3.264f, -4.4f)
                curveTo(7.251f, 5.84f, 9.571f, 5.0f, 12.036f, 5.0f)
                close()
                moveTo(12.0f, 7.413f)
                curveToRelative(2.392f, 0.0f, 4.352f, 2.067f, 4.352f, 4.59f)
                curveToRelative(0.0f, 2.522f, -1.96f, 4.588f, -4.352f, 4.588f)
                curveToRelative(-2.392f, 0.0f, -4.353f, -2.066f, -4.353f, -4.589f)
                curveToRelative(0.0f, -2.522f, 1.96f, -4.59f, 4.353f, -4.59f)
                close()
                moveTo(12.0f, 8.176f)
                curveToRelative(-1.996f, 0.0f, -3.629f, 1.721f, -3.629f, 3.826f)
                reflectiveCurveToRelative(1.633f, 3.826f, 3.629f, 3.826f)
                reflectiveCurveToRelative(3.628f, -1.721f, 3.628f, -3.826f)
                reflectiveCurveTo(13.996f, 8.176f, 12.0f, 8.176f)
                close()
                moveTo(20.704f, 9.328f)
                curveToRelative(0.4f, 0.0f, 0.724f, 0.342f, 0.724f, 0.763f)
                curveToRelative(0.0f, 0.422f, -0.324f, 0.764f, -0.724f, 0.764f)
                curveToRelative(-0.4f, 0.0f, -0.724f, -0.342f, -0.724f, -0.764f)
                curveToRelative(0.0f, -0.421f, 0.324f, -0.763f, 0.724f, -0.763f)
                close()
            }
        }
        .build()
        return _eyeLight!!
    }

private var _eyeLight: ImageVector? = null
