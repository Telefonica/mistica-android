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

public val LightGroup.ImportLight: ImageVector
    get() {
        if (_importLight != null) {
            return _importLight!!
        }
        _importLight = Builder(name = "ImportLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.365f, 11.629f)
                curveToRelative(0.22f, 0.0f, 0.364f, 0.147f, 0.364f, 0.371f)
                verticalLineToRelative(8.147f)
                curveToRelative(0.0f, 0.629f, 0.473f, 1.11f, 1.09f, 1.11f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.618f, 0.0f, 1.09f, -0.481f, 1.09f, -1.11f)
                verticalLineToRelative(-5.555f)
                curveToRelative(0.0f, -0.22f, 0.145f, -0.372f, 0.366f, -0.372f)
                curveToRelative(0.216f, 0.0f, 0.364f, 0.147f, 0.364f, 0.372f)
                verticalLineToRelative(5.555f)
                curveTo(21.635f, 21.184f, 20.838f, 22.0f, 19.82f, 22.0f)
                horizontalLineToRelative(-16.0f)
                curveTo(2.803f, 22.0f, 2.0f, 21.184f, 2.0f, 20.147f)
                lineTo(2.0f, 12.0f)
                curveToRelative(0.0f, -0.22f, 0.144f, -0.371f, 0.365f, -0.371f)
                close()
                moveTo(13.815f, 2.0f)
                curveToRelative(0.217f, 0.0f, 0.365f, 0.147f, 0.365f, 0.371f)
                verticalLineToRelative(9.074f)
                horizontalLineToRelative(2.545f)
                curveToRelative(0.473f, 0.0f, 0.874f, 0.298f, 1.09f, 0.78f)
                curveToRelative(0.217f, 0.518f, 0.109f, 1.146f, -0.292f, 1.518f)
                lineToRelative(-5.703f, 5.812f)
                lineToRelative(-5.712f, -5.816f)
                curveToRelative(-0.4f, -0.408f, -0.509f, -1.0f, -0.292f, -1.519f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, true, 1.09f, -0.78f)
                horizontalLineToRelative(2.549f)
                lineTo(9.455f, 2.372f)
                curveToRelative(0.0f, -0.22f, 0.144f, -0.371f, 0.365f, -0.371f)
                curveToRelative(0.216f, 0.0f, 0.364f, 0.147f, 0.364f, 0.371f)
                verticalLineToRelative(9.813f)
                lineTo(6.91f, 12.185f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, false, -0.401f, 0.298f)
                curveToRelative(-0.072f, 0.22f, -0.072f, 0.518f, 0.108f, 0.738f)
                lineToRelative(5.203f, 5.298f)
                lineToRelative(5.198f, -5.294f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, false, 0.108f, -0.738f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.4f, -0.298f)
                lineTo(13.45f, 12.189f)
                lineTo(13.45f, 2.37f)
                curveToRelative(0.0f, -0.22f, 0.144f, -0.371f, 0.365f, -0.371f)
                close()
                moveTo(21.275f, 11.633f)
                curveToRelative(0.4f, 0.0f, 0.725f, 0.33f, 0.725f, 0.738f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, true, -0.725f, 0.74f)
                curveToRelative(-0.401f, 0.0f, -0.726f, -0.332f, -0.726f, -0.74f)
                reflectiveCurveToRelative(0.325f, -0.738f, 0.726f, -0.738f)
                close()
            }
        }
        .build()
        return _importLight!!
    }

private var _importLight: ImageVector? = null
