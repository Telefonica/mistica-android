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

public val FilledGroup.DeliveryVanMovingFilled: ImageVector
    get() {
        if (_deliveryVanMovingFilled != null) {
            return _deliveryVanMovingFilled!!
        }
        _deliveryVanMovingFilled = Builder(name = "DeliveryVanMovingFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.028f, 10.493f)
                arcToRelative(430.2f, 430.2f, 0.0f, false, true, -3.266f, -4.356f)
                curveToRelative(-0.336f, -0.465f, -0.958f, -0.778f, -1.546f, -0.778f)
                lineTo(5.29f, 5.359f)
                curveToRelative(-0.409f, 0.0f, -0.826f, 0.184f, -1.148f, 0.504f)
                curveToRelative(-0.322f, 0.32f, -0.504f, 0.74f, -0.504f, 1.148f)
                verticalLineToRelative(0.532f)
                lineTo(2.56f, 7.543f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, 0.252f, 0.56f, 0.56f, 0.56f)
                lineTo(3.64f, 8.663f)
                verticalLineToRelative(1.611f)
                lineTo(2.56f, 10.274f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, 0.252f, 0.56f, 0.56f, 0.56f)
                lineTo(3.64f, 11.394f)
                verticalLineToRelative(1.612f)
                lineTo(2.56f, 13.006f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, 0.252f, 0.56f, 0.56f, 0.56f)
                lineTo(3.64f, 14.126f)
                verticalLineToRelative(1.078f)
                curveToRelative(0.0f, 0.41f, 0.185f, 0.827f, 0.504f, 1.149f)
                curveToRelative(0.32f, 0.322f, 0.74f, 0.504f, 1.148f, 0.504f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.266f, 1.05f, 1.09f, 1.639f, 2.35f, 1.639f)
                curveToRelative(1.261f, 0.0f, 2.085f, -0.588f, 2.348f, -1.639f)
                horizontalLineToRelative(4.585f)
                curveToRelative(0.266f, 1.05f, 1.09f, 1.639f, 2.35f, 1.639f)
                reflectiveCurveToRelative(2.084f, -0.588f, 2.35f, -1.639f)
                horizontalLineToRelative(0.625f)
                curveToRelative(0.41f, 0.0f, 0.827f, -0.185f, 1.149f, -0.504f)
                curveToRelative(0.322f, -0.32f, 0.504f, -0.74f, 0.504f, -1.149f)
                verticalLineToRelative(-3.277f)
                curveToRelative(-0.003f, -0.571f, -0.418f, -1.112f, -0.664f, -1.434f)
                close()
                moveTo(7.778f, 17.375f)
                curveToRelative(-0.926f, 0.0f, -1.321f, -0.395f, -1.321f, -1.322f)
                reflectiveCurveToRelative(0.395f, -1.322f, 1.322f, -1.322f)
                reflectiveCurveToRelative(1.322f, 0.395f, 1.322f, 1.322f)
                reflectiveCurveToRelative(-0.395f, 1.322f, -1.322f, 1.322f)
                close()
                moveTo(17.062f, 17.375f)
                curveToRelative(-0.928f, 0.0f, -1.323f, -0.395f, -1.323f, -1.322f)
                reflectiveCurveToRelative(0.395f, -1.322f, 1.323f, -1.322f)
                curveToRelative(0.927f, 0.0f, 1.322f, 0.395f, 1.322f, 1.322f)
                reflectiveCurveToRelative(-0.395f, 1.322f, -1.322f, 1.322f)
                close()
            }
        }
        .build()
        return _deliveryVanMovingFilled!!
    }

private var _deliveryVanMovingFilled: ImageVector? = null
