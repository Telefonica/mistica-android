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

public val LightGroup.HotelLight: ImageVector
    get() {
        if (_hotelLight != null) {
            return _hotelLight!!
        }
        _hotelLight = Builder(name = "HotelLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.434f, 21.016f)
                curveToRelative(2.014f, -0.036f, 8.588f, -0.793f, 8.588f, -8.989f)
                curveToRelative(0.0f, -3.549f, -1.216f, -6.112f, -3.608f, -7.613f)
                curveToRelative(-1.955f, -1.227f, -4.163f, -1.406f, -5.022f, -1.429f)
                arcToRelative(32.3f, 32.3f, 0.0f, false, false, -0.737f, -0.008f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-0.854f, 0.008f, -3.045f, 0.157f, -4.972f, 1.367f)
                curveToRelative(-2.347f, 1.476f, -3.535f, 4.042f, -3.535f, 7.625f)
                curveToRelative(0.0f, 3.585f, 1.202f, 6.16f, 3.571f, 7.655f)
                curveToRelative(1.944f, 1.224f, 4.154f, 1.384f, 5.014f, 1.398f)
                curveToRelative(0.098f, 0.003f, 0.196f, 0.003f, 0.295f, 0.003f)
                lineToRelative(0.577f, -0.009f)
                close()
                moveTo(12.41f, 2.167f)
                curveToRelative(1.927f, 0.045f, 9.432f, 0.807f, 9.432f, 9.86f)
                curveToRelative(0.0f, 9.073f, -7.513f, 9.776f, -9.393f, 9.813f)
                curveToRelative(-0.179f, 0.003f, -0.386f, 0.005f, -0.593f, 0.005f)
                curveToRelative(-0.104f, 0.0f, -0.208f, 0.0f, -0.309f, -0.002f)
                curveToRelative(-1.977f, -0.031f, -9.392f, -0.746f, -9.392f, -9.874f)
                curveToRelative(0.0f, -9.115f, 7.348f, -9.796f, 9.322f, -9.813f)
                horizontalLineToRelative(0.177f)
                curveToRelative(0.258f, 0.0f, 0.524f, 0.003f, 0.756f, 0.011f)
                close()
                moveTo(16.312f, 17.33f)
                lineTo(16.312f, 6.669f)
                lineTo(13.88f, 6.669f)
                verticalLineToRelative(4.347f)
                horizontalLineToRelative(-3.76f)
                lineTo(10.12f, 6.67f)
                lineTo(7.687f, 6.67f)
                verticalLineToRelative(10.66f)
                horizontalLineToRelative(2.434f)
                verticalLineToRelative(-4.486f)
                horizontalLineToRelative(3.759f)
                verticalLineToRelative(4.49f)
                lineToRelative(2.434f, -0.003f)
                close()
                moveTo(16.312f, 5.85f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.82f, 0.822f)
                verticalLineToRelative(10.66f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.82f, 0.821f)
                lineTo(13.88f, 18.153f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.82f, -0.82f)
                verticalLineToRelative(-3.67f)
                lineTo(10.94f, 13.663f)
                verticalLineToRelative(3.67f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.821f, 0.82f)
                lineTo(7.688f, 18.153f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.82f, -0.82f)
                lineTo(6.868f, 6.669f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.82f, -0.82f)
                horizontalLineToRelative(2.435f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.82f, 0.82f)
                verticalLineToRelative(3.526f)
                horizontalLineToRelative(2.118f)
                lineTo(13.061f, 6.67f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.82f, -0.82f)
                curveToRelative(-0.002f, 0.002f, 2.432f, 0.002f, 2.432f, 0.002f)
                close()
            }
        }
        .build()
        return _hotelLight!!
    }

private var _hotelLight: ImageVector? = null
