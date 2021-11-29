package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.AlarmLightFilled: ImageVector
    get() {
        if (_alarmLightFilled != null) {
            return _alarmLightFilled!!
        }
        _alarmLightFilled = Builder(name = "AlarmLightFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.516f, 21.579f)
                verticalLineToRelative(-2.094f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.194f, -0.06f)
                lineTo(4.772f, 19.425f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, false, -0.194f, 0.054f)
                verticalLineToRelative(2.11f)
                curveToRelative(0.06f, 0.034f, 0.125f, 0.05f, 0.194f, 0.05f)
                horizontalLineToRelative(14.55f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, false, 0.194f, -0.06f)
                close()
                moveTo(19.322f, 18.07f)
                curveToRelative(0.826f, 0.0f, 1.546f, 0.61f, 1.546f, 1.309f)
                verticalLineToRelative(2.313f)
                curveToRelative(0.0f, 0.698f, -0.723f, 1.308f, -1.546f, 1.308f)
                lineTo(4.772f, 23.0f)
                curveToRelative(-0.839f, 0.0f, -1.546f, -0.598f, -1.546f, -1.308f)
                verticalLineToRelative(-2.313f)
                curveToRelative(0.0f, -0.708f, 0.707f, -1.305f, 1.546f, -1.305f)
                horizontalLineToRelative(0.17f)
                verticalLineToRelative(-6.401f)
                curveToRelative(0.0f, -4.601f, 2.522f, -7.136f, 7.102f, -7.136f)
                curveToRelative(4.583f, 0.0f, 7.106f, 2.535f, 7.106f, 7.136f)
                verticalLineToRelative(6.397f)
                horizontalLineToRelative(0.172f)
                close()
                moveTo(12.047f, 4.005f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, true, -0.676f, -0.68f)
                lineTo(11.371f, 1.68f)
                curveToRelative(0.0f, -0.375f, 0.303f, -0.679f, 0.676f, -0.679f)
                curveToRelative(0.372f, 0.0f, 0.676f, 0.304f, 0.676f, 0.68f)
                verticalLineToRelative(1.646f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, -0.676f, 0.679f)
                close()
                moveTo(3.989f, 9.282f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, -0.676f, 0.679f)
                lineTo(1.676f, 9.961f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.0f, -1.358f)
                horizontalLineToRelative(1.64f)
                curveToRelative(0.373f, 0.0f, 0.677f, 0.303f, 0.673f, 0.679f)
                close()
                moveTo(22.324f, 8.634f)
                curveToRelative(0.372f, 0.0f, 0.676f, 0.303f, 0.676f, 0.679f)
                curveToRelative(0.0f, 0.372f, -0.3f, 0.68f, -0.676f, 0.68f)
                horizontalLineToRelative(-1.64f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, true, -0.677f, -0.68f)
                curveToRelative(0.0f, -0.376f, 0.304f, -0.68f, 0.677f, -0.68f)
                horizontalLineToRelative(1.64f)
                close()
                moveTo(4.929f, 5.254f)
                lineTo(3.77f, 4.089f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, true, 0.952f, -0.964f)
                lineToRelative(0.003f, 0.003f)
                lineToRelative(1.158f, 1.165f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, true, -0.479f, 1.16f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, -0.475f, -0.2f)
                close()
                moveTo(17.807f, 5.316f)
                arcToRelative(0.679f, 0.679f, 0.0f, false, true, -0.476f, -1.158f)
                lineToRelative(1.158f, -1.164f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, true, 0.952f, -0.003f)
                lineToRelative(0.003f, 0.003f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.0f, 0.957f)
                lineToRelative(-1.158f, 1.165f)
                curveToRelative(-0.129f, 0.128f, -0.3f, 0.2f, -0.48f, 0.2f)
                close()
            }
        }
        .build()
        return _alarmLightFilled!!
    }

private var _alarmLightFilled: ImageVector? = null
