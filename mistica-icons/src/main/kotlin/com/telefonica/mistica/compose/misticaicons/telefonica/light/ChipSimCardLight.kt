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

public val LightGroup.ChipSimCardLight: ImageVector
    get() {
        if (_chipSimCardLight != null) {
            return _chipSimCardLight!!
        }
        _chipSimCardLight = Builder(name = "ChipSimCardLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.634f, 2.156f)
                curveToRelative(0.621f, 0.0f, 1.106f, 0.18f, 1.442f, 0.535f)
                curveToRelative(0.317f, 0.334f, 0.476f, 0.801f, 0.476f, 1.384f)
                verticalLineToRelative(15.84f)
                curveToRelative(0.0f, 0.583f, -0.16f, 1.05f, -0.476f, 1.384f)
                curveToRelative(-0.336f, 0.356f, -0.82f, 0.535f, -1.442f, 0.535f)
                lineTo(7.356f, 21.834f)
                curveToRelative(-0.622f, 0.0f, -1.106f, -0.18f, -1.442f, -0.535f)
                curveToRelative(-0.317f, -0.333f, -0.476f, -0.801f, -0.476f, -1.384f)
                lineTo(5.438f, 6.26f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, 0.08f, -0.199f)
                lineToRelative(3.824f, -3.824f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.2f, -0.08f)
                horizontalLineToRelative(7.092f)
                close()
                moveTo(16.634f, 2.716f)
                lineTo(9.656f, 2.716f)
                lineTo(5.998f, 6.375f)
                verticalLineToRelative(13.54f)
                curveToRelative(0.0f, 0.902f, 0.456f, 1.359f, 1.358f, 1.359f)
                horizontalLineToRelative(9.278f)
                curveToRelative(0.902f, 0.0f, 1.358f, -0.457f, 1.358f, -1.359f)
                lineTo(17.992f, 4.075f)
                curveToRelative(0.0f, -0.902f, -0.456f, -1.359f, -1.358f, -1.359f)
                close()
                moveTo(16.09f, 10.478f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(8.611f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(7.897f, 19.649f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                verticalLineToRelative(-8.61f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(8.193f)
                close()
                moveTo(10.342f, 16.918f)
                lineTo(8.177f, 16.918f)
                verticalLineToRelative(2.171f)
                horizontalLineToRelative(2.165f)
                verticalLineToRelative(-2.172f)
                close()
                moveTo(13.072f, 16.918f)
                horizontalLineToRelative(-2.17f)
                verticalLineToRelative(2.17f)
                horizontalLineToRelative(2.17f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(15.81f, 16.918f)
                horizontalLineToRelative(-2.177f)
                verticalLineToRelative(2.17f)
                lineToRelative(2.177f, 0.001f)
                verticalLineToRelative(-2.172f)
                close()
                moveTo(8.177f, 13.769f)
                verticalLineToRelative(2.588f)
                horizontalLineToRelative(7.633f)
                lineTo(15.81f, 13.77f)
                lineTo(8.177f, 13.77f)
                close()
                moveTo(10.342f, 11.039f)
                lineTo(8.177f, 11.039f)
                verticalLineToRelative(2.17f)
                horizontalLineToRelative(2.165f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(13.072f, 11.039f)
                horizontalLineToRelative(-2.17f)
                verticalLineToRelative(2.17f)
                horizontalLineToRelative(2.17f)
                verticalLineToRelative(-2.17f)
                close()
                moveTo(15.81f, 11.039f)
                horizontalLineToRelative(-2.177f)
                verticalLineToRelative(2.17f)
                horizontalLineToRelative(2.177f)
                verticalLineToRelative(-2.17f)
                close()
            }
        }
        .build()
        return _chipSimCardLight!!
    }

private var _chipSimCardLight: ImageVector? = null
