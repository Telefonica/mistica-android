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

public val RegularGroup.ChipSimCardRegular: ImageVector
    get() {
        if (_chipSimCardRegular != null) {
            return _chipSimCardRegular!!
        }
        _chipSimCardRegular = Builder(name = "ChipSimCardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.534f, 17.763f)
                    verticalLineToRelative(1.864f)
                    curveToRelative(0.0f, 0.56f, -0.456f, 1.015f, -1.016f, 1.015f)
                    lineTo(7.349f, 20.642f)
                    curveToRelative(-0.56f, 0.0f, -1.015f, -0.455f, -1.015f, -1.015f)
                    lineTo(6.334f, 3.357f)
                    horizontalLineToRelative(5.845f)
                    lineToRelative(6.355f, 5.561f)
                    verticalLineToRelative(8.845f)
                    close()
                    moveTo(12.688f, 2.0f)
                    lineTo(4.976f, 2.0f)
                    verticalLineToRelative(17.627f)
                    arcTo(2.376f, 2.376f, 0.0f, false, false, 7.349f, 22.0f)
                    horizontalLineToRelative(10.169f)
                    arcToRelative(2.377f, 2.377f, 0.0f, false, false, 2.374f, -2.373f)
                    lineTo(19.892f, 8.302f)
                    lineTo(12.688f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(7.013f, 19.968f)
                    horizontalLineToRelative(3.193f)
                    verticalLineToRelative(-3.193f)
                    horizontalLineTo(7.013f)
                    close()
                }
            }
        }
        .build()
        return _chipSimCardRegular!!
    }

private var _chipSimCardRegular: ImageVector? = null
