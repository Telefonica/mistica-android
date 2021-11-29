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

public val RegularGroup.InvoicePlanFileRegular: ImageVector
    get() {
        if (_invoicePlanFileRegular != null) {
            return _invoicePlanFileRegular!!
        }
        _invoicePlanFileRegular = Builder(name = "InvoicePlanFileRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 7.428f)
                lineTo(10.428f, 2.0f)
                lineTo(20.0f, 2.0f)
                close()
                moveTo(18.572f, 3.428f)
                horizontalLineToRelative(-7.144f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(12.144f)
                horizontalLineToRelative(12.144f)
                lineTo(18.572f, 3.428f)
                close()
                moveTo(16.428f, 16.644f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, 0.716f)
                lineTo(8.572f, 18.076f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.396f, 0.324f, -0.716f, 0.716f, -0.716f)
                close()
                moveTo(16.428f, 13.072f)
                arcToRelative(0.715f, 0.715f, 0.0f, true, true, 0.0f, 1.432f)
                lineTo(8.572f, 14.504f)
                arcToRelative(0.715f, 0.715f, 0.0f, true, true, 0.0f, -1.432f)
                close()
                moveTo(10.0f, 4.428f)
                lineTo(7.428f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 4.428f)
                close()
            }
        }
        .build()
        return _invoicePlanFileRegular!!
    }

private var _invoicePlanFileRegular: ImageVector? = null
