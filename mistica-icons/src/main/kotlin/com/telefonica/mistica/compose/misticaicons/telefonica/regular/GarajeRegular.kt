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

public val RegularGroup.GarajeRegular: ImageVector
    get() {
        if (_garajeRegular != null) {
            return _garajeRegular!!
        }
        _garajeRegular = Builder(name = "GarajeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.238f, 10.445f)
                lineToRelative(-8.104f, -7.94f)
                curveToRelative(-0.683f, -0.67f, -1.843f, -0.67f, -2.526f, 0.0f)
                lineTo(2.5f, 10.447f)
                curveToRelative(-0.459f, 0.451f, -0.596f, 1.09f, -0.36f, 1.67f)
                curveToRelative(0.257f, 0.63f, 0.895f, 1.039f, 1.624f, 1.039f)
                horizontalLineToRelative(0.414f)
                verticalLineToRelative(6.927f)
                curveToRelative(0.0f, 0.885f, 0.779f, 1.605f, 1.737f, 1.605f)
                horizontalLineToRelative(1.443f)
                curveToRelative(0.005f, 0.0f, 0.008f, -0.003f, 0.014f, -0.003f)
                curveToRelative(0.002f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(8.921f)
                curveToRelative(0.009f, 0.0f, 0.015f, -0.003f, 0.02f, -0.003f)
                curveToRelative(0.009f, 0.0f, 0.017f, 0.003f, 0.025f, 0.003f)
                horizontalLineToRelative(1.356f)
                curveToRelative(0.958f, 0.0f, 1.737f, -0.72f, 1.737f, -1.605f)
                verticalLineToRelative(-6.927f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.727f, 0.0f, 1.366f, -0.406f, 1.624f, -1.04f)
                curveToRelative(0.244f, -0.582f, 0.103f, -1.22f, -0.356f, -1.672f)
                close()
                moveTo(12.291f, 3.361f)
                lineTo(20.395f, 11.305f)
                curveToRelative(0.112f, 0.11f, 0.14f, 0.23f, 0.09f, 0.353f)
                curveToRelative(-0.054f, 0.135f, -0.222f, 0.289f, -0.51f, 0.289f)
                horizontalLineToRelative(-1.132f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.602f, 0.602f)
                verticalLineToRelative(7.53f)
                curveToRelative(0.0f, 0.218f, -0.244f, 0.4f, -0.532f, 0.4f)
                horizontalLineToRelative(-0.754f)
                verticalLineToRelative(-7.846f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.602f, -0.602f)
                lineTo(7.36f, 12.031f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.602f, 0.602f)
                verticalLineToRelative(7.846f)
                horizontalLineToRelative(-0.84f)
                curveToRelative(-0.289f, 0.0f, -0.532f, -0.182f, -0.532f, -0.4f)
                verticalLineToRelative(-7.53f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.603f, -0.602f)
                lineTo(3.768f, 11.947f)
                curveToRelative(-0.292f, 0.0f, -0.457f, -0.157f, -0.51f, -0.289f)
                curveToRelative(-0.054f, -0.126f, -0.023f, -0.243f, 0.09f, -0.353f)
                lineToRelative(8.103f, -7.944f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, 0.84f, 0.0f)
                close()
                moveTo(15.751f, 18.871f)
                verticalLineToRelative(1.608f)
                lineTo(7.964f, 20.479f)
                verticalLineToRelative(-1.608f)
                horizontalLineToRelative(7.787f)
                close()
                moveTo(15.751f, 16.061f)
                verticalLineToRelative(1.608f)
                lineTo(7.964f, 17.669f)
                verticalLineToRelative(-1.607f)
                horizontalLineToRelative(7.787f)
                close()
                moveTo(15.751f, 13.238f)
                verticalLineToRelative(1.62f)
                lineTo(7.964f, 14.858f)
                verticalLineToRelative(-1.62f)
                horizontalLineToRelative(7.787f)
                close()
            }
        }
        .build()
        return _garajeRegular!!
    }

private var _garajeRegular: ImageVector? = null
