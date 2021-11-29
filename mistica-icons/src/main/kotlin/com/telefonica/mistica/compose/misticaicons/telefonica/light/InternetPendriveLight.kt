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

public val LightGroup.InternetPendriveLight: ImageVector
    get() {
        if (_internetPendriveLight != null) {
            return _internetPendriveLight!!
        }
        _internetPendriveLight = Builder(name = "InternetPendriveLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.705f, 14.462f)
                curveToRelative(0.41f, 0.0f, 0.673f, 0.219f, 0.673f, 0.69f)
                curveToRelative(0.0f, 0.226f, -0.062f, 0.394f, -0.171f, 0.51f)
                curveToRelative(-0.118f, 0.122f, -0.292f, 0.181f, -0.505f, 0.181f)
                curveToRelative(-0.212f, 0.0f, -0.386f, -0.059f, -0.504f, -0.182f)
                curveToRelative(-0.109f, -0.115f, -0.17f, -0.283f, -0.17f, -0.51f)
                curveToRelative(0.002f, -0.47f, 0.268f, -0.689f, 0.677f, -0.689f)
                close()
                moveTo(12.313f, 5.423f)
                curveToRelative(0.0f, 0.232f, -0.182f, 0.42f, -0.409f, 0.42f)
                curveToRelative(-6.011f, 0.0f, -8.93f, 3.011f, -8.93f, 9.205f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, -0.409f, 0.423f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.409f, -0.423f)
                curveTo(2.156f, 8.38f, 5.436f, 5.0f, 11.904f, 5.0f)
                curveToRelative(0.227f, 0.003f, 0.41f, 0.19f, 0.41f, 0.423f)
                close()
                moveTo(12.296f, 8.843f)
                curveToRelative(0.0f, 0.233f, -0.182f, 0.42f, -0.409f, 0.42f)
                curveToRelative(-3.804f, 0.0f, -5.652f, 1.908f, -5.652f, 5.827f)
                curveToRelative(0.0f, 0.232f, -0.182f, 0.42f, -0.41f, 0.42f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.408f, -0.42f)
                curveToRelative(0.0f, -4.365f, 2.238f, -6.67f, 6.47f, -6.67f)
                curveToRelative(0.224f, 0.0f, 0.41f, 0.188f, 0.41f, 0.423f)
                close()
                moveTo(21.025f, 16.613f)
                verticalLineToRelative(-3.028f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, false, -0.323f, -0.36f)
                horizontalLineToRelative(-0.98f)
                verticalLineToRelative(3.755f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.189f, -0.002f, 0.343f, -0.168f, 0.343f, -0.367f)
                close()
                moveTo(18.366f, 18.103f)
                curveToRelative(0.3f, 0.0f, 0.547f, -0.257f, 0.547f, -0.57f)
                verticalLineToRelative(-0.135f)
                horizontalLineToRelative(-0.009f)
                verticalLineToRelative(-4.703f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.546f, -0.572f)
                horizontalLineToRelative(-5.941f)
                curveToRelative(-1.785f, 0.06f, -2.695f, 1.065f, -2.695f, 2.986f)
                curveToRelative(0.0f, 1.922f, 0.91f, 2.927f, 2.709f, 2.995f)
                horizontalLineToRelative(5.935f)
                close()
                moveTo(20.672f, 12.375f)
                curveToRelative(0.633f, 0.0f, 1.157f, 0.538f, 1.17f, 1.2f)
                verticalLineToRelative(3.038f)
                curveToRelative(0.0f, 0.664f, -0.52f, 1.208f, -1.162f, 1.208f)
                horizontalLineToRelative(-0.98f)
                curveToRelative(-0.13f, 0.641f, -0.678f, 1.126f, -1.336f, 1.126f)
                horizontalLineToRelative(-5.967f)
                curveToRelative(-2.255f, -0.084f, -3.498f, -1.448f, -3.498f, -3.838f)
                curveToRelative(0.0f, -2.395f, 1.243f, -3.756f, 3.498f, -3.829f)
                horizontalLineToRelative(5.955f)
                curveToRelative(0.647f, 0.0f, 1.19f, 0.47f, 1.33f, 1.098f)
                horizontalLineToRelative(0.323f)
                verticalLineToRelative(-0.003f)
                horizontalLineToRelative(0.667f)
                close()
            }
        }
        .build()
        return _internetPendriveLight!!
    }

private var _internetPendriveLight: ImageVector? = null
