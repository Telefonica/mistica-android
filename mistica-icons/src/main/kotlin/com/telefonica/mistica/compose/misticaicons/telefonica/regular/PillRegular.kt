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

public val RegularGroup.PillRegular: ImageVector
    get() {
        if (_pillRegular != null) {
            return _pillRegular!!
        }
        _pillRegular = Builder(name = "PillRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.144f, 11.172f)
                lineToRelative(-3.213f, 3.213f)
                curveToRelative(-0.03f, 0.006f, -0.062f, 0.0f, -0.095f, 0.011f)
                curveToRelative(-1.48f, 0.474f, -3.126f, -0.767f, -4.25f, -1.89f)
                curveToRelative(-1.666f, -1.667f, -2.26f, -3.14f, -1.815f, -4.508f)
                curveToRelative(0.009f, -0.028f, 0.006f, -0.056f, 0.011f, -0.08f)
                lineTo(12.29f, 5.41f)
                curveToRelative(0.084f, -0.095f, 0.177f, -0.185f, 0.27f, -0.272f)
                lineToRelative(0.173f, -0.168f)
                curveToRelative(1.034f, -1.033f, 2.076f, -1.568f, 3.098f, -1.585f)
                horizontalLineToRelative(0.056f)
                curveToRelative(1.04f, 0.0f, 2.1f, 0.535f, 3.154f, 1.588f)
                curveToRelative(2.09f, 2.087f, 2.12f, 4.118f, 0.104f, 6.2f)
                close()
                moveTo(11.281f, 19.035f)
                lineTo(11.197f, 19.122f)
                curveToRelative(-0.03f, 0.033f, -0.059f, 0.064f, -0.115f, 0.114f)
                curveToRelative(-2.05f, 1.922f, -4.045f, 1.852f, -6.104f, -0.204f)
                curveToRelative(-1.072f, -1.073f, -1.607f, -2.151f, -1.588f, -3.207f)
                curveToRelative(0.017f, -1.02f, 0.552f, -2.062f, 1.586f, -3.096f)
                lineToRelative(0.168f, -0.173f)
                curveToRelative(0.09f, -0.095f, 0.179f, -0.188f, 0.305f, -0.3f)
                lineToRelative(2.98f, -2.98f)
                curveToRelative(0.115f, 1.322f, 0.866f, 2.675f, 2.292f, 4.1f)
                curveToRelative(1.372f, 1.373f, 2.68f, 2.149f, 3.902f, 2.32f)
                lineToRelative(-3.342f, 3.339f)
                close()
                moveTo(19.906f, 4.105f)
                curveToRelative(-1.317f, -1.317f, -2.723f, -1.972f, -4.101f, -1.944f)
                curveToRelative(-1.35f, 0.025f, -2.675f, 0.68f, -3.941f, 1.944f)
                lineToRelative(-0.154f, 0.145f)
                curveToRelative(-0.124f, 0.118f, -0.244f, 0.233f, -0.323f, 0.328f)
                lineToRelative(-6.775f, 6.779f)
                curveToRelative(-0.124f, 0.106f, -0.241f, 0.227f, -0.362f, 0.353f)
                lineToRelative(-0.145f, 0.151f)
                curveToRelative(-1.267f, 1.266f, -1.92f, 2.591f, -1.944f, 3.939f)
                curveToRelative(-0.023f, 1.4f, 0.63f, 2.778f, 1.95f, 4.095f)
                curveToRelative(1.299f, 1.3f, 2.669f, 1.95f, 4.033f, 1.95f)
                curveToRelative(1.274f, 0.0f, 2.543f, -0.566f, 3.75f, -1.695f)
                curveToRelative(0.068f, -0.056f, 0.13f, -0.118f, 0.19f, -0.185f)
                lineToRelative(7.93f, -7.933f)
                curveToRelative(2.485f, -2.56f, 2.446f, -5.375f, -0.108f, -7.927f)
                close()
            }
        }
        .build()
        return _pillRegular!!
    }

private var _pillRegular: ImageVector? = null
