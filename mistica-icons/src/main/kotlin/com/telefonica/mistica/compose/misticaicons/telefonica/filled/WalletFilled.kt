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

public val FilledGroup.WalletFilled: ImageVector
    get() {
        if (_walletFilled != null) {
            return _walletFilled!!
        }
        _walletFilled = Builder(name = "WalletFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.47f, 15.252f)
                verticalLineToRelative(-2.888f)
                curveToRelative(0.0f, -0.126f, -0.1f, -0.23f, -0.224f, -0.23f)
                horizontalLineToRelative(-7.963f)
                curveToRelative(-0.84f, 0.0f, -1.527f, 0.703f, -1.527f, 1.566f)
                verticalLineToRelative(0.213f)
                curveToRelative(0.0f, 0.863f, 0.684f, 1.566f, 1.527f, 1.566f)
                horizontalLineToRelative(7.963f)
                curveToRelative(0.124f, 0.003f, 0.225f, -0.1f, 0.225f, -0.227f)
                close()
                moveTo(4.74f, 6.695f)
                curveToRelative(0.0f, 0.022f, -0.009f, 0.039f, -0.012f, 0.058f)
                lineToRelative(12.703f, 0.003f)
                lineTo(17.431f, 5.49f)
                curveToRelative(0.0f, -0.148f, -0.131f, -0.272f, -0.291f, -0.272f)
                lineToRelative(-0.286f, 0.023f)
                horizontalLineToRelative(-0.005f)
                lineTo(5.07f, 6.084f)
                curveToRelative(-0.202f, 0.003f, -0.333f, 0.126f, -0.333f, 0.272f)
                verticalLineToRelative(0.339f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(3.538f, 6.308f)
                arcTo(1.505f, 1.505f, 0.0f, false, true, 5.03f, 4.846f)
                lineToRelative(11.218f, -0.804f)
                verticalLineToRelative(-0.748f)
                lineTo(4.524f, 4.12f)
                arcToRelative(1.275f, 1.275f, 0.0f, false, false, -0.936f, 0.384f)
                curveToRelative(-0.238f, 0.247f, -0.37f, 0.572f, -0.37f, 0.919f)
                verticalLineToRelative(0.034f)
                curveToRelative(0.0f, 0.313f, 0.118f, 0.613f, 0.32f, 0.851f)
                close()
                moveTo(20.246f, 10.896f)
                curveToRelative(0.79f, 0.0f, 1.432f, 0.659f, 1.432f, 1.47f)
                verticalLineToRelative(2.889f)
                curveToRelative(0.0f, 0.81f, -0.642f, 1.468f, -1.432f, 1.468f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(0.002f, 1.596f)
                curveToRelative(0.0f, 0.678f, -0.255f, 1.317f, -0.722f, 1.796f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -1.748f, 0.745f)
                lineToRelative(-13.213f, 0.005f)
                curveToRelative(-0.745f, -0.005f, -1.398f, -0.28f, -1.846f, -0.767f)
                curveToRelative(-0.445f, -0.487f, -0.661f, -1.146f, -0.622f, -1.908f)
                lineTo(2.011f, 5.423f)
                curveToRelative(0.0f, -0.678f, 0.258f, -1.317f, 0.723f, -1.796f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, true, 1.748f, -0.745f)
                lineToRelative(12.327f, -0.868f)
                curveToRelative(0.18f, -0.006f, 0.331f, 0.048f, 0.454f, 0.165f)
                curveToRelative(0.123f, 0.118f, 0.19f, 0.28f, 0.19f, 0.454f)
                verticalLineToRelative(1.395f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 1.183f, 1.465f)
                verticalLineToRelative(1.443f)
                curveToRelative(0.342f, 0.126f, 0.644f, 0.319f, 0.885f, 0.582f)
                curveToRelative(0.445f, 0.488f, 0.658f, 1.149f, 0.619f, 1.916f)
                lineToRelative(0.003f, 1.465f)
                horizontalLineToRelative(0.103f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(12.476f, 12.891f)
                curveToRelative(0.538f, 0.0f, 0.972f, 0.448f, 0.972f, 1.0f)
                reflectiveCurveToRelative(-0.434f, 1.0f, -0.972f, 1.0f)
                reflectiveCurveToRelative(-0.972f, -0.448f, -0.972f, -1.0f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, true, 0.972f, -1.0f)
                close()
            }
        }
        .build()
        return _walletFilled!!
    }

private var _walletFilled: ImageVector? = null
