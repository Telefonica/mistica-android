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

public val LightGroup.ArrowLineUpRightLight: ImageVector
    get() {
        if (_arrowLineUpRightLight != null) {
            return _arrowLineUpRightLight!!
        }
        _arrowLineUpRightLight = Builder(name = "ArrowLineUpRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.852f, 7.685f)
                lineToRelative(0.039f, 9.356f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.732f, 0.44f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, 0.201f, -0.47f)
                lineTo(17.76f, 6.566f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, -0.013f, -0.081f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.053f, -0.053f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, -0.253f, -0.253f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.053f, -0.053f)
                arcToRelative(0.263f, 0.263f, 0.0f, false, false, -0.087f, -0.02f)
                lineTo(7.05f, 6.089f)
                arcToRelative(0.454f, 0.454f, 0.0f, false, false, -0.355f, 0.142f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.326f, 0.792f)
                horizontalLineToRelative(9.169f)
                lineToRelative(-9.907f, 9.907f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.002f, 0.665f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, false, 0.665f, -0.002f)
                lineToRelative(9.907f, -9.907f)
                close()
            }
        }
        .build()
        return _arrowLineUpRightLight!!
    }

private var _arrowLineUpRightLight: ImageVector? = null
