package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.TabletLight: ImageVector
    get() {
        if (_tabletLight != null) {
            return _tabletLight!!
        }
        _tabletLight = Builder(name = "TabletLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.87f, 19.139f)
                curveToRelative(0.0f, -0.393f, 0.312f, -0.713f, 0.695f, -0.713f)
                curveToRelative(0.383f, 0.0f, 0.694f, 0.32f, 0.694f, 0.713f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.694f, 0.713f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.695f, -0.713f)
                close()
                moveTo(20.0f, 3.787f)
                verticalLineToRelative(16.426f)
                curveToRelative(0.0f, 0.983f, -0.78f, 1.787f, -1.74f, 1.787f)
                lineTo(5.74f, 22.0f)
                curveTo(4.785f, 22.0f, 4.0f, 21.2f, 4.0f, 20.213f)
                lineTo(4.0f, 3.787f)
                curveTo(4.0f, 2.804f, 4.78f, 2.0f, 5.74f, 2.0f)
                horizontalLineToRelative(12.52f)
                curveToRelative(0.96f, 0.0f, 1.74f, 0.804f, 1.74f, 1.787f)
                close()
                moveTo(4.694f, 4.5f)
                horizontalLineToRelative(14.607f)
                verticalLineToRelative(-0.713f)
                curveToRelative(0.0f, -0.59f, -0.467f, -1.07f, -1.042f, -1.07f)
                lineTo(5.741f, 2.717f)
                curveToRelative(-0.575f, 0.0f, -1.042f, 0.48f, -1.042f, 1.07f)
                lineTo(4.699f, 4.5f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(19.306f, 5.218f)
                lineTo(4.694f, 5.218f)
                verticalLineToRelative(13.569f)
                horizontalLineToRelative(10.783f)
                curveToRelative(0.191f, 0.0f, 0.347f, 0.16f, 0.347f, 0.357f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.347f, 0.356f)
                lineTo(4.694f, 19.5f)
                verticalLineToRelative(0.713f)
                curveToRelative(0.0f, 0.59f, 0.468f, 1.07f, 1.042f, 1.07f)
                horizontalLineToRelative(12.519f)
                curveToRelative(0.574f, 0.0f, 1.042f, -0.48f, 1.042f, -1.07f)
                lineTo(19.297f, 5.218f)
                horizontalLineToRelative(0.009f)
                close()
            }
        }
        .build()
        return _tabletLight!!
    }

private var _tabletLight: ImageVector? = null
