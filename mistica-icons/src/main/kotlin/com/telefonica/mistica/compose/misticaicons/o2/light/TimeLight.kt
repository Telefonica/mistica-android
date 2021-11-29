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

public val LightGroup.TimeLight: ImageVector
    get() {
        if (_timeLight != null) {
            return _timeLight!!
        }
        _timeLight = Builder(name = "TimeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.516f, 0.0f, 10.0f, 4.484f, 10.0f, 10.0f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, true, -1.54f, 5.328f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.492f, 0.112f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.112f, -0.492f)
                arcTo(9.212f, 9.212f, 0.0f, false, false, 21.288f, 12.0f)
                curveToRelative(0.0f, -5.116f, -4.16f, -9.288f, -9.288f, -9.288f)
                curveToRelative(-5.116f, 0.0f, -9.288f, 4.172f, -9.288f, 9.288f)
                curveToRelative(0.0f, 5.116f, 4.16f, 9.288f, 9.288f, 9.288f)
                arcToRelative(9.222f, 9.222f, 0.0f, false, false, 4.948f, -1.432f)
                arcToRelative(0.356f, 0.356f, 0.0f, true, true, 0.38f, 0.604f)
                arcTo(9.982f, 9.982f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.484f, 22.0f, 2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.484f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(18.784f, 18.072f)
                arcToRelative(0.712f, 0.712f, 0.0f, true, true, 0.0f, 1.424f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, 0.0f, -1.424f)
                close()
                moveTo(7.248f, 6.752f)
                lineToRelative(4.744f, 4.744f)
                lineTo(14.6f, 8.888f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.504f, 0.0f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.0f, 0.504f)
                lineTo(12.0f, 12.504f)
                lineTo(6.744f, 7.256f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.0f, -0.504f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.504f, 0.0f)
                close()
            }
        }
        .build()
        return _timeLight!!
    }

private var _timeLight: ImageVector? = null
