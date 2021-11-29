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

public val FilledGroup.CocktailFilled: ImageVector
    get() {
        if (_cocktailFilled != null) {
            return _cocktailFilled!!
        }
        _cocktailFilled = Builder(name = "CocktailFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.479f, 9.305f)
                curveToRelative(-0.045f, 0.0f, -0.081f, -0.005f, -0.123f, -0.005f)
                lineToRelative(0.904f, -1.048f)
                curveToRelative(0.202f, -0.216f, 0.325f, -0.51f, 0.325f, -0.83f)
                curveToRelative(0.0f, -0.671f, -0.537f, -1.215f, -1.204f, -1.215f)
                horizontalLineToRelative(-0.011f)
                lineToRelative(-2.913f, 0.014f)
                curveToRelative(0.014f, -2.047f, 0.974f, -3.005f, 3.022f, -3.005f)
                curveToRelative(2.036f, 0.0f, 3.028f, 0.997f, 3.028f, 3.047f)
                curveToRelative(0.0f, 2.076f, -0.964f, 3.042f, -3.028f, 3.042f)
                moveToRelative(-1.09f, -0.84f)
                horizontalLineTo(6.496f)
                lineToRelative(-0.933f, -0.989f)
                lineToRelative(11.815f, -0.056f)
                lineToRelative(-0.913f, 1.059f)
                curveToRelative(-0.028f, 0.0f, -0.05f, -0.014f, -0.076f, -0.014f)
                moveTo(17.48f, 2.0f)
                curveToRelative(-2.717f, 0.0f, -4.216f, 1.501f, -4.233f, 4.227f)
                lineToRelative(-5.182f, 0.025f)
                lineToRelative(-1.87f, -1.882f)
                arcToRelative(1.454f, 1.454f, 0.0f, false, false, -1.029f, -0.426f)
                horizontalLineTo(2.63f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, -0.605f, 0.608f)
                curveToRelative(0.0f, 0.336f, 0.272f, 0.608f, 0.605f, 0.608f)
                horizontalLineToRelative(2.535f)
                curveToRelative(0.065f, 0.0f, 0.13f, 0.025f, 0.174f, 0.07f)
                lineTo(6.36f, 6.26f)
                lineToRelative(-0.81f, 0.003f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -1.106f, 0.74f)
                curveToRelative(-0.187f, 0.445f, -0.095f, 0.963f, 0.236f, 1.313f)
                lineToRelative(6.15f, 6.51f)
                curveToRelative(0.085f, 0.09f, 0.183f, 0.157f, 0.287f, 0.216f)
                verticalLineToRelative(3.798f)
                lineToRelative(-3.642f, 1.687f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, false, -0.339f, 0.683f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.588f, 0.476f)
                lineToRelative(8.331f, -0.017f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.591f, -0.487f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, -0.359f, -0.68f)
                lineToRelative(-3.966f, -1.676f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.11f, -0.065f, 0.21f, -0.144f, 0.294f, -0.242f)
                lineToRelative(3.765f, -4.361f)
                curveToRelative(0.339f, 0.062f, 0.7f, 0.098f, 1.092f, 0.098f)
                curveToRelative(2.731f, 0.0f, 4.236f, -1.513f, 4.236f, -4.26f)
                curveTo(21.714f, 3.512f, 20.21f, 2.0f, 17.479f, 2.0f)
            }
        }
        .build()
        return _cocktailFilled!!
    }

private var _cocktailFilled: ImageVector? = null
