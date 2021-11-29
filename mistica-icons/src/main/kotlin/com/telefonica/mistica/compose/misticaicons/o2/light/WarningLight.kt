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

public val LightGroup.WarningLight: ImageVector
    get() {
        if (_warningLight != null) {
            return _warningLight!!
        }
        _warningLight = Builder(name = "WarningLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(1.892f, 0.0f, 3.752f, 0.536f, 5.356f, 1.536f)
                curveToRelative(0.18f, 0.108f, 0.216f, 0.32f, 0.108f, 0.5f)
                reflectiveCurveToRelative(-0.32f, 0.216f, -0.5f, 0.108f)
                arcTo(9.43f, 9.43f, 0.0f, false, false, 12.0f, 2.716f)
                curveToRelative(-5.108f, 0.0f, -9.284f, 4.176f, -9.284f, 9.284f)
                curveToRelative(0.0f, 5.108f, 4.18f, 9.284f, 9.284f, 9.284f)
                curveToRelative(5.104f, 0.0f, 9.284f, -4.176f, 9.284f, -9.248f)
                curveToRelative(0.0f, -1.784f, -0.5f, -3.5f, -1.428f, -4.964f)
                curveToRelative(-0.108f, -0.18f, -0.072f, -0.392f, 0.108f, -0.5f)
                curveToRelative(0.18f, -0.108f, 0.392f, -0.072f, 0.5f, 0.108f)
                arcTo(9.925f, 9.925f, 0.0f, false, true, 22.0f, 12.0f)
                curveToRelative(0.0f, 5.5f, -4.5f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 16.284f)
                arcToRelative(0.536f, 0.536f, 0.0f, true, true, 0.0f, 1.072f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.0f, -1.072f)
                close()
                moveTo(12.0f, 6.644f)
                curveToRelative(0.216f, 0.0f, 0.356f, 0.14f, 0.356f, 0.356f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.212f, -0.14f, 0.356f, -0.356f, 0.356f)
                curveToRelative(-0.212f, 0.0f, -0.356f, -0.14f, -0.356f, -0.356f)
                lineTo(11.644f, 7.0f)
                curveToRelative(0.0f, -0.212f, 0.14f, -0.356f, 0.356f, -0.356f)
                close()
                moveTo(18.784f, 4.5f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
            }
        }
        .build()
        return _warningLight!!
    }

private var _warningLight: ImageVector? = null
