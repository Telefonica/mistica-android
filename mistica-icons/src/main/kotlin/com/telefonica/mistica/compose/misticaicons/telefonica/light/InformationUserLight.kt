package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.InformationUserLight: ImageVector
    get() {
        if (_informationUserLight != null) {
            return _informationUserLight!!
        }
        _informationUserLight = Builder(name = "InformationUserLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.13f, 20.555f)
                curveToRelative(2.622f, -1.65f, 3.953f, -4.517f, 3.953f, -8.518f)
                curveToRelative(0.0f, -4.007f, -1.343f, -6.887f, -3.991f, -8.556f)
                curveToRelative(-2.173f, -1.368f, -4.643f, -1.55f, -5.604f, -1.562f)
                arcToRelative(33.858f, 33.858f, 0.0f, false, false, -0.976f, 0.003f)
                curveToRelative(-2.251f, 0.041f, -9.595f, 0.89f, -9.595f, 10.05f)
                curveToRelative(0.0f, 3.966f, 1.356f, 6.83f, 4.032f, 8.505f)
                curveToRelative(2.185f, 1.371f, 4.655f, 1.571f, 5.613f, 1.596f)
                curveToRelative(0.247f, 0.007f, 0.532f, 0.01f, 0.807f, 0.01f)
                horizontalLineToRelative(0.204f)
                curveToRelative(0.955f, -0.01f, 3.406f, -0.176f, 5.556f, -1.528f)
                close()
                moveTo(12.5f, 1.002f)
                curveToRelative(2.21f, 0.031f, 10.5f, 0.83f, 10.5f, 11.035f)
                curveTo(23.0f, 22.224f, 14.79f, 22.981f, 12.582f, 23.0f)
                horizontalLineToRelative(-0.21f)
                curveToRelative(-0.281f, 0.0f, -0.575f, -0.003f, -0.829f, -0.01f)
                curveTo(9.386f, 22.938f, 1.0f, 22.087f, 1.0f, 11.972f)
                curveTo(1.0f, 1.831f, 9.396f, 1.043f, 11.496f, 1.005f)
                curveToRelative(0.335f, -0.006f, 0.67f, -0.006f, 1.005f, -0.003f)
                close()
                moveTo(12.006f, 9.495f)
                curveToRelative(0.254f, 0.0f, 0.457f, 0.207f, 0.457f, 0.457f)
                verticalLineToRelative(7.15f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, -0.914f, 0.0f)
                lineTo(11.549f, 9.955f)
                arcToRelative(0.456f, 0.456f, 0.0f, false, true, 0.457f, -0.46f)
                close()
                moveTo(12.0f, 6.897f)
                arcToRelative(0.713f, 0.713f, 0.0f, true, true, 0.0f, 1.427f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, true, 0.0f, -1.427f)
                close()
            }
        }
        .build()
        return _informationUserLight!!
    }

private var _informationUserLight: ImageVector? = null
