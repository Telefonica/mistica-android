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
                moveTo(2.02f, 11.913f)
                curveToRelative(0.0f, -0.151f, 0.028f, -0.3f, 0.084f, -0.44f)
                curveToRelative(0.176f, -0.434f, 0.602f, -0.7f, 1.106f, -0.694f)
                lineToRelative(3.65f, -0.003f)
                curveToRelative(0.02f, -0.011f, 0.04f, -0.023f, 0.056f, -0.04f)
                lineToRelative(0.02f, -6.882f)
                curveToRelative(-0.009f, -0.616f, 0.145f, -1.07f, 0.467f, -1.383f)
                curveToRelative(0.322f, -0.314f, 0.78f, -0.463f, 1.393f, -0.443f)
                horizontalLineToRelative(6.042f)
                curveToRelative(0.42f, -0.008f, 1.025f, 0.03f, 1.445f, 0.437f)
                curveToRelative(0.42f, 0.406f, 0.482f, 1.008f, 0.487f, 1.426f)
                verticalLineToRelative(0.008f)
                lineToRelative(-0.002f, 6.712f)
                arcToRelative(0.453f, 0.453f, 0.0f, false, false, 0.053f, 0.157f)
                lineToRelative(3.563f, -0.006f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.857f, 0.006f, 1.149f, 0.414f, 1.247f, 0.658f)
                curveToRelative(0.168f, 0.418f, 0.014f, 0.9f, -0.42f, 1.322f)
                lineToRelative(-8.712f, 8.659f)
                curveToRelative(-0.084f, 0.086f, -0.33f, 0.336f, -0.689f, 0.333f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.594f, -0.275f)
                lineTo(2.513f, 12.98f)
                curveToRelative(-0.32f, -0.305f, -0.493f, -0.691f, -0.493f, -1.067f)
                close()
            }
        }
        .build()
        return _arrowDownFilled!!
    }

private var _arrowDownFilled: ImageVector? = null
