package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.ArrowUpDownFilled: ImageVector
    get() {
        if (_arrowUpDownFilled != null) {
            return _arrowUpDownFilled!!
        }
        _arrowUpDownFilled = Builder(name = "ArrowUpDownFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.154f, 21.742f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.563f, -0.255f)
                lineToRelative(-4.16f, -4.212f)
                curveToRelative(-0.01f, -0.015f, -0.025f, -0.026f, -0.036f, -0.04f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.098f, -0.832f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.683f, -0.437f)
                lineToRelative(1.824f, -0.014f)
                lineToRelative(-0.006f, -2.902f)
                curveToRelative(0.0f, -0.663f, 0.538f, -1.201f, 1.202f, -1.204f)
                horizontalLineToRelative(2.32f)
                curveToRelative(0.663f, 0.0f, 1.201f, 0.538f, 1.201f, 1.202f)
                lineToRelative(0.003f, 2.904f)
                lineToRelative(1.826f, 0.014f)
                curveToRelative(0.294f, 0.0f, 0.56f, 0.171f, 0.684f, 0.437f)
                arcToRelative(0.787f, 0.787f, 0.0f, false, true, -0.098f, 0.832f)
                curveToRelative(-0.012f, 0.014f, -0.023f, 0.028f, -0.037f, 0.04f)
                lineToRelative(-4.182f, 4.215f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, -0.563f, 0.252f)
                close()
                moveTo(9.776f, 11.908f)
                lineTo(7.459f, 11.908f)
                arcToRelative(1.201f, 1.201f, 0.0f, false, true, -1.201f, -1.202f)
                lineToRelative(-0.003f, -2.902f)
                lineTo(4.43f, 7.79f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.68f, -0.437f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, true, 0.137f, -0.871f)
                lineToRelative(4.174f, -4.207f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, 1.126f, 0.0f)
                lineToRelative(4.154f, 4.21f)
                curveToRelative(0.01f, 0.014f, 0.025f, 0.025f, 0.036f, 0.039f)
                curveToRelative(0.19f, 0.235f, 0.23f, 0.557f, 0.098f, 0.829f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.683f, 0.437f)
                lineToRelative(-1.821f, 0.014f)
                lineToRelative(0.003f, 2.902f)
                arcToRelative(1.197f, 1.197f, 0.0f, false, true, -1.2f, 1.202f)
                close()
            }
        }
        .build()
        return _arrowUpDownFilled!!
    }

private var _arrowUpDownFilled: ImageVector? = null
