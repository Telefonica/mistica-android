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

public val RegularGroup.ArrowUpLeftRegular: ImageVector
    get() {
        if (_arrowUpLeftRegular != null) {
            return _arrowUpLeftRegular!!
        }
        _arrowUpLeftRegular = Builder(name = "ArrowUpLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.734f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -1.196f, 0.496f)
                lineToRelative(-8.916f, -8.915f)
                lineTo(15.6f, 4.604f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.152f, -0.764f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, false, -0.648f, -0.436f)
                horizontalLineToRelative(-11.7f)
                verticalLineToRelative(11.694f)
                curveToRelative(0.0f, 0.436f, 0.332f, 0.608f, 0.436f, 0.648f)
                curveToRelative(0.1f, 0.044f, 0.456f, 0.156f, 0.764f, -0.152f)
                lineToRelative(3.712f, -3.711f)
                lineToRelative(8.916f, 8.918f)
                arcToRelative(0.701f, 0.701f, 0.0f, true, true, -0.992f, 0.992f)
                lineTo(8.316f, 13.87f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(2.072f, 2.072f, 0.0f, false, true, -2.292f, 0.456f)
                arcTo(2.076f, 2.076f, 0.0f, false, true, 2.0f, 15.098f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(13.1f)
                curveToRelative(0.868f, 0.0f, 1.612f, 0.5f, 1.944f, 1.3f)
                curveToRelative(0.332f, 0.8f, 0.156f, 1.68f, -0.456f, 2.295f)
                lineToRelative(-2.72f, 2.72f)
                lineToRelative(7.928f, 7.923f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.204f, 0.496f)
                close()
            }
        }
        .build()
        return _arrowUpLeftRegular!!
    }

private var _arrowUpLeftRegular: ImageVector? = null
