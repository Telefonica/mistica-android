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

public val FilledGroup.BookmarkFilled: ImageVector
    get() {
        if (_bookmarkFilled != null) {
            return _bookmarkFilled!!
        }
        _bookmarkFilled = Builder(name = "BookmarkFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.478f, 3.286f)
                verticalLineToRelative(17.109f)
                curveToRelative(0.0f, 0.496f, -0.272f, 0.941f, -0.723f, 1.16f)
                arcToRelative(1.413f, 1.413f, 0.0f, false, true, -0.577f, 0.134f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.79f, -0.269f)
                lineToRelative(-3.731f, -3.67f)
                arcToRelative(0.463f, 0.463f, 0.0f, false, false, -0.644f, 0.0f)
                lineToRelative(-3.698f, 3.637f)
                curveToRelative(-0.442f, 0.336f, -0.96f, 0.386f, -1.412f, 0.168f)
                arcToRelative(1.283f, 1.283f, 0.0f, false, true, -0.73f, -1.16f)
                verticalLineTo(3.285f)
                curveTo(6.172f, 2.58f, 6.757f, 2.0f, 7.471f, 2.0f)
                horizontalLineToRelative(9.703f)
                curveToRelative(0.726f, 0.0f, 1.303f, 0.58f, 1.303f, 1.286f)
            }
        }
        .build()
        return _bookmarkFilled!!
    }

private var _bookmarkFilled: ImageVector? = null
