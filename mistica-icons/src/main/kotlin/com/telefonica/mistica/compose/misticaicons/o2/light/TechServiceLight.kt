package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.TechServiceLight: ImageVector
    get() {
        if (_techServiceLight != null) {
            return _techServiceLight!!
        }
        _techServiceLight = Builder(name = "TechServiceLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.168f, 21.098f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.253f, -0.11f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.0f, -0.529f)
                lineToRelative(3.864f, -4.044f)
                lineToRelative(0.216f, 0.088f)
                curveToRelative(2.524f, 1.033f, 5.385f, 0.407f, 7.298f, -1.592f)
                curveToRelative(1.782f, -1.864f, 2.42f, -4.59f, 1.706f, -7.084f)
                lineToRelative(-4.093f, 4.279f)
                arcToRelative(1.733f, 1.733f, 0.0f, false, true, -2.536f, 0.0f)
                lineToRelative(-2.026f, -2.12f)
                arcToRelative(1.938f, 1.938f, 0.0f, false, true, 0.0f, -2.65f)
                lineToRelative(4.093f, -4.285f)
                curveToRelative(-2.387f, -0.747f, -4.991f, -0.08f, -6.769f, 1.781f)
                curveToRelative(-1.914f, 2.003f, -2.507f, 4.998f, -1.52f, 7.64f)
                lineToRelative(0.084f, 0.226f)
                lineToRelative(-5.621f, 5.88f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, -0.506f, 0.0f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, true, 0.0f, -0.53f)
                lineToRelative(5.292f, -5.535f)
                curveToRelative(-0.975f, -2.86f, -0.293f, -6.056f, 1.766f, -8.21f)
                curveToRelative(2.11f, -2.21f, 5.276f, -2.902f, 8.064f, -1.76f)
                lineToRelative(0.51f, 0.21f)
                lineTo(12.85f, 7.86f)
                arcToRelative(1.168f, 1.168f, 0.0f, false, false, 0.0f, 1.592f)
                lineToRelative(2.026f, 2.12f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.52f, 0.0f)
                lineTo(21.28f, 6.47f)
                lineToRelative(0.2f, 0.533f)
                curveToRelative(1.091f, 2.915f, 0.433f, 6.229f, -1.681f, 8.442f)
                curveToRelative(-2.058f, 2.154f, -5.111f, 2.864f, -7.844f, 1.848f)
                lineToRelative(-3.535f, 3.7f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.252f, 0.105f)
                close()
                moveTo(7.309f, 22.248f)
                curveToRelative(0.0f, 0.412f, -0.32f, 0.752f, -0.718f, 0.752f)
                curveToRelative(-0.397f, 0.0f, -0.718f, -0.336f, -0.718f, -0.752f)
                reflectiveCurveToRelative(0.32f, -0.751f, 0.718f, -0.751f)
                curveToRelative(0.397f, 0.0f, 0.718f, 0.34f, 0.718f, 0.751f)
            }
        }
        .build()
        return _techServiceLight!!
    }

private var _techServiceLight: ImageVector? = null
