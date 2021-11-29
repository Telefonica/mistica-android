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

public val RegularGroup.EuroSymbolRegular: ImageVector
    get() {
        if (_euroSymbolRegular != null) {
            return _euroSymbolRegular!!
        }
        _euroSymbolRegular = Builder(name = "EuroSymbolRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.4f, 16.008f)
                    arcToRelative(3.983f, 3.983f, 0.0f, false, true, -3.469f, -2.032f)
                    horizontalLineToRelative(4.74f)
                    verticalLineToRelative(-1.358f)
                    lineTo(8.467f, 12.618f)
                    arcToRelative(3.984f, 3.984f, 0.0f, false, true, -0.049f, -0.592f)
                    curveToRelative(0.0f, -0.202f, 0.02f, -0.399f, 0.049f, -0.592f)
                    horizontalLineToRelative(5.204f)
                    lineTo(13.671f, 10.076f)
                    lineTo(8.932f, 10.076f)
                    arcToRelative(3.98f, 3.98f, 0.0f, false, true, 6.52f, -0.607f)
                    lineToRelative(1.04f, -0.872f)
                    arcToRelative(5.328f, 5.328f, 0.0f, false, false, -4.092f, -1.91f)
                    arcToRelative(5.344f, 5.344f, 0.0f, false, false, -4.966f, 3.389f)
                    horizontalLineToRelative(-1.39f)
                    verticalLineToRelative(1.358f)
                    horizontalLineToRelative(1.051f)
                    arcToRelative(5.517f, 5.517f, 0.0f, false, false, -0.035f, 0.592f)
                    curveToRelative(0.0f, 0.2f, 0.014f, 0.397f, 0.035f, 0.592f)
                    lineTo(6.044f, 12.618f)
                    verticalLineToRelative(1.358f)
                    horizontalLineToRelative(1.39f)
                    arcToRelative(5.344f, 5.344f, 0.0f, false, false, 4.966f, 3.39f)
                    curveToRelative(1.605f, 0.0f, 3.11f, -0.714f, 4.129f, -1.956f)
                    lineToRelative(-1.049f, -0.86f)
                    arcToRelative(3.97f, 3.97f, 0.0f, false, true, -3.08f, 1.458f)
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
        return _euroSymbolRegular!!
    }

private var _euroSymbolRegular: ImageVector? = null
