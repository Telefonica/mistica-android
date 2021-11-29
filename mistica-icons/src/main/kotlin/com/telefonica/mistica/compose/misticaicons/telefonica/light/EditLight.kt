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

public val LightGroup.EditLight: ImageVector
    get() {
        if (_editLight != null) {
            return _editLight!!
        }
        _editLight = Builder(name = "EditLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.003f, 16.943f)
                lineToRelative(-0.174f, 0.154f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.117f, 0.068f)
                lineToRelative(-3.838f, 1.269f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, -0.428f, -0.432f)
                lineToRelative(1.285f, -3.835f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, true, 0.098f, -0.148f)
                curveToRelative(2.505f, -2.21f, 7.325f, -6.482f, 7.659f, -6.818f)
                curveToRelative(0.52f, -0.52f, 1.084f, -0.641f, 1.493f, -0.641f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, 1.546f, 0.641f)
                curveToRelative(0.403f, 0.403f, 0.644f, 0.983f, 0.641f, 1.552f)
                curveToRelative(-0.002f, 0.555f, -0.227f, 1.07f, -0.65f, 1.487f)
                curveToRelative(-0.15f, 0.152f, -1.324f, 1.219f, -7.515f, 6.703f)
                close()
                moveTo(18.569f, 17.84f)
                curveToRelative(0.0f, 0.986f, -0.26f, 1.764f, -0.773f, 2.313f)
                curveToRelative(-0.544f, 0.58f, -1.345f, 0.874f, -2.381f, 0.874f)
                lineTo(6.272f, 21.027f)
                curveToRelative(-1.036f, 0.0f, -1.838f, -0.294f, -2.378f, -0.874f)
                curveToRelative(-0.513f, -0.549f, -0.773f, -1.327f, -0.773f, -2.313f)
                lineTo(3.121f, 6.218f)
                curveToRelative(0.0f, -2.059f, 1.148f, -3.238f, 3.151f, -3.238f)
                horizontalLineToRelative(9.143f)
                curveToRelative(1.846f, 0.0f, 2.963f, 1.022f, 3.123f, 2.798f)
                arcToRelative(2.927f, 2.927f, 0.0f, false, false, -1.63f, 0.846f)
                curveToRelative(-0.263f, 0.263f, -4.123f, 3.69f, -7.622f, 6.782f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.333f, 0.501f)
                lineToRelative(-1.286f, 3.837f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 1.098f, 1.53f)
                curveToRelative(0.123f, 0.0f, 0.246f, -0.02f, 0.364f, -0.059f)
                lineToRelative(3.838f, -1.269f)
                arcToRelative(1.16f, 1.16f, 0.0f, false, false, 0.403f, -0.232f)
                lineToRelative(0.174f, -0.154f)
                curveToRelative(1.689f, -1.496f, 3.56f, -3.157f, 5.022f, -4.46f)
                verticalLineToRelative(4.74f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(21.986f, 8.756f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, -0.882f, -2.135f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, false, -1.748f, -0.846f)
                curveToRelative(-0.174f, -2.235f, -1.655f, -3.619f, -3.944f, -3.619f)
                horizontalLineToRelative(-9.14f)
                curveToRelative(-2.451f, 0.0f, -3.972f, 1.555f, -3.972f, 4.06f)
                verticalLineToRelative(11.62f)
                curveToRelative(0.0f, 1.203f, 0.336f, 2.169f, 0.994f, 2.875f)
                curveToRelative(0.703f, 0.75f, 1.703f, 1.132f, 2.978f, 1.132f)
                horizontalLineToRelative(9.143f)
                curveToRelative(1.272f, 0.0f, 2.274f, -0.381f, 2.977f, -1.132f)
                curveToRelative(0.662f, -0.706f, 0.998f, -1.672f, 0.998f, -2.874f)
                verticalLineToRelative(-5.454f)
                curveToRelative(0.0f, -0.003f, -0.003f, -0.008f, -0.003f, -0.014f)
                curveToRelative(0.93f, -0.829f, 1.577f, -1.414f, 1.709f, -1.543f)
                curveToRelative(0.58f, -0.575f, 0.887f, -1.292f, 0.89f, -2.07f)
                close()
            }
        }
        .build()
        return _editLight!!
    }

private var _editLight: ImageVector? = null
