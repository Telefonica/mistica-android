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

public val RegularGroup.PlugRegular: ImageVector
    get() {
        if (_plugRegular != null) {
            return _plugRegular!!
        }
        _plugRegular = Builder(name = "PlugRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.318f, 7.266f)
                horizontalLineToRelative(-0.608f)
                lineTo(16.71f, 3.6f)
                arcToRelative(1.603f, 1.603f, 0.0f, false, false, -3.204f, 0.0f)
                verticalLineToRelative(3.664f)
                lineToRelative(-2.502f, -0.003f)
                lineTo(11.004f, 3.6f)
                arcToRelative(1.603f, 1.603f, 0.0f, false, false, -3.204f, 0.0f)
                verticalLineToRelative(3.66f)
                horizontalLineToRelative(-0.46f)
                curveToRelative(-0.638f, 0.0f, -1.162f, 0.522f, -1.162f, 1.205f)
                curveToRelative(0.0f, 2.776f, 1.168f, 4.26f, 2.258f, 5.04f)
                verticalLineToRelative(1.14f)
                curveToRelative(0.0f, 0.865f, 0.355f, 1.358f, 0.647f, 1.613f)
                curveToRelative(0.355f, 0.327f, 0.843f, 0.501f, 1.437f, 0.532f)
                verticalLineToRelative(3.95f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.95f, 0.946f)
                horizontalLineToRelative(1.727f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, 0.947f, -0.947f)
                verticalLineToRelative(-3.95f)
                curveToRelative(0.6f, -0.027f, 1.093f, -0.2f, 1.448f, -0.531f)
                curveToRelative(0.289f, -0.26f, 0.633f, -0.754f, 0.633f, -1.614f)
                lineTo(16.225f, 13.5f)
                curveToRelative(1.09f, -0.785f, 2.258f, -2.264f, 2.258f, -5.003f)
                verticalLineToRelative(-0.07f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -1.165f, -1.16f)
                close()
                moveTo(12.918f, 16.804f)
                verticalLineToRelative(3.66f)
                horizontalLineToRelative(-1.18f)
                verticalLineToRelative(-3.66f)
                horizontalLineToRelative(1.18f)
                close()
                moveTo(7.39f, 8.479f)
                lineToRelative(9.857f, 0.006f)
                verticalLineToRelative(0.01f)
                horizontalLineToRelative(0.008f)
                curveToRelative(0.0f, 1.945f, -0.66f, 3.345f, -1.969f, 4.158f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, -0.288f, 0.518f)
                verticalLineToRelative(1.47f)
                curveToRelative(0.0f, 0.331f, -0.079f, 0.572f, -0.236f, 0.715f)
                curveToRelative(-0.199f, 0.182f, -0.538f, 0.221f, -0.787f, 0.221f)
                horizontalLineToRelative(-3.28f)
                curveToRelative(-0.364f, 0.0f, -0.633f, -0.076f, -0.804f, -0.232f)
                curveToRelative(-0.16f, -0.14f, -0.24f, -0.376f, -0.24f, -0.704f)
                verticalLineToRelative(-1.465f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.292f, -0.52f)
                curveToRelative(-1.294f, -0.802f, -1.955f, -2.191f, -1.97f, -4.177f)
                close()
                moveTo(15.107f, 3.221f)
                curveToRelative(0.204f, 0.0f, 0.378f, 0.174f, 0.378f, 0.378f)
                verticalLineToRelative(3.667f)
                horizontalLineToRelative(-0.76f)
                lineTo(14.725f, 3.6f)
                curveToRelative(0.0f, -0.204f, 0.175f, -0.378f, 0.382f, -0.378f)
                close()
                moveTo(9.401f, 3.221f)
                curveToRelative(0.204f, 0.0f, 0.378f, 0.174f, 0.378f, 0.378f)
                lineTo(9.779f, 7.26f)
                horizontalLineToRelative(-0.759f)
                lineTo(9.02f, 3.6f)
                curveToRelative(0.0f, -0.205f, 0.174f, -0.379f, 0.38f, -0.379f)
                close()
            }
        }
        .build()
        return _plugRegular!!
    }

private var _plugRegular: ImageVector? = null
