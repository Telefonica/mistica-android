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

public val FilledGroup.RulerFilled: ImageVector
    get() {
        if (_rulerFilled != null) {
            return _rulerFilled!!
        }
        _rulerFilled = Builder(name = "RulerFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.545f, 18.025f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.426f, -1.597f)
                arcToRelative(1.174f, 1.174f, 0.0f, false, false, -1.596f, 0.429f)
                arcToRelative(1.171f, 1.171f, 0.0f, false, false, 1.01f, 1.753f)
                arcToRelative(1.174f, 1.174f, 0.0f, false, false, 1.011f, -0.585f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(15.786f, 14.518f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, false, 0.605f, 0.005f)
                lineToRelative(1.303f, -1.28f)
                lineToRelative(-0.605f, -0.605f)
                lineToRelative(-1.297f, 1.275f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, false, -0.006f, 0.605f)
                close()
                moveTo(13.265f, 13.451f)
                lineTo(15.585f, 11.128f)
                lineTo(14.979f, 10.523f)
                lineTo(12.66f, 12.846f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.0f, 0.605f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.605f, 0.0f)
                close()
                moveTo(11.85f, 10.442f)
                curveToRelative(0.11f, 0.0f, 0.216f, -0.042f, 0.3f, -0.123f)
                lineToRelative(1.322f, -1.3f)
                lineToRelative(-0.605f, -0.605f)
                lineToRelative(-1.316f, 1.294f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, false, 0.3f, 0.734f)
                close()
                moveTo(8.982f, 9.285f)
                lineToRelative(2.378f, -2.38f)
                lineToRelative(-0.605f, -0.606f)
                lineTo(8.377f, 8.68f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.0f, 0.605f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.605f, 0.0f)
                close()
                moveTo(7.568f, 6.277f)
                curveToRelative(0.109f, 0.0f, 0.215f, -0.04f, 0.3f, -0.123f)
                lineTo(9.25f, 4.792f)
                lineToRelative(-0.605f, -0.605f)
                lineToRelative(-1.378f, 1.356f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, false, 0.3f, 0.734f)
                close()
                moveTo(21.578f, 16.568f)
                curveToRelative(0.169f, 0.224f, 0.267f, 0.496f, 0.267f, 0.782f)
                curveToRelative(0.0f, 0.35f, -0.137f, 0.68f, -0.384f, 0.927f)
                lineToRelative(-3.185f, 3.188f)
                curveToRelative(-0.246f, 0.249f, -0.577f, 0.383f, -0.927f, 0.383f)
                curveToRelative(-0.35f, 0.0f, -0.678f, -0.134f, -0.924f, -0.383f)
                lineTo(2.542f, 7.574f)
                arcToRelative(1.315f, 1.315f, 0.0f, false, true, 0.0f, -1.854f)
                lineTo(5.73f, 2.532f)
                curveToRelative(0.493f, -0.496f, 1.359f, -0.496f, 1.852f, 0.0f)
                lineToRelative(0.218f, 0.218f)
                lineToRelative(0.011f, -0.008f)
                lineToRelative(13.796f, 13.801f)
                lineToRelative(-0.028f, 0.025f)
                close()
            }
        }
        .build()
        return _rulerFilled!!
    }

private var _rulerFilled: ImageVector? = null
