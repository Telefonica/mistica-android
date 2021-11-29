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

public val LightGroup.ArrowLineDownLeftLight: ImageVector
    get() {
        if (_arrowLineDownLeftLight != null) {
            return _arrowLineDownLeftLight!!
        }
        _arrowLineDownLeftLight = Builder(name = "ArrowLineDownLeftLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.167f, 16.334f)
                lineTo(7.13f, 6.98f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.733f, -0.44f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, -0.201f, 0.469f)
                lineToRelative(0.065f, 10.447f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, 0.012f, 0.08f)
                curveToRelative(0.016f, 0.02f, 0.034f, 0.037f, 0.053f, 0.053f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, 0.253f, 0.253f)
                curveToRelative(0.016f, 0.02f, 0.034f, 0.037f, 0.053f, 0.053f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, false, 0.087f, 0.02f)
                lineToRelative(10.253f, 0.017f)
                arcToRelative(0.454f, 0.454f, 0.0f, false, false, 0.354f, -0.141f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.325f, -0.792f)
                horizontalLineTo(7.83f)
                lineToRelative(9.908f, -9.907f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.001f, -0.665f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, -0.664f, 0.001f)
                lineToRelative(-9.908f, 9.907f)
                close()
            }
        }
        .build()
        return _arrowLineDownLeftLight!!
    }

private var _arrowLineDownLeftLight: ImageVector? = null
