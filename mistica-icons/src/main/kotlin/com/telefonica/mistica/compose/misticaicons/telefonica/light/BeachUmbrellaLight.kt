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

public val LightGroup.BeachUmbrellaLight: ImageVector
    get() {
        if (_beachUmbrellaLight != null) {
            return _beachUmbrellaLight!!
        }
        _beachUmbrellaLight = Builder(name = "BeachUmbrellaLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.072f, 7.009f)
                lineToRelative(-1.728f, 1.04f)
                curveToRelative(-3.116f, -3.467f, -6.314f, -4.224f, -8.413f, -4.256f)
                curveToRelative(1.996f, -0.798f, 3.9f, -0.991f, 5.677f, -0.558f)
                curveToRelative(1.678f, 0.412f, 3.224f, 1.388f, 4.601f, 2.905f)
                curveToRelative(0.112f, 0.12f, 0.164f, 0.29f, 0.147f, 0.45f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, true, -0.284f, 0.419f)
                close()
                moveTo(9.343f, 4.784f)
                curveToRelative(1.374f, -0.251f, 5.368f, -0.5f, 9.241f, 3.727f)
                lineToRelative(-5.21f, 3.137f)
                lineToRelative(-4.03f, -6.864f)
                close()
                moveTo(7.975f, 14.902f)
                curveToRelative(-2.029f, -4.83f, -0.216f, -8.335f, 0.655f, -9.604f)
                lineToRelative(3.996f, 6.8f)
                lineToRelative(-4.65f, 2.804f)
                close()
                moveTo(5.101f, 16.635f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -0.514f, 0.059f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, -0.368f, -0.327f)
                curveToRelative(-0.778f, -1.877f, -0.98f, -3.66f, -0.6f, -5.306f)
                curveToRelative(0.442f, -1.956f, 1.69f, -3.702f, 3.695f, -5.207f)
                curveToRelative(-0.95f, 1.883f, -1.929f, 5.262f, -0.099f, 9.507f)
                lineToRelative(-2.114f, 1.274f)
                close()
                moveTo(21.867f, 5.567f)
                curveToRelative(-1.494f, -1.645f, -3.192f, -2.71f, -5.046f, -3.166f)
                curveToRelative(-2.493f, -0.605f, -5.189f, -0.117f, -8.024f, 1.456f)
                lineToRelative(-0.442f, -0.754f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, false, -0.602f, -0.158f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.17f, 0.57f)
                lineToRelative(0.01f, 0.015f)
                lineToRelative(0.452f, 0.775f)
                curveTo(5.113f, 6.11f, 3.335f, 8.32f, 2.757f, 10.873f)
                curveToRelative(-0.418f, 1.816f, -0.202f, 3.775f, 0.643f, 5.812f)
                curveToRelative(0.158f, 0.38f, 0.482f, 0.678f, 0.918f, 0.825f)
                curveToRelative(0.17f, 0.05f, 0.316f, 0.073f, 0.459f, 0.073f)
                curveToRelative(0.269f, 0.0f, 0.547f, -0.073f, 0.786f, -0.217f)
                lineToRelative(7.505f, -4.522f)
                lineToRelative(5.657f, 9.632f)
                curveToRelative(0.122f, 0.208f, 0.391f, 0.281f, 0.602f, 0.158f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.17f, -0.57f)
                curveToRelative(-0.004f, -0.006f, -0.007f, -0.008f, -0.01f, -0.014f)
                lineToRelative(-5.674f, -9.656f)
                lineToRelative(7.724f, -4.654f)
                curveToRelative(0.377f, -0.228f, 0.625f, -0.603f, 0.693f, -1.038f)
                arcToRelative(1.425f, 1.425f, 0.0f, false, false, -0.363f, -1.135f)
                close()
            }
        }
        .build()
        return _beachUmbrellaLight!!
    }

private var _beachUmbrellaLight: ImageVector? = null
