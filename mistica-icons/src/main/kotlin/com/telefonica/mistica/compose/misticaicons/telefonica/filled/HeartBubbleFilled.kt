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

public val FilledGroup.HeartBubbleFilled: ImageVector
    get() {
        if (_heartBubbleFilled != null) {
            return _heartBubbleFilled!!
        }
        _heartBubbleFilled = Builder(name = "HeartBubbleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.423f, 9.416f)
                curveToRelative(-0.193f, 0.787f, -0.569f, 1.605f, -1.118f, 2.429f)
                arcToRelative(9.802f, 9.802f, 0.0f, false, true, -1.37f, 1.66f)
                lineToRelative(-0.013f, 0.015f)
                curveToRelative(-0.06f, 0.056f, -0.258f, 0.254f, -0.432f, 0.375f)
                arcToRelative(1.347f, 1.347f, 0.0f, false, true, -0.63f, 0.232f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-0.014f, 0.0f, -0.028f, 0.003f, -0.044f, 0.003f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-0.014f, 0.0f, -0.03f, 0.0f, -0.044f, -0.003f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(1.312f, 1.312f, 0.0f, false, true, -0.633f, -0.232f)
                curveToRelative(-0.17f, -0.12f, -0.373f, -0.32f, -0.431f, -0.375f)
                arcToRelative(9.827f, 9.827f, 0.0f, false, true, -1.384f, -1.675f)
                curveToRelative(-0.546f, -0.824f, -0.922f, -1.642f, -1.118f, -2.429f)
                curveToRelative(-0.21f, -0.857f, -0.036f, -1.569f, 0.49f, -2.006f)
                curveToRelative(0.306f, -0.255f, 0.72f, -0.406f, 1.169f, -0.428f)
                curveToRelative(0.039f, -0.003f, 0.08f, -0.003f, 0.12f, -0.003f)
                curveToRelative(0.017f, 0.0f, 0.036f, 0.006f, 0.053f, 0.006f)
                curveToRelative(0.196f, 0.005f, 0.39f, 0.028f, 0.583f, 0.078f)
                curveToRelative(0.022f, 0.006f, 0.042f, 0.014f, 0.061f, 0.02f)
                curveToRelative(0.205f, 0.058f, 0.41f, 0.134f, 0.603f, 0.238f)
                curveToRelative(0.154f, 0.084f, 0.313f, 0.173f, 0.49f, 0.271f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, 0.056f, 0.014f)
                curveToRelative(0.02f, 0.0f, 0.04f, -0.005f, 0.056f, -0.014f)
                curveToRelative(0.174f, -0.1f, 0.336f, -0.187f, 0.49f, -0.274f)
                curveToRelative(0.193f, -0.104f, 0.395f, -0.18f, 0.6f, -0.238f)
                lineToRelative(0.064f, -0.02f)
                curveToRelative(0.193f, -0.05f, 0.39f, -0.073f, 0.583f, -0.078f)
                curveToRelative(0.016f, 0.0f, 0.036f, -0.006f, 0.053f, -0.006f)
                curveToRelative(0.04f, 0.0f, 0.081f, 0.0f, 0.12f, 0.003f)
                curveToRelative(0.448f, 0.022f, 0.866f, 0.174f, 1.171f, 0.429f)
                curveToRelative(0.521f, 0.44f, 0.692f, 1.15f, 0.482f, 2.008f)
                moveToRelative(3.126f, -6.574f)
                horizontalLineTo(5.137f)
                curveTo(3.41f, 2.842f, 2.0f, 4.197f, 2.0f, 5.864f)
                verticalLineToRelative(8.96f)
                curveToRelative(0.0f, 1.348f, 0.846f, 2.488f, 2.098f, 2.88f)
                verticalLineToRelative(1.863f)
                curveToRelative(0.0f, 0.717f, 0.641f, 1.32f, 1.398f, 1.32f)
                curveToRelative(0.47f, 0.0f, 0.86f, -0.197f, 1.157f, -0.575f)
                lineTo(8.64f, 17.85f)
                horizontalLineToRelative(9.91f)
                curveToRelative(1.73f, 0.0f, 3.138f, -1.356f, 3.138f, -3.025f)
                verticalLineToRelative(-8.96f)
                curveToRelative(-0.003f, -1.668f, -1.409f, -3.023f, -3.14f, -3.023f)
            }
        }
        .build()
        return _heartBubbleFilled!!
    }

private var _heartBubbleFilled: ImageVector? = null
