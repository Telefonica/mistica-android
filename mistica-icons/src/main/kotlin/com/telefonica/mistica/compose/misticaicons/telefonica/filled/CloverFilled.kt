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

public val FilledGroup.CloverFilled: ImageVector
    get() {
        if (_cloverFilled != null) {
            return _cloverFilled!!
        }
        _cloverFilled = Builder(name = "CloverFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.678f, 19.725f)
                curveToRelative(1.684f, 1.35f, 3.566f, 2.11f, 5.213f, 2.11f)
                curveToRelative(0.076f, 0.0f, 0.152f, -0.003f, 0.224f, -0.006f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.44f, -0.143f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, 0.163f, -0.848f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, -0.757f, -0.225f)
                curveToRelative(-1.333f, 0.04f, -2.977f, -0.63f, -4.462f, -1.823f)
                lineToRelative(-0.067f, -0.053f)
                arcToRelative(10.506f, 10.506f, 0.0f, false, true, -2.123f, -2.325f)
                curveToRelative(0.215f, 0.187f, 0.431f, 0.353f, 0.652f, 0.482f)
                curveToRelative(0.885f, 0.52f, 1.765f, 0.787f, 2.544f, 0.787f)
                curveToRelative(0.437f, 0.0f, 0.843f, -0.084f, 1.201f, -0.255f)
                curveToRelative(0.541f, -0.258f, 1.205f, -0.827f, 1.393f, -2.07f)
                curveToRelative(0.955f, -0.866f, 1.058f, -1.712f, 0.966f, -2.28f)
                curveToRelative(-0.168f, -1.048f, -1.123f, -1.998f, -2.62f, -2.603f)
                curveToRelative(-0.845f, -0.344f, -2.052f, -0.423f, -3.234f, -0.383f)
                curveToRelative(0.991f, -0.62f, 1.93f, -1.35f, 2.406f, -2.096f)
                curveToRelative(0.854f, -1.319f, 1.056f, -2.621f, 0.557f, -3.568f)
                curveToRelative(-0.272f, -0.516f, -0.865f, -1.149f, -2.173f, -1.328f)
                curveToRelative(-0.91f, -0.913f, -1.796f, -1.011f, -2.393f, -0.921f)
                curveToRelative(-1.098f, 0.16f, -2.092f, 1.072f, -2.728f, 2.498f)
                curveToRelative(-0.361f, 0.804f, -0.442f, 1.955f, -0.4f, 3.084f)
                curveToRelative(-0.65f, -0.944f, -1.418f, -1.84f, -2.2f, -2.294f)
                curveToRelative(-1.386f, -0.812f, -2.75f, -1.008f, -3.744f, -0.532f)
                curveToRelative(-0.541f, 0.258f, -1.205f, 0.826f, -1.393f, 2.07f)
                curveToRelative(-0.955f, 0.865f, -1.058f, 1.711f, -0.966f, 2.28f)
                curveToRelative(0.168f, 1.048f, 1.126f, 1.994f, 2.62f, 2.6f)
                curveToRelative(0.713f, 0.29f, 1.691f, 0.394f, 2.694f, 0.394f)
                curveToRelative(0.182f, 0.0f, 0.361f, -0.005f, 0.543f, -0.01f)
                curveToRelative(-0.991f, 0.618f, -1.933f, 1.352f, -2.409f, 2.097f)
                curveToRelative(-0.854f, 1.32f, -1.056f, 2.622f, -0.557f, 3.569f)
                curveToRelative(0.271f, 0.515f, 0.868f, 1.148f, 2.173f, 1.325f)
                curveToRelative(0.746f, 0.748f, 1.474f, 0.946f, 2.042f, 0.946f)
                curveToRelative(0.124f, 0.0f, 0.244f, -0.008f, 0.35f, -0.025f)
                curveToRelative(1.101f, -0.16f, 2.096f, -1.073f, 2.729f, -2.498f)
                curveToRelative(0.182f, -0.404f, 0.291f, -0.9f, 0.353f, -1.429f)
                arcToRelative(11.694f, 11.694f, 0.0f, false, false, 2.899f, 3.417f)
            }
        }
        .build()
        return _cloverFilled!!
    }

private var _cloverFilled: ImageVector? = null
