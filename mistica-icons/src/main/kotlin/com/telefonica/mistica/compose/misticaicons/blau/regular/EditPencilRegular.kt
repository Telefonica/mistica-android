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

public val RegularGroup.EditPencilRegular: ImageVector
    get() {
        if (_editPencilRegular != null) {
            return _editPencilRegular!!
        }
        _editPencilRegular = Builder(name = "EditPencilRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(4.933f, 16.9f)
                    horizontalLineToRelative(3.035f)
                    verticalLineToRelative(-1.36f)
                    lineTo(4.933f, 15.54f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.36f, 19.335f)
                    lineTo(3.336f, 19.335f)
                    lineTo(3.336f, 5.516f)
                    lineTo(13.36f, 5.516f)
                    verticalLineToRelative(3.47f)
                    lineTo(10.366f, 11.977f)
                    lineToRelative(-2.202f, 4.634f)
                    lineToRelative(4.782f, -2.03f)
                    lineToRelative(0.414f, -0.415f)
                    verticalLineToRelative(5.168f)
                    close()
                    moveTo(21.4f, 3.536f)
                    arcToRelative(1.834f, 1.834f, 0.0f, false, false, -2.591f, 0.0f)
                    lineTo(14.72f, 7.625f)
                    lineTo(14.72f, 4.156f)
                    lineTo(1.976f, 4.156f)
                    verticalLineToRelative(16.539f)
                    lineTo(14.72f, 20.695f)
                    lineTo(14.72f, 12.807f)
                    lineToRelative(6.68f, -6.68f)
                    arcToRelative(1.833f, 1.833f, 0.0f, false, false, 0.0f, -2.591f)
                    close()
                }
            }
        }
        .build()
        return _editPencilRegular!!
    }

private var _editPencilRegular: ImageVector? = null
