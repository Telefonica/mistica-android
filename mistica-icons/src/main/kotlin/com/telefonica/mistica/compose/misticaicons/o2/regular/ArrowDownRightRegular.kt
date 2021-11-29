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

public val RegularGroup.ArrowDownRightRegular: ImageVector
    get() {
        if (_arrowDownRightRegular != null) {
            return _arrowDownRightRegular!!
        }
        _arrowDownRightRegular = Builder(name = "ArrowDownRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.715f, 5.902f)
                curveToRelative(-0.808f, -0.35f, -1.741f, -0.152f, -2.373f, 0.5f)
                lineToRelative(-2.77f, 2.907f)
                lineToRelative(-7.71f, -8.092f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, false, -1.012f, 0.0f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, 0.0f, 1.063f)
                lineToRelative(8.318f, 8.73f)
                lineToRelative(0.128f, 0.059f)
                curveToRelative(0.436f, 0.197f, 0.568f, 0.059f, 1.288f, -0.698f)
                lineToRelative(2.762f, -2.898f)
                arcToRelative(0.697f, 0.697f, 0.0f, false, true, 0.809f, -0.177f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.404f, 0.647f)
                verticalLineToRelative(12.561f)
                horizontalLineTo(8.663f)
                curveToRelative(-0.396f, 0.0f, -0.56f, -0.306f, -0.608f, -0.44f)
                curveToRelative(-0.096f, -0.249f, -0.104f, -0.622f, 0.16f, -0.9f)
                lineToRelative(3.314f, -3.478f)
                lineToRelative(0.056f, -0.135f)
                curveToRelative(0.144f, -0.374f, 0.168f, -0.45f, -0.664f, -1.344f)
                lineToRelative(-0.777f, -0.82f)
                lineToRelative(-6.924f, -7.3f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, false, -1.013f, 0.0f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, false, 0.0f, 1.062f)
                lineToRelative(7.71f, 8.092f)
                lineToRelative(-2.715f, 2.848f)
                curveToRelative(-0.632f, 0.664f, -0.816f, 1.668f, -0.476f, 2.541f)
                curveToRelative(0.332f, 0.84f, 1.069f, 1.37f, 1.93f, 1.37f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.93f)
                curveToRelative(0.0f, -0.907f, -0.492f, -1.688f, -1.285f, -2.028f)
                close()
            }
        }
        .build()
        return _arrowDownRightRegular!!
    }

private var _arrowDownRightRegular: ImageVector? = null
