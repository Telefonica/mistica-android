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

public val RegularGroup.LogoutRegular: ImageVector
    get() {
        if (_logoutRegular != null) {
            return _logoutRegular!!
        }
        _logoutRegular = Builder(name = "LogoutRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.197f, 5.234f)
                    lineTo(16.636f, 4.85f)
                    lineToRelative(-0.768f, 1.122f)
                    lineToRelative(0.56f, 0.384f)
                    curveToRelative(2.168f, 1.485f, 3.514f, 3.953f, 3.514f, 6.441f)
                    curveToRelative(0.0f, 4.157f, -3.646f, 7.803f, -7.803f, 7.803f)
                    reflectiveCurveToRelative(-7.803f, -3.646f, -7.803f, -7.803f)
                    curveToRelative(0.0f, -2.485f, 1.344f, -4.951f, 3.508f, -6.436f)
                    lineToRelative(0.56f, -0.385f)
                    lineToRelative(-0.77f, -1.121f)
                    lineToRelative(-0.56f, 0.385f)
                    curveTo(4.508f, 7.0f, 2.976f, 9.826f, 2.976f, 12.797f)
                    curveToRelative(0.0f, 4.881f, 4.282f, 9.163f, 9.163f, 9.163f)
                    reflectiveCurveToRelative(9.163f, -4.282f, 9.163f, -9.163f)
                    curveToRelative(0.0f, -2.974f, -1.534f, -5.802f, -4.105f, -7.563f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.14f, 13.477f)
                    arcToRelative(0.68f, 0.68f, 0.0f, false, false, 0.68f, -0.68f)
                    verticalLineTo(2.0f)
                    horizontalLineToRelative(-1.36f)
                    verticalLineToRelative(10.797f)
                    curveToRelative(0.0f, 0.375f, 0.304f, 0.68f, 0.68f, 0.68f)
                    close()
                }
            }
        }
        .build()
        return _logoutRegular!!
    }

private var _logoutRegular: ImageVector? = null
