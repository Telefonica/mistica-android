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

public val RegularGroup.ArrowForwardLight: ImageVector
    get() {
        if (_arrowForwardLight != null) {
            return _arrowForwardLight!!
        }
        _arrowForwardLight = Builder(name = "ArrowForwardLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.471f, 12.38f)
                horizontalLineToRelative(14.011f)
                lineToRelative(-6.448f, 6.783f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.208f, 0.829f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, 0.473f, -0.19f)
                lineToRelative(7.201f, -7.573f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, 0.048f, -0.066f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.0f, -0.075f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, 0.0f, -0.357f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.0f, -0.075f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, false, -0.048f, -0.075f)
                lineToRelative(-7.069f, -7.43f)
                arcToRelative(0.454f, 0.454f, 0.0f, false, false, -0.35f, -0.15f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.33f, 0.79f)
                lineToRelative(6.315f, 6.65f)
                horizontalLineTo(4.472f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.472f, 0.47f)
                curveToRelative(0.0f, 0.257f, 0.212f, 0.469f, 0.471f, 0.469f)
                curveToRelative(0.0f, -0.003f, 0.0f, -0.003f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowForwardLight!!
    }

private var _arrowForwardLight: ImageVector? = null
