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

public val RegularGroup.PlugRegular: ImageVector
    get() {
        if (_plugRegular != null) {
            return _plugRegular!!
        }
        _plugRegular = Builder(name = "PlugRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.996f, 9.688f)
                curveToRelative(0.0f, -2.537f, -2.0f, -4.614f, -4.443f, -4.614f)
                curveToRelative(-2.444f, 0.0f, -4.443f, 2.077f, -4.443f, 4.614f)
                verticalLineToRelative(7.693f)
                curveToRelative(0.0f, 1.653f, -1.484f, 3.078f, -3.148f, 3.078f)
                curveTo(8.335f, 20.459f, 7.0f, 19.076f, 7.0f, 17.381f)
                verticalLineToRelative(-1.923f)
                curveToRelative(2.036f, -0.386f, 3.52f, -2.23f, 3.52f, -4.424f)
                verticalLineTo(5.842f)
                horizontalLineTo(8.854f)
                verticalLineTo(2.768f)
                curveToRelative(0.0f, -0.423f, -0.336f, -0.768f, -0.74f, -0.768f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, false, -0.744f, 0.768f)
                verticalLineToRelative(3.078f)
                horizontalLineTo(5.147f)
                verticalLineTo(2.768f)
                curveToRelative(0.0f, -0.423f, -0.336f, -0.768f, -0.74f, -0.768f)
                arcToRelative(0.761f, 0.761f, 0.0f, false, false, -0.743f, 0.768f)
                verticalLineToRelative(3.078f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(5.192f)
                curveToRelative(0.0f, 2.194f, 1.484f, 4.038f, 3.52f, 4.424f)
                verticalLineToRelative(1.923f)
                curveTo(5.52f, 19.923f, 7.518f, 22.0f, 9.961f, 22.0f)
                curveToRelative(2.52f, 0.0f, 4.631f, -2.114f, 4.631f, -4.615f)
                verticalLineTo(9.688f)
                curveToRelative(0.0f, -1.69f, 1.332f, -3.077f, 2.964f, -3.077f)
                reflectiveCurveToRelative(2.963f, 1.383f, 2.963f, 3.077f)
                verticalLineToRelative(7.307f)
                curveToRelative(0.0f, 0.423f, 0.336f, 0.768f, 0.74f, 0.768f)
                curveToRelative(0.408f, 0.0f, 0.74f, -0.349f, 0.74f, -0.768f)
                lineToRelative(-0.004f, -7.307f)
                close()
                moveTo(3.484f, 11.034f)
                verticalLineTo(7.38f)
                horizontalLineToRelative(5.555f)
                verticalLineToRelative(3.655f)
                curveToRelative(0.0f, 1.579f, -1.26f, 2.883f, -2.776f, 2.883f)
                curveToRelative(-1.516f, 0.0f, -2.78f, -1.304f, -2.78f, -2.883f)
                close()
            }
        }
        .build()
        return _plugRegular!!
    }

private var _plugRegular: ImageVector? = null
