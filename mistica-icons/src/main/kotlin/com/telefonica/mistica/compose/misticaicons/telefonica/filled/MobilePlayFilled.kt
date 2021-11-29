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

public val FilledGroup.MobilePlayFilled: ImageVector
    get() {
        if (_mobilePlayFilled != null) {
            return _mobilePlayFilled!!
        }
        _mobilePlayFilled = Builder(name = "MobilePlayFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.958f, 13.785f)
                verticalLineToRelative(-3.297f)
                lineToRelative(2.88f, 1.647f)
                lineToRelative(-2.88f, 1.65f)
                close()
                moveTo(11.358f, 11.614f)
                lineTo(6.654f, 8.922f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.608f, 0.0f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.305f, 0.52f)
                verticalLineToRelative(5.385f)
                curveToRelative(0.0f, 0.215f, 0.115f, 0.414f, 0.305f, 0.52f)
                arcToRelative(0.594f, 0.594f, 0.0f, false, false, 0.305f, 0.082f)
                curveToRelative(0.107f, 0.0f, 0.21f, -0.025f, 0.306f, -0.081f)
                lineToRelative(4.706f, -2.692f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.305f, -0.524f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.308f, -0.518f)
                close()
                moveTo(8.082f, 16.804f)
                curveToRelative(3.215f, 0.0f, 4.717f, -1.487f, 4.717f, -4.664f)
                curveToRelative(0.0f, -3.184f, -1.502f, -4.672f, -4.717f, -4.672f)
                curveToRelative(-3.208f, 0.0f, -4.7f, 1.488f, -4.7f, 4.672f)
                curveToRelative(0.0f, 3.177f, 1.492f, 4.664f, 4.7f, 4.664f)
                close()
                moveTo(20.899f, 3.11f)
                curveToRelative(0.642f, 0.644f, 0.95f, 1.535f, 0.95f, 2.742f)
                verticalLineToRelative(12.302f)
                curveToRelative(0.0f, 1.213f, -0.316f, 2.115f, -0.966f, 2.751f)
                curveToRelative(-0.642f, 0.636f, -1.544f, 0.941f, -2.762f, 0.941f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.219f, 0.0f, -2.118f, -0.305f, -2.768f, -0.932f)
                curveToRelative(-0.574f, -0.572f, -0.885f, -1.342f, -0.95f, -2.365f)
                verticalLineToRelative(-0.546f)
                curveToRelative(-0.039f, 0.0f, -0.072f, 0.009f, -0.114f, 0.009f)
                curveToRelative(-3.743f, 0.0f, -5.919f, -1.874f, -5.919f, -5.872f)
                curveToRelative(0.0f, -4.005f, 2.176f, -5.88f, 5.919f, -5.88f)
                curveToRelative(0.039f, 0.0f, 0.073f, 0.01f, 0.106f, 0.01f)
                verticalLineToRelative(-0.418f)
                curveToRelative(0.0f, -1.19f, 0.308f, -2.076f, 0.958f, -2.726f)
                curveToRelative(0.65f, -0.652f, 1.552f, -0.966f, 2.768f, -0.966f)
                horizontalLineToRelative(6.21f)
                curveToRelative(1.218f, 0.0f, 2.129f, 0.314f, 2.778f, 0.95f)
                close()
                moveTo(14.239f, 18.768f)
                curveToRelative(0.184f, 0.188f, 0.453f, 0.286f, 0.778f, 0.286f)
                reflectiveCurveToRelative(0.594f, -0.098f, 0.779f, -0.286f)
                curveToRelative(0.182f, -0.185f, 0.274f, -0.44f, 0.274f, -0.76f)
                curveToRelative(0.0f, -0.655f, -0.395f, -1.047f, -1.053f, -1.047f)
                curveToRelative(-0.658f, 0.0f, -1.053f, 0.392f, -1.053f, 1.048f)
                curveToRelative(0.0f, 0.316f, 0.092f, 0.574f, 0.274f, 0.759f)
                close()
            }
        }
        .build()
        return _mobilePlayFilled!!
    }

private var _mobilePlayFilled: ImageVector? = null
