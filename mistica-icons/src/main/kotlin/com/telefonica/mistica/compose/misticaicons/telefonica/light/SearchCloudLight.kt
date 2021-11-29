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

public val LightGroup.SearchCloudLight: ImageVector
    get() {
        if (_searchCloudLight != null) {
            return _searchCloudLight!!
        }
        _searchCloudLight = Builder(name = "SearchCloudLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.51f)
                curveToRelative(-2.048f, 0.0f, -3.712f, -1.681f, -3.712f, -3.746f)
                curveToRelative(0.0f, -2.064f, 1.664f, -3.745f, 3.711f, -3.745f)
                curveToRelative(2.048f, 0.0f, 3.715f, 1.68f, 3.715f, 3.745f)
                curveToRelative(0.0f, 2.065f, -1.667f, 3.745f, -3.715f, 3.745f)
                close()
                moveTo(5.946f, 15.464f)
                curveToRelative(-1.353f, -0.14f, -2.969f, -0.843f, -2.969f, -3.397f)
                curveToRelative(0.0f, -1.734f, 0.745f, -2.827f, 2.21f, -3.247f)
                curveToRelative(0.177f, -0.05f, 0.3f, -0.213f, 0.297f, -0.398f)
                lineToRelative(-0.006f, -0.114f)
                curveToRelative(0.0f, -4.944f, 4.275f, -5.328f, 5.583f, -5.328f)
                curveToRelative(0.742f, 0.0f, 4.485f, 0.17f, 5.378f, 3.526f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, 0.387f, 0.309f)
                curveToRelative(1.263f, 0.036f, 4.201f, 0.523f, 4.201f, 4.294f)
                curveToRelative(0.0f, 4.005f, -3.33f, 4.316f, -4.353f, 4.316f)
                horizontalLineToRelative(-0.193f)
                arcToRelative(4.36f, 4.36f, 0.0f, false, false, 0.053f, -0.664f)
                curveToRelative(0.0f, -2.526f, -2.028f, -4.574f, -4.532f, -4.574f)
                reflectiveCurveTo(7.47f, 12.235f, 7.47f, 14.758f)
                curveToRelative(0.0f, 0.236f, 0.022f, 0.468f, 0.056f, 0.695f)
                lineToRelative(-1.58f, 0.011f)
                close()
                moveTo(16.672f, 16.257f)
                curveToRelative(0.862f, 0.0f, 5.17f, -0.246f, 5.17f, -5.146f)
                curveToRelative(0.0f, -4.28f, -3.282f, -4.997f, -4.7f, -5.103f)
                curveToRelative(-1.17f, -3.664f, -5.257f, -3.852f, -6.081f, -3.852f)
                curveToRelative(-1.059f, 0.0f, -6.289f, 0.292f, -6.403f, 5.97f)
                curveToRelative(-1.048f, 0.383f, -2.502f, 1.38f, -2.502f, 3.94f)
                curveToRelative(0.0f, 3.466f, 2.591f, 4.104f, 3.748f, 4.222f)
                lineToRelative(1.824f, -0.003f)
                curveToRelative(0.622f, 1.779f, 2.297f, 3.053f, 4.271f, 3.053f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, 2.886f, -1.047f)
                lineToRelative(3.4f, 3.431f)
                curveToRelative(0.16f, 0.16f, 0.417f, 0.163f, 0.577f, 0.003f)
                lineToRelative(0.003f, -0.003f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, false, 0.0f, -0.585f)
                lineToRelative(-3.398f, -3.429f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, 0.815f, -1.45f)
                horizontalLineToRelative(0.39f)
                close()
            }
        }
        .build()
        return _searchCloudLight!!
    }

private var _searchCloudLight: ImageVector? = null
