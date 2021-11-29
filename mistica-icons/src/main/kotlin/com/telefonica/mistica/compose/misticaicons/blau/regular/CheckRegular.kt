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

public val RegularGroup.CheckRegular: ImageVector
    get() {
        if (_checkRegular != null) {
            return _checkRegular!!
        }
        _checkRegular = Builder(name = "CheckRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.978f, 4.0f)
                    lineTo(7.866f, 18.12f)
                    lineTo(3.138f, 13.392f)
                    arcToRelative(0.68f, 0.68f, 0.0f, true, false, -0.962f, 0.963f)
                    lineToRelative(5.227f, 5.227f)
                    curveToRelative(0.128f, 0.128f, 0.301f, 0.2f, 0.482f, 0.2f)
                    horizontalLineToRelative(0.012f)
                    arcToRelative(0.683f, 0.683f, 0.0f, false, false, 0.487f, -0.218f)
                    lineTo(21.976f, 4.926f)
                    lineTo(20.978f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _checkRegular!!
    }

private var _checkRegular: ImageVector? = null
