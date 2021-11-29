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

public val RegularGroup.AddMoreCircleRegular: ImageVector
    get() {
        if (_addMoreCircleRegular != null) {
            return _addMoreCircleRegular!!
        }
        _addMoreCircleRegular = Builder(name = "AddMoreCircleRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.908f, 11.321f)
                    horizontalLineToRelative(-5.254f)
                    lineTo(12.654f, 6.068f)
                    arcToRelative(0.679f, 0.679f, 0.0f, true, false, -1.357f, 0.0f)
                    verticalLineToRelative(5.253f)
                    lineTo(6.044f, 11.321f)
                    arcToRelative(0.678f, 0.678f, 0.0f, false, false, 0.0f, 1.357f)
                    horizontalLineToRelative(5.253f)
                    verticalLineToRelative(5.254f)
                    arcToRelative(0.679f, 0.679f, 0.0f, false, false, 1.357f, 0.0f)
                    verticalLineToRelative(-5.254f)
                    horizontalLineToRelative(5.254f)
                    arcToRelative(0.678f, 0.678f, 0.0f, false, false, 0.0f, -1.357f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.976f, 20.642f)
                    curveToRelative(-4.604f, 0.0f, -8.642f, -4.038f, -8.642f, -8.642f)
                    curveToRelative(0.0f, -4.604f, 4.038f, -8.643f, 8.642f, -8.643f)
                    curveToRelative(4.604f, 0.0f, 8.642f, 4.039f, 8.642f, 8.643f)
                    curveToRelative(0.0f, 4.604f, -4.038f, 8.642f, -8.642f, 8.642f)
                    close()
                    moveTo(11.976f, 2.0f)
                    curveToRelative(-5.327f, 0.0f, -10.0f, 4.673f, -10.0f, 10.0f)
                    reflectiveCurveToRelative(4.673f, 10.0f, 10.0f, 10.0f)
                    reflectiveCurveToRelative(10.0f, -4.673f, 10.0f, -10.0f)
                    reflectiveCurveToRelative(-4.673f, -10.0f, -10.0f, -10.0f)
                    close()
                }
            }
        }
        .build()
        return _addMoreCircleRegular!!
    }

private var _addMoreCircleRegular: ImageVector? = null
