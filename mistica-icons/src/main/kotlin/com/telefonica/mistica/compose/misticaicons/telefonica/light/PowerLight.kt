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

public val LightGroup.PowerLight: ImageVector
    get() {
        if (_powerLight != null) {
            return _powerLight!!
        }
        _powerLight = Builder(name = "PowerLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.988f, 2.15f)
                curveToRelative(3.14f, 0.0f, 5.574f, 0.812f, 7.238f, 2.417f)
                curveToRelative(1.725f, 1.664f, 2.602f, 4.163f, 2.602f, 7.423f)
                curveToRelative(0.003f, 6.435f, -3.4f, 9.838f, -9.84f, 9.838f)
                curveToRelative(-6.435f, 0.0f, -9.838f, -3.4f, -9.838f, -9.838f)
                curveToRelative(0.0f, -6.437f, 3.4f, -9.84f, 9.838f, -9.84f)
                close()
                moveTo(11.988f, 2.71f)
                curveToRelative(-6.155f, 0.0f, -9.278f, 3.123f, -9.278f, 9.28f)
                curveToRelative(0.0f, 6.154f, 3.12f, 9.278f, 9.278f, 9.278f)
                curveToRelative(6.16f, 0.0f, 9.28f, -3.12f, 9.28f, -9.278f)
                curveToRelative(0.002f, -6.16f, -3.12f, -9.28f, -9.28f, -9.28f)
                close()
                moveTo(13.562f, 6.084f)
                lineTo(13.626f, 6.088f)
                curveToRelative(1.42f, 0.26f, 2.518f, 0.886f, 3.263f, 1.86f)
                curveToRelative(0.762f, 0.998f, 1.149f, 2.359f, 1.149f, 4.048f)
                curveToRelative(0.0f, 1.997f, -0.54f, 3.53f, -1.602f, 4.555f)
                curveToRelative(-0.968f, 0.922f, -2.35f, 1.42f, -4.111f, 1.476f)
                lineToRelative(-0.335f, 0.005f)
                curveToRelative(-1.921f, 0.0f, -3.417f, -0.501f, -4.44f, -1.487f)
                curveToRelative(-1.061f, -1.025f, -1.602f, -2.557f, -1.602f, -4.555f)
                curveToRelative(0.0f, -1.664f, 0.376f, -3.01f, 1.115f, -4.005f)
                curveToRelative(0.726f, -0.972f, 1.793f, -1.605f, 3.18f, -1.88f)
                lineToRelative(0.064f, -0.005f)
                lineToRelative(0.062f, 0.009f)
                arcToRelative(0.281f, 0.281f, 0.0f, false, true, -0.017f, 0.548f)
                curveToRelative(-2.55f, 0.507f, -3.843f, 2.303f, -3.843f, 5.336f)
                curveToRelative(0.0f, 3.639f, 1.843f, 5.482f, 5.481f, 5.482f)
                curveToRelative(3.639f, 0.0f, 5.485f, -1.843f, 5.485f, -5.482f)
                curveToRelative(0.0f, -3.073f, -1.33f, -4.877f, -3.95f, -5.356f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.037f, -0.553f)
                close()
                moveTo(11.99f, 4.579f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(4.098f)
                arcToRelative(0.281f, 0.281f, 0.0f, false, true, -0.216f, 0.272f)
                lineToRelative(-0.064f, 0.008f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                lineTo(11.71f, 4.859f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                close()
            }
        }
        .build()
        return _powerLight!!
    }

private var _powerLight: ImageVector? = null
