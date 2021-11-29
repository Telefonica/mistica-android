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

public val LightGroup.BusLight: ImageVector
    get() {
        if (_busLight != null) {
            return _busLight!!
        }
        _busLight = Builder(name = "BusLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.724f, 4.595f)
                curveToRelative(0.2f, 0.009f, 2.454f, 0.06f, 4.183f, 1.808f)
                curveToRelative(1.283f, 1.3f, 1.936f, 3.174f, 1.936f, 5.575f)
                verticalLineToRelative(3.476f)
                curveToRelative(0.0f, 0.54f, -0.239f, 1.092f, -0.65f, 1.51f)
                curveToRelative(-0.412f, 0.417f, -0.953f, 0.658f, -1.488f, 0.658f)
                horizontalLineToRelative(-0.35f)
                curveToRelative(-0.398f, 1.109f, -1.367f, 1.74f, -2.756f, 1.74f)
                curveToRelative(-1.392f, 0.0f, -2.359f, -0.634f, -2.76f, -1.74f)
                lineTo(9.653f, 17.622f)
                curveToRelative(-0.4f, 1.109f, -1.37f, 1.74f, -2.76f, 1.74f)
                curveToRelative(-1.397f, 0.0f, -2.369f, -0.645f, -2.764f, -1.768f)
                arcToRelative(2.187f, 2.187f, 0.0f, false, true, -1.322f, -0.63f)
                curveToRelative(-0.414f, -0.418f, -0.65f, -0.97f, -0.65f, -1.51f)
                verticalLineToRelative(-8.69f)
                curveToRelative(0.0f, -0.543f, 0.238f, -1.095f, 0.65f, -1.512f)
                curveToRelative(0.412f, -0.42f, 0.955f, -0.658f, 1.488f, -0.658f)
                close()
                moveTo(16.596f, 14.176f)
                curveToRelative(-1.4f, 0.0f, -2.143f, 0.754f, -2.143f, 2.177f)
                curveToRelative(0.0f, 1.426f, 0.742f, 2.176f, 2.143f, 2.176f)
                curveToRelative(1.403f, 0.0f, 2.143f, -0.753f, 2.143f, -2.176f)
                reflectiveCurveToRelative(-0.742f, -2.177f, -2.143f, -2.177f)
                close()
                moveTo(6.893f, 14.176f)
                curveToRelative(-1.4f, 0.0f, -2.143f, 0.754f, -2.143f, 2.177f)
                curveToRelative(0.0f, 1.426f, 0.742f, 2.176f, 2.143f, 2.176f)
                curveToRelative(1.403f, 0.0f, 2.143f, -0.753f, 2.143f, -2.176f)
                reflectiveCurveToRelative(-0.742f, -2.177f, -2.143f, -2.177f)
                close()
                moveTo(15.303f, 11.223f)
                horizontalLineToRelative(-0.105f)
                lineToRelative(-0.067f, 0.001f)
                lineTo(2.977f, 11.224f)
                verticalLineToRelative(4.23f)
                curveToRelative(0.0f, 0.322f, 0.148f, 0.658f, 0.409f, 0.921f)
                curveToRelative(0.165f, 0.166f, 0.358f, 0.275f, 0.577f, 0.342f)
                curveToRelative(-0.011f, -0.12f, -0.028f, -0.235f, -0.028f, -0.364f)
                curveToRelative(0.0f, -1.882f, 1.106f, -3.006f, 2.96f, -3.006f)
                curveToRelative(1.855f, 0.0f, 2.962f, 1.124f, 2.962f, 3.006f)
                curveToRelative(0.0f, 0.154f, -0.02f, 0.294f, -0.034f, 0.437f)
                horizontalLineToRelative(3.849f)
                curveToRelative(-0.014f, -0.143f, -0.034f, -0.283f, -0.034f, -0.437f)
                curveToRelative(0.0f, -1.882f, 1.106f, -3.006f, 2.96f, -3.006f)
                curveToRelative(1.855f, 0.0f, 2.962f, 1.124f, 2.962f, 3.006f)
                curveToRelative(0.0f, 0.154f, -0.02f, 0.294f, -0.034f, 0.437f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.319f, 0.0f, 0.65f, -0.151f, 0.91f, -0.415f)
                curveToRelative(0.257f, -0.263f, 0.409f, -0.6f, 0.409f, -0.921f)
                verticalLineToRelative(-1.306f)
                curveToRelative(-1.296f, -2.74f, -4.892f, -2.92f, -5.722f, -2.925f)
                close()
                moveTo(15.711f, 5.426f)
                horizontalLineToRelative(-1.28f)
                verticalLineToRelative(4.969f)
                horizontalLineToRelative(0.68f)
                curveToRelative(0.163f, -0.009f, 3.866f, -0.157f, 5.914f, 2.244f)
                verticalLineToRelative(-0.661f)
                curveToRelative(0.0f, -6.471f, -5.098f, -6.552f, -5.314f, -6.552f)
                close()
                moveTo(7.901f, 5.426f)
                horizontalLineToRelative(-3.61f)
                curveToRelative(-0.317f, 0.0f, -0.647f, 0.15f, -0.908f, 0.414f)
                curveToRelative(-0.258f, 0.264f, -0.409f, 0.6f, -0.409f, 0.925f)
                verticalLineToRelative(3.63f)
                horizontalLineToRelative(4.927f)
                verticalLineToRelative(-4.97f)
                close()
                moveTo(13.613f, 5.426f)
                horizontalLineToRelative(-4.89f)
                verticalLineToRelative(4.969f)
                horizontalLineToRelative(4.89f)
                verticalLineToRelative(-4.97f)
                close()
            }
        }
        .build()
        return _busLight!!
    }

private var _busLight: ImageVector? = null
