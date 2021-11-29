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

public val LightGroup.ChipSimCardLight: ImageVector
    get() {
        if (_chipSimCardLight != null) {
            return _chipSimCardLight!!
        }
        _chipSimCardLight = Builder(name = "ChipSimCardLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.066f, 2.0f)
                curveToRelative(0.454f, 0.0f, 0.977f, 0.216f, 1.29f, 0.536f)
                lineToRelative(3.73f, 3.784f)
                curveToRelative(0.348f, 0.356f, 0.559f, 0.82f, 0.559f, 1.252f)
                verticalLineToRelative(9.784f)
                curveToRelative(0.0f, 0.216f, -0.141f, 0.356f, -0.348f, 0.356f)
                curveToRelative(-0.211f, 0.0f, -0.348f, -0.144f, -0.348f, -0.356f)
                lineTo(18.949f, 7.608f)
                curveToRelative(0.0f, -0.252f, -0.14f, -0.536f, -0.347f, -0.752f)
                lineToRelative(-3.73f, -3.82f)
                curveToRelative(-0.212f, -0.18f, -0.524f, -0.32f, -0.802f, -0.32f)
                lineTo(6.746f, 2.716f)
                curveToRelative(-0.559f, 0.0f, -1.047f, 0.5f, -1.047f, 1.108f)
                verticalLineToRelative(17.464f)
                horizontalLineToRelative(13.602f)
                curveToRelative(0.21f, 0.0f, 0.347f, 0.144f, 0.347f, 0.356f)
                reflectiveCurveToRelative(-0.136f, 0.356f, -0.347f, 0.356f)
                lineTo(5.0f, 21.964f)
                lineTo(5.0f, 3.82f)
                curveTo(5.0f, 2.82f, 5.766f, 2.0f, 6.742f, 2.0f)
                horizontalLineToRelative(7.324f)
                close()
                moveTo(19.301f, 18.784f)
                curveToRelative(0.386f, 0.0f, 0.699f, 0.32f, 0.699f, 0.716f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, true, -0.7f, 0.716f)
                curveToRelative(-0.385f, 0.0f, -0.698f, -0.32f, -0.698f, -0.716f)
                curveToRelative(0.0f, -0.395f, 0.313f, -0.716f, 0.699f, -0.716f)
                close()
                moveTo(15.816f, 9.86f)
                curveToRelative(0.489f, 0.0f, 1.047f, 0.392f, 1.047f, 0.964f)
                verticalLineToRelative(8.32f)
                horizontalLineToRelative(-9.07f)
                verticalLineToRelative(-8.32f)
                curveToRelative(0.0f, -0.572f, 0.559f, -0.964f, 1.047f, -0.964f)
                horizontalLineToRelative(6.976f)
                close()
                moveTo(15.812f, 10.568f)
                lineTo(8.84f, 10.568f)
                curveToRelative(-0.176f, 0.0f, -0.348f, 0.144f, -0.348f, 0.252f)
                verticalLineToRelative(7.608f)
                horizontalLineToRelative(7.668f)
                lineTo(16.16f, 10.82f)
                curveToRelative(0.0f, -0.108f, -0.176f, -0.252f, -0.348f, -0.252f)
                close()
            }
        }
        .build()
        return _chipSimCardLight!!
    }

private var _chipSimCardLight: ImageVector? = null
