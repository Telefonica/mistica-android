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

public val RegularGroup.LockOpenRegular: ImageVector
    get() {
        if (_lockOpenRegular != null) {
            return _lockOpenRegular!!
        }
        _lockOpenRegular = Builder(name = "LockOpenRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.881f, 16.441f)
                    horizontalLineToRelative(2.4f)
                    verticalLineToRelative(-2.4f)
                    horizontalLineToRelative(-2.4f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.976f, 18.644f)
                    lineTo(3.988f, 18.644f)
                    arcToRelative(0.651f, 0.651f, 0.0f, false, true, -0.65f, -0.65f)
                    lineTo(3.338f, 12.018f)
                    horizontalLineToRelative(9.288f)
                    verticalLineToRelative(5.976f)
                    curveToRelative(0.0f, 0.358f, -0.292f, 0.65f, -0.65f, 0.65f)
                    close()
                    moveTo(17.301f, 4.0f)
                    arcToRelative(4.68f, 4.68f, 0.0f, false, false, -4.675f, 4.675f)
                    verticalLineToRelative(1.981f)
                    lineTo(1.992f, 10.656f)
                    verticalLineToRelative(0.016f)
                    horizontalLineToRelative(-0.016f)
                    verticalLineToRelative(7.322f)
                    curveToRelative(0.0f, 1.109f, 0.903f, 2.012f, 2.012f, 2.012f)
                    horizontalLineToRelative(7.988f)
                    curveToRelative(1.11f, 0.0f, 2.012f, -0.903f, 2.012f, -2.012f)
                    verticalLineToRelative(-9.32f)
                    arcToRelative(3.316f, 3.316f, 0.0f, false, true, 3.313f, -3.312f)
                    arcToRelative(3.316f, 3.316f, 0.0f, false, true, 3.313f, 3.313f)
                    verticalLineToRelative(1.997f)
                    horizontalLineToRelative(1.362f)
                    lineTo(21.976f, 8.675f)
                    arcTo(4.68f, 4.68f, 0.0f, false, false, 17.301f, 4.0f)
                    close()
                }
            }
        }
        .build()
        return _lockOpenRegular!!
    }

private var _lockOpenRegular: ImageVector? = null
