package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.UserAccountLight: ImageVector
    get() {
        if (_userAccountLight != null) {
            return _userAccountLight!!
        }
        _userAccountLight = Builder(name = "UserAccountLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.625f, 21.8f)
                lineTo(3.975f, 21.8f)
                arcToRelative(0.274f, 0.274f, 0.0f, false, true, -0.275f, -0.27f)
                verticalLineToRelative(-2.11f)
                curveToRelative(0.0f, -1.442f, 0.457f, -2.67f, 1.32f, -3.551f)
                curveToRelative(0.941f, -0.958f, 2.349f, -1.466f, 4.067f, -1.466f)
                horizontalLineToRelative(6.426f)
                curveToRelative(1.718f, 0.0f, 3.126f, 0.508f, 4.068f, 1.468f)
                curveToRelative(0.865f, 0.882f, 1.319f, 2.11f, 1.319f, 3.552f)
                verticalLineToRelative(2.11f)
                arcToRelative(0.273f, 0.273f, 0.0f, false, true, -0.275f, 0.267f)
                close()
                moveTo(4.25f, 21.26f)
                horizontalLineToRelative(16.098f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0.0f, -1.298f, -0.402f, -2.396f, -1.165f, -3.175f)
                curveToRelative(-0.848f, -0.863f, -2.082f, -1.301f, -3.671f, -1.301f)
                lineTo(9.087f, 14.944f)
                curveToRelative(-1.589f, 0.0f, -2.823f, 0.438f, -3.671f, 1.3f)
                curveToRelative(-0.763f, 0.78f, -1.165f, 1.875f, -1.165f, 3.176f)
                verticalLineToRelative(1.84f)
                close()
                moveTo(12.298f, 12.307f)
                curveToRelative(-3.162f, 0.0f, -4.834f, -1.642f, -4.834f, -4.747f)
                curveToRelative(0.0f, -1.577f, 0.43f, -2.783f, 1.278f, -3.589f)
                curveToRelative(0.818f, -0.776f, 2.013f, -1.171f, 3.556f, -1.171f)
                curveToRelative(1.542f, 0.0f, 2.74f, 0.395f, 3.564f, 1.171f)
                curveToRelative(0.853f, 0.806f, 1.283f, 2.015f, 1.283f, 3.59f)
                curveToRelative(0.0f, 3.104f, -1.675f, 4.746f, -4.847f, 4.746f)
                close()
                moveTo(12.298f, 3.341f)
                curveToRelative(-1.394f, 0.0f, -2.463f, 0.343f, -3.173f, 1.02f)
                curveToRelative(-0.736f, 0.7f, -1.11f, 1.777f, -1.11f, 3.2f)
                curveToRelative(0.0f, 1.422f, 0.374f, 2.496f, 1.11f, 3.19f)
                curveToRelative(0.71f, 0.674f, 1.779f, 1.012f, 3.173f, 1.012f)
                curveToRelative(1.393f, 0.0f, 2.467f, -0.34f, 3.18f, -1.014f)
                curveToRelative(0.742f, -0.698f, 1.116f, -1.772f, 1.116f, -3.192f)
                curveToRelative(0.0f, -1.42f, -0.374f, -2.499f, -1.115f, -3.2f)
                curveToRelative(-0.716f, -0.673f, -1.785f, -1.016f, -3.181f, -1.016f)
                close()
            }
        }
        .build()
        return _userAccountLight!!
    }

private var _userAccountLight: ImageVector? = null
