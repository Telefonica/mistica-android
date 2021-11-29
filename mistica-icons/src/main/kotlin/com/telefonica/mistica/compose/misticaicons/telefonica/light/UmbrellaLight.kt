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

public val LightGroup.UmbrellaLight: ImageVector
    get() {
        if (_umbrellaLight != null) {
            return _umbrellaLight!!
        }
        _umbrellaLight = Builder(name = "UmbrellaLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.89f, 11.411f)
                arcToRelative(0.521f, 0.521f, 0.0f, false, true, -0.403f, 0.182f)
                lineToRelative(-2.025f, -0.005f)
                curveToRelative(-0.69f, -4.12f, -2.745f, -6.213f, -4.34f, -7.233f)
                curveToRelative(1.995f, 0.305f, 3.6f, 1.053f, 4.777f, 2.252f)
                curveToRelative(1.08f, 1.104f, 1.784f, 2.586f, 2.098f, 4.404f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, -0.107f, 0.4f)
                close()
                moveTo(12.506f, 4.448f)
                curveToRelative(1.27f, 0.51f, 4.225f, 2.215f, 5.096f, 7.137f)
                lineToRelative(-5.096f, -0.014f)
                lineTo(12.506f, 4.448f)
                close()
                moveTo(6.4f, 11.557f)
                curveToRelative(0.835f, -4.765f, 4.034f, -6.594f, 5.263f, -7.126f)
                verticalLineToRelative(7.137f)
                lineTo(6.4f, 11.557f)
                close()
                moveTo(3.249f, 11.467f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.24f, -0.515f)
                curveToRelative(0.321f, -1.815f, 1.04f, -3.292f, 2.133f, -4.384f)
                curveToRelative(1.222f, -1.232f, 2.902f, -1.98f, 5.0f, -2.25f)
                curveToRelative(-1.644f, 1.048f, -3.935f, 3.208f, -4.6f, 7.236f)
                lineToRelative(-2.013f, -0.006f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, -0.28f, -0.08f)
                close()
                moveTo(21.826f, 10.871f)
                curveToRelative(-0.34f, -1.984f, -1.12f, -3.611f, -2.322f, -4.84f)
                curveToRelative(-1.639f, -1.673f, -3.99f, -2.567f, -6.998f, -2.66f)
                verticalLineToRelative(-0.797f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.423f, -0.418f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, -0.423f, 0.418f)
                verticalLineToRelative(0.804f)
                curveToRelative(-3.056f, 0.053f, -5.456f, 0.927f, -7.12f, 2.61f)
                curveToRelative(-1.216f, 1.213f, -2.011f, 2.838f, -2.364f, 4.82f)
                arcToRelative(1.343f, 1.343f, 0.0f, false, false, 0.625f, 1.368f)
                curveToRelative(0.21f, 0.129f, 0.465f, 0.202f, 0.72f, 0.204f)
                lineToRelative(8.14f, 0.02f)
                verticalLineToRelative(7.378f)
                curveToRelative(0.008f, 1.14f, 0.952f, 2.065f, 2.112f, 2.065f)
                curveToRelative(1.162f, 0.0f, 2.109f, -0.933f, 2.109f, -2.079f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.423f, -0.417f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, -0.423f, 0.417f)
                curveToRelative(0.0f, 0.686f, -0.569f, 1.247f, -1.266f, 1.247f)
                curveToRelative(-0.698f, 0.0f, -1.266f, -0.56f, -1.266f, -1.247f)
                verticalLineToRelative(-7.358f)
                lineToRelative(7.977f, 0.022f)
                curveToRelative(0.41f, 0.0f, 0.793f, -0.177f, 1.059f, -0.49f)
                curveToRelative(0.25f, -0.308f, 0.353f, -0.698f, 0.286f, -1.067f)
                close()
            }
        }
        .build()
        return _umbrellaLight!!
    }

private var _umbrellaLight: ImageVector? = null
