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

public val RegularGroup.CocktailRegular: ImageVector
    get() {
        if (_cocktailRegular != null) {
            return _cocktailRegular!!
        }
        _cocktailRegular = Builder(name = "CocktailRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.451f, 9.308f)
                curveToRelative(-0.045f, 0.0f, -0.081f, -0.005f, -0.123f, -0.005f)
                lineToRelative(0.904f, -1.05f)
                curveToRelative(0.202f, -0.22f, 0.328f, -0.51f, 0.328f, -0.83f)
                curveToRelative(0.0f, -0.672f, -0.538f, -1.216f, -1.204f, -1.216f)
                horizontalLineToRelative(-0.014f)
                lineToRelative(-2.913f, 0.014f)
                curveToRelative(0.014f, -2.047f, 0.972f, -3.005f, 3.022f, -3.005f)
                curveToRelative(2.036f, 0.0f, 3.028f, 0.997f, 3.028f, 3.047f)
                curveToRelative(0.0f, 2.076f, -0.964f, 3.045f, -3.028f, 3.045f)
                close()
                moveTo(11.683f, 13.986f)
                lineTo(7.616f, 9.681f)
                horizontalLineToRelative(7.782f)
                lineToRelative(-3.715f, 4.305f)
                close()
                moveTo(10.473f, 20.465f)
                lineTo(11.709f, 19.894f)
                lineTo(13.048f, 20.459f)
                lineTo(10.473f, 20.465f)
                close()
                moveTo(17.35f, 7.423f)
                lineToRelative(-0.916f, 1.056f)
                curveToRelative(-0.025f, -0.003f, -0.047f, -0.014f, -0.073f, -0.014f)
                lineTo(6.468f, 8.465f)
                lineToRelative(-0.936f, -0.989f)
                curveToRelative(0.0f, 0.003f, 11.818f, -0.053f, 11.818f, -0.053f)
                close()
                moveTo(17.451f, 2.0f)
                curveToRelative(-2.717f, 0.0f, -4.216f, 1.501f, -4.23f, 4.224f)
                lineTo(8.04f, 6.25f)
                lineTo(6.17f, 4.367f)
                arcTo(1.454f, 1.454f, 0.0f, false, false, 5.14f, 3.94f)
                lineTo(2.605f, 3.94f)
                arcTo(0.607f, 0.607f, 0.0f, false, false, 2.0f, 4.55f)
                curveToRelative(0.0f, 0.336f, 0.272f, 0.608f, 0.605f, 0.608f)
                lineTo(5.14f, 5.158f)
                curveToRelative(0.064f, 0.0f, 0.129f, 0.025f, 0.174f, 0.07f)
                lineToRelative(1.022f, 1.03f)
                lineToRelative(-0.807f, 0.004f)
                arcTo(1.214f, 1.214f, 0.0f, false, false, 4.423f, 7.0f)
                curveToRelative(-0.188f, 0.445f, -0.095f, 0.96f, 0.235f, 1.314f)
                lineToRelative(6.152f, 6.512f)
                curveToRelative(0.08f, 0.087f, 0.182f, 0.157f, 0.285f, 0.216f)
                verticalLineToRelative(3.798f)
                lineToRelative(-3.641f, 1.687f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, 0.25f, 1.16f)
                lineToRelative(8.33f, -0.018f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.232f, -1.168f)
                lineTo(12.3f, 18.824f)
                verticalLineToRelative(-3.799f)
                curveToRelative(0.112f, -0.064f, 0.21f, -0.145f, 0.294f, -0.24f)
                lineToRelative(3.765f, -4.362f)
                curveToRelative(0.338f, 0.062f, 0.7f, 0.098f, 1.09f, 0.098f)
                curveToRelative(2.73f, 0.0f, 4.234f, -1.513f, 4.234f, -4.26f)
                curveTo(21.686f, 3.515f, 20.183f, 2.0f, 17.451f, 2.0f)
                close()
            }
        }
        .build()
        return _cocktailRegular!!
    }

private var _cocktailRegular: ImageVector? = null
