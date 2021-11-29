package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.TechServiceFilled: ImageVector
    get() {
        if (_techServiceFilled != null) {
            return _techServiceFilled!!
        }
        _techServiceFilled = Builder(name = "TechServiceFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.483f, 6.99f)
                lineToRelative(-0.393f, -1.055f)
                lineToRelative(-5.03f, 5.271f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.927f, 0.0f)
                lineTo(13.21f, 9.19f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.193f, -0.483f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.193f, -0.483f)
                lineToRelative(5.031f, -5.27f)
                lineToRelative(-1.006f, -0.413f)
                curveToRelative(-2.778f, -1.138f, -5.937f, -0.449f, -8.046f, 1.76f)
                curveToRelative(-2.0f, 2.096f, -2.694f, 5.17f, -1.836f, 7.968f)
                lineTo(2.0f, 17.88f)
                lineTo(6.803f, 23.0f)
                lineToRelative(5.396f, -5.653f)
                curveToRelative(2.666f, 0.899f, 5.608f, 0.172f, 7.604f, -1.924f)
                curveToRelative(2.11f, -2.213f, 2.767f, -5.519f, 1.68f, -8.434f)
            }
        }
        .build()
        return _techServiceFilled!!
    }

private var _techServiceFilled: ImageVector? = null
