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

public val LightGroup.ChevronRightLight: ImageVector
    get() {
        if (_chevronRightLight != null) {
            return _chevronRightLight!!
        }
        _chevronRightLight = Builder(name = "ChevronRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.613f, 20.0f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, true, -0.442f, -0.198f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, true, 0.0f, -0.875f)
                lineToRelative(7.356f, -6.99f)
                lineToRelative(-7.318f, -6.865f)
                arcTo(0.635f, 0.635f, 0.0f, false, true, 9.17f, 4.2f)
                arcToRelative(0.585f, 0.585f, 0.0f, false, true, 0.846f, -0.037f)
                lineToRelative(7.794f, 7.312f)
                arcToRelative(0.645f, 0.645f, 0.0f, false, true, 0.025f, 0.886f)
                lineToRelative(-0.025f, 0.025f)
                lineToRelative(-7.794f, 7.46f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.404f, 0.154f)
                close()
            }
        }
        .build()
        return _chevronRightLight!!
    }

private var _chevronRightLight: ImageVector? = null
