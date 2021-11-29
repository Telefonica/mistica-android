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

public val FilledGroup.EuroSymbolFilled: ImageVector
    get() {
        if (_euroSymbolFilled != null) {
            return _euroSymbolFilled!!
        }
        _euroSymbolFilled = Builder(name = "EuroSymbolFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.61f, 18.966f)
                curveToRelative(-0.285f, -0.635f, -1.002f, -0.913f, -1.604f, -0.61f)
                curveToRelative(-1.009f, 0.501f, -2.28f, 0.753f, -3.774f, 0.753f)
                curveToRelative(-3.33f, 0.0f, -5.411f, -1.25f, -6.333f, -3.753f)
                horizontalLineToRelative(4.883f)
                curveToRelative(0.669f, 0.0f, 1.204f, -0.572f, 1.204f, -1.275f)
                reflectiveCurveToRelative(-0.538f, -1.271f, -1.204f, -1.271f)
                horizontalLineTo(8.395f)
                curveToRelative(-0.02f, -0.325f, -0.059f, -0.634f, -0.059f, -0.984f)
                curveToRelative(0.0f, -0.09f, 0.014f, -0.162f, 0.017f, -0.249f)
                horizontalLineToRelative(5.429f)
                curveToRelative(0.669f, 0.0f, 1.204f, -0.571f, 1.204f, -1.274f)
                curveToRelative(0.0f, -0.704f, -0.538f, -1.272f, -1.204f, -1.272f)
                horizontalLineToRelative(-5.11f)
                curveToRelative(0.768f, -2.995f, 2.919f, -4.485f, 6.56f, -4.485f)
                curveToRelative(1.477f, 0.0f, 2.734f, 0.25f, 3.737f, 0.737f)
                curveToRelative(0.605f, 0.3f, 1.322f, 0.017f, 1.6f, -0.62f)
                curveToRelative(0.28f, -0.638f, 0.016f, -1.394f, -0.589f, -1.691f)
                curveTo(18.658f, 2.328f, 17.062f, 2.0f, 15.235f, 2.0f)
                curveToRelative(-5.05f, 0.0f, -8.179f, 2.476f, -9.05f, 7.036f)
                horizontalLineTo(4.896f)
                curveToRelative(-0.666f, 0.0f, -1.204f, 0.572f, -1.204f, 1.272f)
                curveToRelative(0.0f, 0.703f, 0.538f, 1.275f, 1.204f, 1.275f)
                horizontalLineToRelative(1.04f)
                curveToRelative(0.0f, 0.084f, -0.009f, 0.162f, -0.009f, 0.249f)
                curveToRelative(0.0f, 0.336f, 0.014f, 0.661f, 0.034f, 0.983f)
                horizontalLineTo(4.896f)
                curveToRelative(-0.666f, 0.0f, -1.204f, 0.569f, -1.204f, 1.272f)
                curveToRelative(0.0f, 0.703f, 0.538f, 1.274f, 1.204f, 1.274f)
                horizontalLineToRelative(1.449f)
                curveToRelative(1.058f, 4.087f, 4.12f, 6.297f, 8.89f, 6.297f)
                curveToRelative(1.855f, 0.0f, 3.468f, -0.333f, 4.801f, -0.997f)
                curveToRelative(0.603f, -0.3f, 0.858f, -1.059f, 0.575f, -1.695f)
            }
        }
        .build()
        return _euroSymbolFilled!!
    }

private var _euroSymbolFilled: ImageVector? = null
