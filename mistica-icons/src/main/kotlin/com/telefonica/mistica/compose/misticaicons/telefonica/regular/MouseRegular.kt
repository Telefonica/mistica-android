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

public val RegularGroup.MouseRegular: ImageVector
    get() {
        if (_mouseRegular != null) {
            return _mouseRegular!!
        }
        _mouseRegular = Builder(name = "MouseRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.489f, 2.16f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.549f, 0.549f)
                curveToRelative(0.0f, 0.888f, 1.064f, 1.204f, 2.062f, 1.204f)
                horizontalLineToRelative(1.918f)
                curveToRelative(0.869f, 0.0f, 1.544f, 0.39f, 1.9f, 1.096f)
                curveToRelative(0.254f, 0.501f, 0.26f, 0.989f, 0.26f, 1.045f)
                lineToRelative(0.001f, 0.367f)
                curveToRelative(1.504f, 0.09f, 2.693f, 0.546f, 3.542f, 1.352f)
                curveToRelative(0.998f, 0.947f, 1.502f, 2.356f, 1.502f, 4.185f)
                verticalLineToRelative(4.311f)
                curveToRelative(0.0f, 1.897f, -0.44f, 3.264f, -1.347f, 4.174f)
                curveToRelative(-0.922f, 0.933f, -2.32f, 1.386f, -4.275f, 1.386f)
                curveToRelative(-1.779f, 0.0f, -3.165f, -0.462f, -4.12f, -1.37f)
                curveToRelative(-0.998f, -0.946f, -1.502f, -2.355f, -1.502f, -4.184f)
                lineTo(6.979f, 11.96f)
                curveToRelative(0.0f, -1.829f, 0.504f, -3.238f, 1.502f, -4.185f)
                curveToRelative(0.862f, -0.82f, 2.072f, -1.276f, 3.6f, -1.359f)
                lineToRelative(0.002f, -0.36f)
                curveToRelative(0.0f, -0.02f, -0.011f, -0.309f, -0.157f, -0.578f)
                curveToRelative(-0.174f, -0.322f, -0.462f, -0.47f, -0.91f, -0.47f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-0.895f, 0.0f, -1.663f, -0.2f, -2.218f, -0.574f)
                curveToRelative(-0.605f, -0.412f, -0.938f, -1.026f, -0.938f, -1.726f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.549f, -0.549f)
                close()
                moveTo(17.127f, 13.599f)
                lineTo(17.75f, 13.521f)
                curveToRelative(-1.681f, 0.23f, -3.398f, 0.348f, -5.096f, 0.348f)
                horizontalLineToRelative(-0.106f)
                curveToRelative(-1.489f, 0.0f, -2.99f, -0.09f, -4.473f, -0.268f)
                verticalLineToRelative(2.674f)
                curveToRelative(0.0f, 3.0f, 1.481f, 4.46f, 4.526f, 4.46f)
                curveToRelative(1.647f, 0.0f, 2.793f, -0.348f, 3.499f, -1.06f)
                curveToRelative(0.692f, -0.697f, 1.028f, -1.81f, 1.028f, -3.403f)
                lineToRelative(-0.001f, -2.673f)
                close()
                moveTo(12.601f, 7.502f)
                curveToRelative(-3.048f, 0.0f, -4.527f, 1.46f, -4.527f, 4.462f)
                verticalLineToRelative(0.532f)
                lineToRelative(0.346f, 0.044f)
                curveToRelative(1.37f, 0.156f, 2.756f, 0.233f, 4.13f, 0.233f)
                horizontalLineToRelative(0.101f)
                curveToRelative(1.494f, 0.0f, 2.996f, -0.091f, 4.477f, -0.274f)
                verticalLineToRelative(-0.538f)
                curveToRelative(0.002f, -3.003f, -1.48f, -4.46f, -4.527f, -4.46f)
                close()
                moveTo(12.601f, 8.302f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.55f, 0.55f)
                verticalLineToRelative(2.877f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -1.099f, 0.0f)
                lineTo(12.052f, 8.852f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.55f, -0.55f)
                close()
            }
        }
        .build()
        return _mouseRegular!!
    }

private var _mouseRegular: ImageVector? = null
