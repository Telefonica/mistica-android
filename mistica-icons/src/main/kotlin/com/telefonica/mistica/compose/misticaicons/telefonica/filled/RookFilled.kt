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

public val FilledGroup.RookFilled: ImageVector
    get() {
        if (_rookFilled != null) {
            return _rookFilled!!
        }
        _rookFilled = Builder(name = "RookFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.472f, 6.661f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, true, -0.426f, -0.42f)
                verticalLineToRelative(-3.66f)
                curveToRelative(0.0f, -0.23f, 0.19f, -0.421f, 0.426f, -0.421f)
                lineTo(9.35f, 2.16f)
                curveToRelative(0.235f, 0.0f, 0.426f, 0.188f, 0.426f, 0.42f)
                verticalLineToRelative(1.151f)
                horizontalLineToRelative(0.904f)
                verticalLineToRelative(-1.15f)
                curveToRelative(0.0f, -0.23f, 0.19f, -0.421f, 0.426f, -0.421f)
                horizontalLineToRelative(1.628f)
                curveToRelative(0.235f, 0.0f, 0.425f, 0.188f, 0.425f, 0.42f)
                verticalLineToRelative(1.227f)
                lineToRelative(0.939f, -0.014f)
                lineTo(14.098f, 2.58f)
                curveToRelative(0.0f, -0.23f, 0.19f, -0.42f, 0.426f, -0.42f)
                horizontalLineToRelative(1.952f)
                curveToRelative(0.235f, 0.0f, 0.426f, 0.188f, 0.426f, 0.42f)
                verticalLineToRelative(3.664f)
                curveToRelative(0.0f, 0.233f, -0.19f, 0.42f, -0.426f, 0.42f)
                horizontalLineToRelative(-0.289f)
                lineTo(16.187f, 6.66f)
                horizontalLineToRelative(-8.16f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(-0.554f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(7.668f, 16.398f)
                curveToRelative(0.0f, -0.232f, 0.19f, -0.42f, 0.426f, -0.42f)
                horizontalLineToRelative(0.781f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, true, -0.014f, -0.149f)
                lineToRelative(0.813f, -6.94f)
                horizontalLineToRelative(-0.437f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, true, -0.426f, -0.42f)
                lineTo(8.811f, 7.324f)
                horizontalLineToRelative(6.392f)
                verticalLineToRelative(1.143f)
                curveToRelative(0.0f, 0.23f, -0.19f, 0.42f, -0.426f, 0.42f)
                horizontalLineToRelative(-0.437f)
                lineToRelative(0.813f, 6.941f)
                curveToRelative(0.005f, 0.05f, 0.0f, 0.101f, -0.014f, 0.149f)
                horizontalLineToRelative(0.689f)
                curveToRelative(0.235f, 0.0f, 0.426f, 0.188f, 0.426f, 0.42f)
                verticalLineToRelative(2.09f)
                lineTo(7.665f, 18.487f)
                verticalLineToRelative(-2.09f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(17.276f, 19.158f)
                curveToRelative(0.235f, 0.0f, 0.426f, 0.187f, 0.426f, 0.42f)
                verticalLineToRelative(1.848f)
                curveToRelative(0.0f, 0.233f, -0.19f, 0.42f, -0.426f, 0.42f)
                lineTo(6.646f, 21.846f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, true, -0.426f, -0.42f)
                verticalLineToRelative(-1.849f)
                curveToRelative(0.0f, -0.23f, 0.19f, -0.42f, 0.426f, -0.42f)
                horizontalLineToRelative(10.63f)
                close()
            }
        }
        .build()
        return _rookFilled!!
    }

private var _rookFilled: ImageVector? = null
