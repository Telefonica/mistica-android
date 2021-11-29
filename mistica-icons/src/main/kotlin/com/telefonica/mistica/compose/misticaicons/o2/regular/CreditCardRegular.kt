package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

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
                moveTo(19.848f, 5.0f)
                curveToRelative(1.18f, 0.0f, 2.144f, 1.017f, 2.152f, 2.272f)
                verticalLineToRelative(9.456f)
                curveToRelative(0.0f, 1.25f, -0.964f, 2.272f, -2.144f, 2.272f)
                lineTo(4.144f, 19.0f)
                curveTo(2.964f, 19.0f, 2.0f, 17.979f, 2.0f, 16.728f)
                lineTo(2.0f, 7.272f)
                curveTo(2.0f, 6.022f, 2.964f, 5.0f, 4.144f, 5.0f)
                close()
                moveTo(20.568f, 10.298f)
                lineTo(3.432f, 10.298f)
                verticalLineToRelative(6.43f)
                curveToRelative(0.0f, 0.411f, 0.316f, 0.755f, 0.712f, 0.755f)
                horizontalLineToRelative(15.704f)
                curveToRelative(0.396f, 0.0f, 0.72f, -0.344f, 0.72f, -0.755f)
                verticalLineToRelative(-6.43f)
                close()
                moveTo(9.493f, 12.184f)
                curveToRelative(0.397f, 0.0f, 0.713f, 0.344f, 0.713f, 0.755f)
                curveToRelative(0.0f, 0.42f, -0.316f, 0.754f, -0.713f, 0.754f)
                lineTo(4.857f, 13.693f)
                curveToRelative(-0.397f, 0.0f, -0.713f, -0.335f, -0.713f, -0.754f)
                curveToRelative(0.0f, -0.42f, 0.316f, -0.755f, 0.713f, -0.755f)
                close()
                moveTo(14.143f, 12.184f)
                curveToRelative(0.388f, 0.0f, 0.712f, 0.344f, 0.708f, 0.755f)
                curveToRelative(0.0f, 0.42f, -0.316f, 0.754f, -0.713f, 0.754f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.396f, 0.0f, -0.712f, -0.335f, -0.712f, -0.754f)
                curveToRelative(0.0f, -0.42f, 0.316f, -0.755f, 0.712f, -0.755f)
                close()
                moveTo(19.135f, 12.184f)
                curveToRelative(0.397f, 0.0f, 0.713f, 0.344f, 0.713f, 0.755f)
                curveToRelative(0.0f, 0.42f, -0.316f, 0.754f, -0.713f, 0.754f)
                lineTo(16.28f, 13.693f)
                curveToRelative(-0.396f, 0.0f, -0.712f, -0.335f, -0.712f, -0.754f)
                curveToRelative(0.0f, -0.42f, 0.316f, -0.755f, 0.712f, -0.755f)
                close()
                moveTo(19.855f, 6.509f)
                lineTo(4.146f, 6.509f)
                curveToRelative(-0.397f, 0.0f, -0.72f, 0.343f, -0.72f, 0.763f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(17.143f)
                lineTo(20.569f, 7.263f)
                curveToRelative(0.0f, -0.41f, -0.316f, -0.754f, -0.712f, -0.754f)
                close()
            }
        }
        .build()
        return _creditCardRegular!!
    }

private var _creditCardRegular: ImageVector? = null
