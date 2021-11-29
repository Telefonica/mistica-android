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

public val LightGroup.SunLight: ImageVector
    get() {
        if (_sunLight != null) {
            return _sunLight!!
        }
        _sunLight = Builder(name = "SunLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.334f, 18.143f)
                horizontalLineToRelative(-0.594f)
                curveToRelative(-1.696f, -0.025f, -5.625f, -0.655f, -5.625f, -6.044f)
                curveToRelative(0.0f, -5.378f, 3.896f, -5.995f, 5.574f, -6.012f)
                horizontalLineToRelative(0.118f)
                curveToRelative(0.168f, 0.0f, 0.34f, 0.0f, 0.49f, 0.009f)
                curveToRelative(1.704f, 0.042f, 5.659f, 0.709f, 5.659f, 6.036f)
                curveToRelative(0.002f, 5.328f, -3.93f, 5.978f, -5.622f, 6.011f)
                moveToRelative(9.088f, -6.619f)
                horizontalLineToRelative(-2.514f)
                curveToRelative(-0.042f, 0.0f, -0.084f, 0.017f, -0.128f, 0.025f)
                curveToRelative(-0.11f, -1.922f, -0.712f, -3.27f, -1.542f, -4.198f)
                curveToRelative(0.017f, -0.008f, 0.034f, -0.017f, 0.042f, -0.025f)
                lineToRelative(1.822f, -1.805f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, false, 0.0f, -0.6f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.603f, 0.0f)
                lineToRelative(-1.821f, 1.805f)
                curveToRelative(-0.009f, 0.017f, -0.017f, 0.034f, -0.026f, 0.042f)
                curveToRelative(-1.516f, -1.264f, -3.413f, -1.482f, -4.228f, -1.516f)
                verticalLineTo(2.57f)
                arcTo(0.422f, 0.422f, 0.0f, false, false, 12.0f, 2.15f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, false, -0.423f, 0.42f)
                verticalLineToRelative(2.682f)
                curveToRelative(-0.838f, 0.017f, -2.71f, 0.21f, -4.2f, 1.474f)
                curveToRelative(-0.017f, -0.016f, -0.026f, -0.033f, -0.043f, -0.05f)
                lineTo(5.572f, 4.922f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.594f, 0.0f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.0f, 0.6f)
                lineTo(6.74f, 7.275f)
                curveToRelative(0.017f, 0.008f, 0.034f, 0.016f, 0.05f, 0.033f)
                curveToRelative(-0.803f, 0.928f, -1.398f, 2.284f, -1.498f, 4.243f)
                curveToRelative(-0.034f, -0.008f, -0.068f, -0.025f, -0.101f, -0.025f)
                horizontalLineTo(2.573f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.423f, 0.42f)
                curveToRelative(0.0f, 0.238f, 0.188f, 0.42f, 0.423f, 0.42f)
                horizontalLineToRelative(2.618f)
                curveToRelative(0.033f, 0.0f, 0.058f, -0.008f, 0.086f, -0.016f)
                curveToRelative(0.05f, 1.973f, 0.592f, 3.354f, 1.357f, 4.332f)
                arcToRelative(0.176f, 0.176f, 0.0f, false, false, -0.05f, 0.034f)
                lineToRelative(-1.755f, 1.735f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, 0.0f, 0.6f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, false, 0.297f, 0.125f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, 0.272f, -0.1f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, 0.177f, -0.101f)
                lineToRelative(1.6f, -1.592f)
                curveToRelative(0.017f, -0.017f, 0.025f, -0.042f, 0.042f, -0.067f)
                curveToRelative(1.507f, 1.39f, 3.472f, 1.633f, 4.36f, 1.667f)
                verticalLineToRelative(2.438f)
                curveToRelative(0.0f, 0.227f, 0.188f, 0.42f, 0.423f, 0.42f)
                curveToRelative(0.23f, 0.0f, 0.424f, -0.193f, 0.424f, -0.42f)
                verticalLineToRelative(-2.438f)
                curveToRelative(0.832f, -0.025f, 2.872f, -0.252f, 4.422f, -1.679f)
                curveToRelative(0.017f, 0.026f, 0.033f, 0.06f, 0.059f, 0.085f)
                lineToRelative(1.591f, 1.586f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.298f, 0.117f)
                curveToRelative(0.109f, 0.0f, 0.22f, -0.033f, 0.305f, -0.117f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, false, 0.0f, -0.6f)
                lineToRelative(-1.6f, -1.586f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, -0.104f, -0.067f)
                curveToRelative(0.796f, -0.978f, 1.356f, -2.377f, 1.399f, -4.375f)
                curveToRelative(0.033f, 0.008f, 0.067f, 0.017f, 0.109f, 0.017f)
                horizontalLineToRelative(2.514f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, 0.423f, -0.42f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.418f, -0.42f)
            }
        }
        .build()
        return _sunLight!!
    }

private var _sunLight: ImageVector? = null
