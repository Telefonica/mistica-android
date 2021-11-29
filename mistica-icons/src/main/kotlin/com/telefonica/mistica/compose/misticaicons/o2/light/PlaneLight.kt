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

public val LightGroup.PlaneLight: ImageVector
    get() {
        if (_planeLight != null) {
            return _planeLight!!
        }
        _planeLight = Builder(name = "PlaneLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.962f, 2.0f)
                curveToRelative(0.545f, 0.0f, 1.057f, 0.219f, 1.44f, 0.612f)
                arcToRelative(2.124f, 2.124f, 0.0f, false, true, 0.0f, 2.953f)
                lineTo(17.54f, 9.523f)
                lineToRelative(2.105f, 8.043f)
                curveToRelative(0.17f, 0.651f, -0.014f, 1.355f, -0.479f, 1.831f)
                lineTo(17.591f, 21.0f)
                lineToRelative(-2.138f, -3.793f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, true, 0.138f, -0.52f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.507f, 0.141f)
                lineToRelative(1.655f, 2.938f)
                lineToRelative(0.886f, -0.908f)
                curveToRelative(0.28f, -0.286f, 0.389f, -0.709f, 0.29f, -1.098f)
                lineToRelative(-2.215f, -8.465f)
                lineToRelative(4.167f, -4.27f)
                curveToRelative(0.507f, -0.519f, 0.507f, -1.36f, 0.0f, -1.879f)
                curveToRelative(-0.493f, -0.5f, -1.346f, -0.5f, -1.839f, 0.0f)
                lineToRelative(-4.167f, 4.27f)
                lineToRelative(-8.263f, -2.269f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -1.07f, 0.297f)
                lineToRelative(-0.887f, 0.908f)
                lineToRelative(7.139f, 4.225f)
                lineToRelative(-4.674f, 4.79f)
                lineToRelative(-2.48f, -0.68f)
                arcToRelative(1.088f, 1.088f, 0.0f, false, false, -1.07f, 0.295f)
                lineToRelative(-0.366f, 0.374f)
                lineToRelative(4.077f, 2.41f)
                curveToRelative(0.436f, 0.257f, 0.986f, 0.184f, 1.341f, -0.18f)
                lineToRelative(0.237f, -0.243f)
                lineToRelative(4.357f, -4.6f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.521f, -0.01f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, true, 0.01f, 0.535f)
                lineToRelative(-4.598f, 4.847f)
                arcToRelative(1.825f, 1.825f, 0.0f, false, true, -2.238f, 0.301f)
                lineTo(2.0f, 15.512f)
                lineToRelative(1.048f, -1.074f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, true, 1.787f, -0.49f)
                lineToRelative(2.067f, 0.568f)
                lineToRelative(3.688f, -3.779f)
                lineToRelative(-7.14f, -4.225f)
                lineToRelative(1.57f, -1.608f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, true, 1.787f, -0.49f)
                lineToRelative(7.85f, 2.156f)
                lineToRelative(3.864f, -3.958f)
                arcTo(2.002f, 2.002f, 0.0f, false, true, 19.96f, 2.0f)
                close()
                moveTo(14.96f, 14.142f)
                curveToRelative(0.408f, 0.0f, 0.74f, 0.34f, 0.74f, 0.758f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 0.757f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.757f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.74f, -0.758f)
                close()
            }
        }
        .build()
        return _planeLight!!
    }

private var _planeLight: ImageVector? = null
