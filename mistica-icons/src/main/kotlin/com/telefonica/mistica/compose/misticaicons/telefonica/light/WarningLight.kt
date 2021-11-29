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

public val LightGroup.WarningLight: ImageVector
    get() {
        if (_warningLight != null) {
            return _warningLight!!
        }
        _warningLight = Builder(name = "WarningLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.485f, 22.077f)
                curveToRelative(2.25f, -0.041f, 9.598f, -0.89f, 9.598f, -10.049f)
                curveToRelative(0.0f, -3.966f, -1.356f, -6.827f, -4.032f, -8.505f)
                curveToRelative(-2.185f, -1.371f, -4.652f, -1.571f, -5.613f, -1.596f)
                curveToRelative(-0.247f, -0.007f, -0.532f, -0.01f, -0.807f, -0.01f)
                horizontalLineToRelative(-0.204f)
                curveToRelative(-0.955f, 0.01f, -3.406f, 0.172f, -5.56f, 1.528f)
                curveToRelative(-2.623f, 1.65f, -3.95f, 4.517f, -3.95f, 8.52f)
                curveToRelative(0.0f, 4.01f, 1.343f, 6.884f, 3.991f, 8.556f)
                curveToRelative(2.173f, 1.368f, 4.643f, 1.55f, 5.604f, 1.562f)
                lineToRelative(0.328f, 0.003f)
                curveToRelative(0.226f, -0.003f, 0.451f, -0.003f, 0.645f, -0.01f)
                close()
                moveTo(12.46f, 1.009f)
                curveTo(14.614f, 1.06f, 23.0f, 1.911f, 23.0f, 12.03f)
                curveToRelative(0.0f, 10.138f, -8.396f, 10.927f, -10.496f, 10.965f)
                curveToRelative(-0.2f, 0.003f, -0.432f, 0.006f, -0.664f, 0.006f)
                curveToRelative(-0.115f, 0.0f, -0.231f, 0.0f, -0.344f, -0.003f)
                curveTo(9.286f, 22.966f, 1.0f, 22.167f, 1.0f, 11.966f)
                curveTo(1.0f, 1.776f, 9.21f, 1.019f, 11.418f, 1.0f)
                horizontalLineToRelative(0.213f)
                curveToRelative(0.281f, 0.0f, 0.576f, 0.003f, 0.83f, 0.01f)
                close()
                moveTo(11.997f, 15.679f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, -0.457f, -0.458f)
                lineTo(11.54f, 5.724f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, 0.914f, 0.0f)
                verticalLineToRelative(9.497f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, -0.457f, 0.457f)
                close()
                moveTo(12.0f, 16.845f)
                arcToRelative(0.717f, 0.717f, 0.0f, true, true, 0.0f, 1.433f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, 0.0f, -1.433f)
                close()
            }
        }
        .build()
        return _warningLight!!
    }

private var _warningLight: ImageVector? = null
