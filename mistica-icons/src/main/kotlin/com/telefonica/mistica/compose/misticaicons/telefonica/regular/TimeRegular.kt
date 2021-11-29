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

public val RegularGroup.TimeRegular: ImageVector
    get() {
        if (_timeRegular != null) {
            return _timeRegular!!
        }
        _timeRegular = Builder(name = "TimeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 20.607f)
                curveToRelative(5.799f, 0.0f, 8.617f, -2.818f, 8.617f, -8.611f)
                curveToRelative(0.0f, -5.798f, -2.818f, -8.616f, -8.617f, -8.616f)
                curveToRelative(-5.792f, 0.0f, -8.61f, 2.818f, -8.61f, 8.616f)
                curveToRelative(0.0f, 5.793f, 2.818f, 8.61f, 8.61f, 8.61f)
                close()
                moveTo(11.99f, 2.15f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.706f, 3.622f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(12.61f, 12.01f)
                lineTo(15.458f, 14.861f)
                curveToRelative(0.25f, 0.233f, 0.263f, 0.622f, 0.03f, 0.869f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, -0.867f, 0.03f)
                lineToRelative(-0.031f, -0.03f)
                lineToRelative(-3.031f, -3.031f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, -0.18f, -0.434f)
                lineTo(11.379f, 8.164f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 1.233f, 0.0f)
                lineToRelative(-0.003f, 3.846f)
                close()
            }
        }
        .build()
        return _timeRegular!!
    }

private var _timeRegular: ImageVector? = null
