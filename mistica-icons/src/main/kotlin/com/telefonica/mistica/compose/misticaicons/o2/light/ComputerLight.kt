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

public val LightGroup.ComputerLight: ImageVector
    get() {
        if (_computerLight != null) {
            return _computerLight!!
        }
        _computerLight = Builder(name = "ComputerLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.861f, 6.893f)
                curveToRelative(0.0f, -0.644f, 0.466f, -1.133f, 1.07f, -1.133f)
                horizontalLineToRelative(12.138f)
                curveToRelative(0.608f, 0.0f, 1.07f, 0.494f, 1.07f, 1.133f)
                verticalLineToRelative(4.92f)
                curveToRelative(0.0f, 0.228f, 0.142f, 0.378f, 0.356f, 0.378f)
                curveToRelative(0.215f, 0.0f, 0.357f, -0.15f, 0.357f, -0.377f)
                verticalLineToRelative(-4.92f)
                curveToRelative(0.0f, -1.061f, -0.786f, -1.894f, -1.787f, -1.894f)
                lineTo(5.93f, 5.0f)
                curveToRelative(-1.001f, 0.0f, -1.787f, 0.833f, -1.787f, 1.893f)
                verticalLineToRelative(9.08f)
                lineTo(2.0f, 15.973f)
                verticalLineToRelative(0.378f)
                curveTo(2.0f, 17.601f, 2.891f, 19.0f, 4.144f, 19.0f)
                horizontalLineToRelative(15.712f)
                curveTo(21.104f, 19.0f, 22.0f, 17.6f, 22.0f, 16.351f)
                verticalLineToRelative(-0.378f)
                lineTo(4.861f, 15.973f)
                verticalLineToRelative(-9.08f)
                close()
                moveTo(19.856f, 18.245f)
                lineTo(4.144f, 18.245f)
                curveToRelative(-0.713f, 0.0f, -1.248f, -0.756f, -1.394f, -1.511f)
                horizontalLineToRelative(18.496f)
                curveToRelative(-0.142f, 0.75f, -0.677f, 1.51f, -1.39f, 1.51f)
                close()
                moveTo(18.782f, 14.08f)
                curveToRelative(0.0f, 0.416f, 0.32f, 0.755f, 0.713f, 0.755f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.339f, 0.713f, -0.755f)
                curveToRelative(0.0f, -0.417f, -0.32f, -0.756f, -0.713f, -0.756f)
                curveToRelative(-0.393f, 0.0f, -0.713f, 0.34f, -0.713f, 0.756f)
                close()
            }
        }
        .build()
        return _computerLight!!
    }

private var _computerLight: ImageVector? = null
