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

public val LightGroup.CocktailLight: ImageVector
    get() {
        if (_cocktailLight != null) {
            return _cocktailLight!!
        }
        _cocktailLight = Builder(name = "CocktailLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.708f, 9.61f)
                curveToRelative(-0.286f, 0.0f, -0.552f, -0.02f, -0.801f, -0.059f)
                lineToRelative(1.294f, -1.501f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, 0.227f, -0.569f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.818f, -0.826f)
                horizontalLineToRelative(-0.008f)
                lineToRelative(-3.166f, 0.014f)
                curveToRelative(-0.008f, -0.123f, -0.016f, -0.244f, -0.016f, -0.373f)
                curveToRelative(0.0f, -2.23f, 1.075f, -3.313f, 3.29f, -3.313f)
                curveToRelative(2.217f, 0.0f, 3.295f, 1.084f, 3.295f, 3.313f)
                curveToRelative(0.0f, 2.233f, -1.078f, 3.314f, -3.297f, 3.314f)
                close()
                moveTo(11.828f, 14.179f)
                lineTo(7.484f, 9.579f)
                horizontalLineToRelative(8.305f)
                lineToRelative(-0.01f, 0.017f)
                lineToRelative(-3.95f, 4.583f)
                close()
                moveTo(9.652f, 20.994f)
                lineTo(11.851f, 19.977f)
                lineTo(14.237f, 20.985f)
                curveToRelative(-0.002f, 0.003f, -4.585f, 0.009f, -4.585f, 0.009f)
                close()
                moveTo(17.604f, 7.48f)
                lineToRelative(-1.095f, 1.27f)
                lineTo(6.98f, 8.75f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.212f, 0.066f)
                lineToRelative(-1.21f, -1.283f)
                curveToRelative(0.0f, 0.003f, 12.047f, -0.053f, 12.047f, -0.053f)
                close()
                moveTo(17.708f, 2.155f)
                curveToRelative(-2.653f, 0.0f, -4.112f, 1.47f, -4.112f, 4.143f)
                curveToRelative(0.0f, 0.132f, 0.011f, 0.252f, 0.017f, 0.375f)
                lineTo(8.207f, 6.7f)
                curveToRelative(-0.014f, -0.02f, -0.023f, -0.042f, -0.04f, -0.062f)
                lineTo(6.053f, 4.512f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.902f, -0.378f)
                lineTo(2.568f, 4.134f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.0f, 0.826f)
                horizontalLineToRelative(2.588f)
                curveToRelative(0.12f, 0.0f, 0.236f, 0.048f, 0.32f, 0.135f)
                lineToRelative(1.599f, 1.607f)
                lineToRelative(-1.521f, 0.009f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.75f, 0.501f)
                arcToRelative(0.833f, 0.833f, 0.0f, false, false, 0.159f, 0.894f)
                lineToRelative(6.272f, 6.638f)
                curveToRelative(0.056f, 0.062f, 0.129f, 0.101f, 0.199f, 0.14f)
                verticalLineToRelative(4.373f)
                lineToRelative(-3.835f, 1.776f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.17f, 0.79f)
                lineToRelative(8.496f, -0.017f)
                arcToRelative(0.415f, 0.415f, 0.0f, true, false, 0.16f, -0.795f)
                lineToRelative(-4.17f, -1.762f)
                verticalLineToRelative(-4.381f)
                curveToRelative(0.07f, -0.042f, 0.14f, -0.084f, 0.195f, -0.149f)
                lineToRelative(3.852f, -4.465f)
                curveToRelative(0.428f, 0.11f, 0.893f, 0.18f, 1.409f, 0.18f)
                curveToRelative(2.653f, 0.0f, 4.115f, -1.471f, 4.115f, -4.138f)
                curveToRelative(0.0f, -2.666f, -1.462f, -4.14f, -4.118f, -4.14f)
                close()
            }
        }
        .build()
        return _cocktailLight!!
    }

private var _cocktailLight: ImageVector? = null
