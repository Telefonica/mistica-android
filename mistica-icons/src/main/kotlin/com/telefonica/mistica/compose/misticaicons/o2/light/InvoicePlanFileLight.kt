package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.InvoicePlanFileLight: ImageVector
    get() {
        if (_invoicePlanFileLight != null) {
            return _invoicePlanFileLight!!
        }
        _invoicePlanFileLight = Builder(name = "InvoicePlanFileLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.648f, 2.0f)
                verticalLineToRelative(15.36f)
                curveToRelative(0.0f, 0.212f, -0.136f, 0.356f, -0.347f, 0.356f)
                curveToRelative(-0.207f, 0.0f, -0.348f, -0.14f, -0.348f, -0.356f)
                lineTo(18.953f, 2.716f)
                horizontalLineToRelative(-8.371f)
                verticalLineToRelative(5.0f)
                lineTo(5.699f, 7.716f)
                verticalLineToRelative(13.568f)
                horizontalLineToRelative(13.602f)
                curveToRelative(0.21f, 0.0f, 0.347f, 0.144f, 0.347f, 0.36f)
                curveToRelative(0.0f, 0.212f, -0.136f, 0.356f, -0.347f, 0.356f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 7.216f)
                lineToRelative(4.988f, -5.108f)
                lineToRelative(0.106f, -0.108f)
                horizontalLineToRelative(9.554f)
                close()
                moveTo(19.301f, 18.784f)
                curveToRelative(0.386f, 0.0f, 0.699f, 0.32f, 0.699f, 0.716f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, true, -0.7f, 0.716f)
                curveToRelative(-0.385f, 0.0f, -0.698f, -0.32f, -0.698f, -0.716f)
                curveToRelative(0.0f, -0.395f, 0.313f, -0.716f, 0.699f, -0.716f)
                close()
                moveTo(16.164f, 17.0f)
                curveToRelative(0.207f, 0.0f, 0.348f, 0.144f, 0.344f, 0.356f)
                curveToRelative(0.0f, 0.212f, -0.137f, 0.356f, -0.348f, 0.356f)
                lineTo(8.488f, 17.712f)
                curveToRelative(-0.207f, 0.0f, -0.347f, -0.14f, -0.347f, -0.356f)
                curveToRelative(0.0f, -0.212f, 0.136f, -0.356f, 0.347f, -0.356f)
                close()
                moveTo(16.164f, 13.428f)
                curveToRelative(0.207f, 0.0f, 0.348f, 0.144f, 0.344f, 0.356f)
                curveToRelative(0.0f, 0.212f, -0.137f, 0.356f, -0.348f, 0.356f)
                lineTo(8.488f, 14.14f)
                curveToRelative(-0.207f, 0.0f, -0.347f, -0.14f, -0.347f, -0.356f)
                curveToRelative(0.0f, -0.212f, 0.136f, -0.356f, 0.347f, -0.356f)
                close()
                moveTo(9.883f, 3.216f)
                lineTo(6.188f, 7.0f)
                horizontalLineToRelative(3.695f)
                lineTo(9.883f, 3.216f)
                close()
            }
        }
        .build()
        return _invoicePlanFileLight!!
    }

private var _invoicePlanFileLight: ImageVector? = null
