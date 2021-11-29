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

public val LightGroup.ShieldLight: ImageVector
    get() {
        if (_shieldLight != null) {
            return _shieldLight!!
        }
        _shieldLight = Builder(name = "ShieldLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.499f, 5.485f)
                curveToRelative(0.005f, 1.565f, 0.053f, 6.607f, 0.45f, 8.89f)
                curveToRelative(0.497f, 2.877f, 6.242f, 5.883f, 7.331f, 6.426f)
                curveToRelative(1.09f, -0.546f, 6.843f, -3.552f, 7.34f, -6.426f)
                curveToRelative(0.389f, -2.288f, 0.436f, -7.341f, 0.442f, -8.899f)
                curveToRelative(-1.818f, 0.143f, -2.883f, -0.571f, -3.922f, -1.263f)
                curveToRelative(-1.008f, -0.675f, -2.056f, -1.373f, -3.857f, -1.375f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.804f, 0.0f, -2.85f, 0.697f, -3.86f, 1.375f)
                curveToRelative(-1.05f, 0.7f, -2.135f, 1.42f, -3.92f, 1.272f)
                close()
                moveTo(12.28f, 21.686f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.179f, -0.039f)
                curveToRelative(-0.297f, -0.143f, -7.35f, -3.543f, -7.97f, -7.126f)
                curveToRelative(-0.484f, -2.782f, -0.464f, -9.238f, -0.464f, -9.513f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, 0.515f, -0.406f)
                curveToRelative(1.74f, 0.278f, 2.684f, -0.356f, 3.779f, -1.087f)
                curveTo(9.023f, 2.804f, 10.224f, 2.0f, 12.278f, 2.0f)
                horizontalLineToRelative(0.008f)
                curveToRelative(2.053f, 0.003f, 3.255f, 0.807f, 4.314f, 1.515f)
                curveToRelative(1.092f, 0.731f, 2.033f, 1.362f, 3.784f, 1.09f)
                arcToRelative(0.438f, 0.438f, 0.0f, false, true, 0.51f, 0.403f)
                curveToRelative(0.0f, 0.275f, 0.017f, 6.731f, -0.457f, 9.513f)
                curveToRelative(-0.616f, 3.585f, -7.678f, 6.983f, -7.977f, 7.126f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, true, -0.18f, 0.04f)
                close()
            }
        }
        .build()
        return _shieldLight!!
    }

private var _shieldLight: ImageVector? = null
