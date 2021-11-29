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

public val RegularGroup.CreditCardRegular: ImageVector
    get() {
        if (_creditCardRegular != null) {
            return _creditCardRegular!!
        }
        _creditCardRegular = Builder(name = "CreditCardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.714f, 9.328f)
                verticalLineToRelative(3.767f)
                curveToRelative(0.0f, 0.031f, -0.014f, 0.053f, -0.017f, 0.084f)
                verticalLineToRelative(4.642f)
                curveToRelative(0.0f, 0.804f, -0.666f, 1.46f, -1.484f, 1.46f)
                lineTo(3.523f, 19.281f)
                curveToRelative(-0.82f, 0.0f, -1.487f, -0.656f, -1.487f, -1.46f)
                verticalLineToRelative(-4.678f)
                curveToRelative(-0.002f, -0.017f, -0.01f, -0.031f, -0.01f, -0.048f)
                lineTo(2.026f, 9.328f)
                curveToRelative(0.0f, -0.017f, 0.008f, -0.031f, 0.01f, -0.048f)
                lineTo(2.036f, 6.793f)
                curveToRelative(0.0f, -0.807f, 0.667f, -1.46f, 1.488f, -1.46f)
                horizontalLineToRelative(16.689f)
                curveToRelative(0.818f, 0.0f, 1.484f, 0.653f, 1.484f, 1.46f)
                verticalLineToRelative(2.45f)
                curveToRelative(0.003f, 0.029f, 0.017f, 0.054f, 0.017f, 0.085f)
                close()
                moveTo(20.213f, 18.045f)
                curveToRelative(0.126f, 0.0f, 0.23f, -0.101f, 0.232f, -0.227f)
                lineTo(20.445f, 13.71f)
                lineTo(3.291f, 13.71f)
                verticalLineToRelative(4.11f)
                curveToRelative(0.0f, 0.126f, 0.107f, 0.23f, 0.233f, 0.227f)
                curveToRelative(0.0f, -0.003f, 16.689f, -0.003f, 16.689f, -0.003f)
                close()
                moveTo(3.523f, 6.565f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, false, -0.232f, 0.228f)
                lineTo(3.291f, 8.71f)
                horizontalLineToRelative(17.152f)
                lineTo(20.443f, 6.793f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, false, -0.233f, -0.227f)
                lineTo(3.524f, 6.566f)
                close()
                moveTo(3.291f, 12.479f)
                horizontalLineToRelative(17.152f)
                lineTo(20.443f, 9.944f)
                lineTo(3.29f, 9.944f)
                verticalLineToRelative(2.535f)
                close()
            }
        }
        .build()
        return _creditCardRegular!!
    }

private var _creditCardRegular: ImageVector? = null
