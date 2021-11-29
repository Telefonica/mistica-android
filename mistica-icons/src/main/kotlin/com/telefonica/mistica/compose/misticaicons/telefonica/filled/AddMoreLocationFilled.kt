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

public val FilledGroup.AddMoreLocationFilled: ImageVector
    get() {
        if (_addMoreLocationFilled != null) {
            return _addMoreLocationFilled!!
        }
        _addMoreLocationFilled = Builder(name = "AddMoreLocationFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.712f, 10.717f)
                curveToRelative(1.322f, 0.0f, 2.143f, -0.81f, 2.143f, -2.112f)
                reflectiveCurveToRelative(-0.821f, -2.112f, -2.143f, -2.112f)
                curveToRelative(-1.325f, 0.0f, -2.146f, 0.81f, -2.146f, 2.112f)
                curveToRelative(0.0f, 1.303f, 0.824f, 2.112f, 2.146f, 2.112f)
                close()
                moveTo(7.678f, 19.236f)
                curveToRelative(1.434f, -0.026f, 3.857f, -0.58f, 3.857f, -4.003f)
                reflectiveCurveToRelative(-2.44f, -3.995f, -3.89f, -4.034f)
                horizontalLineToRelative(-0.457f)
                curveToRelative(-1.426f, 0.014f, -3.807f, 0.546f, -3.807f, 4.0f)
                curveToRelative(0.0f, 3.47f, 2.415f, 4.017f, 3.849f, 4.042f)
                horizontalLineToRelative(0.157f)
                curveToRelative(0.095f, 0.0f, 0.202f, 0.0f, 0.291f, -0.005f)
                close()
                moveTo(19.967f, 4.048f)
                curveToRelative(1.232f, 1.23f, 1.885f, 3.028f, 1.877f, 5.216f)
                curveToRelative(-0.009f, 4.613f, -5.928f, 11.58f, -6.77f, 12.406f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.432f, 0.176f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, -0.432f, -0.176f)
                curveToRelative(-0.423f, -0.41f, -1.37f, -1.51f, -2.47f, -3.037f)
                curveToRelative(-1.272f, 1.614f, -3.353f, 1.802f, -4.037f, 1.807f)
                curveToRelative(-0.098f, 0.009f, -0.21f, 0.009f, -0.316f, 0.009f)
                horizontalLineToRelative(-0.171f)
                curveToRelative(-1.062f, -0.014f, -5.056f, -0.395f, -5.056f, -5.247f)
                curveToRelative(0.0f, -4.838f, 3.955f, -5.199f, 5.014f, -5.207f)
                horizontalLineToRelative(0.367f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.048f, -0.782f)
                curveToRelative(0.0f, -2.176f, 0.661f, -3.977f, 1.908f, -5.199f)
                curveToRelative(1.25f, -1.22f, 3.09f, -1.848f, 5.294f, -1.854f)
                curveToRelative(2.207f, 0.008f, 4.034f, 0.658f, 5.272f, 1.888f)
                close()
                moveTo(8.065f, 14.603f)
                horizontalLineToRelative(2.033f)
                curveToRelative(0.34f, 0.0f, 0.611f, 0.268f, 0.611f, 0.602f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.61f, 0.602f)
                lineTo(8.064f, 15.807f)
                verticalLineToRelative(2.008f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.61f, 0.603f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.612f, -0.603f)
                verticalLineToRelative(-2.008f)
                lineTo(4.815f, 15.807f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.61f, -0.602f)
                curveToRelative(0.0f, -0.334f, 0.274f, -0.602f, 0.61f, -0.602f)
                horizontalLineToRelative(2.028f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0.0f, -0.334f, 0.275f, -0.603f, 0.611f, -0.603f)
                curveToRelative(0.34f, 0.0f, 0.61f, 0.269f, 0.61f, 0.602f)
                verticalLineToRelative(1.98f)
                close()
            }
        }
        .build()
        return _addMoreLocationFilled!!
    }

private var _addMoreLocationFilled: ImageVector? = null
