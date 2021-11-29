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

public val FilledGroup.PayInvoiceFilled: ImageVector
    get() {
        if (_payInvoiceFilled != null) {
            return _payInvoiceFilled!!
        }
        _payInvoiceFilled = Builder(name = "PayInvoiceFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.86f, 2.0f)
                lineTo(7.144f, 2.0f)
                curveTo(5.964f, 2.0f, 5.0f, 2.96f, 5.0f, 4.144f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 4.144f)
                arcTo(2.143f, 2.143f, 0.0f, false, false, 17.86f, 2.0f)
                close()
                moveTo(11.762f, 6.823f)
                horizontalLineToRelative(0.365f)
                arcToRelative(2.682f, 2.682f, 0.0f, false, true, 2.625f, -2.144f)
                curveToRelative(0.42f, 0.0f, 0.832f, 0.1f, 1.22f, 0.302f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, true, 0.233f, 0.722f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, true, -0.722f, 0.233f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.727f, -0.183f)
                curveToRelative(-0.7f, 0.0f, -1.285f, 0.448f, -1.509f, 1.07f)
                horizontalLineToRelative(1.674f)
                curveToRelative(0.297f, 0.0f, 0.535f, 0.238f, 0.535f, 0.535f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, 0.535f)
                horizontalLineToRelative(-1.674f)
                curveToRelative(0.224f, 0.621f, 0.81f, 1.07f, 1.51f, 1.07f)
                curveToRelative(0.25f, 0.0f, 0.493f, -0.06f, 0.726f, -0.184f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.722f, 0.234f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, -0.233f, 0.722f)
                arcToRelative(2.621f, 2.621f, 0.0f, false, true, -1.22f, 0.302f)
                arcToRelative(2.682f, 2.682f, 0.0f, false, true, -2.625f, -2.144f)
                horizontalLineToRelative(-0.365f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, -0.535f)
                curveToRelative(0.0f, -0.297f, 0.237f, -0.535f, 0.535f, -0.535f)
                close()
                moveTo(16.429f, 17.895f)
                lineTo(8.575f, 17.895f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, -0.535f)
                curveToRelative(0.0f, -0.297f, 0.238f, -0.535f, 0.535f, -0.535f)
                horizontalLineToRelative(7.859f)
                curveToRelative(0.297f, 0.0f, 0.535f, 0.238f, 0.535f, 0.535f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, true, -0.54f, 0.535f)
                close()
                moveTo(16.429f, 14.325f)
                lineTo(8.575f, 14.325f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, true, -0.535f, -0.535f)
                curveToRelative(0.0f, -0.297f, 0.238f, -0.535f, 0.535f, -0.535f)
                horizontalLineToRelative(7.859f)
                curveToRelative(0.297f, 0.0f, 0.535f, 0.238f, 0.535f, 0.535f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, true, -0.54f, 0.535f)
                close()
            }
        }
        .build()
        return _payInvoiceFilled!!
    }

private var _payInvoiceFilled: ImageVector? = null
