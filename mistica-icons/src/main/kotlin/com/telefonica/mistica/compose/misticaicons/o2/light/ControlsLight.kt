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

public val LightGroup.ControlsLight: ImageVector
    get() {
        if (_controlsLight != null) {
            return _controlsLight!!
        }
        _controlsLight = Builder(name = "ControlsLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.392f, 11.626f)
                curveToRelative(0.0f, 0.407f, -0.317f, 0.739f, -0.707f, 0.739f)
                curveToRelative(-0.39f, 0.0f, -0.707f, -0.332f, -0.707f, -0.74f)
                curveToRelative(0.0f, -0.407f, 0.317f, -0.739f, 0.707f, -0.739f)
                curveToRelative(0.39f, 0.0f, 0.707f, 0.332f, 0.707f, 0.74f)
                moveToRelative(-2.298f, 8.701f)
                verticalLineToRelative(-4.92f)
                lineToRelative(0.766f, -1.777f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.177f, -0.488f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, false, -0.467f, 0.185f)
                lineToRelative(-0.798f, 1.853f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.031f, 0.152f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.512f, -0.4f, 0.924f, -0.884f, 0.924f)
                curveToRelative(-0.49f, 0.0f, -0.884f, -0.417f, -0.884f, -0.924f)
                verticalLineToRelative(-5.005f)
                arcToRelative(0.366f, 0.366f, 0.0f, false, false, -0.046f, -0.18f)
                lineTo(4.955f, 2.739f)
                horizontalLineToRelative(15.077f)
                lineToRelative(-3.685f, 6.73f)
                arcToRelative(0.387f, 0.387f, 0.0f, false, false, 0.131f, 0.507f)
                curveToRelative(0.172f, 0.1f, 0.385f, 0.038f, 0.485f, -0.137f)
                lineToRelative(3.99f, -7.284f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, false, 0.0f, -0.37f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, false, -0.309f, -0.185f)
                horizontalLineTo(4.352f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, -0.304f, 0.185f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.004f, 0.37f)
                lineToRelative(6.863f, 12.876f)
                verticalLineToRelative(4.9f)
                curveToRelative(0.0f, 0.92f, 0.716f, 1.669f, 1.596f, 1.669f)
                curveToRelative(0.879f, 0.0f, 1.59f, -0.754f, 1.59f, -1.673f)
                close()
            }
        }
        .build()
        return _controlsLight!!
    }

private var _controlsLight: ImageVector? = null
