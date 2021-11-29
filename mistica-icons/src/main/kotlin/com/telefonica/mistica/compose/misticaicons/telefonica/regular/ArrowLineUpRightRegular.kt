package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ArrowLineUpRightRegular: ImageVector
    get() {
        if (_arrowLineUpRightRegular != null) {
            return _arrowLineUpRightRegular!!
        }
        _arrowLineUpRightRegular = Builder(name = "ArrowLineUpRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.49f, 8.395f)
                lineToRelative(-0.063f, 8.569f)
                curveToRelative(0.021f, 0.378f, 0.342f, 0.67f, 0.722f, 0.65f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, 0.65f, -0.689f)
                lineToRelative(0.017f, -10.16f)
                curveToRelative(-0.002f, -0.043f, -0.02f, -0.083f, -0.028f, -0.126f)
                curveToRelative(-0.008f, -0.04f, -0.011f, -0.082f, -0.027f, -0.121f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.147f, -0.218f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, false, -0.219f, -0.144f)
                curveToRelative(-0.04f, -0.018f, -0.082f, -0.021f, -0.124f, -0.028f)
                curveToRelative(-0.04f, -0.008f, -0.079f, -0.027f, -0.122f, -0.029f)
                lineToRelative(-9.974f, -0.045f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, -0.705f, 0.663f)
                reflectiveCurveToRelative(-0.002f, 0.001f, 0.0f, 0.003f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.667f, 0.705f)
                horizontalLineToRelative(8.383f)
                lineToRelative(-9.22f, 9.22f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.97f, 0.97f)
                lineToRelative(9.22f, -9.22f)
                close()
            }
        }
        .build()
        return _arrowLineUpRightRegular!!
    }

private var _arrowLineUpRightRegular: ImageVector? = null
