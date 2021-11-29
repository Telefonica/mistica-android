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

public val RegularGroup.FlagRegular: ImageVector
    get() {
        if (_flagRegular != null) {
            return _flagRegular!!
        }
        _flagRegular = Builder(name = "FlagRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.314f, 6.615f)
                    horizontalLineToRelative(10.682f)
                    lineTo(13.852f, 9.76f)
                    lineToRelative(3.144f, 3.145f)
                    lineTo(6.314f, 12.905f)
                    verticalLineToRelative(-6.29f)
                    close()
                    moveTo(15.776f, 9.76f)
                    lineTo(20.28f, 5.255f)
                    lineTo(6.314f, 5.255f)
                    verticalLineToRelative(-0.228f)
                    curveToRelative(0.838f, -0.42f, 1.258f, -1.55f, 0.458f, -2.6f)
                    curveTo(5.06f, 1.123f, 3.124f, 3.06f, 4.428f, 4.772f)
                    curveToRelative(0.174f, 0.132f, 0.351f, 0.224f, 0.526f, 0.293f)
                    lineTo(4.954f, 22.0f)
                    horizontalLineToRelative(1.36f)
                    verticalLineToRelative(-7.735f)
                    lineTo(20.28f, 14.265f)
                    lineTo(15.776f, 9.76f)
                    close()
                }
            }
        }
        .build()
        return _flagRegular!!
    }

private var _flagRegular: ImageVector? = null
