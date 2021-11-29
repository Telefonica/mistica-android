package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.FireLight: ImageVector
    get() {
        if (_fireLight != null) {
            return _fireLight!!
        }
        _fireLight = Builder(name = "FireLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.574f, 18.98f)
                arcToRelative(7.111f, 7.111f, 0.0f, false, true, -2.569f, 1.49f)
                curveToRelative(0.1f, -0.11f, 0.196f, -0.222f, 0.286f, -0.342f)
                curveToRelative(1.6f, -2.174f, 0.288f, -5.51f, -1.356f, -6.947f)
                curveToRelative(-0.74f, -0.644f, -1.619f, -1.118f, -2.476f, -1.336f)
                arcToRelative(0.411f, 0.411f, 0.0f, true, false, -0.485f, 0.554f)
                curveToRelative(0.009f, 0.02f, 0.768f, 1.922f, -0.94f, 3.252f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, false, -0.67f, 0.625f)
                arcToRelative(3.156f, 3.156f, 0.0f, false, false, -0.286f, 3.793f)
                arcToRelative(7.043f, 7.043f, 0.0f, false, true, -2.462f, -1.953f)
                curveToRelative(-3.07f, -3.888f, -0.367f, -10.165f, 2.846f, -12.778f)
                curveToRelative(1.291f, -1.054f, 2.79f, -1.863f, 4.285f, -2.328f)
                curveToRelative(-0.389f, 1.513f, -0.767f, 4.966f, 2.79f, 7.54f)
                curveToRelative(0.48f, 0.34f, 0.92f, 0.718f, 1.306f, 1.13f)
                curveToRelative(0.966f, 1.022f, 1.47f, 2.341f, 1.42f, 3.71f)
                curveToRelative(-0.053f, 1.368f, -0.653f, 2.642f, -1.69f, 3.59f)
                moveToRelative(-6.123f, 1.792f)
                curveToRelative(-0.005f, 0.0f, -0.72f, -0.123f, -1.358f, -0.745f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, true, -0.107f, -3.21f)
                curveToRelative(0.166f, -0.185f, 0.348f, -0.359f, 0.552f, -0.513f)
                curveToRelative(1.34f, -1.042f, 1.544f, -2.437f, 1.406f, -3.426f)
                arcToRelative(5.741f, 5.741f, 0.0f, false, true, 1.451f, 0.922f)
                curveToRelative(1.376f, 1.199f, 2.538f, 4.07f, 1.236f, 5.84f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, -2.227f, 1.205f)
                curveToRelative(-0.087f, -0.003f, -0.174f, 0.005f, -0.26f, 0.002f)
                curveToRelative(-0.029f, 0.0f, -0.057f, 0.0f, -0.085f, -0.002f)
                curveToRelative(-0.201f, -0.012f, -0.4f, -0.048f, -0.6f, -0.073f)
                horizontalLineToRelative(-0.008f)
                moveToRelative(6.99f, -9.656f)
                arcToRelative(9.768f, 9.768f, 0.0f, false, false, -1.424f, -1.232f)
                curveToRelative(-4.109f, -2.978f, -2.347f, -7.129f, -2.271f, -7.305f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, false, -0.06f, -0.429f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.408f, -0.137f)
                curveToRelative(-1.846f, 0.437f, -3.743f, 1.39f, -5.336f, 2.686f)
                curveToRelative(-5.272f, 4.288f, -5.28f, 11.0f, -2.97f, 13.927f)
                curveToRelative(1.353f, 1.712f, 3.449f, 2.784f, 5.656f, 3.014f)
                curveToRelative(0.185f, 0.028f, 0.367f, 0.045f, 0.552f, 0.045f)
                lineToRelative(0.339f, 0.003f)
                curveToRelative(0.613f, 0.0f, 1.232f, -0.067f, 1.837f, -0.205f)
                curveToRelative(0.081f, -0.01f, 2.011f, -0.291f, 3.77f, -1.896f)
                curveToRelative(1.202f, -1.098f, 1.897f, -2.577f, 1.956f, -4.163f)
                curveToRelative(0.061f, -1.593f, -0.524f, -3.123f, -1.642f, -4.308f)
            }
        }
        .build()
        return _fireLight!!
    }

private var _fireLight: ImageVector? = null
