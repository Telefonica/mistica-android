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

public val FilledGroup.GiftFilled: ImageVector
    get() {
        if (_giftFilled != null) {
            return _giftFilled!!
        }
        _giftFilled = Builder(name = "GiftFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.917f)
                verticalLineToRelative(1.23f)
                horizontalLineToRelative(-7.468f)
                lineTo(12.532f, 8.984f)
                horizontalLineToRelative(2.49f)
                curveToRelative(1.374f, 0.0f, 2.489f, -1.103f, 2.489f, -2.463f)
                reflectiveCurveToRelative(-1.115f, -2.464f, -2.49f, -2.464f)
                curveToRelative(-1.315f, 0.0f, -2.407f, 1.018f, -2.484f, 2.32f)
                curveToRelative(-0.005f, 0.05f, -0.005f, 0.094f, -0.005f, 0.144f)
                verticalLineToRelative(2.463f)
                horizontalLineToRelative(-1.064f)
                lineTo(11.468f, 7.404f)
                curveToRelative(0.0f, -0.873f, -0.72f, -1.585f, -1.602f, -1.585f)
                curveToRelative(-0.883f, 0.0f, -1.598f, 0.707f, -1.598f, 1.58f)
                curveToRelative(0.0f, 0.875f, 0.72f, 1.586f, 1.602f, 1.586f)
                horizontalLineToRelative(1.602f)
                verticalLineToRelative(3.166f)
                lineTo(4.0f, 12.151f)
                verticalLineToRelative(-1.23f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, true, 1.957f, -1.936f)
                lineTo(7.74f, 8.985f)
                arcTo(2.605f, 2.605f, 0.0f, false, true, 7.204f, 7.4f)
                curveToRelative(0.0f, -1.455f, 1.196f, -2.64f, 2.666f, -2.64f)
                curveToRelative(0.683f, 0.0f, 1.302f, 0.258f, 1.775f, 0.676f)
                arcTo(3.553f, 3.553f, 0.0f, false, true, 15.026f, 3.0f)
                curveToRelative(1.961f, 0.0f, 3.554f, 1.576f, 3.554f, 3.517f)
                curveToRelative(0.0f, 0.96f, -0.391f, 1.829f, -1.02f, 2.464f)
                horizontalLineToRelative(0.488f)
                curveTo(19.122f, 8.985f, 20.0f, 9.85f, 20.0f, 10.917f)
                close()
                moveTo(4.0f, 21.473f)
                curveToRelative(0.0f, 0.293f, 0.237f, 0.527f, 0.532f, 0.527f)
                horizontalLineToRelative(6.931f)
                verticalLineToRelative(-8.795f)
                lineTo(4.0f, 13.205f)
                verticalLineToRelative(8.268f)
                close()
                moveTo(12.532f, 22.0f)
                horizontalLineToRelative(6.931f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, false, 0.532f, -0.527f)
                verticalLineToRelative(-8.268f)
                horizontalLineToRelative(-7.463f)
                lineTo(12.532f, 22.0f)
                close()
            }
        }
        .build()
        return _giftFilled!!
    }

private var _giftFilled: ImageVector? = null
