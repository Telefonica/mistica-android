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
                moveTo(17.98f, 11.464f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.997f)
                horizontalLineToRelative(-5.485f)
                verticalLineToRelative(5.498f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.997f, 0.0f)
                verticalLineToRelative(-5.495f)
                lineTo(6.02f, 12.464f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.997f)
                horizontalLineToRelative(5.475f)
                verticalLineToRelative(-5.43f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.997f, 0.0f)
                verticalLineToRelative(5.427f)
                horizontalLineToRelative(5.488f)
                close()
                moveTo(12.53f, 22.993f)
                curveTo(14.984f, 22.948f, 23.0f, 22.023f, 23.0f, 12.03f)
                curveToRelative(0.0f, -4.327f, -1.483f, -7.452f, -4.399f, -9.279f)
                curveToRelative(-2.384f, -1.495f, -5.075f, -1.717f, -6.123f, -1.741f)
                curveToRelative(-0.266f, -0.007f, -0.574f, -0.01f, -0.87f, -0.01f)
                horizontalLineToRelative(-0.23f)
                curveToRelative(-1.041f, 0.01f, -3.715f, 0.187f, -6.061f, 1.666f)
                curveToRelative(-2.869f, 1.8f, -4.316f, 4.928f, -4.316f, 9.295f)
                curveToRelative(0.0f, 4.372f, 1.461f, 7.513f, 4.354f, 9.333f)
                curveToRelative(2.37f, 1.493f, 5.06f, 1.687f, 6.109f, 1.704f)
                curveToRelative(0.12f, 0.004f, 0.239f, 0.004f, 0.358f, 0.004f)
                curveToRelative(0.246f, -0.004f, 0.492f, -0.004f, 0.707f, -0.01f)
                close()
                moveTo(12.498f, 0.01f)
                curveTo(14.848f, 0.065f, 24.0f, 0.994f, 24.0f, 12.03f)
                curveToRelative(0.0f, 11.062f, -9.159f, 11.919f, -11.45f, 11.963f)
                arcToRelative(47.16f, 47.16f, 0.0f, false, true, -0.728f, 0.007f)
                curveToRelative(-0.123f, 0.0f, -0.249f, 0.0f, -0.372f, -0.003f)
                curveTo(9.04f, 23.962f, 0.0f, 23.092f, 0.0f, 11.962f)
                curveTo(0.0f, 0.847f, 8.957f, 0.02f, 11.365f, 0.0f)
                horizontalLineToRelative(0.239f)
                curveToRelative(0.307f, 0.0f, 0.621f, 0.003f, 0.895f, 0.01f)
                close()
            }
        }
        .build()
        return _addMoreCircleLight!!
    }

private var _addMoreCircleLight: ImageVector? = null
