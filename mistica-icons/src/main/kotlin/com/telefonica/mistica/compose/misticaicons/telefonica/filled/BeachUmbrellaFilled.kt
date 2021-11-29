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

public val FilledGroup.BeachUmbrellaFilled: ImageVector
    get() {
        if (_beachUmbrellaFilled != null) {
            return _beachUmbrellaFilled!!
        }
        _beachUmbrellaFilled = Builder(name = "BeachUmbrellaFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.324f, 14.163f)
                curveToRelative(-1.837f, -4.53f, -0.356f, -7.893f, 0.583f, -9.378f)
                lineToRelative(4.0f, 6.672f)
                lineToRelative(-4.583f, 2.706f)
                close()
                moveTo(5.828f, 5.752f)
                curveToRelative(-0.851f, 2.075f, -1.386f, 5.246f, 0.27f, 9.134f)
                lineToRelative(-2.11f, 1.246f)
                curveToRelative(-0.09f, 0.054f, -0.14f, 0.101f, -0.356f, 0.043f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.252f, -0.216f)
                curveToRelative(-0.82f, -1.941f, -1.033f, -3.784f, -0.636f, -5.476f)
                curveToRelative(0.401f, -1.743f, 1.443f, -3.325f, 3.084f, -4.731f)
                close()
                moveTo(18.291f, 7.684f)
                lineTo(13.123f, 10.738f)
                lineTo(9.063f, 3.97f)
                curveToRelative(1.648f, -0.221f, 5.463f, -0.18f, 9.228f, 3.714f)
                close()
                moveTo(21.313f, 5.382f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, 0.1f, 0.291f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, -0.195f, 0.283f)
                lineTo(19.52f, 6.959f)
                curveToRelative(-2.86f, -3.05f, -5.776f, -4.093f, -7.994f, -4.356f)
                curveToRelative(1.731f, -0.515f, 3.386f, -0.594f, 4.941f, -0.221f)
                curveToRelative(1.762f, 0.423f, 3.392f, 1.431f, 4.846f, 3.0f)
                close()
                moveTo(7.798f, 4.642f)
                lineTo(7.425f, 4.02f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, true, 0.266f, -0.93f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, true, 0.975f, 0.255f)
                lineToRelative(0.35f, 0.586f)
                lineToRelative(-1.218f, 0.711f)
                close()
                moveTo(13.128f, 10.762f)
                lineTo(19.153f, 20.816f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, true, -0.266f, 0.93f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.353f, 0.09f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.619f, -0.342f)
                lineTo(11.91f, 11.477f)
                lineToRelative(1.218f, -0.714f)
                close()
            }
        }
        .build()
        return _beachUmbrellaFilled!!
    }

private var _beachUmbrellaFilled: ImageVector? = null
