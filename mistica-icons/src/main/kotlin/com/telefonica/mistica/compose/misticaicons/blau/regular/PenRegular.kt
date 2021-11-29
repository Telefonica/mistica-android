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

public val RegularGroup.PenRegular: ImageVector
    get() {
        if (_penRegular != null) {
            return _penRegular!!
        }
        _penRegular = Builder(name = "PenRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveToRelative(20.37f, 5.633f)
                    lineToRelative(-1.456f, 1.453f)
                    lineToRelative(-2.033f, -2.03f)
                    lineToRelative(1.455f, -1.453f)
                    arcToRelative(0.842f, 0.842f, 0.0f, false, true, 1.154f, 0.0f)
                    lineToRelative(0.88f, 0.878f)
                    arcToRelative(0.815f, 0.815f, 0.0f, false, true, 0.0f, 1.152f)
                    close()
                    moveTo(8.411f, 17.57f)
                    lineToRelative(-2.033f, -2.03f)
                    lineToRelative(9.535f, -9.518f)
                    lineToRelative(2.033f, 2.03f)
                    lineToRelative(-9.535f, 9.518f)
                    close()
                    moveTo(4.35f, 19.624f)
                    lineTo(5.504f, 16.6f)
                    lineToRelative(1.865f, 1.863f)
                    lineToRelative(-3.02f, 1.161f)
                    close()
                    moveTo(21.338f, 3.514f)
                    lineTo(20.459f, 2.637f)
                    arcTo(2.17f, 2.17f, 0.0f, false, false, 18.914f, 2.0f)
                    curveToRelative(-0.585f, 0.0f, -1.134f, 0.226f, -1.546f, 0.637f)
                    lineTo(4.443f, 15.542f)
                    lineTo(1.976f, 22.0f)
                    lineToRelative(6.435f, -2.496f)
                    lineTo(21.337f, 6.599f)
                    arcToRelative(2.18f, 2.18f, 0.0f, false, false, 0.0f, -3.085f)
                    close()
                }
            }
        }
        .build()
        return _penRegular!!
    }

private var _penRegular: ImageVector? = null
