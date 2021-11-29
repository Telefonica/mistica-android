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

public val RegularGroup.PrepaidRegular: ImageVector
    get() {
        if (_prepaidRegular != null) {
            return _prepaidRegular!!
        }
        _prepaidRegular = Builder(name = "PrepaidRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.237f, 15.397f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, -0.513f, 0.534f)
                horizontalLineToRelative(-4.28f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, -0.512f, -0.535f)
                curveToRelative(0.0f, -0.297f, 0.228f, -0.535f, 0.513f, -0.535f)
                curveToRelative(0.289f, 0.0f, 0.512f, -0.233f, 0.512f, -0.535f)
                verticalLineToRelative(-1.61f)
                horizontalLineToRelative(-0.17f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, -0.513f, -0.534f)
                curveToRelative(0.0f, -0.297f, 0.228f, -0.535f, 0.512f, -0.535f)
                horizontalLineToRelative(0.171f)
                lineTo(9.957f, 10.22f)
                curveToRelative(0.0f, -1.18f, 0.92f, -2.144f, 2.054f, -2.144f)
                curveToRelative(0.47f, 0.0f, 0.929f, 0.169f, 1.293f, 0.475f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, 0.074f, 0.755f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.723f, 0.078f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, -0.644f, -0.238f)
                curveToRelative(-0.565f, 0.0f, -1.024f, 0.48f, -1.024f, 1.07f)
                verticalLineToRelative(1.426f)
                horizontalLineToRelative(1.541f)
                curveToRelative(0.285f, 0.0f, 0.513f, 0.238f, 0.513f, 0.535f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, -0.513f, 0.535f)
                horizontalLineToRelative(-1.541f)
                verticalLineToRelative(1.61f)
                curveToRelative(0.0f, 0.187f, -0.031f, 0.366f, -0.088f, 0.535f)
                horizontalLineToRelative(2.825f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, 0.513f, 0.54f)
                close()
            }
        }
        .build()
        return _prepaidRegular!!
    }

private var _prepaidRegular: ImageVector? = null
