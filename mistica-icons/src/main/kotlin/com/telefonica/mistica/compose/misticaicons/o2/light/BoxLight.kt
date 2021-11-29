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

public val LightGroup.BoxLight: ImageVector
    get() {
        if (_boxLight != null) {
            return _boxLight!!
        }
        _boxLight = Builder(name = "BoxLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.327f, 2.0f)
                lineToRelative(4.125f, 2.4f)
                curveToRelative(0.01f, 0.005f, 0.023f, 0.01f, 0.032f, 0.018f)
                lineToRelative(4.17f, 2.422f)
                verticalLineToRelative(5.007f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, -0.347f, 0.343f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, -0.346f, -0.343f)
                verticalLineToRelative(-4.22f)
                lineToRelative(-7.288f, 4.075f)
                verticalLineToRelative(8.3f)
                lineToRelative(7.457f, -4.334f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, 0.475f, 0.123f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, -0.125f, 0.47f)
                lineTo(12.327f, 21.0f)
                lineTo(4.0f, 16.16f)
                lineTo(4.0f, 6.84f)
                lineTo(12.327f, 2.0f)
                close()
                moveTo(4.693f, 7.623f)
                verticalLineToRelative(8.146f)
                lineToRelative(7.287f, 4.229f)
                verticalLineToRelative(-8.3f)
                lineTo(8.148f, 9.553f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, true, -0.058f, -0.031f)
                lineToRelative(-3.397f, -1.9f)
                close()
                moveTo(20.307f, 13.219f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.693f, 0.686f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.693f, 0.685f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.693f, -0.685f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.693f, -0.686f)
                close()
                moveTo(16.266f, 5.082f)
                lineTo(8.992f, 9.236f)
                lineToRelative(3.335f, 1.868f)
                lineTo(19.61f, 7.03f)
                lineToRelative(-3.344f, -1.947f)
                close()
                moveTo(12.326f, 2.796f)
                lineTo(5.045f, 7.029f)
                lineTo(8.29f, 8.845f)
                lineToRelative(7.288f, -4.159f)
                lineToRelative(-3.251f, -1.89f)
                close()
            }
        }
        .build()
        return _boxLight!!
    }

private var _boxLight: ImageVector? = null
