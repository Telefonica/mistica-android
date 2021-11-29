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

public val FilledGroup.LungsFilled: ImageVector
    get() {
        if (_lungsFilled != null) {
            return _lungsFilled!!
        }
        _lungsFilled = Builder(name = "LungsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.75f, 11.448f)
                lineToRelative(-1.176f, 0.594f)
                curveToRelative(0.0f, -0.285f, 0.0f, -0.563f, -0.006f, -0.832f)
                lineToRelative(0.768f, -0.386f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.297f, -0.488f)
                verticalLineToRelative(-5.88f)
                horizontalLineToRelative(0.74f)
                verticalLineToRelative(5.894f)
                curveToRelative(0.0f, 0.208f, 0.114f, 0.395f, 0.296f, 0.488f)
                lineToRelative(0.762f, 0.386f)
                curveToRelative(-0.003f, 0.27f, -0.005f, 0.547f, -0.005f, 0.832f)
                lineToRelative(-1.202f, -0.608f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.473f, 0.0f)
                moveToRelative(9.834f, 3.415f)
                curveToRelative(-0.588f, -3.47f, -3.092f, -6.392f, -3.437f, -6.779f)
                curveToRelative(-0.498f, -0.756f, -1.193f, -1.123f, -2.12f, -1.123f)
                curveToRelative(-1.454f, 0.0f, -1.989f, 0.832f, -2.182f, 1.367f)
                curveToRelative(-0.087f, 0.17f, -0.165f, 0.378f, -0.241f, 0.644f)
                curveToRelative(-0.062f, 0.219f, -0.107f, 0.591f, -0.132f, 1.06f)
                lineToRelative(-0.033f, -0.018f)
                verticalLineTo(4.317f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, -0.93f, -0.947f)
                horizontalLineToRelative(-1.014f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, -0.93f, 0.947f)
                verticalLineTo(10.0f)
                lineToRelative(-0.034f, 0.017f)
                curveToRelative(-0.028f, -0.482f, -0.07f, -0.865f, -0.134f, -1.09f)
                verticalLineToRelative(-0.002f)
                arcToRelative(3.503f, 3.503f, 0.0f, false, false, -0.241f, -0.642f)
                curveToRelative(-0.19f, -0.535f, -0.726f, -1.367f, -2.18f, -1.367f)
                curveToRelative(-0.927f, 0.0f, -1.621f, 0.367f, -2.12f, 1.123f)
                curveToRelative(-0.345f, 0.39f, -2.849f, 3.309f, -3.437f, 6.782f)
                curveToRelative(-0.465f, 2.75f, -0.31f, 4.347f, 0.499f, 5.18f)
                curveToRelative(0.084f, 0.086f, 0.543f, 0.517f, 1.274f, 0.548f)
                curveToRelative(0.045f, 0.003f, 0.09f, 0.003f, 0.132f, 0.003f)
                curveToRelative(1.039f, 0.0f, 1.68f, -0.549f, 2.033f, -0.849f)
                lineToRelative(0.079f, -0.067f)
                curveToRelative(0.3f, -0.25f, 0.38f, -0.316f, 0.717f, -0.316f)
                curveToRelative(0.409f, 0.002f, 1.485f, -0.09f, 1.647f, -0.135f)
                curveToRelative(1.064f, -0.28f, 1.65f, -1.123f, 1.65f, -2.361f)
                curveToRelative(0.03f, -0.695f, 0.087f, -2.107f, 0.112f, -3.56f)
                lineToRelative(1.428f, -0.72f)
                lineToRelative(1.454f, 0.734f)
                curveToRelative(0.025f, 1.462f, 0.081f, 2.882f, 0.112f, 3.577f)
                curveToRelative(0.0f, 1.252f, 0.586f, 2.095f, 1.645f, 2.372f)
                curveToRelative(0.17f, 0.048f, 1.254f, 0.137f, 1.644f, 0.137f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.34f, 0.0f, 0.42f, 0.068f, 0.717f, 0.317f)
                lineToRelative(0.079f, 0.067f)
                curveToRelative(0.353f, 0.3f, 0.994f, 0.849f, 2.034f, 0.849f)
                curveToRelative(0.042f, 0.0f, 0.086f, -0.003f, 0.131f, -0.003f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, 1.277f, -0.552f)
                curveToRelative(0.81f, -0.834f, 0.961f, -2.431f, 0.496f, -5.179f)
            }
        }
        .build()
        return _lungsFilled!!
    }

private var _lungsFilled: ImageVector? = null
