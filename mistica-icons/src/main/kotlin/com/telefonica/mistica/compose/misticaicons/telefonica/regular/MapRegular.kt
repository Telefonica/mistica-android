package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.MapRegular: ImageVector
    get() {
        if (_mapRegular != null) {
            return _mapRegular!!
        }
        _mapRegular = Builder(name = "MapRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.591f, 19.74f)
                lineToRelative(-3.218f, -0.53f)
                lineTo(17.373f, 3.53f)
                lineToRelative(3.218f, 0.53f)
                verticalLineToRelative(15.68f)
                close()
                moveTo(3.421f, 4.062f)
                lineToRelative(3.411f, -0.538f)
                verticalLineToRelative(15.684f)
                lineToRelative(-3.411f, 0.54f)
                lineTo(3.421f, 4.062f)
                close()
                moveTo(12.633f, 4.726f)
                lineTo(16.115f, 3.642f)
                verticalLineToRelative(15.641f)
                lineToRelative(-3.482f, 1.084f)
                lineTo(12.633f, 4.726f)
                close()
                moveTo(8.087f, 3.653f)
                lineToRelative(3.291f, 1.067f)
                verticalLineToRelative(15.633f)
                lineToRelative(-3.29f, -1.067f)
                lineTo(8.088f, 3.653f)
                close()
                moveTo(21.322f, 2.905f)
                lineTo(16.846f, 2.168f)
                curveToRelative(-0.014f, -0.002f, -0.03f, 0.003f, -0.045f, 0.003f)
                curveToRelative(-0.02f, -0.003f, -0.036f, -0.011f, -0.056f, -0.011f)
                curveToRelative(-0.042f, 0.0f, -0.078f, 0.014f, -0.117f, 0.022f)
                curveToRelative(-0.023f, 0.006f, -0.048f, -0.002f, -0.07f, 0.006f)
                lineToRelative(-4.55f, 1.415f)
                lineTo(7.654f, 2.19f)
                curveToRelative(-0.025f, -0.009f, -0.048f, 0.0f, -0.073f, -0.006f)
                curveToRelative(-0.042f, -0.008f, -0.078f, -0.025f, -0.123f, -0.025f)
                curveToRelative(-0.02f, 0.0f, -0.036f, 0.008f, -0.053f, 0.011f)
                curveToRelative(-0.014f, 0.003f, -0.028f, -0.005f, -0.045f, -0.003f)
                lineToRelative(-4.67f, 0.737f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.529f, 0.622f)
                verticalLineToRelative(16.952f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, 0.728f, 0.619f)
                lineToRelative(4.521f, -0.714f)
                lineToRelative(4.404f, 1.429f)
                arcToRelative(0.648f, 0.648f, 0.0f, false, false, 0.38f, 0.002f)
                lineToRelative(4.597f, -1.43f)
                lineToRelative(4.328f, 0.713f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, false, 0.51f, -0.14f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, 0.221f, -0.479f)
                lineTo(21.85f, 3.524f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, -0.527f, -0.619f)
                close()
            }
        }
        .build()
        return _mapRegular!!
    }

private var _mapRegular: ImageVector? = null
