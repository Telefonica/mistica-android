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

public val LightGroup.MicrophoneLight: ImageVector
    get() {
        if (_microphoneLight != null) {
            return _microphoneLight!!
        }
        _microphoneLight = Builder(name = "MicrophoneLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.644f, 21.63f)
                curveToRelative(0.0f, 0.204f, -0.16f, 0.37f, -0.357f, 0.37f)
                lineTo(7.713f, 22.0f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, -0.357f, -0.37f)
                curveToRelative(0.0f, -0.204f, 0.16f, -0.37f, 0.357f, -0.37f)
                horizontalLineToRelative(3.926f)
                verticalLineToRelative(-1.48f)
                curveToRelative(0.0f, -0.004f, 0.005f, -0.013f, 0.005f, -0.018f)
                curveTo(9.052f, 19.572f, 7.0f, 17.33f, 7.0f, 14.594f)
                curveToRelative(0.0f, -0.204f, 0.16f, -0.37f, 0.356f, -0.37f)
                curveToRelative(0.197f, 0.0f, 0.357f, 0.166f, 0.357f, 0.37f)
                curveToRelative(0.0f, 2.451f, 1.924f, 4.447f, 4.287f, 4.447f)
                reflectiveCurveToRelative(4.287f, -1.996f, 4.287f, -4.447f)
                curveToRelative(0.0f, -0.204f, 0.16f, -0.37f, 0.357f, -0.37f)
                curveToRelative(0.196f, 0.0f, 0.356f, 0.166f, 0.356f, 0.37f)
                curveToRelative(0.0f, 2.736f, -2.052f, 4.978f, -4.644f, 5.168f)
                curveToRelative(0.0f, 0.005f, 0.005f, 0.014f, 0.005f, 0.019f)
                verticalLineToRelative(1.48f)
                horizontalLineToRelative(3.926f)
                curveToRelative(0.197f, 0.0f, 0.357f, 0.165f, 0.357f, 0.37f)
                close()
                moveTo(12.0f, 17.927f)
                curveToRelative(1.773f, 0.0f, 3.213f, -1.494f, 3.213f, -3.333f)
                verticalLineToRelative(-0.74f)
                curveToRelative(0.0f, -0.204f, -0.16f, -0.37f, -0.357f, -0.37f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, -0.356f, 0.37f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 1.432f, -1.12f, 2.593f, -2.5f, 2.593f)
                reflectiveCurveToRelative(-2.5f, -1.161f, -2.5f, -2.593f)
                verticalLineToRelative(-9.26f)
                curveTo(9.5f, 3.9f, 10.62f, 2.74f, 12.0f, 2.74f)
                reflectiveCurveToRelative(2.5f, 1.161f, 2.5f, 2.593f)
                verticalLineToRelative(4.073f)
                curveToRelative(0.0f, 0.204f, 0.16f, 0.37f, 0.356f, 0.37f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, 0.357f, -0.37f)
                lineTo(15.213f, 5.333f)
                curveTo(15.213f, 3.493f, 13.773f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.773f, 0.0f, -3.213f, 1.494f, -3.213f, 3.333f)
                verticalLineToRelative(9.26f)
                curveToRelative(0.0f, 1.84f, 1.44f, 3.334f, 3.213f, 3.334f)
                close()
                moveTo(14.144f, 11.63f)
                curveToRelative(0.0f, 0.408f, 0.32f, 0.74f, 0.712f, 0.74f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, 0.713f, -0.74f)
                curveToRelative(0.0f, -0.408f, -0.32f, -0.74f, -0.713f, -0.74f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, -0.712f, 0.74f)
                close()
            }
        }
        .build()
        return _microphoneLight!!
    }

private var _microphoneLight: ImageVector? = null
