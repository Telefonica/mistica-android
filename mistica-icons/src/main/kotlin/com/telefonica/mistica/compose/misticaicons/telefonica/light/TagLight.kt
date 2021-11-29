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

public val LightGroup.TagLight: ImageVector
    get() {
        if (_tagLight != null) {
            return _tagLight!!
        }
        _tagLight = Builder(name = "TagLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.843f, 3.498f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(8.32f)
                curveToRelative(-0.076f, 0.42f, -0.28f, 0.803f, -0.588f, 1.1f)
                lineToRelative(-8.328f, 8.277f)
                curveToRelative(-0.345f, 0.381f, -0.824f, 0.611f, -1.334f, 0.645f)
                arcToRelative(1.151f, 1.151f, 0.0f, false, true, -0.829f, -0.314f)
                lineToRelative(-8.288f, -8.277f)
                arcToRelative(1.555f, 1.555f, 0.0f, false, true, 0.291f, -2.163f)
                lineToRelative(8.336f, -8.35f)
                arcToRelative(2.082f, 2.082f, 0.0f, false, true, 1.062f, -0.58f)
                lineTo(20.5f, 2.156f)
                curveToRelative(0.74f, 0.0f, 1.342f, 0.6f, 1.342f, 1.342f)
                close()
                moveTo(21.014f, 11.694f)
                lineTo(21.014f, 3.498f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, false, -0.513f, -0.513f)
                horizontalLineToRelative(-8.196f)
                curveToRelative(-0.238f, 0.054f, -0.453f, 0.18f, -0.622f, 0.356f)
                lineToRelative(-8.36f, 8.32f)
                curveToRelative(-0.365f, 0.364f, -0.449f, 0.82f, -0.284f, 0.983f)
                lineToRelative(8.289f, 8.28f)
                curveToRelative(0.165f, 0.165f, 0.638f, 0.073f, 0.994f, -0.28f)
                lineToRelative(8.345f, -8.328f)
                curveToRelative(0.179f, -0.165f, 0.3f, -0.384f, 0.347f, -0.622f)
                close()
                moveTo(16.938f, 4.341f)
                curveToRelative(0.645f, 0.05f, 1.247f, 0.35f, 1.673f, 0.838f)
                curveToRelative(0.493f, 0.437f, 0.79f, 1.05f, 0.829f, 1.706f)
                arcToRelative(2.388f, 2.388f, 0.0f, false, true, -0.787f, 1.714f)
                curveToRelative(-0.429f, 0.47f, -1.023f, 0.75f, -1.659f, 0.787f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -1.717f, -0.83f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, true, -0.829f, -1.713f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 0.787f, -1.715f)
                arcToRelative(2.44f, 2.44f, 0.0f, false, true, 1.703f, -0.787f)
                close()
                moveTo(18.09f, 7.951f)
                curveToRelative(0.316f, -0.274f, 0.51f, -0.666f, 0.53f, -1.083f)
                arcToRelative(1.661f, 1.661f, 0.0f, false, false, -0.564f, -1.135f)
                arcToRelative(1.665f, 1.665f, 0.0f, false, false, -1.126f, -0.563f)
                curveToRelative(-0.429f, 0.025f, -0.83f, 0.222f, -1.112f, 0.546f)
                curveToRelative(-0.322f, 0.28f, -0.518f, 0.676f, -0.546f, 1.101f)
                curveToRelative(0.03f, 0.437f, 0.232f, 0.846f, 0.563f, 1.135f)
                curveToRelative(0.291f, 0.325f, 0.7f, 0.52f, 1.134f, 0.546f)
                curveToRelative(0.429f, -0.04f, 0.827f, -0.233f, 1.12f, -0.546f)
                close()
            }
        }
        .build()
        return _tagLight!!
    }

private var _tagLight: ImageVector? = null
