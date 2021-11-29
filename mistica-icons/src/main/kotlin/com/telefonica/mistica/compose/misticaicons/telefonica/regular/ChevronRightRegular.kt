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
                moveTo(9.839f, 20.0f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, true, -0.617f, -0.285f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, 0.048f, -1.256f)
                lineToRelative(6.651f, -6.518f)
                lineToRelative(-6.646f, -6.392f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, -0.055f, -1.257f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, 1.163f, -0.08f)
                lineToRelative(0.02f, 0.018f)
                lineToRelative(7.323f, 7.046f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, true, 0.274f, 0.654f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, true, -0.268f, 0.658f)
                lineToRelative(-7.325f, 7.175f)
                arcTo(0.803f, 0.803f, 0.0f, false, true, 9.84f, 20.0f)
            }
        }
        .build()
        return _chevronRightRegular!!
    }

private var _chevronRightRegular: ImageVector? = null
