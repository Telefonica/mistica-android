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

public val LightGroup.CreditCardLight: ImageVector
    get() {
        if (_creditCardLight != null) {
            return _creditCardLight!!
        }
        _creditCardLight = Builder(name = "CreditCardLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.598f, 9.317f)
                verticalLineToRelative(3.81f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, true, 0.0f, 0.087f)
                verticalLineToRelative(4.724f)
                curveToRelative(0.003f, 0.327f, -0.13f, 0.643f, -0.363f, 0.876f)
                curveToRelative(-0.236f, 0.23f, -0.552f, 0.36f, -0.884f, 0.36f)
                lineTo(3.531f, 19.174f)
                arcToRelative(1.231f, 1.231f, 0.0f, false, true, -1.231f, -1.22f)
                lineTo(2.3f, 6.72f)
                arcTo(1.233f, 1.233f, 0.0f, false, true, 3.539f, 5.5f)
                lineTo(20.35f, 5.5f)
                curveToRelative(0.327f, -0.003f, 0.643f, 0.126f, 0.876f, 0.354f)
                curveToRelative(0.234f, 0.228f, 0.368f, 0.539f, 0.368f, 0.865f)
                verticalLineToRelative(2.51f)
                curveToRelative(0.006f, 0.03f, 0.006f, 0.06f, 0.003f, 0.088f)
                close()
                moveTo(3.105f, 9.724f)
                verticalLineToRelative(3.012f)
                horizontalLineToRelative(17.691f)
                lineTo(20.796f, 9.724f)
                lineTo(3.105f, 9.724f)
                close()
                moveTo(3.539f, 6.307f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, -0.437f, 0.423f)
                verticalLineToRelative(2.2f)
                lineTo(20.78f, 8.93f)
                verticalLineToRelative(-2.2f)
                arcToRelative(0.425f, 0.425f, 0.0f, false, false, -0.426f, -0.423f)
                lineTo(3.539f, 6.307f)
                close()
                moveTo(20.354f, 18.37f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, false, 0.442f, -0.423f)
                verticalLineToRelative(-4.413f)
                lineTo(3.105f, 13.534f)
                verticalLineToRelative(4.413f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, 0.437f, 0.423f)
                horizontalLineToRelative(16.812f)
                close()
            }
        }
        .build()
        return _creditCardLight!!
    }

private var _creditCardLight: ImageVector? = null
