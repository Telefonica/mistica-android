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

public val RegularGroup.ChevronDownRegular: ImageVector
    get() {
        if (_chevronDownRegular != null) {
            return _chevronDownRegular!!
        }
        _chevronDownRegular = Builder(name = "ChevronDownRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.533f)
                curveToRelative(0.0f, -0.135f, 0.058f, -0.266f, 0.173f, -0.374f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.8f, 0.0f)
                lineTo(12.0f, 14.723f)
                lineTo(19.03f, 8.16f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.8f, 0.0f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, true, 0.0f, 0.747f)
                lineToRelative(-7.428f, 6.935f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.8f, 0.0f)
                lineTo(4.173f, 8.906f)
                arcTo(0.503f, 0.503f, 0.0f, false, true, 4.0f, 8.533f)
                close()
            }
        }
        .build()
        return _chevronDownRegular!!
    }

private var _chevronDownRegular: ImageVector? = null
