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

public val FilledGroup.TreeFilled: ImageVector
    get() {
        if (_treeFilled != null) {
            return _treeFilled!!
        }
        _treeFilled = Builder(name = "TreeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.03f, 5.773f)
                curveTo(15.785f, 2.185f, 11.746f, 2.0f, 10.923f, 2.0f)
                curveToRelative(-1.062f, 0.0f, -6.275f, 0.289f, -6.468f, 5.894f)
                curveTo(3.384f, 8.322f, 2.0f, 9.367f, 2.0f, 11.888f)
                curveToRelative(0.0f, 3.21f, 2.244f, 4.353f, 4.342f, 4.353f)
                horizontalLineToRelative(4.832f)
                verticalLineToRelative(-1.51f)
                lineToRelative(-2.398f, -2.426f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, 0.003f, -0.86f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.854f, 0.003f)
                lineToRelative(1.54f, 1.558f)
                verticalLineTo(9.43f)
                arcToRelative(0.605f, 0.605f, 0.0f, true, true, 1.21f, 0.0f)
                verticalLineToRelative(1.034f)
                lineToRelative(1.194f, -1.627f)
                arcToRelative(0.605f, 0.605f, 0.0f, true, true, 0.972f, 0.722f)
                lineToRelative(-2.143f, 2.922f)
                curveToRelative(-0.005f, 0.008f, -0.017f, 0.011f, -0.022f, 0.02f)
                verticalLineToRelative(3.728f)
                lineToRelative(-1.208f, 0.01f)
                verticalLineToRelative(4.836f)
                arcToRelative(0.605f, 0.605f, 0.0f, true, false, 1.21f, 0.0f)
                verticalLineToRelative(-4.838f)
                lineToRelative(4.04f, -0.025f)
                curveToRelative(2.431f, 0.0f, 5.266f, -1.378f, 5.266f, -5.26f)
                curveToRelative(-0.006f, -3.51f, -2.333f, -4.961f, -4.661f, -5.18f)
            }
        }
        .build()
        return _treeFilled!!
    }

private var _treeFilled: ImageVector? = null
