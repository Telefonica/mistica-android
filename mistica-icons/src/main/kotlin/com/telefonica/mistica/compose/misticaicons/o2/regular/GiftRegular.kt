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

public val RegularGroup.GiftRegular: ImageVector
    get() {
        if (_giftRegular != null) {
            return _giftRegular!!
        }
        _giftRegular = Builder(name = "GiftRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.998f, 9.037f)
                horizontalLineToRelative(-0.167f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, 0.712f, -2.265f)
                curveTo(18.543f, 4.657f, 16.946f, 3.0f, 14.907f, 3.0f)
                curveToRelative(-1.578f, 0.0f, -2.886f, 0.99f, -3.398f, 2.42f)
                arcToRelative(2.952f, 2.952f, 0.0f, false, false, -1.69f, -0.532f)
                curveToRelative(-1.555f, 0.0f, -2.728f, 1.218f, -2.728f, 2.83f)
                curveToRelative(0.0f, 0.484f, 0.107f, 0.933f, 0.298f, 1.32f)
                lineTo(6.002f, 9.038f)
                curveTo(4.88f, 9.037f, 4.0f, 10.031f, 4.0f, 11.301f)
                verticalLineToRelative(10.945f)
                curveToRelative(0.0f, 0.415f, 0.326f, 0.753f, 0.726f, 0.753f)
                horizontalLineToRelative(14.548f)
                curveToRelative(0.4f, 0.0f, 0.726f, -0.338f, 0.726f, -0.753f)
                verticalLineToRelative(-10.95f)
                curveToRelative(0.0f, -1.265f, -0.88f, -2.26f, -2.002f, -2.26f)
                close()
                moveTo(18.543f, 11.297f)
                verticalLineToRelative(1.13f)
                horizontalLineToRelative(-5.82f)
                lineTo(12.723f, 10.54f)
                horizontalLineToRelative(5.275f)
                curveToRelative(0.4f, 0.005f, 0.545f, 0.46f, 0.545f, 0.759f)
                close()
                moveTo(14.907f, 4.507f)
                curveToRelative(1.243f, 0.0f, 2.183f, 0.975f, 2.183f, 2.265f)
                reflectiveCurveToRelative(-0.935f, 2.265f, -2.183f, 2.265f)
                horizontalLineToRelative(-2.183f)
                lineTo(12.724f, 6.772f)
                curveToRelative(0.0f, -1.29f, 0.94f, -2.265f, 2.183f, -2.265f)
                close()
                moveTo(8.543f, 7.714f)
                curveToRelative(0.0f, -0.778f, 0.522f, -1.319f, 1.271f, -1.319f)
                curveToRelative(0.699f, 0.0f, 1.453f, 0.507f, 1.453f, 1.319f)
                verticalLineToRelative(1.318f)
                lineTo(9.814f, 9.032f)
                curveToRelative(-0.75f, 0.005f, -1.27f, -0.54f, -1.27f, -1.318f)
                close()
                moveTo(5.997f, 10.544f)
                horizontalLineToRelative(5.274f)
                verticalLineToRelative(1.889f)
                lineTo(5.452f, 12.433f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0.0f, -0.305f, 0.145f, -0.759f, 0.545f, -0.759f)
                close()
                moveTo(5.452f, 13.939f)
                horizontalLineToRelative(5.82f)
                verticalLineToRelative(7.544f)
                horizontalLineToRelative(-5.82f)
                lineTo(5.452f, 13.94f)
                close()
                moveTo(12.724f, 21.489f)
                verticalLineToRelative(-7.55f)
                horizontalLineToRelative(5.819f)
                verticalLineToRelative(7.544f)
                horizontalLineToRelative(-5.82f)
                verticalLineToRelative(0.005f)
                close()
            }
        }
        .build()
        return _giftRegular!!
    }

private var _giftRegular: ImageVector? = null
