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

public val RegularGroup.TreeRegular: ImageVector
    get() {
        if (_treeRegular != null) {
            return _treeRegular!!
        }
        _treeRegular = Builder(name = "TreeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.42f, 15.0f)
                lineToRelative(-4.039f, 0.025f)
                verticalLineToRelative(-2.524f)
                curveToRelative(0.006f, -0.008f, 0.017f, -0.01f, 0.022f, -0.02f)
                lineToRelative(2.143f, -2.92f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, false, -0.129f, -0.852f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.843f, 0.123f)
                lineToRelative(-0.003f, 0.003f)
                lineToRelative(-1.193f, 1.627f)
                verticalLineTo(9.43f)
                arcToRelative(0.605f, 0.605f, 0.0f, true, false, -1.21f, 0.0f)
                verticalLineToRelative(3.574f)
                lineTo(9.63f, 11.445f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, false, -0.851f, -0.008f)
                lineToRelative(-0.006f, 0.006f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.003f, 0.86f)
                lineToRelative(2.398f, 2.425f)
                verticalLineToRelative(0.297f)
                horizontalLineTo(6.342f)
                curveToRelative(-0.941f, 0.0f, -3.135f, -0.305f, -3.135f, -3.137f)
                curveToRelative(0.0f, -1.591f, 0.678f, -2.594f, 2.014f, -2.975f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, 0.44f, -0.596f)
                lineToRelative(-0.006f, -0.099f)
                curveToRelative(0.0f, -4.641f, 4.028f, -5.0f, 5.264f, -5.0f)
                curveToRelative(0.7f, 0.0f, 4.235f, 0.16f, 5.073f, 3.297f)
                curveToRelative(0.067f, 0.258f, 0.3f, 0.443f, 0.565f, 0.451f)
                curveToRelative(1.18f, 0.034f, 3.92f, 0.488f, 3.92f, 3.992f)
                curveToRelative(0.002f, 3.75f, -3.104f, 4.042f, -4.057f, 4.042f)
                moveToRelative(0.61f, -9.224f)
                curveTo(15.785f, 2.188f, 11.746f, 2.0f, 10.923f, 2.0f)
                curveToRelative(-1.062f, 0.0f, -6.275f, 0.289f, -6.468f, 5.894f)
                curveTo(3.384f, 8.324f, 2.0f, 9.37f, 2.0f, 11.888f)
                curveToRelative(0.0f, 3.21f, 2.244f, 4.356f, 4.342f, 4.356f)
                horizontalLineToRelative(4.829f)
                verticalLineToRelative(4.834f)
                curveToRelative(0.0f, 0.337f, 0.272f, 0.608f, 0.605f, 0.608f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, false, 0.605f, -0.608f)
                verticalLineToRelative(-4.837f)
                lineToRelative(4.04f, -0.025f)
                curveToRelative(2.428f, 0.0f, 5.265f, -1.378f, 5.265f, -5.26f)
                curveToRelative(0.0f, -3.513f, -2.327f, -4.964f, -4.655f, -5.18f)
            }
        }
        .build()
        return _treeRegular!!
    }

private var _treeRegular: ImageVector? = null
