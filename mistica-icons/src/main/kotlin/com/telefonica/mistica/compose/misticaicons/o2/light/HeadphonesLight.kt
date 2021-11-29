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

public val LightGroup.HeadphonesLight: ImageVector
    get() {
        if (_headphonesLight != null) {
            return _headphonesLight!!
        }
        _headphonesLight = Builder(name = "HeadphonesLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.274f, 13.754f)
                curveToRelative(0.2f, 0.0f, 0.363f, 0.168f, 0.363f, 0.374f)
                verticalLineToRelative(4.31f)
                curveToRelative(0.0f, 2.03f, -1.406f, 3.562f, -3.273f, 3.562f)
                horizontalLineToRelative(-1.452f)
                verticalLineToRelative(-7.123f)
                horizontalLineToRelative(1.452f)
                curveToRelative(1.052f, 0.0f, 1.955f, 0.485f, 2.547f, 1.272f)
                verticalLineToRelative(-2.021f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.363f, -0.374f)
                close()
                moveTo(11.818f, 1.0f)
                curveToRelative(4.805f, 0.0f, 8.976f, 3.686f, 9.702f, 8.578f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.302f, 0.427f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, -0.414f, -0.312f)
                curveToRelative(-0.676f, -4.527f, -4.535f, -7.94f, -8.986f, -7.94f)
                curveToRelative(-5.014f, 0.0f, -9.092f, 4.205f, -9.092f, 9.375f)
                verticalLineToRelative(5.02f)
                arcToRelative(3.137f, 3.137f, 0.0f, false, true, 2.547f, -1.271f)
                horizontalLineToRelative(1.452f)
                verticalLineToRelative(7.118f)
                lineTo(5.273f, 21.995f)
                curveTo(3.406f, 21.995f, 2.0f, 20.464f, 2.0f, 18.434f)
                curveToRelative(0.0f, -0.053f, 0.005f, -0.101f, 0.005f, -0.154f)
                curveToRelative(0.0f, -0.01f, -0.005f, -0.02f, -0.005f, -0.034f)
                verticalLineToRelative(-7.123f)
                curveTo(2.0f, 5.541f, 6.404f, 1.0f, 11.818f, 1.0f)
                close()
                moveTo(18.364f, 15.626f)
                horizontalLineToRelative(-0.726f)
                verticalLineToRelative(5.625f)
                horizontalLineToRelative(0.726f)
                curveToRelative(1.453f, 0.0f, 2.547f, -1.21f, 2.547f, -2.813f)
                curveToRelative(0.0f, -1.603f, -1.094f, -2.812f, -2.547f, -2.812f)
                close()
                moveTo(6.0f, 15.626f)
                horizontalLineToRelative(-0.726f)
                curveToRelative(-1.453f, 0.0f, -2.547f, 1.21f, -2.547f, 2.812f)
                curveToRelative(0.0f, 1.604f, 1.094f, 2.813f, 2.547f, 2.813f)
                horizontalLineToRelative(0.726f)
                verticalLineToRelative(-5.625f)
                close()
                moveTo(21.275f, 11.128f)
                curveToRelative(0.4f, 0.0f, 0.726f, 0.335f, 0.726f, 0.749f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, -0.726f, 0.749f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, -0.727f, -0.75f)
                curveToRelative(0.0f, -0.413f, 0.326f, -0.748f, 0.727f, -0.748f)
                close()
            }
        }
        .build()
        return _headphonesLight!!
    }

private var _headphonesLight: ImageVector? = null
