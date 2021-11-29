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

public val FilledGroup.InvoicePlanFileFilled: ImageVector
    get() {
        if (_invoicePlanFileFilled != null) {
            return _invoicePlanFileFilled!!
        }
        _invoicePlanFileFilled = Builder(name = "InvoicePlanFileFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 8.252f)
                horizontalLineToRelative(6.252f)
                lineTo(11.252f, 2.0f)
                lineTo(20.0f, 2.0f)
                close()
                moveTo(16.428f, 16.82f)
                lineTo(8.572f, 16.82f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.536f, 0.536f)
                curveToRelative(0.0f, 0.284f, 0.252f, 0.536f, 0.536f, 0.536f)
                horizontalLineToRelative(7.856f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, false, 0.536f, -0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.536f, -0.536f)
                close()
                moveTo(16.428f, 13.248f)
                lineTo(8.572f, 13.248f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.536f, 0.536f)
                curveToRelative(0.0f, 0.284f, 0.252f, 0.536f, 0.536f, 0.536f)
                horizontalLineToRelative(7.856f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.536f, -0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.536f, -0.536f)
                close()
                moveTo(10.18f, 2.248f)
                lineTo(10.18f, 7.18f)
                lineTo(5.252f, 7.18f)
                lineToRelative(4.928f, -4.932f)
                close()
            }
        }
        .build()
        return _invoicePlanFileFilled!!
    }

private var _invoicePlanFileFilled: ImageVector? = null
