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

public val RegularGroup.ComputerRegular: ImageVector
    get() {
        if (_computerRegular != null) {
            return _computerRegular!!
        }
        _computerRegular = Builder(name = "ComputerRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.252f, 14.333f)
                    horizontalLineToRelative(13.334f)
                    verticalLineToRelative(-8.0f)
                    lineTo(5.252f, 6.333f)
                    verticalLineToRelative(8.0f)
                    close()
                    moveTo(19.309f, 17.0f)
                    lineToRelative(-0.928f, -1.334f)
                    lineTo(5.458f, 15.666f)
                    lineTo(4.529f, 17.0f)
                    horizontalLineToRelative(14.78f)
                    close()
                    moveTo(1.976f, 18.333f)
                    lineToRelative(1.944f, -2.79f)
                    lineTo(3.92f, 5.0f)
                    horizontalLineToRelative(15.999f)
                    verticalLineToRelative(10.542f)
                    lineToRelative(1.943f, 2.79f)
                    lineTo(1.976f, 18.332f)
                    close()
                    moveTo(11.251f, 8.333f)
                    horizontalLineToRelative(1.333f)
                    lineTo(12.584f, 7.0f)
                    lineTo(11.251f, 7.0f)
                    verticalLineToRelative(1.333f)
                    close()
                }
            }
        }
        .build()
        return _computerRegular!!
    }

private var _computerRegular: ImageVector? = null
