package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.ChevronUpRegular: ImageVector
    get() {
        if (_chevronUpRegular != null) {
            return _chevronUpRegular!!
        }
        _chevronUpRegular = Builder(name = "ChevronUpRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(2.176f, 17.764f)
                    arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.963f, 0.0f)
                    lineToRelative(8.837f, -8.837f)
                    lineToRelative(8.837f, 8.837f)
                    arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.963f, -0.964f)
                    lineTo(11.976f, 7.0f)
                    lineToRelative(-9.8f, 9.8f)
                    arcToRelative(0.682f, 0.682f, 0.0f, false, false, 0.0f, 0.964f)
                    close()
                }
            }
        }
        .build()
        return _chevronUpRegular!!
    }

private var _chevronUpRegular: ImageVector? = null
