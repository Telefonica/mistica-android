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

public val FilledGroup.HandRightFilled: ImageVector
    get() {
        if (_handRightFilled != null) {
            return _handRightFilled!!
        }
        _handRightFilled = Builder(name = "HandRightFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.39f, 18.164f)
                curveToRelative(0.0f, -0.283f, -0.04f, -0.54f, -0.118f, -0.773f)
                curveToRelative(0.857f, -0.238f, 1.367f, -0.942f, 1.367f, -1.95f)
                curveToRelative(0.0f, -0.283f, -0.042f, -0.543f, -0.118f, -0.776f)
                curveToRelative(0.85f, -0.24f, 1.353f, -0.941f, 1.353f, -1.944f)
                curveToRelative(0.0f, -0.246f, -0.03f, -0.476f, -0.09f, -0.683f)
                horizontalLineToRelative(2.903f)
                curveToRelative(1.333f, 0.0f, 2.162f, -0.818f, 2.162f, -2.135f)
                curveToRelative(0.0f, -1.266f, -0.77f, -2.042f, -2.118f, -2.129f)
                horizontalLineToRelative(-7.428f)
                curveToRelative(0.577f, -0.339f, 0.98f, -0.644f, 1.272f, -1.008f)
                curveToRelative(0.288f, -0.359f, 0.43f, -0.787f, 0.43f, -1.207f)
                curveToRelative(0.0f, -0.404f, -0.13f, -0.801f, -0.397f, -1.132f)
                curveToRelative(-0.52f, -0.65f, -1.409f, -0.81f, -2.263f, -0.409f)
                curveToRelative(-1.448f, 0.68f, -3.776f, 1.826f, -5.647f, 2.748f)
                curveToRelative(-1.165f, 0.574f, -2.174f, 1.07f, -2.476f, 1.21f)
                curveToRelative(-0.32f, 0.146f, -1.062f, 0.49f, -1.062f, 1.272f)
                verticalLineToRelative(7.787f)
                curveToRelative(0.0f, 0.983f, 0.308f, 1.82f, 0.866f, 2.361f)
                curveToRelative(0.554f, 0.538f, 1.33f, 0.81f, 2.302f, 0.81f)
                horizontalLineToRelative(6.997f)
                curveToRelative(1.275f, -0.006f, 2.065f, -0.785f, 2.065f, -2.042f)
                close()
            }
        }
        .build()
        return _handRightFilled!!
    }

private var _handRightFilled: ImageVector? = null
