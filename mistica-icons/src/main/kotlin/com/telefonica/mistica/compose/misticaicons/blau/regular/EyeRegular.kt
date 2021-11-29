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

public val RegularGroup.EyeRegular: ImageVector
    get() {
        if (_eyeRegular != null) {
            return _eyeRegular!!
        }
        _eyeRegular = Builder(name = "EyeRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.506f, 11.693f)
                    curveToRelative(1.82f, 3.347f, 4.956f, 5.333f, 8.452f, 5.333f)
                    curveToRelative(3.496f, 0.0f, 6.632f, -1.986f, 8.452f, -5.333f)
                    curveToRelative(-1.82f, -3.347f, -4.956f, -5.333f, -8.452f, -5.333f)
                    curveToRelative(-3.496f, 0.0f, -6.632f, 1.986f, -8.452f, 5.333f)
                    close()
                    moveTo(11.958f, 18.386f)
                    curveTo(7.834f, 18.386f, 4.16f, 16.0f, 2.132f, 12.001f)
                    lineToRelative(-0.156f, -0.308f)
                    lineToRelative(0.156f, -0.307f)
                    curveTo(4.16f, 7.386f, 7.834f, 5.0f, 11.958f, 5.0f)
                    curveToRelative(4.125f, 0.0f, 7.798f, 2.387f, 9.826f, 6.386f)
                    lineToRelative(0.157f, 0.307f)
                    lineToRelative(-0.157f, 0.308f)
                    curveToRelative(-2.028f, 3.998f, -5.701f, 6.385f, -9.826f, 6.385f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.558f, 11.693f)
                    arcToRelative(3.6f, 3.6f, 0.0f, true, true, -7.2f, 0.001f)
                    arcToRelative(3.6f, 3.6f, 0.0f, false, true, 7.2f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _eyeRegular!!
    }

private var _eyeRegular: ImageVector? = null
