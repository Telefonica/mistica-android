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

public val RegularGroup.ArrowUpRightRegular: ImageVector
    get() {
        if (_arrowUpRightRegular != null) {
            return _arrowUpRightRegular!!
        }
        _arrowUpRightRegular = Builder(name = "ArrowUpRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.266f, 22.0f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.496f, -1.196f)
                lineToRelative(8.915f, -8.916f)
                lineToRelative(3.711f, 3.712f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.764f, 0.152f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, false, 0.436f, -0.648f)
                verticalLineToRelative(-11.7f)
                horizontalLineTo(8.902f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, -0.648f, 0.436f)
                arcToRelative(0.683f, 0.683f, 0.0f, false, false, 0.152f, 0.764f)
                lineToRelative(3.711f, 3.712f)
                lineTo(3.2f, 17.232f)
                arcToRelative(0.701f, 0.701f, 0.0f, true, true, -0.992f, -0.992f)
                lineToRelative(7.923f, -7.924f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(2.072f, 2.072f, 0.0f, false, true, -0.456f, -2.292f)
                arcTo(2.076f, 2.076f, 0.0f, false, true, 8.902f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(13.1f)
                curveToRelative(0.0f, 0.868f, -0.5f, 1.612f, -1.3f, 1.944f)
                curveToRelative(-0.8f, 0.332f, -1.68f, 0.156f, -2.295f, -0.456f)
                lineToRelative(-2.72f, -2.72f)
                lineToRelative(-7.923f, 7.928f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.496f, 0.204f)
                close()
            }
        }
        .build()
        return _arrowUpRightRegular!!
    }

private var _arrowUpRightRegular: ImageVector? = null
