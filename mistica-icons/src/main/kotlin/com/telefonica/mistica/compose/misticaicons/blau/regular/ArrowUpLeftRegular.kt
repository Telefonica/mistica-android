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

public val RegularGroup.ArrowUpLeftRegular: ImageVector
    get() {
        if (_arrowUpLeftRegular != null) {
            return _arrowUpLeftRegular!!
        }
        _arrowUpLeftRegular = Builder(name = "ArrowUpLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.574f, 20.08f)
                    lineTo(8.393f, 10.9f)
                    lineToRelative(-5.06f, 5.06f)
                    lineTo(3.333f, 3.356f)
                    horizontalLineToRelative(12.602f)
                    lineToRelative(-5.059f, 5.06f)
                    lineToRelative(9.18f, 9.18f)
                    lineToRelative(-2.482f, 2.483f)
                    close()
                    moveTo(18.596f, 14.217f)
                    lineTo(12.795f, 8.417f)
                    lineTo(18.053f, 3.158f)
                    lineTo(17.574f, 2.0f)
                    lineTo(1.976f, 2.0f)
                    verticalLineToRelative(15.598f)
                    lineToRelative(1.158f, 0.48f)
                    lineToRelative(5.258f, -5.26f)
                    lineTo(17.574f, 22.0f)
                    lineToRelative(4.402f, -4.402f)
                    lineToRelative(-3.38f, -3.38f)
                    close()
                }
            }
        }
        .build()
        return _arrowUpLeftRegular!!
    }

private var _arrowUpLeftRegular: ImageVector? = null
