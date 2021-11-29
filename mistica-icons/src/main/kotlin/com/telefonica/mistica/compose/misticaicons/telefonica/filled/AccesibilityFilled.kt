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

public val FilledGroup.AccesibilityFilled: ImageVector
    get() {
        if (_accesibilityFilled != null) {
            return _accesibilityFilled!!
        }
        _accesibilityFilled = Builder(name = "AccesibilityFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.619f, 15.83f)
                curveToRelative(1.65f, -0.796f, 3.286f, -2.0f, 4.894f, -3.609f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, 0.0f, -0.792f)
                curveTo(18.38f, 8.29f, 15.137f, 6.703f, 11.87f, 6.703f)
                curveToRelative(-1.235f, 0.0f, -2.468f, 0.227f, -3.695f, 0.68f)
                lineTo(2.975f, 2.186f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, false, -0.79f, 0.0f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, false, 0.0f, 0.793f)
                lineTo(7.067f, 7.86f)
                curveToRelative(-1.652f, 0.795f, -3.288f, 2.0f, -4.896f, 3.608f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, false, -0.165f, 0.398f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.165f, 0.395f)
                curveToRelative(3.134f, 3.134f, 6.378f, 4.722f, 9.644f, 4.722f)
                curveToRelative(1.235f, 0.0f, 2.468f, -0.227f, 3.695f, -0.68f)
                lineToRelative(5.199f, 5.198f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, false, 0.79f, 0.0f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, false, 0.0f, -0.792f)
                lineToRelative(-4.88f, -4.88f)
                close()
                moveTo(13.151f, 12.361f)
                lineTo(11.314f, 10.524f)
                curveToRelative(0.16f, -0.062f, 0.322f, -0.067f, 0.504f, -0.067f)
                curveToRelative(0.846f, 0.0f, 1.392f, 0.546f, 1.392f, 1.395f)
                curveToRelative(0.0f, 0.17f, -0.006f, 0.341f, -0.059f, 0.51f)
                close()
                moveTo(14.851f, 14.061f)
                lineTo(14.23f, 13.44f)
                curveToRelative(0.19f, -0.41f, 0.285f, -0.908f, 0.285f, -1.496f)
                curveToRelative(0.0f, -0.955f, -0.252f, -1.68f, -0.75f, -2.154f)
                curveToRelative(-0.474f, -0.451f, -1.168f, -0.678f, -2.065f, -0.678f)
                curveToRelative(-0.588f, 0.0f, -1.092f, 0.098f, -1.501f, 0.294f)
                lineToRelative(-0.622f, -0.622f)
                curveToRelative(0.571f, -0.341f, 1.283f, -0.515f, 2.123f, -0.515f)
                curveToRelative(2.325f, 0.0f, 3.659f, 1.339f, 3.659f, 3.675f)
                curveToRelative(-0.003f, 0.838f, -0.174f, 1.546f, -0.507f, 2.118f)
                close()
            }
        }
        .build()
        return _accesibilityFilled!!
    }

private var _accesibilityFilled: ImageVector? = null
