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

public val FilledGroup.CreditCardVisaFilled: ImageVector
    get() {
        if (_creditCardVisaFilled != null) {
            return _creditCardVisaFilled!!
        }
        _creditCardVisaFilled = Builder(name = "CreditCardVisaFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.24f, 18.092f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.222f, -0.218f)
                verticalLineToRelative(-5.762f)
                lineTo(3.216f, 12.112f)
                verticalLineToRelative(5.762f)
                curveToRelative(0.0f, 0.12f, 0.1f, 0.218f, 0.224f, 0.218f)
                horizontalLineToRelative(16.8f)
                close()
                moveTo(3.44f, 6.518f)
                arcToRelative(0.222f, 0.222f, 0.0f, false, false, -0.224f, 0.221f)
                verticalLineToRelative(1.194f)
                horizontalLineToRelative(17.246f)
                lineTo(20.462f, 6.739f)
                curveToRelative(0.0f, -0.12f, -0.1f, -0.22f, -0.221f, -0.22f)
                lineTo(3.44f, 6.519f)
                close()
                moveTo(21.686f, 8.527f)
                verticalLineToRelative(2.991f)
                curveToRelative(0.0f, 0.028f, -0.014f, 0.056f, -0.017f, 0.084f)
                verticalLineToRelative(6.272f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.428f, 1.406f)
                lineTo(3.44f, 19.28f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.429f, -1.406f)
                verticalLineToRelative(-6.305f)
                curveToRelative(-0.003f, -0.017f, -0.011f, -0.031f, -0.011f, -0.05f)
                lineTo(2.0f, 8.526f)
                curveToRelative(0.0f, -0.017f, 0.008f, -0.034f, 0.011f, -0.048f)
                lineTo(2.011f, 6.742f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 3.44f, 5.336f)
                horizontalLineToRelative(16.8f)
                curveToRelative(0.788f, 0.0f, 1.43f, 0.63f, 1.43f, 1.406f)
                verticalLineToRelative(1.703f)
                curveToRelative(0.002f, 0.026f, 0.016f, 0.05f, 0.016f, 0.082f)
                close()
                moveTo(14.507f, 16.345f)
                curveToRelative(0.513f, -0.009f, 1.123f, -0.219f, 1.123f, -1.169f)
                curveToRelative(0.0f, -0.95f, -0.616f, -1.162f, -1.134f, -1.176f)
                horizontalLineToRelative(-0.146f)
                curveToRelative(-0.504f, 0.003f, -1.106f, 0.21f, -1.106f, 1.168f)
                curveToRelative(0.0f, 0.96f, 0.61f, 1.17f, 1.12f, 1.18f)
                lineToRelative(0.143f, -0.003f)
                close()
                moveTo(17.375f, 12.975f)
                curveToRelative(0.99f, 0.022f, 2.149f, 0.613f, 2.149f, 2.204f)
                curveToRelative(0.0f, 1.594f, -1.16f, 2.18f, -2.151f, 2.196f)
                horizontalLineToRelative(-0.174f)
                curveToRelative(-0.27f, -0.002f, -0.846f, -0.061f, -1.345f, -0.431f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, true, -1.333f, 0.429f)
                horizontalLineToRelative(-0.174f)
                curveToRelative(-0.991f, -0.014f, -2.15f, -0.6f, -2.15f, -2.208f)
                reflectiveCurveToRelative(1.153f, -2.187f, 2.14f, -2.196f)
                curveToRelative(0.064f, 0.0f, 0.128f, 0.0f, 0.184f, 0.003f)
                curveToRelative(0.445f, 0.011f, 0.924f, 0.146f, 1.32f, 0.429f)
                curveToRelative(0.52f, -0.384f, 1.134f, -0.429f, 1.35f, -0.432f)
                curveToRelative(0.061f, 0.0f, 0.128f, 0.003f, 0.184f, 0.006f)
                close()
            }
        }
        .build()
        return _creditCardVisaFilled!!
    }

private var _creditCardVisaFilled: ImageVector? = null
