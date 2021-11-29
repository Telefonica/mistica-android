package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.FlagFilled: ImageVector
    get() {
        if (_flagFilled != null) {
            return _flagFilled!!
        }
        _flagFilled = Builder(name = "FlagFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.443f, 7.465f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.006f, -0.227f)
                lineToRelative(3.14f, -3.134f)
                curveToRelative(0.305f, -0.393f, 0.356f, -0.928f, 0.134f, -1.373f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, false, -1.176f, -0.728f)
                horizontalLineTo(4.992f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, false, -1.314f, 1.305f)
                verticalLineToRelative(17.745f)
                curveToRelative(0.0f, 0.317f, 0.258f, 0.574f, 0.577f, 0.574f)
                curveToRelative(0.32f, 0.0f, 0.577f, -0.257f, 0.577f, -0.574f)
                verticalLineTo(12.71f)
                horizontalLineToRelative(14.7f)
                curveToRelative(0.504f, 0.0f, 0.955f, -0.28f, 1.177f, -0.729f)
                curveToRelative(0.224f, -0.45f, 0.17f, -0.974f, -0.182f, -1.425f)
                curveToRelative(0.002f, 0.0f, -3.084f, -3.09f, -3.084f, -3.09f)
                close()
            }
        }
        .build()
        return _flagFilled!!
    }

private var _flagFilled: ImageVector? = null
