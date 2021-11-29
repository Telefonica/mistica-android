package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.TvContentFilled: ImageVector
    get() {
        if (_tvContentFilled != null) {
            return _tvContentFilled!!
        }
        _tvContentFilled = Builder(name = "TvContentFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.596f)
                lineTo(22.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(12.596f)
                horizontalLineToRelative(7.966f)
                verticalLineToRelative(1.294f)
                lineTo(7.557f, 17.89f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.555f, 0.555f)
                curveToRelative(0.0f, 0.308f, 0.247f, 0.555f, 0.555f, 0.555f)
                horizontalLineToRelative(8.891f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, 0.554f, -0.555f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.554f, -0.555f)
                horizontalLineToRelative(-2.41f)
                verticalLineToRelative(-1.294f)
                lineTo(22.0f, 16.596f)
                close()
                moveTo(12.925f, 17.89f)
                lineTo(11.07f, 17.89f)
                verticalLineToRelative(-1.294f)
                horizontalLineToRelative(1.854f)
                verticalLineToRelative(1.294f)
                close()
            }
        }
        .build()
        return _tvContentFilled!!
    }

private var _tvContentFilled: ImageVector? = null
