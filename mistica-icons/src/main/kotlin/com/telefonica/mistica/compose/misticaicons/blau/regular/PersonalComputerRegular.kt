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

public val RegularGroup.PersonalComputerRegular: ImageVector
    get() {
        if (_personalComputerRegular != null) {
            return _personalComputerRegular!!
        }
        _personalComputerRegular = Builder(name = "PersonalComputerRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(20.642f, 6.0f)
                    arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.666f, -0.667f)
                    horizontalLineToRelative(-16.0f)
                    arcTo(0.667f, 0.667f, 0.0f, false, false, 3.309f, 6.0f)
                    verticalLineToRelative(10.0f)
                    curveToRelative(0.0f, 0.367f, 0.299f, 0.666f, 0.667f, 0.666f)
                    horizontalLineToRelative(16.0f)
                    arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.666f, -0.666f)
                    lineTo(20.642f, 6.0f)
                    close()
                    moveTo(13.564f, 19.333f)
                    lineTo(12.897f, 18.0f)
                    lineTo(11.054f, 18.0f)
                    lineToRelative(-0.666f, 1.333f)
                    horizontalLineToRelative(3.176f)
                    close()
                    moveTo(21.975f, 6.0f)
                    verticalLineToRelative(10.0f)
                    arcToRelative(2.002f, 2.002f, 0.0f, false, true, -1.999f, 2.0f)
                    horizontalLineToRelative(-5.588f)
                    lineToRelative(1.333f, 2.666f)
                    horizontalLineToRelative(-7.49f)
                    lineTo(9.564f, 18.0f)
                    lineTo(3.976f, 18.0f)
                    curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -1.999f)
                    lineTo(1.976f, 6.0f)
                    curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                    horizontalLineToRelative(16.0f)
                    curveToRelative(1.102f, 0.0f, 1.999f, 0.897f, 1.999f, 2.0f)
                    close()
                    moveTo(17.976f, 15.333f)
                    horizontalLineToRelative(1.333f)
                    lineTo(19.309f, 14.0f)
                    horizontalLineToRelative(-1.333f)
                    verticalLineToRelative(1.333f)
                    close()
                }
            }
        }
        .build()
        return _personalComputerRegular!!
    }

private var _personalComputerRegular: ImageVector? = null
