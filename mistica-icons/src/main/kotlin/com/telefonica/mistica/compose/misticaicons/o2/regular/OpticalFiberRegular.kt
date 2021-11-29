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

public val RegularGroup.OpticalFiberRegular: ImageVector
    get() {
        if (_opticalFiberRegular != null) {
            return _opticalFiberRegular!!
        }
        _opticalFiberRegular = Builder(name = "OpticalFiberRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.383f, 6.342f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -1.451f, 2.328f)
                lineToRelative(-4.782f, 4.832f)
                lineToRelative(-1.387f, -1.402f)
                lineToRelative(6.933f, -7.008f)
                curveToRelative(0.211f, 0.102f, 0.445f, 0.162f, 0.692f, 0.162f)
                curveToRelative(0.888f, 0.0f, 1.612f, -0.731f, 1.612f, -1.63f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, -1.617f, -1.62f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -1.451f, 2.329f)
                lineToRelative(-6.93f, 7.003f)
                lineToRelative(-1.387f, -1.403f)
                lineTo(15.4f, 5.097f)
                curveToRelative(0.21f, 0.101f, 0.444f, 0.162f, 0.691f, 0.162f)
                curveToRelative(0.889f, 0.0f, 1.612f, -0.732f, 1.612f, -1.63f)
                curveToRelative(0.0f, -0.898f, -0.723f, -1.629f, -1.612f, -1.629f)
                arcToRelative(1.623f, 1.623f, 0.0f, false, false, -1.452f, 2.328f)
                lineTo(9.854f, 9.165f)
                lineToRelative(-0.146f, -0.148f)
                arcToRelative(1.365f, 1.365f, 0.0f, false, false, -1.946f, 0.0f)
                lineTo(2.0f, 14.863f)
                lineTo(9.685f, 22.0f)
                lineToRelative(5.358f, -5.628f)
                arcToRelative(1.405f, 1.405f, 0.0f, false, false, 0.0f, -1.967f)
                lineToRelative(-0.133f, -0.135f)
                lineToRelative(4.786f, -4.837f)
                curveToRelative(0.211f, 0.102f, 0.445f, 0.162f, 0.692f, 0.162f)
                curveToRelative(0.888f, 0.0f, 1.612f, -0.73f, 1.612f, -1.629f)
                curveToRelative(0.0f, -0.898f, -0.728f, -1.624f, -1.617f, -1.624f)
                close()
                moveTo(20.383f, 3.088f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.536f, 0.541f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.536f, 0.542f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, 0.0f, -1.083f)
                close()
                moveTo(16.093f, 3.088f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.535f, 0.541f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.536f, 0.542f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.536f, -0.542f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.536f, -0.541f)
                close()
                moveTo(9.62f, 19.978f)
                lineToRelative(-5.556f, -5.162f)
                lineToRelative(4.672f, -4.74f)
                lineToRelative(5.253f, 5.314f)
                lineToRelative(-4.37f, 4.587f)
                close()
                moveTo(20.383f, 8.511f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, 0.0f, -1.083f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, 0.0f, 1.083f)
                close()
            }
        }
        .build()
        return _opticalFiberRegular!!
    }

private var _opticalFiberRegular: ImageVector? = null
