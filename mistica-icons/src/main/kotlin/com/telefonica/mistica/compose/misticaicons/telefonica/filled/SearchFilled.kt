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

public val FilledGroup.SearchFilled: ImageVector
    get() {
        if (_searchFilled != null) {
            return _searchFilled!!
        }
        _searchFilled = Builder(name = "SearchFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.417f, 4.39f)
                arcToRelative(7.845f, 7.845f, 0.0f, false, true, 0.378f, 10.497f)
                lineToRelative(5.704f, 5.704f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, -0.793f, 0.793f)
                lineToRelative(-5.696f, -5.697f)
                arcToRelative(7.792f, 7.792f, 0.0f, false, true, -5.139f, 1.918f)
                arcTo(7.846f, 7.846f, 0.0f, false, true, 4.322f, 4.21f)
                arcToRelative(7.848f, 7.848f, 0.0f, false, true, 11.095f, 0.18f)
                close()
                moveTo(9.871f, 3.033f)
                arcToRelative(6.726f, 6.726f, 0.0f, false, false, -4.756f, 11.481f)
                arcToRelative(6.728f, 6.728f, 0.0f, false, false, 9.496f, 0.053f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, true, 0.05f, -0.055f)
                lineToRelative(0.018f, -0.016f)
                lineToRelative(0.128f, -0.13f)
                arcToRelative(6.726f, 6.726f, 0.0f, false, false, -0.143f, -9.328f)
                curveToRelative(-0.011f, -0.014f, -0.025f, -0.025f, -0.037f, -0.036f)
                arcToRelative(6.68f, 6.68f, 0.0f, false, false, -4.756f, -1.97f)
                close()
                moveTo(5.871f, 5.758f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 8.104f, 0.0f)
                arcToRelative(5.687f, 5.687f, 0.0f, false, true, 1.678f, 4.05f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, -9.782f, 4.053f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 0.0f, -8.103f)
                close()
            }
        }
        .build()
        return _searchFilled!!
    }

private var _searchFilled: ImageVector? = null
