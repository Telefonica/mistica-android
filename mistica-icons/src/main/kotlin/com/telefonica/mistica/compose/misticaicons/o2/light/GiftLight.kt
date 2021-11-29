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

public val LightGroup.GiftLight: ImageVector
    get() {
        if (_giftLight != null) {
            return _giftLight!!
        }
        _giftLight = Builder(name = "GiftLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.29f, 21.28f)
                horizontalLineToRelative(-7.11f)
                verticalLineToRelative(-8.243f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(4.302f)
                curveToRelative(0.0f, 0.198f, 0.16f, 0.358f, 0.356f, 0.358f)
                curveToRelative(0.195f, 0.0f, 0.355f, -0.16f, 0.355f, -0.358f)
                verticalLineToRelative(-6.454f)
                curveToRelative(0.0f, -0.986f, -0.797f, -1.793f, -1.78f, -1.793f)
                horizontalLineToRelative(-0.955f)
                arcToRelative(3.41f, 3.41f, 0.0f, false, false, 1.31f, -2.688f)
                curveTo(18.217f, 4.528f, 16.703f, 3.0f, 14.842f, 3.0f)
                curveToRelative(-1.601f, 0.0f, -2.943f, 1.133f, -3.29f, 2.647f)
                arcToRelative(2.469f, 2.469f, 0.0f, false, false, -1.864f, -0.853f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.489f, 2.509f)
                curveToRelative(0.0f, 0.702f, 0.287f, 1.335f, 0.75f, 1.793f)
                horizontalLineToRelative(-2.17f)
                curveTo(4.802f, 9.096f, 4.0f, 9.9f, 4.0f, 10.89f)
                verticalLineToRelative(10.752f)
                curveToRelative(0.0f, 0.197f, 0.16f, 0.358f, 0.355f, 0.358f)
                lineTo(19.28f, 22.0f)
                curveToRelative(0.196f, 0.0f, 0.355f, -0.16f, 0.355f, -0.358f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, false, -0.346f, -0.362f)
                close()
                moveTo(12.18f, 6.408f)
                curveToRelative(0.0f, -1.481f, 1.196f, -2.688f, 2.666f, -2.688f)
                curveToRelative(1.469f, 0.0f, 2.666f, 1.207f, 2.666f, 2.688f)
                curveToRelative(0.0f, 1.482f, -1.197f, 2.688f, -2.666f, 2.688f)
                lineTo(12.18f, 9.096f)
                lineTo(12.18f, 6.408f)
                close()
                moveTo(12.18f, 9.812f)
                horizontalLineToRelative(5.686f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.065f, 1.073f)
                verticalLineToRelative(1.432f)
                lineTo(12.18f, 12.317f)
                lineTo(12.18f, 9.812f)
                close()
                moveTo(11.47f, 21.28f)
                lineTo(4.719f, 21.28f)
                verticalLineToRelative(-8.243f)
                horizontalLineToRelative(6.751f)
                verticalLineToRelative(8.243f)
                close()
                moveTo(11.47f, 12.321f)
                lineTo(4.719f, 12.321f)
                lineTo(4.719f, 10.89f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.064f, -1.073f)
                horizontalLineToRelative(5.687f)
                verticalLineToRelative(2.504f)
                close()
                moveTo(11.47f, 9.096f)
                lineTo(9.691f, 9.096f)
                arcToRelative(1.789f, 1.789f, 0.0f, false, true, -1.779f, -1.793f)
                curveToRelative(0.0f, -0.991f, 0.797f, -1.794f, 1.78f, -1.794f)
                curveToRelative(0.982f, 0.0f, 1.778f, 0.803f, 1.778f, 1.794f)
                verticalLineToRelative(1.793f)
                close()
                moveTo(20.0f, 19.486f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, -0.71f, 0.716f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, -0.71f, -0.716f)
                curveToRelative(0.0f, -0.394f, 0.32f, -0.715f, 0.71f, -0.715f)
                curveToRelative(0.392f, 0.0f, 0.71f, 0.32f, 0.71f, 0.715f)
                close()
            }
        }
        .build()
        return _giftLight!!
    }

private var _giftLight: ImageVector? = null
