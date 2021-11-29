package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.BusFilled: ImageVector
    get() {
        if (_busFilled != null) {
            return _busFilled!!
        }
        _busFilled = Builder(name = "BusFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.585f, 4.526f)
                curveToRelative(0.44f, 0.014f, 2.537f, 0.175f, 4.174f, 1.817f)
                curveToRelative(1.297f, 1.303f, 1.955f, 3.174f, 1.947f, 5.563f)
                verticalLineToRelative(3.381f)
                curveToRelative(0.0f, 0.58f, -0.252f, 1.168f, -0.692f, 1.61f)
                curveToRelative(-0.44f, 0.446f, -1.025f, 0.701f, -1.6f, 0.701f)
                horizontalLineToRelative(-0.224f)
                curveToRelative(-0.453f, 1.064f, -1.445f, 1.692f, -2.82f, 1.692f)
                curveToRelative(-1.376f, 0.0f, -2.367f, -0.628f, -2.821f, -1.692f)
                lineTo(9.686f, 17.598f)
                curveToRelative(-0.454f, 1.064f, -1.445f, 1.692f, -2.82f, 1.692f)
                curveToRelative(-1.39f, 0.0f, -2.393f, -0.639f, -2.838f, -1.728f)
                arcTo(2.336f, 2.336f, 0.0f, false, true, 2.72f, 16.9f)
                curveToRelative(-0.443f, -0.443f, -0.695f, -1.031f, -0.695f, -1.611f)
                lineTo(2.025f, 6.836f)
                curveToRelative(0.0f, -0.582f, 0.252f, -1.17f, 0.695f, -1.613f)
                curveToRelative(0.44f, -0.443f, 1.025f, -0.698f, 1.6f, -0.698f)
                close()
                moveTo(16.375f, 14.251f)
                curveToRelative(-1.26f, 0.0f, -1.899f, 0.644f, -1.899f, 1.913f)
                curveToRelative(0.0f, 1.269f, 0.639f, 1.913f, 1.9f, 1.913f)
                curveToRelative(1.26f, 0.0f, 1.899f, -0.644f, 1.899f, -1.913f)
                curveToRelative(0.0f, -1.269f, -0.64f, -1.913f, -1.9f, -1.913f)
                close()
                moveTo(6.868f, 14.251f)
                curveToRelative(-1.26f, 0.0f, -1.899f, 0.644f, -1.899f, 1.913f)
                curveToRelative(0.0f, 1.269f, 0.639f, 1.913f, 1.9f, 1.913f)
                curveToRelative(1.26f, 0.0f, 1.899f, -0.644f, 1.899f, -1.913f)
                curveToRelative(0.0f, -1.269f, -0.64f, -1.913f, -1.9f, -1.913f)
                close()
                moveTo(15.542f, 5.736f)
                horizontalLineToRelative(-1.091f)
                verticalLineToRelative(4.428f)
                horizontalLineToRelative(0.465f)
                curveToRelative(0.016f, -0.001f, 0.072f, -0.003f, 0.16f, -0.004f)
                horizontalLineToRelative(0.158f)
                curveToRelative(0.906f, 0.012f, 3.516f, 0.204f, 5.276f, 1.892f)
                verticalLineToRelative(-0.146f)
                curveToRelative(0.0f, -5.87f, -4.47f, -6.157f, -4.968f, -6.17f)
                close()
                moveTo(13.249f, 5.736f)
                lineTo(8.86f, 5.736f)
                verticalLineToRelative(4.428f)
                horizontalLineToRelative(4.39f)
                lineTo(13.25f, 5.735f)
                close()
                moveTo(7.659f, 5.736f)
                lineTo(4.321f, 5.736f)
                curveToRelative(-0.258f, 0.0f, -0.532f, 0.125f, -0.748f, 0.344f)
                curveToRelative(-0.213f, 0.216f, -0.342f, 0.496f, -0.342f, 0.753f)
                verticalLineToRelative(3.33f)
                horizontalLineToRelative(4.426f)
                lineTo(7.657f, 5.736f)
                close()
            }
        }
        .build()
        return _busFilled!!
    }

private var _busFilled: ImageVector? = null
