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

public val LightGroup.RoadSignLight: ImageVector
    get() {
        if (_roadSignLight != null) {
            return _roadSignLight!!
        }
        _roadSignLight = Builder(name = "RoadSignLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 21.016f)
                curveToRelative(5.99f, 0.0f, 9.023f, -3.034f, 9.023f, -9.02f)
                curveToRelative(0.0f, -5.989f, -3.037f, -9.022f, -9.023f, -9.022f)
                reflectiveCurveTo(2.97f, 6.01f, 2.97f, 11.996f)
                curveToRelative(0.0f, 5.986f, 3.037f, 9.02f, 9.02f, 9.02f)
                close()
                moveTo(11.99f, 2.15f)
                curveToRelative(6.443f, 0.0f, 9.846f, 3.406f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.44f, 3.403f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(13.758f, 12.495f)
                lineTo(16.447f, 9.895f)
                lineTo(13.757f, 7.287f)
                verticalLineToRelative(0.983f)
                curveToRelative(0.0f, 0.227f, -0.246f, 0.463f, -0.47f, 0.463f)
                lineTo(9.248f, 8.733f)
                arcToRelative(0.142f, 0.142f, 0.0f, false, false, -0.1f, 0.042f)
                arcToRelative(0.133f, 0.133f, 0.0f, false, false, -0.043f, 0.1f)
                verticalLineToRelative(8.048f)
                horizontalLineToRelative(2.137f)
                verticalLineToRelative(-5.456f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.41f, -0.41f)
                horizontalLineToRelative(1.63f)
                curveToRelative(0.12f, 0.009f, 0.235f, 0.062f, 0.319f, 0.146f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, 0.151f, 0.317f)
                curveToRelative(0.006f, 0.0f, 0.006f, 0.975f, 0.006f, 0.975f)
                close()
                moveTo(14.013f, 6.394f)
                lineTo(17.136f, 9.422f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, -0.022f, 0.963f)
                lineTo(14.04f, 13.36f)
                curveToRelative(-0.233f, 0.19f, -0.502f, 0.221f, -0.731f, 0.115f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, true, -0.376f, -0.586f)
                verticalLineToRelative(-1.01f)
                horizontalLineToRelative(-0.868f)
                verticalLineToRelative(5.453f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, 0.409f)
                lineTo(8.693f, 17.741f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, -0.409f)
                verticalLineToRelative(-8.46f)
                curveToRelative(0.0f, -0.257f, 0.101f, -0.498f, 0.283f, -0.68f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.681f, -0.283f)
                lineToRelative(3.69f, 0.003f)
                verticalLineToRelative(-1.02f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.372f, -0.582f)
                arcToRelative(0.657f, 0.657f, 0.0f, false, true, 0.703f, 0.084f)
                close()
            }
        }
        .build()
        return _roadSignLight!!
    }

private var _roadSignLight: ImageVector? = null
