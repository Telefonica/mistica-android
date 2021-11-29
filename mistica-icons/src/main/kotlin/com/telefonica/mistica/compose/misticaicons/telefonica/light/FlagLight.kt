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

public val LightGroup.FlagLight: ImageVector
    get() {
        if (_flagLight != null) {
            return _flagLight!!
        }
        _flagLight = Builder(name = "FlagLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 11.739f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.322f, 0.199f)
                lineTo(4.162f, 11.938f)
                lineTo(4.162f, 3.296f)
                curveToRelative(0.0f, -0.196f, 0.16f, -0.355f, 0.359f, -0.355f)
                horizontalLineToRelative(14.924f)
                curveToRelative(0.207f, 0.0f, 0.3f, 0.15f, 0.322f, 0.198f)
                curveToRelative(0.031f, 0.06f, 0.084f, 0.216f, -0.003f, 0.337f)
                lineToRelative(-3.168f, 3.15f)
                arcToRelative(1.143f, 1.143f, 0.0f, false, false, 0.0f, 1.612f)
                lineToRelative(3.138f, 3.126f)
                curveToRelative(0.123f, 0.16f, 0.064f, 0.316f, 0.036f, 0.375f)
                close()
                moveTo(17.16f, 7.689f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, -0.003f, -0.51f)
                lineTo(20.36f, 3.99f)
                curveToRelative(0.269f, -0.342f, 0.314f, -0.81f, 0.118f, -1.199f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, -1.031f, -0.636f)
                lineTo(4.523f, 2.155f)
                curveToRelative(-0.633f, 0.0f, -1.148f, 0.51f, -1.148f, 1.138f)
                lineTo(3.375f, 21.45f)
                curveToRelative(0.0f, 0.216f, 0.176f, 0.393f, 0.395f, 0.393f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, 0.395f, -0.39f)
                verticalLineToRelative(-8.73f)
                horizontalLineToRelative(15.283f)
                curveToRelative(0.44f, 0.0f, 0.835f, -0.245f, 1.03f, -0.637f)
                curveToRelative(0.197f, -0.392f, 0.152f, -0.851f, -0.15f, -1.238f)
                lineToRelative(-3.169f, -3.16f)
                close()
            }
        }
        .build()
        return _flagLight!!
    }

private var _flagLight: ImageVector? = null
