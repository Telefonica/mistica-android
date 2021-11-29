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

public val RegularGroup.BuyDevicesRegular: ImageVector
    get() {
        if (_buyDevicesRegular != null) {
            return _buyDevicesRegular!!
        }
        _buyDevicesRegular = Builder(name = "BuyDevicesRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.58f, 2.0f)
                lineTo(8.42f, 2.0f)
                curveTo(6.534f, 2.0f, 5.0f, 3.6f, 5.0f, 5.571f)
                lineTo(5.0f, 18.43f)
                curveTo(5.0f, 20.399f, 6.533f, 22.0f, 8.42f, 22.0f)
                horizontalLineToRelative(6.16f)
                curveToRelative(1.887f, 0.0f, 3.42f, -1.6f, 3.42f, -3.571f)
                lineTo(18.0f, 5.576f)
                curveTo(18.0f, 3.605f, 16.467f, 2.0f, 14.58f, 2.0f)
                close()
                moveTo(6.366f, 17.364f)
                lineTo(6.366f, 6.646f)
                horizontalLineToRelative(10.266f)
                verticalLineToRelative(10.718f)
                lineTo(6.367f, 17.364f)
                close()
                moveTo(8.42f, 3.43f)
                horizontalLineToRelative(6.158f)
                curveToRelative(1.016f, 0.0f, 1.857f, 0.773f, 2.024f, 1.788f)
                lineTo(6.397f, 5.218f)
                curveToRelative(0.167f, -1.015f, 1.008f, -1.788f, 2.024f, -1.788f)
                close()
                moveTo(14.578f, 20.577f)
                lineTo(8.421f, 20.577f)
                curveToRelative(-1.016f, 0.0f, -1.857f, -0.773f, -2.024f, -1.788f)
                horizontalLineToRelative(10.206f)
                curveToRelative(-0.167f, 1.015f, -1.008f, 1.788f, -2.024f, 1.788f)
                close()
                moveTo(14.053f, 10.394f)
                lineTo(13.334f, 8.744f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, false, -0.679f, -0.266f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.254f, 0.709f)
                lineToRelative(0.526f, 1.207f)
                horizontalLineToRelative(-2.856f)
                lineToRelative(0.526f, -1.207f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.254f, -0.709f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, false, -0.68f, 0.265f)
                lineToRelative(-0.718f, 1.651f)
                lineTo(7.094f, 10.394f)
                lineToRelative(0.998f, 4.595f)
                curveToRelative(0.136f, 0.522f, 0.666f, 0.942f, 1.183f, 0.942f)
                horizontalLineToRelative(4.45f)
                curveToRelative(0.513f, 0.0f, 1.043f, -0.425f, 1.187f, -0.969f)
                lineToRelative(0.994f, -4.568f)
                horizontalLineToRelative(-1.852f)
                close()
                moveTo(13.917f, 14.706f)
                curveToRelative(-0.018f, 0.06f, -0.136f, 0.155f, -0.193f, 0.155f)
                horizontalLineToRelative(-4.45f)
                curveToRelative(-0.057f, -0.004f, -0.175f, -0.1f, -0.188f, -0.132f)
                lineToRelative(-0.71f, -3.26f)
                horizontalLineToRelative(6.242f)
                lineToRelative(-0.701f, 3.237f)
                close()
            }
        }
        .build()
        return _buyDevicesRegular!!
    }

private var _buyDevicesRegular: ImageVector? = null
