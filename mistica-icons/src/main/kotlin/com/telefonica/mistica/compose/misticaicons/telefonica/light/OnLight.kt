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

public val LightGroup.OnLight: ImageVector
    get() {
        if (_onLight != null) {
            return _onLight!!
        }
        _onLight = Builder(name = "OnLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.411f, 2.16f)
                curveToRelative(1.577f, 0.05f, 9.434f, 0.63f, 9.434f, 9.843f)
                reflectiveCurveToRelative(-7.826f, 9.843f, -9.4f, 9.843f)
                horizontalLineToRelative(-0.877f)
                curveToRelative(-8.958f, -0.115f, -9.41f, -8.201f, -9.41f, -9.843f)
                curveToRelative(0.0f, -1.641f, 0.452f, -9.762f, 9.343f, -9.843f)
                close()
                moveTo(12.394f, 2.98f)
                horizontalLineToRelative(-0.885f)
                curveToRelative(-1.97f, 0.0f, -8.532f, 0.754f, -8.532f, 9.023f)
                reflectiveCurveToRelative(6.563f, 9.023f, 8.613f, 9.023f)
                horizontalLineToRelative(0.846f)
                curveToRelative(2.028f, 0.0f, 8.588f, -0.821f, 8.588f, -9.023f)
                reflectiveCurveToRelative(-6.563f, -8.966f, -8.63f, -9.022f)
                close()
                moveTo(8.96f, 8.206f)
                curveToRelative(1.238f, 0.0f, 2.748f, 0.664f, 2.748f, 3.798f)
                curveToRelative(0.0f, 3.135f, -1.476f, 3.798f, -2.714f, 3.798f)
                curveToRelative(-1.813f, 0.0f, -2.732f, -1.28f, -2.732f, -3.798f)
                curveToRelative(0.0f, -3.134f, 1.451f, -3.798f, 2.698f, -3.798f)
                close()
                moveTo(13.142f, 8.337f)
                curveToRelative(0.1f, 0.0f, 0.196f, 0.048f, 0.255f, 0.132f)
                lineToRelative(3.524f, 5.289f)
                lineTo(16.921f, 8.639f)
                curveToRelative(0.0f, -0.157f, 0.123f, -0.289f, 0.28f, -0.303f)
                horizontalLineToRelative(0.3f)
                curveToRelative(0.162f, 0.003f, 0.29f, 0.14f, 0.285f, 0.303f)
                verticalLineToRelative(6.737f)
                arcToRelative(0.301f, 0.301f, 0.0f, false, true, -0.302f, 0.302f)
                horizontalLineToRelative(-0.23f)
                arcToRelative(0.303f, 0.303f, 0.0f, false, true, -0.255f, -0.14f)
                lineToRelative(-3.487f, -5.283f)
                verticalLineToRelative(5.11f)
                curveToRelative(0.0f, 0.17f, -0.14f, 0.31f, -0.311f, 0.31f)
                horizontalLineToRelative(-0.28f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, -0.303f, -0.31f)
                lineTo(12.618f, 8.638f)
                curveToRelative(0.0f, -0.165f, 0.135f, -0.303f, 0.303f, -0.303f)
                close()
                moveTo(8.96f, 9.117f)
                curveToRelative(-0.835f, 0.0f, -1.796f, 0.352f, -1.796f, 2.904f)
                reflectiveCurveTo(8.14f, 14.9f, 8.96f, 14.9f)
                curveToRelative(0.826f, 0.0f, 1.787f, -0.303f, 1.787f, -2.88f)
                reflectiveCurveToRelative(-0.95f, -2.905f, -1.787f, -2.905f)
                close()
            }
        }
        .build()
        return _onLight!!
    }

private var _onLight: ImageVector? = null
