package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.BookmarkRegular: ImageVector
    get() {
        if (_bookmarkRegular != null) {
            return _bookmarkRegular!!
        }
        _bookmarkRegular = Builder(name = "BookmarkRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.338f, 16.443f)
                curveToRelative(0.38f, 0.0f, 0.756f, 0.142f, 1.042f, 0.43f)
                lineToRelative(3.551f, 3.55f)
                curveToRelative(0.031f, 0.02f, 0.115f, -0.011f, 0.157f, -0.034f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.118f, -0.187f)
                verticalLineTo(3.479f)
                arcToRelative(0.209f, 0.209f, 0.0f, false, false, -0.205f, -0.21f)
                horizontalLineToRelative(-9.35f)
                arcToRelative(0.204f, 0.204f, 0.0f, false, false, -0.207f, 0.204f)
                verticalLineToRelative(16.729f)
                curveToRelative(0.0f, 0.112f, 0.073f, 0.168f, 0.118f, 0.187f)
                curveToRelative(0.044f, 0.023f, 0.131f, 0.05f, 0.218f, -0.02f)
                lineToRelative(3.507f, -3.498f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, true, 1.05f, -0.428f)
                moveToRelative(4.659f, 5.243f)
                curveToRelative(-0.317f, 0.0f, -0.63f, -0.103f, -0.897f, -0.308f)
                lineToRelative(-3.616f, -3.605f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, -0.302f, 0.006f)
                lineToRelative(-3.566f, 3.546f)
                curveToRelative(-0.51f, 0.398f, -1.107f, 0.457f, -1.616f, 0.204f)
                arcToRelative(1.472f, 1.472f, 0.0f, false, true, -0.824f, -1.327f)
                verticalLineTo(3.479f)
                curveTo(6.175f, 2.664f, 6.836f, 2.0f, 7.651f, 2.0f)
                horizontalLineToRelative(9.35f)
                curveToRelative(0.813f, 0.0f, 1.477f, 0.664f, 1.477f, 1.482f)
                verticalLineToRelative(16.72f)
                curveToRelative(0.0f, 0.568f, -0.317f, 1.075f, -0.827f, 1.327f)
                curveToRelative(-0.21f, 0.107f, -0.431f, 0.157f, -0.655f, 0.157f)
            }
        }
        .build()
        return _bookmarkRegular!!
    }

private var _bookmarkRegular: ImageVector? = null
