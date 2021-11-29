package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.WifiRegular: ImageVector
    get() {
        if (_wifiRegular != null) {
            return _wifiRegular!!
        }
        _wifiRegular = Builder(name = "WifiRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 13.597f)
                curveToRelative(1.824f, 0.0f, 3.572f, 0.758f, 4.784f, 2.118f)
                curveToRelative(0.285f, 0.301f, 0.285f, 0.797f, 0.0f, 1.06f)
                curveToRelative(-0.284f, 0.3f, -0.752f, 0.3f, -1.0f, 0.0f)
                arcToRelative(5.144f, 5.144f, 0.0f, false, false, -3.784f, -1.666f)
                curveToRelative(-1.464f, 0.0f, -2.824f, 0.606f, -3.752f, 1.665f)
                arcToRelative(0.865f, 0.865f, 0.0f, false, true, -0.532f, 0.191f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.5f, -0.19f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, -0.036f, -1.06f)
                curveToRelative(1.212f, -1.36f, 2.928f, -2.118f, 4.82f, -2.118f)
                close()
                moveTo(12.002f, 9.779f)
                curveToRelative(2.752f, 0.0f, 5.357f, 1.17f, 7.285f, 3.254f)
                curveToRelative(0.284f, 0.301f, 0.284f, 0.797f, 0.0f, 1.06f)
                curveToRelative(-0.284f, 0.3f, -0.752f, 0.3f, -1.0f, 0.0f)
                curveToRelative(-1.68f, -1.814f, -3.893f, -2.801f, -6.285f, -2.801f)
                curveToRelative(-2.392f, 0.0f, -4.608f, 0.983f, -6.285f, 2.8f)
                curveToRelative(-0.108f, 0.153f, -0.324f, 0.23f, -0.504f, 0.23f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, true, -0.5f, -0.23f)
                arcToRelative(0.765f, 0.765f, 0.0f, false, true, 0.0f, -1.059f)
                curveToRelative(1.928f, -2.08f, 4.537f, -3.254f, 7.289f, -3.254f)
                close()
                moveTo(12.002f, 6.0f)
                curveToRelative(3.68f, 0.0f, 7.145f, 1.55f, 9.785f, 4.385f)
                curveToRelative(0.284f, 0.301f, 0.284f, 0.797f, 0.0f, 1.06f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, true, -0.5f, 0.228f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, true, -0.5f, -0.229f)
                curveToRelative(-2.392f, -2.533f, -5.5f, -3.931f, -8.789f, -3.931f)
                curveToRelative(-3.288f, 0.0f, -6.389f, 1.402f, -8.785f, 3.931f)
                curveToRelative(-0.284f, 0.301f, -0.716f, 0.301f, -1.0f, 0.0f)
                arcToRelative(0.765f, 0.765f, 0.0f, false, true, 0.0f, -1.059f)
                curveTo(4.857f, 7.551f, 8.322f, 6.0f, 12.002f, 6.0f)
                close()
            }
        }
        .build()
        return _wifiRegular!!
    }

private var _wifiRegular: ImageVector? = null
