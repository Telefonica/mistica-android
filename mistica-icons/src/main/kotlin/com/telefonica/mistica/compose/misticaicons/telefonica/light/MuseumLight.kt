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

public val LightGroup.MuseumLight: ImageVector
    get() {
        if (_museumLight != null) {
            return _museumLight!!
        }
        _museumLight = Builder(name = "MuseumLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.767f, 2.236f)
                curveToRelative(0.143f, -0.101f, 0.333f, -0.101f, 0.476f, 0.0f)
                lineToRelative(9.426f, 6.568f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, true, 0.16f, 0.47f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.398f, 0.295f)
                horizontalLineToRelative(-2.045f)
                verticalLineToRelative(8.44f)
                horizontalLineToRelative(1.991f)
                curveToRelative(0.23f, 0.0f, 0.418f, 0.187f, 0.418f, 0.42f)
                verticalLineToRelative(3.003f)
                curveToRelative(0.0f, 0.232f, -0.185f, 0.42f, -0.418f, 0.42f)
                lineTo(2.632f, 21.852f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, true, -0.417f, -0.42f)
                verticalLineToRelative(-3.003f)
                curveToRelative(0.0f, -0.233f, 0.185f, -0.42f, 0.417f, -0.42f)
                horizontalLineToRelative(2.025f)
                verticalLineToRelative(-8.44f)
                lineTo(2.58f, 9.569f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.4f, -0.294f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, 0.162f, -0.47f)
                close()
                moveTo(20.957f, 18.849f)
                lineTo(3.05f, 18.849f)
                verticalLineToRelative(2.163f)
                horizontalLineToRelative(17.907f)
                verticalLineToRelative(-2.163f)
                close()
                moveTo(7.108f, 9.57f)
                lineTo(5.492f, 9.57f)
                verticalLineToRelative(8.44f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-8.44f)
                close()
                moveTo(16.1f, 9.57f)
                horizontalLineToRelative(-2.434f)
                verticalLineToRelative(8.44f)
                lineTo(16.1f, 18.01f)
                verticalLineToRelative(-8.44f)
                close()
                moveTo(12.831f, 9.57f)
                horizontalLineToRelative(-1.616f)
                verticalLineToRelative(8.44f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-8.44f)
                close()
                moveTo(10.377f, 9.57f)
                lineTo(7.943f, 9.57f)
                verticalLineToRelative(8.44f)
                horizontalLineToRelative(2.434f)
                verticalLineToRelative(-8.44f)
                close()
                moveTo(18.551f, 9.57f)
                horizontalLineToRelative(-1.616f)
                verticalLineToRelative(8.44f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-8.44f)
                close()
                moveTo(12.005f, 3.094f)
                lineTo(3.912f, 8.729f)
                horizontalLineToRelative(1.154f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.003f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(2.434f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.003f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(3.252f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.002f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(2.434f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.002f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(3.252f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.002f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(2.434f)
                lineToRelative(0.009f, -0.003f)
                curveToRelative(0.002f, 0.0f, 0.005f, 0.003f, 0.008f, 0.003f)
                horizontalLineToRelative(1.12f)
                lineToRelative(-8.09f, -5.636f)
                close()
            }
        }
        .build()
        return _museumLight!!
    }

private var _museumLight: ImageVector? = null
