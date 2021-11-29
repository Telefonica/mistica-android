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

public val LightGroup.ShareLight: ImageVector
    get() {
        if (_shareLight != null) {
            return _shareLight!!
        }
        _shareLight = Builder(name = "ShareLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.296f, 15.499f)
                curveToRelative(2.04f, 0.0f, 3.704f, 1.684f, 3.704f, 3.75f)
                curveTo(22.0f, 21.316f, 20.337f, 23.0f, 18.296f, 23.0f)
                curveToRelative(-2.04f, 0.0f, -3.704f, -1.684f, -3.704f, -3.75f)
                curveToRelative(0.0f, -2.067f, 1.663f, -3.751f, 3.704f, -3.751f)
                close()
                moveTo(18.296f, 16.251f)
                curveToRelative(-1.634f, 0.0f, -2.961f, 1.344f, -2.961f, 2.998f)
                curveToRelative(0.0f, 1.655f, 1.327f, 3.0f, 2.961f, 3.0f)
                reflectiveCurveToRelative(2.962f, -1.345f, 2.962f, -3.0f)
                curveToRelative(0.0f, -1.654f, -1.328f, -2.998f, -2.962f, -2.998f)
                close()
                moveTo(13.481f, 15.873f)
                curveToRelative(0.41f, 0.0f, 0.742f, 0.336f, 0.742f, 0.751f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.742f, 0.752f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.743f, -0.752f)
                curveToRelative(0.0f, -0.415f, 0.333f, -0.751f, 0.743f, -0.751f)
                close()
                moveTo(18.296f, 2.0f)
                curveTo(20.336f, 2.0f, 22.0f, 3.684f, 22.0f, 5.75f)
                curveToRelative(0.0f, 2.067f, -1.663f, 3.751f, -3.704f, 3.751f)
                arcToRelative(3.686f, 3.686f, 0.0f, false, true, -3.127f, -1.747f)
                lineToRelative(-6.135f, 3.104f)
                curveToRelative(0.237f, 0.495f, 0.374f, 1.054f, 0.374f, 1.642f)
                curveToRelative(0.0f, 0.475f, -0.087f, 0.928f, -0.25f, 1.348f)
                lineToRelative(2.51f, 1.462f)
                curveToRelative(0.179f, 0.105f, 0.24f, 0.332f, 0.133f, 0.512f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, -0.502f, 0.139f)
                lineToRelative(-2.476f, -1.44f)
                arcToRelative(3.702f, 3.702f, 0.0f, false, true, -3.12f, 1.73f)
                curveTo(3.664f, 16.25f, 2.0f, 14.566f, 2.0f, 12.5f)
                reflectiveCurveToRelative(1.663f, -3.75f, 3.704f, -3.75f)
                curveToRelative(1.194f, 0.0f, 2.26f, 0.579f, 2.936f, 1.47f)
                lineToRelative(6.193f, -3.138f)
                arcToRelative(3.808f, 3.808f, 0.0f, false, true, -0.24f, -1.331f)
                curveTo(14.592f, 3.684f, 16.254f, 2.0f, 18.295f, 2.0f)
                close()
                moveTo(5.704f, 9.501f)
                curveToRelative(-1.634f, 0.0f, -2.962f, 1.344f, -2.962f, 2.999f)
                reflectiveCurveToRelative(1.328f, 2.999f, 2.962f, 2.999f)
                curveToRelative(1.634f, 0.0f, 2.961f, -1.344f, 2.961f, -2.999f)
                reflectiveCurveTo(7.338f, 9.501f, 5.704f, 9.501f)
                close()
                moveTo(18.296f, 2.751f)
                curveToRelative(-1.634f, 0.0f, -2.961f, 1.345f, -2.961f, 3.0f)
                curveToRelative(0.0f, 1.654f, 1.327f, 2.998f, 2.961f, 2.998f)
                reflectiveCurveToRelative(2.962f, -1.344f, 2.962f, -2.998f)
                curveToRelative(0.0f, -1.655f, -1.328f, -3.0f, -2.962f, -3.0f)
                close()
            }
        }
        .build()
        return _shareLight!!
    }

private var _shareLight: ImageVector? = null
