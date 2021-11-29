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

public val FilledGroup.DisconnectFilled: ImageVector
    get() {
        if (_disconnectFilled != null) {
            return _disconnectFilled!!
        }
        _disconnectFilled = Builder(name = "DisconnectFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.711f, 18.636f)
                lineTo(11.711f, 8.989f)
                curveToRelative(0.0f, -0.642f, -0.134f, -1.09f, -0.417f, -1.373f)
                curveToRelative(-0.283f, -0.283f, -0.734f, -0.426f, -1.378f, -0.426f)
                lineTo(5.073f, 7.19f)
                curveToRelative(-0.633f, 0.0f, -1.076f, 0.143f, -1.37f, 0.435f)
                curveToRelative(-0.291f, 0.29f, -0.426f, 0.74f, -0.426f, 1.364f)
                verticalLineToRelative(9.647f)
                curveToRelative(0.0f, 0.641f, 0.135f, 1.1f, 0.426f, 1.384f)
                curveToRelative(0.283f, 0.274f, 0.734f, 0.417f, 1.37f, 0.417f)
                horizontalLineToRelative(4.843f)
                curveToRelative(0.636f, 0.0f, 1.084f, -0.143f, 1.37f, -0.417f)
                curveToRelative(0.294f, -0.283f, 0.425f, -0.743f, 0.425f, -1.384f)
                close()
                moveTo(14.325f, 2.0f)
                curveToRelative(4.759f, 0.0f, 7.39f, 2.625f, 7.39f, 7.38f)
                curveToRelative(0.0f, 4.749f, -2.631f, 7.365f, -7.39f, 7.365f)
                curveToRelative(-0.476f, 0.0f, -0.927f, -0.034f, -1.361f, -0.084f)
                verticalLineToRelative(1.975f)
                curveToRelative(0.0f, 1.0f, -0.258f, 1.74f, -0.793f, 2.266f)
                curveToRelative(-0.527f, 0.524f, -1.27f, 0.784f, -2.255f, 0.784f)
                lineTo(5.073f, 21.686f)
                curveToRelative(-0.986f, 0.0f, -1.72f, -0.258f, -2.255f, -0.784f)
                curveToRelative(-0.535f, -0.527f, -0.793f, -1.266f, -0.793f, -2.266f)
                lineTo(2.025f, 8.989f)
                curveToRelative(0.0f, -0.975f, 0.258f, -1.706f, 0.785f, -2.241f)
                curveToRelative(0.54f, -0.54f, 1.277f, -0.807f, 2.263f, -0.807f)
                horizontalLineToRelative(2.454f)
                curveTo(8.549f, 3.375f, 10.885f, 2.0f, 14.325f, 2.0f)
                close()
                moveTo(16.171f, 12.081f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.885f, 0.0f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, 0.0f, -0.885f)
                lineToRelative(-1.9f, -1.894f)
                lineTo(15.156f, 6.748f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, -1.255f, 0.0f)
                verticalLineToRelative(2.815f)
                curveToRelative(0.0f, 0.165f, 0.068f, 0.325f, 0.186f, 0.443f)
                lineToRelative(2.084f, 2.075f)
                close()
                moveTo(7.496f, 17.701f)
                curveToRelative(0.512f, 0.0f, 0.818f, 0.305f, 0.818f, 0.82f)
                curveToRelative(0.0f, 0.252f, -0.07f, 0.45f, -0.213f, 0.597f)
                curveToRelative(-0.143f, 0.145f, -0.353f, 0.224f, -0.605f, 0.224f)
                reflectiveCurveToRelative(-0.462f, -0.079f, -0.605f, -0.224f)
                curveToRelative(-0.143f, -0.146f, -0.213f, -0.345f, -0.213f, -0.597f)
                curveToRelative(0.0f, -0.515f, 0.305f, -0.82f, 0.818f, -0.82f)
                close()
            }
        }
        .build()
        return _disconnectFilled!!
    }

private var _disconnectFilled: ImageVector? = null
