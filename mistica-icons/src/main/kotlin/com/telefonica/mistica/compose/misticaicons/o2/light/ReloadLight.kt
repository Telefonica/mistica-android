package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.ReloadLight: ImageVector
    get() {
        if (_reloadLight != null) {
            return _reloadLight!!
        }
        _reloadLight = Builder(name = "ReloadLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.805f, 4.755f)
                lineToRelative(0.52f, 3.663f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, -0.308f, 0.423f)
                horizontalLineToRelative(-0.048f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.356f, -0.322f)
                lineToRelative(-0.348f, -2.5f)
                curveTo(3.905f, 7.69f, 3.17f, 9.783f, 3.17f, 11.998f)
                curveToRelative(0.0f, 5.095f, 3.958f, 9.248f, 8.832f, 9.248f)
                curveToRelative(0.908f, 0.0f, 1.795f, -0.142f, 2.655f, -0.422f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, 0.436f, 0.247f)
                curveToRelative(0.056f, 0.2f, -0.048f, 0.414f, -0.236f, 0.473f)
                arcToRelative(9.15f, 9.15f, 0.0f, false, true, -2.875f, 0.456f)
                curveToRelative(-5.27f, 0.0f, -9.551f, -4.484f, -9.551f, -10.002f)
                curveToRelative(0.0f, -2.315f, 0.755f, -4.522f, 2.13f, -6.293f)
                lineToRelative(-2.154f, 0.323f)
                curveToRelative(-0.192f, 0.025f, -0.372f, -0.118f, -0.404f, -0.323f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, 0.308f, -0.423f)
                lineToRelative(3.494f, -0.527f)
                close()
                moveTo(16.688f, 19.55f)
                curveToRelative(0.397f, 0.0f, 0.72f, 0.337f, 0.72f, 0.753f)
                curveToRelative(0.0f, 0.417f, -0.323f, 0.754f, -0.72f, 0.754f)
                curveToRelative(-0.398f, 0.0f, -0.72f, -0.337f, -0.72f, -0.754f)
                curveToRelative(0.0f, -0.416f, 0.322f, -0.753f, 0.72f, -0.753f)
                close()
                moveTo(12.002f, 2.0f)
                curveToRelative(5.27f, 0.0f, 9.551f, 4.484f, 9.551f, 10.002f)
                curveToRelative(0.0f, 2.311f, -0.755f, 4.51f, -2.123f, 6.28f)
                lineToRelative(2.155f, -0.322f)
                curveToRelative(0.196f, -0.038f, 0.38f, 0.109f, 0.412f, 0.322f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, -0.308f, 0.423f)
                lineToRelative(-3.498f, 0.528f)
                lineToRelative(-0.504f, -3.664f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, 0.308f, -0.423f)
                curveToRelative(0.192f, -0.025f, 0.372f, 0.118f, 0.404f, 0.323f)
                lineToRelative(0.348f, 2.5f)
                curveToRelative(1.351f, -1.671f, 2.087f, -3.756f, 2.087f, -5.971f)
                curveToRelative(0.0f, -5.095f, -3.958f, -9.249f, -8.828f, -9.24f)
                arcTo(8.52f, 8.52f, 0.0f, false, false, 7.284f, 4.18f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, -0.496f, -0.117f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, 0.112f, -0.52f)
                arcTo(9.214f, 9.214f, 0.0f, false, true, 12.002f, 2.0f)
                close()
            }
        }
        .build()
        return _reloadLight!!
    }

private var _reloadLight: ImageVector? = null
