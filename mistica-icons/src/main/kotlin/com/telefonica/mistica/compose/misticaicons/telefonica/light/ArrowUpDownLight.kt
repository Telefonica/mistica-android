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

public val LightGroup.ArrowUpDownLight: ImageVector
    get() {
        if (_arrowUpDownLight != null) {
            return _arrowUpDownLight!!
        }
        _arrowUpDownLight = Builder(name = "ArrowUpDownLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.275f, 21.851f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, true, -0.37f, -0.17f)
                lineToRelative(-4.411f, -4.474f)
                lineToRelative(-0.017f, -0.02f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.064f, -0.549f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, 0.442f, -0.283f)
                lineToRelative(2.244f, -0.02f)
                lineToRelative(-0.006f, -3.389f)
                curveToRelative(0.0f, -0.529f, 0.432f, -0.96f, 0.961f, -0.96f)
                horizontalLineToRelative(2.46f)
                curveToRelative(0.529f, 0.0f, 0.96f, 0.431f, 0.96f, 0.96f)
                lineToRelative(0.003f, 3.393f)
                lineToRelative(2.247f, 0.02f)
                curveToRelative(0.187f, 0.0f, 0.355f, 0.108f, 0.44f, 0.282f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.085f, 0.569f)
                lineToRelative(-4.434f, 4.47f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, true, -0.37f, 0.171f)
                close()
                moveTo(10.992f, 16.916f)
                lineTo(15.278f, 21.257f)
                lineTo(19.586f, 16.916f)
                lineTo(17.41f, 16.899f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.484f, -0.51f)
                lineToRelative(-0.006f, -3.44f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, -0.4f)
                horizontalLineToRelative(-2.46f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.4f, 0.4f)
                lineToRelative(0.005f, 3.44f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.484f, 0.51f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(-2.177f, 0.017f)
                close()
                moveTo(7.514f, 12.019f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.961f, -0.96f)
                lineToRelative(-0.003f, -3.39f)
                lineToRelative(-2.247f, -0.02f)
                arcToRelative(0.489f, 0.489f, 0.0f, false, true, -0.44f, -0.282f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, 0.085f, -0.569f)
                lineToRelative(4.434f, -4.47f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.31f, -0.169f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, true, 0.43f, 0.168f)
                lineToRelative(4.411f, 4.474f)
                curveToRelative(0.006f, 0.005f, 0.011f, 0.014f, 0.017f, 0.02f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, 0.064f, 0.548f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, -0.442f, 0.283f)
                lineToRelative(-2.244f, 0.02f)
                lineToRelative(0.006f, 3.386f)
                curveToRelative(0.0f, 0.53f, -0.432f, 0.961f, -0.961f, 0.961f)
                horizontalLineToRelative(-2.46f)
                close()
                moveTo(7.11f, 7.619f)
                lineTo(7.113f, 11.059f)
                curveToRelative(0.0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
                horizontalLineToRelative(2.46f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.4f, -0.4f)
                lineToRelative(-0.005f, -3.437f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, 0.484f, -0.51f)
                horizontalLineToRelative(0.006f)
                lineToRelative(2.177f, -0.017f)
                lineToRelative(-4.286f, -4.342f)
                lineTo(4.44f, 7.09f)
                lineToRelative(2.176f, 0.017f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.274f, 0.011f, 0.49f, 0.238f, 0.487f, 0.513f)
                close()
            }
        }
        .build()
        return _arrowUpDownLight!!
    }

private var _arrowUpDownLight: ImageVector? = null
