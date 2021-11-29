package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

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
                moveTo(21.992f, 8.97f)
                lineTo(21.992f, 6.938f)
                curveToRelative(0.0f, -1.073f, -0.8f, -1.938f, -1.788f, -1.938f)
                lineTo(3.788f, 5.0f)
                curveTo(2.8f, 5.0f, 2.0f, 5.865f, 2.0f, 6.938f)
                lineTo(2.0f, 8.97f)
                horizontalLineToRelative(19.992f)
                close()
                moveTo(2.0f, 10.102f)
                verticalLineToRelative(6.96f)
                curveTo(2.0f, 18.135f, 2.8f, 19.0f, 3.788f, 19.0f)
                horizontalLineToRelative(16.424f)
                curveTo(21.2f, 19.0f, 22.0f, 18.135f, 22.0f, 17.062f)
                verticalLineToRelative(-6.96f)
                lineTo(2.0f, 10.102f)
                close()
                moveTo(9.493f, 13.508f)
                lineTo(4.501f, 13.508f)
                curveToRelative(-0.3f, 0.0f, -0.537f, -0.259f, -0.537f, -0.569f)
                curveToRelative(0.0f, -0.318f, 0.244f, -0.568f, 0.537f, -0.568f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.3f, 0.0f, 0.537f, 0.259f, 0.537f, 0.568f)
                curveToRelative(-0.008f, 0.318f, -0.244f, 0.569f, -0.545f, 0.569f)
                close()
                moveTo(14.143f, 13.508f)
                horizontalLineToRelative(-2.505f)
                curveToRelative(-0.3f, 0.0f, -0.536f, -0.259f, -0.536f, -0.569f)
                curveToRelative(0.0f, -0.318f, 0.244f, -0.568f, 0.536f, -0.568f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.3f, 0.0f, 0.537f, 0.259f, 0.537f, 0.568f)
                curveToRelative(0.0f, 0.318f, -0.245f, 0.569f, -0.533f, 0.569f)
                close()
                moveTo(19.491f, 13.508f)
                lineTo(16.28f, 13.508f)
                curveToRelative(-0.3f, 0.0f, -0.536f, -0.259f, -0.536f, -0.569f)
                curveToRelative(0.0f, -0.318f, 0.244f, -0.568f, 0.536f, -0.568f)
                horizontalLineToRelative(3.212f)
                curveToRelative(0.3f, 0.0f, 0.537f, 0.259f, 0.537f, 0.568f)
                curveToRelative(-0.004f, 0.318f, -0.236f, 0.569f, -0.537f, 0.569f)
                close()
            }
        }
        .build()
        return _creditCardFilled!!
    }

private var _creditCardFilled: ImageVector? = null
