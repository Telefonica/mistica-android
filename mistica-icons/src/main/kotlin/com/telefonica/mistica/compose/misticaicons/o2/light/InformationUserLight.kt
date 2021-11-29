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

public val LightGroup.InformationUserLight: ImageVector
    get() {
        if (_informationUserLight != null) {
            return _informationUserLight!!
        }
        _informationUserLight = Builder(name = "InformationUserLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 9.144f)
                curveToRelative(0.216f, 0.0f, 0.356f, 0.144f, 0.356f, 0.356f)
                lineTo(12.356f, 17.0f)
                curveToRelative(0.0f, 0.216f, -0.14f, 0.356f, -0.356f, 0.356f)
                curveToRelative(-0.216f, 0.0f, -0.356f, -0.144f, -0.356f, -0.356f)
                lineTo(11.644f, 9.5f)
                curveToRelative(0.0f, -0.216f, 0.144f, -0.356f, 0.356f, -0.356f)
                close()
                moveTo(12.0f, 6.644f)
                arcToRelative(0.536f, 0.536f, 0.0f, true, true, 0.0f, 1.072f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.0f, -1.072f)
                close()
            }
        }
        .build()
        return _informationUserLight!!
    }

private var _informationUserLight: ImageVector? = null
