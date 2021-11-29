package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.LayersRegular: ImageVector
    get() {
        if (_layersRegular != null) {
            return _layersRegular!!
        }
        _layersRegular = Builder(name = "LayersRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.798f, 16.186f)
                lineTo(3.46f, 11.884f)
                lineToRelative(1.589f, -0.83f)
                lineToRelative(6.098f, 3.15f)
                arcToRelative(1.413f, 1.413f, 0.0f, false, false, 1.297f, 0.005f)
                lineToRelative(6.218f, -3.154f)
                lineToRelative(1.622f, 0.832f)
                lineToRelative(-8.485f, 4.3f)
                close()
                moveTo(20.283f, 15.144f)
                lineTo(11.798f, 19.447f)
                lineTo(3.459f, 15.144f)
                lineTo(5.048f, 14.318f)
                lineTo(11.146f, 17.464f)
                arcToRelative(1.413f, 1.413f, 0.0f, false, false, 1.297f, 0.005f)
                lineToRelative(6.218f, -3.154f)
                lineToRelative(1.622f, 0.83f)
                close()
                moveTo(11.798f, 4.282f)
                lineToRelative(8.485f, 4.338f)
                lineToRelative(-8.485f, 4.306f)
                lineTo(3.46f, 8.62f)
                lineToRelative(8.34f, -4.338f)
                close()
                moveTo(21.714f, 11.887f)
                curveToRelative(0.0f, -0.544f, -0.302f, -1.04f, -0.784f, -1.286f)
                lineToRelative(-0.686f, -0.35f)
                lineToRelative(0.68f, -0.345f)
                arcToRelative(1.442f, 1.442f, 0.0f, false, false, 0.003f, -2.569f)
                lineTo(12.443f, 3.0f)
                arcToRelative(1.434f, 1.434f, 0.0f, false, false, -0.65f, -0.157f)
                curveToRelative(-0.227f, 0.0f, -0.451f, 0.053f, -0.659f, 0.162f)
                lineToRelative(-8.338f, 4.34f)
                arcTo(1.44f, 1.44f, 0.0f, false, false, 2.8f, 9.9f)
                lineToRelative(0.678f, 0.35f)
                lineToRelative(-0.683f, 0.355f)
                curveToRelative(-0.477f, 0.247f, -0.774f, 0.74f, -0.774f, 1.28f)
                curveToRelative(0.0f, 0.541f, 0.3f, 1.031f, 0.78f, 1.278f)
                lineToRelative(0.677f, 0.35f)
                lineToRelative(-0.683f, 0.356f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 0.005f, 2.557f)
                lineToRelative(8.34f, 4.303f)
                curveToRelative(0.204f, 0.106f, 0.428f, 0.157f, 0.652f, 0.157f)
                curveToRelative(0.221f, 0.0f, 0.442f, -0.05f, 0.644f, -0.155f)
                lineToRelative(8.485f, -4.302f)
                arcToRelative(1.442f, 1.442f, 0.0f, false, false, 0.003f, -2.569f)
                lineToRelative(-0.687f, -0.35f)
                lineToRelative(0.68f, -0.347f)
                curveToRelative(0.491f, -0.241f, 0.796f, -0.737f, 0.796f, -1.277f)
                close()
            }
        }
        .build()
        return _layersRegular!!
    }

private var _layersRegular: ImageVector? = null
