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

public val FilledGroup.CreditCardFilled: ImageVector
    get() {
        if (_creditCardFilled != null) {
            return _creditCardFilled!!
        }
        _creditCardFilled = Builder(name = "CreditCardFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.213f, 18.045f)
                lineTo(3.523f, 18.045f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, true, -0.232f, -0.227f)
                lineTo(3.291f, 13.71f)
                horizontalLineToRelative(17.154f)
                verticalLineToRelative(4.107f)
                arcToRelative(0.233f, 0.233f, 0.0f, false, true, -0.232f, 0.227f)
                close()
                moveTo(3.523f, 6.565f)
                horizontalLineToRelative(16.69f)
                curveToRelative(0.129f, 0.0f, 0.232f, 0.102f, 0.232f, 0.228f)
                lineTo(20.445f, 8.71f)
                lineTo(3.291f, 8.71f)
                lineTo(3.291f, 6.793f)
                curveToRelative(0.0f, -0.126f, 0.104f, -0.227f, 0.233f, -0.227f)
                close()
                moveTo(21.714f, 9.328f)
                curveToRelative(0.0f, -0.031f, -0.014f, -0.056f, -0.017f, -0.084f)
                lineTo(21.697f, 6.793f)
                curveToRelative(0.0f, -0.807f, -0.666f, -1.46f, -1.484f, -1.46f)
                lineTo(3.523f, 5.333f)
                curveToRelative(-0.82f, 0.0f, -1.487f, 0.653f, -1.487f, 1.46f)
                lineTo(2.036f, 9.28f)
                curveToRelative(-0.002f, 0.017f, -0.01f, 0.03f, -0.01f, 0.048f)
                verticalLineToRelative(3.767f)
                curveToRelative(0.0f, 0.017f, 0.008f, 0.031f, 0.01f, 0.048f)
                verticalLineToRelative(4.675f)
                curveToRelative(0.0f, 0.804f, 0.667f, 1.46f, 1.488f, 1.46f)
                horizontalLineToRelative(16.689f)
                curveToRelative(0.818f, 0.0f, 1.484f, -0.656f, 1.484f, -1.46f)
                verticalLineToRelative(-4.642f)
                curveToRelative(0.003f, -0.028f, 0.017f, -0.053f, 0.017f, -0.084f)
                lineTo(21.714f, 9.328f)
                close()
            }
        }
        .build()
        return _creditCardFilled!!
    }

private var _creditCardFilled: ImageVector? = null
