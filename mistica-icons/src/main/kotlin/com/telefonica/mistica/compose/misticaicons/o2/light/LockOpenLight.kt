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

public val LightGroup.LockOpenLight: ImageVector
    get() {
        if (_lockOpenLight != null) {
            return _lockOpenLight!!
        }
        _lockOpenLight = Builder(name = "LockOpenLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.504f, 2.0f)
                curveToRelative(3.001f, 0.0f, 5.453f, 2.572f, 5.457f, 5.712f)
                verticalLineToRelative(2.144f)
                horizontalLineToRelative(0.34f)
                curveToRelative(0.954f, 0.0f, 1.703f, 0.788f, 1.699f, 1.788f)
                verticalLineToRelative(8.572f)
                curveToRelative(0.0f, 1.0f, -0.748f, 1.784f, -1.703f, 1.784f)
                lineTo(6.703f, 22.0f)
                curveTo(5.748f, 22.0f, 5.0f, 21.216f, 5.0f, 20.216f)
                lineTo(5.0f, 11.64f)
                curveToRelative(0.0f, -1.0f, 0.748f, -1.784f, 1.703f, -1.784f)
                horizontalLineToRelative(10.574f)
                lineTo(17.277f, 7.712f)
                curveToRelative(0.0f, -2.748f, -2.146f, -5.0f, -4.773f, -5.0f)
                curveToRelative(-1.669f, 0.0f, -3.238f, 0.928f, -4.094f, 2.464f)
                curveToRelative(-0.1f, 0.144f, -0.305f, 0.216f, -0.477f, 0.108f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, true, -0.103f, -0.5f)
                curveTo(8.784f, 3.072f, 10.594f, 2.0f, 12.504f, 2.0f)
                close()
                moveTo(18.297f, 10.572f)
                lineTo(6.703f, 10.572f)
                curveToRelative(-0.58f, 0.0f, -1.023f, 0.464f, -1.023f, 1.072f)
                verticalLineToRelative(8.572f)
                curveToRelative(0.0f, 0.608f, 0.443f, 1.072f, 1.023f, 1.072f)
                horizontalLineToRelative(11.598f)
                curveToRelative(0.58f, 0.0f, 1.023f, -0.464f, 1.023f, -1.072f)
                horizontalLineToRelative(-0.004f)
                verticalLineToRelative(-8.572f)
                curveToRelative(0.0f, -0.608f, -0.443f, -1.072f, -1.023f, -1.072f)
                close()
                moveTo(7.387f, 6.28f)
                curveToRelative(0.377f, 0.0f, 0.683f, 0.32f, 0.683f, 0.716f)
                curveToRelative(0.0f, 0.395f, -0.306f, 0.716f, -0.683f, 0.716f)
                curveToRelative(-0.378f, 0.0f, -0.684f, -0.32f, -0.684f, -0.716f)
                curveToRelative(0.0f, -0.395f, 0.306f, -0.716f, 0.684f, -0.716f)
                close()
            }
        }
        .build()
        return _lockOpenLight!!
    }

private var _lockOpenLight: ImageVector? = null
