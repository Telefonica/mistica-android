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

public val LightGroup.MouseLight: ImageVector
    get() {
        if (_mouseLight != null) {
            return _mouseLight!!
        }
        _mouseLight = Builder(name = "MouseLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.22f, 2.156f)
                curveToRelative(0.157f, 0.0f, 0.283f, 0.126f, 0.283f, 0.283f)
                curveToRelative(0.0f, 0.446f, 0.202f, 0.81f, 0.597f, 1.079f)
                curveToRelative(0.429f, 0.29f, 1.053f, 0.445f, 1.807f, 0.445f)
                horizontalLineToRelative(1.974f)
                curveToRelative(1.0f, 0.0f, 1.48f, 0.53f, 1.706f, 0.975f)
                curveToRelative(0.216f, 0.426f, 0.236f, 0.85f, 0.238f, 0.933f)
                verticalLineToRelative(0.665f)
                curveToRelative(3.401f, 0.107f, 5.197f, 1.979f, 5.197f, 5.433f)
                verticalLineToRelative(4.437f)
                curveToRelative(0.0f, 1.873f, -0.426f, 3.215f, -1.303f, 4.098f)
                curveToRelative(-0.9f, 0.902f, -2.272f, 1.339f, -4.204f, 1.339f)
                curveToRelative(-3.603f, 0.0f, -5.507f, -1.88f, -5.507f, -5.437f)
                lineToRelative(-0.001f, -3.355f)
                arcToRelative(0.276f, 0.276f, 0.0f, false, true, 0.0f, -0.074f)
                verticalLineToRelative(-1.008f)
                curveToRelative(0.0f, -3.473f, 1.816f, -5.347f, 5.253f, -5.434f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0.0f, -0.003f, -0.006f, -0.362f, -0.185f, -0.71f)
                curveToRelative(-0.224f, -0.43f, -0.628f, -0.649f, -1.194f, -0.649f)
                lineTo(8.907f, 4.526f)
                curveToRelative(-1.804f, 0.0f, -2.97f, -0.818f, -2.97f, -2.087f)
                curveToRelative(0.0f, -0.157f, 0.127f, -0.283f, 0.283f, -0.283f)
                close()
                moveTo(17.46f, 13.333f)
                lineToRelative(0.313f, -0.04f)
                arcToRelative(37.988f, 37.988f, 0.0f, false, true, -5.204f, 0.356f)
                horizontalLineToRelative(-0.112f)
                curveToRelative(-1.629f, 0.0f, -3.27f, -0.106f, -4.885f, -0.313f)
                verticalLineToRelative(3.072f)
                curveToRelative(0.0f, 3.233f, 1.663f, 4.871f, 4.944f, 4.871f)
                curveToRelative(1.775f, 0.0f, 3.02f, -0.383f, 3.803f, -1.173f)
                curveToRelative(0.768f, -0.773f, 1.14f, -1.983f, 1.14f, -3.7f)
                verticalLineToRelative(-3.073f)
                close()
                moveTo(12.516f, 7.097f)
                curveToRelative(-3.28f, 0.0f, -4.944f, 1.64f, -4.944f, 4.872f)
                verticalLineToRelative(0.798f)
                lineToRelative(0.488f, 0.063f)
                curveToRelative(1.475f, 0.172f, 2.969f, 0.256f, 4.45f, 0.256f)
                horizontalLineToRelative(0.056f)
                arcToRelative(37.89f, 37.89f, 0.0f, false, false, 4.894f, -0.318f)
                verticalLineToRelative(-0.8f)
                curveToRelative(-0.003f, -3.232f, -1.667f, -4.87f, -4.944f, -4.87f)
                close()
                moveTo(12.516f, 8.484f)
                curveToRelative(0.156f, 0.0f, 0.282f, 0.126f, 0.282f, 0.283f)
                verticalLineToRelative(2.96f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, true, -0.282f, 0.284f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, -0.283f, -0.283f)
                lineTo(12.233f, 8.767f)
                curveToRelative(0.0f, -0.157f, 0.126f, -0.283f, 0.283f, -0.283f)
                close()
            }
        }
        .build()
        return _mouseLight!!
    }

private var _mouseLight: ImageVector? = null
