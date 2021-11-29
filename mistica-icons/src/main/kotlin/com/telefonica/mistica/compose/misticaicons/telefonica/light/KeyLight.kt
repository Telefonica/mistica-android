package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.KeyLight: ImageVector
    get() {
        if (_keyLight != null) {
            return _keyLight!!
        }
        _keyLight = Builder(name = "KeyLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.74f, 12.701f)
                curveToRelative(0.501f, 0.0f, 0.697f, -0.196f, 0.697f, -0.7f)
                reflectiveCurveToRelative(-0.196f, -0.7f, -0.697f, -0.7f)
                curveToRelative(-0.502f, 0.0f, -0.698f, 0.196f, -0.698f, 0.7f)
                reflectiveCurveToRelative(0.196f, 0.7f, 0.698f, 0.7f)
                close()
                moveTo(5.74f, 10.461f)
                curveToRelative(0.958f, 0.0f, 1.532f, 0.576f, 1.532f, 1.54f)
                curveToRelative(0.0f, 0.963f, -0.571f, 1.538f, -1.532f, 1.538f)
                curveToRelative(-0.958f, 0.0f, -1.532f, -0.577f, -1.532f, -1.538f)
                curveToRelative(0.0f, -0.964f, 0.574f, -1.538f, 1.532f, -1.54f)
                close()
                moveTo(19.493f, 13.233f)
                lineTo(20.818f, 11.964f)
                lineTo(19.286f, 10.527f)
                lineTo(9.555f, 10.527f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.381f, -0.249f)
                curveToRelative(-0.46f, -1.036f, -1.42f, -1.54f, -2.933f, -1.54f)
                curveToRelative(-2.185f, 0.0f, -3.246f, 1.067f, -3.246f, 3.26f)
                curveToRelative(0.0f, 2.196f, 1.061f, 3.263f, 3.246f, 3.263f)
                curveToRelative(1.429f, 0.0f, 2.367f, -0.425f, 2.787f, -1.263f)
                curveToRelative(0.042f, -0.081f, 0.14f, -0.333f, 0.14f, -0.333f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.39f, -0.266f)
                horizontalLineToRelative(4.708f)
                lineToRelative(1.0f, -1.446f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.334f, -0.18f)
                curveToRelative(0.137f, -0.021f, 0.26f, 0.057f, 0.342f, 0.163f)
                lineToRelative(0.882f, 1.149f)
                lineToRelative(0.692f, -1.115f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.647f, -0.076f)
                curveToRelative(-0.003f, 0.003f, 1.33f, 1.34f, 1.33f, 1.34f)
                close()
                moveTo(21.712f, 11.656f)
                curveToRelative(0.17f, 0.157f, 0.18f, 0.423f, 0.02f, 0.594f)
                lineToRelative(-0.017f, 0.017f)
                lineToRelative(-1.942f, 1.86f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.582f, -0.009f)
                lineToRelative(-1.25f, -1.252f)
                lineToRelative(-0.73f, 1.18f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, -0.334f, 0.196f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, true, -0.35f, -0.163f)
                lineToRelative(-0.902f, -1.173f)
                lineToRelative(-0.801f, 1.156f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, -0.342f, 0.18f)
                lineTo(9.835f, 14.242f)
                lineToRelative(-0.062f, 0.137f)
                curveToRelative(-0.563f, 1.126f, -1.784f, 1.723f, -3.532f, 1.723f)
                curveToRelative(-2.633f, 0.0f, -4.081f, -1.457f, -4.081f, -4.101f)
                reflectiveCurveTo(3.608f, 7.9f, 6.241f, 7.9f)
                curveToRelative(2.104f, 0.0f, 3.101f, 0.922f, 3.572f, 1.79f)
                horizontalLineToRelative(9.638f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, 0.286f, 0.112f)
                lineToRelative(1.975f, 1.854f)
                close()
            }
        }
        .build()
        return _keyLight!!
    }

private var _keyLight: ImageVector? = null
