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

public val LightGroup.DataShieldLight: ImageVector
    get() {
        if (_dataShieldLight != null) {
            return _dataShieldLight!!
        }
        _dataShieldLight = Builder(name = "DataShieldLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.37f, 5.12f)
                curveToRelative(-0.223f, 0.0f, -0.37f, 0.149f, -0.37f, 0.374f)
                reflectiveCurveToRelative(0.147f, 0.374f, 0.37f, 0.374f)
                curveToRelative(2.48f, 0.0f, 4.447f, 1.983f, 4.447f, 4.494f)
                curveToRelative(0.0f, 0.225f, 0.147f, 0.374f, 0.37f, 0.374f)
                reflectiveCurveToRelative(0.37f, -0.149f, 0.37f, -0.374f)
                curveToRelative(0.0f, -2.96f, -2.262f, -5.242f, -5.187f, -5.242f)
                close()
                moveTo(20.89f, 8.115f)
                lineTo(21.0f, 8.115f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, 0.26f, -0.45f)
                curveTo(20.037f, 3.659f, 16.48f, 1.0f, 12.37f, 1.0f)
                curveToRelative(-0.223f, 0.0f, -0.37f, 0.149f, -0.37f, 0.374f)
                reflectiveCurveToRelative(0.147f, 0.373f, 0.37f, 0.373f)
                curveToRelative(3.779f, 0.0f, 7.036f, 2.434f, 8.15f, 6.1f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.37f, 0.268f)
                close()
                moveTo(8.335f, 6.879f)
                lineToRelative(-0.408f, -0.374f)
                lineToRelative(-0.446f, 0.374f)
                curveToRelative(-0.038f, 0.038f, -2.11f, 1.983f, -4.85f, 1.983f)
                lineTo(2.0f, 8.862f)
                verticalLineToRelative(7.412f)
                curveToRelative(0.0f, 3.369f, 3.148f, 4.792f, 5.557f, 5.616f)
                lineToRelative(0.37f, 0.11f)
                lineToRelative(0.408f, -0.11f)
                curveToRelative(2.37f, -0.786f, 5.519f, -2.247f, 5.519f, -5.577f)
                verticalLineToRelative(-7.45f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-2.741f, 0.0f, -4.856f, -1.946f, -4.89f, -1.984f)
                close()
                moveTo(13.11f, 16.274f)
                curveToRelative(0.0f, 2.846f, -2.665f, 4.116f, -5.003f, 4.868f)
                lineToRelative(-0.185f, 0.077f)
                lineToRelative(-0.147f, -0.038f)
                curveToRelative(-2.37f, -0.786f, -5.035f, -2.06f, -5.035f, -4.902f)
                lineTo(2.74f, 9.65f)
                curveToRelative(2.74f, -0.04f, 4.817f, -1.798f, 5.187f, -2.171f)
                curveToRelative(0.446f, 0.412f, 2.48f, 2.098f, 5.187f, 2.17f)
                verticalLineToRelative(6.626f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(21.26f, 9.236f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, 0.748f)
                curveToRelative(0.0f, 0.412f, 0.333f, 0.747f, 0.74f, 0.747f)
                curveToRelative(0.408f, 0.0f, 0.74f, -0.335f, 0.74f, -0.747f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, -0.748f)
                close()
                moveTo(6.443f, 17.247f)
                lineToRelative(-2.11f, -2.132f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.0f, -0.522f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, 0.517f, 0.0f)
                lineToRelative(1.593f, 1.61f)
                lineTo(11.0f, 11.598f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, 0.516f, 0.0f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.0f, 0.522f)
                lineToRelative(-5.073f, 5.127f)
                close()
            }
        }
        .build()
        return _dataShieldLight!!
    }

private var _dataShieldLight: ImageVector? = null
