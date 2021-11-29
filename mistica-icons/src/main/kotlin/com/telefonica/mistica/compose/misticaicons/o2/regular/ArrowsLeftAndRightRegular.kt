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

public val RegularGroup.ArrowsLeftAndRightRegular: ImageVector
    get() {
        if (_arrowsLeftAndRightRegular != null) {
            return _arrowsLeftAndRightRegular!!
        }
        _arrowsLeftAndRightRegular = Builder(name = "ArrowsLeftAndRightRegular", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.893f, 19.0f)
                curveToRelative(-0.396f, 0.0f, -0.752f, -0.15f, -1.036f, -0.448f)
                lineTo(2.0f, 13.398f)
                lineToRelative(4.857f, -5.23f)
                curveToRelative(0.428f, -0.448f, 1.108f, -0.56f, 1.712f, -0.297f)
                curveToRelative(0.572f, 0.264f, 0.965f, 0.787f, 0.965f, 1.386f)
                verticalLineToRelative(1.532f)
                horizontalLineToRelative(6.429f)
                verticalLineToRelative(2.914f)
                curveToRelative(0.036f, 0.038f, 0.18f, 0.076f, 0.216f, 0.076f)
                lineToRelative(3.893f, -4.112f)
                lineToRelative(-3.93f, -4.183f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, -0.215f, 0.076f)
                verticalLineToRelative(2.99f)
                horizontalLineTo(10.93f)
                curveToRelative(-0.396f, 0.0f, -0.712f, -0.34f, -0.712f, -0.746f)
                curveToRelative(0.0f, -0.41f, 0.324f, -0.745f, 0.712f, -0.745f)
                horizontalLineToRelative(3.568f)
                verticalLineTo(5.526f)
                curveToRelative(0.0f, -0.599f, 0.357f, -1.122f, 0.965f, -1.386f)
                curveToRelative(0.608f, -0.263f, 1.284f, -0.15f, 1.712f, 0.298f)
                lineTo(22.0f, 9.663f)
                lineToRelative(-4.857f, 5.154f)
                curveToRelative(-0.428f, 0.448f, -1.108f, 0.561f, -1.712f, 0.297f)
                curveToRelative(-0.572f, -0.263f, -0.928f, -0.787f, -0.928f, -1.385f)
                verticalLineTo(12.27f)
                horizontalLineTo(8.069f)
                verticalLineTo(9.282f)
                arcToRelative(0.496f, 0.496f, 0.0f, false, false, -0.216f, -0.075f)
                lineTo(3.96f, 13.389f)
                lineToRelative(3.893f, 4.112f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, 0.216f, -0.075f)
                verticalLineToRelative(-2.914f)
                horizontalLineToRelative(4.997f)
                curveToRelative(0.396f, 0.0f, 0.712f, 0.339f, 0.712f, 0.745f)
                curveToRelative(0.0f, 0.406f, -0.324f, 0.745f, -0.712f, 0.745f)
                horizontalLineTo(9.497f)
                verticalLineToRelative(1.457f)
                curveToRelative(0.0f, 0.599f, -0.356f, 1.122f, -0.964f, 1.386f)
                arcToRelative(1.246f, 1.246f, 0.0f, false, true, -0.64f, 0.155f)
                close()
            }
        }
        .build()
        return _arrowsLeftAndRightRegular!!
    }

private var _arrowsLeftAndRightRegular: ImageVector? = null
