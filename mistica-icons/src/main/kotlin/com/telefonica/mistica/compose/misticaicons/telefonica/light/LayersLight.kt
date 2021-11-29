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

public val LightGroup.LayersLight: ImageVector
    get() {
        if (_layersLight != null) {
            return _layersLight!!
        }
        _layersLight = Builder(name = "LayersLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.924f, 16.585f)
                lineToRelative(-8.765f, -4.543f)
                lineToRelative(2.216f, -1.16f)
                lineToRelative(6.09f, 3.157f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, 0.91f, 0.003f)
                lineToRelative(6.207f, -3.162f)
                lineToRelative(2.258f, 1.162f)
                lineToRelative(-8.916f, 4.543f)
                close()
                moveTo(20.84f, 15.487f)
                lineTo(11.924f, 20.031f)
                lineTo(3.159f, 15.487f)
                lineTo(5.375f, 14.327f)
                lineTo(11.465f, 17.487f)
                curveToRelative(0.145f, 0.076f, 0.3f, 0.112f, 0.459f, 0.112f)
                curveToRelative(0.154f, 0.0f, 0.31f, -0.036f, 0.45f, -0.106f)
                lineToRelative(6.208f, -3.165f)
                lineToRelative(2.258f, 1.16f)
                close()
                moveTo(11.924f, 4.014f)
                lineToRelative(8.916f, 4.583f)
                lineToRelative(-8.916f, 4.546f)
                lineToRelative(-8.765f, -4.546f)
                lineToRelative(8.765f, -4.583f)
                close()
                moveTo(21.843f, 12.044f)
                curveToRelative(0.0f, -0.38f, -0.213f, -0.733f, -0.55f, -0.904f)
                lineToRelative(-1.602f, -0.823f)
                lineToRelative(1.6f, -0.816f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, false, 0.003f, -1.81f)
                lineTo(12.378f, 3.11f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, -0.916f, 0.006f)
                lineTo(2.7f, 7.697f)
                arcTo(1.015f, 1.015f, 0.0f, false, false, 2.702f, 9.5f)
                lineToRelative(1.577f, 0.818f)
                lineToRelative(-1.58f, 0.826f)
                arcToRelative(1.017f, 1.017f, 0.0f, false, false, 0.003f, 1.801f)
                lineToRelative(1.577f, 0.818f)
                lineToRelative(-1.58f, 0.826f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, false, 0.003f, 1.801f)
                lineToRelative(8.762f, 4.544f)
                arcToRelative(0.983f, 0.983f, 0.0f, false, false, 0.91f, 0.003f)
                lineToRelative(8.917f, -4.544f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, 0.003f, -1.81f)
                lineToRelative(-1.603f, -0.823f)
                lineToRelative(1.6f, -0.815f)
                curveToRelative(0.339f, -0.17f, 0.552f, -0.518f, 0.552f, -0.9f)
                close()
            }
        }
        .build()
        return _layersLight!!
    }

private var _layersLight: ImageVector? = null
