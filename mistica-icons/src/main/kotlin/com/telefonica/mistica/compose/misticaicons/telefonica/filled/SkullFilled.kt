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

public val FilledGroup.SkullFilled: ImageVector
    get() {
        if (_skullFilled != null) {
            return _skullFilled!!
        }
        _skullFilled = Builder(name = "SkullFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.88f, 13.95f)
                lineToRelative(-0.134f, 0.002f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-1.334f, -0.02f, -2.888f, -0.812f, -2.888f, -2.986f)
                curveToRelative(0.0f, -0.131f, 0.005f, -0.257f, 0.016f, -0.378f)
                curveToRelative(0.169f, -1.893f, 1.642f, -2.58f, 2.855f, -2.59f)
                curveToRelative(0.073f, 0.0f, 0.168f, 0.0f, 0.243f, 0.002f)
                curveToRelative(1.247f, 0.028f, 2.653f, 0.706f, 2.86f, 2.515f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.026f, 0.468f)
                curveToRelative(0.005f, 2.149f, -1.55f, 2.941f, -2.877f, 2.967f)
                moveToRelative(-2.465f, 2.66f)
                arcToRelative(0.653f, 0.653f, 0.0f, false, true, -0.854f, -0.344f)
                lineToRelative(-0.365f, -0.857f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, true, 0.348f, -0.846f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, true, 0.854f, 0.345f)
                lineToRelative(0.361f, 0.857f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, -0.344f, 0.846f)
                moveToRelative(-1.854f, -1.202f)
                lineToRelative(-0.365f, 0.854f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, -0.854f, 0.345f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, true, -0.35f, -0.843f)
                verticalLineToRelative(-0.003f)
                lineToRelative(0.364f, -0.857f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.854f, -0.345f)
                curveToRelative(0.337f, 0.143f, 0.49f, 0.521f, 0.35f, 0.849f)
                moveToRelative(-3.476f, -1.46f)
                lineToRelative(-0.134f, 0.003f)
                horizontalLineToRelative(-0.098f)
                curveToRelative(-1.333f, -0.02f, -2.888f, -0.812f, -2.888f, -2.986f)
                curveToRelative(0.0f, -0.131f, 0.006f, -0.257f, 0.017f, -0.378f)
                curveToRelative(0.168f, -1.893f, 1.644f, -2.58f, 2.854f, -2.59f)
                curveToRelative(0.081f, -0.004f, 0.171f, 0.0f, 0.244f, 0.002f)
                curveToRelative(1.246f, 0.028f, 2.652f, 0.706f, 2.863f, 2.515f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.025f, 0.468f)
                curveToRelative(0.0f, 2.149f, -1.552f, 2.941f, -2.883f, 2.967f)
                moveToRelative(4.16f, -11.939f)
                curveTo(11.973f, 2.0f, 11.665f, 2.0f, 11.385f, 2.0f)
                curveToRelative(-1.81f, 0.008f, -8.543f, 0.63f, -8.543f, 8.922f)
                curveToRelative(0.0f, 4.184f, 1.734f, 6.428f, 3.68f, 7.613f)
                verticalLineToRelative(0.647f)
                curveToRelative(0.0f, 0.82f, 0.241f, 1.462f, 0.723f, 1.88f)
                curveToRelative(0.454f, 0.411f, 1.118f, 0.621f, 1.966f, 0.621f)
                horizontalLineToRelative(5.337f)
                curveToRelative(0.845f, 0.0f, 1.501f, -0.21f, 1.955f, -0.621f)
                curveToRelative(0.47f, -0.42f, 0.703f, -1.06f, 0.703f, -1.883f)
                verticalLineToRelative(-0.652f)
                curveToRelative(1.947f, -1.194f, 3.68f, -3.42f, 3.68f, -7.558f)
                curveToRelative(0.0f, -8.224f, -6.88f, -8.921f, -8.64f, -8.958f)
            }
        }
        .build()
        return _skullFilled!!
    }

private var _skullFilled: ImageVector? = null
