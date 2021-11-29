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

public val LightGroup.ArrowRightLight: ImageVector
    get() {
        if (_arrowRightLight != null) {
            return _arrowRightLight!!
        }
        _arrowRightLight = Builder(name = "ArrowRightLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.806f, 2.527f)
                lineTo(22.0f, 11.992f)
                lineToRelative(-9.194f, 9.473f)
                curveToRelative(-0.34f, 0.35f, -0.776f, 0.535f, -1.232f, 0.535f)
                arcToRelative(1.896f, 1.896f, 0.0f, false, true, -1.88f, -1.89f)
                verticalLineToRelative(-4.425f)
                horizontalLineTo(4.68f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.355f, -0.367f)
                curveToRelative(0.0f, -0.201f, 0.164f, -0.366f, 0.355f, -0.366f)
                horizontalLineToRelative(5.727f)
                verticalLineToRelative(5.154f)
                curveToRelative(0.0f, 0.56f, 0.372f, 0.918f, 0.712f, 1.058f)
                curveToRelative(0.332f, 0.14f, 0.812f, 0.157f, 1.176f, -0.218f)
                lineTo(20.988f, 12.0f)
                lineToRelative(-8.694f, -8.946f)
                curveToRelative(-0.364f, -0.374f, -0.852f, -0.358f, -1.176f, -0.218f)
                curveToRelative(-0.348f, 0.148f, -0.712f, 0.502f, -0.712f, 1.058f)
                verticalLineToRelative(5.154f)
                horizontalLineToRelative(-8.05f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, true, 0.0f, -0.733f)
                horizontalLineToRelative(7.33f)
                verticalLineToRelative(-4.42f)
                curveToRelative(0.0f, -0.758f, 0.452f, -1.442f, 1.16f, -1.742f)
                arcToRelative(1.733f, 1.733f, 0.0f, false, true, 1.96f, 0.374f)
                close()
                moveTo(2.712f, 14.577f)
                curveToRelative(0.393f, 0.0f, 0.712f, 0.328f, 0.712f, 0.733f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, true, -0.712f, 0.733f)
                arcTo(0.723f, 0.723f, 0.0f, false, true, 2.0f, 15.31f)
                curveToRelative(0.0f, -0.405f, 0.319f, -0.733f, 0.712f, -0.733f)
                close()
            }
        }
        .build()
        return _arrowRightLight!!
    }

private var _arrowRightLight: ImageVector? = null
