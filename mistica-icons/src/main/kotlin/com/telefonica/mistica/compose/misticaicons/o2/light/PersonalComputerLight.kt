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

public val LightGroup.PersonalComputerLight: ImageVector
    get() {
        if (_personalComputerLight != null) {
            return _personalComputerLight!!
        }
        _personalComputerLight = Builder(name = "PersonalComputerLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.626f)
                horizontalLineToRelative(6.786f)
                lineToRelative(-0.787f, 2.89f)
                curveToRelative(-0.036f, 0.11f, 0.0f, 0.225f, 0.073f, 0.335f)
                curveToRelative(0.073f, 0.077f, 0.179f, 0.149f, 0.284f, 0.149f)
                horizontalLineToRelative(7.215f)
                arcToRelative(0.319f, 0.319f, 0.0f, false, false, 0.284f, -0.149f)
                curveToRelative(0.073f, -0.077f, 0.073f, -0.225f, 0.073f, -0.336f)
                lineToRelative(-0.714f, -2.89f)
                lineTo(22.0f, 17.625f)
                lineTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(14.626f)
                close()
                moveTo(14.506f, 17.626f)
                lineTo(15.114f, 20.251f)
                lineTo(8.827f, 20.251f)
                lineToRelative(0.676f, -2.625f)
                horizontalLineToRelative(5.003f)
                close()
                moveTo(21.29f, 3.754f)
                verticalLineToRelative(13.123f)
                lineTo(2.718f, 16.877f)
                verticalLineToRelative(-2.251f)
                horizontalLineToRelative(14.646f)
                curveToRelative(0.214f, 0.0f, 0.356f, -0.15f, 0.356f, -0.375f)
                reflectiveCurveToRelative(-0.142f, -0.374f, -0.356f, -0.374f)
                lineTo(2.718f, 13.877f)
                lineTo(2.718f, 3.754f)
                lineTo(21.29f, 3.754f)
                close()
                moveTo(19.508f, 15.0f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.336f, 0.713f, -0.749f)
                reflectiveCurveToRelative(-0.32f, -0.749f, -0.713f, -0.749f)
                curveToRelative(-0.393f, 0.0f, -0.713f, 0.336f, -0.713f, 0.75f)
                curveToRelative(0.0f, 0.412f, 0.32f, 0.748f, 0.713f, 0.748f)
                close()
            }
        }
        .build()
        return _personalComputerLight!!
    }

private var _personalComputerLight: ImageVector? = null
