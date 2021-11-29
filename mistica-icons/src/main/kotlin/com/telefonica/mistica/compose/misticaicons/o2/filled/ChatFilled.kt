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

public val FilledGroup.ChatFilled: ImageVector
    get() {
        if (_chatFilled != null) {
            return _chatFilled!!
        }
        _chatFilled = Builder(name = "ChatFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.557f, 7.123f)
                verticalLineToRelative(3.749f)
                curveToRelative(0.0f, 2.482f, 1.996f, 4.502f, 4.448f, 4.502f)
                horizontalLineToRelative(3.328f)
                curveToRelative(0.0f, 1.733f, -1.299f, 2.813f, -2.963f, 3.0f)
                horizontalLineTo(8.112f)
                lineTo(5.594f, 20.89f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, -0.403f, 0.081f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, true, -0.228f, -0.345f)
                verticalLineToRelative(-2.252f)
                curveTo(3.3f, 18.187f, 2.0f, 16.733f, 2.0f, 15.0f)
                verticalLineToRelative(-4.502f)
                curveToRelative(0.0f, -1.863f, 1.494f, -3.375f, 3.333f, -3.375f)
                horizontalLineToRelative(2.224f)
                close()
                moveTo(18.667f, 3.0f)
                curveTo(20.507f, 3.0f, 22.0f, 4.512f, 22.0f, 6.374f)
                verticalLineToRelative(4.503f)
                curveToRelative(0.0f, 1.733f, -1.3f, 3.187f, -2.963f, 3.374f)
                verticalLineToRelative(2.251f)
                curveToRelative(0.0f, 0.15f, -0.09f, 0.288f, -0.228f, 0.346f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, -0.403f, -0.082f)
                lineToRelative(-2.518f, -2.515f)
                horizontalLineTo(12.0f)
                curveToRelative(-1.84f, 0.0f, -3.333f, -1.512f, -3.333f, -3.374f)
                verticalLineTo(6.374f)
                curveTo(8.667f, 4.512f, 10.16f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chatFilled!!
    }

private var _chatFilled: ImageVector? = null
