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

public val LightGroup.ArrowUpLeftLight: ImageVector
    get() {
        if (_arrowUpLeftLight != null) {
            return _arrowUpLeftLight!!
        }
        _arrowUpLeftLight = Builder(name = "ArrowUpLeftLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.272f, 15.82f)
                curveToRelative(0.4f, 0.0f, 0.728f, 0.327f, 0.728f, 0.727f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.728f, 0.728f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 0.0f, -1.456f)
                moveToRelative(-1.092f, -0.728f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.108f, 0.256f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.516f, 0.0f)
                lineTo(12.388f, 8.18f)
                lineToRelative(3.592f, -3.592f)
                curveToRelative(0.38f, -0.38f, 0.372f, -0.864f, 0.236f, -1.188f)
                arcToRelative(1.083f, 1.083f, 0.0f, false, false, -1.008f, -0.676f)
                horizontalLineTo(2.728f)
                verticalLineToRelative(12.491f)
                curveToRelative(0.0f, 0.536f, 0.348f, 0.872f, 0.676f, 1.008f)
                curveToRelative(0.324f, 0.136f, 0.808f, 0.144f, 1.188f, -0.236f)
                lineToRelative(3.592f, -3.592f)
                lineToRelative(8.984f, 8.984f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.0f, 0.516f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.516f, 0.0f)
                lineTo(8.18f, 13.423f)
                lineTo(5.104f, 16.5f)
                arcToRelative(1.788f, 1.788f, 0.0f, false, true, -1.98f, 0.392f)
                arcTo(1.795f, 1.795f, 0.0f, false, true, 2.0f, 15.211f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(13.216f)
                curveToRelative(0.748f, 0.0f, 1.392f, 0.432f, 1.68f, 1.124f)
                arcToRelative(1.788f, 1.788f, 0.0f, false, true, -0.392f, 1.98f)
                lineTo(13.428f, 8.18f)
                lineToRelative(6.648f, 6.651f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.104f, 0.26f)
                close()
            }
        }
        .build()
        return _arrowUpLeftLight!!
    }

private var _arrowUpLeftLight: ImageVector? = null
