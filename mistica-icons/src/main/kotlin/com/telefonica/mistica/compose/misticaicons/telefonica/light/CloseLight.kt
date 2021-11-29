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

public val LightGroup.CloseLight: ImageVector
    get() {
        if (_closeLight != null) {
            return _closeLight!!
        }
        _closeLight = Builder(name = "CloseLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.569f, 12.0f)
                lineToRelative(5.31f, -5.319f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, 0.017f, -0.543f)
                lineToRelative(-0.017f, -0.017f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, -0.543f, -0.017f)
                curveToRelative(-0.007f, 0.005f, -0.012f, 0.012f, -0.017f, 0.017f)
                lineTo(12.0f, 11.431f)
                lineToRelative(-5.319f, -5.31f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, -0.543f, -0.017f)
                lineToRelative(-0.017f, 0.017f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, -0.017f, 0.543f)
                curveToRelative(0.005f, 0.007f, 0.012f, 0.012f, 0.017f, 0.017f)
                lineTo(11.431f, 12.0f)
                lineToRelative(-5.31f, 5.319f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, -0.017f, 0.543f)
                lineToRelative(0.017f, 0.017f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.28f, 0.12f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.28f, -0.12f)
                lineTo(12.0f, 12.569f)
                lineToRelative(5.319f, 5.31f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, 0.543f, 0.017f)
                lineToRelative(0.017f, -0.017f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, 0.017f, -0.543f)
                curveToRelative(-0.005f, -0.007f, -0.012f, -0.012f, -0.017f, -0.017f)
                lineTo(12.569f, 12.0f)
                close()
            }
        }
        .build()
        return _closeLight!!
    }

private var _closeLight: ImageVector? = null
