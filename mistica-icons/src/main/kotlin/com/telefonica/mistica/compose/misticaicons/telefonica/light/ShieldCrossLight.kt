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

public val LightGroup.ShieldCrossLight: ImageVector
    get() {
        if (_shieldCrossLight != null) {
            return _shieldCrossLight!!
        }
        _shieldCrossLight = Builder(name = "ShieldCrossLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.434f, 20.744f)
                verticalLineTo(12.14f)
                horizontalLineToRelative(7.174f)
                curveToRelative(-0.062f, 0.92f, -0.143f, 1.765f, -0.252f, 2.393f)
                curveToRelative(-0.448f, 2.613f, -5.238f, 5.33f, -6.922f, 6.212f)
                moveTo(4.69f, 14.532f)
                curveToRelative(-0.109f, -0.63f, -0.19f, -1.474f, -0.255f, -2.393f)
                horizontalLineToRelative(7.171f)
                verticalLineToRelative(8.605f)
                curveToRelative(-1.683f, -0.882f, -6.465f, -3.599f, -6.916f, -6.212f)
                moveTo(8.157f, 4.366f)
                curveToRelative(0.93f, -0.622f, 1.896f, -1.255f, 3.448f, -1.355f)
                verticalLineToRelative(8.29f)
                horizontalLineTo(4.381f)
                curveToRelative(-0.117f, -2.22f, -0.14f, -4.655f, -0.145f, -5.66f)
                curveToRelative(1.784f, 0.154f, 2.873f, -0.572f, 3.921f, -1.275f)
                moveToRelative(11.647f, 1.27f)
                curveToRelative(-0.003f, 1.0f, -0.025f, 3.442f, -0.143f, 5.666f)
                horizontalLineToRelative(-7.227f)
                verticalLineTo(3.013f)
                curveToRelative(1.552f, 0.098f, 2.519f, 0.734f, 3.446f, 1.356f)
                curveToRelative(1.042f, 0.695f, 2.12f, 1.412f, 3.924f, 1.266f)
                moveToRelative(0.83f, -0.47f)
                arcToRelative(0.433f, 0.433f, 0.0f, false, false, -0.163f, -0.311f)
                arcToRelative(0.448f, 0.448f, 0.0f, false, false, -0.35f, -0.093f)
                curveToRelative(-1.745f, 0.278f, -2.69f, -0.358f, -3.782f, -1.09f)
                curveToRelative(-1.059f, -0.708f, -2.263f, -1.512f, -4.316f, -1.515f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-2.053f, 0.0f, -3.255f, 0.804f, -4.316f, 1.516f)
                curveToRelative(-1.096f, 0.73f, -2.04f, 1.37f, -3.788f, 1.086f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.35f, 0.082f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, -0.157f, 0.325f)
                curveToRelative(0.0f, 0.274f, -0.016f, 6.73f, 0.465f, 9.512f)
                curveToRelative(0.617f, 3.583f, 7.67f, 6.983f, 7.97f, 7.126f)
                curveToRelative(0.002f, 0.003f, 0.005f, 0.0f, 0.008f, 0.003f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.339f, 0.0f)
                curveToRelative(0.003f, -0.003f, 0.003f, 0.0f, 0.006f, -0.003f)
                curveToRelative(0.302f, -0.143f, 7.364f, -3.543f, 7.98f, -7.126f)
                curveToRelative(0.476f, -2.784f, 0.46f, -9.24f, 0.46f, -9.512f)
            }
        }
        .build()
        return _shieldCrossLight!!
    }

private var _shieldCrossLight: ImageVector? = null
