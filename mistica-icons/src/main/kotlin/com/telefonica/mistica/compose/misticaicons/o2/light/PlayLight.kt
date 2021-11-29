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

public val LightGroup.PlayLight: ImageVector
    get() {
        if (_playLight != null) {
            return _playLight!!
        }
        _playLight = Builder(name = "PlayLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.655f, 2.239f)
                lineToRelative(13.514f, 8.227f)
                curveToRelative(0.477f, 0.288f, 0.784f, 0.792f, 0.818f, 1.331f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -0.545f, 1.508f)
                curveToRelative(-0.137f, 0.144f, -0.341f, 0.108f, -0.478f, -0.036f)
                curveToRelative(-0.136f, -0.144f, -0.102f, -0.36f, 0.035f, -0.504f)
                curveToRelative(0.238f, -0.216f, 0.34f, -0.54f, 0.306f, -0.9f)
                arcToRelative(1.074f, 1.074f, 0.0f, false, false, -0.477f, -0.791f)
                lineTo(6.352f, 2.85f)
                curveToRelative(-0.34f, -0.216f, -0.75f, -0.18f, -1.125f, 0.036f)
                curveToRelative(-0.34f, 0.216f, -0.545f, 0.54f, -0.545f, 0.9f)
                verticalLineToRelative(16.527f)
                curveToRelative(0.0f, 0.324f, 0.17f, 0.648f, 0.477f, 0.827f)
                curveToRelative(0.375f, 0.216f, 0.818f, 0.216f, 1.193f, 0.036f)
                lineToRelative(10.28f, -6.256f)
                curveToRelative(0.17f, -0.108f, 0.374f, -0.036f, 0.477f, 0.144f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, true, -0.137f, 0.503f)
                lineToRelative(-10.28f, 6.217f)
                arcToRelative(2.042f, 2.042f, 0.0f, false, true, -0.92f, 0.216f)
                curveToRelative(-0.34f, 0.0f, -0.647f, -0.072f, -0.954f, -0.252f)
                curveToRelative(-0.511f, -0.324f, -0.818f, -0.863f, -0.818f, -1.435f)
                verticalLineTo(3.782f)
                curveToRelative(0.0f, -0.612f, 0.34f, -1.188f, 0.852f, -1.507f)
                curveToRelative(0.58f, -0.36f, 1.261f, -0.36f, 1.803f, -0.036f)
                close()
                moveTo(18.64f, 13.305f)
                curveToRelative(0.376f, 0.0f, 0.682f, 0.322f, 0.682f, 0.72f)
                curveToRelative(0.0f, 0.397f, -0.306f, 0.719f, -0.682f, 0.719f)
                curveToRelative(-0.377f, 0.0f, -0.682f, -0.322f, -0.682f, -0.72f)
                curveToRelative(0.0f, -0.397f, 0.305f, -0.72f, 0.682f, -0.72f)
                close()
            }
        }
        .build()
        return _playLight!!
    }

private var _playLight: ImageVector? = null
