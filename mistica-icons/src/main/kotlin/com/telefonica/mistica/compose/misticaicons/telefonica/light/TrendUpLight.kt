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

public val LightGroup.TrendUpLight: ImageVector
    get() {
        if (_trendUpLight != null) {
            return _trendUpLight!!
        }
        _trendUpLight = Builder(name = "TrendUpLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.842f, 5.412f)
                verticalLineToRelative(3.675f)
                curveToRelative(0.0f, 0.23f, -0.193f, 0.412f, -0.423f, 0.412f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.423f, -0.407f)
                verticalLineTo(6.585f)
                lineToRelative(-5.972f, 8.28f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.515f, 0.14f)
                lineToRelative(-7.53f, -3.226f)
                lineToRelative(-4.028f, 6.958f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, -0.582f, 0.157f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.16f, -0.563f)
                lineToRelative(4.218f, -7.28f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, true, 0.544f, -0.174f)
                lineToRelative(7.554f, 3.238f)
                lineToRelative(5.98f, -8.289f)
                horizontalLineToRelative(-2.817f)
                arcToRelative(0.425f, 0.425f, 0.0f, false, true, -0.423f, -0.414f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, true, 0.423f, -0.412f)
                horizontalLineToRelative(3.731f)
                curveToRelative(0.23f, 0.0f, 0.423f, 0.18f, 0.423f, 0.412f)
            }
        }
        .build()
        return _trendUpLight!!
    }

private var _trendUpLight: ImageVector? = null
