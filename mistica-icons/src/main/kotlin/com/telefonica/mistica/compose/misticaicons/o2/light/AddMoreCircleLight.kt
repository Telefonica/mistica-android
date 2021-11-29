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

public val LightGroup.AddMoreCircleLight: ImageVector
    get() {
        if (_addMoreCircleLight != null) {
            return _addMoreCircleLight!!
        }
        _addMoreCircleLight = Builder(name = "AddMoreCircleLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                curveTo(17.513f, 2.0f, 21.996f, 6.488f, 22.0f, 11.996f)
                curveToRelative(0.0f, 1.892f, -0.536f, 3.74f, -1.544f, 5.332f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.608f, -0.384f)
                arcToRelative(9.261f, 9.261f, 0.0f, false, false, 1.432f, -4.952f)
                curveToRelative(0.0f, -5.12f, -4.163f, -9.284f, -9.282f, -9.284f)
                reflectiveCurveToRelative(-9.286f, 4.168f, -9.286f, 9.288f)
                reflectiveCurveToRelative(4.163f, 9.284f, 9.282f, 9.284f)
                arcToRelative(9.257f, 9.257f, 0.0f, false, false, 4.951f, -1.432f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.496f, 0.112f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.112f, 0.496f)
                arcTo(9.97f, 9.97f, 0.0f, false, true, 11.998f, 22.0f)
                curveTo(6.488f, 22.0f, 2.0f, 17.512f, 2.0f, 12.0f)
                reflectiveCurveTo(6.487f, 2.0f, 11.998f, 2.0f)
                close()
                moveTo(18.788f, 18.072f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
                moveTo(12.002f, 5.583f)
                curveToRelative(0.192f, 0.0f, 0.353f, 0.161f, 0.356f, 0.357f)
                verticalLineToRelative(5.701f)
                lineToRelative(5.7f, 0.003f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, 0.251f, 0.609f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.252f, 0.104f)
                horizontalLineToRelative(-5.701f)
                verticalLineToRelative(5.701f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.356f, 0.356f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, -0.356f, -0.356f)
                verticalLineToRelative(-5.701f)
                lineToRelative(-5.702f, -0.001f)
                arcTo(0.355f, 0.355f, 0.0f, false, true, 5.584f, 12.0f)
                curveToRelative(0.0f, -0.198f, 0.159f, -0.357f, 0.357f, -0.357f)
                horizontalLineToRelative(5.701f)
                lineToRelative(0.002f, -5.704f)
                curveToRelative(0.0f, -0.198f, 0.159f, -0.356f, 0.357f, -0.356f)
                close()
            }
        }
        .build()
        return _addMoreCircleLight!!
    }

private var _addMoreCircleLight: ImageVector? = null
