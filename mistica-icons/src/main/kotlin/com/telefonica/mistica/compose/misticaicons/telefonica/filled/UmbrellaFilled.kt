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

public val FilledGroup.UmbrellaFilled: ImageVector
    get() {
        if (_umbrellaFilled != null) {
            return _umbrellaFilled!!
        }
        _umbrellaFilled = Builder(name = "UmbrellaFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.557f, 4.515f)
                curveToRelative(1.387f, 0.622f, 4.233f, 2.782f, 4.877f, 7.897f)
                curveToRelative(0.003f, 0.014f, 0.011f, 0.025f, 0.011f, 0.036f)
                lineToRelative(-4.893f, -0.014f)
                curveToRelative(0.003f, 0.003f, 0.005f, -7.919f, 0.005f, -7.919f)
                close()
                moveTo(6.143f, 12.42f)
                curveToRelative(0.765f, -4.773f, 3.711f, -7.14f, 5.154f, -7.874f)
                lineToRelative(0.006f, 7.888f)
                lineToRelative(-5.16f, -0.014f)
                close()
                moveTo(21.692f, 10.695f)
                curveToRelative(0.073f, 0.417f, -0.042f, 0.86f, -0.317f, 1.204f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, true, -1.199f, 0.558f)
                lineToRelative(-1.526f, -0.003f)
                curveToRelative(0.014f, -0.062f, 0.02f, -0.126f, 0.014f, -0.19f)
                curveToRelative(-0.804f, -6.382f, -4.706f, -8.583f, -6.104f, -9.068f)
                curveToRelative(2.913f, 0.126f, 5.196f, 1.011f, 6.804f, 2.653f)
                curveToRelative(1.205f, 1.23f, 1.989f, 2.863f, 2.328f, 4.846f)
                close()
                moveTo(11.292f, 3.199f)
                curveToRelative(-1.356f, 0.574f, -5.508f, 3.11f, -6.407f, 9.213f)
                verticalLineToRelative(0.005f)
                lineToRelative(-1.314f, -0.002f)
                arcToRelative(1.636f, 1.636f, 0.0f, false, true, -0.815f, -0.233f)
                arcToRelative(1.539f, 1.539f, 0.0f, false, true, -0.706f, -1.552f)
                curveToRelative(0.353f, -1.983f, 1.152f, -3.608f, 2.37f, -4.826f)
                curveToRelative(1.625f, -1.639f, 3.939f, -2.51f, 6.871f, -2.605f)
                close()
                moveTo(15.232f, 18.835f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.62f, 0.61f)
                curveToRelative(0.0f, 1.236f, -1.02f, 2.241f, -2.272f, 2.241f)
                curveToRelative(-1.235f, 0.0f, -2.247f, -0.977f, -2.272f, -2.19f)
                lineToRelative(-0.003f, -0.042f)
                verticalLineToRelative(-7.02f)
                horizontalLineToRelative(1.238f)
                verticalLineToRelative(7.011f)
                curveToRelative(0.0f, 0.56f, 0.463f, 1.02f, 1.034f, 1.02f)
                curveToRelative(0.569f, 0.0f, 1.03f, -0.457f, 1.03f, -1.02f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, true, 0.625f, -0.61f)
                close()
                moveTo(12.541f, 3.196f)
                horizontalLineToRelative(-1.227f)
                curveToRelative(0.0f, -0.011f, -0.006f, -0.022f, -0.006f, -0.034f)
                verticalLineToRelative(-0.551f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.62f, -0.611f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.618f, 0.61f)
                verticalLineToRelative(0.55f)
                curveToRelative(0.003f, 0.014f, -0.003f, 0.022f, -0.005f, 0.036f)
                close()
            }
        }
        .build()
        return _umbrellaFilled!!
    }

private var _umbrellaFilled: ImageVector? = null
