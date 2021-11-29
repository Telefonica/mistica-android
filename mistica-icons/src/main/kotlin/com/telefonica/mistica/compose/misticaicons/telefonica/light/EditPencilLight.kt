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

public val LightGroup.EditPencilLight: ImageVector
    get() {
        if (_editPencilLight != null) {
            return _editPencilLight!!
        }
        _editPencilLight = Builder(name = "EditPencilLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.073f, 20.688f)
                curveToRelative(0.308f, 0.0f, 0.555f, 0.258f, 0.555f, 0.58f)
                curveToRelative(0.0f, 0.32f, -0.25f, 0.58f, -0.555f, 0.58f)
                lineTo(3.96f, 21.848f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, -0.555f, -0.58f)
                curveToRelative(0.0f, -0.319f, 0.25f, -0.58f, 0.555f, -0.58f)
                horizontalLineToRelative(16.112f)
                close()
                moveTo(4.916f, 19.425f)
                curveToRelative(-0.387f, 0.0f, -0.753f, -0.165f, -1.022f, -0.45f)
                arcToRelative(1.611f, 1.611f, 0.0f, false, true, -0.345f, -1.553f)
                lineToRelative(1.524f, -4.837f)
                curveToRelative(0.09f, -0.26f, 0.24f, -0.493f, 0.445f, -0.672f)
                curveToRelative(4.19f, -3.958f, 8.692f, -8.264f, 9.003f, -8.589f)
                arcToRelative(3.346f, 3.346f, 0.0f, false, true, 2.434f, -1.168f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, true, 2.566f, 1.157f)
                arcToRelative(4.13f, 4.13f, 0.0f, false, true, 1.112f, 2.731f)
                arcToRelative(3.852f, 3.852f, 0.0f, false, true, -1.112f, 2.661f)
                curveToRelative(-0.555f, 0.625f, -9.025f, 8.645f, -9.112f, 8.726f)
                curveToRelative(-0.143f, 0.14f, -0.314f, 0.243f, -0.501f, 0.3f)
                lineToRelative(-4.535f, 1.607f)
                curveToRelative(-0.149f, 0.065f, -0.303f, 0.09f, -0.457f, 0.087f)
                close()
                moveTo(4.606f, 17.772f)
                arcToRelative(0.387f, 0.387f, 0.0f, false, false, 0.089f, 0.393f)
                curveToRelative(0.081f, 0.09f, 0.207f, 0.126f, 0.322f, 0.092f)
                lineToRelative(4.535f, -1.552f)
                arcToRelative(0.315f, 0.315f, 0.0f, false, false, 0.112f, -0.07f)
                curveToRelative(1.4f, -1.33f, 8.591f, -8.17f, 9.067f, -8.68f)
                arcToRelative(2.723f, 2.723f, 0.0f, false, false, 0.757f, -1.91f)
                arcToRelative(2.916f, 2.916f, 0.0f, false, false, -0.746f, -1.934f)
                arcToRelative(2.444f, 2.444f, 0.0f, false, false, -1.767f, -0.787f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, -1.712f, 0.787f)
                curveToRelative(-0.411f, 0.451f, -6.666f, 6.39f, -9.036f, 8.645f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, false, -0.1f, 0.151f)
                lineToRelative(-1.522f, 4.865f)
                close()
            }
        }
        .build()
        return _editPencilLight!!
    }

private var _editPencilLight: ImageVector? = null
