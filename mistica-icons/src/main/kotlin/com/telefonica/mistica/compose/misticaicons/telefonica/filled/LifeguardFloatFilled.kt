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

public val FilledGroup.LifeguardFloatFilled: ImageVector
    get() {
        if (_lifeguardFloatFilled != null) {
            return _lifeguardFloatFilled!!
        }
        _lifeguardFloatFilled = Builder(name = "LifeguardFloatFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.913f, 20.115f)
                lineToRelative(-0.57f, -2.773f)
                curveToRelative(1.195f, -0.41f, 2.523f, -1.275f, 3.156f, -3.087f)
                lineToRelative(2.756f, 0.569f)
                curveToRelative(-0.882f, 3.37f, -3.255f, 4.753f, -5.342f, 5.29f)
                close()
                moveTo(12.247f, 16.479f)
                curveToRelative(-0.098f, 0.003f, -0.213f, 0.003f, -0.328f, 0.003f)
                horizontalLineToRelative(-0.168f)
                arcToRelative(5.681f, 5.681f, 0.0f, false, true, -1.882f, -0.359f)
                curveToRelative(-1.687f, -0.655f, -2.505f, -2.061f, -2.505f, -4.297f)
                curveToRelative(0.0f, -3.988f, 2.718f, -4.608f, 4.34f, -4.622f)
                horizontalLineToRelative(0.097f)
                curveToRelative(0.143f, 0.0f, 0.292f, 0.003f, 0.418f, 0.006f)
                curveToRelative(3.991f, 0.095f, 4.423f, 3.283f, 4.423f, 4.65f)
                curveToRelative(0.0f, 1.367f, -0.426f, 4.549f, -4.395f, 4.619f)
                close()
                moveTo(9.093f, 20.126f)
                curveToRelative(-2.081f, -0.535f, -4.446f, -1.919f, -5.334f, -5.302f)
                lineToRelative(2.76f, -0.57f)
                curveToRelative(0.59f, 1.698f, 1.778f, 2.578f, 2.907f, 3.015f)
                curveToRelative(0.081f, 0.034f, 0.16f, 0.05f, 0.241f, 0.078f)
                lineToRelative(-0.574f, 2.779f)
                close()
                moveTo(9.059f, 3.541f)
                lineToRelative(0.577f, 2.784f)
                curveTo(8.415f, 6.734f, 7.065f, 7.63f, 6.46f, 9.552f)
                lineToRelative(-2.751f, -0.569f)
                curveToRelative(0.843f, -3.518f, 3.25f, -4.916f, 5.35f, -5.442f)
                close()
                moveTo(14.933f, 3.605f)
                curveToRelative(2.1f, 0.566f, 4.476f, 1.98f, 5.339f, 5.384f)
                lineToRelative(-2.745f, 0.566f)
                curveToRelative(-0.616f, -1.86f, -1.952f, -2.757f, -3.165f, -3.185f)
                lineToRelative(0.571f, -2.765f)
                close()
                moveTo(12.415f, 2.011f)
                curveToRelative(-0.227f, -0.008f, -0.49f, -0.011f, -0.745f, -0.011f)
                horizontalLineToRelative(-0.185f)
                curveToRelative(-1.978f, 0.017f, -9.325f, 0.695f, -9.325f, 9.812f)
                curveToRelative(0.0f, 9.13f, 7.417f, 9.843f, 9.392f, 9.874f)
                curveToRelative(0.3f, 0.003f, 0.602f, 0.003f, 0.902f, -0.003f)
                curveToRelative(1.88f, -0.036f, 9.392f, -0.739f, 9.392f, -9.812f)
                curveToRelative(0.0f, -9.053f, -7.501f, -9.815f, -9.431f, -9.86f)
                close()
            }
        }
        .build()
        return _lifeguardFloatFilled!!
    }

private var _lifeguardFloatFilled: ImageVector? = null
