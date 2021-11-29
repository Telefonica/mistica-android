package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ArrowDownFilled: ImageVector
    get() {
        if (_arrowDownFilled != null) {
            return _arrowDownFilled!!
        }
        _arrowDownFilled = Builder(name = "ArrowDownFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.891f, 1.0f)
                verticalLineToRelative(8.177f)
                horizontalLineToRelative(3.895f)
                curveToRelative(0.889f, 0.0f, 1.707f, 0.563f, 2.04f, 1.424f)
                curveToRelative(0.336f, 0.823f, 0.186f, 1.726f, -0.445f, 2.365f)
                lineTo(11.996f, 22.0f)
                lineToRelative(-9.377f, -9.038f)
                curveToRelative(-0.631f, -0.639f, -0.78f, -1.538f, -0.444f, -2.365f)
                curveToRelative(0.37f, -0.865f, 1.15f, -1.424f, 2.039f, -1.424f)
                horizontalLineToRelative(3.895f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(7.782f)
                close()
            }
        }
        .build()
        return _arrowDownFilled!!
    }

private var _arrowDownFilled: ImageVector? = null
