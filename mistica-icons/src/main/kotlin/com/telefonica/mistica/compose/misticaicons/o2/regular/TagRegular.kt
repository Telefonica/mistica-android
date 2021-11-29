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

public val RegularGroup.TagRegular: ImageVector
    get() {
        if (_tagRegular != null) {
            return _tagRegular!!
        }
        _tagRegular = Builder(name = "TagRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.793f, 1.218f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, -1.004f, 0.0f)
                lineToRelative(-1.214f, 1.274f)
                lineTo(10.52f, 2.492f)
                curveToRelative(-0.568f, 0.0f, -1.105f, 0.234f, -1.504f, 0.654f)
                lineTo(2.622f, 9.858f)
                arcTo(2.269f, 2.269f, 0.0f, false, false, 2.0f, 11.438f)
                curveToRelative(0.0f, 0.596f, 0.223f, 1.159f, 0.622f, 1.579f)
                lineToRelative(7.934f, 8.33f)
                curveToRelative(0.413f, 0.434f, 0.959f, 0.653f, 1.504f, 0.653f)
                reflectiveCurveToRelative(1.09f, -0.22f, 1.504f, -0.654f)
                lineToRelative(6.388f, -6.707f)
                curveToRelative(0.405f, -0.425f, 0.623f, -0.983f, 0.623f, -1.58f)
                lineTo(20.575f, 3.546f)
                lineToRelative(1.213f, -1.273f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, false, 0.005f, -1.055f)
                close()
                moveTo(19.157f, 13.055f)
                curveToRelative(0.0f, 0.2f, -0.072f, 0.386f, -0.209f, 0.53f)
                lineToRelative(-6.388f, 6.707f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, true, -1.004f, 0.0f)
                lineToRelative(-7.93f, -8.33f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, true, 0.0f, -1.054f)
                lineToRelative(6.39f, -6.708f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, true, 0.499f, -0.22f)
                horizontalLineToRelative(7.638f)
                lineToRelative(-0.913f, 0.97f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, false, 0.0f, 1.053f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(0.917f, -0.963f)
                verticalLineToRelative(8.015f)
                close()
                moveTo(16.854f, 11.065f)
                curveToRelative(-2.39f, 0.0f, -4.262f, -2.046f, -4.262f, -4.66f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.532f, -0.559f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.532f, 0.558f)
                curveToRelative(0.0f, 2.615f, -1.872f, 4.661f, -4.262f, 4.661f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.531f, 0.558f)
                curveToRelative(0.0f, 0.31f, 0.236f, 0.559f, 0.531f, 0.559f)
                curveToRelative(2.508f, 0.0f, 4.262f, 1.76f, 4.262f, 4.284f)
                curveToRelative(0.0f, 0.31f, 0.237f, 0.558f, 0.532f, 0.558f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, 0.532f, -0.558f)
                curveToRelative(0.0f, -2.524f, 1.753f, -4.284f, 4.262f, -4.284f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, 0.531f, -0.559f)
                curveToRelative(0.0f, -0.31f, -0.24f, -0.558f, -0.531f, -0.558f)
                close()
                moveTo(12.06f, 13.995f)
                arcToRelative(4.997f, 4.997f, 0.0f, false, false, -2.395f, -2.41f)
                curveToRelative(1.045f, -0.558f, 1.886f, -1.479f, 2.395f, -2.619f)
                curveToRelative(0.509f, 1.14f, 1.35f, 2.061f, 2.394f, 2.62f)
                arcToRelative(4.997f, 4.997f, 0.0f, false, false, -2.394f, 2.409f)
                close()
            }
        }
        .build()
        return _tagRegular!!
    }

private var _tagRegular: ImageVector? = null
