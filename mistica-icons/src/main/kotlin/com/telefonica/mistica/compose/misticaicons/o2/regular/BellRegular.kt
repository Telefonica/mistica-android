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

public val RegularGroup.BellRegular: ImageVector
    get() {
        if (_bellRegular != null) {
            return _bellRegular!!
        }
        _bellRegular = Builder(name = "BellRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.847f, 18.208f)
                arcToRelative(11.275f, 11.275f, 0.0f, false, true, -2.153f, -6.6f)
                verticalLineToRelative(-2.75f)
                curveTo(19.694f, 4.538f, 16.23f, 1.0f, 12.002f, 1.0f)
                curveTo(7.772f, 1.0f, 4.31f, 4.538f, 4.31f, 8.858f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 2.359f, -0.77f, 4.713f, -2.153f, 6.6f)
                curveToRelative(-0.194f, 0.238f, -0.194f, 0.55f, -0.078f, 0.828f)
                curveToRelative(0.117f, 0.277f, 0.384f, 0.43f, 0.694f, 0.43f)
                horizontalLineToRelative(6.193f)
                curveToRelative(0.0f, 0.12f, -0.039f, 0.278f, -0.039f, 0.392f)
                curveToRelative(0.0f, 1.73f, 1.382f, 3.142f, 3.075f, 3.142f)
                curveToRelative(1.693f, 0.0f, 3.075f, -1.412f, 3.075f, -3.142f)
                curveToRelative(0.0f, -0.118f, 0.0f, -0.277f, -0.039f, -0.391f)
                horizontalLineToRelative(6.189f)
                curveToRelative(0.306f, 0.0f, 0.577f, -0.159f, 0.693f, -0.431f)
                curveToRelative(0.117f, -0.273f, 0.117f, -0.594f, -0.073f, -0.828f)
                close()
                moveTo(13.539f, 19.858f)
                curveToRelative(0.0f, 0.863f, -0.693f, 1.571f, -1.537f, 1.571f)
                reflectiveCurveToRelative(-1.538f, -0.708f, -1.538f, -1.57f)
                curveToRelative(0.0f, -0.12f, 0.0f, -0.278f, 0.04f, -0.392f)
                horizontalLineToRelative(2.958f)
                curveToRelative(0.077f, 0.114f, 0.077f, 0.273f, 0.077f, 0.391f)
                close()
                moveTo(4.2f, 17.892f)
                arcToRelative(12.782f, 12.782f, 0.0f, false, false, 1.653f, -6.288f)
                verticalLineToRelative(-2.75f)
                curveToRelative(0.0f, -3.458f, 2.77f, -6.288f, 6.154f, -6.288f)
                curveToRelative(3.385f, 0.0f, 6.15f, 2.834f, 6.15f, 6.292f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 2.2f, 0.577f, 4.4f, 1.654f, 6.288f)
                lineTo(4.198f, 17.896f)
                verticalLineToRelative(-0.004f)
                close()
            }
        }
        .build()
        return _bellRegular!!
    }

private var _bellRegular: ImageVector? = null
