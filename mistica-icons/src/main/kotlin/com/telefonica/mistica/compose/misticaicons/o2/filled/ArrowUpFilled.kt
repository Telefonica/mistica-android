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

public val FilledGroup.ArrowUpFilled: ImageVector
    get() {
        if (_arrowUpFilled != null) {
            return _arrowUpFilled!!
        }
        _arrowUpFilled = Builder(name = "ArrowUpFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.89f, 21.996f)
                verticalLineToRelative(-8.173f)
                horizontalLineToRelative(3.894f)
                curveToRelative(0.89f, 0.0f, 1.704f, -0.564f, 2.041f, -1.425f)
                curveToRelative(0.337f, -0.824f, 0.187f, -1.724f, -0.445f, -2.363f)
                lineTo(11.996f, 1.0f)
                lineTo(2.62f, 10.035f)
                curveToRelative(-0.632f, 0.639f, -0.782f, 1.539f, -0.445f, 2.363f)
                curveToRelative(0.37f, 0.861f, 1.151f, 1.425f, 2.04f, 1.425f)
                horizontalLineTo(8.11f)
                verticalLineTo(22.0f)
                lineToRelative(7.78f, -0.004f)
                close()
            }
        }
        .build()
        return _arrowUpFilled!!
    }

private var _arrowUpFilled: ImageVector? = null
