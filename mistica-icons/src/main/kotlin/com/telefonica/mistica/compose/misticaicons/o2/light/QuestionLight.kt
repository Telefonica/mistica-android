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

public val LightGroup.QuestionLight: ImageVector
    get() {
        if (_questionLight != null) {
            return _questionLight!!
        }
        _questionLight = Builder(name = "QuestionLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                arcToRelative(9.925f, 9.925f, 0.0f, false, true, -1.536f, 5.32f)
                curveToRelative(-0.108f, 0.18f, -0.32f, 0.216f, -0.5f, 0.108f)
                reflectiveCurveToRelative(-0.216f, -0.32f, -0.108f, -0.5f)
                arcToRelative(9.256f, 9.256f, 0.0f, false, false, 1.428f, -4.964f)
                curveToRelative(0.0f, -5.072f, -4.18f, -9.248f, -9.284f, -9.248f)
                curveToRelative(-5.104f, 0.0f, -9.284f, 4.176f, -9.284f, 9.284f)
                curveToRelative(0.0f, 5.108f, 4.176f, 9.284f, 9.284f, 9.284f)
                arcToRelative(9.43f, 9.43f, 0.0f, false, false, 4.964f, -1.428f)
                curveToRelative(0.18f, -0.108f, 0.392f, -0.072f, 0.5f, 0.108f)
                curveToRelative(0.108f, 0.18f, 0.072f, 0.392f, -0.108f, 0.5f)
                arcTo(10.14f, 10.14f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.784f, 18.068f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
                moveTo(12.0f, 16.284f)
                arcToRelative(0.536f, 0.536f, 0.0f, true, true, 0.0f, 1.072f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.0f, -1.072f)
                close()
                moveTo(12.176f, 6.824f)
                curveToRelative(0.892f, 0.0f, 1.716f, 0.428f, 2.248f, 1.108f)
                curveToRelative(0.608f, 0.82f, 0.752f, 2.32f, -0.108f, 3.144f)
                lineToRelative(-1.036f, 1.036f)
                arcToRelative(3.639f, 3.639f, 0.0f, false, false, -0.928f, 2.392f)
                curveToRelative(0.004f, 0.212f, -0.136f, 0.352f, -0.352f, 0.352f)
                curveToRelative(-0.216f, 0.0f, -0.356f, -0.144f, -0.356f, -0.356f)
                curveToRelative(0.0f, -1.072f, 0.428f, -2.108f, 1.18f, -2.856f)
                lineToRelative(1.036f, -1.036f)
                curveToRelative(0.536f, -0.536f, 0.464f, -1.644f, 0.036f, -2.216f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.716f, -0.856f)
                lineTo(12.0f, 7.536f)
                curveToRelative(-0.68f, 0.0f, -1.32f, 0.356f, -1.68f, 0.964f)
                curveToRelative(-0.108f, 0.18f, -0.32f, 0.216f, -0.5f, 0.144f)
                curveToRelative(-0.18f, -0.108f, -0.216f, -0.32f, -0.144f, -0.5f)
                curveToRelative(0.464f, -0.82f, 1.356f, -1.32f, 2.32f, -1.32f)
                horizontalLineToRelative(0.18f)
                close()
            }
        }
        .build()
        return _questionLight!!
    }

private var _questionLight: ImageVector? = null
