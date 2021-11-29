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

public val LightGroup.SearchLight: ImageVector
    get() {
        if (_searchLight != null) {
            return _searchLight!!
        }
        _searchLight = Builder(name = "SearchLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.487f, 4.38f)
                arcToRelative(7.806f, 7.806f, 0.0f, false, true, 0.192f, 10.907f)
                lineToRelative(6.085f, 6.082f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.196f, 0.479f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.199f, -0.084f)
                lineToRelative(-6.087f, -6.084f)
                lineToRelative(-0.018f, 0.02f)
                arcToRelative(7.757f, 7.757f, 0.0f, false, true, -5.298f, 2.072f)
                arcToRelative(7.809f, 7.809f, 0.0f, false, true, -5.524f, -13.33f)
                arcToRelative(7.814f, 7.814f, 0.0f, false, true, 11.045f, -0.062f)
                close()
                moveTo(9.966f, 2.716f)
                arcToRelative(7.248f, 7.248f, 0.0f, true, false, 5.123f, 2.123f)
                arcToRelative(7.196f, 7.196f, 0.0f, false, false, -5.123f, -2.123f)
                close()
            }
        }
        .build()
        return _searchLight!!
    }

private var _searchLight: ImageVector? = null
