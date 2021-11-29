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

public val RegularGroup.ChevronRightRegular: ImageVector
    get() {
        if (_chevronRightRegular != null) {
            return _chevronRightRegular!!
        }
        _chevronRightRegular = Builder(name = "ChevronRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.533f, 20.0f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, -0.374f, -0.173f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.0f, -0.8f)
                lineTo(14.723f, 12.0f)
                lineTo(8.16f, 4.97f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.0f, -0.8f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, true, 0.747f, 0.0f)
                lineToRelative(6.935f, 7.428f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.0f, 0.8f)
                lineToRelative(-6.935f, 7.428f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, -0.373f, 0.173f)
                close()
            }
        }
        .build()
        return _chevronRightRegular!!
    }

private var _chevronRightRegular: ImageVector? = null
