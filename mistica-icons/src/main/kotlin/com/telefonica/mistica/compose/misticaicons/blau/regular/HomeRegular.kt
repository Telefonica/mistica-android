package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.HomeRegular: ImageVector
    get() {
        if (_homeRegular != null) {
            return _homeRegular!!
        }
        _homeRegular = Builder(name = "HomeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(19.581f, 11.802f)
                    lineTo(18.22f, 11.802f)
                    verticalLineToRelative(6.738f)
                    curveToRelative(0.0f, 0.58f, -0.471f, 1.05f, -1.05f, 1.05f)
                    lineTo(6.784f, 19.59f)
                    arcToRelative(1.053f, 1.053f, 0.0f, false, true, -1.051f, -1.05f)
                    lineTo(5.733f, 11.802f)
                    lineTo(4.098f, 11.802f)
                    lineToRelative(7.879f, -7.879f)
                    lineToRelative(7.878f, 7.879f)
                    horizontalLineToRelative(-0.274f)
                    close()
                    moveTo(21.978f, 12.001f)
                    lineTo(11.977f, 2.0f)
                    lineTo(1.976f, 12.0f)
                    lineToRelative(0.481f, 1.162f)
                    horizontalLineToRelative(1.916f)
                    verticalLineToRelative(5.378f)
                    curveToRelative(0.0f, 1.33f, 1.082f, 2.41f, 2.411f, 2.41f)
                    lineTo(17.17f, 20.95f)
                    arcToRelative(2.414f, 2.414f, 0.0f, false, false, 2.411f, -2.41f)
                    verticalLineToRelative(-5.378f)
                    horizontalLineToRelative(1.916f)
                    lineTo(21.978f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.377f, 17.489f)
                    horizontalLineToRelative(3.2f)
                    verticalLineToRelative(-3.2f)
                    horizontalLineToRelative(-3.2f)
                    close()
                }
            }
        }
        .build()
        return _homeRegular!!
    }

private var _homeRegular: ImageVector? = null
