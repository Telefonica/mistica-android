package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.TrophyRegular: ImageVector
    get() {
        if (_trophyRegular != null) {
            return _trophyRegular!!
        }
        _trophyRegular = Builder(name = "TrophyRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.856f, 3.07f)
                horizontalLineToRelative(-0.89f)
                verticalLineToRelative(-0.357f)
                arcTo(0.714f, 0.714f, 0.0f, false, false, 18.251f, 2.0f)
                horizontalLineToRelative(-12.5f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -0.713f, 0.713f)
                verticalLineToRelative(0.357f)
                horizontalLineToRelative(-0.895f)
                curveTo(2.983f, 3.07f, 2.0f, 4.053f, 2.0f, 5.214f)
                verticalLineToRelative(2.68f)
                curveToRelative(0.0f, 2.067f, 1.357f, 3.59f, 3.268f, 3.736f)
                curveToRelative(0.722f, 2.77f, 3.103f, 4.878f, 6.014f, 5.176f)
                verticalLineToRelative(0.553f)
                lineTo(9.856f, 17.359f)
                curveToRelative(-0.27f, 0.0f, -0.516f, 0.15f, -0.64f, 0.393f)
                lineToRelative(-1.604f, 3.215f)
                arcTo(0.713f, 0.713f, 0.0f, false, false, 8.252f, 22.0f)
                horizontalLineToRelative(7.496f)
                arcToRelative(0.719f, 0.719f, 0.0f, false, false, 0.608f, -0.338f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, 0.032f, -0.695f)
                lineToRelative(-1.61f, -3.215f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, -0.64f, -0.393f)
                horizontalLineToRelative(-1.425f)
                verticalLineToRelative(-0.553f)
                arcToRelative(6.985f, 6.985f, 0.0f, false, false, 5.923f, -4.824f)
                curveTo(20.551f, 11.794f, 22.0f, 10.222f, 22.0f, 8.25f)
                lineTo(22.0f, 5.036f)
                curveToRelative(0.0f, -1.102f, -0.941f, -1.966f, -2.144f, -1.966f)
                close()
                moveTo(14.591f, 20.573f)
                lineTo(9.404f, 20.573f)
                lineToRelative(0.891f, -1.787f)
                horizontalLineToRelative(3.4f)
                lineToRelative(0.896f, 1.787f)
                close()
                moveTo(3.431f, 7.893f)
                lineTo(3.431f, 5.215f)
                curveToRelative(0.0f, -0.365f, 0.347f, -0.713f, 0.713f, -0.713f)
                horizontalLineToRelative(0.89f)
                verticalLineToRelative(5.377f)
                curveToRelative(0.0f, 0.092f, 0.01f, 0.183f, 0.014f, 0.28f)
                curveToRelative(-0.973f, -0.234f, -1.617f, -1.098f, -1.617f, -2.264f)
                close()
                moveTo(12.0f, 15.417f)
                arcToRelative(5.54f, 5.54f, 0.0f, false, true, -5.535f, -5.538f)
                lineTo(6.465f, 3.427f)
                horizontalLineToRelative(11.07f)
                verticalLineToRelative(6.451f)
                arcTo(5.544f, 5.544f, 0.0f, false, true, 12.0f, 15.416f)
                close()
                moveTo(20.57f, 8.252f)
                curveToRelative(0.0f, 1.083f, -0.668f, 1.947f, -1.637f, 2.226f)
                curveToRelative(0.019f, -0.196f, 0.032f, -0.397f, 0.032f, -0.599f)
                lineTo(18.965f, 4.497f)
                horizontalLineToRelative(0.891f)
                curveToRelative(0.288f, 0.0f, 0.713f, 0.141f, 0.713f, 0.535f)
                lineTo(20.569f, 8.25f)
                close()
            }
        }
        .build()
        return _trophyRegular!!
    }

private var _trophyRegular: ImageVector? = null
