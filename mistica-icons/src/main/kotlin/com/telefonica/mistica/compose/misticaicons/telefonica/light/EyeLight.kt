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
                moveTo(12.027f, 17.2f)
                curveToRelative(3.967f, 0.0f, 8.014f, -4.12f, 9.004f, -5.196f)
                curveToRelative(-0.993f, -1.076f, -5.065f, -5.198f, -9.03f, -5.198f)
                curveToRelative(-3.966f, 0.0f, -8.033f, 4.12f, -9.028f, 5.198f)
                curveToRelative(0.998f, 1.074f, 5.09f, 5.196f, 9.054f, 5.196f)
                close()
                moveTo(21.905f, 11.747f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.003f, 0.508f)
                curveToRelative(-0.2f, 0.235f, -4.946f, 5.745f, -9.88f, 5.745f)
                curveToRelative(-4.932f, 0.0f, -9.73f, -5.507f, -9.932f, -5.742f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, true, 0.0f, -0.51f)
                curveTo(2.296f, 11.511f, 7.067f, 6.0f, 12.002f, 6.0f)
                curveToRelative(4.928f, 0.003f, 9.7f, 5.512f, 9.903f, 5.747f)
                close()
                moveTo(12.107f, 9.611f)
                curveToRelative(0.507f, 0.011f, 2.467f, 0.202f, 2.467f, 2.475f)
                curveToRelative(0.0f, 2.275f, -1.966f, 2.453f, -2.458f, 2.464f)
                curveToRelative(-0.072f, 0.0f, -0.157f, 0.003f, -0.237f, 0.0f)
                curveToRelative(-0.518f, -0.005f, -2.458f, -0.186f, -2.458f, -2.478f)
                curveToRelative(0.0f, -2.289f, 1.923f, -2.458f, 2.438f, -2.46f)
                curveToRelative(0.086f, -0.004f, 0.174f, -0.004f, 0.248f, 0.0f)
                close()
            }
        }
        .build()
        return _eyeLight!!
    }

private var _eyeLight: ImageVector? = null
