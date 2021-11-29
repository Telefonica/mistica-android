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

public val LightGroup.TshirtLight: ImageVector
    get() {
        if (_tshirtLight != null) {
            return _tshirtLight!!
        }
        _tshirtLight = Builder(name = "TshirtLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.476f, 10.104f)
                lineTo(17.7f, 9.242f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.392f, 0.022f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.188f, 0.35f)
                lineToRelative(0.034f, 11.406f)
                lineTo(7.1f, 21.02f)
                lineToRelative(0.034f, -11.406f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.58f, -0.373f)
                lineToRelative(-1.82f, 0.875f)
                lineTo(3.08f, 6.435f)
                lineToRelative(5.476f, -3.182f)
                curveToRelative(0.232f, 1.927f, 1.479f, 2.977f, 3.571f, 2.977f)
                curveToRelative(2.087f, 0.0f, 3.328f, -1.05f, 3.563f, -2.963f)
                lineToRelative(5.238f, 3.17f)
                lineToRelative(-1.453f, 3.667f)
                close()
                moveTo(21.644f, 5.911f)
                lineTo(15.54f, 2.214f)
                curveToRelative(-0.003f, -0.003f, -0.008f, -0.003f, -0.011f, -0.003f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, false, -0.098f, -0.034f)
                lineToRelative(-0.07f, -0.014f)
                curveToRelative(-0.009f, 0.0f, -0.014f, -0.005f, -0.023f, -0.005f)
                curveToRelative(-0.014f, 0.0f, -0.025f, 0.005f, -0.039f, 0.008f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, -0.1f, 0.02f)
                arcToRelative(0.456f, 0.456f, 0.0f, false, false, -0.138f, 0.086f)
                curveToRelative(-0.006f, 0.003f, -0.011f, 0.012f, -0.017f, 0.017f)
                curveToRelative(-0.02f, 0.023f, -0.045f, 0.04f, -0.059f, 0.068f)
                curveToRelative(-0.008f, 0.016f, -0.01f, 0.03f, -0.016f, 0.047f)
                curveToRelative(0.0f, 0.003f, -0.003f, 0.006f, -0.003f, 0.006f)
                arcToRelative(0.386f, 0.386f, 0.0f, false, false, -0.03f, 0.16f)
                curveToRelative(0.0f, 1.91f, -0.917f, 2.837f, -2.805f, 2.837f)
                curveToRelative(-1.885f, 0.0f, -2.801f, -0.93f, -2.801f, -2.84f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, -0.608f, -0.356f)
                lineTo(2.361f, 5.908f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.168f, 0.527f)
                lineToRelative(1.975f, 4.4f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, 0.543f, 0.202f)
                lineToRelative(1.613f, -0.773f)
                lineToRelative(-0.033f, 11.168f)
                curveToRelative(0.0f, 0.11f, 0.042f, 0.216f, 0.117f, 0.291f)
                curveToRelative(0.076f, 0.079f, 0.18f, 0.12f, 0.286f, 0.12f)
                horizontalLineToRelative(10.869f)
                curveToRelative(0.106f, 0.0f, 0.21f, -0.041f, 0.285f, -0.12f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, false, 0.118f, -0.29f)
                lineToRelative(-0.034f, -11.163f)
                lineToRelative(1.583f, 0.767f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, 0.552f, -0.218f)
                lineToRelative(1.745f, -4.398f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.168f, -0.51f)
                close()
            }
        }
        .build()
        return _tshirtLight!!
    }

private var _tshirtLight: ImageVector? = null
