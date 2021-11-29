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

public val RegularGroup.LocationRegular: ImageVector
    get() {
        if (_locationRegular != null) {
            return _locationRegular!!
        }
        _locationRegular = Builder(name = "LocationRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.068f, 3.223f)
                curveToRelative(-3.769f, 0.0f, -5.85f, 2.11f, -5.862f, 5.945f)
                curveToRelative(-0.011f, 3.407f, 4.045f, 9.221f, 5.845f, 11.31f)
                curveToRelative(1.639f, -1.912f, 5.891f, -7.703f, 5.902f, -11.273f)
                curveToRelative(0.012f, -3.846f, -2.067f, -5.968f, -5.856f, -5.982f)
                horizontalLineToRelative(-0.029f)
                close()
                moveTo(12.054f, 21.99f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.427f, -0.179f)
                curveTo(10.277f, 20.441f, 4.986f, 13.528f, 5.0f, 9.165f)
                curveTo(5.014f, 4.677f, 7.657f, 2.0f, 12.068f, 2.0f)
                horizontalLineToRelative(0.032f)
                curveToRelative(4.431f, 0.014f, 7.07f, 2.708f, 7.057f, 7.208f)
                curveToRelative(-0.012f, 4.682f, -5.846f, 11.761f, -6.676f, 12.603f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.427f, 0.18f)
                close()
                moveTo(12.08f, 7.3f)
                curveToRelative(-0.97f, 0.0f, -1.445f, 0.48f, -1.445f, 1.464f)
                curveToRelative(0.0f, 0.987f, 0.472f, 1.468f, 1.445f, 1.468f)
                curveToRelative(0.972f, 0.0f, 1.445f, -0.481f, 1.445f, -1.465f)
                curveToRelative(0.0f, -0.987f, -0.475f, -1.465f, -1.445f, -1.468f)
                close()
                moveTo(12.08f, 11.458f)
                curveToRelative(-1.636f, 0.0f, -2.651f, -1.033f, -2.651f, -2.691f)
                reflectiveCurveToRelative(1.015f, -2.691f, 2.65f, -2.691f)
                curveToRelative(1.636f, 0.0f, 2.652f, 1.033f, 2.652f, 2.69f)
                curveToRelative(0.0f, 1.66f, -1.016f, 2.692f, -2.651f, 2.692f)
                close()
            }
        }
        .build()
        return _locationRegular!!
    }

private var _locationRegular: ImageVector? = null
