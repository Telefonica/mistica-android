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

public val FilledGroup.StomachFilled: ImageVector
    get() {
        if (_stomachFilled != null) {
            return _stomachFilled!!
        }
        _stomachFilled = Builder(name = "StomachFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.468f, 21.686f)
                curveToRelative(-0.894f, 0.0f, -1.74f, -0.162f, -2.507f, -0.498f)
                curveToRelative(-0.588f, -0.26f, -1.023f, -0.762f, -1.294f, -1.493f)
                curveToRelative(-0.224f, -0.608f, -0.286f, -1.308f, -0.177f, -2.084f)
                curveToRelative(0.093f, -0.65f, 0.006f, -1.009f, -0.252f, -1.073f)
                curveToRelative(-0.146f, -0.037f, -0.26f, 0.022f, -0.465f, 0.131f)
                lineToRelative(-0.123f, 0.068f)
                curveToRelative(-0.661f, 0.339f, -1.09f, 0.955f, -1.544f, 1.605f)
                curveToRelative(-0.1f, 0.145f, -0.201f, 0.291f, -0.308f, 0.437f)
                curveToRelative(-0.73f, 1.008f, -1.526f, 0.846f, -2.064f, 0.532f)
                curveToRelative(-0.868f, -0.504f, -0.79f, -1.33f, -0.625f, -1.695f)
                arcToRelative(6.342f, 6.342f, 0.0f, false, true, 3.303f, -3.577f)
                arcToRelative(6.244f, 6.244f, 0.0f, false, true, 2.958f, -0.566f)
                curveToRelative(0.664f, -0.03f, 1.725f, 0.124f, 2.423f, 0.28f)
                curveToRelative(0.19f, 0.05f, 0.355f, 0.099f, 0.507f, 0.146f)
                curveToRelative(0.918f, 0.031f, 1.199f, -0.143f, 1.294f, -0.246f)
                curveToRelative(0.151f, -0.168f, 0.098f, -0.538f, 0.042f, -0.933f)
                curveToRelative(-0.048f, -0.342f, -0.104f, -0.726f, -0.04f, -1.095f)
                arcToRelative(3.658f, 3.658f, 0.0f, false, true, 0.051f, -0.605f)
                curveToRelative(0.157f, -1.18f, 0.563f, -2.115f, 1.205f, -2.785f)
                arcToRelative(7.05f, 7.05f, 0.0f, false, true, -0.255f, -0.423f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, true, -0.519f, -4.888f)
                curveToRelative(0.188f, -0.54f, 0.846f, -1.176f, 1.93f, -0.806f)
                curveToRelative(0.538f, 0.185f, 0.774f, 0.498f, 0.874f, 0.73f)
                curveToRelative(0.182f, 0.415f, 0.062f, 0.807f, 0.017f, 0.93f)
                arcToRelative(3.466f, 3.466f, 0.0f, false, false, 0.283f, 2.606f)
                curveToRelative(0.135f, 0.243f, 0.294f, 0.47f, 0.473f, 0.666f)
                curveToRelative(0.359f, -0.016f, 0.664f, 0.009f, 0.869f, 0.034f)
                curveToRelative(0.131f, 0.02f, 0.26f, 0.042f, 0.37f, 0.05f)
                curveToRelative(2.103f, 0.348f, 4.17f, 1.877f, 3.742f, 5.143f)
                curveToRelative(-0.04f, 0.297f, -0.098f, 0.594f, -0.174f, 0.874f)
                lineToRelative(-0.008f, 0.031f)
                curveToRelative(-0.392f, 2.384f, -1.748f, 4.577f, -3.821f, 6.182f)
                curveToRelative(-1.992f, 1.516f, -4.185f, 2.322f, -6.165f, 2.322f)
            }
        }
        .build()
        return _stomachFilled!!
    }

private var _stomachFilled: ImageVector? = null
