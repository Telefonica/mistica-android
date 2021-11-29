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

public val LightGroup.FirewallLight: ImageVector
    get() {
        if (_firewallLight != null) {
            return _firewallLight!!
        }
        _firewallLight = Builder(name = "FirewallLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.636f, 20.742f)
                lineTo(17.15f, 20.742f)
                verticalLineToRelative(-5.378f)
                lineToRelative(3.863f, 0.02f)
                verticalLineToRelative(4.78f)
                curveToRelative(0.003f, 0.317f, -0.227f, 0.578f, -0.378f, 0.578f)
                close()
                moveTo(10.919f, 20.487f)
                arcToRelative(3.863f, 3.863f, 0.0f, false, false, 1.266f, -2.717f)
                curveToRelative(0.033f, -0.883f, -0.252f, -1.726f, -0.776f, -2.434f)
                lineToRelative(4.916f, 0.022f)
                verticalLineToRelative(5.38f)
                lineTo(10.61f, 20.738f)
                curveToRelative(0.1f, -0.078f, 0.204f, -0.156f, 0.308f, -0.251f)
                close()
                moveTo(7.188f, 20.997f)
                arcToRelative(1.849f, 1.849f, 0.0f, false, true, -0.493f, -0.045f)
                curveToRelative(-0.003f, 0.0f, -0.4f, -0.07f, -0.757f, -0.423f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, true, -0.058f, -1.787f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.096f, -0.112f, 0.205f, -0.21f, 0.32f, -0.3f)
                curveToRelative(0.624f, -0.47f, 0.983f, -1.219f, 0.955f, -2.003f)
                curveToRelative(0.213f, 0.118f, 0.423f, 0.263f, 0.616f, 0.432f)
                curveToRelative(0.787f, 0.691f, 1.487f, 2.417f, 0.742f, 3.437f)
                curveToRelative(-0.3f, 0.408f, -0.767f, 0.655f, -1.277f, 0.689f)
                curveToRelative(-0.02f, -0.003f, -0.034f, 0.0f, -0.05f, 0.0f)
                close()
                moveTo(3.798f, 19.35f)
                curveToRelative(-1.846f, -2.356f, -0.204f, -6.174f, 1.737f, -7.768f)
                arcToRelative(8.044f, 8.044f, 0.0f, false, true, 2.342f, -1.339f)
                curveToRelative(-0.21f, 1.084f, -0.23f, 3.081f, 1.854f, 4.605f)
                curveToRelative(0.289f, 0.205f, 0.552f, 0.434f, 0.784f, 0.686f)
                curveToRelative(0.563f, 0.594f, 0.866f, 1.387f, 0.838f, 2.205f)
                arcToRelative(3.033f, 3.033f, 0.0f, false, true, -0.994f, 2.132f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, -1.06f, 0.708f)
                curveToRelative(0.824f, -1.428f, 0.032f, -3.442f, -0.982f, -4.336f)
                curveToRelative(-0.477f, -0.417f, -1.048f, -0.728f, -1.603f, -0.868f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.504f, 0.308f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, false, 0.02f, 0.255f)
                curveToRelative(0.002f, 0.011f, 0.431f, 1.09f, -0.535f, 1.846f)
                curveToRelative(-0.16f, 0.123f, -0.306f, 0.26f, -0.437f, 0.409f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -0.412f, 2.09f)
                curveToRelative(-0.4f, -0.25f, -0.754f, -0.567f, -1.048f, -0.933f)
                close()
                moveTo(5.314f, 2.99f)
                horizontalLineToRelative(3.232f)
                verticalLineToRelative(5.33f)
                lineToRelative(-3.61f, -0.008f)
                lineTo(4.936f, 3.568f)
                curveToRelative(0.0f, -0.317f, 0.252f, -0.577f, 0.378f, -0.577f)
                close()
                moveTo(21.014f, 3.567f)
                verticalLineToRelative(4.784f)
                lineToRelative(-3.863f, -0.008f)
                verticalLineToRelative(-5.35f)
                horizontalLineToRelative(3.482f)
                curveToRelative(0.129f, -0.003f, 0.381f, 0.26f, 0.381f, 0.574f)
                close()
                moveTo(9.375f, 8.324f)
                lineTo(9.375f, 2.991f)
                lineToRelative(6.947f, 0.003f)
                lineTo(16.322f, 8.34f)
                lineToRelative(-6.947f, -0.017f)
                close()
                moveTo(10.779f, 14.498f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.12f, 0.022f)
                arcToRelative(5.969f, 5.969f, 0.0f, false, false, -0.446f, -0.35f)
                curveToRelative(-2.44f, -1.781f, -1.4f, -4.266f, -1.356f, -4.37f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.062f, -0.434f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.414f, -0.14f)
                curveToRelative(-1.165f, 0.278f, -2.361f, 0.885f, -3.373f, 1.712f)
                lineToRelative(-0.075f, 0.07f)
                lineTo(4.933f, 9.15f)
                lineToRelative(7.456f, 0.016f)
                verticalLineToRelative(5.34f)
                lineToRelative(-1.61f, -0.009f)
                close()
                moveTo(13.221f, 14.509f)
                lineTo(13.221f, 9.167f)
                lineToRelative(7.793f, 0.02f)
                verticalLineToRelative(5.361f)
                lineToRelative(-7.793f, -0.039f)
                close()
                moveTo(20.636f, 2.159f)
                lineTo(5.316f, 2.156f)
                curveToRelative(-0.633f, 0.0f, -1.21f, 0.673f, -1.21f, 1.412f)
                verticalLineToRelative(8.277f)
                curveToRelative(-1.77f, 2.11f, -2.843f, 5.62f, -0.958f, 8.02f)
                curveToRelative(0.916f, 1.168f, 2.362f, 1.865f, 3.855f, 1.958f)
                curveToRelative(0.039f, 0.003f, 0.078f, 0.014f, 0.117f, 0.014f)
                curveToRelative(0.014f, 0.0f, 0.028f, -0.003f, 0.045f, -0.003f)
                curveToRelative(0.056f, 0.0f, 0.11f, 0.009f, 0.166f, 0.009f)
                curveToRelative(0.389f, 0.0f, 0.778f, -0.042f, 1.162f, -0.132f)
                curveToRelative(0.238f, -0.042f, 0.47f, -0.107f, 0.695f, -0.188f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.185f, 0.05f)
                horizontalLineToRelative(11.26f)
                curveToRelative(0.644f, 0.0f, 1.207f, -0.658f, 1.207f, -1.411f)
                lineTo(21.84f, 3.568f)
                curveToRelative(0.003f, -0.74f, -0.574f, -1.409f, -1.204f, -1.409f)
                close()
            }
        }
        .build()
        return _firewallLight!!
    }

private var _firewallLight: ImageVector? = null
