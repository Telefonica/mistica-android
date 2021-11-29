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

public val LightGroup.PoundSymbolCircleLight: ImageVector
    get() {
        if (_poundSymbolCircleLight != null) {
            return _poundSymbolCircleLight!!
        }
        _poundSymbolCircleLight = Builder(name = "PoundSymbolCircleLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                curveTo(17.497f, 2.0f, 21.996f, 6.5f, 22.0f, 12.0f)
                curveToRelative(0.0f, 1.892f, -0.536f, 3.748f, -1.536f, 5.356f)
                curveToRelative(-0.104f, 0.18f, -0.32f, 0.212f, -0.5f, 0.108f)
                reflectiveCurveToRelative(-0.216f, -0.32f, -0.108f, -0.5f)
                arcTo(9.431f, 9.431f, 0.0f, false, false, 21.284f, 12.0f)
                curveToRelative(0.0f, -5.108f, -4.179f, -9.284f, -9.286f, -9.284f)
                curveToRelative(-5.107f, 0.0f, -9.282f, 4.176f, -9.282f, 9.284f)
                curveToRelative(0.0f, 5.108f, 4.175f, 9.284f, 9.246f, 9.284f)
                curveToRelative(1.784f, 0.0f, 3.5f, -0.5f, 4.963f, -1.428f)
                curveToRelative(0.176f, -0.108f, 0.392f, -0.072f, 0.5f, 0.108f)
                curveToRelative(0.108f, 0.176f, 0.072f, 0.392f, -0.108f, 0.5f)
                arcTo(9.921f, 9.921f, 0.0f, false, true, 11.998f, 22.0f)
                curveTo(6.499f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 11.998f, 2.0f)
                close()
                moveTo(18.781f, 18.068f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
                moveTo(12.32f, 7.684f)
                curveToRelative(0.573f, 0.0f, 0.969f, 0.14f, 1.325f, 0.464f)
                curveToRelative(0.144f, 0.144f, 0.18f, 0.356f, 0.036f, 0.5f)
                curveToRelative(-0.144f, 0.144f, -0.356f, 0.18f, -0.5f, 0.036f)
                curveToRelative(-0.216f, -0.18f, -0.428f, -0.252f, -0.824f, -0.252f)
                curveToRelative(-0.752f, 0.0f, -1.252f, 0.5f, -1.252f, 1.252f)
                verticalLineToRelative(1.784f)
                horizontalLineToRelative(1.784f)
                curveToRelative(0.212f, 0.0f, 0.356f, 0.14f, 0.356f, 0.356f)
                curveToRelative(0.0f, 0.212f, -0.14f, 0.356f, -0.356f, 0.356f)
                horizontalLineToRelative(-1.784f)
                verticalLineToRelative(1.892f)
                curveToRelative(0.0f, 0.284f, -0.072f, 0.568f, -0.216f, 0.784f)
                horizontalLineToRelative(3.428f)
                curveToRelative(0.211f, 0.0f, 0.355f, 0.14f, 0.355f, 0.356f)
                curveToRelative(0.0f, 0.212f, -0.14f, 0.356f, -0.355f, 0.356f)
                lineTo(9.606f, 15.568f)
                curveToRelative(-0.211f, 0.0f, -0.355f, -0.14f, -0.355f, -0.356f)
                curveToRelative(0.0f, -0.212f, 0.14f, -0.356f, 0.355f, -0.356f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.748f, -0.82f)
                verticalLineToRelative(-1.892f)
                horizontalLineToRelative(-0.716f)
                curveToRelative(-0.211f, 0.0f, -0.355f, -0.14f, -0.355f, -0.356f)
                curveToRelative(0.0f, -0.212f, 0.14f, -0.356f, 0.355f, -0.356f)
                horizontalLineToRelative(0.72f)
                lineTo(10.358f, 9.648f)
                curveToRelative(0.0f, -1.14f, 0.82f, -1.964f, 1.964f, -1.964f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleLight!!
    }

private var _poundSymbolCircleLight: ImageVector? = null
