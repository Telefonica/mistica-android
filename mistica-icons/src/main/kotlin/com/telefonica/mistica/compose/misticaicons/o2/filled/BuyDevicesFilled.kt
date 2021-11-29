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

public val FilledGroup.BuyDevicesFilled: ImageVector
    get() {
        if (_buyDevicesFilled != null) {
            return _buyDevicesFilled!!
        }
        _buyDevicesFilled = Builder(name = "BuyDevicesFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.009f, 5.388f)
                curveTo(5.1f, 3.504f, 6.594f, 2.0f, 8.42f, 2.0f)
                horizontalLineToRelative(6.158f)
                curveToRelative(1.827f, 0.0f, 3.32f, 1.504f, 3.412f, 3.388f)
                lineTo(5.01f, 5.388f)
                close()
                moveTo(5.009f, 18.612f)
                curveTo(5.1f, 20.496f, 6.594f, 22.0f, 8.42f, 22.0f)
                horizontalLineToRelative(6.158f)
                curveToRelative(1.827f, 0.0f, 3.32f, -1.504f, 3.412f, -3.388f)
                lineTo(5.01f, 18.612f)
                close()
                moveTo(8.868f, 14.912f)
                curveToRelative(0.008f, 0.033f, 0.127f, 0.124f, 0.236f, 0.124f)
                horizontalLineToRelative(4.792f)
                curveToRelative(0.11f, 0.0f, 0.228f, -0.091f, 0.24f, -0.137f)
                lineToRelative(0.815f, -3.439f)
                lineTo(8.05f, 11.46f)
                lineToRelative(0.819f, 3.453f)
                close()
                moveTo(18.0f, 6.459f)
                verticalLineToRelative(11.084f)
                lineTo(5.0f, 17.543f)
                lineTo(5.0f, 6.458f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(16.261f, 10.391f)
                horizontalLineToRelative(-1.967f)
                lineToRelative(-0.972f, -1.865f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, -0.696f, -0.215f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.206f, 0.727f)
                lineToRelative(0.705f, 1.349f)
                horizontalLineToRelative(-3.25f)
                lineToRelative(0.705f, -1.349f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.206f, -0.727f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, -0.696f, 0.215f)
                lineToRelative(-0.972f, 1.865f)
                lineTo(6.739f, 10.391f)
                lineToRelative(1.134f, 4.792f)
                curveToRelative(0.14f, 0.526f, 0.666f, 0.924f, 1.231f, 0.924f)
                horizontalLineToRelative(4.792f)
                curveToRelative(0.56f, 0.0f, 1.09f, -0.398f, 1.235f, -0.937f)
                lineToRelative(1.13f, -4.779f)
                close()
            }
        }
        .build()
        return _buyDevicesFilled!!
    }

private var _buyDevicesFilled: ImageVector? = null
