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

public val RegularGroup.SniperScopeRegular: ImageVector
    get() {
        if (_sniperScopeRegular != null) {
            return _sniperScopeRegular!!
        }
        _sniperScopeRegular = Builder(name = "SniperScopeRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.527f, 18.403f)
                verticalLineTo(16.27f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.605f, -0.602f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.605f, 0.602f)
                verticalLineToRelative(2.137f)
                curveToRelative(-1.636f, -0.084f, -5.575f, -0.815f, -6.0f, -5.742f)
                horizontalLineToRelative(2.15f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.606f, -0.602f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.605f, -0.603f)
                horizontalLineToRelative(-2.18f)
                curveToRelative(0.163f, -5.495f, 4.387f, -6.21f, 6.031f, -6.274f)
                verticalLineToRelative(2.232f)
                curveToRelative(0.0f, 0.334f, 0.272f, 0.603f, 0.605f, 0.603f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.605f, -0.603f)
                verticalLineTo(5.2f)
                curveToRelative(1.726f, 0.115f, 5.844f, 0.958f, 6.026f, 6.26f)
                horizontalLineToRelative(-2.28f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.606f, 0.603f)
                curveToRelative(0.0f, 0.333f, 0.272f, 0.602f, 0.605f, 0.602f)
                horizontalLineToRelative(2.258f)
                curveToRelative(-0.414f, 4.902f, -4.364f, 5.647f, -6.005f, 5.74f)
                moveToRelative(8.582f, -6.945f)
                horizontalLineToRelative(-1.347f)
                curveToRelative(-0.199f, -6.493f, -5.544f, -7.358f, -7.235f, -7.465f)
                verticalLineTo(2.602f)
                arcTo(0.604f, 0.604f, 0.0f, false, false, 11.922f, 2.0f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.605f, 0.602f)
                verticalLineTo(3.98f)
                curveToRelative(-1.58f, 0.062f, -7.065f, 0.765f, -7.239f, 7.48f)
                horizontalLineTo(2.63f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.605f, 0.602f)
                curveToRelative(0.0f, 0.333f, 0.272f, 0.602f, 0.605f, 0.602f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.461f, 6.112f, 5.596f, 6.868f, 7.207f, 6.947f)
                verticalLineToRelative(1.473f)
                curveToRelative(0.0f, 0.333f, 0.271f, 0.602f, 0.605f, 0.602f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.605f, -0.602f)
                verticalLineToRelative(-1.476f)
                curveToRelative(1.61f, -0.087f, 6.761f, -0.857f, 7.207f, -6.944f)
                horizontalLineToRelative(1.375f)
                arcToRelative(0.602f, 0.602f, 0.0f, true, false, 0.0f, -1.204f)
            }
        }
        .build()
        return _sniperScopeRegular!!
    }

private var _sniperScopeRegular: ImageVector? = null
