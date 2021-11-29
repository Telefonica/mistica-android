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

public val FilledGroup.EditFilled: ImageVector
    get() {
        if (_editFilled != null) {
            return _editFilled!!
        }
        _editFilled = Builder(name = "EditFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.21f, 9.975f)
                curveToRelative(-0.249f, 0.246f, -2.94f, 2.647f, -7.38f, 6.58f)
                lineToRelative(-0.191f, 0.154f)
                lineToRelative(-3.417f, 1.255f)
                curveToRelative(-0.054f, 0.014f, -0.325f, 0.112f, -0.48f, -0.042f)
                curveToRelative(-0.15f, -0.155f, -0.047f, -0.407f, -0.03f, -0.457f)
                lineToRelative(1.243f, -3.347f)
                arcToRelative(0.635f, 0.635f, 0.0f, false, true, 0.169f, -0.25f)
                curveToRelative(2.481f, -2.193f, 7.072f, -6.26f, 7.397f, -6.585f)
                arcToRelative(1.852f, 1.852f, 0.0f, false, true, 1.328f, -0.569f)
                curveToRelative(0.515f, 0.0f, 1.014f, 0.216f, 1.367f, 0.569f)
                curveToRelative(0.358f, 0.358f, 0.571f, 0.874f, 0.569f, 1.375f)
                curveToRelative(0.0f, 0.493f, -0.2f, 0.947f, -0.575f, 1.317f)
                moveToRelative(1.78f, -1.311f)
                arcToRelative(3.218f, 3.218f, 0.0f, false, false, -0.923f, -2.233f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.672f, -0.862f)
                curveTo(19.16f, 3.36f, 17.653f, 2.0f, 15.35f, 2.0f)
                horizontalLineTo(6.392f)
                curveTo(3.87f, 2.0f, 2.3f, 3.6f, 2.3f, 6.176f)
                verticalLineTo(17.56f)
                curveToRelative(0.0f, 1.23f, 0.345f, 2.224f, 1.03f, 2.953f)
                curveToRelative(0.73f, 0.778f, 1.757f, 1.173f, 3.062f, 1.173f)
                horizontalLineToRelative(8.958f)
                curveToRelative(1.303f, 0.0f, 2.337f, -0.395f, 3.065f, -1.173f)
                curveToRelative(0.683f, -0.729f, 1.028f, -1.723f, 1.028f, -2.953f)
                verticalLineTo(12.29f)
                arcToRelative(79.741f, 79.741f, 0.0f, false, false, 1.61f, -1.457f)
                curveToRelative(0.611f, -0.6f, 0.933f, -1.35f, 0.936f, -2.168f)
            }
        }
        .build()
        return _editFilled!!
    }

private var _editFilled: ImageVector? = null
