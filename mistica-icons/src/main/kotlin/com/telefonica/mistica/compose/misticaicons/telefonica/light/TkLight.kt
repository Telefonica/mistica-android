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

public val LightGroup.TkLight: ImageVector
    get() {
        if (_tkLight != null) {
            return _tkLight!!
        }
        _tkLight = Builder(name = "TkLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 21.02f)
                curveToRelative(5.99f, 0.0f, 9.024f, -3.035f, 9.024f, -9.022f)
                curveToRelative(0.0f, -5.99f, -3.037f, -9.024f, -9.024f, -9.024f)
                curveToRelative(-5.987f, 0.0f, -9.021f, 3.034f, -9.021f, 9.024f)
                curveToRelative(0.0f, 5.984f, 3.037f, 9.021f, 9.021f, 9.021f)
                close()
                moveTo(11.992f, 2.15f)
                curveToRelative(6.444f, 0.0f, 9.848f, 3.407f, 9.848f, 9.848f)
                curveToRelative(0.0f, 6.438f, -3.404f, 9.842f, -9.848f, 9.842f)
                curveToRelative(-6.438f, 0.0f, -9.842f, -3.404f, -9.842f, -9.842f)
                curveToRelative(0.0f, -6.441f, 3.404f, -9.848f, 9.842f, -9.848f)
                close()
                moveTo(11.664f, 7.095f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.303f, 0.367f)
                lineToRelative(-0.073f, 0.37f)
                arcToRelative(0.309f, 0.309f, 0.0f, false, true, -0.302f, 0.25f)
                lineTo(8.978f, 8.082f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.17f, -0.138f, 0.307f, -0.309f, 0.307f)
                horizontalLineToRelative(-0.406f)
                arcToRelative(0.307f, 0.307f, 0.0f, false, true, -0.308f, -0.308f)
                verticalLineToRelative(-8.5f)
                lineTo(5.279f, 8.081f)
                arcToRelative(0.307f, 0.307f, 0.0f, false, true, -0.308f, -0.308f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0.0f, -0.17f, 0.138f, -0.308f, 0.308f, -0.308f)
                horizontalLineToRelative(6.385f)
                close()
                moveTo(18.974f, 16.427f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, -0.263f, 0.468f)
                horizontalLineToRelative(-0.457f)
                arcToRelative(0.313f, 0.313f, 0.0f, false, true, -0.266f, -0.151f)
                lineToRelative(-2.802f, -4.693f)
                lineToRelative(-1.21f, 1.516f)
                verticalLineToRelative(3.017f)
                curveToRelative(0.0f, 0.171f, -0.138f, 0.308f, -0.308f, 0.308f)
                horizontalLineToRelative(-0.401f)
                arcToRelative(0.307f, 0.307f, 0.0f, false, true, -0.308f, -0.308f)
                lineTo(12.959f, 7.41f)
                curveToRelative(0.0f, -0.171f, 0.137f, -0.308f, 0.308f, -0.308f)
                horizontalLineToRelative(0.4f)
                curveToRelative(0.171f, 0.0f, 0.309f, 0.137f, 0.309f, 0.308f)
                verticalLineToRelative(4.603f)
                lineToRelative(3.81f, -4.797f)
                arcToRelative(0.311f, 0.311f, 0.0f, false, true, 0.241f, -0.114f)
                horizontalLineToRelative(0.47f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.24f, 0.501f)
                lineToRelative(-2.884f, 3.642f)
                lineToRelative(3.12f, 5.183f)
                close()
            }
        }
        .build()
        return _tkLight!!
    }

private var _tkLight: ImageVector? = null
