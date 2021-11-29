package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.TeamFilled: ImageVector
    get() {
        if (_teamFilled != null) {
            return _teamFilled!!
        }
        _teamFilled = Builder(name = "TeamFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.298f, 5.0f)
                arcToRelative(2.597f, 2.597f, 0.0f, false, true, 2.593f, 2.6f)
                curveToRelative(0.0f, 0.846f, -0.413f, 1.597f, -1.038f, 2.072f)
                curveToRelative(1.303f, 0.39f, 2.147f, 1.274f, 2.147f, 2.387f)
                lineTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.556f)
                verticalLineToRelative(-4.459f)
                curveToRelative(0.0f, -1.05f, -0.569f, -1.972f, -1.536f, -2.58f)
                curveToRelative(0.356f, -0.585f, 1.0f, -1.037f, 1.835f, -1.289f)
                arcTo(2.597f, 2.597f, 0.0f, false, true, 18.298f, 5.0f)
                close()
                moveTo(5.702f, 5.0f)
                arcToRelative(2.597f, 2.597f, 0.0f, false, true, 2.593f, 2.6f)
                curveToRelative(0.0f, 0.846f, -0.412f, 1.597f, -1.038f, 2.072f)
                curveToRelative(0.834f, 0.252f, 1.48f, 0.704f, 1.835f, 1.289f)
                curveToRelative(-0.967f, 0.608f, -1.536f, 1.53f, -1.536f, 2.58f)
                verticalLineToRelative(4.454f)
                lineTo(2.0f, 17.995f)
                verticalLineToRelative(-5.941f)
                curveToRelative(0.0f, -1.108f, 0.844f, -1.992f, 2.147f, -2.382f)
                arcTo(2.597f, 2.597f, 0.0f, false, true, 5.702f, 5.0f)
                close()
                moveTo(12.002f, 6.483f)
                arcToRelative(2.597f, 2.597f, 0.0f, false, true, 1.555f, 4.672f)
                curveToRelative(1.304f, 0.39f, 2.148f, 1.274f, 2.148f, 2.382f)
                verticalLineToRelative(4.458f)
                lineTo(8.3f, 17.995f)
                verticalLineToRelative(-4.458f)
                curveToRelative(0.0f, -1.108f, 0.844f, -1.992f, 2.147f, -2.382f)
                arcTo(2.604f, 2.604f, 0.0f, false, true, 9.41f, 9.083f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 2.593f, -2.6f)
                close()
            }
        }
        .build()
        return _teamFilled!!
    }

private var _teamFilled: ImageVector? = null
