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

public val FilledGroup.BellProgramFilled: ImageVector
    get() {
        if (_bellProgramFilled != null) {
            return _bellProgramFilled!!
        }
        _bellProgramFilled = Builder(name = "BellProgramFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.367f, 11.42f)
                curveToRelative(0.0f, 2.919f, 1.37f, 4.277f, 4.306f, 4.277f)
                curveToRelative(2.935f, 0.0f, 4.305f, -1.358f, 4.305f, -4.277f)
                reflectiveCurveToRelative(-1.37f, -4.277f, -4.305f, -4.277f)
                curveToRelative(-2.936f, 0.0f, -4.306f, 1.358f, -4.306f, 4.277f)
                close()
                moveTo(21.617f, 17.871f)
                curveToRelative(0.201f, 0.16f, 0.274f, 0.426f, 0.184f, 0.667f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, -0.565f, 0.403f)
                horizontalLineToRelative(-5.227f)
                curveToRelative(-0.034f, 0.55f, -0.185f, 1.359f, -0.76f, 1.995f)
                curveToRelative(-0.534f, 0.602f, -1.31f, 0.907f, -2.296f, 0.907f)
                curveToRelative(-0.99f, 0.0f, -1.765f, -0.305f, -2.3f, -0.907f)
                curveToRelative(-0.574f, -0.636f, -0.72f, -1.449f, -0.75f, -1.995f)
                lineTo(4.674f, 18.941f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.568f, -0.403f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, 0.187f, -0.667f)
                curveToRelative(0.412f, -0.339f, 0.754f, -0.779f, 1.037f, -1.302f)
                curveToRelative(-2.03f, -0.667f, -3.171f, -2.348f, -3.171f, -5.146f)
                curveToRelative(0.0f, -3.328f, 1.619f, -5.073f, 4.443f, -5.412f)
                curveToRelative(1.507f, -3.958f, 5.924f, -3.868f, 6.353f, -3.843f)
                curveToRelative(0.364f, -0.025f, 3.002f, -0.095f, 4.918f, 1.68f)
                curveToRelative(1.278f, 1.183f, 1.927f, 2.889f, 1.927f, 5.082f)
                verticalLineToRelative(3.804f)
                curveToRelative(-0.014f, 0.07f, -0.19f, 3.504f, 1.816f, 5.137f)
                close()
                moveTo(9.37f, 13.863f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.428f, -0.177f)
                lineTo(7.244f, 12.0f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, true, -0.18f, -0.426f)
                lineTo(7.064f, 9.291f)
                curveToRelative(0.0f, -0.333f, 0.272f, -0.602f, 0.609f, -0.602f)
                curveToRelative(0.336f, 0.0f, 0.607f, 0.269f, 0.607f, 0.602f)
                verticalLineToRelative(2.034f)
                lineToRelative(1.521f, 1.51f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, 0.0f, 0.851f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.43f, 0.177f)
                close()
            }
        }
        .build()
        return _bellProgramFilled!!
    }

private var _bellProgramFilled: ImageVector? = null
