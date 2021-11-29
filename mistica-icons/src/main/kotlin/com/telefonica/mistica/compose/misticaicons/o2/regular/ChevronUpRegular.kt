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

public val RegularGroup.ChevronUpRegular: ImageVector
    get() {
        if (_chevronUpRegular != null) {
            return _chevronUpRegular!!
        }
        _chevronUpRegular = Builder(name = "ChevronUpRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.467f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, -0.173f, 0.374f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.8f, 0.0f)
                lineTo(12.0f, 9.277f)
                lineTo(4.97f, 15.84f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.8f, 0.0f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, true, 0.0f, -0.747f)
                lineToRelative(7.428f, -6.935f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, 0.8f, 0.0f)
                lineToRelative(7.428f, 6.935f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.173f, 0.373f)
                close()
            }
        }
        .build()
        return _chevronUpRegular!!
    }

private var _chevronUpRegular: ImageVector? = null
