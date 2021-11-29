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

public val RegularGroup.AddMoreCircleRegular: ImageVector
    get() {
        if (_addMoreCircleRegular != null) {
            return _addMoreCircleRegular!!
        }
        _addMoreCircleRegular = Builder(name = "AddMoreCircleRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.516f, 0.0f, 10.0f, 4.484f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.484f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.484f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.424f)
                curveToRelative(-4.728f, 0.0f, -8.576f, 3.848f, -8.576f, 8.576f)
                curveToRelative(0.0f, 4.728f, 3.848f, 8.576f, 8.576f, 8.576f)
                curveToRelative(4.728f, 0.0f, 8.576f, -3.848f, 8.576f, -8.576f)
                curveToRelative(0.0f, -4.728f, -3.848f, -8.576f, -8.576f, -8.576f)
                close()
                moveTo(11.998f, 5.224f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.716f, 0.715f)
                verticalLineToRelative(5.346f)
                lineToRelative(5.34f, 0.006f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.715f, 0.715f)
                curveToRelative(0.0f, 0.198f, -0.079f, 0.38f, -0.206f, 0.507f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, true, -0.506f, 0.206f)
                lineTo(12.71f, 12.719f)
                verticalLineToRelative(5.346f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.713f, 0.713f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.715f, -0.716f)
                verticalLineToRelative(-5.346f)
                lineTo(5.937f, 12.716f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.716f, -0.715f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.716f, -0.716f)
                horizontalLineToRelative(5.346f)
                lineTo(11.283f, 5.94f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.715f, -0.715f)
                close()
            }
        }
        .build()
        return _addMoreCircleRegular!!
    }

private var _addMoreCircleRegular: ImageVector? = null
