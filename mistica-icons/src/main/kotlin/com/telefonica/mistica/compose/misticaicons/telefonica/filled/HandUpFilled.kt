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

public val FilledGroup.HandUpFilled: ImageVector
    get() {
        if (_handUpFilled != null) {
            return _handUpFilled!!
        }
        _handUpFilled = Builder(name = "HandUpFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.164f, 9.62f)
                curveToRelative(-0.283f, 0.0f, -0.54f, 0.039f, -0.773f, 0.117f)
                curveToRelative(-0.238f, -0.857f, -0.942f, -1.367f, -1.95f, -1.367f)
                curveToRelative(-0.283f, 0.0f, -0.543f, 0.042f, -0.776f, 0.118f)
                curveToRelative(-0.24f, -0.849f, -0.941f, -1.353f, -1.944f, -1.353f)
                curveToRelative(-0.246f, 0.0f, -0.476f, 0.03f, -0.683f, 0.09f)
                verticalLineTo(4.321f)
                curveToRelative(0.0f, -1.333f, -0.818f, -2.162f, -2.135f, -2.162f)
                curveToRelative(-1.266f, 0.0f, -2.042f, 0.77f, -2.129f, 2.118f)
                verticalLineToRelative(7.428f)
                curveToRelative(-0.339f, -0.577f, -0.644f, -0.98f, -1.008f, -1.272f)
                arcToRelative(1.927f, 1.927f, 0.0f, false, false, -1.207f, -0.43f)
                curveToRelative(-0.404f, 0.0f, -0.801f, 0.13f, -1.132f, 0.397f)
                curveToRelative(-0.65f, 0.52f, -0.81f, 1.409f, -0.409f, 2.263f)
                curveToRelative(0.68f, 1.448f, 1.826f, 3.776f, 2.748f, 5.647f)
                curveToRelative(0.574f, 1.165f, 1.07f, 2.174f, 1.21f, 2.476f)
                curveToRelative(0.146f, 0.32f, 0.49f, 1.062f, 1.272f, 1.062f)
                horizontalLineToRelative(7.787f)
                curveToRelative(0.983f, 0.0f, 1.82f, -0.308f, 2.361f, -0.866f)
                curveToRelative(0.538f, -0.554f, 0.81f, -1.33f, 0.81f, -2.302f)
                verticalLineToRelative(-6.997f)
                curveToRelative(-0.006f, -1.275f, -0.785f, -2.065f, -2.042f, -2.065f)
                close()
            }
        }
        .build()
        return _handUpFilled!!
    }

private var _handUpFilled: ImageVector? = null
