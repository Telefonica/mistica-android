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

public val RegularGroup.AlertRegular: ImageVector
    get() {
        if (_alertRegular != null) {
            return _alertRegular!!
        }
        _alertRegular = Builder(name = "AlertRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.894f, 19.9f)
                lineTo(12.608f, 3.366f)
                curveTo(12.466f, 3.146f, 12.251f, 3.0f, 12.0f, 3.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.608f, 0.367f)
                lineTo(2.106f, 19.899f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, false, 0.0f, 0.734f)
                curveToRelative(0.142f, 0.221f, 0.357f, 0.367f, 0.608f, 0.367f)
                horizontalLineToRelative(18.572f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.608f, -0.367f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, false, 0.0f, -0.734f)
                close()
                moveTo(3.963f, 19.533f)
                lineTo(12.0f, 5.2f)
                lineToRelative(6.25f, 11.133f)
                lineToRelative(1.787f, 3.199f)
                lineTo(3.963f, 19.532f)
                close()
                moveTo(12.0f, 8.69f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, -0.713f, 0.734f)
                verticalLineToRelative(5.696f)
                curveToRelative(0.0f, 0.404f, 0.32f, 0.733f, 0.713f, 0.733f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.329f, 0.713f, -0.733f)
                lineTo(12.713f, 9.43f)
                curveToRelative(0.0f, -0.405f, -0.32f, -0.739f, -0.713f, -0.739f)
                close()
                moveTo(12.0f, 16.959f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, -0.713f, 0.733f)
                curveToRelative(0.0f, 0.405f, 0.32f, 0.734f, 0.713f, 0.734f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.329f, 0.713f, -0.734f)
                arcTo(0.725f, 0.725f, 0.0f, false, false, 12.0f, 16.96f)
                close()
            }
        }
        .build()
        return _alertRegular!!
    }

private var _alertRegular: ImageVector? = null
