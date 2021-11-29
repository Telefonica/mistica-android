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

public val RegularGroup.ArrowDownLeftRegular: ImageVector
    get() {
        if (_arrowDownLeftRegular != null) {
            return _arrowDownLeftRegular!!
        }
        _arrowDownLeftRegular = Builder(name = "ArrowDownLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.334f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.603f)
                curveToRelative(0.0f, -0.868f, 0.492f, -1.612f, 1.288f, -1.936f)
                arcToRelative(2.196f, 2.196f, 0.0f, false, true, 2.371f, 0.476f)
                lineToRelative(2.768f, 2.768f)
                lineToRelative(7.71f, -7.704f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 1.013f, 0.0f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.0f, 1.012f)
                lineTo(8.93f, 11.431f)
                curveToRelative(-0.504f, 0.504f, -0.892f, 0.12f, -1.524f, -0.512f)
                lineToRelative(-2.76f, -2.76f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, -0.807f, -0.172f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.404f, 0.616f)
                verticalLineToRelative(11.969f)
                horizontalLineToRelative(11.91f)
                curveToRelative(0.396f, 0.0f, 0.56f, -0.292f, 0.608f, -0.42f)
                arcToRelative(0.794f, 0.794f, 0.0f, false, false, -0.16f, -0.86f)
                lineToRelative(-3.716f, -3.716f)
                lineToRelative(8.703f, -8.729f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 1.012f, 0.0f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.0f, 1.012f)
                lineToRelative(-7.71f, 7.713f)
                lineToRelative(2.71f, 2.712f)
                curveToRelative(0.633f, 0.632f, 0.817f, 1.58f, 0.477f, 2.42f)
                curveToRelative(-0.34f, 0.792f, -1.076f, 1.296f, -1.936f, 1.296f)
                close()
            }
        }
        .build()
        return _arrowDownLeftRegular!!
    }

private var _arrowDownLeftRegular: ImageVector? = null
