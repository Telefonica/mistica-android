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

public val LightGroup.ArrowUpRightLight: ImageVector
    get() {
        if (_arrowUpRightLight != null) {
            return _arrowUpRightLight!!
        }
        _arrowUpRightLight = Builder(name = "ArrowUpRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.18f, 21.272f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.727f, 0.728f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.728f, -0.728f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 1.456f, 0.0f)
                moveToRelative(0.728f, -1.092f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.256f, -0.108f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.0f, -0.516f)
                lineToRelative(7.167f, -7.168f)
                lineToRelative(3.592f, 3.592f)
                curveToRelative(0.38f, 0.38f, 0.864f, 0.372f, 1.188f, 0.236f)
                curveToRelative(0.324f, -0.136f, 0.676f, -0.472f, 0.676f, -1.008f)
                verticalLineTo(2.728f)
                horizontalLineTo(8.785f)
                curveToRelative(-0.536f, 0.0f, -0.872f, 0.348f, -1.008f, 0.676f)
                curveToRelative(-0.136f, 0.324f, -0.144f, 0.808f, 0.236f, 1.188f)
                lineToRelative(3.592f, 3.592f)
                lineToRelative(-8.984f, 8.984f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, -0.516f, 0.0f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.0f, -0.516f)
                lineToRelative(8.472f, -8.472f)
                lineTo(7.5f, 5.104f)
                arcToRelative(1.788f, 1.788f, 0.0f, false, true, -0.392f, -1.98f)
                arcTo(1.795f, 1.795f, 0.0f, false, true, 8.789f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(13.216f)
                curveToRelative(0.0f, 0.748f, -0.432f, 1.392f, -1.124f, 1.68f)
                arcToRelative(1.788f, 1.788f, 0.0f, false, true, -1.98f, -0.392f)
                lineToRelative(-3.076f, -3.076f)
                lineToRelative(-6.651f, 6.648f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.26f, 0.104f)
                close()
            }
        }
        .build()
        return _arrowUpRightLight!!
    }

private var _arrowUpRightLight: ImageVector? = null
