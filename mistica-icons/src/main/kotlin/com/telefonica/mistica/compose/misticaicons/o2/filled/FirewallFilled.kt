package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.FirewallFilled: ImageVector
    get() {
        if (_firewallFilled != null) {
            return _firewallFilled!!
        }
        _firewallFilled = Builder(name = "FirewallFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.184f, 15.832f)
                lineTo(22.0f, 15.832f)
                verticalLineToRelative(4.163f)
                horizontalLineToRelative(-5.816f)
                verticalLineToRelative(-4.163f)
                close()
                moveTo(10.583f, 20.0f)
                horizontalLineToRelative(4.508f)
                verticalLineToRelative(-4.163f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-0.213f, 1.967f, -1.413f, 3.33f, -2.688f, 4.163f)
                close()
                moveTo(19.088f, 14.698f)
                verticalLineToRelative(-4.164f)
                horizontalLineToRelative(-7.123f)
                curveToRelative(0.544f, 0.795f, 1.237f, 2.157f, 1.307f, 4.164f)
                horizontalLineToRelative(5.816f)
                close()
                moveTo(7.53f, 20.0f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.256f, -0.111f)
                curveToRelative(-0.075f, -0.073f, -0.107f, -0.228f, -0.107f, -0.34f)
                curveToRelative(0.0f, 0.0f, 0.219f, -1.061f, 0.037f, -1.895f)
                curveToRelative(-0.074f, -0.378f, -0.256f, -0.683f, -0.474f, -1.023f)
                curveToRelative(-0.22f, -0.378f, -0.508f, -0.833f, -0.62f, -1.439f)
                curveToRelative(-0.106f, -0.494f, -0.218f, -1.134f, -0.325f, -1.706f)
                arcToRelative(8.959f, 8.959f, 0.0f, false, false, -0.726f, 2.157f)
                curveToRelative(-0.4f, 1.817f, 0.107f, 2.99f, 0.107f, 2.99f)
                curveToRelative(0.075f, 0.15f, 0.038f, 0.3f, -0.074f, 0.417f)
                curveToRelative(-0.112f, 0.116f, -0.256f, 0.15f, -0.4f, 0.078f)
                curveToRelative(-0.107f, -0.04f, -2.582f, -1.173f, -2.69f, -4.47f)
                curveToRelative(-0.074f, -2.006f, 1.02f, -3.406f, 1.964f, -4.657f)
                curveToRelative(0.582f, -0.795f, 1.163f, -1.512f, 1.345f, -2.273f)
                curveToRelative(0.437f, -1.895f, 0.362f, -3.068f, 0.362f, -3.296f)
                curveToRelative(0.0f, -0.15f, 0.075f, -0.305f, 0.182f, -0.378f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, true, 0.4f, 0.039f)
                curveToRelative(0.107f, 0.189f, 3.015f, 2.573f, 3.015f, 5.68f)
                curveToRelative(0.0f, 1.023f, -0.075f, 1.857f, -0.182f, 2.385f)
                curveToRelative(0.145f, -0.078f, 0.289f, -0.19f, 0.4f, -0.3f)
                curveToRelative(0.289f, -0.301f, 0.475f, -0.834f, 0.508f, -1.023f)
                curveToRelative(0.037f, -0.15f, 0.107f, -0.228f, 0.255f, -0.267f)
                curveToRelative(0.107f, -0.039f, 0.256f, 0.0f, 0.363f, 0.078f)
                curveToRelative(0.075f, 0.077f, 1.564f, 1.55f, 1.564f, 4.468f)
                curveTo(12.179f, 19.244f, 7.633f, 20.0f, 7.6f, 20.0f)
                horizontalLineToRelative(-0.07f)
                close()
            }
        }
        .build()
        return _firewallFilled!!
    }

private var _firewallFilled: ImageVector? = null
