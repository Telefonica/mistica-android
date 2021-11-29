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

public val RegularGroup.ShieldCrossRegular: ImageVector
    get() {
        if (_shieldCrossRegular != null) {
            return _shieldCrossRegular!!
        }
        _shieldCrossRegular = Builder(name = "ShieldCrossRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 20.073f)
                verticalLineToRelative(-7.888f)
                horizontalLineToRelative(6.587f)
                curveToRelative(-0.058f, 0.807f, -0.131f, 1.543f, -0.227f, 2.103f)
                curveToRelative(-0.372f, 2.16f, -4.156f, 4.6f, -6.36f, 5.785f)
                moveToRelative(-7.57f, -5.785f)
                arcToRelative(22.452f, 22.452f, 0.0f, false, true, -0.232f, -2.103f)
                horizontalLineToRelative(6.585f)
                verticalLineToRelative(7.888f)
                curveToRelative(-2.201f, -1.185f, -5.98f, -3.625f, -6.352f, -5.785f)
                moveToRelative(3.302f, -9.747f)
                curveToRelative(0.88f, -0.591f, 1.717f, -1.152f, 3.053f, -1.283f)
                verticalLineToRelative(7.697f)
                horizontalLineToRelative(-6.66f)
                curveToRelative(-0.102f, -1.966f, -0.124f, -4.067f, -0.132f, -5.12f)
                curveToRelative(1.677f, 0.087f, 2.728f, -0.617f, 3.739f, -1.294f)
                moveToRelative(11.056f, 1.294f)
                arcToRelative(118.903f, 118.903f, 0.0f, false, true, -0.129f, 5.12f)
                horizontalLineTo(12.9f)
                verticalLineTo(3.258f)
                curveToRelative(1.332f, 0.131f, 2.17f, 0.694f, 3.052f, 1.283f)
                curveToRelative(1.009f, 0.677f, 2.05f, 1.383f, 3.737f, 1.294f)
                moveToRelative(1.216f, -0.687f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, false, -0.23f, -0.459f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, false, -0.504f, -0.137f)
                curveToRelative(-1.622f, 0.255f, -2.476f, -0.314f, -3.552f, -1.037f)
                curveTo(15.56f, 2.804f, 14.359f, 2.0f, 12.294f, 2.0f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-2.065f, 0.0f, -3.266f, 0.804f, -4.328f, 1.515f)
                curveToRelative(-1.076f, 0.723f, -1.924f, 1.292f, -3.527f, 1.04f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, false, -0.52f, 0.109f)
                arcToRelative(0.632f, 0.632f, 0.0f, false, false, -0.236f, 0.482f)
                curveToRelative(0.0f, 0.269f, -0.017f, 6.61f, 0.457f, 9.35f)
                curveToRelative(0.61f, 3.552f, 7.15f, 6.773f, 7.896f, 7.129f)
                curveToRelative(0.003f, 0.002f, 0.006f, 0.0f, 0.008f, 0.002f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.496f, 0.0f)
                curveToRelative(0.003f, -0.002f, 0.009f, 0.0f, 0.011f, -0.002f)
                curveToRelative(0.745f, -0.356f, 7.294f, -3.577f, 7.905f, -7.13f)
                curveToRelative(0.474f, -2.739f, 0.457f, -9.078f, 0.457f, -9.347f)
            }
        }
        .build()
        return _shieldCrossRegular!!
    }

private var _shieldCrossRegular: ImageVector? = null
