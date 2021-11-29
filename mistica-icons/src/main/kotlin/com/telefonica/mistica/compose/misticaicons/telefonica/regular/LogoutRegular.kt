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

public val RegularGroup.LogoutRegular: ImageVector
    get() {
        if (_logoutRegular != null) {
            return _logoutRegular!!
        }
        _logoutRegular = Builder(name = "LogoutRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.823f, 2.0f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, true, 3.67f, 3.67f)
                verticalLineToRelative(12.16f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, true, -3.67f, 3.67f)
                horizontalLineToRelative(-8.16f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, true, -3.67f, -3.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                curveToRelative(0.0f, 1.196f, 0.974f, 2.17f, 2.17f, 2.17f)
                horizontalLineToRelative(8.16f)
                curveToRelative(1.197f, 0.0f, 2.17f, -0.974f, 2.17f, -2.17f)
                verticalLineTo(5.67f)
                curveToRelative(0.0f, -1.196f, -0.973f, -2.17f, -2.17f, -2.17f)
                horizontalLineToRelative(-8.16f)
                curveToRelative(-1.196f, 0.0f, -2.17f, 0.974f, -2.17f, 2.17f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                arcTo(3.674f, 3.674f, 0.0f, false, true, 8.663f, 2.0f)
                horizontalLineToRelative(8.16f)
                close()
                moveTo(6.265f, 8.218f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(4.543f, 11.0f)
                horizontalLineToRelative(7.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(4.592f)
                lineToRelative(1.698f, 1.683f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.054f, 1.066f)
                lineToRelative(-3.013f, -2.983f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.003f, -1.064f)
                lineToRelative(2.984f, -2.984f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 0.0f)
                close()
            }
        }
        .build()
        return _logoutRegular!!
    }

private var _logoutRegular: ImageVector? = null
