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

public val RegularGroup.ChevronLeftRegular: ImageVector
    get() {
        if (_chevronLeftRegular != null) {
            return _chevronLeftRegular!!
        }
        _chevronLeftRegular = Builder(name = "ChevronLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.855f, 4.16f)
                    arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.0f, 0.77f)
                    lineTo(8.586f, 12.0f)
                    lineToRelative(7.27f, 7.07f)
                    arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.0f, 0.77f)
                    arcToRelative(0.571f, 0.571f, 0.0f, false, true, -0.793f, 0.0f)
                    lineTo(7.0f, 12.0f)
                    lineTo(15.063f, 4.16f)
                    arcToRelative(0.571f, 0.571f, 0.0f, false, true, 0.792f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _chevronLeftRegular!!
    }

private var _chevronLeftRegular: ImageVector? = null
