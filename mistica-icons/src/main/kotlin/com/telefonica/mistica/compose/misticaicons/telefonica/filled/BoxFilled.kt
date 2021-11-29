package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.BoxFilled: ImageVector
    get() {
        if (_boxFilled != null) {
            return _boxFilled!!
        }
        _boxFilled = Builder(name = "BoxFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.235f, 20.008f)
                curveToRelative(0.0f, 0.238f, -0.176f, 0.448f, -0.378f, 0.448f)
                lineTo(3.824f, 20.456f)
                curveToRelative(-0.202f, 0.0f, -0.376f, -0.21f, -0.376f, -0.448f)
                lineTo(3.448f, 8.56f)
                curveToRelative(0.0f, -0.238f, 0.174f, -0.448f, 0.376f, -0.448f)
                horizontalLineToRelative(5.044f)
                verticalLineToRelative(2.462f)
                curveToRelative(0.0f, 0.34f, 0.325f, 0.614f, 0.726f, 0.614f)
                horizontalLineToRelative(4.18f)
                curveToRelative(0.4f, 0.0f, 0.725f, -0.275f, 0.725f, -0.614f)
                lineToRelative(-0.003f, -2.462f)
                horizontalLineToRelative(5.361f)
                curveToRelative(0.202f, 0.0f, 0.378f, 0.21f, 0.378f, 0.448f)
                verticalLineToRelative(11.448f)
                close()
                moveTo(4.843f, 3.546f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, 0.02f, -0.143f)
                curveToRelative(0.0f, -0.095f, 0.092f, -0.173f, 0.204f, -0.173f)
                horizontalLineToRelative(4.26f)
                lineToRelative(-0.386f, 3.655f)
                lineTo(3.9f, 6.885f)
                lineToRelative(0.944f, -3.339f)
                close()
                moveTo(18.823f, 3.403f)
                curveToRelative(0.0f, 0.05f, 0.006f, 0.098f, 0.023f, 0.146f)
                lineToRelative(0.966f, 3.333f)
                horizontalLineToRelative(-5.397f)
                lineToRelative(-0.463f, -3.655f)
                horizontalLineToRelative(4.664f)
                curveToRelative(0.115f, 0.003f, 0.207f, 0.078f, 0.207f, 0.176f)
                close()
                moveTo(21.655f, 8.286f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, -0.01f, -0.23f)
                lineToRelative(-1.373f, -4.737f)
                curveToRelative(-0.054f, -0.734f, -0.773f, -1.316f, -1.653f, -1.316f)
                lineTo(5.07f, 2.003f)
                curveToRelative(-0.882f, 0.0f, -1.605f, 0.585f, -1.653f, 1.32f)
                lineTo(2.084f, 8.061f)
                curveToRelative(-0.003f, 0.014f, 0.0f, 0.025f, -0.003f, 0.039f)
                arcToRelative(1.513f, 1.513f, 0.0f, false, false, -0.078f, 0.465f)
                verticalLineToRelative(11.448f)
                curveToRelative(0.0f, 0.924f, 0.818f, 1.678f, 1.826f, 1.678f)
                horizontalLineToRelative(16.034f)
                curveToRelative(1.008f, 0.0f, 1.826f, -0.754f, 1.826f, -1.678f)
                lineTo(21.689f, 8.566f)
                curveToRelative(-0.003f, -0.101f, -0.017f, -0.19f, -0.034f, -0.28f)
                close()
            }
        }
        .build()
        return _boxFilled!!
    }

private var _boxFilled: ImageVector? = null
