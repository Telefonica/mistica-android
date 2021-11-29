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

public val FilledGroup.UserSupportFilled: ImageVector
    get() {
        if (_userSupportFilled != null) {
            return _userSupportFilled!!
        }
        _userSupportFilled = Builder(name = "UserSupportFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.365f, 2.0f)
                curveTo(7.025f, 2.0f, 2.72f, 6.512f, 2.72f, 12.112f)
                curveToRelative(0.0f, 1.515f, 0.296f, 2.917f, 0.888f, 4.197f)
                lineToRelative(-1.593f, 6.225f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, 0.076f, 0.348f)
                curveToRelative(0.076f, 0.08f, 0.148f, 0.118f, 0.26f, 0.118f)
                horizontalLineToRelative(0.076f)
                lineToRelative(5.928f, -1.67f)
                arcToRelative(9.195f, 9.195f, 0.0f, false, false, 4.003f, 0.893f)
                curveToRelative(5.34f, 0.0f, 9.643f, -4.512f, 9.643f, -10.111f)
                curveTo(22.0f, 6.512f, 17.705f, 2.0f, 12.365f, 2.0f)
                close()
                moveTo(12.365f, 17.829f)
                curveToRelative(-0.372f, 0.0f, -0.668f, -0.31f, -0.668f, -0.701f)
                curveToRelative(0.0f, -0.39f, 0.296f, -0.701f, 0.668f, -0.701f)
                curveToRelative(0.373f, 0.0f, 0.669f, 0.31f, 0.669f, 0.7f)
                curveToRelative(-0.004f, 0.391f, -0.3f, 0.702f, -0.669f, 0.702f)
                close()
                moveTo(14.959f, 11.062f)
                lineTo(13.882f, 12.192f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.964f, 2.45f)
                curveToRelative(0.0f, 0.311f, -0.26f, 0.584f, -0.557f, 0.584f)
                curveToRelative(-0.296f, 0.0f, -0.556f, -0.273f, -0.556f, -0.583f)
                curveToRelative(0.0f, -1.243f, 0.444f, -2.41f, 1.297f, -3.266f)
                lineToRelative(1.077f, -1.129f)
                curveToRelative(0.48f, -0.504f, 0.408f, -1.595f, 0.0f, -2.136f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.634f, -0.857f)
                horizontalLineToRelative(-0.184f)
                curveToRelative(-0.668f, 0.0f, -1.26f, 0.349f, -1.593f, 0.974f)
                curveToRelative(-0.148f, 0.273f, -0.48f, 0.39f, -0.74f, 0.193f)
                curveToRelative(-0.26f, -0.155f, -0.373f, -0.504f, -0.184f, -0.776f)
                curveToRelative(0.52f, -0.932f, 1.52f, -1.558f, 2.557f, -1.558f)
                horizontalLineToRelative(0.184f)
                curveToRelative(0.965f, 0.0f, 1.89f, 0.466f, 2.486f, 1.285f)
                curveToRelative(0.705f, 0.965f, 0.817f, 2.716f, -0.112f, 3.69f)
                close()
            }
        }
        .build()
        return _userSupportFilled!!
    }

private var _userSupportFilled: ImageVector? = null
