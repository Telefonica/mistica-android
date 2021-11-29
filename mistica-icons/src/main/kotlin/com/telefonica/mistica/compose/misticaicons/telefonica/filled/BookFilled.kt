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

public val FilledGroup.BookFilled: ImageVector
    get() {
        if (_bookFilled != null) {
            return _bookFilled!!
        }
        _bookFilled = Builder(name = "BookFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.308f, 3.714f)
                curveToRelative(-0.213f, -0.017f, -5.19f, -0.378f, -9.468f, 1.813f)
                curveToRelative(-4.274f, -2.188f, -9.249f, -1.832f, -9.462f, -1.813f)
                arcTo(0.409f, 0.409f, 0.0f, false, false, 2.0f, 4.12f)
                verticalLineToRelative(13.46f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.409f)
                curveToRelative(5.24f, 0.0f, 9.204f, 2.03f, 9.244f, 2.05f)
                curveToRelative(0.058f, 0.03f, 0.123f, 0.048f, 0.19f, 0.048f)
                curveToRelative(0.025f, 0.0f, 0.05f, -0.017f, 0.079f, -0.023f)
                curveToRelative(0.039f, -0.008f, 0.078f, -0.008f, 0.112f, -0.028f)
                lineToRelative(0.016f, -0.008f)
                horizontalLineToRelative(0.006f)
                lineToRelative(0.003f, -0.003f)
                curveToRelative(0.252f, -0.126f, 4.126f, -2.036f, 9.218f, -2.036f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, 0.41f, -0.41f)
                verticalLineTo(4.12f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, false, -0.379f, -0.406f)
            }
        }
        .build()
        return _bookFilled!!
    }

private var _bookFilled: ImageVector? = null
