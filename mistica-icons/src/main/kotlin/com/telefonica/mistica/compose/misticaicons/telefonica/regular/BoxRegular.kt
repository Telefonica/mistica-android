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

public val RegularGroup.BoxRegular: ImageVector
    get() {
        if (_boxRegular != null) {
            return _boxRegular!!
        }
        _boxRegular = Builder(name = "BoxRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.234f, 20.007f)
                curveToRelative(0.0f, 0.238f, -0.177f, 0.448f, -0.379f, 0.448f)
                lineTo(3.823f, 20.455f)
                curveToRelative(-0.201f, 0.0f, -0.375f, -0.21f, -0.375f, -0.448f)
                lineTo(3.448f, 8.56f)
                curveToRelative(0.0f, -0.238f, 0.174f, -0.449f, 0.375f, -0.449f)
                horizontalLineToRelative(5.045f)
                verticalLineToRelative(2.462f)
                curveToRelative(0.0f, 0.34f, 0.325f, 0.614f, 0.725f, 0.614f)
                horizontalLineToRelative(4.179f)
                curveToRelative(0.4f, 0.0f, 0.725f, -0.275f, 0.725f, -0.614f)
                lineToRelative(-0.002f, -2.462f)
                horizontalLineToRelative(5.36f)
                curveToRelative(0.202f, 0.0f, 0.379f, 0.21f, 0.379f, 0.449f)
                verticalLineToRelative(11.447f)
                close()
                moveTo(4.843f, 3.547f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, 0.02f, -0.144f)
                curveToRelative(0.0f, -0.095f, 0.092f, -0.173f, 0.207f, -0.173f)
                horizontalLineToRelative(4.26f)
                lineToRelative(-0.387f, 3.655f)
                lineTo(3.902f, 6.885f)
                lineToRelative(0.94f, -3.339f)
                close()
                moveTo(13.049f, 8.111f)
                verticalLineToRelative(1.846f)
                horizontalLineToRelative(-2.73f)
                lineTo(10.319f, 8.111f)
                horizontalLineToRelative(2.73f)
                close()
                moveTo(12.492f, 3.232f)
                lineTo(12.957f, 6.882f)
                horizontalLineToRelative(-2.563f)
                lineToRelative(0.387f, -3.65f)
                horizontalLineToRelative(1.711f)
                close()
                moveTo(18.822f, 3.403f)
                curveToRelative(0.0f, 0.05f, 0.006f, 0.098f, 0.022f, 0.146f)
                lineToRelative(0.967f, 3.333f)
                horizontalLineToRelative(-5.398f)
                lineToRelative(-0.462f, -3.655f)
                horizontalLineToRelative(4.664f)
                curveToRelative(0.114f, 0.003f, 0.207f, 0.078f, 0.207f, 0.176f)
                close()
                moveTo(21.654f, 8.285f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, -0.012f, -0.23f)
                lineTo(20.27f, 3.32f)
                curveToRelative(-0.053f, -0.734f, -0.773f, -1.316f, -1.653f, -1.316f)
                lineTo(5.07f, 2.004f)
                curveToRelative(-0.883f, 0.0f, -1.605f, 0.585f, -1.653f, 1.319f)
                lineTo(2.084f, 8.061f)
                curveToRelative(-0.003f, 0.014f, 0.0f, 0.025f, -0.003f, 0.04f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, false, -0.078f, 0.464f)
                verticalLineToRelative(11.447f)
                curveToRelative(0.0f, 0.925f, 0.818f, 1.678f, 1.826f, 1.678f)
                horizontalLineToRelative(16.032f)
                curveToRelative(1.008f, 0.0f, 1.826f, -0.753f, 1.826f, -1.678f)
                lineTo(21.687f, 8.565f)
                curveToRelative(-0.003f, -0.1f, -0.017f, -0.19f, -0.033f, -0.28f)
                close()
            }
        }
        .build()
        return _boxRegular!!
    }

private var _boxRegular: ImageVector? = null
