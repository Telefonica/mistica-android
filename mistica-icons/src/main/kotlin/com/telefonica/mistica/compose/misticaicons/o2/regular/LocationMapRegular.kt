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

public val RegularGroup.LocationMapRegular: ImageVector
    get() {
        if (_locationMapRegular != null) {
            return _locationMapRegular!!
        }
        _locationMapRegular = Builder(name = "LocationMapRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.602f, 4.962f)
                curveTo(19.174f, 2.704f, 17.308f, 1.0f, 15.077f, 1.0f)
                curveToRelative(-2.23f, 0.0f, -4.096f, 1.704f, -4.525f, 3.962f)
                lineTo(2.0f, 4.962f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 4.962f)
                horizontalLineToRelative(-2.398f)
                close()
                moveTo(15.077f, 2.582f)
                curveToRelative(1.699f, 0.0f, 3.078f, 1.512f, 3.078f, 3.369f)
                curveToRelative(0.0f, 1.253f, -1.69f, 4.413f, -3.078f, 6.67f)
                curveTo(13.69f, 10.369f, 12.0f, 7.204f, 12.0f, 5.951f)
                curveToRelative(0.0f, -1.857f, 1.379f, -3.368f, 3.077f, -3.368f)
                close()
                moveTo(3.537f, 9.66f)
                curveToRelative(0.452f, 0.223f, 0.767f, 0.695f, 0.767f, 1.248f)
                verticalLineToRelative(1.186f)
                curveToRelative(0.0f, 0.041f, 0.005f, 0.082f, 0.01f, 0.122f)
                curveToRelative(0.256f, 1.705f, 1.753f, 2.161f, 2.96f, 2.526f)
                curveToRelative(1.447f, 0.442f, 2.033f, 0.72f, 2.033f, 1.715f)
                lineTo(9.307f, 17.8f)
                arcToRelative(4.217f, 4.217f, 0.0f, false, false, 0.975f, 2.617f)
                lineTo(3.536f, 20.417f)
                lineTo(3.536f, 9.66f)
                close()
                moveTo(20.464f, 20.418f)
                horizontalLineToRelative(-6.539f)
                curveToRelative(-1.482f, 0.0f, -3.077f, -0.867f, -3.077f, -2.774f)
                verticalLineToRelative(-1.187f)
                curveToRelative(0.0f, -2.278f, -1.812f, -2.83f, -3.137f, -3.231f)
                curveToRelative(-1.196f, -0.366f, -1.747f, -0.594f, -1.866f, -1.197f)
                verticalLineToRelative(-1.121f)
                curveToRelative(0.0f, -1.436f, -0.994f, -2.638f, -2.309f, -2.912f)
                lineTo(3.536f, 6.549f)
                horizontalLineToRelative(6.987f)
                curveToRelative(0.463f, 2.623f, 3.54f, 7.396f, 3.92f, 7.974f)
                curveToRelative(0.142f, 0.218f, 0.383f, 0.35f, 0.64f, 0.35f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, 0.64f, -0.35f)
                curveToRelative(0.374f, -0.578f, 3.456f, -5.351f, 3.919f, -7.974f)
                horizontalLineToRelative(0.827f)
                verticalLineToRelative(13.868f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(17.1f, 5.555f)
                curveToRelative(0.0f, -1.151f, -0.91f, -2.085f, -2.024f, -2.085f)
                curveToRelative(-1.117f, 0.0f, -2.023f, 0.939f, -2.023f, 2.085f)
                reflectiveCurveToRelative(0.906f, 2.085f, 2.023f, 2.085f)
                curveToRelative(1.118f, 0.0f, 2.024f, -0.933f, 2.024f, -2.085f)
                close()
                moveTo(15.076f, 6.453f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, -0.871f, -0.898f)
                curveToRelative(0.0f, -0.497f, 0.389f, -0.898f, 0.871f, -0.898f)
                curveToRelative(0.483f, 0.0f, 0.872f, 0.401f, 0.872f, 0.898f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, -0.872f, 0.898f)
                close()
            }
        }
        .build()
        return _locationMapRegular!!
    }

private var _locationMapRegular: ImageVector? = null
