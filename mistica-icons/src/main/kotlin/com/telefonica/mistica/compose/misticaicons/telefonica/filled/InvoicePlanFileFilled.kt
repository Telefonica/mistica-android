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
                moveToRelative(18.845f, 7.336f)
                lineToRelative(-5.463f, -5.182f)
                arcTo(0.56f, 0.56f, 0.0f, false, false, 13.0f, 2.0f)
                lineTo(5.618f, 2.0f)
                curveToRelative(-0.569f, 0.0f, -1.107f, 0.538f, -1.107f, 1.106f)
                verticalLineToRelative(17.48f)
                curveToRelative(0.0f, 0.588f, 0.518f, 1.106f, 1.107f, 1.106f)
                horizontalLineToRelative(12.297f)
                curveToRelative(0.588f, 0.0f, 1.106f, -0.518f, 1.106f, -1.107f)
                lineTo(19.021f, 7.742f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.176f, -0.406f)
                close()
                moveTo(15.31f, 18.681f)
                lineTo(8.209f, 18.681f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.251f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.251f, 0.56f, -0.56f, 0.56f)
                close()
                moveTo(15.31f, 15.675f)
                lineTo(8.209f, 15.675f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.251f, 0.56f, -0.56f, 0.56f)
                close()
                moveTo(15.31f, 12.672f)
                lineTo(8.209f, 12.672f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.251f, 0.56f, -0.56f, 0.56f)
                close()
                moveTo(15.45f, 7.728f)
                curveToRelative(-0.653f, 0.0f, -1.2f, -0.204f, -1.583f, -0.588f)
                curveToRelative(-0.384f, -0.384f, -0.588f, -0.933f, -0.588f, -1.583f)
                lineTo(13.279f, 3.6f)
                lineToRelative(4.353f, 4.13f)
                lineTo(15.45f, 7.73f)
                close()
            }
        }
        .build()
        return _invoicePlanFileFilled!!
    }

private var _invoicePlanFileFilled: ImageVector? = null
