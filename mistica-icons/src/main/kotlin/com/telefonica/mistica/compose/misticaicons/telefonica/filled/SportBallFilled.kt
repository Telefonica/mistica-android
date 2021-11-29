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

public val FilledGroup.SportBallFilled: ImageVector
    get() {
        if (_sportBallFilled != null) {
            return _sportBallFilled!!
        }
        _sportBallFilled = Builder(name = "SportBallFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.381f, 19.23f)
                curveToRelative(-1.118f, -1.734f, -1.82f, -4.143f, -1.947f, -6.717f)
                horizontalLineToRelative(5.252f)
                curveToRelative(-0.173f, 2.67f, -1.417f, 5.039f, -3.305f, 6.717f)
                close()
                moveTo(12.599f, 21.675f)
                verticalLineToRelative(-9.162f)
                horizontalLineToRelative(2.39f)
                curveToRelative(0.137f, 2.89f, 0.944f, 5.627f, 2.246f, 7.593f)
                arcToRelative(9.708f, 9.708f, 0.0f, false, true, -4.636f, 1.57f)
                close()
                moveTo(12.6f, 2.0f)
                curveToRelative(1.65f, 0.126f, 3.19f, 0.655f, 4.519f, 1.504f)
                curveToRelative(-1.272f, 2.003f, -2.034f, 4.695f, -2.13f, 7.563f)
                lineTo(12.6f, 11.067f)
                lineTo(12.6f, 2.0f)
                close()
                moveTo(21.687f, 11.067f)
                horizontalLineToRelative(-5.252f)
                curveToRelative(0.095f, -2.524f, 0.762f, -4.952f, 1.84f, -6.706f)
                arcToRelative(9.847f, 9.847f, 0.0f, false, true, 3.412f, 6.706f)
                close()
                moveTo(11.155f, 11.067f)
                lineTo(8.658f, 11.067f)
                curveToRelative(-0.095f, -2.86f, -0.848f, -5.549f, -2.109f, -7.543f)
                arcToRelative(9.733f, 9.733f, 0.0f, false, true, 4.605f, -1.521f)
                verticalLineToRelative(9.064f)
                close()
                moveTo(11.155f, 21.687f)
                arcToRelative(9.914f, 9.914f, 0.0f, false, true, -4.75f, -1.609f)
                curveToRelative(1.319f, -1.986f, 2.111f, -4.663f, 2.246f, -7.565f)
                horizontalLineToRelative(2.504f)
                verticalLineToRelative(9.173f)
                close()
                moveTo(2.0f, 12.512f)
                horizontalLineToRelative(5.204f)
                curveToRelative(-0.123f, 2.543f, -0.826f, 4.944f, -1.935f, 6.677f)
                arcTo(9.899f, 9.899f, 0.0f, false, true, 2.0f, 12.513f)
                close()
                moveTo(5.392f, 4.388f)
                curveToRelative(1.079f, 1.762f, 1.726f, 4.135f, 1.82f, 6.678f)
                horizontalLineToRelative(-5.2f)
                arcToRelative(9.824f, 9.824f, 0.0f, false, true, 3.38f, -6.678f)
                close()
            }
        }
        .build()
        return _sportBallFilled!!
    }

private var _sportBallFilled: ImageVector? = null
