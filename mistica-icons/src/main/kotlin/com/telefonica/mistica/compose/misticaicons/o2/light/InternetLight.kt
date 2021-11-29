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

public val LightGroup.InternetLight: ImageVector
    get() {
        if (_internetLight != null) {
            return _internetLight!!
        }
        _internetLight = Builder(name = "InternetLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.005f, 1.0f)
                curveTo(6.49f, 1.0f, 2.0f, 5.713f, 2.0f, 11.5f)
                reflectiveCurveTo(6.49f, 22.0f, 12.005f, 22.0f)
                arcToRelative(9.641f, 9.641f, 0.0f, false, false, 5.331f, -1.617f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, 0.11f, -0.519f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.494f, -0.115f)
                arcToRelative(8.989f, 8.989f, 0.0f, false, true, -2.538f, 1.162f)
                curveToRelative(1.71f, -1.651f, 2.876f, -5.025f, 2.945f, -9.037f)
                horizontalLineToRelative(3.928f)
                arcToRelative(10.073f, 10.073f, 0.0f, false, true, -1.432f, 4.823f)
                arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.11f, 0.518f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.494f, -0.115f)
                arcTo(10.864f, 10.864f, 0.0f, false, false, 22.0f, 11.505f)
                curveTo(22.01f, 5.713f, 17.519f, 1.0f, 12.005f, 1.0f)
                close()
                moveTo(2.718f, 11.874f)
                horizontalLineToRelative(3.928f)
                curveToRelative(0.068f, 4.017f, 1.239f, 7.39f, 2.949f, 9.041f)
                curveToRelative(-3.846f, -1.084f, -6.722f, -4.702f, -6.877f, -9.04f)
                close()
                moveTo(11.648f, 21.247f)
                curveToRelative(-2.337f, -0.375f, -4.198f, -4.42f, -4.29f, -9.373f)
                horizontalLineToRelative(4.29f)
                verticalLineToRelative(9.373f)
                close()
                moveTo(9.599f, 2.085f)
                curveTo(7.89f, 3.73f, 6.72f, 7.109f, 6.65f, 11.125f)
                lineTo(2.718f, 11.125f)
                curveToRelative(0.155f, -4.338f, 3.031f, -7.956f, 6.881f, -9.04f)
                close()
                moveTo(11.648f, 11.125f)
                horizontalLineToRelative(-4.29f)
                curveToRelative(0.092f, -4.952f, 1.953f, -8.997f, 4.29f, -9.372f)
                verticalLineToRelative(9.373f)
                close()
                moveTo(12.361f, 21.247f)
                verticalLineToRelative(-9.373f)
                horizontalLineToRelative(4.29f)
                curveToRelative(-0.092f, 4.953f, -1.953f, 8.998f, -4.29f, 9.373f)
                close()
                moveTo(12.361f, 11.126f)
                lineTo(12.361f, 1.753f)
                curveToRelative(2.337f, 0.375f, 4.198f, 4.42f, 4.29f, 9.373f)
                horizontalLineToRelative(-4.29f)
                close()
                moveTo(17.363f, 11.126f)
                curveToRelative(-0.068f, -4.017f, -1.239f, -7.39f, -2.949f, -9.041f)
                curveToRelative(3.846f, 1.084f, 6.722f, 4.702f, 6.882f, 9.04f)
                horizontalLineToRelative(-3.933f)
                close()
                moveTo(19.508f, 18.622f)
                curveToRelative(0.0f, 0.412f, -0.32f, 0.748f, -0.713f, 0.748f)
                curveToRelative(-0.394f, 0.0f, -0.714f, -0.336f, -0.714f, -0.748f)
                curveToRelative(0.0f, -0.413f, 0.32f, -0.75f, 0.714f, -0.75f)
                curveToRelative(0.393f, 0.0f, 0.713f, 0.337f, 0.713f, 0.75f)
                close()
            }
        }
        .build()
        return _internetLight!!
    }

private var _internetLight: ImageVector? = null
